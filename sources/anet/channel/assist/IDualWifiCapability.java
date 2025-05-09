package anet.channel.assist;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IDualWifiCapability extends ICapability {
    boolean checkStatus();

    void release();

    void request();
}
