package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.util.Pair;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.Condition;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.themis.taobao.exp.TMSSimpleLaunchSwitch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yrg implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, LinkRule> b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f32299a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends TypeReference<List<LinkRule>> {
        public a(yrg yrgVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends TypeReference<LinkRule> {
        public b(yrg yrgVar) {
        }
    }

    public yrg(Context context) {
        this.f32299a = context;
    }

    public static JSONObject a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("959ee23", new Object[]{str, obj});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) str);
        jSONObject.put("data", obj);
        return jSONObject;
    }

    public static LinkRule c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("10390c1a", new Object[0]);
        }
        Iterator it = ((ConcurrentHashMap) b).values().iterator();
        if (it.hasNext()) {
            return (LinkRule) it.next();
        }
        return null;
    }

    public static LinkRule d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("b37c3155", new Object[]{str});
        }
        for (LinkRule linkRule : ((ConcurrentHashMap) b).values()) {
            if (TextUtils.equals(str, linkRule.name)) {
                return linkRule;
            }
        }
        return null;
    }

    public static LinkRule e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("d4e97046", new Object[]{str});
        }
        return (LinkRule) ((ConcurrentHashMap) b).get(str);
    }

    public static boolean j(Condition condition, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a7ada73", new Object[]{condition, uri})).booleanValue();
        }
        if (condition == null) {
            return false;
        }
        String str = condition.scheme;
        if (!(str == null || TextUtils.equals(str, uri.getScheme()))) {
            return false;
        }
        String str2 = condition.host;
        if (!(str2 == null || t(str2, uri.getHost()))) {
            return false;
        }
        String str3 = condition.path;
        if (!(str3 == null || t(str3, uri.getPath()))) {
            return false;
        }
        Map<String, String> map = condition.queries;
        if (map == null || map.isEmpty()) {
            return true;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.isEmpty()) {
            return false;
        }
        for (Map.Entry<String, String> entry : condition.queries.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!"*".equals(value) || queryParameterNames.contains(key)) {
                String queryParameter = uri.getQueryParameter(key);
                if ("*".equals(value) || t(value, queryParameter)) {
                }
            }
            return false;
        }
        return true;
    }

    public static Condition k(LinkRule linkRule, Uri uri) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Condition) ipChange.ipc$dispatch("c8d99b7e", new Object[]{linkRule, uri});
        }
        if (!linkRule.nonModule) {
            z = j(linkRule.condition, uri);
        } else {
            z = false;
        }
        if (z) {
            return linkRule.condition;
        }
        Condition[] conditionArr = linkRule.conditions;
        if (conditionArr == null) {
            return null;
        }
        for (Condition condition : conditionArr) {
            if (j(condition, uri)) {
                return condition;
            }
        }
        return null;
    }

    public static Pair<LinkRule, ComponentName> l(Context context, String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("8799d648", new Object[]{context, str, uri});
        }
        if (uri.isOpaque()) {
            return Pair.create(null, new ComponentName(str, "com.taobao.browser.BrowserActivity"));
        }
        String g = bqg.g(uri);
        if (TextUtils.isEmpty(g)) {
            return Pair.create(null, new ComponentName(str, "com.taobao.browser.BrowserActivity"));
        }
        return m(context, str, g);
    }

    public static Pair<LinkRule, ComponentName> m(Context context, String str, String str2) {
        ComponentName componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("8b865051", new Object[]{context, str, str2});
        }
        LinkRule n = n(context, str2);
        if (n == null) {
            componentName = new ComponentName(str, "com.taobao.browser.BrowserActivity");
        } else {
            componentName = new ComponentName(str, n.component);
        }
        return x(Pair.create(n, componentName), context, str2);
    }

    public static LinkRule n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("bd0cb850", new Object[]{context, str});
        }
        return o(context, str, false);
    }

    public static LinkRule o(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("7b3a09dc", new Object[]{context, str, new Boolean(z)});
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) b;
        LinkRule linkRule = (LinkRule) concurrentHashMap.get(str);
        if (w(context, linkRule)) {
            return linkRule;
        }
        LinkRule p = p(context, str, z);
        if (!w(context, p)) {
            return null;
        }
        concurrentHashMap.put(str, p);
        return p;
    }

    public static LinkRule p(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("69b9e9df", new Object[]{context, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (parse.isOpaque()) {
            return null;
        }
        if (!z) {
            return q(context, parse);
        }
        return r(context, parse);
    }

    public static LinkRule q(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("3fe18650", new Object[]{context, uri});
        }
        String queryParameter = uri.getQueryParameter("__moduleName__");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = uri.getQueryParameter("sModuleName");
        }
        if (TextUtils.isEmpty(queryParameter)) {
            TLog.loge(erj.MODULE, "LinkRewriter", "moduleName is empty");
            return null;
        }
        LinkRule g = new yrg(context).g(context, queryParameter);
        if (g == null) {
            TLog.loge(erj.MODULE, "LinkRewriter", "no rule found for moduleName: " + queryParameter);
            return null;
        } else if (TextUtils.isEmpty(g.component) || k(g, uri) == null) {
            return null;
        } else {
            TLog.loge(erj.MODULE, "LinkRewriter", "found matched condition");
            if (t.a(context, "slim_afc_launch_off_" + g.name)) {
                return null;
            }
            return g;
        }
    }

    public static LinkRule r(Context context, Uri uri) {
        Condition k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("eb7c017f", new Object[]{context, uri});
        }
        for (LinkRule linkRule : new yrg(context).f(context)) {
            if (!TextUtils.isEmpty(linkRule.component) && (k = k(linkRule, uri)) != null) {
                TLog.loge(erj.MODULE, "LinkRewriter", "found matched condition");
                if (b(context, linkRule, k)) {
                    return linkRule;
                }
                return null;
            }
        }
        return null;
    }

    public static boolean t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8db98134", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.startsWith("*")) {
            return str2.endsWith(str.substring(1));
        }
        if (str.endsWith("*")) {
            return str2.startsWith(str.substring(0, str.length() - 1));
        }
        return TextUtils.equals(str2, str);
    }

    public static Pair<LinkRule, ComponentName> x(Pair<LinkRule, ComponentName> pair, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4cae4af3", new Object[]{pair, context, str});
        }
        LinkRule linkRule = pair.first;
        ComponentName componentName = pair.second;
        if (componentName == null) {
            return pair;
        }
        if (!"com.taobao.browser.BrowserActivity".equals(componentName.getClassName()) && (linkRule == null || !TMSCalendarBridge.namespace.equals(linkRule.name))) {
            return pair;
        }
        long a2 = TMSSimpleLaunchSwitch.a(context, str);
        if (a2 != 2 && a2 != 1) {
            return pair;
        }
        String c = TMSSimpleLaunchSwitch.c(a2);
        return TextUtils.isEmpty(c) ? pair : Pair.create(linkRule, new ComponentName(componentName.getPackageName(), c));
    }

    public List<LinkRule> f(Context context) {
        LinkRule g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e2a3ceda", new Object[]{this, context});
        }
        TLog.loge(erj.MODULE, "LinkRewriter", "getNonModuleRules");
        Map<String, ?> all = h(context).getAll();
        ArrayList arrayList = new ArrayList(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            if (!"__configVersion__".equals(key) && (g = g(context, key)) != null && g.nonModule) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        TLog.loge(erj.MODULE, "LinkRewriter", "onConfigUpdate, namespace=" + str);
        s(this.f32299a, str, map);
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9405839", new Object[]{this});
            return;
        }
        Map<String, LinkRule> map = b;
        if (((ConcurrentHashMap) map).size() > 0) {
            try {
                JSONArray jSONArray = new JSONArray(((ConcurrentHashMap) map).size());
                for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", entry.getKey());
                    jSONObject.put(LinkageUtils.PolicyType.RULE, entry.getValue());
                    jSONArray.add(jSONObject);
                }
                AppMonitor.Counter.commit(erj.MODULE, "LinkRewriter", a("featureEffected", jSONArray).toJSONString(), 1.0d);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean b(Context context, LinkRule linkRule, Condition condition) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b597a6d", new Object[]{context, linkRule, condition})).booleanValue();
        }
        if (TextUtils.equals(condition.abKey, "NONE")) {
            TLog.loge(erj.MODULE, "LinkRewriter", "abKey of biz '" + linkRule.name + "' is NONE, so it it open as default");
            return true;
        }
        if (!TextUtils.isEmpty(condition.abKey)) {
            str = "slim_afc_launch_" + linkRule.name + "_" + condition.abKey;
        } else {
            str = "slim_afc_launch_" + linkRule.name + "_" + condition.host + condition.path;
        }
        return t.a(context, str);
    }

    public static SharedPreferences h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("d2ec52d0", new Object[]{context});
        }
        return context.getSharedPreferences("next_launch_link_rewriter", 0);
    }

    public LinkRule g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("37a280c9", new Object[]{this, context, str});
        }
        TLog.loge(erj.MODULE, "LinkRewriter", "get rule for " + str);
        LinkRule linkRule = null;
        try {
            linkRule = (LinkRule) JSON.parseObject(h(context).getString(str, null), new b(this), new Feature[0]);
        } catch (Throwable unused) {
        }
        LinkRule d = bsg.d(str);
        if (linkRule == null) {
            TLog.loge(erj.MODULE, "LinkRewriter", "no cached rule, return the builtin rule");
            return d;
        } else if (d == null) {
            TLog.loge(erj.MODULE, "LinkRewriter", "no builtin rule, return the cached rule");
            return linkRule;
        } else if (linkRule.version > d.version) {
            TLog.loge(erj.MODULE, "LinkRewriter", "rule version cache > builtin, return the cached rule");
            return linkRule;
        } else {
            TLog.loge(erj.MODULE, "LinkRewriter", "rule version cache <= builtin, return the builtin rule");
            return d;
        }
    }

    public final boolean s(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9157093", new Object[]{this, context, str, map})).booleanValue();
        }
        SharedPreferences h = h(context);
        String string = h.getString("__configVersion__", null);
        String str2 = map.get("configVersion");
        if (TextUtils.equals(string, str2)) {
            TLog.loge(erj.MODULE, "LinkRewriter", "version is not changed, discard it. local=" + string + ", remote=" + str2);
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", (Object) str2);
        AppMonitor.Counter.commit(erj.MODULE, "LinkRewriter", a("orangeUpdate", jSONObject).toJSONString(), 1.0d);
        String customConfig = OrangeConfig.getInstance().getCustomConfig(str, null);
        SharedPreferences.Editor putString = h.edit().clear().putString("__configVersion__", str2);
        if (TextUtils.equals("__empty__", customConfig)) {
            return putString.commit();
        }
        List<LinkRule> list = (List) JSON.parseObject(customConfig, new a(this), new Feature[0]);
        if (list == null) {
            return putString.commit();
        }
        for (LinkRule linkRule : list) {
            if (!TextUtils.isEmpty(linkRule.component) && w(context, linkRule)) {
                putString.putString(linkRule.name, JSON.toJSONString(linkRule));
            }
        }
        return putString.commit();
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        u();
        OrangeConfig.getInstance().registerListener(new String[]{"next_launch_link_rewriter"}, this, false);
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8767272", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.isOpaque()) {
            return false;
        }
        if (!TextUtils.isEmpty(parse.getQueryParameter("__moduleName__"))) {
            return true;
        }
        return !TextUtils.isEmpty(parse.getQueryParameter("sModuleName"));
    }

    public static boolean w(Context context, LinkRule linkRule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1ef55d", new Object[]{context, linkRule})).booleanValue();
        }
        if (linkRule == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setComponent(new ComponentName(context.getPackageName(), linkRule.component));
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            return true;
        }
        TLog.loge(erj.MODULE, "LinkRewriter", "cannot resolve the component: " + linkRule.component + " of " + linkRule.name + ", discard it.");
        return false;
    }
}
