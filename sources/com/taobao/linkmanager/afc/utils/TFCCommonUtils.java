package com.taobao.linkmanager.afc.utils;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.nav.Nav;
import com.taobao.android.speed.TBSpeed;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OConstant;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.aaa;
import tb.ah0;
import tb.cmp;
import tb.k3l;
import tb.pg0;
import tb.rg0;
import tb.t2o;
import tb.usl;
import tb.vp9;
import tb.xhq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TFCCommonUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f10918a = "linkAhead";
    public static final String b = "mainBlock";
    public static String c = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum FlowType {
        SHARE(1, "afc_share"),
        MESSAGE(2, "afc_message"),
        LINK(3, "afc_link"),
        LAUNCH(4, "afc_launch");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int code;
        private String descs;

        FlowType(int i, String str) {
            this.code = i;
            this.descs = str;
        }

        public static /* synthetic */ String access$000(FlowType flowType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2ade3233", new Object[]{flowType});
            }
            return flowType.descs;
        }

        public static String getDesc(int i) {
            FlowType[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("989bf08b", new Object[]{new Integer(i)});
            }
            for (FlowType flowType : values()) {
                if (flowType.code == i) {
                    return flowType.descs;
                }
            }
            return null;
        }

        public static /* synthetic */ Object ipc$super(FlowType flowType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/utils/TFCCommonUtils$FlowType");
        }

        public static FlowType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FlowType) ipChange.ipc$dispatch("6078e93", new Object[]{str});
            }
            return (FlowType) Enum.valueOf(FlowType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f10919a;

        public a(Context context) {
            this.f10919a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String a2 = TFCCommonUtils.a(this.f10919a);
            if (!TextUtils.isEmpty(a2) && !TextUtils.equals(a2, TFCCommonUtils.b())) {
                vp9.a("linkx", "TFCCommonUtils === 异步获取到的oaid和本地不一致，缓存最新的到本地 " + a2);
                cmp.b(this.f10919a).d("afc_oaid", a2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f10920a;
        public final /* synthetic */ usl b;

        public b(Context context, usl uslVar) {
            this.f10920a = context;
            this.b = uslVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TFCCommonUtils.c(TFCCommonUtils.a(this.f10920a));
            vp9.a("linkx", "TFCCommonUtils === 单独子线程获取的oaid= " + TFCCommonUtils.b());
            this.b.b(TFCCommonUtils.b());
        }
    }

    public static /* synthetic */ String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c5cce90", new Object[]{context});
        }
        return l(context);
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5c6713b", new Object[]{str});
        }
        c = str;
        return str;
    }

    public static String d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb67ca8", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            return str.trim();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str2, str3);
        return e(str, hashMap);
    }

    public static String f(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7abf558", new Object[]{str, map});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, map.get(str2));
        }
        buildUpon.build();
        return buildUpon.toString();
    }

    public static void g(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a56f45", new Object[]{application});
        } else if (s(application, f10918a) && t(LauncherRuntime.d())) {
            TbFcLinkInit.instance().linkAhead = true;
        }
    }

    public static float h(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781a", new Object[]{new Float(f)})).floatValue();
        }
        return (f * Resources.getSystem().getDisplayMetrics().density) + 0.5f;
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7be3c01e", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("h5Url");
            vp9.a("linkx", "TFCCommonUtils === getH5URL === h5Url=" + queryParameter);
            if (TextUtils.isEmpty(queryParameter)) {
                return "";
            }
            Uri parse2 = Uri.parse(queryParameter);
            if (aaa.c()) {
                String queryParameter2 = parse.getQueryParameter("afc_route");
                String queryParameter3 = parse2.getQueryParameter("preFetch");
                if (!"1".equals(queryParameter2)) {
                    if ("1".equals(queryParameter3)) {
                    }
                }
                vp9.a("linkx", "TFCCommonUtils === getH5URL === preFetch=" + queryParameter3);
                return queryParameter;
            }
            if (aaa.d()) {
                String queryParameter4 = parse2.getQueryParameter("preFetch");
                if ("1".equals(queryParameter4)) {
                    vp9.a("linkx", "TFCCommonUtils === getH5URL === preFetch=" + queryParameter4);
                    return queryParameter;
                }
            }
            String queryParameter5 = parse2.getQueryParameter("u");
            vp9.a("linkx", "TFCCommonUtils === getH5URL === hcUrl=" + queryParameter5);
            return queryParameter5;
        } catch (Throwable th) {
            vp9.b("linkx", "TFCCommonUtils === getH5URL === error " + th);
            return "";
        }
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("759c8494", new Object[0]);
        }
        try {
            boolean checkSessionValid = Login.checkSessionValid();
            if (TextUtils.isEmpty(Login.getLoginToken())) {
                return "unLogin";
            }
            if (checkSessionValid) {
                return "login";
            }
            return "sessionInvalid";
        } catch (Throwable unused) {
            vp9.b("linkx", "TFCCommonUtils.getLoginStatus.error.");
            return "error";
        }
    }

    public static String k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("baea1f42", new Object[]{context});
        }
        String str = (String) cmp.b(context).a("afc_oaid", "");
        c = str;
        if (!TextUtils.isEmpty(str)) {
            Thread thread = new Thread(new a(context));
            thread.setName("TFCCommon.getOaid1");
            thread.start();
            return c;
        }
        usl uslVar = new usl();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Thread thread2 = new Thread(new b(context, uslVar));
            thread2.setName("TFCCommon.getOaid2");
            thread2.start();
            try {
                c = (String) uslVar.get(1000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
                c = "";
            }
        } else {
            c = l(context);
            vp9.a("linkx", "TFCCommonUtils === 海关子线程获取的oaid= " + c);
        }
        return c;
    }

    public static String l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb3f7c5f", new Object[]{context});
        }
        try {
            String a2 = k3l.a(context);
            if (TextUtils.isEmpty(a2)) {
                return "";
            }
            cmp.b(context).d("afc_oaid", a2);
            return a2;
        } catch (Throwable th) {
            vp9.a("linkx", "TFCCommonUtils === 获取OAID异常= " + th.getMessage());
            return "";
        }
    }

    public static String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f31ea89", new Object[]{str});
        }
        if (!aaa.f()) {
            vp9.a("linkx", "TFCCommonUtils === getRewriterH5Url === ab off ");
            return str;
        } else if (TextUtils.isEmpty(str)) {
            return str;
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getQueryParameter("_afc_link") == null || parse.getQueryParameter("utparamcnt") == null) {
                try {
                    Uri.Builder buildUpon = parse.buildUpon();
                    buildUpon.appendQueryParameter("_afc_link", "1");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("_afc_link", (Object) "1");
                    buildUpon.appendQueryParameter("utparamcnt", jSONObject.toJSONString());
                    str = buildUpon.build().toString();
                } catch (Exception e) {
                    vp9.b("linkx", "TFCCommonUtils === getRewriterH5Url === error " + e);
                }
                vp9.b("linkx", "TFCCommonUtils === getRewriterH5Url === " + str);
                return str;
            }
            vp9.a("linkx", "TFCCommonUtils === getRewriterH5Url === has rewriter ");
            return str;
        }
    }

    public static AfcCustomSdk.Environment n(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AfcCustomSdk.Environment) ipChange.ipc$dispatch("6b41e255", new Object[]{hashMap});
        }
        if (hashMap == null || hashMap.size() == 0) {
            return AfcCustomSdk.Environment.PRE;
        }
        if (((Integer) hashMap.get(OConstant.LAUNCH_ENVINDEX)).intValue() == 0) {
            return AfcCustomSdk.Environment.ONLINE;
        }
        return AfcCustomSdk.Environment.PRE;
    }

    public static String p(FlowType flowType, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a0f97fe", new Object[]{flowType, str, map});
        }
        AfcUtils.FlowType flowType2 = AfcUtils.FlowType.LINK;
        if (TextUtils.equals("afc_share", FlowType.access$000(flowType))) {
            flowType2 = AfcUtils.FlowType.SHARE;
        } else if (TextUtils.equals("afc_message", FlowType.access$000(flowType))) {
            flowType2 = AfcUtils.FlowType.MESSAGE;
        } else if (!TextUtils.equals("afc_link", FlowType.access$000(flowType)) && TextUtils.equals("afc_launch", FlowType.access$000(flowType))) {
            flowType2 = AfcUtils.FlowType.LAUNCH;
        }
        vp9.a("linkx", "TFCCommonUtils === handleFlowParams === 调用类型：" + flowType2);
        return AfcUtils.r(flowType2, str, map);
    }

    public static boolean q(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c75ba32", new Object[]{application})).booleanValue();
        }
        if (application == null) {
            return false;
        }
        return !TextUtils.isEmpty(Login.getEncryptLoginToken(application));
    }

    public static boolean s(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("540fef86", new Object[]{application, str})).booleanValue();
        }
        return TBSpeed.isSpeedEdition(application, str);
    }

    public static boolean t(xhq xhqVar) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df3b76d", new Object[]{xhqVar})).booleanValue();
        }
        if (xhqVar == null || (intent = xhqVar.e) == null || intent.getData() == null || xhqVar.d == null) {
            return false;
        }
        return true;
    }

    public static void u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3293c45", new Object[]{context});
        } else if (context != null) {
            Nav.from(context).toUri("http://m.taobao.com/index.htm");
        }
    }

    public static float v(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3f6f788", new Object[]{new Float(f)})).floatValue();
        }
        return f / Resources.getSystem().getDisplayMetrics().density;
    }

    public static void w(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01a9238", new Object[]{str, str2, hashMap});
        } else if (str != null && str.contains("_afc_link")) {
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            hashMap.put(rg0.JUMP_URL, str2);
            hashMap.put(TBImageFlowMonitor.ERROR_ORIGIN_URL, str);
            ah0.c(19999, "302_flow_track_url", "", "", hashMap);
        }
    }

    public static String e(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d048b38c", new Object[]{str, map});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (map == null || map.size() == 0) {
            vp9.a("linkx", "TFCCommonUtils === appendParams === 参数map为空，返回原始URL=" + str);
            return str.trim();
        } else if (Boolean.parseBoolean(pg0.i().c("parseRouterUrl", "false"))) {
            try {
                return f(str, map);
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        } else {
            try {
                StringBuilder sb = new StringBuilder();
                for (String str2 : map.keySet()) {
                    if (!TextUtils.isEmpty(map.get(str2))) {
                        sb.append(str2);
                        sb.append("=");
                        sb.append(map.get(str2));
                        sb.append("&");
                    }
                }
                sb.deleteCharAt(sb.length() - 1);
                String trim = str.trim();
                int length = trim.length();
                int indexOf = trim.indexOf("?");
                if (indexOf <= -1) {
                    str = trim + "?" + sb.toString();
                } else if (length - 1 == indexOf) {
                    str = trim + sb.toString();
                } else {
                    str = trim + "&" + sb.toString();
                }
                vp9.a("linkx", "TFCCommonUtils === appendParams === 拼接成的URL=" + str);
                return str;
            } catch (Exception e2) {
                vp9.a("linkx", "TFCCommonUtils === appendParams === 拼接url异常：" + e2);
                return str;
            }
        }
    }

    public static String o(Context context) {
        Throwable th;
        Exception e;
        Cursor query;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d31eb12f", new Object[]{context});
        }
        Cursor cursor = null;
        r5 = null;
        String str = null;
        cursor = null;
        try {
            try {
                query = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{"com.taobao.taobao"}, null);
            } catch (Exception e2) {
                e = e2;
                str = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (query != null) {
                query.moveToFirst();
                str = query.getString(1) + "^" + query.getString(2) + "^" + query.getString(3) + "^" + query.getString(4) + "^" + query.getString(5);
                vp9.b("linkx", "TFCCommonUtils === getTrackId:" + str);
            } else {
                vp9.a("linkx", "TFCCommonUtils === getTrackId cursor is null");
            }
            if (query == null) {
                return str;
            }
            query.close();
            return str;
        } catch (Exception e3) {
            e = e3;
            cursor = query;
            vp9.b("linkx", "TFCCommonUtils === getTrackId: 获取渠道信息异常：" + e);
            if (cursor != null) {
                cursor.close();
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static boolean r(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95779a2f", new Object[]{context, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            vp9.a("linkx", "TFCCommonUtils === isH5Landing: 传入URL为空，返回false");
            return false;
        }
        String decode = URLDecoder.decode(str, "utf-8");
        Map<String, String> c2 = cmp.b(context).c("flow_customs_in_local");
        if (c2.size() != 0 && c2.containsKey("isH5Land")) {
            String str2 = c2.get("isH5Land");
            if (!TextUtils.isEmpty(str2)) {
                for (String str3 : Arrays.asList(str2.split(","))) {
                    if (decode.contains(str3)) {
                        vp9.a("linkx", "TFCCommonUtils === isH5Landing: 当前URL是h5落地页，匹配到URL为：" + str3);
                        return true;
                    }
                }
            }
            return false;
        }
        vp9.a("linkx", "TFCCommonUtils === isH5Landing: 取到的配置为空或者配置不包含isH5Landing，返回false");
        return false;
    }

    static {
        t2o.a(744489047);
    }
}
