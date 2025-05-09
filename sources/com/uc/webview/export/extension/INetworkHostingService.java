package com.uc.webview.export.extension;

import com.uc.webview.base.IExtender;
import com.uc.webview.export.WebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class INetworkHostingService implements IExtender {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Instance {
        private static volatile INetworkHostingService sInstance;

        public static INetworkHostingService get() {
            return sInstance;
        }

        public static void set(INetworkHostingService iNetworkHostingService) {
            sInstance = iNetworkHostingService;
            Sdk2CoreHost.impl().setNetworkHostingService(iNetworkHostingService);
        }
    }

    public int RequestPreconnection(int i, String str) {
        return -1;
    }

    @Deprecated
    public ITransaction createTransaction(int i, String str, WebView webView) {
        return null;
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public int type() {
        return 0;
    }

    public String version() {
        return null;
    }

    public ITransaction createTransaction(WebView webView, int i, String str) {
        return createTransaction(i, str, webView);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class IDelegate implements IExtender {
        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            return null;
        }

        public void onFinished() {
        }

        public void onDataReceived(byte[] bArr, int i) {
        }

        public void onError(int i, String str) {
        }

        public void onResponseReceived(String str, String[] strArr, String[] strArr2) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ITransaction implements IExtender {
        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            return null;
        }

        public void cancel() {
        }

        public void start() {
        }

        public void setDelegate(IDelegate iDelegate) {
        }

        public void setMethod(String str) {
        }

        public void setRequestFlags(int i) {
        }

        public void setUploadStream(IUploadStream iUploadStream) {
        }

        public void setExtraInfo(String str, String str2) {
        }

        public void setHeader(String str, String str2) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class IUploadStream implements IExtender {
        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            return null;
        }

        public int read(byte[] bArr) {
            return 0;
        }

        public int readAsync(byte[] bArr) {
            return -1;
        }

        public void destroy() {
        }

        public void rewind() {
        }

        public void rewindAsync() {
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class IClient implements IExtender {
            @Override // com.uc.webview.base.IExtender
            public Object invoke(int i, Object[] objArr) {
                return null;
            }

            public void OnDestroyed(IUploadStream iUploadStream) {
            }

            public void OnReadCompleted(IUploadStream iUploadStream, int i) {
            }

            public void OnRewindCompleted(IUploadStream iUploadStream, int i) {
            }
        }

        public void setStreamClient(IClient iClient) {
        }
    }
}
