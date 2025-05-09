package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class f2q implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String EVENT_TYPE = "pick_gallery_thumb";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f18965a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912261943);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912261942);
        t2o.a(912261826);
    }

    public f2q(Context context, ze7 ze7Var) {
        ckf.h(context, "context");
        ckf.h(ze7Var, "detailContext");
        this.f18965a = ze7Var;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        ckf.h(runtimeAbilityParamArr, "runtimeParams");
        if (irVar == null || (a2 = irVar.a()) == null || (string = a2.getString("frameGroupId")) == null) {
            return false;
        }
        this.f18965a.i().f("galleryFrameGroupId", string);
        this.f18965a.i().f("propPath", null);
        return true;
    }
}
