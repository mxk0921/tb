package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ub4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120500);
    }

    public static la4 a(String str, tv0 tv0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (la4) ipChange.ipc$dispatch("917a373", new Object[]{str, tv0Var});
        }
        return b(str, tv0Var, null);
    }

    public static la4 b(String str, tv0 tv0Var, vob vobVar) {
        Constructor<? extends la4> constructor;
        Object newInstance;
        Class<? extends la4> a2 = uc4.a(str);
        if (a2 == null) {
            return null;
        }
        try {
            if (vobVar == null) {
                constructor = a2.getConstructor(tv0.class);
            } else {
                constructor = a2.getConstructor(tv0.class, vob.class);
            }
            if (vobVar == null) {
                newInstance = constructor.newInstance(tv0Var);
            } else {
                newInstance = constructor.newInstance(tv0Var, vobVar);
            }
            return (la4) newInstance;
        } catch (Throwable unused) {
            return null;
        }
    }
}
