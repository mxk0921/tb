package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;
import tb.wp8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bls extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 5;

    /* renamed from: a  reason: collision with root package name */
    public final String f16472a;

    static {
        t2o.a(329252930);
    }

    public bls(String str) {
        try {
            this.f16472a = str.substring(5);
        } catch (Throwable th) {
            zdh.b(als.TAG, "parse TSExtExpression error", th);
        }
    }

    public static bls c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bls) ipChange.ipc$dispatch("b5a47060", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@ext")) {
            return new bls(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(bls blsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSExtExpression");
    }

    /* renamed from: d */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        if (TextUtils.isEmpty(this.f16472a)) {
            return null;
        }
        Intent f = wp8Var.f();
        wp8.b e = wp8Var.e(this.f16472a);
        if (!(e == null || f == null)) {
            try {
                return e.a(TScheduleInitialize.b(), f);
            } catch (Throwable th) {
                zdh.b(als.TAG, "parse ext error", th);
            }
        }
        return null;
    }
}
