package com.taobao.android.tbsku.channel;

import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kpw;
import tb.n4v;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuBizWvPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "SkuCenter";
    public static final String SKU_SET_DATA = "sku_set_data";
    public static final String SKU_UPDATE_DATA = "sku_update_data";

    static {
        t2o.a(785383483);
    }

    private boolean dealWithSubPageSetData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e928bc1", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            boolean sendSetDataBroadCast = sendSetDataBroadCast(JSON.parseObject(str));
            if (sendSetDataBroadCast) {
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(new nsw("HY_SUCCESS"));
                }
            } else if (wVCallBackContext != null) {
                wVCallBackContext.error(new nsw("HY_FAILED"));
            }
            return sendSetDataBroadCast;
        } catch (Throwable unused) {
            if (wVCallBackContext != null) {
                wVCallBackContext.error(new nsw("HY_FAILED"));
            }
            return false;
        }
    }

    private boolean dealWithSubPageUpdateData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabf3482", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            boolean sendUpdateBroadcast = sendUpdateBroadcast(JSON.parseObject(str));
            if (sendUpdateBroadcast) {
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(new nsw("HY_SUCCESS"));
                }
            } else if (wVCallBackContext != null) {
                wVCallBackContext.error(new nsw("HY_FAILED"));
            }
            return sendUpdateBroadcast;
        } catch (Throwable unused) {
            if (wVCallBackContext != null) {
                wVCallBackContext.error(new nsw("HY_FAILED"));
            }
            return false;
        }
    }

    public static /* synthetic */ Object ipc$super(SkuBizWvPlugin skuBizWvPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/channel/SkuBizWvPlugin");
    }

    private JSONObject skuTokenFix(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c7696a70", new Object[]{this, jSONObject});
        }
        if (!(jSONObject == null || (string = jSONObject.getString("sku_token")) == null)) {
            jSONObject.put("skuToken", (Object) string);
            jSONObject.remove("sku_token");
        }
        return jSONObject;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("params", str2);
            hashMap.put("codePath", "SkuBizWvPlugin_execute");
            n4v.b(19999, "Sku_Code_Track", hashMap);
        }
        if (SKU_SET_DATA.equals(str)) {
            return dealWithSubPageSetData(str2, wVCallBackContext);
        }
        if (SKU_UPDATE_DATA.equals(str)) {
            return dealWithSubPageUpdateData(str2, wVCallBackContext);
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error(new nsw("HY_FAILED"));
        }
        return false;
    }

    private boolean sendSetDataBroadCast(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd35d2b0", new Object[]{this, jSONObject})).booleanValue();
        }
        if (this.mContext == null || jSONObject == null || jSONObject.isEmpty() || TextUtils.isEmpty(jSONObject.getString("sku_token")) || TextUtils.isEmpty(jSONObject.getString("action"))) {
            return false;
        }
        JSONObject skuTokenFix = skuTokenFix(jSONObject);
        Intent intent = new Intent();
        intent.setAction("com.taobao.sku.intent.action.transferData");
        intent.putExtra("stringifyData", skuTokenFix.toJSONString());
        intent.addCategory("android.intent.category.DEFAULT");
        this.mContext.sendBroadcast(intent);
        return true;
    }

    private boolean sendUpdateBroadcast(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a21cabfd", new Object[]{this, jSONObject})).booleanValue();
        }
        if (this.mContext == null || jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("sku_token");
        JSONObject jSONObject2 = jSONObject.getJSONObject("params");
        if (TextUtils.isEmpty(string) || jSONObject2 == null || jSONObject2.isEmpty()) {
            return false;
        }
        skuTokenFix(jSONObject);
        Intent intent = new Intent();
        intent.setAction("com.taobao.sku.intent.action.updateData");
        intent.putExtra("originalItemId", jSONObject2.getString("originalItemId"));
        intent.putExtra("targetItemId", jSONObject2.getString("targetItemId"));
        intent.putExtra("skuToken", string);
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
        return true;
    }
}
