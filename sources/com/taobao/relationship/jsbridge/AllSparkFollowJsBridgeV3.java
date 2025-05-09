package com.taobao.relationship.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.relationship.mtop.isfollow.a;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import org.json.JSONObject;
import tb.au9;
import tb.kpw;
import tb.rt9;
import tb.s0m;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AllSparkFollowJsBridgeV3 extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ADDFLLOW = "addFollowByParams";
    private static final String ACTION_ISFOLLOW = "hasFollowedByParams";
    private static final String ACTION_LOADIMG = "loadGuideImgsByParams";
    private static final String ACTION_REMOVEFOLLOW = "removeFollowByParams";
    public static final String PAGE = "TBWeitaoFollowServiceJSBridgeV3";

    static {
        t2o.a(759169037);
    }

    private String getUTArgs(long j, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3ceb8b7", new Object[]{this, new Long(j), str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("account_id=" + j);
        sb.append(",Origin=" + str);
        sb.append(",Page=" + str2);
        sb.append(",Extend=" + str3);
        return sb.toString();
    }

    public static /* synthetic */ Object ipc$super(AllSparkFollowJsBridgeV3 allSparkFollowJsBridgeV3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/relationship/jsbridge/AllSparkFollowJsBridgeV3");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (ACTION_LOADIMG.equals(str)) {
                String optString = jSONObject.optString("guideToastUrl");
                String optString2 = jSONObject.optString("guideCardUrl");
                if (au9.g()) {
                    if (!TextUtils.isEmpty(optString)) {
                        s0m.B().T(optString);
                    }
                    if (!TextUtils.isEmpty(optString2)) {
                        s0m.B().T(optString2);
                    }
                }
                wVCallBackContext.success();
                return true;
            }
            if (!TextUtils.isEmpty(jSONObject.optString("accountId"))) {
                j = Long.parseLong(jSONObject.optString("accountId"));
            } else {
                j = !TextUtils.isEmpty(jSONObject.optString("followedId")) ? Long.parseLong(jSONObject.optString("followedId")) : 0L;
            }
            int parseInt = !TextUtils.isEmpty(jSONObject.optString("accountType")) ? Integer.parseInt(jSONObject.optString("accountType")) : 0;
            String optString3 = jSONObject.optString("originBiz");
            String optString4 = jSONObject.optString("originPage");
            String optString5 = jSONObject.optString("originFlag");
            String optString6 = jSONObject.optString("extra");
            int optInt = jSONObject.optInt("type", 1);
            int optInt2 = jSONObject.optInt("option", 1);
            rt9 rt9Var = new rt9();
            rt9Var.b = j;
            rt9Var.c = parseInt;
            rt9Var.f = optString3;
            rt9Var.g = optString4;
            rt9Var.h = optString5;
            rt9Var.d = optInt;
            rt9Var.e = optInt2;
            rt9Var.i = optString6;
            rt9Var.j = !TextUtils.equals(jSONObject.optString(LoginConstants.SHOW_TOAST), "false");
            if (ACTION_ISFOLLOW.equals(str)) {
                new a(wVCallBackContext).d(rt9Var);
                return true;
            } else if (ACTION_ADDFLLOW.equals(str)) {
                String optString7 = jSONObject.optString("showAnimation");
                Context context = this.mContext;
                rt9Var.f27593a = context instanceof Activity ? (Activity) context : null;
                if (TextUtils.equals(optString7, "true")) {
                    jSONObject.optString("guideToastUrl");
                    jSONObject.optString("guideCardUrl");
                    new com.taobao.relationship.mtop.addfollow.a(wVCallBackContext).c(rt9Var);
                } else {
                    new com.taobao.relationship.mtop.addfollow.a(wVCallBackContext).c(rt9Var);
                }
                TBS.Adv.ctrlClicked("Page_AttentionWeiTao", CT.Button, "Attention", getUTArgs(j, optString3, optString4, optString5));
                return true;
            } else if (!ACTION_REMOVEFOLLOW.equals(str)) {
                return false;
            } else {
                new com.taobao.relationship.mtop.removefollow.a(wVCallBackContext).c(rt9Var);
                TBS.Adv.ctrlClicked("Page_AttentionWeiTao", CT.Button, "CancelAttention", getUTArgs(j, optString3, optString4, optString5));
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
