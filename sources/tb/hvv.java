package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.UtUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hvv implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "ut_exposure";

    /* renamed from: a  reason: collision with root package name */
    public final Context f20917a;
    public final ze7 b;

    static {
        t2o.a(912261974);
        t2o.a(912261826);
    }

    public hvv(Context context, ze7 ze7Var) {
        this.f20917a = context;
        this.b = ze7Var;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        AliUserTrackerInterface c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null || (c = hr0.c()) == null) {
            return false;
        }
        String string = a2.getString("trackPage");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        JSONObject c2 = UtUtils.c(this.b.e());
        JSONObject h = yc4.h(runtimeAbilityParamArr);
        if (h != null) {
            c2.putAll(h);
        }
        c2.putAll(a2);
        JSONObject d = UtUtils.d(this.f20917a);
        if (d != null) {
            c2.putAll(d);
        }
        c.a("Page_Detail", 2201, string, null, null, UtUtils.a(c2));
        try {
            b5m.A().c("Page_Detail", string, null, null, UtUtils.i(c2));
        } catch (Throwable unused) {
        }
        return true;
    }
}
