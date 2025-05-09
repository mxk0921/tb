package com.taobao.android.purchase.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.purchase.preload.TBBuyPreloadFactory;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import tb.ck;
import tb.f8r;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.tj;
import tb.z1x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBBuyPreRequestJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837577);
    }

    private void doLifecycleHandler(String str, WVCallBackContext wVCallBackContext, boolean z) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6a2993b", new Object[]{this, str, wVCallBackContext, new Boolean(z)});
            return;
        }
        JSONObject a2 = tj.a(str);
        if (a2 != null) {
            str2 = a2.getString("bizCode");
            a2.put("from", (Object) str2);
            a2.put("bizName", (Object) str2);
        } else {
            str2 = null;
        }
        Context context = getContext();
        if (z) {
            str3 = TBBuyPreloadScene.ENTER_PAGE;
        } else {
            str3 = TBBuyPreloadScene.EXIT_PAGE;
        }
        TBBuyPreloadFactory.onStage(context, str3, str2, a2);
        nsw nswVar = new nsw();
        nswVar.k();
        wVCallBackContext.success(nswVar);
    }

    public static /* synthetic */ Object ipc$super(TBBuyPreRequestJSBridge tBBuyPreRequestJSBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/jsbridge/TBBuyPreRequestJSBridge");
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

    private void doPreRequestHandler(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec06d81", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject a2 = tj.a(str);
        if (a2 == null) {
            ck.g().e("TBBuyPreRequestJSBridge doPreRequestHandler jsObj is null");
            wVCallBackContext.error("TBBuyPreRequestJSBridge doPreRequestHandler jsObj is null");
            return;
        }
        String string = a2.getString("url");
        if (TextUtils.isEmpty(string)) {
            ck.g().e("TBBuyPreRequestJSBridge doPreRequestHandler url is null");
            wVCallBackContext.error("TBBuyPreRequestJSBridge doPreRequestHandler url is null");
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse(string));
        onTouchDown(getContext(), intent, !f8r.f(intent));
        nsw nswVar = new nsw();
        nswVar.k();
        wVCallBackContext.success(nswVar);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TBBuyPreloadScene.ENTER_PAGE.equals(str) && AliBuyPerfSwitcher.enableJSBridgePreRequest()) {
            doLifecycleHandler(str2, wVCallBackContext, true);
            return true;
        } else if ((z1x.PRE_REQUEST.equals(str) || "onTouchDown".equals(str)) && AliBuyPerfSwitcher.enableJSBridgePreRequest()) {
            doPreRequestHandler(str2, wVCallBackContext);
            return true;
        } else if (TBBuyPreloadScene.EXIT_PAGE.equals(str)) {
            doLifecycleHandler(str2, wVCallBackContext, false);
            return true;
        } else {
            wVCallBackContext.error("action is null");
            return false;
        }
    }
}
