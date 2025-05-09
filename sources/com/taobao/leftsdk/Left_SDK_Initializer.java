package com.taobao.leftsdk;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.b02;
import tb.p5c;
import tb.v8f;
import tb.vcq;
import tb.xcq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Left_SDK_Initializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String Left_SDK_KEY = "init_key";
    private static final String Left_SDK_TAG = "LeftSDKInitializerInternal";
    private volatile boolean inited = false;
    private Handler mHandler;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements b02.b<p5c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f10889a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.leftsdk.Left_SDK_Initializer$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC0574a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ p5c f10890a;
            public final /* synthetic */ Bundle b;

            public RunnableC0574a(p5c p5cVar, Bundle bundle) {
                this.f10890a = p5cVar;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                this.f10890a.init(a.this.f10889a, this.b);
                Log.e("Left_SDK_Initializer", "Left_SDK_Initializer init success");
                if (Left_SDK_Initializer.access$000(Left_SDK_Initializer.this).getLooper() != Looper.getMainLooper()) {
                    Left_SDK_Initializer.access$000(Left_SDK_Initializer.this).getLooper().quitSafely();
                    Left_SDK_Initializer.access$002(Left_SDK_Initializer.this, null);
                }
            }
        }

        public a(Application application) {
            this.f10889a = application;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            } else {
                Log.e("Left_SDK_Initializer", "Left_SDK_Initializer init failed");
            }
        }

        /* renamed from: c */
        public void b(p5c p5cVar, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dff0ef1", new Object[]{this, p5cVar, bundle});
            } else if (bundle.containsKey(Left_SDK_Initializer.Left_SDK_KEY) && bundle.getString(Left_SDK_Initializer.Left_SDK_KEY).equals(Left_SDK_Initializer.Left_SDK_TAG) && Left_SDK_Initializer.access$000(Left_SDK_Initializer.this) != null && !Left_SDK_Initializer.access$100(Left_SDK_Initializer.this)) {
                Left_SDK_Initializer.access$000(Left_SDK_Initializer.this).post(new RunnableC0574a(p5cVar, bundle));
                Left_SDK_Initializer.access$102(Left_SDK_Initializer.this, true);
            }
        }
    }

    public static /* synthetic */ Handler access$000(Left_SDK_Initializer left_SDK_Initializer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("fab5d0", new Object[]{left_SDK_Initializer});
        }
        return left_SDK_Initializer.mHandler;
    }

    public static /* synthetic */ Handler access$002(Left_SDK_Initializer left_SDK_Initializer, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a4d0aa2", new Object[]{left_SDK_Initializer, handler});
        }
        left_SDK_Initializer.mHandler = handler;
        return handler;
    }

    public static /* synthetic */ boolean access$100(Left_SDK_Initializer left_SDK_Initializer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b333319", new Object[]{left_SDK_Initializer})).booleanValue();
        }
        return left_SDK_Initializer.inited;
    }

    public static /* synthetic */ boolean access$102(Left_SDK_Initializer left_SDK_Initializer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16282ee5", new Object[]{left_SDK_Initializer, new Boolean(z)})).booleanValue();
        }
        left_SDK_Initializer.inited = z;
        return z;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
            HandlerThread handlerThread = new HandlerThread(Left_SDK_TAG);
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper());
        } else {
            this.mHandler = new Handler();
        }
        Bundle bundle = new Bundle();
        if (hashMap != null) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                bundle.putSerializable(entry.getKey(), (Serializable) entry.getValue());
            }
        }
        bundle.putString(Left_SDK_KEY, Left_SDK_TAG);
        vcq.a(application).c(xcq.c().k(v8f.h(application, "com.taobao.leftsdk.LeftSDKInitializerInternal").f(new a(application)).d(bundle).a()).n());
    }
}
