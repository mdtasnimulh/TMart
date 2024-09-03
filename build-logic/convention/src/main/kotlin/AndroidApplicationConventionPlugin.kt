import com.android.build.api.dsl.ApplicationExtension
import com.tmart.AppConfig
import com.tmart.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
                apply("tmart.android.lint")
            }

            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                defaultConfig.targetSdk = AppConfig.TARGET_SDK_VERSION
                @Suppress("UnstableApiUsage")
                testOptions.animationsDisabled = true
            }
        }
    }

}