package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.render.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q97 extends ksa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894442);
    }

    public q97(whp whpVar) {
        super(whpVar);
    }

    public static /* synthetic */ Object ipc$super(q97 q97Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/interceptor/DefineToolHandlerInterceptor");
    }

    @Override // tb.ksa
    public void b(Context context, ma4 ma4Var, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0736b2", new Object[]{this, context, ma4Var, new Integer(i), bVar});
            return;
        }
        mi3 mi3Var = (mi3) ma4Var;
        JSONObject jSONObject = mi3Var.d;
        if (jSONObject == null || !TextUtils.equals("true", jSONObject.getString("isDisabled"))) {
            bwr.h().e()._defineToolUrl = mi3Var.g().i();
            xjp.b().onEvent(ma4Var);
        }
        gj8.b(mi3Var.g().k(), "", mi3Var.g().h());
    }

    @Override // tb.ksa
    public boolean c(Context context, ma4 ma4Var, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d18e050", new Object[]{this, context, ma4Var, new Integer(i), bVar})).booleanValue();
        }
        if (ma4Var instanceof mi3) {
            return "2".equals(((mi3) ma4Var).g().a());
        }
        return false;
    }
}
