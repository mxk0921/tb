package com.taobao.themis.pub.menu;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import java.util.List;
import java.util.Map;
import tb.bac;
import tb.bbs;
import tb.ckf;
import tb.jjx;
import tb.qxq;
import tb.r8s;
import tb.sbs;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTBMenu implements ITBPublicMenu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f13690a;
    public final bbs b;
    public final TBPublicMenu c;

    static {
        t2o.a(844103706);
        t2o.a(927989771);
    }

    public TMSTBMenu(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f13690a = iTMSPage;
        bbs instance = iTMSPage.getInstance();
        this.b = instance;
        Activity I = instance.I();
        ckf.f(I, "mInstance.activity");
        this.c = new TBPublicMenu(I, this);
    }

    public static final /* synthetic */ TBPublicMenu a(TMSTBMenu tMSTBMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("349e622b", new Object[]{tMSTBMenu});
        }
        return tMSTBMenu.c;
    }

    public final void b(List<? extends bac.c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7485d997", new Object[]{this, list});
            return;
        }
        ckf.g(list, "item");
        CommonExtKt.o(new TMSTBMenu$addItems$1(this, list));
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("31b6157b", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "appVersion", r8s.i(this.b));
        jSONObject.put((JSONObject) "appId", this.b.L());
        jSONObject.put((JSONObject) "appName", r8s.f(this.b));
        jSONObject.put((JSONObject) "frameType", r8s.c(this.b));
        jSONObject.put((JSONObject) "bizType", r8s.k(this.b));
        jSONObject.put((JSONObject) qxq.SUB_KEY_FRAGMENT_JUMP, r8s.h(this.b));
        jSONObject.put((JSONObject) RVConstants.EXTRA_APPTYPE, "tms");
        jSONObject.put((JSONObject) "templateId", r8s.w(this.b));
        jSONObject.put((JSONObject) "templateVersion", r8s.y(this.b));
        String openModel = this.b.c0().getOpenModel();
        if (TextUtils.equals(openModel, "afc_open_link") || TextUtils.equals(openModel, "browser_link")) {
            jSONObject.put((JSONObject) "isFromOuter", "true");
        }
        return jSONObject;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.c.onResume();
        }
    }

    public final void e(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21fbd47a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "itemType");
        sbs sbsVar = sbs.INSTANCE;
        if (bac.b.b(str, sbsVar.h())) {
            str2 = "report";
        } else if (bac.b.b(str, sbsVar.e())) {
            str2 = "feedback";
        } else {
            str2 = bac.b.b(str, sbsVar.f()) ? "help" : null;
        }
        if (str2 != null) {
            CommonExtKt.o(new TMSTBMenu$removeItem$1(this, str2));
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            this.c.show();
        }
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        JSONObject c = c();
        for (Map.Entry<String, Object> entry : c.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String str = "";
            if (!(value == null || (obj = value.toString()) == null)) {
                str = obj;
            }
            bundle3.putString(key, str);
        }
        bundle2.putString("from", "miniAppDetail");
        bundle2.putString("subjectId", this.b.L());
        bundle2.putString("subjectType", "MINI_APP");
        bundle2.putString("extraInfo", c.toJSONString());
        bundle.putBundle(jjx.ZZB_BUNDLE_KEY, bundle2);
        return bundle;
    }
}
