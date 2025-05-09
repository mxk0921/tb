package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import java.util.Map;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o2h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25095a = false;
    public int b = 600;
    public int c = ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;

    static {
        t2o.a(779092165);
    }

    public o2h() {
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8eb54a78", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29210db6", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e10a16", new Object[]{this, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = null;
            if (!sz3.b(jSONObject)) {
                Map z = nwv.z(jSONObject.get("prefetchConfig"), null);
                if (!sz3.b(z)) {
                    jSONObject2 = (JSONObject) z;
                    tfs.e("LivePreloadABConfig", "initABConfig,优先从preloadArgs读取");
                }
            }
            if (sz3.b(jSONObject2)) {
                jSONObject2 = (JSONObject) ggs.a("TAB2_LIVE_ROOM_RED_POINT_PRELOAD_CONFIG");
            } else {
                ggs.e("TAB2_LIVE_ROOM_RED_POINT_PRELOAD_CONFIG", jSONObject2);
            }
            if (!sz3.b(jSONObject2)) {
                f(jSONObject2);
            }
        } catch (Throwable th) {
            tfs.e("LivePreloadABConfig", "initAndUpdateABConfig读取AB配置异常" + th.getMessage());
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("847eae7b", new Object[]{this})).booleanValue();
        }
        return this.f25095a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LivePreloadABConfig{enableRecommendPreload=" + this.f25095a + ", preloadLiveStatusCheckInterval=" + this.b + ", preloadForceRefreshRecommendInterval=" + this.c + '}';
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b32ad85", new Object[]{this})).booleanValue();
        }
        return akt.p2("tblive.enableRecommendPreload", true);
    }

    public final void f(JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc67f", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (!sz3.b(jSONObject)) {
                Map z2 = nwv.z(jSONObject.get("abConfig"), null);
                if (!sz3.b(z2)) {
                    Map z3 = nwv.z(z2.get("livePreloadConfig"), null);
                    if (!sz3.b(z3)) {
                        if (!a() || !nwv.o(z3.get("enable_live_recommend_preload"), false)) {
                            z = false;
                        }
                        this.f25095a = z;
                        int nextInt = new Random().nextInt(100);
                        tfs.e("LivePreloadABConfig", "生成的随机数：" + nextInt);
                        this.b = nwv.t(z3.get("preload_live_status_check_interval"), 600) + nextInt;
                        this.c = nwv.t(z3.get("preload_force_refresh_recommend_interval"), ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
                        tfs.e("LivePreloadABConfig", "ABTest:" + this);
                    }
                }
            }
        } catch (Throwable th) {
            tfs.e("LivePreloadABConfig", "initAndUpdateABConfig读取AB配置异常" + th.getMessage());
        }
    }

    public o2h(JSONObject jSONObject) {
        d(jSONObject);
    }
}
