package com.alipay.mobile.verifyidentity.module.password.pay;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PubKeyHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String generatePubKey(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("595d734c", new Object[]{context, str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return getPubKey(context);
            }
            return str;
        } catch (Exception e) {
            VerifyLogCat.e("PubKeyHelper", e);
            return null;
        }
    }

    public static String getPubKey(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b118cb7", new Object[]{context});
        }
        VerifyLogCat.i("PubKeyHelper", "获取本地或公钥");
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("VI_SP_LOCAL_PUB_KEY", "");
        if (TextUtils.isEmpty(string)) {
            VerifyLogCat.i("PubKeyHelper", "本地没有公钥，用内置的");
            String envType = MicroModuleContext.getInstance().getEnvType();
            VerifyLogCat.i("PubKeyHelper", "pub_key_env：" + envType);
            if (TextUtils.isEmpty(envType) || "ONLINE".equalsIgnoreCase(envType)) {
                VerifyLogCat.i("PubKeyHelper", "用内置线上公钥");
                return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAo0z/L+pelCPu6DwDFAY/3ITzesr8lnNmYjHht4XUJvLYYBwvDbHMc8xi9sPK9ohVHIKRVLVmmZ9SdmuWYN9HzCyyZ6kEHx+IDBPnulwjdeN/N0w25mVRhYDWxJ2/1C6cPIuNcISchOQdGKuAC0xR37i/kWH9sjBidAQjageYgQoj1HX81flZaPve75Esue85AHZ0VIurjwx7uEuxvQtvCIUvX1bbF13TIYuTbJbn/LrNHby1Kxp42ggNUjAkYUVSF7SC3UP+YGKruii7Vh1UnJ/rpVhjdt3It8le9px8H4Ltt9N3hzU17rBnFpp2ZnmiZVtlfMvsStY54Fl5cSJVxQIDAQAB";
            }
            VerifyLogCat.i("PubKeyHelper", "用内置线下公钥");
            return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzPzx6ZjT2GWairxEJltpqtOB3FHRTqOCgOlQxAokUR3jN6mG3wizGMtZ5q0TNJwsHFwAcyQhcXdThJl9B6tDVOFTSTmERPHWZPXGNYrtpKGIP3u/QDXMVnMYCeP4ecZBWdwUDyzd3zHMo1Hm53/xzqOoaPfJEgS0uwBKTth3qtFenOFpUt3Y8X9fbMiGsbVWVwC55fsMDUt3husMXumHH4DpYBPgjHr7SkBA/ob1Q5L65ZBkdZ0M4CqWqgmCjic61pHJgPv8fhun2QGAwKs05eWOuIZ2EiRAj7YvguzZAdVQGTE/fvZtQMDmKJGrh5zjsrEPt3zQ236IbhfbUHXmoQIDAQAB";
        }
        VerifyLogCat.i("PubKeyHelper", "获取到本地公钥：" + string);
        return string;
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
