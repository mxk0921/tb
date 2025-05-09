package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q7k implements eun {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(411041799);
        t2o.a(411041801);
    }

    @Override // tb.eun
    public Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("32d310c7", new Object[]{this, cls, str, clsArr});
        }
        return cls.getDeclaredMethod(str, clsArr);
    }

    @Override // tb.eun
    public Field b(Class<?> cls, String str) throws NoSuchFieldException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("de131673", new Object[]{this, cls, str});
        }
        return cls.getDeclaredField(str);
    }

    @Override // tb.eun
    public Field[] c(Class<?> cls) throws SecurityException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field[]) ipChange.ipc$dispatch("aef2d0e1", new Object[]{this, cls});
        }
        return cls.getDeclaredFields();
    }
}
