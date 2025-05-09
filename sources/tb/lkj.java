package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface lkj {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onDownloadAllFinish(boolean z);

        void onDownloadError(String str, int i, String str2);

        void onDownloadFinish(String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onInstallFailed(String str, String str2);

        void onInstallSuccess(String str, String str2);
    }

    a getDownloadListener();

    b getInstallListener();
}
