package com.taobao.tao.content.business;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.gat;
import tb.jh4;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WVBusinessSDKBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(701497365);
    }

    public static /* synthetic */ Object ipc$super(WVBusinessSDKBridge wVBusinessSDKBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/content/business/WVBusinessSDKBridge");
    }

    private void doMyHandler(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d30b741", new Object[]{this, str, wVCallBackContext});
        } else if (jh4.e()) {
            wVCallBackContext.error();
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
                if (jSONObject.has(gat.ACCOUNT_ID)) {
                    contentBusinessModel.adUserId = jSONObject.getString(gat.ACCOUNT_ID);
                }
                if (jSONObject.has("contentId")) {
                    contentBusinessModel.contentId = jSONObject.getString("contentId");
                }
                if (jSONObject.has(gat.BIZ_TYPE)) {
                    contentBusinessModel.scenceId = jSONObject.getString(gat.BIZ_TYPE);
                }
                if (jSONObject.has("pageName")) {
                    contentBusinessModel.pageName = jSONObject.getString("pageName");
                }
                if (jSONObject.has(gat.TCP_BID)) {
                    contentBusinessModel.tcpBid = jSONObject.getString(gat.TCP_BID);
                }
                if (jSONObject.has(gat.CT)) {
                    contentBusinessModel.ct = jSONObject.getString(gat.CT);
                }
                if (jSONObject.has("sellerId")) {
                    contentBusinessModel.sId = jSONObject.getString("sellerId");
                }
                if (jSONObject.has("itemId")) {
                    contentBusinessModel.itemId = jSONObject.getString("itemId");
                }
                if (jSONObject.has("sourceType")) {
                    String string = jSONObject.getString("sourceType");
                    if (!TextUtils.isEmpty(string)) {
                        contentBusinessModel.sourceType = string;
                    }
                }
                if (jh4.a()) {
                    if (jSONObject.has("actionSource")) {
                        String string2 = jSONObject.getString("actionSource");
                        if (!TextUtils.isEmpty(string2)) {
                            contentBusinessModel.actionSource = string2;
                        }
                    }
                    if (jSONObject.has("trackSource")) {
                        String string3 = jSONObject.getString("trackSource");
                        if (!TextUtils.isEmpty(string3)) {
                            contentBusinessModel.trackSource = string3;
                        }
                    }
                    if (jSONObject.has("trackSubSource")) {
                        String string4 = jSONObject.getString("trackSubSource");
                        if (!TextUtils.isEmpty(string4)) {
                            contentBusinessModel.trackSubSource = string4;
                        }
                    }
                }
                if (jSONObject.has("context")) {
                    String string5 = jSONObject.getString("context");
                    if (!TextUtils.isEmpty(string5)) {
                        contentBusinessModel.context = new JSONObject(string5);
                    }
                }
                new gat().e(contentBusinessModel, null);
                wVCallBackContext.success();
            } catch (Exception e) {
                e.printStackTrace();
                wVCallBackContext.error();
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"request".equals(str)) {
            return false;
        }
        doMyHandler(str2, wVCallBackContext);
        return true;
    }
}
