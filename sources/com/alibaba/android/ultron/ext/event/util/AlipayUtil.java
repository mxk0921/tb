package com.alibaba.android.ultron.ext.event.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.et0;
import tb.t2o;
import tb.xq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AlipayUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY_PAY_RESULT_FAILED_ACTION = "com.alipay.android.app.pay.ACTION_PAY_FAILED";
    public static final String ALIPAY_PAY_RESULT_SUCESS_ACTION = "com.alipay.android.app.pay.ACTION_PAY_SUCCESS";
    public static final String KEY_ALIPAY_BLOCK = "alipayBlock";
    public static final String KEY_FROM = "from";
    public static final String KEY_ORDER_ID = "orderids";
    public static final String KEY_SIGN_STR = "signStr";
    public static final String KEY_SIMPLE_PAY = "simplepay";
    public static final String KEY_SUCCESS_URL = "backURL";
    public static final String KEY_UNSUCCESS_URL = "unSuccessUrl";
    public static final String KEY_WAP_PAY_URL = "alipayURL";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(156237876);
    }

    public static Uri.Builder a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri.Builder) ipChange.ipc$dispatch("afe376d9", new Object[]{map});
        }
        Uri.Builder buildUpon = Uri.parse("http://d.m.taobao.com/goAlipay.htm").buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                buildUpon = buildUpon.appendQueryParameter(key, value);
            }
        }
        return buildUpon;
    }

    public static void b(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed0e8e26", new Object[]{context, map});
            return;
        }
        map.put("result", "1");
        xq0.c().a(context).c(a(map).toString());
    }

    public static void d(Context context, JSONObject jSONObject, a aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a85ff73", new Object[]{context, jSONObject, aVar});
        } else if (!c(context, jSONObject)) {
            String string = jSONObject.getString("from");
            String string2 = jSONObject.getString("orderids");
            String string3 = jSONObject.getString("signStr");
            String string4 = jSONObject.getString("backUrl");
            if (jSONObject.containsKey("simplePay")) {
                str = jSONObject.getString("simplePay");
            } else {
                str = "1";
            }
            String string5 = jSONObject.getString("unSuccessUrl");
            String string6 = jSONObject.getString("alipayURL");
            HashMap hashMap = new HashMap();
            hashMap.put("from", string);
            hashMap.put("orderids", string2);
            hashMap.put("signStr", string3);
            hashMap.put("simplepay", str);
            hashMap.put("backURL", string4);
            hashMap.put("unSuccessUrl", string5);
            hashMap.put("alipayURL", string6);
            if (aVar != null) {
                hashMap.put(KEY_ALIPAY_BLOCK, "true");
                e(context, aVar);
            }
            b(context, hashMap);
        }
    }

    public static void e(Context context, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13385c9d", new Object[]{context, aVar});
            return;
        }
        final LocalBroadcastManager instance = LocalBroadcastManager.getInstance(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
        instance.registerReceiver(new BroadcastReceiver() { // from class: com.alibaba.android.ultron.ext.event.util.AlipayUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/util/AlipayUtil$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                if (intent.getAction().equals("com.alipay.android.app.pay.ACTION_PAY_SUCCESS")) {
                    ((et0.a) a.this).b(context2, intent);
                }
                if (intent.getAction().equals("com.alipay.android.app.pay.ACTION_PAY_FAILED")) {
                    ((et0.a) a.this).a(context2, intent);
                }
                instance.unregisterReceiver(this);
            }
        }, intentFilter);
    }

    public static boolean c(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("664ff758", new Object[]{context, jSONObject})).booleanValue();
        }
        if (!(jSONObject == null || context == null)) {
            String string = jSONObject.getString("overrideUrl");
            if (!TextUtils.isEmpty(string)) {
                Bundle bundle = new Bundle();
                for (String str : jSONObject.keySet()) {
                    bundle.putString(str, jSONObject.getString(str));
                }
                xq0.c().a(context).d(bundle).c(string);
                return true;
            }
        }
        return false;
    }
}
