package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yo0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AliConfigInterface f32225a;

    public static <T> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2a1cee6", new Object[]{cls});
        }
        T t = (T) f32225a;
        if (t != null) {
            return t;
        }
        T t2 = (T) c(cls);
        if (t2 != null) {
            f32225a = (AliConfigInterface) t2;
        }
        return t2;
    }

    public static AliConfigInterface b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliConfigInterface) ipChange.ipc$dispatch("b600e6c9", new Object[0]);
        }
        Object a2 = a(AliConfigInterface.class);
        if (a2 instanceof AliConfigInterface) {
            return (AliConfigInterface) a2;
        }
        return null;
    }

    public static <T> T c(Class<T> cls) {
        String str;
        String name = cls.getName();
        if (name.endsWith("Interface")) {
            str = name.replace("Interface", "Imp");
        } else {
            str = name.concat("Imp");
        }
        try {
            Class<?> cls2 = Class.forName(str);
            try {
                Method declaredMethod = cls2.getDeclaredMethod("getInstance", new Class[0]);
                if (declaredMethod != null) {
                    return (T) declaredMethod.invoke(null, new Object[0]);
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    return (T) cls2.newInstance();
                } catch (Exception unused) {
                    e.printStackTrace();
                    return null;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
