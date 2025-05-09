package anetwork.channel.config;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IRemoteConfig {
    String getConfig(String... strArr);

    void onConfigUpdate(String str);

    void register();

    void unRegister();
}
