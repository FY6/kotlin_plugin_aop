package aop.kotlin.plugin

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class DebugTimeTrace(val value: String)