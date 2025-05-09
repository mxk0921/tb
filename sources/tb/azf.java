package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class azf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f16088a = true;

    static {
        t2o.a(500170819);
    }

    public static String a(Object obj, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ded68364", new Object[]{obj, str, objArr});
        }
        StringBuilder sb = new StringBuilder("[" + e(obj) + "]");
        sb.append(" -> ");
        sb.append(str);
        if (objArr != null) {
            for (Object obj2 : objArr) {
                sb.append(" -> ");
                sb.append(e(obj2));
            }
        }
        return sb.toString();
    }

    public static void b(Object obj, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690c9380", new Object[]{obj, str, objArr});
        } else if (f16088a) {
            TLog.logd("KVEL", "KirinEngine_Kit", a(obj, str, objArr));
        }
    }

    public static void c(Object obj, String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f9c62e", new Object[]{obj, str, th, objArr});
        } else if (f16088a) {
            TLog.loge("KVEL", "KirinEngine_Kit", a(obj, str, objArr), th);
        }
    }

    public static void d(Object obj, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f105edf", new Object[]{obj, str, objArr});
        } else if (f16088a) {
            TLog.loge("KVEL", "KirinEngine_Kit", a(obj, str, objArr));
        }
    }

    public static String e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60ef7ad1", new Object[]{obj});
        }
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Number) {
            return String.valueOf(obj);
        }
        if (obj.getClass().isAnonymousClass()) {
            String obj2 = obj.toString();
            return obj2.substring(obj2.lastIndexOf(46));
        }
        return obj.getClass().getSimpleName() + '@' + Integer.toHexString(obj.hashCode());
    }
}
