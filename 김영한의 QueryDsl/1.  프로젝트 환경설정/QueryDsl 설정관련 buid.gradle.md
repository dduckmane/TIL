[설정 build.gradle]

buildscript {
   ext {
      queryDslVersion = "5.0.0"
   }
}

plugins {
   id 'org.springframework.boot' version '2.6.0'
   id 'io.spring.dependency-management' version '1.0.11.RELEASE'
   //querydsl 추가
   id "com.ewerk.gradle.plugins.querydsl" version "1.0.10"
   id 'java'
}

group = 'study'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

configurations {
   compileOnly {
      extendsFrom annotationProcessor
   }
}

repositories {
   mavenCentral()
}

dependencies {
   implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
   implementation 'org.springframework.boot:spring-boot-starter-web'
   compileOnly 'org.projectlombok:lombok'
   runtimeOnly 'com.h2database:h2'
   //querydsl 추가
   implementation "com.querydsl:querydsl-jpa:${queryDslVersion}"
   implementation "com.querydsl:querydsl-apt:${queryDslVersion}"


   annotationProcessor 'org.projectlombok:lombok'
   testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

test {
   useJUnitPlatform()
}

//querydsl 추가 시작
def querydslDir = "$buildDir/generated/querydsl"

querydsl {
   jpa = true
   querydslSourcesDir = querydslDir
}
sourceSets {
   main.java.srcDir querydslDir
}
compileQuerydsl{
   options.annotationProcessorPath = configurations.querydsl
}
configurations {
   compileOnly {
      extendsFrom annotationProcessor
   }
   querydsl.extendsFrom compileClasspath
}
//querydsl 추가 끝
