package mezlogo

plugins {
    id("mezlogo.common-build")
    id("org.graalvm.buildtools.native")
}

//nativeBuild {
//    imageName = 'application' // The name of the native image, defaults to the project name
//    mainClass = 'org.test.Main' // The main class to use, defaults to the application.mainClass
//    debug = true // Determines if debug info should be generated, defaults to false
//    verbose = true // Add verbose output, defaults to false
//    fallback = true // Sets the fallback mode of native-image, defaults to false
//    sharedLibrary = false // Determines if image is a shared library, defaults to false if `java-library` plugin isn't included
//
//    systemProperties = [name1: 'value1', name2: 'value2'] // Sets the system properties to use for the native image builder
//    configurationFileDirectories.from(file('src/my-config')) // Adds a native image configuration file directory, containing files like reflection configuration
//
//    // Advanced options
//    buildArgs.add('-H:Extra') // Passes '-H:Extra' to the native image builder options. This can be used to pass parameters which are not directly supported by this extension
//    jvmArgs.add('flag') // Passes 'flag' directly to the JVM running the native image builder
//
//    // Runtime options
//    runtimeArgs.add('--help') // Passes '--help' to built image, during "nativeRun" task
//
//    // Development options
//    agent = true // Enables the reflection agent. Can be also set on command line using '-Pagent'
//
//    useFatJar = false // Instead of passing each jar individually, builds a fat jar
//}