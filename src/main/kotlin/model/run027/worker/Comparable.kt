package model.run027.worker

interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}