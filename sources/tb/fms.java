package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fms extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "@utabtest.";
    public static final int SUB_INDEX = 10;

    /* renamed from: a  reason: collision with root package name */
    public final String f19410a;
    public final String b;
    public final String c;

    static {
        t2o.a(329252941);
    }

    public fms(String str) {
        try {
            String[] split = str.substring(10).split(".");
            if (split.length >= 3) {
                this.f19410a = split[0];
                this.b = split[1];
                this.c = split[2];
            }
        } catch (Throwable th) {
            zdh.b(als.TAG, "parse TSUtabtestExpression error", th);
        }
    }

    public static fms c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fms) ipChange.ipc$dispatch("668957d3", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith(PREFIX)) {
            return new fms(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(fms fmsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSUtabtestExpression");
    }

    /* renamed from: d */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        if (TextUtils.isEmpty(this.f19410a) || TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c)) {
            return null;
        }
        return cns.e(this.f19410a, this.b, this.c);
    }
}
