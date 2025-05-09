package tb;

import android.net.Uri;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ftw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_POINT_NEW_SECURITY_ALLOW = "NewSecurityAllow";
    public static final String MONITOR_POINT_NEW_SECURITY_BLOCK = "NewSecurityBlock";
    public static final int[] g = {-1, 80, 443};
    public static final String[] h = {"http", "https", "taobao"};
    public static volatile ftw i = null;
    public static boolean j = false;
    public static final int k = -1;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 8;

    /* renamed from: a  reason: collision with root package name */
    public volatile a f19529a;
    public final boolean e;
    public final Map<String, Map<String, String>> b = new HashMap();
    public final Map<String, JSONArray> c = new HashMap();
    public boolean d = false;
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f19530a;
        public final Map<String, a> e;
        public final List<Integer> d = new ArrayList();
        public String b = null;
        public String c = null;

        static {
            t2o.a(989855797);
        }

        public a(ftw ftwVar, String str, Map<String, a> map) {
            this.f19530a = str;
            this.e = map;
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("56600851", new Object[]{aVar});
            }
            return aVar.f19530a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("36d95e52", new Object[]{aVar});
            }
            return aVar.b;
        }

        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("376edbda", new Object[]{this, new Integer(i)});
            } else if (i >= 0) {
                ((ArrayList) this.d).add(Integer.valueOf(i));
            }
        }

        public List<Integer> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e4effb04", new Object[]{this});
            }
            return this.d;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7e71d53e", new Object[]{this});
            }
            return this.c;
        }

        public void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b46360e", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public void finalize() throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            super.finalize();
            this.e.clear();
        }

        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef72bff8", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f19531a = null;
        public String[] b = null;
        public String[] c = null;
        public int d = -1;

        static {
            t2o.a(989855798);
        }

        public b(ftw ftwVar) {
        }
    }

    public ftw() {
        this.e = false;
        try {
            IpChange ipChange = AppMonitor.$ipChange;
            this.e = true;
        } catch (Exception e) {
            this.e = false;
            v7t.d("URLMATCHER", "");
            e.printStackTrace();
        }
    }

    public static ftw f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ftw) ipChange.ipc$dispatch("dfe65c80", new Object[0]);
        }
        if (i == null) {
            synchronized (ftw.class) {
                try {
                    if (i == null) {
                        ftw ftwVar = new ftw();
                        ftwVar.w("{\"//beian.miit.gov.cn/*\": \"2\",\"//*.www.aliwork.com/*\":\"2\",\"//*.taobao.com/*\":\"1\",\"//*.tmall.com/*\":\"1\",\"//*.juhuasuan.com/*\":\"1\",\"//*.xiami.com/*\":\"1\",\"//*.amap.com/*\":\"1\",\"//*.taobaocdn.com/*\":\"1\",\"//*.alipay.com/*\":\"1\",\"//*.etao.com/*\":\"1\",\"//*.alibaba.com/*\":\"1\",\"//*.aliyun.com/*\":\"1\",\"//*.alimama.com/*\":\"1\",\"//*.weibo.com/*\":\"1\",\"//*.tanx.com/*\":\"1\",\"//*.laiwang.com/*\":\"1\",\"//*.alicdn.com/*\":\"1\",\"//*.mmstat.com/*\":\"1\",\"//*.yunos.com/*\":\"1\",\"//*.alibaba-inc.com/*\":\"1\",\"//*.alitrip.com/*\":\"1\",\"//*.aliloan.com/*\":\"1\",\"//*.kanbox.com/*\":\"1\",\"//*.wirlesshare.com/*\":\"1\",\"//*.dingtalk.com/*\":\"1\",\"//*.alimei.com/*\":\"1\",\"//*.cnzz.com/*\":\"1\",\"//*.kuaidadi.com/*\":\"1\",\"//*.autonavi.com/*\":\"1\",\"//*.m.yintai.com/*\":\"1\",\"//*.polyinno.com/*\":\"1\",\"//*.spdyidea.com/*\":\"1\",\"//*.h5util.com/*\":\"1\",\"//*.h5tool.com/*\":\"1\",\"//*.5945i.com/*\":\"1\",\"//*.miaostreet.com/*\":\"1\",\"//*.1688.com/*\":\"1\",\"//*.cainiao-inc.com/*\":\"1\",\"//*.cainiao.com/*\":\"1\",\"//*.taohua.com/*\":\"1\",\"//*.m.jiaoyimao.com/*\":\"1\",\"//*.m.dfkhgj.com/*\":\"1\",\"//*.m.edcdfg.com/*\":\"1\",\"//*.liangxinyao.com/*\":\"1\",\"//*.taopiaopiao.com/*\":\"1\",\"//*.fliggy.com/*\":\"1\",\"//*.feizhu.com/*\":\"1\",\"//*.mashangfangxin.com/*\":\"1\",\"//*.youku.com/*\":\"1\",\"//*.im.alisoft.com/*\":\"1\",\"//*.100x100w.com/*\":\"1\",\"//*.koubei.com/*\":\"1\",\"//*.alibabausercontent.com/*\":\"1\",\"//*.hemaos.com/*\":\"1\",\"//*.alihive.com/*\":\"1\",\"//*.jishi.rantu.com/*\":\"1\",\"//*.cdn.rantu.com/*\":\"1\",\"//*.ishuqi.com/*\":\"1\",\"//*.jishi.aligames.com/*\":\"1\",\"//*.aligames.com/*\":\"1\",\"//*.h5.shyhhema.com/*\":\"1\",\"//*.mp.dfkhgj.com/*\":\"1\",\"//*.mp.iuynfg.com/*\":\"1\",\"//*.mp.edcdfg.com/*\":\"1\",\"//*.mp.asczwa.com/*\":\"1\",\"//*.duanqu.com/*\":\"1\",\"//*.y.xevddy.com/*\":\"1\",\"//*.l.xevddy.com/*\":\"1\",\"//*.portalpro.hemaos.com/*\":\"1\",\"//*.h5.shyhhema.com/*\":\"1\",\"//*.shejijia.com/*\":\"1\",\"//*.preview-lyj.aliyuncs.com/*\":\"1\",\"//*.kaola.com/*\":\"1\",\"//*.alimebot.com/*\":\"1\",\"//*.freshhema.com/*\":\"1\",\"//*.h5.tangping.com/*\":\"1\",\"//*.page.cainiao.com/*\":\"1\",\"//*.xunxi.com/*\":\"1\",\"//*.pages.goofish.com/*\":\"1\",\"//*.h5-global.alimebot.com/*\":\"1\",\"//*.tb.cn/*\":\"1\",\"//*.tbcdn.cn/*\":\"1\",\"//*.weibo.cn/*\":\"1\",\"//*.mashort.cn/*\":\"1\",\"//*.mybank.cn/*\":\"1\",\"//*.uc.cn/*\":\"1\",\"//*.feizhu.cn/*\":\"1\",\"//*.alihealth.cn/*\":\"1\",\"//*.alios.cn/*\":\"1\",\"//*.xixi.fullspeed.cn/*\":\"1\",\"//*.image.9game.cn/*\":\"1\",\"//*.pass.alios.cn/*\":\"1\",\"//*.m.damai.cn/*\":\"1\",\"//*.p.damai.cn/*\":\"1\",\"//*.damai.cn/*\":\"1\",\"//*.taopiaopiao.cn/*\":\"1\",\"//*.m.piao.cn/*\":\"1\",\"//*.s.piao.cn/*\":\"1\",\"//*.market.wapa.piao.cn/*\":\"1\",\"//*.hemashare.cn/*\":\"1\",\"//*.fastidea.me/*\":\"1\",\"//*.fastidea.cc/*\":\"1\",\"//*.juzone.me/*\":\"1\",\"//*.juzone.cc/*\":\"1\",\"//*.r.daily.elenet.me/*\":\"1\",\"//*.ppe-r.elenet.me/*\":\"1\",\"//*.ppe-r.ele.me/*\":\"1\",\"//*.r.elenet.me/*\":\"1\",\"//*.r.ele.me/*\":\"1\",\"//*.lwurl.to/*\":\"1\",\"//*.taobao.net/*\":\"1\",\"//*.alipay.net/*\":\"1\",\"//*.cnzz.net/*\":\"1\",\"//*.fliggy.net/*\":\"1\",\"//*.feizhu.net/*\":\"1\",\"//*.tmall.net/*\":\"1\",\"//*.tdd.la/*\":\"1\",\"//*.yao.95095.com/*\":\"1\",\"//*.tmall.hk/*\":\"1\",\"//*.alipay.hk/*\":\"1\",\"//*.fliggy.hk/*\":\"1\",\"//*.ahd.so/*\":\"1\",\"//*.atb.so/*\":\"1\",\"//*.mshare.cc/*\":\"1\",\"//*.juhs.me/*\":\"1\",\"//*.xianyu.mobi/*\":\"1\",\"//*.ynuf.aliapp.org/*\":\"1\",\"//*.doctoryou.ai/*\":\"1\",\"//*.h5.ele.me/*\":\"1\",\"//*.tb.ele.me/*\":\"1\",\"//*.lemon.ele.me/*\":\"1\",\"//*.lemon.faas.ele.me/*\":\"1\",\"//*.marketing-feast.faas.ele.me/*\":\"1\",\"//*.gw.alipayobjects.com/as/g/memberAsset/zfb-tbcard/*\":\"1\",\"//*.t-series-act.faas.ele.me/*\":\"1\",\"//*.2018-bill.faas.ele.me/*\":\"1\",\"//*.wegame-web-daily.uc.test/*\":\"1\",\"//*.tb.pub/*\":\"1\",\"//*.jsplayground.taobao.org/*\":\"1\",\"//*.www.yuque.com/tbzb/help/*\":\"1\",\"//*.zmcreditprod.zmxy.com.cn/contractb2c/index.htm/*\":\"1\",\"//*.ppe-h5.ele.me/*\":\"1\",\"//*.survey.taobao.tw/*\":\"1\",\"//*.fc.ele.me/*\":\"1\",\"//*.lazada.com.my/*\":\"1\",\"//*.ppt-tb.ele.me/*\":\"1\",\"//*.pre-tb.ele.me/*\":\"1\",\"//*.taobao.tw/*\":\"1\",\"//*.taobao.hk/*\":\"1\",\"//*.taobao.global/*\":\"1\",\"//*.orderrefund-next.ele.me/*\":\"1\",\"//*.ppe-orderrefund-next.ele.me/*\":\"1\",\"//*.s.click.ele.me/*\":\"1\",\"//*.web.ele.me/*\":\"1\",\"//*.pre-web.ele.me/*\":\"1\",\"//*.ppe-fc.ele.me/*\":\"1\",\"//*.5317wan.com/*\":\"2\",\"//*.guahao.com/*\":\"2\",\"//*.wap.wandafilm.com/*\":\"2\",\"//*.wrating.com/*\":\"2\",\"//*.alipayobjects.com/*\":\"2\",\"//*.hft.evergrande.com/*\":\"2\",\"//*.app.evergrande.com/*\":\"2\",\"//*.jmt.wxcsgd.com/*\":\"2\",\"//*.mpay.cx580.com/*\":\"2\",\"//*.mt.locojoy.com/*\":\"2\",\"//*.cpa1.locojoy.com/*\":\"2\",\"//*.miiee.com/*\":\"2\",\"//*.imaijia.com/*\":\"2\",\"//*.h5.edaijia.cn/*\":\"2\",\"//*.beta.library.sh.cn/*\":\"2\",\"//*.web.chelaile.net.cn/*\":\"2\",\"//*.app3.shmzj.gov.cn/*\":\"2\",\"//*.bsfw.qingdao.gov.cn/*\":\"2\",\"//*.www.hzpolice.gov.cn/*\":\"2\",\"//*.www.sxgajj.gov.cn/*\":\"2\",\"//*.service.zjzwfw.gov.cn/*\":\"2\",\"//*.people.com.cn/*\":\"2\",\"//*.hbjg.premier-tech.cn/*\":\"2\",\"//*.aliplay.net/*\":\"2\",\"//*.ali.hk515.net/*\":\"2\",\"//*.tmall.pp.cc/*\":\"2\",\"//*.portal-h5.hemayx.cn/*\":\"1\"}", "{\"1\":{\"api\":\"Group_All\",\"open\":\"allow\"},\"2\":{\"api\":\"Group_None\",\"open\":\"allow\"},\"3\":{\"api\":\"Group_None\",\"open\":\"forbidden\"},\"4\":{\"api\":\"Group_All\",\"open\":\"allowAll\"}}", "{\"Group_All\":[\"*\"],\"Group_None\":[]}", false);
                        i = ftwVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    public static int g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4e7725e", new Object[]{str})).intValue();
        }
        int i2 = l;
        if (f().m(str)) {
            return k;
        }
        if (f().o(str)) {
            return n;
        }
        return f().n(str) ? m : i2;
    }

    public String h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d09d2ef", new Object[]{this, str, str2});
        }
        if (this.f) {
            if ("open".equals(str2)) {
                return oyl.PERMISSION_ALLOW;
            }
            if ("api".equals(str2)) {
                return "Group_All";
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v7t.d("URLMATCHER", "getUrlPermissionInfo: 输入参数为空!");
            return null;
        } else if (this.f19529a == null || this.f19529a.e.isEmpty()) {
            v7t.d("URLMATCHER", "getUrlPermissionInfo: URL配置不应为空!");
            return null;
        } else {
            synchronized (this.b) {
                Map<String, Map<String, String>> map = this.b;
                if (map != null && !((HashMap) map).isEmpty()) {
                    if (TextUtils.equals(str2, "open") && (str.startsWith("javascript:") || str.startsWith("about:") || str.startsWith("tel:") || str.startsWith(WVUCWebViewClient.SCHEME_SMS) || str.startsWith("mailto:"))) {
                        return oyl.PERMISSION_ALLOW;
                    }
                    try {
                        String r = r(str);
                        if (TextUtils.isEmpty(r)) {
                            v7t.d("URLMATCHER", "getUrlPermissionInfo: 该url未在配置内，禁止访问! " + str);
                            return null;
                        }
                        synchronized (this.b) {
                            Map map2 = (Map) ((HashMap) this.b).get(r);
                            if (map2 != null && !map2.isEmpty()) {
                                String str3 = (String) map2.get(str2);
                                if (!TextUtils.isEmpty(str3)) {
                                    return str3;
                                }
                                v7t.d("URLMATCHER", "getUrlPermissionInfo: 未在权限组:" + r + " 中找到权限:" + str2 + "的配置");
                                return null;
                            }
                            v7t.d("URLMATCHER", "getUrlPermissionInfo: 未能找到权限组:" + r + " 的配置,请检查配置!");
                            return null;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                        if (TextUtils.equals(str2, "open")) {
                            v7t.d("URLMATCHER", "获取open权限时，出现匹配错误，已允许该URL打开，url:" + str);
                            if (!this.e) {
                                return oyl.PERMISSION_ALLOW;
                            }
                            AppMonitor.Alarm.commitFail("WindVane", y71.MONITOR_MATCH_URL_FAILED, x74.i(th) + " |||| " + str, "4", "获取open权限时，出现匹配错误，已允许该URL打开");
                            return oyl.PERMISSION_ALLOW;
                        }
                        v7t.d("URLMATCHER", "获取" + str2 + "权限时出现错误，url:" + str);
                        if (this.e) {
                            AppMonitor.Alarm.commitFail("WindVane", y71.MONITOR_MATCH_URL_FAILED, x74.i(th) + " |||| " + str, "5", " 获取" + str2 + "权限时，出现匹配错误");
                        }
                        return null;
                    }
                }
                v7t.d("URLMATCHER", "getUrlPermissionInfo: urlRules配置不应为空!");
                return null;
            }
        }
    }

    public String r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62ebd892", new Object[]{this, str});
        }
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            v7t.d("URLMATCHER", "searchUrlForGroup: 输入的URL不应为空！");
            return null;
        } else if (this.f19529a == null || this.f19529a.e == null || this.f19529a.e.isEmpty()) {
            v7t.d("URLMATCHER", "searchUrlForGroup: URL配置不应为空！");
            return null;
        } else {
            b p = p(str);
            if (p == null) {
                v7t.d("URLMATCHER", "searchUrlForGroup: URL解析失败，URL配置错误，请检查是否输入为js！");
                return null;
            }
            a aVar = this.f19529a;
            ArrayList<String> arrayList = new ArrayList<>();
            HashMap hashMap = new HashMap();
            v(p, false, aVar, arrayList, 0, hashMap);
            int i2 = -1;
            for (Map.Entry entry : hashMap.entrySet()) {
                int e = e((ArrayList) entry.getKey());
                if (e > i2) {
                    str2 = (String) entry.getValue();
                    i2 = e;
                }
            }
            return str2;
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436d9658", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            v7t.d("URLMATCHER", "setApiGroup: 输入参数为空");
        } else {
            try {
                synchronized (this.c) {
                    ((HashMap) this.c).clear();
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray == null) {
                            v7t.d("URLMATCHER", "setApiGroup: 未能正确获取api组:" + next + ",请检查配置");
                        } else if (optJSONArray.length() == 0) {
                            v7t.i("URLMATCHER", "apiGroup 权限组无权限内容:" + next);
                        } else {
                            ((HashMap) this.c).put(next, optJSONArray);
                        }
                    }
                }
            } catch (Exception e) {
                v7t.d("URLMATCHER", "setApiGroupMap: 发生异常! " + e);
                e.printStackTrace();
                if (this.e) {
                    AppMonitor.Alarm.commitFail("WindVane", y71.MONITOR_MATCH_URL_FAILED, x74.i(e), "配置错误3:ApiGroup异常", e.toString());
                }
            }
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ceb3ac3", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            v7t.d("URLMATCHER", "setUrlRulesMap: 输入参数为空!");
        } else {
            try {
                synchronized (this.b) {
                    ((HashMap) this.b).clear();
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = jSONObject.optString(next, "");
                        if (TextUtils.isEmpty(optString)) {
                            v7t.d("URLMATCHER", "setUrlRulesMap: 未能正确获取权限组:" + next + "的权限,请检查配置");
                        } else {
                            JSONObject jSONObject2 = new JSONObject(optString);
                            HashMap hashMap = new HashMap();
                            Iterator<String> keys2 = jSONObject2.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                String optString2 = jSONObject2.optString(next2);
                                if (TextUtils.isEmpty(optString2)) {
                                    v7t.d("URLMATCHER", "setUrlRulesMap: 未能正确获取权限:" + next2 + "的值,请检查配置");
                                } else {
                                    hashMap.put(next2, optString2);
                                }
                            }
                            ((HashMap) this.b).put(next, hashMap);
                        }
                    }
                }
            } catch (Exception e) {
                v7t.d("URLMATCHER", "setUrlRulesMap: 配置发生异常!" + e);
                e.printStackTrace();
                if (this.e) {
                    AppMonitor.Alarm.commitFail("WindVane", y71.MONITOR_MATCH_URL_FAILED, x74.i(e), "配置错误2:UrlRules错误", e.toString());
                }
            }
        }
    }

    public void w(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8028674a", new Object[]{this, str, str2, str3, new Boolean(z)});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            v7t.d("URLMATCHER", "urlMatcherConfig: 输入参数为空!");
        } else {
            if (z) {
                this.d = true;
            } else if (this.d) {
                return;
            }
            t(str);
            u(str2);
            s(str3);
        }
    }

    public static String[] q(String[] strArr) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d370ba9d", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            v7t.d("URLMATCHER", "reverseStrArray:输入参数为空");
            return null;
        }
        for (int length = strArr.length - 1; i2 < length; length--) {
            String str = strArr[i2];
            strArr[i2] = strArr[length];
            strArr[length] = str;
            i2++;
        }
        return strArr;
    }

    public final boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a15b622", new Object[]{this, str, str2})).booleanValue();
        }
        vpw.b();
        if (!vpw.commonConfig.D0) {
            return false;
        }
        if (TextUtils.equals(str2, "Group_None")) {
            if (ssw.l(str)) {
                if (this.e) {
                    AppMonitor.Alarm.commitFail("WindVane", y71.MONITOR_MATCH_URL_FAILED, str, "12", "api错误地拒绝了");
                }
                v7t.d("URLMATCHER", "api错误地拒绝了" + str);
                return true;
            }
            if (this.e) {
                AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, "4", "非阿里名单拦截");
            }
            v7t.d("URLMATCHER", "非阿里名单拦截 " + str);
        } else if (TextUtils.equals(str2, "Group_All")) {
            if (this.e) {
                AppMonitor.Alarm.commitFail("WindVane", MONITOR_POINT_NEW_SECURITY_ALLOW, str, "3", "允许访问jsbridge");
            }
        } else if (this.e) {
            AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, "5", "非阿里名单拦截 apiGroup=" + str2);
        }
        return false;
    }

    public boolean b(String str, String str2, String str3) {
        JSONArray jSONArray;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a42f3c1", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (vpw.commonConfig.H1 && "WVMega".equals(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            v7t.d("URLMATCHER", "checkApiPermission: 输入参数为空!");
            return false;
        }
        synchronized (this.c) {
            Map<String, JSONArray> map = this.c;
            if (map != null && !((HashMap) map).isEmpty()) {
                String h2 = h(str, "api");
                if (TextUtils.isEmpty(h2)) {
                    v7t.d("URLMATCHER", "checkApiPermission: 未能正确获取api权限组:" + str);
                    return false;
                } else if (a(str, h2)) {
                    return true;
                } else {
                    synchronized (this.c) {
                        jSONArray = (JSONArray) ((HashMap) this.c).get(h2);
                    }
                    if (!(jSONArray == null || jSONArray.length() == 0)) {
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            try {
                                string = jSONArray.getString(i2);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            if ("*".equals(string)) {
                                return true;
                            }
                            int indexOf = string.indexOf(46);
                            if (indexOf > 0 && string.substring(0, indexOf).equals(str2)) {
                                int i3 = indexOf + 1;
                                if ("*".equals(string.substring(i3)) || str3.equals(string.substring(i3))) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            v7t.d("URLMATCHER", "checkApiPermission: apiGroup配置不应为空!");
            return false;
        }
    }

    public final boolean c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f5e4ea1", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        vpw.b();
        if (!vpw.commonConfig.C0) {
            return false;
        }
        if (ssw.i(str)) {
            if (this.e) {
                AppMonitor.Alarm.commitFail("WindVane", y71.MONITOR_MATCH_URL_FAILED, str, "11", "错误地拒绝了");
            }
            v7t.d("URLMATCHER", "错误地拒绝了" + str);
            return true;
        } else if (!z || !ssw.l(str)) {
            return false;
        } else {
            if (this.e) {
                AppMonitor.Alarm.commitFail("WindVane", y71.MONITOR_MATCH_URL_FAILED, str, "13", "ali错误地拒绝了");
            }
            v7t.d("URLMATCHER", "ali错误地拒绝了" + str);
            return true;
        }
    }

    public boolean d(b bVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4da5c514", new Object[]{this, bVar, aVar})).booleanValue();
        }
        if (bVar == null || aVar == null) {
            return false;
        }
        String e = aVar.e();
        String[] strArr = h;
        if (TextUtils.equals(e, strArr[0])) {
            for (String str : strArr) {
                if (!TextUtils.equals(str, bVar.f19531a)) {
                }
            }
            return false;
        } else if (!TextUtils.equals(bVar.f19531a, aVar.e())) {
            return false;
        }
        if (aVar.d().size() == 0) {
            for (int i2 : g) {
                if (i2 != bVar.d) {
                }
            }
            return false;
        } else if (bVar.d < 0) {
            if ("http".equals(bVar.f19531a)) {
                return aVar.d().contains(80);
            }
            if ("https".equals(bVar.f19531a)) {
                return aVar.d().contains(443);
            }
        } else if (!aVar.d().contains(Integer.valueOf(bVar.d))) {
            return false;
        }
        return true;
    }

    public final int e(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4eb1d42", new Object[]{this, arrayList})).intValue();
        }
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (arrayList.get(i3).equals("*") || arrayList.get(i3).equals(f7l.PLUS)) {
                i2--;
            } else {
                if (arrayList.get(i3).equals("/")) {
                    z = true;
                }
                i2 = z ? i2 + 10 : i2 + 1000;
            }
        }
        return i2;
    }

    public final boolean i(a aVar, b bVar, String str) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb5aec25", new Object[]{this, aVar, bVar, str})).booleanValue();
        }
        if (bVar == null || (strArr = bVar.b) == null || strArr.length == 0) {
            v7t.d("URLMATCHER", "insertToTrieTree: 插入节点有误，请检查配置！");
            return false;
        }
        for (String str2 : strArr) {
            String lowerCase = str2.toLowerCase();
            if (aVar.e.containsKey(lowerCase)) {
                aVar = aVar.e.get(lowerCase);
            } else {
                a aVar2 = new a(this, lowerCase, new HashMap());
                aVar.e.put(lowerCase, aVar2);
                aVar = aVar2;
            }
        }
        for (String str3 : bVar.c) {
            String lowerCase2 = str3.toLowerCase();
            if (aVar.e.containsKey(lowerCase2)) {
                aVar = aVar.e.get(lowerCase2);
            } else {
                a aVar3 = new a(this, lowerCase2, new HashMap());
                aVar.e.put(lowerCase2, aVar3);
                aVar = aVar3;
            }
        }
        aVar.f(str);
        aVar.g(bVar.f19531a);
        aVar.c(bVar.d);
        return true;
    }

    public boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2293e7e1", new Object[]{this, str})).booleanValue();
        }
        if (!"allowAll".equalsIgnoreCase(h(str, "open"))) {
            return false;
        }
        if (this.e) {
            AppMonitor.Alarm.commitFail("WindVane", MONITOR_POINT_NEW_SECURITY_ALLOW, str, "4", "allowAll名单允许");
        }
        return true;
    }

    public boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c1c38fe", new Object[]{this, str})).booleanValue();
        }
        if (oyl.PERMISSION_ALLOW.equalsIgnoreCase(h(str, "open"))) {
            if (this.e) {
                AppMonitor.Alarm.commitFail("WindVane", MONITOR_POINT_NEW_SECURITY_ALLOW, str, "1", "允许打开");
            }
            return true;
        }
        if (this.e) {
            AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, "1", "非三方阿里名单拦截");
        }
        return false;
    }

    public boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfe9129d", new Object[]{this, str})).booleanValue();
        }
        String h2 = h(str, "open");
        if (oyl.PERMISSION_ALLOW.equalsIgnoreCase(h2) || "allowAll".equalsIgnoreCase(h2) || "forbidden".equalsIgnoreCase(h2)) {
            if (this.e) {
                AppMonitor.Alarm.commitFail("WindVane", MONITOR_POINT_NEW_SECURITY_ALLOW, str, "2", "三方或阿里名单允许：" + h2);
            }
            return false;
        }
        if (this.e) {
            AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, "2", "非三方名单拦截");
        }
        return !c(str, true);
    }

    public boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e3b0aae", new Object[]{this, str})).booleanValue();
        }
        if (!"forbidden".equalsIgnoreCase(h(str, "open"))) {
            return false;
        }
        if (this.e) {
            AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, "3", "黑名单拦截");
        }
        return true;
    }

    public boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d70e43b", new Object[]{this, str})).booleanValue();
        }
        String h2 = h(str, "open");
        if (oyl.PERMISSION_ALLOW.equalsIgnoreCase(h2)) {
            if (this.e) {
                AppMonitor.Alarm.commitFail("WindVane", MONITOR_POINT_NEW_SECURITY_ALLOW, str, AgooConstants.REPORT_NOT_ENCRYPT, "三方或阿里名单允许：" + h2);
            }
            return true;
        }
        if (this.e) {
            AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, "25", "非三方名单拦截");
        }
        return c(str, true);
    }

    public boolean o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c579ad7", new Object[]{this, str})).booleanValue();
        }
        if (oyl.PERMISSION_ALLOW.equalsIgnoreCase(h(str, "open"))) {
            String h2 = h(str, "api");
            if (TextUtils.equals(h2, "Group_All")) {
                if (this.e) {
                    AppMonitor.Alarm.commitFail("WindVane", MONITOR_POINT_NEW_SECURITY_ALLOW, str, AgooConstants.REPORT_MESSAGE_NULL, "ali域名允许打开");
                }
                return true;
            }
            if (this.e) {
                AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, AgooConstants.REPORT_ENCRYPT_FAIL, "非三方阿里名单拦截");
            }
            return a(str, h2);
        }
        if (this.e) {
            AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, AgooConstants.REPORT_DUPLICATE_FAIL, "非三方阿里名单拦截");
        }
        return a(str, "Group_None");
    }

    public final b p(String str) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ddf7dc2d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            v7t.d("URLMATCHER", "dropUrl: 输入的URL为空!!");
            return null;
        }
        b bVar = new b(this);
        if (str.length() > 2 && str.substring(0, 2).equals(itw.URL_SEPARATOR)) {
            str = new StringBuffer(h[0] + ":" + str).toString();
        }
        try {
            uri = Uri.parse(str);
        } catch (Throwable th) {
            v7t.d("URLMATCHER", "parseUrl: 解析URL出现错误" + th);
            th.printStackTrace();
            if (this.e) {
                AppMonitor.Alarm.commitFail("WindVane", y71.MONITOR_MATCH_URL_FAILED, x74.i(th) + " |||| " + str, "6", "解析URL出现错误");
            }
            uri = null;
        }
        bVar.f19531a = uri.getScheme();
        if (TextUtils.isEmpty(uri.getHost()) || uri.getPath() == null) {
            v7t.d("URLMATCHER", "parseUrl: 输入的URL不符合规范");
            if (this.e) {
                AppMonitor.Alarm.commitFail("WindVane", y71.MONITOR_MATCH_URL_FAILED, str, "7", "解析URL出现错误");
            }
            return null;
        }
        bVar.b = q(uri.getHost().split("\\."));
        String[] split = uri.getPath().split("/");
        bVar.c = split;
        if (split.length > 0 && TextUtils.equals("", split[0])) {
            bVar.c[0] = "/";
        }
        if (bVar.c.length == 0) {
            bVar.c = new String[]{"/"};
        }
        bVar.d = uri.getPort();
        return bVar;
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5de241", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            v7t.d("URLMATCHER", "setUrlPatterns: 输入配置为空");
        } else if ("AllowAllUrl".equals(str)) {
            this.f = true;
            v7t.d("URLMATCHER", "AllowAllUrl");
        } else {
            this.f = false;
            try {
                a aVar = new a(this, "", new HashMap());
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                v7t.d("URLMATCHER", "urlPatterns:" + str);
                if (jSONObject.length() <= 0) {
                    v7t.d("URLMATCHER", "配置错误4:json错误");
                    if (this.e) {
                        AppMonitor.Alarm.commitFail("WindVane", y71.MONITOR_MATCH_URL_FAILED, jSONObject.toString(), "配置错误4:UrlPattern json错误", str);
                    }
                }
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next, "");
                    if (TextUtils.isEmpty(optString)) {
                        v7t.d("URLMATCHER", "setUrlPatterns: 未能正确获取URL:" + next + "的权限组，请检查配置");
                    } else if (!i(aVar, p(next), optString)) {
                        v7t.d("URLMATCHER", "setUrlPatterns: URL insert error! url is:" + next);
                    }
                }
                this.f19529a = aVar;
            } catch (Exception e) {
                v7t.d("URLMATCHER", "setUrlPatterns: catch a exception! " + x74.i(e));
                if (this.e) {
                    AppMonitor.Alarm.commitFail("WindVane", y71.MONITOR_MATCH_URL_FAILED, x74.i(e), "配置错误1:UrlPattern错误", e.toString());
                }
                if (!j) {
                    j = true;
                    t("{\"//beian.miit.gov.cn/*\": \"2\",\"//*.www.aliwork.com/*\":\"2\",\"//*.taobao.com/*\":\"1\",\"//*.tmall.com/*\":\"1\",\"//*.juhuasuan.com/*\":\"1\",\"//*.xiami.com/*\":\"1\",\"//*.amap.com/*\":\"1\",\"//*.taobaocdn.com/*\":\"1\",\"//*.alipay.com/*\":\"1\",\"//*.etao.com/*\":\"1\",\"//*.alibaba.com/*\":\"1\",\"//*.aliyun.com/*\":\"1\",\"//*.alimama.com/*\":\"1\",\"//*.weibo.com/*\":\"1\",\"//*.tanx.com/*\":\"1\",\"//*.laiwang.com/*\":\"1\",\"//*.alicdn.com/*\":\"1\",\"//*.mmstat.com/*\":\"1\",\"//*.yunos.com/*\":\"1\",\"//*.alibaba-inc.com/*\":\"1\",\"//*.alitrip.com/*\":\"1\",\"//*.aliloan.com/*\":\"1\",\"//*.kanbox.com/*\":\"1\",\"//*.wirlesshare.com/*\":\"1\",\"//*.dingtalk.com/*\":\"1\",\"//*.alimei.com/*\":\"1\",\"//*.cnzz.com/*\":\"1\",\"//*.kuaidadi.com/*\":\"1\",\"//*.autonavi.com/*\":\"1\",\"//*.m.yintai.com/*\":\"1\",\"//*.polyinno.com/*\":\"1\",\"//*.spdyidea.com/*\":\"1\",\"//*.h5util.com/*\":\"1\",\"//*.h5tool.com/*\":\"1\",\"//*.5945i.com/*\":\"1\",\"//*.miaostreet.com/*\":\"1\",\"//*.1688.com/*\":\"1\",\"//*.cainiao-inc.com/*\":\"1\",\"//*.cainiao.com/*\":\"1\",\"//*.taohua.com/*\":\"1\",\"//*.m.jiaoyimao.com/*\":\"1\",\"//*.m.dfkhgj.com/*\":\"1\",\"//*.m.edcdfg.com/*\":\"1\",\"//*.liangxinyao.com/*\":\"1\",\"//*.taopiaopiao.com/*\":\"1\",\"//*.fliggy.com/*\":\"1\",\"//*.feizhu.com/*\":\"1\",\"//*.mashangfangxin.com/*\":\"1\",\"//*.youku.com/*\":\"1\",\"//*.im.alisoft.com/*\":\"1\",\"//*.100x100w.com/*\":\"1\",\"//*.koubei.com/*\":\"1\",\"//*.alibabausercontent.com/*\":\"1\",\"//*.hemaos.com/*\":\"1\",\"//*.alihive.com/*\":\"1\",\"//*.jishi.rantu.com/*\":\"1\",\"//*.cdn.rantu.com/*\":\"1\",\"//*.ishuqi.com/*\":\"1\",\"//*.jishi.aligames.com/*\":\"1\",\"//*.aligames.com/*\":\"1\",\"//*.h5.shyhhema.com/*\":\"1\",\"//*.mp.dfkhgj.com/*\":\"1\",\"//*.mp.iuynfg.com/*\":\"1\",\"//*.mp.edcdfg.com/*\":\"1\",\"//*.mp.asczwa.com/*\":\"1\",\"//*.duanqu.com/*\":\"1\",\"//*.y.xevddy.com/*\":\"1\",\"//*.l.xevddy.com/*\":\"1\",\"//*.portalpro.hemaos.com/*\":\"1\",\"//*.h5.shyhhema.com/*\":\"1\",\"//*.shejijia.com/*\":\"1\",\"//*.preview-lyj.aliyuncs.com/*\":\"1\",\"//*.kaola.com/*\":\"1\",\"//*.alimebot.com/*\":\"1\",\"//*.freshhema.com/*\":\"1\",\"//*.h5.tangping.com/*\":\"1\",\"//*.page.cainiao.com/*\":\"1\",\"//*.xunxi.com/*\":\"1\",\"//*.pages.goofish.com/*\":\"1\",\"//*.h5-global.alimebot.com/*\":\"1\",\"//*.tb.cn/*\":\"1\",\"//*.tbcdn.cn/*\":\"1\",\"//*.weibo.cn/*\":\"1\",\"//*.mashort.cn/*\":\"1\",\"//*.mybank.cn/*\":\"1\",\"//*.uc.cn/*\":\"1\",\"//*.feizhu.cn/*\":\"1\",\"//*.alihealth.cn/*\":\"1\",\"//*.alios.cn/*\":\"1\",\"//*.xixi.fullspeed.cn/*\":\"1\",\"//*.image.9game.cn/*\":\"1\",\"//*.pass.alios.cn/*\":\"1\",\"//*.m.damai.cn/*\":\"1\",\"//*.p.damai.cn/*\":\"1\",\"//*.damai.cn/*\":\"1\",\"//*.taopiaopiao.cn/*\":\"1\",\"//*.m.piao.cn/*\":\"1\",\"//*.s.piao.cn/*\":\"1\",\"//*.market.wapa.piao.cn/*\":\"1\",\"//*.hemashare.cn/*\":\"1\",\"//*.fastidea.me/*\":\"1\",\"//*.fastidea.cc/*\":\"1\",\"//*.juzone.me/*\":\"1\",\"//*.juzone.cc/*\":\"1\",\"//*.r.daily.elenet.me/*\":\"1\",\"//*.ppe-r.elenet.me/*\":\"1\",\"//*.ppe-r.ele.me/*\":\"1\",\"//*.r.elenet.me/*\":\"1\",\"//*.r.ele.me/*\":\"1\",\"//*.lwurl.to/*\":\"1\",\"//*.taobao.net/*\":\"1\",\"//*.alipay.net/*\":\"1\",\"//*.cnzz.net/*\":\"1\",\"//*.fliggy.net/*\":\"1\",\"//*.feizhu.net/*\":\"1\",\"//*.tmall.net/*\":\"1\",\"//*.tdd.la/*\":\"1\",\"//*.yao.95095.com/*\":\"1\",\"//*.tmall.hk/*\":\"1\",\"//*.alipay.hk/*\":\"1\",\"//*.fliggy.hk/*\":\"1\",\"//*.ahd.so/*\":\"1\",\"//*.atb.so/*\":\"1\",\"//*.mshare.cc/*\":\"1\",\"//*.juhs.me/*\":\"1\",\"//*.xianyu.mobi/*\":\"1\",\"//*.ynuf.aliapp.org/*\":\"1\",\"//*.doctoryou.ai/*\":\"1\",\"//*.h5.ele.me/*\":\"1\",\"//*.tb.ele.me/*\":\"1\",\"//*.lemon.ele.me/*\":\"1\",\"//*.lemon.faas.ele.me/*\":\"1\",\"//*.marketing-feast.faas.ele.me/*\":\"1\",\"//*.gw.alipayobjects.com/as/g/memberAsset/zfb-tbcard/*\":\"1\",\"//*.t-series-act.faas.ele.me/*\":\"1\",\"//*.2018-bill.faas.ele.me/*\":\"1\",\"//*.wegame-web-daily.uc.test/*\":\"1\",\"//*.tb.pub/*\":\"1\",\"//*.jsplayground.taobao.org/*\":\"1\",\"//*.www.yuque.com/tbzb/help/*\":\"1\",\"//*.zmcreditprod.zmxy.com.cn/contractb2c/index.htm/*\":\"1\",\"//*.ppe-h5.ele.me/*\":\"1\",\"//*.survey.taobao.tw/*\":\"1\",\"//*.fc.ele.me/*\":\"1\",\"//*.lazada.com.my/*\":\"1\",\"//*.ppt-tb.ele.me/*\":\"1\",\"//*.pre-tb.ele.me/*\":\"1\",\"//*.taobao.tw/*\":\"1\",\"//*.taobao.hk/*\":\"1\",\"//*.taobao.global/*\":\"1\",\"//*.orderrefund-next.ele.me/*\":\"1\",\"//*.ppe-orderrefund-next.ele.me/*\":\"1\",\"//*.s.click.ele.me/*\":\"1\",\"//*.web.ele.me/*\":\"1\",\"//*.pre-web.ele.me/*\":\"1\",\"//*.ppe-fc.ele.me/*\":\"1\",\"//*.5317wan.com/*\":\"2\",\"//*.guahao.com/*\":\"2\",\"//*.wap.wandafilm.com/*\":\"2\",\"//*.wrating.com/*\":\"2\",\"//*.alipayobjects.com/*\":\"2\",\"//*.hft.evergrande.com/*\":\"2\",\"//*.app.evergrande.com/*\":\"2\",\"//*.jmt.wxcsgd.com/*\":\"2\",\"//*.mpay.cx580.com/*\":\"2\",\"//*.mt.locojoy.com/*\":\"2\",\"//*.cpa1.locojoy.com/*\":\"2\",\"//*.miiee.com/*\":\"2\",\"//*.imaijia.com/*\":\"2\",\"//*.h5.edaijia.cn/*\":\"2\",\"//*.beta.library.sh.cn/*\":\"2\",\"//*.web.chelaile.net.cn/*\":\"2\",\"//*.app3.shmzj.gov.cn/*\":\"2\",\"//*.bsfw.qingdao.gov.cn/*\":\"2\",\"//*.www.hzpolice.gov.cn/*\":\"2\",\"//*.www.sxgajj.gov.cn/*\":\"2\",\"//*.service.zjzwfw.gov.cn/*\":\"2\",\"//*.people.com.cn/*\":\"2\",\"//*.hbjg.premier-tech.cn/*\":\"2\",\"//*.aliplay.net/*\":\"2\",\"//*.ali.hk515.net/*\":\"2\",\"//*.tmall.pp.cc/*\":\"2\",\"//*.portal-h5.hemayx.cn/*\":\"1\"}");
                }
            }
        }
    }

    static {
        t2o.a(989855796);
    }

    public final void v(b bVar, boolean z, a aVar, ArrayList<String> arrayList, int i2, Map<ArrayList<String>, String> map) {
        String str;
        int i3;
        boolean z2;
        String str2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08c4357", new Object[]{this, bVar, new Boolean(z), aVar, arrayList, new Integer(i2), map});
        } else if (bVar != null && aVar != null) {
            if (a.a(aVar) != null && z) {
                if (i2 == bVar.c.length) {
                    if (a.b(aVar) != null && d(bVar, aVar)) {
                        map.put(new ArrayList<>(arrayList), a.b(aVar));
                    }
                    Map<String, a> map2 = aVar.e;
                    if (map2 != null && map2.containsKey("*") && a.b(aVar.e.get("*")) != null && d(bVar, aVar.e.get("*"))) {
                        arrayList.add("*");
                        map.put(new ArrayList<>(arrayList), a.b(aVar.e.get("*")));
                        arrayList.remove("*");
                        return;
                    }
                    return;
                } else if (TextUtils.equals(a.a(aVar), "/") && a.b(aVar) != null && d(bVar, aVar)) {
                    map.put(new ArrayList<>(arrayList), a.b(aVar));
                }
            }
            if (z) {
                str = bVar.c[i2];
            } else {
                str = bVar.b[i2];
            }
            String lowerCase = str.toLowerCase();
            if (aVar.e.containsKey(lowerCase)) {
                int i7 = i2 + 1;
                arrayList.add(lowerCase);
                if (z || i7 != bVar.b.length) {
                    z2 = z;
                    i6 = i7;
                } else {
                    z2 = true;
                    i6 = 0;
                }
                str2 = lowerCase;
                v(bVar, z2, aVar.e.get(lowerCase), arrayList, i6, map);
                int i8 = i6 - 1;
                if (i8 < 0) {
                    i3 = bVar.b.length - 1;
                    z2 = false;
                } else {
                    i3 = i8;
                }
                arrayList.remove(str2);
            } else {
                str2 = lowerCase;
                z2 = z;
                i3 = i2;
            }
            if (aVar.e.containsKey(f7l.PLUS)) {
                if (!z2) {
                    i5 = 0;
                    z3 = true;
                } else {
                    z3 = z2;
                    i5 = bVar.c.length;
                }
                arrayList.add(f7l.PLUS);
                v(bVar, z3, aVar.e.get(f7l.PLUS), arrayList, i5, map);
                arrayList.remove(f7l.PLUS);
                if (i5 == 0) {
                    z3 = false;
                }
            } else {
                z3 = z2;
            }
            if (!aVar.e.containsKey("*")) {
                return;
            }
            if (!z3 || i3 != 0 || !TextUtils.equals(str2, "/")) {
                if (!z3) {
                    z3 = true;
                    i4 = 0;
                } else {
                    i4 = bVar.c.length;
                }
                arrayList.add("*");
                v(bVar, z3, aVar.e.get("*"), arrayList, i4, map);
                arrayList.remove("*");
                return;
            }
            arrayList.add("*");
            v(bVar, z3, aVar.e.get("*"), arrayList, i3, map);
            arrayList.remove("*");
        }
    }
}
