package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ims extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 8;
    public static final String b = "TSXStateExpression";

    /* renamed from: a  reason: collision with root package name */
    public final String f21439a;

    static {
        t2o.a(329252944);
    }

    public ims(String str) {
        try {
            this.f21439a = str.substring(8);
        } catch (Throwable th) {
            zdh.b(b, "parse TSXStateExpression error", th);
        }
    }

    public static ims c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ims) ipChange.ipc$dispatch("f734768c", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@xstate.")) {
            return new ims(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(ims imsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSXStateExpression");
    }

    /* renamed from: d */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        try {
            if (TextUtils.isEmpty(this.f21439a)) {
                return null;
            }
            String c = inx.c(this.f21439a);
            String str = b;
            zdh.a(str, "parse xstate params = " + c);
            return c;
        } catch (Throwable th) {
            zdh.b(b, "parse xstate params error", th);
            return null;
        }
    }
}
