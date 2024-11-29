package org.example

/**
 * What are Kotlin Interfaces Used For and Why?
 *
 * Bir restoran düşünelim, Garson size menüyü getiriyor. Menünüz, sizin interface'nizdir.
 *
 * Interface, yapabileceklerinizin kontratıdır.
 */

interface FileSystem {
    fun readDir(): List<String>
    fun readFile(): String

}

class Fat32FileSystem() : FileSystem {
    override fun readDir(): List<String> {
        return emptyList()
    }

    override fun readFile(): String {
        return ""
    }
}

class ExtFileSystem : FileSystem {
    override fun readDir(): List<String> {
        TODO("Not yet implemented")
    }

    override fun readFile(): String {
        TODO("Not yet implemented")
    }
}

class MemoryFileSystem(val files: List<String>, val fileContents: String) : FileSystem {
    override fun readDir(): List<String> {
        return files
    }

    override fun readFile(): String {
        return fileContents
    }
}


fun main() {
    // DI (dependency injection) get it from constructor
    val fileSystem: FileSystem = Fat32FileSystem()
    fileSystem.readDir()

}

fun getFileSystem(): FileSystem {

    return Fat32FileSystem()
    return MemoryFileSystem(listOf("file/path"),"file-contents")
}