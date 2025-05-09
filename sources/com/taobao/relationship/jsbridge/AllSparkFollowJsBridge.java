package com.taobao.relationship.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.TriggerChannelService;
import com.taobao.relationship.mtop.isfollow.a;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import mtopsdk.common.util.SymbolExpUtil;
import org.json.JSONObject;
import tb.au9;
import tb.kpw;
import tb.rt9;
import tb.s0m;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AllSparkFollowJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ADDFLLOW = "addFollowByParams";
    private static final String ACTION_ISFOLLOW = "hasFollowedByParams";
    private static final String ACTION_LOADIMG = "loadGuideImgsByParams";
    private static final String ACTION_REMOVEFOLLOW = "removeFollowByParams";
    public static final String PAGE = "TBWeitaoFollowServiceJSBridge";

    static {
        t2o.a(759169036);
    }

    public static /* synthetic */ Object ipc$super(AllSparkFollowJsBridge allSparkFollowJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/relationship/jsbridge/AllSparkFollowJsBridge");
    }

    private String getUTArgs(long j, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29da801e", new Object[]{this, new Long(j), new Integer(i), str});
        }
        if (j == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("account_id=" + j);
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!str.contains("|")) {
                    return sb.toString();
                }
                String[] split = str.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                if (split != null && split.length >= 2) {
                    if (!TextUtils.isEmpty(split[0])) {
                        sb.append(",Origin=" + split[0]);
                    }
                    if (!TextUtils.isEmpty(split[1])) {
                        sb.append(",Page=" + split[1]);
                    }
                    if (split.length >= 3 && !TextUtils.isEmpty(split[2])) {
                        sb.append(",Extend=" + split[2]);
                    }
                }
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return sb.toString();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        long j;
        String str3;
        String[] split;
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
            String optString7 = jSONObject.optString(TriggerChannelService.EXTRA_ORIGIN);
            if (TextUtils.isEmpty(optString7) || (split = optString7.split(SymbolExpUtil.SYMBOL_VERTICALBAR)) == null) {
                str3 = optString3;
            } else {
                str3 = optString3;
                if (split.length >= 2) {
                    str3 = !TextUtils.isEmpty(split[0]) ? split[0] : str3;
                    if (!TextUtils.isEmpty(split[1])) {
                        optString4 = split[1];
                    }
                    if (split.length >= 3 && !TextUtils.isEmpty(split[2])) {
                        optString5 = split[2];
                    }
                }
            }
            int optInt = jSONObject.optInt("type", 1);
            int optInt2 = jSONObject.optInt("option", 1);
            rt9 rt9Var = new rt9();
            rt9Var.b = j;
            rt9Var.c = parseInt;
            rt9Var.f = str3;
            rt9Var.g = optString4;
            rt9Var.h = optString5;
            rt9Var.d = optInt;
            rt9Var.e = optInt2;
            rt9Var.i = optString6;
            if (ACTION_ISFOLLOW.equals(str)) {
                new a(wVCallBackContext).d(rt9Var);
                return true;
            } else if (ACTION_ADDFLLOW.equals(str)) {
                String optString8 = jSONObject.optString("showAnimation");
                Context context = this.mContext;
                rt9Var.f27593a = context instanceof Activity ? (Activity) context : null;
                if (TextUtils.equals(optString8, "true")) {
                    jSONObject.optString("guideToastUrl");
                    jSONObject.optString("guideCardUrl");
                    new com.taobao.relationship.mtop.addfollow.a(wVCallBackContext).c(rt9Var);
                } else {
                    new com.taobao.relationship.mtop.addfollow.a(wVCallBackContext).c(rt9Var);
                }
                TBS.Adv.ctrlClicked("Page_AttentionWeiTao", CT.Button, "Attention", getUTArgs(j, parseInt, optString7));
                return true;
            } else if (!ACTION_REMOVEFOLLOW.equals(str)) {
                return false;
            } else {
                new com.taobao.relationship.mtop.removefollow.a(wVCallBackContext).c(rt9Var);
                TBS.Adv.ctrlClicked("Page_AttentionWeiTao", CT.Button, "CancelAttention", getUTArgs(j, parseInt, optString7));
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
