package tb;

import android.os.Build;
import android.os.Process;
import android.system.OsConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ysg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_JIFFY_HZ = 100;
    public static final int d = Process.myPid();
    public static long e = 0;
    public static final ThreadLocal<byte[]> f = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final String f32316a;
    public final String b;
    public final String c;

    public ysg(String str) {
        this.f32316a = str;
        StringBuilder sb = new StringBuilder("/proc/");
        int i = d;
        sb.append(i);
        sb.append("/stat");
        this.b = sb.toString();
        this.c = "/proc/" + i + "/task/";
    }

    public static List<jft> a(List<jft> list, List<jft> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bb18a99", new Object[]{list, list2});
        }
        if (list == null) {
            for (jft jftVar : list2) {
                jftVar.j = true;
                jftVar.k = jftVar.b();
            }
            return list2;
        }
        HashMap hashMap = new HashMap();
        for (jft jftVar2 : list) {
            hashMap.put(Long.valueOf(jftVar2.c), jftVar2);
        }
        for (jft jftVar3 : list2) {
            jft jftVar4 = (jft) hashMap.get(Long.valueOf(jftVar3.c));
            if (jftVar4 == null) {
                jftVar3.j = true;
                jftVar3.k = jftVar3.b();
            } else {
                jftVar3.j = false;
                jftVar3.k = jftVar3.b() - jftVar4.b();
            }
        }
        return list2;
    }

    public static jft b(jft jftVar, jft jftVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jft) ipChange.ipc$dispatch("16306476", new Object[]{jftVar, jftVar2});
        }
        if (jftVar == null) {
            jftVar2.j = true;
            jftVar2.k = jftVar2.b();
            return jftVar2;
        }
        jftVar2.j = false;
        jftVar2.k = jftVar2.b() - jftVar.b();
        return jftVar2;
    }

    public static byte[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("88b72333", new Object[0]);
        }
        ThreadLocal<byte[]> threadLocal = f;
        if (threadLocal.get() == null) {
            threadLocal.set(new byte[128]);
        }
        return threadLocal.get();
    }

    public static jft h(long j, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jft) ipChange.ipc$dispatch("9cfd5805", new Object[]{new Long(j), str, bArr});
        }
        id9 id9Var = new id9(str, bArr);
        try {
            try {
                int b = id9Var.b();
                jft jftVar = new jft();
                jftVar.c = j;
                jft i = i(jftVar, bArr, b);
                try {
                    id9Var.a();
                } catch (Exception unused) {
                }
                return i;
            } catch (Exception unused2) {
                return null;
            }
        } catch (Throwable unused3) {
            id9Var.a();
            return null;
        }
    }

    public static jft i(jft jftVar, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jft) ipChange.ipc$dispatch("9eae8bc6", new Object[]{jftVar, bArr, new Integer(i)});
        }
        try {
            cd9 cd9Var = new cd9(bArr, i);
            cd9Var.f();
            cd9Var.h();
            CharBuffer d2 = cd9Var.d(')', CharBuffer.allocate(16));
            cd9Var.j();
            CharBuffer e2 = cd9Var.e(CharBuffer.allocate(1));
            for (int i2 = 0; i2 < 11; i2++) {
                cd9Var.j();
            }
            jftVar.d = String.valueOf(d2);
            jftVar.e = String.valueOf(e2);
            jftVar.f = j(cd9Var);
            jftVar.g = j(cd9Var);
            jftVar.h = j(cd9Var);
            jftVar.i = j(cd9Var);
            return jftVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long j(cd9 cd9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e30aa8a1", new Object[]{cd9Var})).longValue();
        }
        long c = cd9Var.c();
        cd9Var.j();
        return c;
    }

    public jft e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jft) ipChange.ipc$dispatch("303ec308", new Object[]{this});
        }
        jft h = h(d, this.b, d());
        if (h != null) {
            h.d = this.f32316a;
        }
        return h;
    }

    public jft f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jft) ipChange.ipc$dispatch("53f96bd0", new Object[]{this, new Long(j)});
        }
        return h(j, this.c + j + "/stat", d());
    }

    public List<jft> g() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("984d376c", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        try {
            strArr = new File(this.c).list();
        } catch (Exception unused) {
            strArr = null;
        }
        if (strArr != null) {
            for (String str : strArr) {
                int e2 = rrl.e(str, -1);
                if (e2 >= 0) {
                    long j = e2;
                    jft h = h(j, this.c + e2 + "/stat", d());
                    if (h != null) {
                        h.c = j;
                        arrayList.add(h);
                    }
                }
            }
        }
        return arrayList;
    }

    public static long c() {
        long j = e;
        if (j != 0) {
            return j;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                Field declaredField = cls.getDeclaredField("os");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(cls);
                Method method = cls2.getMethod("sysconf", Integer.TYPE);
                method.setAccessible(true);
                Object invoke = method.invoke(obj, Integer.valueOf(OsConstants._SC_CLK_TCK));
                if (invoke != null) {
                    e = ((Long) invoke).longValue();
                }
            } catch (Exception unused) {
            }
        }
        if (e == 0) {
            e = 100L;
        }
        return e;
    }
}
