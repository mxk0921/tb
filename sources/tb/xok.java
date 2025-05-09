package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import tb.ll9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xok implements w24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ll9.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(xok xokVar) {
        }

        @Override // tb.ll9.a
        public void a(Class<?> cls) {
            try {
                Constructor<?> constructor = cls.getConstructor(new Class[0]);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(new Object[0]);
                Method declaredMethod = cls.getDeclaredMethod("init", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(newInstance, new Object[0]);
                xhh.a("OlympicOrangeCommand succ", new Object[0]);
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
                xhh.a("OlympicOrangeCommand failed", new Object[0]);
            }
        }
    }

    @Override // tb.w24
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8140e3", new Object[]{this, application});
        } else {
            ll9.a(application, "applicationmonitor_olympic", "com.taobao.monitor.olympic.OlympicOrangeLauncher", new a(this));
        }
    }
}
