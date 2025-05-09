package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface tu7 {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    void onDownloadError(String str, int i, String str2);

    void onDownloadFinish(String str, String str2);

    void onDownloadProgress(int i);

    void onDownloadStateChange(String str, boolean z);

    void onFinish(boolean z);

    void onNetworkLimit(int i, upl uplVar, a aVar);
}
