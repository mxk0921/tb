package io.unicorn.plugin.network;

import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.plugin.network.ExternalAdapterNetworkProvider;
import java.util.HashMap;
import tb.gpc;
import tb.t2o;
import tb.uvh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ExternalAdapterNetwork {
    private static volatile ExternalAdapterNetwork INSTANCE;
    private ExternalAdapterNetworkProvider mProvider = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements ExternalAdapterNetworkProvider.RequestListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f15201a;

        public a(int i) {
            this.f15201a = i;
        }

        @Override // io.unicorn.plugin.network.ExternalAdapterNetworkProvider.RequestListener
        public void onRequestFinish(int i, byte[] bArr) {
            ExternalAdapterNetwork.finish(this.f15201a, i, bArr);
        }
    }

    static {
        t2o.a(945815792);
    }

    public static void finish(int i, int i2, byte[] bArr) {
        if (bArr != null) {
            notifyExternalNetworkFinish(i, i2, bArr, bArr.length);
        } else {
            notifyExternalNetworkFinish(i, i2, null, 0);
        }
    }

    public static ExternalAdapterNetwork instance() {
        if (INSTANCE == null) {
            synchronized (ExternalAdapterNetwork.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new ExternalAdapterNetwork();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return INSTANCE;
    }

    private static native void notifyExternalNetworkFinish(int i, int i2, byte[] bArr, int i3);

    public static boolean request(int i, String str, String str2, String str3, int i2, HashMap<String, String> hashMap) {
        ExternalAdapterNetwork instance = instance();
        if (instance == null || instance.getProvider() == null) {
            return false;
        }
        ExternalAdapterNetworkProvider.Request request = new ExternalAdapterNetworkProvider.Request();
        request.url = str;
        request.method = str2;
        request.body = str3;
        request.timeout = i2;
        if (hashMap != null) {
            request.params = hashMap;
        }
        instance.getProvider().sendRequest(request, new a(i));
        return true;
    }

    public ExternalAdapterNetworkProvider getProvider() {
        return this.mProvider;
    }

    public void installDefaultProvider() {
        ExternalAdapterNetworkProvider externalAdapterNetworkProvider;
        if (this.mProvider == null) {
            gpc d = uvh.f().d();
            if (d != null) {
                externalAdapterNetworkProvider = new b(d);
            } else {
                externalAdapterNetworkProvider = new io.unicorn.plugin.network.a();
            }
            installProvider(externalAdapterNetworkProvider);
        }
    }

    public void installProvider(ExternalAdapterNetworkProvider externalAdapterNetworkProvider) {
        if (externalAdapterNetworkProvider != null) {
            this.mProvider = externalAdapterNetworkProvider;
            FlutterJNI.nativeInstallFlutterExternalAdapterNetworkProvider();
        }
    }
}
