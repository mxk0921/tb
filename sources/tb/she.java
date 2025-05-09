package tb;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class she {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements jyn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jyn
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c89a583d", new Object[]{this});
            } else {
                she.a();
            }
        }
    }

    static {
        t2o.a(976224257);
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            d();
        }
    }

    public static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (izn.d()) {
            d();
        } else {
            c();
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be39840d", new Object[0]);
        } else {
            izn.c(new a());
        }
    }

    public static void d() {
        try {
            Method declaredMethod = Class.forName("com.taobao.android.voiceassistant.pop.AssistantState").getDeclaredMethod("isElderHome", new Class[0]);
            declaredMethod.setAccessible(true);
            if (((Boolean) declaredMethod.invoke(null, new Object[0])).booleanValue()) {
                Class<?> cls = Class.forName("com.taobao.android.voiceassistant.context.AssistantContext");
                Method declaredMethod2 = cls.getDeclaredMethod("get", new Class[0]);
                declaredMethod2.setAccessible(true);
                cls.getDeclaredMethod("fetchConfiguration", new Class[0]).invoke(declaredMethod2.invoke(null, new Object[0]), new Object[0]);
            }
        } catch (Exception e) {
            Log.e("IdleLauncher", "IdleLauncher exception " + e);
            e.printStackTrace();
        }
    }
}
