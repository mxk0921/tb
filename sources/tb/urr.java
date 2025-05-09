package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.log.TBPLogLevel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class urr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static TBPLogLevel f29572a = TBPLogLevel.DEBUG;
    public static ync b = new klq();

    static {
        t2o.a(822083603);
    }

    public static void a(String str, String str2, Object... objArr) {
        ync yncVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8711bf03", new Object[]{str, str2, objArr});
        } else if (f29572a.ordinal() >= TBPLogLevel.DEBUG.ordinal() && (yncVar = b) != null) {
            yncVar.c(str, str2, objArr);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        ync yncVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0b6e2e", new Object[]{str, str2, objArr});
        } else if (f29572a.ordinal() >= TBPLogLevel.ERROR.ordinal() && (yncVar = b) != null) {
            yncVar.b(str, str2, objArr);
        }
    }

    public static void c(String str, Throwable th, String str2, Object... objArr) {
        ync yncVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a486fab", new Object[]{str, th, str2, objArr});
        } else if (f29572a.ordinal() >= TBPLogLevel.ERROR.ordinal() && (yncVar = b) != null) {
            yncVar.e(str, th, str2, objArr);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        ync yncVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d917bc8", new Object[]{str, str2, objArr});
        } else if (f29572a.ordinal() >= TBPLogLevel.INFO.ordinal() && (yncVar = b) != null) {
            yncVar.d(str, str2, objArr);
        }
    }

    public static void e(ync yncVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf008c6", new Object[]{yncVar});
        } else if (yncVar != null) {
            b = yncVar;
            f29572a = yncVar.a();
        }
    }

    public static void f(String str, String str2, Object... objArr) {
        ync yncVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5d5274", new Object[]{str, str2, objArr});
        } else if (f29572a.ordinal() >= TBPLogLevel.VERBOSE.ordinal() && (yncVar = b) != null) {
            yncVar.f(str, str2, objArr);
        }
    }

    public static void g(String str, String str2, Object... objArr) {
        ync yncVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68e041a", new Object[]{str, str2, objArr});
        } else if (f29572a.ordinal() >= TBPLogLevel.WARNING.ordinal() && (yncVar = b) != null) {
            yncVar.g(str, str2, objArr);
        }
    }
}
