package tb;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dl9 implements wnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean c;

    /* renamed from: a  reason: collision with root package name */
    public final String f17894a;
    public final wnc b;

    static {
        t2o.a(676331626);
        t2o.a(676331627);
        c = true;
        try {
            Log.e("FlexaLogger", TLog.class.getSimpleName());
            c = true;
        } catch (Throwable unused) {
            c = false;
        }
    }

    public dl9(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String sb2 = sb.toString();
        sb2 = str.length() != 0 ? sb2.concat(str) : sb2;
        this.f17894a = sb2;
        if (c) {
            this.b = new qdq(sb2);
        }
    }

    public static String g(String str, String str2, Object... objArr) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fda9d296", new Object[]{str, str2, objArr});
        }
        if (objArr != null && objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str3 = "Unable to format ".concat(valueOf);
                } else {
                    str3 = new String("Unable to format ");
                }
                Log.e(wnc.MODULE, str3, e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // tb.wnc
    public int a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdf1c6aa", new Object[]{this, str, objArr})).intValue();
        }
        if (c) {
            ((qdq) this.b).a(str, objArr);
        }
        return f(4, str, objArr);
    }

    @Override // tb.wnc
    public int b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98f7bd0f", new Object[]{this, str, objArr})).intValue();
        }
        if (c) {
            ((qdq) this.b).b(str, objArr);
        }
        return f(3, str, objArr);
    }

    @Override // tb.wnc
    public int c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a05cf22e", new Object[]{this, str, objArr})).intValue();
        }
        if (c) {
            ((qdq) this.b).c(str, objArr);
        }
        return f(6, str, objArr);
    }

    @Override // tb.wnc
    public int d(Throwable th, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a9be5b1", new Object[]{this, th, str, objArr})).intValue();
        }
        if (c) {
            ((qdq) this.b).d(th, str, objArr);
        }
        if (Log.isLoggable(wnc.MODULE, 6)) {
            return Log.e(wnc.MODULE, g(this.f17894a, str, objArr), th);
        }
        return 0;
    }

    @Override // tb.wnc
    public int e(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("257aae5c", new Object[]{this, str, objArr})).intValue();
        }
        if (c) {
            ((qdq) this.b).e(str, objArr);
        }
        return f(5, str, objArr);
    }

    public final int f(int i, String str, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4929dab", new Object[]{this, new Integer(i), str, objArr})).intValue();
        }
        if (Log.isLoggable(wnc.MODULE, i)) {
            return Log.println(i, wnc.MODULE, g(this.f17894a, str, objArr));
        }
        return 0;
    }
}
