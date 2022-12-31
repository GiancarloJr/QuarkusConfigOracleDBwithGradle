plugins {
    id("java")
    id("jacoco")
    id("maven-publish")
    alias(libs.plugins.quarkus)
    alias(libs.plugins.lombokPlugin)
    alias(libs.plugins.veracode)
    alias(libs.plugins.hibernateMavenRepoAuth)
}

apply(plugin = "io.quarkus")
apply(plugin = "io.freefair.lombok")
apply(plugin = "com.srcclr.gradle")
apply(plugin = "org.hibernate.build.maven-repo-auth")

group = "b"
version = "0.1.0-SNAPSHOT"

dependencies {
    implementation(enforcedPlatform(libs.payParent))

    //ORACLE DEPENDENCIES
    implementation("io.quarkus:quarkus-hibernate-orm")
    implementation ("com.oracle.database.jdbc:ojdbc8:19.6.0.0")
    implementation("io.quarkus:quarkus-hibernate-orm-panache")
    //ORACLE DEPENCENCIAS

    implementation("io.quarkus:quarkus-smallrye-jwt")
    implementation("io.quarkus:quarkus-smallrye-jwt-build")
    implementation("io.quarkus:quarkus-arc")
    implementation("io.quarkus:quarkus-config-yaml")
    implementation("io.quarkus:quarkus-resteasy-reactive")
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson")
    implementation("io.quarkus:quarkus-smallrye-openapi")
    implementation("io.quarkus:quarkus-smallrye-health")
    implementation("io.quarkus:quarkus-hibernate-validator")
    implementation("io.quarkiverse.config:quarkus-config-consul")
    implementation("io.quarkus:quarkus-smallrye-context-propagation")
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
    testCompileOnly(libs.lombok)
    testAnnotationProcessor(libs.lombok)
    implementation("org.mapstruct:mapstruct")
    annotationProcessor(libs.mapstruct.processor)
    implementation("software.amazon.awssdk:netty-nio-client")
    testImplementation("org.mockito:mockito-junit-jupiter")
    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.quarkus:quarkus-junit5-mockito")
    testImplementation("io.quarkus:quarkus-jacoco")
    testImplementation("io.rest-assured:rest-assured")
    testImplementation("software.amazon.awssdk:url-connection-client")
    testImplementation("com.amazonaws:aws-java-sdk-core")
    testImplementation("org.testcontainers:testcontainers")
    testImplementation("org.testcontainers:localstack")

}

