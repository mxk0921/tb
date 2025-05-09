package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class g2q implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String EVENT_TYPE = "pick_prop_path";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f19704a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912261945);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912261944);
        t2o.a(912261826);
    }

    public g2q(Context context, ze7 ze7Var) {
        ckf.h(context, "context");
        ckf.h(ze7Var, "detailContext");
        this.f19704a = ze7Var;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        ckf.h(runtimeAbilityParamArr, "runtimeParams");
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        String string = a2.getString("frameGroupId");
        if (string != null) {
            this.f19704a.i().f("galleryFrameGroupId", string);
        }
        String string2 = a2.getString("propPath");
        if (string2 != null) {
            this.f19704a.i().f("propPath", string2);
        }
        return true;
    }
}
