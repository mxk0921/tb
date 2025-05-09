package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.log.TBPLogLevel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class klq implements ync {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TBPLogLevel f22747a;

    static {
        t2o.a(822083601);
        t2o.a(822083587);
    }

    public klq(TBPLogLevel tBPLogLevel) {
        this.f22747a = tBPLogLevel;
    }

    public static String h(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13ec6fb0", new Object[]{str, objArr});
        }
        return String.format(str, objArr);
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec29c4ac", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "TBUPROF";
        }
        return "TBUPROF_" + str;
    }

    public static String j(String str, Throwable th) {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533fe44", new Object[]{str, th});
        }
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(th.getClass().getName());
        sb.append("  ");
        sb.append(th.getMessage());
        sb.append("\r\n");
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\tat  ");
            sb.append(stackTraceElement);
            sb.append("\r\n");
        }
        return sb.toString();
    }

    @Override // tb.ync
    public TBPLogLevel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPLogLevel) ipChange.ipc$dispatch("239825b2", new Object[]{this});
        }
        return this.f22747a;
    }

    @Override // tb.ync
    public void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0b6e2e", new Object[]{this, str, str2, objArr});
        } else {
            Log.e(i(str), h(str2, objArr));
        }
    }

    @Override // tb.ync
    public void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8711bf03", new Object[]{this, str, str2, objArr});
            return;
        }
        h(str2, objArr);
        i(str);
    }

    @Override // tb.ync
    public void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d917bc8", new Object[]{this, str, str2, objArr});
            return;
        }
        h(str2, objArr);
        i(str);
    }

    @Override // tb.ync
    public void e(String str, Throwable th, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a486fab", new Object[]{this, str, th, str2, objArr});
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        Log.e(i(str), j(h(str2, objArr), th));
    }

    @Override // tb.ync
    public void f(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5d5274", new Object[]{this, str, str2, objArr});
            return;
        }
        h(str2, objArr);
        i(str);
    }

    @Override // tb.ync
    public void g(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68e041a", new Object[]{this, str, str2, objArr});
            return;
        }
        h(str2, objArr);
        i(str);
    }

    public klq() {
        this(TBPLogLevel.INFO);
    }
}
