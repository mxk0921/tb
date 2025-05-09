package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vav {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, b> f29900a = new HashMap();
    public static final String sDefaultBizCode = "ultron";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(83886361);
        }

        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68ca2184", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            return z;
        }

        public float b(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("341be674", new Object[]{this, str, new Float(f)})).floatValue();
            }
            return f;
        }

        public int c(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2d64674d", new Object[]{this, str, new Integer(i)})).intValue();
            }
            return i;
        }

        public long d(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2df331c8", new Object[]{this, str, new Long(j)})).longValue();
            }
            return j;
        }

        public String e(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7d8d7c7b", new Object[]{this, str, str2});
            }
            return str2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(83886362);
        }

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/utils/UltronSwitch$DefaultSwitch");
        }

        @Override // tb.vav.b
        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68ca2184", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            return qh4.f(str, z);
        }

        @Override // tb.vav.b
        public float b(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("341be674", new Object[]{this, str, new Float(f)})).floatValue();
            }
            return qh4.b(str, f);
        }

        @Override // tb.vav.b
        public int c(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2d64674d", new Object[]{this, str, new Integer(i)})).intValue();
            }
            return qh4.c(str, i);
        }

        @Override // tb.vav.b
        public long d(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2df331c8", new Object[]{this, str, new Long(j)})).longValue();
            }
            return qh4.d(str, j);
        }

        @Override // tb.vav.b
        public String e(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7d8d7c7b", new Object[]{this, str, str2});
            }
            return qh4.e(str, str2);
        }
    }

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62e45dfa", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        return b(str, str2, z, false);
    }

    public static boolean b(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9a813a2", new Object[]{str, str2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        boolean a2 = c(str).a(str2, z);
        if (z2) {
            hav.g("奥创开关#" + str, str2, "=" + a2);
        }
        return a2;
    }

    public static b c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f16208c0", new Object[]{str});
        }
        b bVar = !TextUtils.isEmpty(str) ? (b) ((HashMap) f29900a).get(str) : null;
        return bVar == null ? (b) ((HashMap) f29900a).get("ultron") : bVar;
    }

    public static float d(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2baedf9a", new Object[]{str, str2, new Float(f)})).floatValue();
        }
        return c(str).b(str2, f);
    }

    public static int e(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2baeeae0", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        return c(str).c(str2, i);
    }

    public static long f(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2baeeea2", new Object[]{str, str2, new Long(j)})).longValue();
        }
        return c(str).d(str2, j);
    }

    public static String g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d85580", new Object[]{str, str2, str3});
        }
        return c(str).e(str2, str3);
    }

    public static void h(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2573586", new Object[]{str, bVar});
            return;
        }
        Map<String, b> map = f29900a;
        if (!map.containsKey(str)) {
            map.put(str, bVar);
        }
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e8b9cd", new Object[]{str});
        } else {
            ((HashMap) f29900a).remove(str);
        }
    }

    static {
        t2o.a(83886359);
        h("ultron", new c());
    }
}
