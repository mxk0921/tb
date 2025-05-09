package tb;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.g;
import com.taobao.android.virtual_thread.VirtualThread;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.xgg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xgg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31380a = false;
    public static Application b;
    public static HashMap<String, Object> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements jyn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f31381a;
        public final /* synthetic */ HashMap b;

        public a(Application application, HashMap hashMap) {
            this.f31381a = application;
            this.b = hashMap;
        }

        public static /* synthetic */ void c(Application application, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("675ae6fa", new Object[]{application, hashMap});
            } else {
                xgg.a(application, hashMap);
            }
        }

        @Override // tb.jyn
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c89a583d", new Object[]{this});
                return;
            }
            final Application application = this.f31381a;
            final HashMap hashMap = this.b;
            new VirtualThread(new Runnable() { // from class: tb.wgg
                @Override // java.lang.Runnable
                public final void run() {
                    xgg.a.c(application, hashMap);
                }
            }).ofVirtual().start();
        }
    }

    static {
        t2o.a(976224259);
    }

    public static /* synthetic */ void a(Application application, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5789e96b", new Object[]{application, hashMap});
        } else {
            f(application, hashMap);
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb429e55", new Object[0])).booleanValue();
        }
        return f31380a;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            f(b, c);
        }
    }

    public static void d(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        g.m().put(ok5.DX_PARSER_GETA11YTEXTFROMRICHTEXT, new ok5());
        if (izn.d()) {
            f(application, hashMap);
            return;
        }
        g(application, hashMap);
        e(application, hashMap);
    }

    public static void e(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d55d01", new Object[]{application, hashMap});
        } else {
            izn.c(new a(application, hashMap));
        }
    }

    public static void g(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372e404a", new Object[]{application, hashMap});
            return;
        }
        b = application;
        c = hashMap;
    }

    public static void f(Application application, HashMap<String, Object> hashMap) {
        try {
            Class<?> cls = Class.forName("com.taobao.android.voiceassistant.context.AssistantContext");
            Method declaredMethod = cls.getDeclaredMethod("get", new Class[0]);
            declaredMethod.setAccessible(true);
            cls.getDeclaredMethod("init", Context.class, Map.class).invoke(declaredMethod.invoke(null, new Object[0]), application, hashMap);
            f31380a = true;
        } catch (Exception e) {
            Log.e("Launcher", "realInit exception " + e);
            e.printStackTrace();
        }
    }
}
