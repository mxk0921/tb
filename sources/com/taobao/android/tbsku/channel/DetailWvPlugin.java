package com.taobao.android.tbsku.channel;

import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import tb.kpw;
import tb.nsw;
import tb.q2q;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DetailWvPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_KEY_ORIGIN_PARAMS_DATA = "originParamsData";
    public static final String NAME = "DetailCenter";
    private static final String UPDATE_DETAIL = "update_detail";

    static {
        t2o.a(785383479);
    }

    private boolean dealwithDetailUpdate(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dabe91e", new Object[]{this, str, wVCallBackContext})).booleanValue();
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

    public static /* synthetic */ Object ipc$super(DetailWvPlugin detailWvPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/channel/DetailWvPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("update_detail".equals(str)) {
            return dealwithDetailUpdate(str2, wVCallBackContext);
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error(new nsw("HY_FAILED"));
        }
        return false;
    }

    private boolean sendUpdateBroadcast(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a21cabfd", new Object[]{this, jSONObject})).booleanValue();
        }
        if (this.mContext == null || jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("from");
        if (TextUtils.isEmpty(string)) {
            SkuLogUtils.i("class:DetailWvPlugin### method:sendUpdateBroadcast from is null");
        }
        String string2 = jSONObject.getString("token");
        String string3 = jSONObject.getString(q2q.KEY_AREA_ID);
        String string4 = jSONObject.getString("addressId");
        String string5 = jSONObject.getString("originalItemId");
        String string6 = jSONObject.getString("targetItemId");
        Object obj = jSONObject.get("params");
        if (TextUtils.isEmpty(string2)) {
            SkuLogUtils.j("DetailWvPlugin", "执行update_detail失败，token为空，业务来源：" + string);
            return false;
        } else if (TextUtils.isEmpty(string5)) {
            SkuLogUtils.j("DetailWvPlugin", "执行update_detail失败，originalItemId为空，业务来源：" + string);
            return false;
        } else if (TextUtils.isEmpty(string6)) {
            SkuLogUtils.j("DetailWvPlugin", "执行update_detail失败，targetItemId为空，业务来源：" + string);
            return false;
        } else {
            Intent intent = new Intent();
            intent.setAction("com.taobao.sku.intent.action.updateData");
            intent.putExtra("originalItemId", string5);
            intent.putExtra("skuToken", string2);
            intent.putExtra("targetItemId", string6);
            intent.putExtra(q2q.KEY_AREA_ID, string3);
            intent.putExtra("addressId", string4);
            if (obj != null) {
                str = obj.toString();
            } else {
                str = "";
            }
            intent.putExtra("params", str);
            intent.putExtra(EXTRA_KEY_ORIGIN_PARAMS_DATA, jSONObject);
            intent.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
            return true;
        }
    }
}
