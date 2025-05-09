package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ym7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static uzb f32189a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32190a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public a(String str, String str2, long j) {
            this.f32190a = str;
            this.b = str2;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (tl7.f()) {
                ym7.a(tl7.TAG, "handleEvent module=" + this.f32190a + "identifier=" + this.b + "consuming=" + (this.c / 1000000.0d));
            }
            f65.n().d().h(this.f32190a, this.b, this.c / 1000000.0d);
        }
    }

    static {
        t2o.a(444596338);
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e678f70a", new Object[]{str, strArr});
        } else {
            f(strArr);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else {
            Log.e(str, str2, th);
        }
    }

    public static void c(String str, Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee75e40", new Object[]{str, th, strArr});
        } else {
            Log.e(str, f(strArr), th);
        }
    }

    public static void d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edde2c29", new Object[]{str, strArr});
        } else {
            Log.e(str, f(strArr));
        }
    }

    public static void e(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7300a5", new Object[]{str, strArr});
        } else {
            f(strArr);
        }
    }

    public static String f(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3193a943", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void g(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb056c5b", new Object[]{str, str2, new Long(j)});
        } else if (f65.n().d() != null && zm7.a()) {
            zm7.b.a(new a(str, str2, j));
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc0dfd7e", new Object[]{str});
        }
    }

    public static void i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a9b36c", new Object[]{str, str2, str3});
            return;
        }
        uzb uzbVar = f32189a;
        if (uzbVar != null) {
            try {
                ((lyn) uzbVar).a(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    public static void j(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380e670", new Object[]{str, str2, str3});
            return;
        }
        uzb uzbVar = f32189a;
        if (uzbVar != null) {
            try {
                ((lyn) uzbVar).b(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    public static void k(uzb uzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a959043b", new Object[]{uzbVar});
        } else {
            f32189a = uzbVar;
        }
    }

    public static void l(String str, Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efeaad2", new Object[]{str, th, strArr});
        } else {
            f(strArr);
        }
    }

    public static void m(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fbe857", new Object[]{str, strArr});
        } else {
            f(strArr);
        }
    }
}
