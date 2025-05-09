package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.flowout.data.FloutIdListBean;
import com.taobao.linkmanager.flowout.data.FloutWhiteListBean;
import com.taobao.linkmanager.flowout.data.FlowOutConfigData;
import com.taobao.tao.Globals;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, String> f22157a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22158a;

        public a(String str) {
            this.f22158a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                jq9.k(this.f22158a);
            }
        }
    }

    static {
        t2o.a(744489078);
    }

    public static String c(String str, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f1d72da", new Object[]{str, flowOutConfigData});
        }
        if (flowOutConfigData == null || TextUtils.isEmpty(str)) {
            vp9.a("linkx", "FlowOutUtils === getAppLink === 外跳配置或者packageName为空");
            return "";
        }
        List<FloutWhiteListBean> list = flowOutConfigData.floutWhiteList;
        if (!(list == null || list.size() == 0)) {
            for (FloutWhiteListBean floutWhiteListBean : list) {
                if (TextUtils.equals(str, floutWhiteListBean.packageName)) {
                    vp9.a("linkx", "FlowOutUtils === getAppLink === 获取到的AppLink:" + floutWhiteListBean.link);
                    return floutWhiteListBean.link;
                }
            }
            vp9.a("linkx", "FlowOutUtils === getAppLink === 获取到的AppLink为空");
        }
        return "";
    }

    public static String d(FlowOutConfigData flowOutConfigData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fb8d047", new Object[]{flowOutConfigData, str});
        }
        if (flowOutConfigData == null || TextUtils.isEmpty(str)) {
            vp9.a("linkx", "FlowOutUtils === getAppPackageName === 外跳配置或者mScheme为空");
            return "";
        } else if (f(flowOutConfigData, str)) {
            return f22157a.get(str);
        } else {
            return "";
        }
    }

    public static Map<String, String> e(Intent intent, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5342eaa0", new Object[]{intent, str});
        }
        Uri data = intent.getData();
        if (TextUtils.isEmpty(str) && data != null) {
            str = d(gq9.f(), data.getScheme());
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("targetUrl", data != null ? data.toString() : str);
        hashMap.put("packageName", str);
        hashMap.put("isSystemAction", str);
        if (intent.getDataString() != null) {
            str2 = intent.getDataString();
        } else {
            str2 = "unknown";
        }
        hashMap.put("data", str2);
        return hashMap;
    }

    public static boolean j(FloutIdListBean floutIdListBean) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1888bd4", new Object[]{floutIdListBean})).booleanValue();
        }
        if (floutIdListBean == null) {
            return false;
        }
        int i = floutIdListBean.validDate;
        if (i < 0) {
            return true;
        }
        if (i > AfcUtils.g()) {
            z = true;
        }
        return z;
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866408a7", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            Nav.from(Globals.getApplication()).toUri(str);
        }
    }

    public static void l(Intent intent, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961361a6", new Object[]{intent, str, new Integer(i)});
            return;
        }
        Map<String, String> e = e(intent, str);
        e.put("handleCode", i + "");
        m(iq9.ARG1_OUTGOING_BLOCKED, e);
    }

    public static void m(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68aa2bb2", new Object[]{str, map});
        } else {
            iq9.c(19999, str, map);
        }
    }

    public static void n(String str, Intent intent, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3311bc7", new Object[]{str, intent, str2, new Integer(i)});
            return;
        }
        Map<String, String> e = e(intent, str2);
        e.put("freeCode", i + "");
        iq9.c(19999, str, e);
    }

    public static String o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa260fc9", new Object[]{str, str2});
        }
        Uri parse = Uri.parse(str2);
        if (TextUtils.isEmpty(parse.getQueryParameter("spm"))) {
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.appendQueryParameter("spm", str);
            return buildUpon.toString();
        }
        vp9.a("linkx", "FlowOutUtils === spmTransform === 降级h5Url" + str2);
        return str2;
    }

    public static void p(String str, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9f1263", new Object[]{str, context, intent});
            return;
        }
        intent.putExtra(hq9.FLOW_OUT_SOURCE, str);
        context.startActivity(intent);
    }

    public static void r(String str, Activity activity, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a849528e", new Object[]{str, activity, intent, new Integer(i)});
            return;
        }
        intent.putExtra(hq9.FLOW_OUT_SOURCE, str);
        activity.startActivityForResult(intent, i);
    }

    public static void s(String str, Fragment fragment, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de3a8328", new Object[]{str, fragment, intent, new Integer(i)});
            return;
        }
        intent.putExtra(hq9.FLOW_OUT_SOURCE, str);
        fragment.startActivityForResult(intent, i);
    }

    public static boolean u(Context context, String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6204d59", new Object[]{context, str, str2, new Boolean(z), str3})).booleanValue();
        }
        if (z) {
            vp9.a("linkx", "FlowOutUtils === startOut === 打开APP，同时打开降级URL=" + str);
            zsa.b.a(new a(str2));
        }
        vp9.a("linkx", "FlowOutUtils === startOut === 打开APP: " + str);
        boolean t = t(context, str);
        if (!t && !z && (TextUtils.equals(str3, "1") || TextUtils.equals(str3, "2"))) {
            k(str2);
        }
        return t;
    }

    public static String w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9986362a", new Object[]{str});
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            vp9.a("linkx", "FlowOutUtils === urlEncode === 异常" + e);
            return "";
        }
    }

    public static boolean h(String str, String str2, FlowOutConfigData flowOutConfigData) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a47fe7af", new Object[]{str, str2, flowOutConfigData})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || flowOutConfigData == null) {
            vp9.a("linkx", "FlowOutUtils === startBrowser === Url或者flowOutConfig为空,返回false");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = d(flowOutConfigData, Uri.parse(str).getScheme());
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (FloutWhiteListBean floutWhiteListBean : flowOutConfigData.floutWhiteList) {
            if (TextUtils.equals(floutWhiteListBean.packageName, str2)) {
                z = floutWhiteListBean.supportAfcLink;
            }
        }
        vp9.a("linkx", "FlowOutUtils === isSupportAppLink === 是否支持海关协议:" + z);
        return z;
    }

    public static boolean v(Context context, Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64062838", new Object[]{context, uri})).booleanValue();
        }
        vp9.a("linkx", "FlowOutUtils === tboutJump === uri=" + uri);
        String queryParameter = uri.getQueryParameter("url");
        String queryParameter2 = uri.getQueryParameter(hq9.DEGTAGE_H5URL);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter(hq9.MEAN_WHILE, false);
        String queryParameter3 = uri.getQueryParameter("h5Url");
        String queryParameter4 = uri.getQueryParameter("package_name");
        String queryParameter5 = uri.getQueryParameter("spm");
        String queryParameter6 = uri.getQueryParameter(hq9.LINK_KEY);
        String queryParameter7 = uri.getQueryParameter("failMode");
        if (TextUtils.isEmpty(queryParameter7) || !TextUtils.isDigitsOnly(queryParameter7)) {
            queryParameter7 = "0";
        }
        String queryParameter8 = uri.getQueryParameter(hq9.FL_OUT_ID);
        if (TextUtils.isEmpty(queryParameter8)) {
            queryParameter8 = uri.getQueryParameter(hq9.VISA);
        }
        if (!TextUtils.isEmpty(queryParameter5) && !TextUtils.isEmpty(queryParameter2)) {
            queryParameter2 = o(queryParameter5, queryParameter2);
        }
        if (TextUtils.isEmpty(queryParameter3) && !TextUtils.isEmpty(queryParameter4)) {
            queryParameter3 = queryParameter;
        }
        if (TextUtils.equals(hq9.TMALL, queryParameter6)) {
            str = hq9.TMALL_PREFIX + w(queryParameter);
        } else {
            if (!TextUtils.isEmpty(queryParameter3)) {
                String c = c(queryParameter4, gq9.f());
                if (!TextUtils.isEmpty(c)) {
                    str = b(c, queryParameter3);
                }
            }
            str = queryParameter;
        }
        if (!TextUtils.isEmpty(queryParameter8)) {
            str = TFCCommonUtils.d(str, hq9.FL_OUT_ID, queryParameter8);
        }
        vp9.a("linkx", "FlowOutUtils === tboutJump === 跳转url=" + queryParameter);
        return u(context, str, queryParameter2, booleanQueryParameter, queryParameter7);
    }

    public static boolean a(String str, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba069e20", new Object[]{str, flowOutConfigData})).booleanValue();
        }
        if (flowOutConfigData == null || TextUtils.isEmpty(str)) {
            vp9.a("linkx", "FlowOutUtils === chekFlowOutWhiteList === flowOutConfig或者floutId为空,返回false");
            return false;
        }
        String[] strArr = flowOutConfigData.floutIdWhiteList;
        if (strArr != null) {
            for (String str2 : strArr) {
                if (TextUtils.equals(str2, str)) {
                    vp9.a("linkx", "FlowOutUtils === chekFlowOutWhiteList === 在flowOutId白名单，放过");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(FlowOutConfigData flowOutConfigData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6df758b", new Object[]{flowOutConfigData, str})).booleanValue();
        }
        if (flowOutConfigData == null || TextUtils.isEmpty(str)) {
            vp9.a("linkx", "FlowOutUtils === isInWhiteList === 外跳配置或者mScheme为空");
            return false;
        } else if (!TextUtils.isEmpty(f22157a.get(str))) {
            return true;
        } else {
            List<FloutWhiteListBean> list = flowOutConfigData.floutWhiteList;
            if (!(list == null || list.size() == 0)) {
                for (FloutWhiteListBean floutWhiteListBean : list) {
                    String[] strArr = floutWhiteListBean.schemes;
                    if (strArr != null && strArr.length > 0) {
                        for (String str2 : strArr) {
                            if (TextUtils.equals(str2, str)) {
                                f22157a.put(str, floutWhiteListBean.packageName);
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        }
    }

    public static boolean g(String str, String str2, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22a5f292", new Object[]{str, str2, flowOutConfigData})).booleanValue();
        }
        if (flowOutConfigData == null || TextUtils.isEmpty(str2)) {
            vp9.a("linkx", "FlowOutUtils === isPackageNameInFlowIdList === 外跳配置或者floutId为空");
            return false;
        }
        List<FloutIdListBean> list = flowOutConfigData.floutIdList;
        if (!(list == null || list.size() == 0)) {
            for (FloutIdListBean floutIdListBean : list) {
                if (TextUtils.equals(floutIdListBean.floutId, str2)) {
                    String[] strArr = floutIdListBean.packageNames;
                    if (strArr == null) {
                        return false;
                    }
                    for (String str3 : strArr) {
                        if (TextUtils.equals(str3, str) && j(floutIdListBean)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    public static boolean i(Intent intent, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65e97dc", new Object[]{intent, flowOutConfigData})).booleanValue();
        }
        if (flowOutConfigData == null || intent == null) {
            vp9.a("linkx", "FlowOutUtils === isSystemActionOrAndroidActions === 外跳配置或者mScheme为空");
            return false;
        }
        String scheme = intent.getScheme();
        String action = intent.getAction();
        String[] strArr = flowOutConfigData.systemActions;
        String[] strArr2 = flowOutConfigData.androidActions;
        if (!TextUtils.isEmpty(action) && strArr2 != null && strArr2.length > 0) {
            for (String str : strArr2) {
                if (TextUtils.equals(action, str)) {
                    return true;
                }
            }
        }
        if (!TextUtils.isEmpty(scheme) && strArr != null && strArr.length > 0) {
            for (String str2 : strArr) {
                if (TextUtils.equals(scheme, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean q(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("861f90f1", new Object[]{context, intent})).booleanValue();
        }
        if (context == null || intent == null) {
            vp9.a("linkx", "FlowOutUtils === startActivity === intent或者context为空");
            return false;
        }
        try {
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            vp9.b("linkx", "FlowOutUtils === startActivity 异常：" + th.toString());
            return false;
        }
    }

    public static boolean t(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daef6870", new Object[]{context, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || context == null) {
            vp9.a("linkx", "FlowOutUtils === startApp === Url或者context为空");
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(805339136);
        intent.setData(Uri.parse(str));
        try {
            context.startActivity(intent);
            vp9.a("linkx", "FlowOutUtils === startApp === 打开APP,intent=" + intent);
            return true;
        } catch (Exception e) {
            vp9.a("linkx", "FlowOutUtils === startApp === 打开APP,异常：" + e);
            return false;
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41d8afc4", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            vp9.a("linkx", "FlowOutUtils === formateUrl === linkUrl或者URL为空");
            return "";
        }
        vp9.a("linkx", "FlowOutUtils === formateUrl === linkUrl：" + str + "  url=" + str2);
        Matcher matcher = Pattern.compile("\\$\\{(.*?)\\}").matcher(str);
        while (matcher.find()) {
            String group = matcher.group(0);
            vp9.a("linkx", "FlowOutUtils === formateUrl === originalKey：" + group);
            if (TextUtils.equals("${url}", group)) {
                if (!TextUtils.isEmpty(str)) {
                    str = str.replace(group, w(str2));
                } else {
                    str = str.replace(group, "");
                }
            } else if (TextUtils.equals("${backUrl}", group)) {
                str = str.replace("${backUrl}", w("tbopen://"));
            } else if (group.length() >= 3) {
                String substring = group.substring(2, group.length() - 1);
                if (TextUtils.isEmpty(substring)) {
                    str = str.replace(group, "");
                } else {
                    if (substring.contains("#")) {
                        substring = substring.substring(1, substring.length() - 1);
                    }
                    if (TextUtils.isEmpty(substring)) {
                        str = str.replace(group, "");
                    }
                }
            }
        }
        vp9.a("linkx", "FlowOutUtils === formateUrl === 最终的URL：" + str);
        return str;
    }
}
