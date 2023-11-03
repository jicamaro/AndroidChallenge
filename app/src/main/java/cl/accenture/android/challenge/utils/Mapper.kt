package cl.accenture.android.challenge.utils

interface Mapper<T, V> {

    fun map(value: T): V

    fun inverseMap(value: V): T
}