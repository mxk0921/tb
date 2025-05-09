package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ems extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 5;

    /* renamed from: a  reason: collision with root package name */
    public final String f18681a;

    static {
        t2o.a(329252940);
    }

    public ems(String str) {
        try {
            this.f18681a = str.substring(5);
        } catch (Throwable th) {
            zdh.b(als.TAG, "parse TSUrlExpression error", th);
        }
    }

    public static ems c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ems) ipChange.ipc$dispatch("fee1b852", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@url.")) {
            return new ems(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(ems emsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSUrlExpression");
    }

    /* renamed from: d */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        try {
            Uri j = wp8Var.j();
            if (!TextUtils.isEmpty(this.f18681a) && j != null) {
                return j.getQueryParameter(this.f18681a);
            }
            return null;
        } catch (Throwable th) {
            zdh.b(als.TAG, "parse url params error", th);
            return null;
        }
    }
}
