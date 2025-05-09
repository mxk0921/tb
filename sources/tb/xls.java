package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xls extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "@pageurl.";
    public static final int SUB_INDEX = 9;

    /* renamed from: a  reason: collision with root package name */
    public final String f31463a;

    static {
        t2o.a(329252938);
    }

    public xls(String str) {
        try {
            this.f31463a = str.substring(9);
        } catch (Throwable th) {
            zdh.b(als.TAG, "parse TSPageUrlExpression error", th);
        }
    }

    public static xls c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xls) ipChange.ipc$dispatch("488c41c1", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith(PREFIX)) {
            return new xls(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(xls xlsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSPageUrlExpression");
    }

    /* renamed from: d */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        if (TextUtils.isEmpty(this.f31463a)) {
            return null;
        }
        return yms.h(this.f31463a);
    }
}
