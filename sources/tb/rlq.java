package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.UtUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rlq implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "stdPop.showH5";

    /* renamed from: a  reason: collision with root package name */
    public final Activity f27460a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(rlq rlqVar) {
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            }
        }
    }

    static {
        t2o.a(912261947);
        t2o.a(912261826);
    }

    public rlq(Context context) {
        if (context instanceof Activity) {
            this.f27460a = (Activity) context;
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eeebcd6", new Object[]{this, str, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apiName", (Object) str);
            jSONObject2.put("extParams", (Object) jSONObject);
            UtUtils.f(19999, "tt_detail_open_std_show_h5", jSONObject2);
        } catch (Exception e) {
            tgh.b("StdPopShowH5Implementor", "openStdPopShowH5Track error:" + e.getMessage());
        }
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
        Activity activity = this.f27460a;
        ExecuteResult c = kji.c(activity, activity.getWindow().getDecorView(), "stdPop", StdPopAbility.API_H5, a2, new a(this));
        b(StdPopAbility.API_H5, a2);
        if (!(c instanceof ErrorResult)) {
            return true;
        }
        tgh.b("StdPopShowH5Implementor", "execute error:" + ((ErrorResult) c).getCode());
        return false;
    }
}
