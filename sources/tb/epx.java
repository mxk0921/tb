package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class epx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f18751a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478151195);
        }

        public a() {
        }

        @JvmStatic
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55c9362a", new Object[]{this});
            } else {
                epx.a().clear();
            }
        }

        public final List<String> b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a39264d8", new Object[]{this, str, str2});
            }
            ckf.g(str, "key");
            ckf.g(str2, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray parseArray = JSON.parseArray(vav.g(c9x.CART_BIZ_NAME, str, str2));
                int size = parseArray.size();
                for (int i = 0; i < size; i++) {
                    String obj = parseArray.get(i).toString();
                    if (!wsq.a0(obj)) {
                        arrayList.add(obj);
                    }
                }
            } catch (Exception e) {
                hav.d(c9x.CART_BIZ_NAME, "getZCacheListFromOrange error msg=" + e.getMessage());
            }
            return arrayList;
        }

        public final void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("176562b0", new Object[]{this, str});
                return;
            }
            ckf.g(str, "packageName");
            d(str, yz3.m(str));
        }

        public final void d(String str, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4188fa1", new Object[]{this, str, list});
                return;
            }
            try {
                if (!epx.a().contains(str)) {
                    if (!q93.b()) {
                        hav.i(c9x.CART_BIZ_NAME, "zcache didn't prefetch because ABTest not hit");
                        return;
                    }
                    yox.o(list, c9x.CART_BIZ_NAME);
                    epx.a().add(str);
                }
            } catch (Exception e) {
                ub3.g("zcachePrefetchError", "list=" + list + ',' + e.getMessage());
            }
        }

        @JvmStatic
        public final void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4047cb5", new Object[]{this});
            } else {
                d("zCachePrefetchUnconditional", b("zCachePrefetchUnconditional", "[\"icart-group-list2-pricetrend\"]"));
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(478151194);
    }

    public static final /* synthetic */ List a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("912b080", new Object[0]);
        }
        return f18751a;
    }

    @JvmStatic
    public static final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c9362a", new Object[0]);
        } else {
            Companion.a();
        }
    }

    @JvmStatic
    public static final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4047cb5", new Object[0]);
        } else {
            Companion.e();
        }
    }
}
