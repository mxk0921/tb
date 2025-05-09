package tb;

import android.content.Context;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class rub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237923);
    }

    public abstract void a(Context context, a aVar, JSONObject jSONObject);

    public a b(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4ae5a7ce", new Object[]{this, context, jSONObject});
        }
        a d = d();
        a(context, d, jSONObject);
        return d;
    }

    public abstract String c();

    public abstract a d();
}
