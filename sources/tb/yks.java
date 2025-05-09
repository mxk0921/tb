package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yks extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32156a;

    static {
        t2o.a(329252929);
    }

    public yks(String str) {
        try {
            this.f32156a = str.substring(21);
        } catch (Throwable th) {
            zdh.b(als.TAG, "parse TSUrlExpression error", th);
        }
    }

    public static yks c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yks) ipChange.ipc$dispatch("5e56dad0", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@decodeParamsFromUrl.")) {
            return new yks(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(yks yksVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSDecodeParamsFromUrlExpression");
    }

    /* renamed from: d */
    public String b(wp8 wp8Var) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        try {
            Uri j = wp8Var.j();
            if (!(TextUtils.isEmpty(this.f32156a) || j == null || (queryParameter = j.getQueryParameter(this.f32156a)) == null)) {
                return Uri.decode(queryParameter);
            }
        } catch (Throwable th) {
            zdh.b(als.TAG, "parse url params error", th);
        }
        return null;
    }
}
