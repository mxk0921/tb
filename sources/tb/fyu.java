package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.huawei.nfc.sdk.service.c;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.unionpay.UPPayWapActivity;
import com.unionpay.utils.UPUtils;
import com.unionpay.utils.a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fyu {
    public static final String SDK_TYPE = "02";
    public static final String VERSION = "3.5.15";

    /* renamed from: a  reason: collision with root package name */
    public static String f19639a = null;
    public static String b = null;
    public static String c = null;
    public static String d = null;
    public static String e = "";
    public static String f = "";
    public static String g = "";
    public static String h = "";
    public static boolean i = false;
    public static WeakReference j = null;
    public static String k = "";
    public static String l = null;
    public static String m = null;
    public static String n = "";
    public static int o = 0;
    public static boolean p = false;
    public static boolean q = false;
    public static x3y r = null;
    public static Handler s = null;
    public static String t = "[{\"package_info\":[{\"schema\":\"com.unionpay\",\"sign\":\"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\":101,\"version\":\".*\"}],\"sort\":100,\"type\":\"app\"}]";
    public static String u = "[{\"package_info\": [{\"schema\": \"com.unionpay.tsmservice\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 102,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[2-9].*|^01\\\\.00\\\\.1[012789].*|^01\\\\.00\\\\.0[8-9].*\"},{\"schema\": \"com.unionpay.tsmservice.mi\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 103,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[1-9].*|^01\\\\.00\\\\.0[8-9].*\"}],\"sort\": 100,\"type\": \"app\"}]";
    public static String v = "[{\"package_info\": [{\"schema\": \"com.huawei.wallet\",\"sign\": \"9095F915D6C143A41CE029209AFECB87AB481DDD\",\"sort\": 101,\"version\": \"([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\"},{\"schema\": \"com.huawei.wallet\",\"sign\": \"059e2480adf8c1c5b3d9ec007645ccfc442a23c5\",\"sort\": 102,\"version\": \"([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\"},{\"schema\": \"com.unionpay.tsmservice\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 103,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[2-9].*|^01\\\\.00\\\\.1[012789].*|^01\\\\.00\\\\.0[8-9].*\"},{\"schema\": \"com.unionpay.tsmservice.mi\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 104,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[1-9].*|^01\\\\.00\\\\.0[8-9].*\"}],\"sort\": 100,\"type\": \"app\"}]";
    public static JSONArray w;
    public static final Handler.Callback x = new otx();

    public static int F() {
        JSONArray o2;
        int i2;
        WeakReference weakReference = j;
        if (weakReference == null || weakReference.get() == null) {
            return 1;
        }
        if (!TextUtils.isEmpty(f) || !TextUtils.isEmpty(g)) {
            i = true;
            if ("02".equalsIgnoreCase(g)) {
                f = "samsung_out";
            }
        } else {
            i = false;
        }
        o = 0;
        p = false;
        q = false;
        try {
            System.loadLibrary("entryexpro");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Context G = G();
        String c2 = UPUtils.c(G, "configs" + g);
        Context G2 = G();
        String c3 = UPUtils.c(G2, "mode" + g);
        Context G3 = G();
        String c4 = UPUtils.c(G3, "or" + g);
        if (!TextUtils.isEmpty(c2) && !TextUtils.isEmpty(c3) && !TextUtils.isEmpty(c4)) {
            try {
                JSONObject jSONObject = new JSONObject(c2);
                String b2 = g9y.b(jSONObject, "sign");
                try {
                    i2 = Integer.parseInt(c3);
                } catch (Exception unused) {
                    i2 = 0;
                }
                String str = new String(Base64.decode(jSONObject.getString("configs"), 2));
                String str2 = "";
                String str3 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : str2;
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str3;
                }
                String m2 = a.m(UPUtils.d(str + str2 + c4));
                String b3 = UPUtils.b(i2, b2);
                if (!TextUtils.isEmpty(b3) && b3.equals(m2)) {
                    if (TextUtils.isEmpty(g)) {
                        t = str;
                    } else if ("04".equals(g)) {
                        v = str;
                    } else {
                        u = str;
                    }
                    if (!TextUtils.isEmpty(e)) {
                        Context G4 = G();
                        String c5 = UPUtils.c(G4, "se_configs" + e);
                        if (!TextUtils.isEmpty(c5)) {
                            t(c5);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        try {
            if (TextUtils.isEmpty(g)) {
                o2 = o(new JSONArray(t), "sort");
            } else if ("04".equals(g)) {
                o2 = o(new JSONArray(v), "sort");
            } else {
                o2 = o(new JSONArray(u), "sort");
            }
            w = o2;
        } catch (Exception unused3) {
        }
        s = new Handler(x);
        if (TextUtils.isEmpty(g) || !a.f()) {
            r("0");
        } else {
            c cVar = new c(G());
            s.sendEmptyMessageDelayed(1004, 1000L);
            cVar.o("UNIONONLINEPAY", new bzx());
        }
        return 0;
    }

    public static Context G() {
        WeakReference weakReference = j;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public static int H(Context context, String str, String str2, String str3, String str4) {
        a(context, str, str2, str3, str4, "", "");
        return 0;
    }

    public static int a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        j = new WeakReference(context);
        k = str3;
        l = str;
        m = str2;
        n = str4;
        g = str6;
        f = str5;
        if (TextUtils.isEmpty(str6)) {
            str7 = "0";
        } else {
            str7 = "1";
        }
        h = str7;
        f19639a = null;
        b = null;
        c = null;
        e = str6;
        F();
        return 0;
    }

    public static String c(Context context) {
        return e(context, true, "0");
    }

    public static String d(Context context, int i2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", IPlayPublicService.PlayRate.PLAY_SPEED_1_5X);
            jSONObject.put("os_name", "android");
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("tn", UPUtils.h(i2, a.m(str)));
            }
            try {
                jSONObject.put("terminal_version", VERSION);
                jSONObject.put("os_version", h5y.a());
                jSONObject.put(h7r.DEVICE_MODEL, h5y.e());
                jSONObject.put("app_version", a.q(context, str2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("package_name", str2);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static String e(Context context, boolean z, String str) {
        String str2;
        String str3;
        String str4 = n;
        if (z) {
            str2 = null;
        } else {
            str2 = k;
        }
        if (z) {
            str3 = "0";
        } else {
            str3 = null;
        }
        return n(context, str4, str2, str3, str, h, e);
    }

    public static void k(String str, Bundle bundle, String str2) {
        if (str != null && str.trim().length() > 0) {
            if (str.trim().charAt(0) != '<') {
                bundle.putString("ex_mode", str2);
            } else if (str2 == null || !str2.trim().equalsIgnoreCase("00")) {
                bundle.putBoolean("UseTestMode", true);
            } else {
                bundle.putBoolean("UseTestMode", false);
            }
        }
    }

    public static void l(String str, String str2) {
        int i2;
        Bundle bundle = new Bundle();
        if (!"link".equals(str2)) {
            k(k, bundle, n);
            bundle.putString("SpId", l);
            bundle.putString("SysProvide", m);
            try {
                i2 = Integer.parseInt(n);
            } catch (Exception unused) {
                i2 = 0;
            }
            if ("wcd".equals(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("os", "android");
                    jSONObject.put("tn", k);
                    bundle.putString("paydata", UPUtils.h(i2, a.m(jSONObject.toString())));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                bundle.putString("paydata", UPUtils.h(i2, a.m(k)));
            }
            bundle.putString("pay_tn", k);
        }
        bundle.putString("magic_data", "949A1CC");
        bundle.putString("wapurl", str);
        bundle.putString("actionType", str2);
        try {
            Context G = G();
            if (G != null) {
                Intent intent = new Intent();
                intent.putExtras(bundle);
                intent.setClass(G, UPPayWapActivity.class);
                if (G instanceof Activity) {
                    ((Activity) G).startActivityForResult(intent, 10);
                    return;
                }
                intent.addFlags(268435456);
                G.startActivity(intent);
            }
        } catch (Exception unused2) {
        }
    }

    public static String n(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        int i2;
        int i3;
        String str8;
        Resources resources;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", IPlayPublicService.PlayRate.PLAY_SPEED_1_5X);
            jSONObject.put("sdkVerMode", "02");
            jSONObject.put("os_name", "android");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("tn", UPUtils.h(a.a(str), a.m(str2)));
            }
            jSONObject.put("appUuId", h5y.f(context));
            try {
                if (Locale.getDefault().toString().startsWith("zh")) {
                    str7 = "zh_CN";
                } else {
                    str7 = "en_US";
                }
                jSONObject.put("locale", str7);
                jSONObject.put("terminal_version", VERSION);
                if (context == null || (resources = context.getResources()) == null) {
                    i2 = 0;
                    i3 = 0;
                } else {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = displayMetrics.widthPixels;
                    i3 = displayMetrics.heightPixels;
                }
                jSONObject.put("terminal_resolution", (i2 + "*" + i3).trim());
                jSONObject.put("os_version", h5y.a());
                jSONObject.put(h7r.DEVICE_MODEL, h5y.e());
                if (new File("/system/bin/su").exists()) {
                    str8 = "1";
                } else {
                    str8 = "0";
                }
                jSONObject.put("root", str8);
                jSONObject.put("country", a.r(Locale.getDefault().getCountry()));
                jSONObject.put("package", a.r(h5y.b(context)));
                jSONObject.put("sign", h5y.c(context, a.r(h5y.b(context)), "SHA256"));
                String str9 = Build.MANUFACTURER;
                if (!TextUtils.isEmpty(str9)) {
                    str9 = str9.toUpperCase();
                }
                jSONObject.put("phone_model", str9);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            jSONObject.put("vendorCapacity", str4);
            if (!TextUtils.isEmpty(null)) {
                jSONObject.put("randKey", UPUtils.h(a.a(str), a.m(null)));
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("has_sdk", str3);
            }
            if (!TextUtils.isEmpty(null)) {
                jSONObject.put("merId", (Object) null);
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("isLimitSe", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put("seType", a.p(str6));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static JSONArray o(JSONArray jSONArray, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; jSONArray != null && i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.optJSONObject(i2));
        }
        Collections.sort(arrayList, new d6y(str));
        JSONArray jSONArray2 = new JSONArray();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            jSONArray2.put((JSONObject) arrayList.get(i3));
        }
        return jSONArray2;
    }

    public static void r(String str) {
        int i2;
        try {
            i2 = Integer.parseInt(n);
        } catch (Exception unused) {
            i2 = 0;
        }
        r = new x3y(UPUtils.a(i2), (byte) 0);
        r.b(e(G(), false, str));
        if (s == null) {
            s = new Handler(x);
        }
        Executors.newSingleThreadExecutor().execute(new gxx());
    }

    public static void t(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            f19639a = jSONObject.getString("titleLogo");
            b = jSONObject.getString("loadingLogo");
            c = jSONObject.getString("backGroundColor");
            d = jSONObject.getString("textColor");
        } catch (Exception unused) {
        }
    }

    public static void x(Context context, String str, String str2, k6e k6eVar) {
        Context context2;
        if (k6eVar != null) {
            if (TextUtils.isEmpty(str)) {
                str = "00";
            }
            try {
                System.loadLibrary("entryexpro");
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (context != null) {
                context2 = context.getApplicationContext();
            } else {
                context2 = null;
            }
            d8y d8yVar = new d8y(k6eVar, context2, str, str2);
            try {
                d8yVar.c();
            } catch (Throwable unused) {
                d8yVar.f(null);
            }
        }
    }

    public static /* synthetic */ void h(Context context, String str, String str2) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    String b2 = g9y.b(jSONObject, "sign");
                    String b3 = g9y.b(jSONObject, "configs");
                    if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(b3)) {
                        int a2 = a.a(str2);
                        String m2 = a.m(UPUtils.d(new String(Base64.decode(b3, 2))));
                        String b4 = UPUtils.b(a2, b2);
                        if (!TextUtils.isEmpty(b4) && b4.equals(m2)) {
                            UPUtils.g(context, str, "scan_configs");
                            UPUtils.g(context, str2, "scan_mode");
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void i(Context context, JSONArray jSONArray, int i2) {
        Exception e2;
        while (jSONArray != null && i2 < jSONArray.length()) {
            Object a2 = g9y.a(jSONArray, i2);
            if (a2 != null) {
                JSONObject jSONObject = (JSONObject) a2;
                String b2 = g9y.b(jSONObject, "type");
                if ("app".equals(b2)) {
                    JSONArray c2 = g9y.c(jSONObject, "package_info");
                    String b3 = g9y.b(jSONObject, "app_server");
                    JSONArray o2 = o(c2, "sort");
                    boolean z = false;
                    if (o2.length() > 0) {
                        int length = o2.length();
                        int i3 = 0;
                        boolean z2 = false;
                        while (true) {
                            if (i3 >= length) {
                                z = z2;
                                break;
                            }
                            Object a3 = g9y.a(o2, i3);
                            if (a3 != null) {
                                JSONObject jSONObject2 = (JSONObject) a3;
                                String b4 = g9y.b(jSONObject2, "schema");
                                String b5 = g9y.b(jSONObject2, "sign");
                                String b6 = g9y.b(jSONObject2, "version");
                                if (a.g(context, b4) && b5.equalsIgnoreCase(a.o(context, b4)) && a.q(context, b4).matches(b6)) {
                                    try {
                                        Bundle bundle = new Bundle();
                                        k(k, bundle, n);
                                        bundle.putString("SpId", l);
                                        bundle.putString("SysProvide", m);
                                        bundle.putString("paydata", k);
                                        bundle.putString("source", f);
                                        bundle.putString("se_type", g);
                                        if (!TextUtils.isEmpty(g)) {
                                            bundle.putString("se_title_logo", f19639a);
                                            bundle.putString("se_loading_logo", b);
                                            bundle.putString("se_title_bg_color", c);
                                            bundle.putString("se_cancel_bg_color", d);
                                        }
                                        bundle.putBoolean("dlgstyle", i);
                                        bundle.putString("server", b3);
                                        bundle.putString("SecurityChipType", null);
                                        bundle.putInt("reqOriginalId", 0);
                                        Intent intent = new Intent();
                                        intent.putExtras(bundle);
                                        if ("com.huawei.wallet".equals(b4)) {
                                            intent.setAction("com.huawei.wallet.action.onlinepay.startpay");
                                            intent.setPackage(b4);
                                        } else {
                                            intent.setClassName(b4, "com.unionpay.uppay.PayActivity");
                                        }
                                        Context G = G();
                                        if (G != null) {
                                            if (G instanceof Activity) {
                                                ((Activity) G).startActivityForResult(intent, 10);
                                            } else {
                                                intent.addFlags(268435456);
                                                G.startActivity(intent);
                                            }
                                        }
                                        try {
                                            int a4 = a.a(n);
                                            r = new x3y(UPUtils.k(a4), (byte) 0);
                                            r.b(d(G(), a4, k, b4));
                                            Executors.newSingleThreadExecutor().execute(new g5y());
                                            z = true;
                                            break;
                                        } catch (Exception e3) {
                                            e2 = e3;
                                            z2 = true;
                                            e2.printStackTrace();
                                            i3++;
                                        }
                                    } catch (Exception e4) {
                                        e2 = e4;
                                    }
                                }
                            }
                            i3++;
                        }
                    }
                    if (z) {
                        return;
                    }
                } else {
                    String str = "";
                    if ("wap".equals(b2)) {
                        if (!"samsung_out".equals(f)) {
                            try {
                                str = (String) jSONObject.get("url");
                            } catch (Exception unused) {
                            }
                            l(str, "wap");
                            return;
                        }
                    } else if ("link".equals(b2)) {
                        try {
                            str = jSONObject.getString("url");
                        } catch (Exception unused2) {
                        }
                        l(str, "link");
                        return;
                    } else if ("wcd".equals(b2)) {
                        try {
                            str = jSONObject.getString("url");
                        } catch (Exception unused3) {
                        }
                        l(str, "wcd");
                        return;
                    } else {
                        context = G();
                    }
                }
                jSONArray = w;
                i2 = o + 1;
                o = i2;
            } else {
                return;
            }
        }
    }
}
