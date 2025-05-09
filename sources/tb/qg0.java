package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.ali.user.mobile.model.LoginType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.wireless.security.sdk.securesignature.SecureSignatureDefine;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String D;
    public String A;
    public final JSONObject B;
    public final Context C;

    /* renamed from: a  reason: collision with root package name */
    public String f26733a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public final Map<String, String> l;
    public Uri m;
    public final String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public final String v;
    public String w;
    public String x;
    public AfcXbsData y;
    public boolean z;

    static {
        t2o.a(467664899);
    }

    public qg0() {
        this.l = new HashMap();
        this.v = "0";
        this.z = false;
        this.B = new JSONObject();
    }

    public static boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44eec78f", new Object[]{intent})).booleanValue();
        }
        if (intent != null) {
            return e(intent.getExtras(), "cold_startup_h5");
        }
        return false;
    }

    public static boolean c(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48defc4a", new Object[]{bundle})).booleanValue();
        }
        return e(bundle, "cold_startup_h5");
    }

    public static boolean d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("394b162a", new Object[]{intent})).booleanValue();
        }
        if (intent != null) {
            return e(intent.getExtras(), "hot_startup_h5");
        }
        return false;
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2292780", new Object[]{str});
            return;
        }
        D = str;
        pg0.i().m = str;
    }

    public void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b4f49", new Object[]{this, uri});
        } else if (uri != null) {
            vp9.a("linkx", "AfcContext === getQueryParameter: data：" + uri);
            this.m = uri;
            try {
                this.f26733a = uri.getQueryParameter("appkey");
                D = uri.getQueryParameter("packageName");
                this.b = uri.getQueryParameter("appName");
                this.c = uri.getQueryParameter("v");
                this.d = uri.getQueryParameter("action");
                this.e = uri.getQueryParameter("module");
                String queryParameter = uri.getQueryParameter("h5Url");
                this.f = queryParameter;
                this.w = queryParameter;
                Iterator<String> it = uri.getQueryParameterNames().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (!TextUtils.isEmpty(next) && "backurl".equals(next.toLowerCase())) {
                        this.g = uri.getQueryParameter(next);
                        break;
                    }
                }
                this.h = uri.getQueryParameter("source");
                this.i = uri.getQueryParameter(SecureSignatureDefine.SG_KEY_SIGN_TTID);
                this.s = uri.getQueryParameter("utdid");
                this.j = uri.getQueryParameter("tag");
                this.k = uri.getQueryParameter("sdkName");
                uri.getQueryParameter(hq9.VISA);
                this.p = uri.getQueryParameter(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY);
                this.q = uri.getQueryParameter("bc_fl_src");
                this.r = uri.getQueryParameter(LoginType.LocalLoginType.AUTO_LOGIN);
                this.o = uri.getQueryParameter("afc_route");
                String queryParameter2 = uri.getQueryParameter("params");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(queryParameter2);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next2 = keys.next();
                        this.l.put(next2, (String) jSONObject.get(next2));
                    }
                }
            } catch (Throwable th) {
                vp9.b("linkx", "AfcContext  ===  getQueryParameter: 解析异常：" + th.toString());
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49807025", new Object[]{this});
            return;
        }
        if (!(AfcCustomSdk.h() == null || AfcCustomSdk.h().f10563a == null)) {
            float f = AfcCustomSdk.h().f10563a.getResources().getDisplayMetrics().density;
            AfcUtils.j(AfcCustomSdk.h().f10563a, false);
        }
        String str = Build.VERSION.RELEASE;
        this.u = pg0.i().k("COLD");
        this.t = pg0.i().n();
    }

    public static boolean e(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a546dc3f", new Object[]{bundle, str})).booleanValue();
        }
        if (bundle != null) {
            try {
                if (bundle.getBoolean(str, false)) {
                    return true;
                }
            } catch (Throwable th) {
                vp9.b("linkx", "isH5HCColdStartup#options error occurred: " + th.toString());
                return false;
            }
        }
        return false;
    }

    public qg0(Intent intent, Context context) {
        Uri data;
        this.l = new HashMap();
        this.v = "0";
        this.z = false;
        this.B = new JSONObject();
        if (context != null) {
            this.C = context.getApplicationContext();
        }
        this.v = "1";
        if (intent != null && (data = intent.getData()) != null) {
            vp9.b("linkx", "AfcContext === AfcContext: uri：" + data);
            this.n = data.toString();
            f();
            a(data);
            if (!TextUtils.isEmpty(pg0.i().m)) {
                D = pg0.i().m;
            }
        }
    }
}
