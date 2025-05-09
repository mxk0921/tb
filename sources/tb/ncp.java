package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ncp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_INTIMERECMINGAP = "inTimeRecMinGap";
    public static final String CONFIG_KEY_SLIDEDOWNGUIDE = "slideDownGuideConfig";
    public int A;
    public int B;
    public boolean C;
    public String D;
    public String E;
    public boolean F;
    public Map<String, Map<String, Object>> G;
    public boolean H;
    public Map<String, Map<String, Object>> I;
    public Map<String, Object> J;
    public Map<String, Object> K;
    public final qq6 L;
    public boolean M;

    /* renamed from: a  reason: collision with root package name */
    public String f24645a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public String f;
    public String g;
    public boolean h;
    public int i;
    public String j;
    public boolean k;
    public String l;
    public String m;
    public Map<String, Object> n;
    public boolean o;
    public String p;
    public String q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public String w;
    public String x;
    public int y;
    public boolean z;

    static {
        t2o.a(468714183);
    }

    public ncp(qq6 qq6Var) {
        this.L = qq6Var;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd494507", new Object[]{this})).booleanValue();
        }
        Map<String, Object> map = this.n;
        if (map != null) {
            Object obj = map.get("dynamicRecommend");
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get("config");
                if (!(obj2 instanceof Map)) {
                    try {
                        obj2 = JSON.parseObject(obj2.toString());
                    } catch (Exception unused) {
                    }
                }
                if (obj2 instanceof Map) {
                    Map map2 = (Map) obj2;
                    if (map2.containsKey("isOpen")) {
                        return nwv.o(map2.get("isOpen"), false) & this.k;
                    }
                }
            }
        }
        return this.k;
    }

    public Map<String, Object> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("507a6ebf", new Object[]{this, str});
        }
        Map<String, Map<String, Object>> map = this.G;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final Map<String, Map<String, Object>> c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c6b92cba", new Object[]{this, map});
        }
        Object obj = map.get("abConfig");
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public boolean d(String str, boolean z) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbdbfb0a", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Map<String, Map<String, Object>> map2 = this.G;
        if (map2 != null) {
            map = map2.get(str);
        } else {
            map = null;
        }
        return nwv.o(map, z);
    }

    public final boolean e(Map<String, Object> map, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a122e444", new Object[]{this, map, str, new Boolean(z)})).booleanValue();
        }
        if (map.containsKey("android-" + str)) {
            return vt6.c(map, "android-" + str, z);
        } else if (map.containsKey(str)) {
            return vt6.c(map, str, z);
        } else {
            return z;
        }
    }

    public final Map<String, Map<String, Object>> f(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a2308ce7", new Object[]{this, map});
        }
        Object obj = map.get("collectionPopupPanel");
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public Map<String, Object> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7d126180", new Object[]{this});
        }
        return this.K;
    }

    public Map h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1c86ed24", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.l)) {
            try {
                String str = this.l;
                hashMap.put(str, cxw.a(str, "version"));
            } catch (Throwable unused) {
            }
        }
        if (!TextUtils.isEmpty(this.m)) {
            try {
                String str2 = this.m;
                hashMap.put(str2, cxw.a(str2, "version"));
            } catch (Throwable unused2) {
            }
        }
        return hashMap;
    }

    public Map<String, Object> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1acdcd3", new Object[]{this});
        }
        if (this.J == null) {
            return b("halfScreenConfig_android");
        }
        ir9.b("PickPreloadControllerNew", "下滑 新协议。");
        return (Map) this.J.get("halfScreenConfig");
    }

    public int j() {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd485aa6", new Object[]{this})).intValue();
        }
        Map<String, Map<String, Object>> map2 = this.G;
        if (map2 != null) {
            map = map2.get(CONFIG_INTIMERECMINGAP);
        } else {
            map = null;
        }
        return nwv.t(map, 0);
    }

    public int k(Map<String, Object> map, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af0976a9", new Object[]{this, map, str, new Integer(i)})).intValue();
        }
        if (map.containsKey("android-" + str)) {
            return nwv.t(map.get("android-" + str), i);
        } else if (map.containsKey(str)) {
            return nwv.t(map.get(str), i);
        } else {
            return i;
        }
    }

    public Map<String, Object> l(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cfd95495", new Object[]{this, map, str});
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final String m(Map<String, Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f1a58d7", new Object[]{this, map, str, str2});
        }
        if (map.containsKey("android-" + str)) {
            return nwv.I(map.get("android-" + str), str2);
        } else if (map.containsKey(str)) {
            return nwv.I(map.get(str), str2);
        } else {
            return str2;
        }
    }

    public void n(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f423a22", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            VideoControllerManager.u(m(map, "bitrateOptiConfig", null));
        }
    }

    public void p(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f57056e9", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.n = map;
            this.L.onServerConfigChanged(this);
        }
    }

    public void o(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8424d3", new Object[]{this, map});
        } else if (map != null) {
            igs.a("updateConfig");
            this.K = map;
            this.d = e(map, "disableRecommend", false);
            this.M = e(map, "disableInTimeRecommend", false);
            this.h = e(map, "recommendlistDisableInTimeRecommend", false);
            e(map, "followlistDisableInTimeRecommend", false);
            this.e = e(map, "disableSlide", false);
            Map<String, Object> l = l(map, CONFIG_KEY_SLIDEDOWNGUIDE);
            this.J = l;
            if (l != null) {
                this.f = m(l, "carousel", null);
                ir9.b("PickPreloadControllerNew", "下滑 新协议。carousel=" + this.f);
            } else {
                this.f = m(map, "carousel", null);
            }
            m(map, "interactTNodeDSLv2", null);
            if (akt.B0()) {
                this.f24645a = gol.h(null, "page_fullpage", false).d;
            } else {
                this.f24645a = m(map, "interactTNodeDSLv3", null);
            }
            m(map, "interactBgTNodeDSL", null);
            m(map, "openWeexInteractURL", null);
            this.b = m(map, "openWeexDSLV2", null);
            m(map, "openWeexGlobalDSLV2", null);
            m(map, "openWeexBridgeTNodeDSL", null);
            m(map, "goodsListUrl", null);
            this.c = m(map, "openGlobalH5DSL", null);
            m(map, "albumDetailTNodeDSL", null);
            m(map, "likedUrl", null);
            m(map, "notifyUrl", null);
            m(map, "searchUrl", null);
            m(map, "personalHomePageUrl", null);
            m(map, "collectionCarouselInterval", "3");
            this.g = m(map, "businessSceneId", null);
            this.i = k(map, "inTimeRecThreshold", 10);
            this.j = m(map, "doubleClickLikeImageUrl", null);
            this.k = e(map, "enableEdgeCompute", false);
            k(map, "moduleExecInterval", 1000);
            k(map, "hiddenBufferSize", 10);
            m(map, "dynamicRecommendSolution", null);
            this.l = m(map, "dynamicRecommendModelName", null);
            m(map, "reRankSolution", null);
            this.m = m(map, "reRankModelName", null);
            this.o = e(map, "showFollowing", false);
            e(map, "showFollowingRedDot", false);
            e(map, "inactiveUser", false);
            m(map, "slideDownGuide", null);
            this.p = m(map, "subType", null);
            this.q = m(map, "cdnType", null);
            e(map, "disableSendComment", false);
            this.r = e(map, "enableUpAction", false);
            this.s = e(map, "hiddenMoreIcon", false);
            k(map, "preloadPlayTime", 5);
            k(map, "preloadCacheCount", 0);
            k(map, "preloadCacheSize", 1);
            this.t = k(map, "recFeedbackCount", 0);
            k(map, "slideDownGuideCount", 1);
            e(map, "showEdgeLogInfo", false);
            this.u = e(map, "enableRecRecall", false);
            this.v = e(map, "enableSendAddList", false);
            this.w = m(map, "commonMuteCountdown", null);
            this.x = m(map, "commonShowMuteTips", null);
            this.y = k(map, "commonMuteFatigue", -1);
            this.z = e(map, "enablePlayRate", false);
            k(map, "playRateGuideTimeout", 0);
            e(map, "enablePlayFeedback", false);
            this.A = k(map, "playBufferedTimeout", 500);
            this.B = k(map, "playStartSlowTimeout", 5000);
            this.C = e(map, "graymaskSwitch", false);
            n(map);
            this.D = m(map, "topRightIcon", null);
            this.E = m(map, "topRightType", null);
            this.F = e(map, "tab2FrameworkRefactor", false);
            this.G = c(map);
            this.H = e(map, "collectionPage", true);
            this.I = f(map);
            this.L.onServerConfigChanged(this);
            igs.c();
        }
    }
}
