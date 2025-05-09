package tb;

import android.util.Pair;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import tb.l94;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tzm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(768606226);
        }

        public static /* synthetic */ Pair a(String str, String str2, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("dd4c0003", new Object[]{str, str2, eVar});
            }
            return b(str, str2, eVar);
        }

        public static Pair<Boolean, Long> b(String str, String str2, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("2b0cc8c6", new Object[]{str, str2, eVar});
            }
            return d.a(str, str2, eVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(768606227);
        }

        public static /* synthetic */ Pair a(String str, String str2, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("3672f4c6", new Object[]{str, str2, eVar});
            }
            return b(str, str2, eVar);
        }

        public static Pair<Boolean, Long> b(String str, String str2, e eVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("2b0cc8c6", new Object[]{str, str2, eVar});
            }
            try {
                String str3 = "cmd package compile -m " + str2 + " -f " + str;
                vhh.a("ProfileCompiler", "compile cmd: ".concat(str3));
                long nanoTime = System.nanoTime();
                Process exec = Runtime.getRuntime().exec(str3);
                l94.a aVar = (l94.a) eVar;
                aVar.b();
                int waitFor = exec.waitFor();
                aVar.a();
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                vhh.a("ProfileCompiler", "compile cmd with code: " + waitFor + ", duration:" + millis);
                if (waitFor != 0) {
                    z = false;
                }
                return Pair.create(Boolean.valueOf(z), Long.valueOf(millis));
            } catch (Throwable th) {
                vhh.a("ProfileCompiler", "AndroidShell.compile failed:" + th.getMessage());
                return Pair.create(Boolean.FALSE, -1L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
    }

    static {
        t2o.a(768606223);
    }

    public static /* synthetic */ Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d664817", new Object[0]);
        }
        return c();
    }

    public static Pair<Boolean, Long> b(int i, String str, String str2, e eVar) {
        Pair<Boolean, Long> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("188e1795", new Object[]{new Integer(i), str, str2, eVar});
        }
        if (i >= 28) {
            pair = c.a(str, str2, eVar);
        } else if (i >= 27) {
            pair = b.a(str, str2, eVar);
        } else if (i >= 24) {
            pair = a.a(str, str2, eVar);
        } else {
            pair = Pair.create(Boolean.FALSE, -1L);
        }
        vhh.a("ProfileCompiler", "performCompile with result = " + pair);
        return pair;
    }

    public static Object c() {
        try {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod("getPackageManager", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(768606224);
        }

        public static /* synthetic */ Pair a(String str, String str2, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("c365f885", new Object[]{str, str2, eVar});
            }
            return b(str, str2, eVar);
        }

        public static Pair<Boolean, Long> b(String str, String str2, e eVar) {
            Object a2 = tzm.a();
            if (a2 == null) {
                return Pair.create(Boolean.FALSE, -1L);
            }
            Class<?> cls = a2.getClass();
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("performDexOptMode", String.class, cls2, String.class, cls2);
                long nanoTime = System.nanoTime();
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = (Boolean) declaredMethod.invoke(a2, str, bool, str2, bool);
                boolean booleanValue = bool2.booleanValue();
                l94.a aVar = (l94.a) eVar;
                aVar.b();
                aVar.a();
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                vhh.a("ProfileCompiler", "compile with result: " + booleanValue + ", duration:" + millis);
                return Pair.create(bool2, Long.valueOf(millis));
            } catch (Throwable th) {
                vhh.a("ProfileCompiler", "error occurred when performDexOptMode, fallback with shell:" + th.getMessage());
                return d.a(str, str2, eVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(768606225);
        }

        public static /* synthetic */ Pair a(String str, String str2, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("5058fc44", new Object[]{str, str2, eVar});
            }
            return b(str, str2, eVar);
        }

        public static Pair<Boolean, Long> b(String str, String str2, e eVar) {
            Object a2 = tzm.a();
            if (a2 == null) {
                return Pair.create(Boolean.FALSE, -1L);
            }
            Class<?> cls = a2.getClass();
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("performDexOptMode", String.class, cls2, String.class, cls2, cls2, String.class);
                long nanoTime = System.nanoTime();
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = (Boolean) declaredMethod.invoke(a2, str, bool, str2, bool, bool, null);
                boolean booleanValue = bool2.booleanValue();
                l94.a aVar = (l94.a) eVar;
                aVar.b();
                aVar.a();
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                vhh.a("ProfileCompiler", "compile with result: " + booleanValue + ", duration:" + millis);
                return Pair.create(bool2, Long.valueOf(millis));
            } catch (Throwable th) {
                vhh.a("ProfileCompiler", "error occurred when performDexOptMode, fallback with shell:" + th.getMessage());
                return d.a(str, str2, eVar);
            }
        }
    }
}
