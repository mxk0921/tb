package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import tb.ll9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wok implements w24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Object> f30824a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ll9.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f30825a;

        public a(Application application) {
            this.f30825a = application;
        }

        @Override // tb.ll9.a
        public void a(Class<?> cls) {
            try {
                Constructor<?> constructor = cls.getConstructor(Application.class, Map.class);
                constructor.setAccessible(true);
                ((Runnable) constructor.newInstance(this.f30825a, wok.b(wok.this))).run();
                xhh.a("OlympicCommand succ", new Object[0]);
            } catch (Throwable th) {
                xhh.c(th);
            }
        }

        @Override // tb.ll9.a
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            } else {
                xhh.a("OlympicCommand failed", new Object[0]);
            }
        }
    }

    public wok(HashMap<String, Object> hashMap) {
        this.f30824a = hashMap;
    }

    public static /* synthetic */ HashMap b(wok wokVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3bb825a7", new Object[]{wokVar});
        }
        return wokVar.f30824a;
    }

    @Override // tb.w24
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8140e3", new Object[]{this, application});
        } else {
            ll9.a(application, "applicationmonitor_olympic", "com.taobao.monitor.olympic.OlympicLauncher", new a(application));
        }
    }
}
