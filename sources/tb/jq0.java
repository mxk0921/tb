package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jq0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AliLogInterface f22154a;

    public static <T> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2a1cee6", new Object[]{cls});
        }
        T t = (T) f22154a;
        if (t != null) {
            return t;
        }
        T t2 = (T) b(cls);
        if (t2 != null) {
            f22154a = (AliLogInterface) t2;
        }
        return t2;
    }

    public static <T> T b(Class<T> cls) {
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

    public static AliLogInterface c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliLogInterface) ipChange.ipc$dispatch("84990237", new Object[0]);
        }
        Object a2 = a(AliLogInterface.class);
        if (a2 instanceof AliLogInterface) {
            return (AliLogInterface) a2;
        }
        return null;
    }
}
