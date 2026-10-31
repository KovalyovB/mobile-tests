package wiki.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config/${env}.properties",
        "system:properties",
        "system:env"
})
public interface ProjectConfig extends Config {
    @Key("appiumUrl")
    @DefaultValue("http://127.0.0.1:4723/")
    String appiumUrl();

    @Key("browserstack.hubUrl")
    String browserstackHubUrl();

    @Key("deviceName")
    String deviceName();

    @Key("platformVersion")
    String platformVersion();

    @Key("udid")
    String udid();

    @Key("browserstack.user")
    String browserstackUser();

    @Key("browserstack.key")
    String browserstackKey();

    @Key("android.app")
    String androidApp();

    @Key("android.deviceName")
    String androidDeviceName();

    @Key("android.osVersion")
    String androidOsVersion();

    @Key("localAppName")
    @DefaultValue("app-alpha-universal-release.apk")
    String localAppName();

    @Key("localAppBaseUrl")
    @DefaultValue("https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/")
    String localAppBaseUrl();
}