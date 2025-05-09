package com.taobao.live.home.h5container;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.iw0;
import tb.kpw;
import tb.nsw;
import tb.qyg;
import tb.roa;
import tb.t2o;
import tb.tbc;
import tb.uxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBLiveHomePlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String entryPageUrl;

    static {
        t2o.a(806355489);
    }

    public static /* synthetic */ Object ipc$super(TBLiveHomePlugin tBLiveHomePlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/h5container/TBLiveHomePlugin");
    }

    public static String getStringArray(Context context) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca4b9b1", new Object[]{context});
        }
        if (context == null || (split = context.getApplicationContext().getSharedPreferences("tblivesearch", 0).getString("tblivesearch-history", "").split(",")) == null || split.length <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i])) {
                jSONArray.add(split[i]);
            }
        }
        return jSONArray.toJSONString();
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONArray jSONArray;
        DinamicXEngine f;
        DinamicXEngine f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getBottomTabBarHeight".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("height", (int) (((iw0.a(this.mContext, 49.0f) * 1.0f) / iw0.h(this.mContext)) * 750.0f));
                jSONObject.put("markingTabHeight", (int) (((iw0.a(this.mContext, 64.0f) * 1.0f) / iw0.h(this.mContext)) * 750.0f));
                wVCallBackContext.success(jSONObject.toString());
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
                wVCallBackContext.error();
                return false;
            }
        } else if ("fetchBottomRightEntryLocation".equals(str)) {
            nsw nswVar = new nsw();
            Context context = this.mContext;
            if (!(!(context instanceof tbc) || (f2 = ((tbc) context).f()) == null || f2.H() == null || f2.H().p() == null || f2.H().p().e() == null)) {
                com.alibaba.fastjson.JSONObject e2 = f2.H().p().e();
                nswVar.a("bottomRightEntryX", e2.get("bottomRightEntryX"));
                nswVar.a("bottomRightEntryY", e2.get("bottomRightEntryY"));
            }
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("getPageInfo".equals(str)) {
            nsw nswVar2 = new nsw();
            nswVar2.b("pageUrl", entryPageUrl);
            wVCallBackContext.success(nswVar2);
            return true;
        } else if ("fetchInvokedTabInfo".equals(str)) {
            nsw nswVar3 = new nsw();
            Object a2 = roa.a(this.mWebView);
            if (a2 instanceof uxd) {
                HashMap hashMap = (HashMap) ((uxd) a2).i();
                if ("Native".equals((String) hashMap.get("h5ContainerRenderType"))) {
                    nswVar3.a("tabData", hashMap.get("tabBottom"));
                    nswVar3.a("appear", hashMap.get("appear"));
                }
            }
            wVCallBackContext.success(nswVar3);
            return true;
        } else if ("fetchDXEngineInfo".equals(str)) {
            nsw nswVar4 = new nsw();
            try {
                jSONArray = JSON.parseArray(str2);
            } catch (Exception unused) {
                jSONArray = null;
            }
            if (!(!(this.mContext instanceof tbc) || jSONArray == null || jSONArray.size() <= 0 || (f = ((tbc) this.mContext).f()) == null || f.H() == null || f.H().p() == null || f.H().p().e() == null)) {
                com.alibaba.fastjson.JSONObject e3 = f.H().p().e();
                for (int i = 0; i < jSONArray.size(); i++) {
                    nswVar4.a(jSONArray.getString(i), e3.get(jSONArray.getString(i)));
                }
            }
            wVCallBackContext.success(nswVar4);
            return true;
        } else if ("goToHome".equals(str)) {
            qyg.c().e("com.taobao.taolive.home.go.to.home", str2);
            wVCallBackContext.success();
            return true;
        } else if ("back".equals(str)) {
            qyg.c().e("com.taobao.taolive.home.back", str2);
            wVCallBackContext.success();
            return true;
        } else if ("getSafeArea".equals(str)) {
            nsw nswVar5 = new nsw();
            Object a3 = roa.a(this.mWebView);
            if (a3 instanceof uxd) {
                HashMap hashMap2 = (HashMap) ((uxd) a3).i();
                if ("Native".equals((String) hashMap2.get("h5ContainerRenderType"))) {
                    nswVar5.a("statusBarHeight", hashMap2.get("statusBarHeight"));
                    nswVar5.a("navBarHeight", hashMap2.get("navBarHeight"));
                    nswVar5.a("bottomBarHeight", hashMap2.get("bottomBarHeight"));
                }
            }
            wVCallBackContext.success(nswVar5);
            return true;
        } else if (!"fetchSearchHistory".equals(str)) {
            return false;
        } else {
            String stringArray = getStringArray(this.mContext);
            nsw nswVar6 = new nsw();
            if (stringArray != null) {
                nswVar6.b("historySource", stringArray);
            }
            wVCallBackContext.success(nswVar6);
            return true;
        }
    }
}
