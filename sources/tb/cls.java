package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;
import tb.wp8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cls extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 7;

    /* renamed from: a  reason: collision with root package name */
    public final String f17142a;

    static {
        t2o.a(329252931);
    }

    public cls(String str) {
        try {
            this.f17142a = str.substring(7);
        } catch (Throwable unused) {
        }
    }

    public static cls c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cls) ipChange.ipc$dispatch("41070eb5", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@kvExt")) {
            return new cls(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(cls clsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSExtKvExpression");
    }

    /* renamed from: d */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        if (TextUtils.isEmpty(this.f17142a)) {
            return null;
        }
        Intent f = wp8Var.f();
        wp8.a d = wp8Var.d(this.f17142a);
        if (!(d == null || f == null)) {
            try {
                JSONObject a2 = d.a(TScheduleInitialize.b(), f);
                if (a2 == null) {
                    return null;
                }
                return JSON.toJSONString(a2);
            } catch (Throwable th) {
                zdh.b(als.TAG, "parse ext kv error", th);
            }
        }
        return null;
    }
}
