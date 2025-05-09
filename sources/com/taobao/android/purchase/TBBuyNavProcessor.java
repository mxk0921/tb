package com.taobao.android.purchase;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.android.purchase.preload.TBBuyPreloadFactory;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import java.util.HashMap;
import java.util.Map;
import tb.a8r;
import tb.ck;
import tb.f8r;
import tb.lql;
import tb.n2e;
import tb.nj7;
import tb.qxq;
import tb.t2o;
import tb.v9r;
import tb.xnj;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBBuyNavProcessor implements xnj, n2e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FULL_SCREEN_PURCHASE = "com.taobao.android.purchase.TBPurchaseActivity";
    private static final String HALF_SCREEN_PURCHASE = "com.taobao.android.purchase.aura.TBBuyActivity";
    private static final String NAV_NAME = "TBBuyNavProcessor";
    private static final String PACKAGE_NAME = "com.taobao.taobao";

    static {
        t2o.a(708837426);
        t2o.a(578814049);
        t2o.a(155189357);
    }

    private void appendFullScreenParams(Intent intent, zmj zmjVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57f9fad7", new Object[]{this, intent, zmjVar});
        } else if (a8r.b(zmjVar.d()) && (data = intent.getData()) != null && data.buildUpon() != null) {
            Uri.Builder buildUpon = data.buildUpon();
            buildUpon.appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen");
            intent.setData(buildUpon.build());
        }
    }

    private boolean buyContainerSwitch(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa06c277", new Object[]{this, intent})).booleanValue();
        }
        boolean f = f8r.f(intent);
        if (f || !AliBuyPerfSwitcher.enableAnimPerf()) {
            intent.setComponent(new ComponentName("com.taobao.taobao", HALF_SCREEN_PURCHASE));
        } else {
            intent.setComponent(new ComponentName("com.taobao.taobao", FULL_SCREEN_PURCHASE));
        }
        return !f;
    }

    private boolean enableFragmentPerf(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c0d6718", new Object[]{this, intent, new Boolean(z)})).booleanValue();
        }
        if (!AliBuyPerfSwitcher.enableFragmentPerf() || !z || !"carts".equals(lql.d(intent))) {
            return false;
        }
        return true;
    }

    private void onTouchDown(Context context, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e16fc98", new Object[]{this, context, intent, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, (Object) intent);
        jSONObject.put("fullScreen", (Object) Boolean.valueOf(z));
        jSONObject.put("bizName", (Object) "purchase");
        jSONObject.put("from", (Object) "iCarts");
        TBBuyPreloadFactory.onStage(context, TBBuyPreloadScene.TOUCH_DOWN, "tbBuy", jSONObject);
    }

    private void preload(Context context, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91909ff", new Object[]{this, context, intent, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, (Object) intent);
        jSONObject.put("fullScreen", (Object) Boolean.valueOf(z));
        jSONObject.put("bizName", (Object) "purchase");
        jSONObject.put("from", (Object) TBBuyPreloadScene.NAV);
        TBBuyPreloadFactory.onStage(context, TBBuyPreloadScene.NAV, "tbBuy", jSONObject);
    }

    @Override // tb.n2e
    public Map<String, String> getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (AliBuyPerfSwitcher.enablePrefetch()) {
            hashMap.put("enablePrefetch", "true");
        }
        return hashMap;
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return NAV_NAME;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (!(intent == null || intent.getData() == null)) {
            zmjVar.x("com.taobao.taobao");
            zmjVar.r(HALF_SCREEN_PURCHASE);
            v9r.h();
            v9r.j("buy-start-nav");
            appendFullScreenParams(intent, zmjVar);
            boolean buyContainerSwitch = buyContainerSwitch(intent);
            if (enableFragmentPerf(intent, buyContainerSwitch)) {
                Bundle bundle = new Bundle();
                bundle.putString(qxq.KEY_FRAGMENT_JUMP, "true");
                bundle.putString(qxq.SUB_KEY_FRAGMENT_JUMP, "KEY_MINI_DETAIL_FRAGMENT");
                bundle.putString(qxq.KEY_FRAGMENT_NAME, "com.taobao.android.purchase.TBBuyMainFragment");
                zmjVar.v(JumpAbility.NAV_JUMP_ABILITY_FRAGMENT);
                intent.putExtra(qxq.KEY_FRAGMENT_BUNDLE, bundle);
            }
            preload(zmjVar.d(), intent, buyContainerSwitch);
        }
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.n2e
    public boolean prefetch(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be24fb08", new Object[]{this, activity, bundle})).booleanValue();
        }
        v9r.h();
        boolean z = AliBuyPerfSwitcher.enableTouchDownPerf() && AliBuyPerfSwitcher.enablePrefetch();
        AliBuyPerfSwitcher.updatePerfSwitch("enableTouchDownPerf", z);
        if (!z) {
            return false;
        }
        ck.g().e(TBBuyPreloadScene.TOUCH_DOWN, ck.b.b().i("AURA/performance").d("time", System.currentTimeMillis()).a());
        Intent intent = new Intent();
        intent.putExtras(bundle);
        onTouchDown(activity, intent, buyContainerSwitch(intent));
        return true;
    }

    @Override // tb.n2e
    public boolean process(Activity activity, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6862fb", new Object[]{this, activity, bundle, new Integer(i)})).booleanValue();
        }
        v9r.h();
        v9r.j("buy-start-nav");
        Intent intent = new Intent();
        intent.putExtras(bundle);
        boolean buyContainerSwitch = buyContainerSwitch(intent);
        boolean z = AliBuyPerfSwitcher.enableNavResolve() && !enableFragmentPerf(intent, buyContainerSwitch);
        AliBuyPerfSwitcher.updatePerfSwitch("enableNavResolve", z);
        if (!z) {
            return false;
        }
        ck.g().e("进入TBBuyNavProcessor ", ck.b.b().i("AURA/performance").d("time", System.currentTimeMillis()).a());
        intent.putExtra("NAV_START_ACTIVITY_TIME", System.currentTimeMillis());
        activity.startActivityForResult(intent, i);
        preload(activity, intent, buyContainerSwitch);
        return true;
    }
}
