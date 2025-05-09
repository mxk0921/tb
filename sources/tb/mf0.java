package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.AddressSDKDelegate;
import com.taobao.android.address.model.RecommendedAddress;
import com.taobao.android.nav.Nav;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mf0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_GLOBAL_RECOMMEND_ADDRESS = 2001;

    /* renamed from: a  reason: collision with root package name */
    public static AddressSDKDelegate f24006a;
    public static ef0 b;
    public static String c;

    public static void a(Context context, String str, String str2, String str3, boolean z, String str4, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3dce155", new Object[]{context, str, str2, str3, new Boolean(z), str4, ef0Var});
            return;
        }
        h(context);
        f24006a.k(context, str, str2, str3, z, str4, ef0Var);
    }

    public static void b(Context context, String str, String str2, boolean z, String str3, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9234a99f", new Object[]{context, str, str2, new Boolean(z), str3, ef0Var});
            return;
        }
        h(context);
        f24006a.k(context, str, str2, "nativeInvoke", z, str3, ef0Var);
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3ea7e5", new Object[]{context});
            return;
        }
        h(context);
        f24006a.l();
    }

    public static String d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b37221c2", new Object[]{context, str});
        }
        return e(context, str, null);
    }

    public static String e(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("117040b8", new Object[]{context, str, str2});
        }
        h(context);
        return f24006a.m(str);
    }

    public static RecommendedAddress f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendedAddress) ipChange.ipc$dispatch("31daaf9e", new Object[]{context, str});
        }
        return g(context, str, null);
    }

    public static RecommendedAddress g(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendedAddress) ipChange.ipc$dispatch("e88dcde8", new Object[]{context, str, str2});
        }
        h(context);
        return f24006a.o(str);
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943ea86", new Object[]{context});
        } else if (f24006a == null) {
            f24006a = new AddressSDKDelegate(context);
        }
    }

    public static void i(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81841d39", new Object[]{new Integer(i), new Integer(i2), intent});
        } else if (i2 == -1) {
            if (intent != null) {
                AddressSDKDelegate addressSDKDelegate = f24006a;
                if (addressSDKDelegate != null) {
                    addressSDKDelegate.w(intent.getStringExtra("bizIdentity"), intent.getStringExtra("type"), intent.getStringExtra("data"));
                }
                ef0 ef0Var = b;
                if (ef0Var != null) {
                    ef0Var.onSuccess(intent.getStringExtra("data"));
                }
            } else if (!TextUtils.isEmpty(c)) {
                try {
                    JSONObject jSONObject = new JSONObject(c);
                    AddressSDKDelegate addressSDKDelegate2 = f24006a;
                    if (addressSDKDelegate2 != null) {
                        addressSDKDelegate2.w(jSONObject.optString("bizIdentity"), jSONObject.optString("type"), jSONObject.optString("data"));
                    }
                    ef0 ef0Var2 = b;
                    if (ef0Var2 != null) {
                        ef0Var2.onSuccess(jSONObject.optString("data"));
                    }
                    c = "";
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } else if (i2 == 0) {
            ef0 ef0Var3 = b;
            if (ef0Var3 != null) {
                ef0Var3.onFail(-1, "cancel");
            }
        } else {
            ef0 ef0Var4 = b;
            if (ef0Var4 != null) {
                ef0Var4.onFail(-2, "");
            }
        }
    }

    public static void j(Context context, String str, String str2, String str3, String str4, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b77d5e", new Object[]{context, str, str2, str3, str4, ef0Var});
            return;
        }
        b = ef0Var;
        h(context);
        Nav.from(context).forResult(2001).toUri(kf0.a(context, "http://my.m.taobao.com/deliver/switch_address.htm?bizIdentity=" + str + "&bizScene=" + str3 + "&channel=" + str2));
    }

    public static void k(Context context, String str, String str2, String str3, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191a8694", new Object[]{context, str, str2, str3, ef0Var});
        } else {
            j(context, str, str2, str3, null, ef0Var);
        }
    }

    public static void l(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae2d6a9", new Object[]{context, str, str2, str3});
        } else {
            m(context, str, str2, str3, null);
        }
    }

    public static void m(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c590833", new Object[]{context, str, str2, str3, str4});
            return;
        }
        h(context);
        f24006a.B(context, str, str2, str3, str4, null);
    }

    public static void n(Context context, String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31cc7bca", new Object[]{context, str, str2, new Boolean(z), str3});
            return;
        }
        h(context);
        f24006a.E(str, str2, z, str3);
    }

    public static void o(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1241ae42", new Object[]{context, str, str2});
            return;
        }
        h(context);
        f24006a.G(context, str, str2);
    }
}
