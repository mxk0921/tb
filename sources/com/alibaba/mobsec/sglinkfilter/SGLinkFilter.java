package com.alibaba.mobsec.sglinkfilter;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.jmo;
import tb.kmo;
import tb.mx8;
import tb.o78;
import tb.obk;
import tb.wdm;
import tb.yhs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SGLinkFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f2485a = {"securityguard_linkfilter_namespace"};
    public static boolean b = false;

    public static void a(StringBuilder sb, String str, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabe5727", new Object[]{sb, str, str2, new Boolean(z)});
            return;
        }
        sb.append(str);
        if (z) {
            str3 = "%3D";
        } else {
            str3 = "=";
        }
        sb.append(str3);
        sb.append(str2);
    }

    public static jmo b(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmo) ipChange.ipc$dispatch("87a443d", new Object[]{str, str2, context});
        }
        jmo jmoVar = new jmo(null, false);
        if (str == null) {
            return jmoVar;
        }
        if (context != null) {
            try {
                if (!(context instanceof Application)) {
                    context = context.getApplicationContext();
                }
            } catch (Exception e) {
                e.printStackTrace();
                return jmoVar;
            }
        }
        t(context);
        jmoVar = f(str, str2, context);
        return r(str, jmoVar);
    }

    public static String c(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe209e98", new Object[]{str, context});
        }
        String d = d("extract_id_regex", context, "(?<=(buyParam|itemId)=)([0-9]+)");
        if (d == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(d, 2).matcher(str);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b908d34", new Object[]{str});
        }
        int indexOf = str.indexOf(":");
        if (indexOf == -1) {
            return "";
        }
        return str.substring(0, indexOf);
    }

    public static jmo f(String str, String str2, Context context) {
        int i;
        String c;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmo) ipChange.ipc$dispatch("9d099cf7", new Object[]{str, str2, context});
        }
        jmo jmoVar = new jmo(null, false);
        if (str2 == null) {
            str2 = "";
        }
        if (k(str, context) && j(str2, context) && (c = c(str, context)) != null) {
            String d = d("jump_to_url_prefix", context, "https://m.taobao.com/index.htm?");
            jmoVar.b = d + c;
            jmoVar.f22082a = true;
            return jmoVar;
        } else if (!m(str, context) || !n(str2, context)) {
            if (o(str2, context)) {
                String s = s(str, str2, "_ariver_appid=", false);
                if (s == null && (s = s(str, str2, "_ariver_appid%3d", true)) == null) {
                    s = s(str, str2, "_ariver_appid%3D", true);
                }
                jmoVar.b = s;
            }
            return jmoVar;
        } else {
            String p = p(str);
            int indexOf = p.indexOf("?");
            if (indexOf == -1) {
                i = p.length();
                z = false;
            } else {
                i = indexOf + 1;
            }
            jmoVar.b = h(p, str2, i, false, z);
            return jmoVar;
        }
    }

    public static void g(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            String str = "";
            String str2 = LauncherRuntime.d;
            if (str2 != null && !str2.isEmpty()) {
                str = LauncherRuntime.d.split("@")[0];
            }
            if (!str.equals("212200") && !str.equals("36400112278902")) {
                q(application);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean i(String str, String str2, Context context, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("478485bc", new Object[]{str, str2, context, str3})).booleanValue();
        }
        String d = d(str, context, str3);
        if (d == null) {
            return false;
        }
        return Pattern.compile(d, 2).matcher(str2).find();
    }

    public static boolean j(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eca98166", new Object[]{str, context})).booleanValue();
        }
        return l("normal_package_regex", str, context);
    }

    public static boolean k(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4136d9d", new Object[]{str, context})).booleanValue();
        }
        return i("normal_url_regex", str, context, "taobao://{1,}(m\\.taobao\\.com/[\\./]{0,}cart/[\\./]{0,}order|main\\.m\\.taobao\\.com/[\\./]{0,}order/[\\./]{0,}index|h5\\.m\\.taobao\\.com/[\\./]{0,}cart/[\\./]{0,}order)+");
    }

    public static boolean l(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44458d49", new Object[]{str, str2, context})).booleanValue();
        }
        if (str2 == null || str2.length() == 0) {
            return true;
        }
        return i(str, str2, context, yhs.DEFAULT_PLAN_B_PASSWORD_REGEX);
    }

    public static boolean m(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73cade1e", new Object[]{str, context})).booleanValue();
        }
        return i("short_url_regex", str, context, "taobao://{1,}([a-zA-Z0-9]{1,}.tb.cn)+");
    }

    public static boolean n(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb47852", new Object[]{str, context})).booleanValue();
        }
        return l("short_url_package_regex", str, context);
    }

    public static boolean o(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4473f159", new Object[]{str, context})).booleanValue();
        }
        return l("small_prog_package_regex", str, context);
    }

    public static String p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a47c97b", new Object[]{str});
        }
        return str.replaceAll("x_sg_scheme", "x_sg_scheme_ss").replaceAll("x_sg_handled", "x_sg_handled_ss").replaceAll("x_sg_package", "x_sg_package_ss");
    }

    public static void q(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb5347a", new Object[]{context});
            return;
        }
        String str = new String[]{"extract_id_regex", "normal_package_regex", "short_url_package_regex", "small_prog_package_regex", "jump_to_url_prefix", "normal_url_regex", "short_url_regex"}[(int) (Math.random() * 7)];
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("type", (Object) "2");
        jSONObject.put("key", (Object) str);
        jSONObject2.put(wdm.CATEGORY_CONFIG_UPDATE, (Object) jSONObject.toString());
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.alibaba.afc.linkfilter.update");
        mtopRequest.setVersion("1.0");
        mtopRequest.setData(jSONObject2.toString());
        MtopBusiness build = MtopBusiness.build(Mtop.instance(context), mtopRequest);
        build.reqMethod(MethodEnum.POST);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.mobsec.sglinkfilter.SGLinkFilter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                Log.e("SGLinkFilter", "onError: " + mtopResponse.getResponseCode() + ", " + mtopResponse.mappingCode);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                Log.e("SGLinkFilter", "onSystemError: " + mtopResponse.getResponseCode() + ", " + mtopResponse.mappingCode);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    if (dataJsonObject != null) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject(dataJsonObject.getString("result"));
                        String str2 = (String) jSONObject3.get("result");
                        String str3 = (String) jSONObject3.get(o78.CHINA_MAINLAND);
                        String str4 = (String) jSONObject3.get("MN");
                        if (str2.isEmpty() || str3.isEmpty() || str4.isEmpty()) {
                            Log.e("SGLinkFilter", mx8.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
                        } else {
                            new Thread(new kmo(context, Base64.decode(str2, 0), str3, str4)).start();
                        }
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }).startRequest();
    }

    public static jmo r(String str, jmo jmoVar) {
        try {
            return (jmo) Class.forName("com.alibaba.wireless.security.sglinkfilter.SGLinkFilterExt").getDeclaredMethod("checkBlackMarketURL", String.class, jmo.class).invoke(null, str, jmoVar);
        } catch (Exception unused) {
            return jmoVar;
        }
    }

    public static String s(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("196d91c8", new Object[]{str, str2, str3, new Boolean(z)});
        }
        if (str.indexOf(str3) == -1) {
            return null;
        }
        String p = p(str);
        return h(p, str2, p.indexOf(str3), z, true);
    }

    public static void t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af8f808", new Object[]{context});
        } else if (!b && context != null) {
            try {
                OrangeConfig.getInstance().registerListener(f2485a, new a(context), true);
                b = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2486a;

        public a(Context context) {
            this.f2486a = context;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            Map<String, String> configs;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.f2486a.getSharedPreferences("sg_link_filter", 0);
                String string = sharedPreferences.getString("configVersion", null);
                String str2 = map.get("configVersion");
                if (!(str2 == null || str2.equals(string) || (configs = OrangeConfig.getInstance().getConfigs("securityguard_linkfilter_namespace")) == null)) {
                    String[] strArr = {"short_url_regex", "extract_id_regex", "normal_url_regex", "normal_package_regex", "short_url_package_regex", "small_prog_package_regex"};
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("configVersion", str2);
                    for (int i = 0; i < 6; i++) {
                        String str3 = strArr[i];
                        String string2 = sharedPreferences.getString(str3, null);
                        String str4 = configs.get(str3);
                        if (str4 != null && !str4.equals(string2)) {
                            edit.putString(str3, str4);
                        }
                    }
                    edit.apply();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String d(String str, Context context, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2796e18f", new Object[]{str, context, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("securityguard_linkfilter_namespace", str, null);
        if (config == null && context != null) {
            config = context.getSharedPreferences("sg_link_filter", 0).getString(str, null);
        }
        return config == null ? str2 : config;
    }

    public static String h(String str, String str2, int i, boolean z, boolean z2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("905d4f47", new Object[]{str, str2, new Integer(i), new Boolean(z), new Boolean(z2)});
        }
        if (i == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String e = e(str);
        if (z) {
            str3 = "%26";
        } else {
            str3 = "&";
        }
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        sb.append(str.substring(0, i));
        if (!z2) {
            sb.append("?");
        }
        a(sb, "x_sg_scheme", e, z);
        sb.append(str3);
        a(sb, "x_sg_handled", "true", z);
        sb.append(str3);
        a(sb, "x_sg_package", str2, z);
        if (z2) {
            sb.append(str3);
            sb.append(str.substring(i));
        }
        return sb.toString();
    }
}
