package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pls extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f26164a = "TSMarketUaExpression";

    static {
        t2o.a(329252924);
    }

    public pls(String str) {
    }

    public static pls d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pls) ipChange.ipc$dispatch("7a4475b3", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@hcUA")) {
            return new pls(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(pls plsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/headers/TSMarketUaExpression");
    }

    public final String c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b867771", new Object[]{this});
        }
        String a2 = yaa.f().a();
        String b = yaa.f().b();
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(b)) {
            str = "Prefetch/Nav";
        } else {
            str = "Prefetch/Nav AliApp(" + a2 + "/" + b + f7l.BRACKET_END_STR;
        }
        if (!str.contains("TTID/") && !TextUtils.isEmpty(yaa.f().g())) {
            str = str + " TTID/" + yaa.f().g();
        }
        return str + " WindVane/8.3.0";
    }

    /* renamed from: e */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        try {
            String c = c();
            String str = f26164a;
            zdh.a(str, "parse hcUA params = " + c);
            return c;
        } catch (Throwable th) {
            zdh.b(f26164a, "parse hcUA params error", th);
            return null;
        }
    }
}
