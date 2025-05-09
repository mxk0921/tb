package com.alipay.mobile.verifyidentity.module.internal.password.pay;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PubKeyHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getPubKey(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b118cb7", new Object[]{context});
        }
        VerifyLogCat.i("PubKeyHelper", "获取本地或公钥");
        return PreferenceManager.getDefaultSharedPreferences(context).getString("VI_SP_LOCAL_PUB_KEY", "");
    }

    public static String updateLocalPubKey(Context context, MICRpcResponse mICRpcResponse) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab8d08df", new Object[]{context, mICRpcResponse});
        }
        if (mICRpcResponse == null) {
            return "";
        }
        try {
            jSONObject = JSON.parseObject(mICRpcResponse.data);
        } catch (JSONException e) {
            VerifyLogCat.e("PubKeyHelper", "json fail " + mICRpcResponse.data, e);
            jSONObject = null;
        }
        if (jSONObject == null || TextUtils.isEmpty(jSONObject.getString("pubKey"))) {
            return "";
        }
        String string = jSONObject.getString("pubKey");
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("VI_SP_LOCAL_PUB_KEY", string).commit();
        VerifyLogCat.i("PubKeyHelper", "更新本地公钥为：" + string);
        return string;
    }
}
