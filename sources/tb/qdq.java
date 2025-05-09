package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qdq implements wnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f26686a;

    static {
        t2o.a(676331628);
        t2o.a(676331627);
    }

    public qdq(String str) {
        this.f26686a = str;
    }

    public static String f(String str, String str2, Object... objArr) {
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
        return 0;
    }

    @Override // tb.wnc
    public int b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98f7bd0f", new Object[]{this, str, objArr})).intValue();
        }
        return 0;
    }

    @Override // tb.wnc
    public int c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a05cf22e", new Object[]{this, str, objArr})).intValue();
        }
        TLog.loge(wnc.MODULE, "", f(this.f26686a, str, objArr));
        return 0;
    }

    @Override // tb.wnc
    public int d(Throwable th, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a9be5b1", new Object[]{this, th, str, objArr})).intValue();
        }
        TLog.loge(wnc.MODULE, "", f(this.f26686a, str, objArr), th);
        return 0;
    }

    @Override // tb.wnc
    public int e(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("257aae5c", new Object[]{this, str, objArr})).intValue();
        }
        TLog.logw(wnc.MODULE, "", f(this.f26686a, str, objArr));
        return 0;
    }
}
