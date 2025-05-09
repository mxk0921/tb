package me.ele.bridge;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.b02;
import tb.vcq;
import tb.xcq;
import tb.xdp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class BundleRemoteInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BUNDLE_REMOTE_INITIALIZER = "BundleRemoteInitializer";
    private static final String INIT_KEY = "init_key";
    public static final String PIZZA = "pizza_sdk";
    private static Handler mHandler;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f15400a;
        public final /* synthetic */ Page b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ JSONObject e;
        public final /* synthetic */ JSONObject f;
        public final /* synthetic */ JSONObject g;
        public final /* synthetic */ int h;
        public final /* synthetic */ JSONObject i;
        public final /* synthetic */ JSONObject j;
        public final /* synthetic */ String k;
        public final /* synthetic */ BridgeCallback l;

        /* compiled from: Taobao */
        /* renamed from: me.ele.bridge.BundleRemoteInitializer$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class RunnableC0864a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object f15401a;

            public RunnableC0864a(Object obj) {
                this.f15401a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                PizzaApi pizzaApi = (PizzaApi) this.f15401a;
                a aVar = a.this;
                Application application = aVar.f15400a;
                String appId = aVar.b.getApp().getAppId();
                a aVar2 = a.this;
                pizzaApi.sendPizza(application, appId, aVar2.c, aVar2.d, aVar2.e, aVar2.f, aVar2.g, aVar2.h, aVar2.i, aVar2.j, aVar2.k, aVar2.l);
                Log.e(BundleRemoteInitializer.PIZZA, "BUNDLE_REMOTE_INITIALIZER init success");
                if (BundleRemoteInitializer.access$000().getLooper() != Looper.getMainLooper()) {
                    BundleRemoteInitializer.access$000().getLooper().quitSafely();
                    BundleRemoteInitializer.access$002(null);
                }
            }
        }

        public a(Application application, Page page, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, JSONObject jSONObject4, JSONObject jSONObject5, String str3, BridgeCallback bridgeCallback) {
            this.f15400a = application;
            this.b = page;
            this.c = str;
            this.d = str2;
            this.e = jSONObject;
            this.f = jSONObject2;
            this.g = jSONObject3;
            this.h = i;
            this.i = jSONObject4;
            this.j = jSONObject5;
            this.k = str3;
            this.l = bridgeCallback;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            } else {
                Log.e(BundleRemoteInitializer.PIZZA, "BUNDLE_REMOTE_INITIALIZER init failed");
            }
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
                return;
            }
            String string = bundle.getString(BundleRemoteInitializer.INIT_KEY);
            if (bundle.containsKey(BundleRemoteInitializer.INIT_KEY) && string != null && string.equals(BundleRemoteInitializer.BUNDLE_REMOTE_INITIALIZER) && (obj instanceof PizzaApi) && BundleRemoteInitializer.access$000() != null) {
                BundleRemoteInitializer.access$000().post(new RunnableC0864a(obj));
            }
        }
    }

    public static /* synthetic */ Handler access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1554edef", new Object[0]);
        }
        return mHandler;
    }

    public static /* synthetic */ Handler access$002(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7fe0f4fd", new Object[]{handler});
        }
        mHandler = handler;
        return handler;
    }

    public static void sendPizza(Application application, Page page, ApiContext apiContext, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, JSONObject jSONObject4, JSONObject jSONObject5, String str3, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f50560", new Object[]{application, page, apiContext, str, str2, jSONObject, jSONObject2, jSONObject3, new Integer(i), jSONObject4, jSONObject5, str3, bridgeCallback});
            return;
        }
        if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
            HandlerThread handlerThread = new HandlerThread(BUNDLE_REMOTE_INITIALIZER);
            handlerThread.start();
            mHandler = new Handler(handlerThread.getLooper());
        } else {
            mHandler = new Handler();
        }
        Bundle bundle = new Bundle();
        bundle.putString(INIT_KEY, BUNDLE_REMOTE_INITIALIZER);
        vcq.a(application).c(xcq.c().m(xdp.l(application, PizzaApi.class).f(new a(application, page, str, str2, jSONObject, jSONObject2, jSONObject3, i, jSONObject4, jSONObject5, str3, bridgeCallback)).d(bundle).a()).n());
    }
}
