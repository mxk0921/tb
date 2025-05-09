package com.uc.webview.export.extension;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IUrlDownloader {
    void delete();

    boolean start(String str, String str2, Client client);

    void stop();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Client {
        public boolean onStart() {
            return true;
        }

        public void onProgressChanged(int i) {
        }

        public void onFailed(String str, Throwable th) {
        }

        public void onSuccess(String str, long j, long j2) {
        }
    }
}
