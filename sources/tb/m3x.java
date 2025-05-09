package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m3x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile lpd f23760a;

    static {
        t2o.a(980418600);
    }

    public static lpd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpd) ipChange.ipc$dispatch("fce9c5c1", new Object[0]);
        }
        if (f23760a != null) {
            return f23760a;
        }
        synchronized (lpd.class) {
            try {
                if (f23760a != null) {
                    return f23760a;
                }
                f23760a = (lpd) b(n3x.f24492a, lpd.class, "WeexAbilityConfig.shareAdapter");
                return f23760a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <T> T b(Class<? extends T> cls, Class<T> cls2, String str) {
        if (cls == null) {
            dwh.f("WeexAdapter", "makeAdapter clz is null: " + str);
            return null;
        } else if (cls == cls2) {
            return null;
        } else {
            try {
                return (T) cls.newInstance();
            } catch (Throwable th) {
                String str2 = "Weex adapter create can't fail: " + str;
                dwh.h(str2, th);
                f9x.b(false, str2);
                return null;
            }
        }
    }
}
