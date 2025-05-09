package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u5b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PrivateTagKey = -9001;

    static {
        t2o.a(455082015);
    }

    public static t5b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5b) ipChange.ipc$dispatch("6a974abb", new Object[0]);
        }
        t5b t5bVar = new t5b();
        try {
            Field declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                t5bVar.f28497a = true;
                t5bVar.c = declaredField;
                t5bVar.d = "";
            }
        } catch (Exception e) {
            t5bVar.c = null;
            t5bVar.d = e.getMessage();
        }
        return t5bVar;
    }

    public static t5b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5b) ipChange.ipc$dispatch("39b1b009", new Object[0]);
        }
        t5b t5bVar = new t5b();
        try {
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getListenerInfo", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                t5bVar.f28497a = true;
                t5bVar.b = declaredMethod;
                t5bVar.d = "";
            }
        } catch (Exception e) {
            t5bVar.b = null;
            t5bVar.d = e.getMessage();
        }
        return t5bVar;
    }
}
