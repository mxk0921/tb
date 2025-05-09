package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gun {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final eun f20245a;

    static {
        eun eunVar;
        t2o.a(411041802);
        if (Build.VERSION.SDK_INT < 28) {
            eunVar = new q7k();
        } else {
            eunVar = new os3();
        }
        f20245a = eunVar;
    }

    public static Field a(Class<?> cls, String str) throws NoSuchFieldException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("de131673", new Object[]{cls, str});
        }
        return f20245a.b(cls, str);
    }

    public static Field[] b(Class<?> cls) throws SecurityException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field[]) ipChange.ipc$dispatch("aef2d0e1", new Object[]{cls});
        }
        return f20245a.c(cls);
    }

    public static Method c(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("32d310c7", new Object[]{cls, str, clsArr});
        }
        return f20245a.a(cls, str, clsArr);
    }
}
