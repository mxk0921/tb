package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPReachViewOpenState;
import com.taobao.android.external.UCPReachViewState;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class arp implements dsu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String GROUP_NAME = "PageShopReachView";
    public static final String MATERIAL_ID_KEY = "materialNumId";

    /* renamed from: a  reason: collision with root package name */
    public final ShopDataParser f15964a;
    public final ConcurrentHashMap<String, JSONObject> b = new ConcurrentHashMap<>();
    public k3e c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766509485);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(766509484);
        t2o.a(404750685);
    }

    public arp(ShopDataParser shopDataParser) {
        ckf.g(shopDataParser, "shopData");
        this.f15964a = shopDataParser;
    }

    public final k3e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k3e) ipChange.ipc$dispatch("7f2b0cdd", new Object[]{this});
        }
        return this.c;
    }

    public final void b() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9c2bd3", new Object[]{this});
            return;
        }
        try {
            for (Map.Entry<String, JSONObject> entry : this.b.entrySet()) {
                UCPReachViewState uCPReachViewState = new UCPReachViewState();
                uCPReachViewState.group = GROUP_NAME;
                uCPReachViewState.key = esu.KEY_TERMINAL;
                uCPReachViewState.code = 2;
                uCPReachViewState.trackInfo = entry.getValue();
                k3e a2 = a();
                if (a2 != null) {
                    a2.a(uCPReachViewState);
                }
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    public final void c(JSONObject jSONObject) {
        Object obj;
        String string;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fffcceb", new Object[]{this, jSONObject});
        } else if (this.f15964a.b0() && jSONObject != null) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                if (!(jSONObject3 == null || (string = jSONObject3.getString(MATERIAL_ID_KEY)) == null || (jSONObject2 = this.b.get(string)) == null)) {
                    String string2 = jSONObject3.getString("key");
                    String string3 = jSONObject3.getString("code");
                    Integer m = string3 == null ? null : ssq.m(string3);
                    if (m != null) {
                        int intValue = m.intValue();
                        UCPReachViewState uCPReachViewState = new UCPReachViewState();
                        uCPReachViewState.group = GROUP_NAME;
                        uCPReachViewState.key = string2;
                        uCPReachViewState.code = intValue;
                        uCPReachViewState.trackInfo = jSONObject2;
                        String string4 = jSONObject3.getString("msg");
                        if (string4 == null) {
                            string4 = "";
                        }
                        uCPReachViewState.msg = string4;
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("debugInfo");
                        if (jSONObject4 == null) {
                            jSONObject4 = new JSONObject();
                        }
                        uCPReachViewState.debugInfo = jSONObject4;
                        JSONObject jSONObject5 = jSONObject3.getJSONObject("bizInfo");
                        if (jSONObject5 == null) {
                            jSONObject5 = new JSONObject();
                        }
                        uCPReachViewState.bizInfo = jSONObject5;
                        k3e a2 = a();
                        if (a2 != null) {
                            a2.a(uCPReachViewState);
                        }
                    }
                }
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
        }
    }

    @Override // tb.dsu
    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.f15964a.b0();
    }

    @Override // tb.dsu
    public void registerStateSynchronizer(k3e k3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c829a601", new Object[]{this, k3eVar});
        } else {
            this.c = k3eVar;
        }
    }

    @Override // tb.dsu
    public UCPReachViewOpenState openReachView(JSONObject jSONObject, JSONObject jSONObject2) {
        String string;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCPReachViewOpenState) ipChange.ipc$dispatch("6afe6146", new Object[]{this, jSONObject, jSONObject2});
        }
        if (jSONObject == null) {
            string = null;
        } else {
            try {
                string = jSONObject.getString(MATERIAL_ID_KEY);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(b.a(th));
            }
        }
        if (!(string == null || jSONObject2 == null)) {
            this.b.put(string, jSONObject2);
        }
        c(brf.a(jpu.a("data", brf.a(jpu.a("key", "ShopReceiver"), jpu.a("code", 0), jpu.a(MATERIAL_ID_KEY, string)))));
        ShopExtKt.X(this.f15964a, jSONObject);
        obj = Result.m1108constructorimpl(xhv.INSTANCE);
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
        return UCPReachViewOpenState.OPEN;
    }
}
