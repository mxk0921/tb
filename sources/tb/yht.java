package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEditionSwitcherAdapter;
import com.taobao.themis.kernel.solution.TMSSolutionType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class yht {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final yht INSTANCE = new yht();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbs f32104a;

        public a(bbs bbsVar) {
            this.f32104a = bbsVar;
        }

        @Override // tb.u8
        public final void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            } else if (ckf.b("onClose", str)) {
                this.f32104a.W().e();
            }
        }
    }

    static {
        t2o.a(843055405);
    }

    public final boolean b(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d70588", new Object[]{this, appModel})).booleanValue();
        }
        return TextUtils.equals("true", (appModel == null || appModel.getExtendInfos() == null) ? null : appModel.getExtendInfos().getString("needTeenagerProtection"));
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c96b205a", new Object[]{this})).booleanValue();
        }
        JSONObject queryCurrentVersionInfo = ((IEditionSwitcherAdapter) p8s.g(IEditionSwitcherAdapter.class)).queryCurrentVersionInfo();
        if (queryCurrentVersionInfo != null) {
            return ckf.b("children_version", gbs.d(queryCurrentVersionInfo, "versionCode"));
        }
        return false;
    }

    public final void c(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea36d136", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        if (!bbsVar.a0().equals(TMSSolutionType.WIDGET)) {
            Activity I = bbsVar.I();
            ckf.f(I, "instance.activity");
            n9 n9Var = new n9();
            n9Var.i(I);
            n9Var.m(I.getWindow().getDecorView());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "type", jht.actionShowWindVanePop);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "url", ckf.p(q9s.c4(), bbsVar.L()));
            jSONObject2.put((JSONObject) "popId", bbsVar.L());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put((JSONObject) "gravity", "bottom");
            Boolean bool = Boolean.FALSE;
            jSONObject3.put((JSONObject) "isOpaque", (String) bool);
            jSONObject3.put((JSONObject) "pushType", "outterJump");
            jSONObject3.put((JSONObject) "animation", nbf.STDPOP_ANIMATION_BOTTOM);
            jSONObject3.put((JSONObject) "contentBackColor", "#00000000");
            jSONObject3.put((JSONObject) "tapEnable", (String) bool);
            jSONObject3.put((JSONObject) "maxHeight", (String) 1);
            jSONObject2.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject3);
            jSONObject.put((JSONObject) "params", (String) jSONObject2);
            new y7().b(new n8(jSONObject), n9Var, new a(bbsVar));
        }
    }
}
