package ru.dumdumbich.tools.logger.di

import org.koin.dsl.module
import ru.dumdumbich.tools.logger.Logger
import ru.dumdumbich.tools.logger.LoggerImpl

val loggerModule = module {
    factory<Logger> {
        params -> LoggerImpl(
            target = params.get<Any>(),
            isDebug = params.get<Boolean>()
        )
    }
}
