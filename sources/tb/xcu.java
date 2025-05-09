package tb;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSONObject;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.model.AddressInfo;
import com.taobao.android.address.model.RecommendedAddress;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.login4android.api.Login;
import com.ut.mini.UTAnalytics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xcu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(442499296);
    }

    public static String a(Context context) {
        APSecuritySdk instance;
        APSecuritySdk.TokenResult tokenResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("684513e", new Object[]{context});
        }
        if (context == null || (instance = APSecuritySdk.getInstance(context.getApplicationContext())) == null || (tokenResult = instance.getTokenResult()) == null) {
            return "";
        }
        return e(tokenResult.apdidToken, "");
    }

    public static String b(Context context) {
        PositionInfo i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd0aec4c", new Object[]{context});
        }
        if (context == null || (i = o78.i(context)) == null) {
            return "";
        }
        return e(i.countryCode, "");
    }

    public static String c(Context context) {
        AddressInfo addressInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("571d80b4", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DispatchConstants.LONGTITUDE, (Object) "");
        jSONObject.put(DispatchConstants.LATITUDE, (Object) "");
        jSONObject.put("provinceDivisionCode", (Object) "");
        jSONObject.put("cityDivisionCode", (Object) "");
        jSONObject.put("areaDivisionCode", (Object) "");
        jSONObject.put("townDivisionCode", (Object) "");
        if (context == null) {
            return jSONObject.toJSONString();
        }
        RecommendedAddress f = mf0.f(context, "tb_purchase");
        if (!(f == null || (addressInfo = f.recommendedAddress) == null)) {
            jSONObject.put(DispatchConstants.LONGTITUDE, (Object) e(addressInfo.lng, ""));
            jSONObject.put(DispatchConstants.LATITUDE, (Object) e(f.recommendedAddress.lat, ""));
            jSONObject.put("provinceDivisionCode", (Object) e(f.recommendedAddress.provinceDivisionCode, ""));
            jSONObject.put("cityDivisionCode", (Object) e(f.recommendedAddress.cityDivisionCode, ""));
            jSONObject.put("areaDivisionCode", (Object) e(f.recommendedAddress.areaDivisionCode, ""));
            jSONObject.put("townDivisionCode", (Object) e(f.recommendedAddress.townDivisionCode, ""));
        }
        return jSONObject.toJSONString();
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42d5c137", new Object[]{context});
        }
        return e(Login.getSid(), "");
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("391a356f", new Object[]{str, str2});
        }
        if (str == null) {
            return str2;
        }
        return str;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49ca4a6d", new Object[0]);
        }
        try {
            String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
            if (TextUtils.isEmpty(globalProperty)) {
                return "";
            }
            String[] split = globalProperty.split(c0c.UNESCAPED_SEPARATOR);
            if (split.length < 4) {
                return "";
            }
            String str = split[2];
            if (str.length() <= 50) {
                return str;
            }
            return "";
        } catch (Throwable th) {
            SkuLogUtils.i("getWeChatShareIdentifier: " + th.toString());
            return "";
        }
    }

    public static String g(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e73c1bc", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        try {
            try {
                return e(context.getResources().getConfiguration().locale.toString(), "");
            } catch (Throwable unused) {
                return str;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }
}
