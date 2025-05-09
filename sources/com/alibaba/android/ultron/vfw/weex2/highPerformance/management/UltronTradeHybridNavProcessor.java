package com.alibaba.android.ultron.vfw.weex2.highPerformance.management;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridDialogFragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import tb.dbv;
import tb.hav;
import tb.l2e;
import tb.lbv;
import tb.mbv;
import tb.qbv;
import tb.qxq;
import tb.t2o;
import tb.v9v;
import tb.xnj;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronTradeHybridNavProcessor implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286834);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "UltronTradeHybridNavProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    private boolean interceptTMSContainer(zmj zmjVar, String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e530a47e", new Object[]{this, zmjVar, str, str2, bundle})).booleanValue();
        }
        if (!UltronTradeHybridSwitcherHelper.n()) {
            hav.g("UltronTradeHybridNavProcessor", "interceptTMSContainer:", "switcher is off");
            return true;
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            hav.g("UltronTradeHybridNavProcessor", "interceptTMSContainer:", "url or query is empty");
            return true;
        } else if (zmjVar == null || !(zmjVar.d() instanceof FragmentActivity)) {
            hav.g("UltronTradeHybridNavProcessor", "interceptTMSContainer:", "navContext is null");
            return true;
        } else {
            JSONObject jSONObject = null;
            l2e l2eVar = zmjVar.d() instanceof l2e ? (l2e) zmjVar.d() : null;
            ISupportFragment h = qxq.h(((FragmentActivity) zmjVar.d()).getSupportFragmentManager());
            if (l2eVar == null && (h instanceof l2e)) {
                l2eVar = (l2e) h;
            }
            if (l2eVar == null) {
                hav.g("UltronTradeHybridNavProcessor", "interceptTMSContainer:", "tmsHost is null");
                return true;
            }
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_THEMIS, "enableTransferInitData", true) && bundle != null && (bundle.get("initData") instanceof JSONObject)) {
                jSONObject = (JSONObject) bundle.get("initData");
            }
            return !l2eVar.P2(str, jSONObject);
        }
    }

    private void onNavDispatch(String str, Intent intent) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb90322c", new Object[]{this, str, intent});
        } else if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "enableOnNavDispatch", true)) {
            if (mbv.a(str, dbv.PRE_RENDER_URL_ASK_LIST)) {
                str2 = "ask_list";
            } else if (mbv.a(str, dbv.PRE_RENDER_URL_RATE_HOME)) {
                str2 = "rate_home_list";
            } else if (mbv.a(str, dbv.PRE_RENDER_URL_LOGISTICS) || mbv.a(str, dbv.PRE_RENDER_URL_REFUND_LOGISTICS)) {
                if (v9v.i("orderMap", "registerPlatformViewOnNav", true)) {
                    lbv.k();
                }
                str2 = "orderList";
            } else {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                if (!UltronTradeHybridSwitcherHelper.d(str2)) {
                    hav.g("UltronTradeHybridNavProcessor", "onNavDispatch:", "not hit orange in ".concat(str2));
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("nav_process_param_intent", (Object) intent);
                qbv.j().a(UltronTradeHybridStage.ON_NAV_PROCESS, str2, jSONObject);
            }
        }
    }

    private boolean enableReuseTradeHybridContainer(zmj zmjVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c10a0b5", new Object[]{this, zmjVar, str, str2})).booleanValue();
        }
        return (zmjVar.d() instanceof UltronTradeHybridActivity) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "enableReuseTradeHybridContainer", true) && str.contains("reuseTradeHybridContainer=true") && !str.contains("pageType=pop");
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (!UltronTradeHybridSwitcherHelper.m()) {
            hav.g("UltronTradeHybridNavProcessor", "process:", "enableTradeHybrid false");
            return true;
        } else if (intent == null || intent.getData() == null || intent.getData().getQuery() == null) {
            hav.g("UltronTradeHybridNavProcessor", "process:", "query is null");
            return true;
        } else {
            String query = intent.getData().getQuery();
            if (!query.contains("tradeHybrid=true")) {
                hav.g("UltronTradeHybridNavProcessor", "process:", "unhit tradeHybrid");
                return true;
            }
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "registerWeexModuleOnNav", true)) {
                lbv.l();
            }
            String uri = intent.getData().toString();
            if (query.contains("forceThemis=true")) {
                return interceptTMSContainer(zmjVar, uri, query, intent.getExtras());
            }
            if (enableReuseTradeHybridContainer(zmjVar, query, intent.getData().getPath())) {
                ((UltronTradeHybridActivity) zmjVar.d()).B3(uri);
                return false;
            } else if (!lbv.q(uri) || !UltronTradeHybridSwitcherHelper.r()) {
                intent.setClassName(zmjVar.d(), UltronTradeHybridActivity.class.getName());
                zmjVar.A(true, name());
                if (query.contains("nav_jump_mode=std_mega_pop")) {
                    zmjVar.v(JumpAbility.JUMP_ABILITY_FLOATING_WINDOW);
                }
                onNavDispatch(uri, intent);
                return true;
            } else {
                intent.putExtra(qxq.KEY_FRAGMENT_NAME, UltronTradeHybridDialogFragment.class.getName());
                return true;
            }
        }
    }
}
