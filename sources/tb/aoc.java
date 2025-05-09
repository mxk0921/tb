package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface aoc {
    int getLogLevel();

    boolean isValid();

    void logd(String str, String str2);

    void loge(String str, String str2);

    void loge(String str, String str2, Throwable th);

    void logi(String str, String str2);

    void logw(String str, String str2);

    void logw(String str, String str2, Throwable th);
}
