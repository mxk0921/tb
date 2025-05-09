package anet.channel.strategy.dispatch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IAmdcSign {
    String aesDecryptStr(String str);

    String aesEncryptStr(String str);

    String getAppkey();

    String sign(String str);

    boolean useSecurityGuard();
}
