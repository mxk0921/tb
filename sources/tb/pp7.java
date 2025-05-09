package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.UtUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pp7 implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "disappear";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f26222a;

    static {
        t2o.a(912261880);
        t2o.a(912261826);
    }

    public pp7(Context context, ze7 ze7Var) {
        this.f26222a = ze7Var;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        String string = a2.getString("trackPage");
        if (TextUtils.isEmpty(string) || hr0.c() == null) {
            return false;
        }
        JSONObject c = UtUtils.c(this.f26222a.e());
        c.putAll(a2);
        try {
            b5m.A().a("Page_Detail", string, null, null, UtUtils.i(c));
        } catch (Throwable unused) {
        }
        return true;
    }
}
