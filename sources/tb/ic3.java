package tb;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.TBMainHost;
import java.util.HashMap;
import java.util.Map;
import tb.ub3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ic3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CartPerformance";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21227a = true;
    public static Map<String, Boolean> b = null;

    static {
        t2o.a(479199496);
    }

    public static void a(Context context, String str, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50762e64", new Object[]{context, str, new Boolean(z)});
            return;
        }
        if (z && Login.checkSessionValid()) {
            z2 = false;
        }
        z9v.u(context).t(str, z2, null);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4992905f", new Object[0])).booleanValue();
        }
        return f21227a;
    }

    public static void d(Context context, zxb zxbVar, Fragment fragment, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6489ea20", new Object[]{context, zxbVar, fragment, recyclerView});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            pb3.d(context, recyclerView);
            f(context, fragment, recyclerView);
            z9v.u(context).l("apmClientContainerRender", currentTimeMillis, false, null);
        } finally {
            f21227a = false;
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77cc27c3", new Object[0]);
        }
    }

    public static void f(Context context, Fragment fragment, RecyclerView recyclerView) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668096a2", new Object[]{context, fragment, recyclerView});
            return;
        }
        if (!(fragment == null || recyclerView == null)) {
            try {
                boolean z = recyclerView.getChildAt(((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition()) instanceof RecyclerView;
                if (z) {
                    str = "itemCountNoMoreThan3";
                } else {
                    str = "itemCountMoreThan3";
                }
                z9v u = z9v.u(context);
                if (z) {
                    str2 = "有信息流";
                } else {
                    str2 = "无信息流";
                }
                u.e(na3.sKeyRecommendShotAtFirstScreen, str2);
                vxm.b.j(fragment).a("bizStage", str);
            } catch (Exception unused) {
            }
        }
    }

    public static void g(String str, RequestConfig requestConfig, String str2, String str3, boolean z) {
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44a55c4", new Object[]{str, requestConfig, str2, str3, new Boolean(z)});
            return;
        }
        if (b == null) {
            b = new HashMap();
        }
        String name = requestConfig.i().name();
        if (RequestConfig.RequestType.QUERY_CART_PAGE == requestConfig.i()) {
            Boolean bool = (Boolean) ((HashMap) b).get(name);
            if (bool == null || !bool.booleanValue()) {
                str5 = "首次";
            } else {
                str5 = "非首次";
            }
            str4 = str5 + name;
        } else {
            str4 = name;
        }
        ((HashMap) b).put(name, Boolean.TRUE);
        ub3.i(ub3.b.o(str4, z).n(str).m(System.currentTimeMillis() - requestConfig.j()).b(str2).message(str3).sampling(z ? 0.01f : 1.0f));
    }

    public static z9v i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9v) ipChange.ipc$dispatch("d633d309", new Object[]{context, str});
        }
        return j(context, str, System.currentTimeMillis());
    }

    public static z9v j(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9v) ipChange.ipc$dispatch("f95204db", new Object[]{context, str, new Long(j)});
        }
        z9v u = z9v.u(context);
        if (!u.c(str)) {
            return u;
        }
        u.o(str, j);
        try {
            h(context, str, u);
        } catch (Throwable unused) {
        }
        return u;
    }

    public static void b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea33f35e", new Object[]{context, str, new Boolean(z)});
            return;
        }
        z9v u = z9v.u(context);
        u.e("onlyRefreshFooter", "true");
        u.B("apmClientContainerRender", false, null);
        a(context, str, z);
    }

    public static void h(Context context, String str, z9v z9vVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eab1aaf", new Object[]{context, str, z9vVar});
        } else if ("mtop.trade.query.bag".equals(str)) {
            String valueOf = String.valueOf(c());
            z9vVar.e("isColdStart", valueOf);
            z9vVar.e("isLoadFromCache", "false");
            z9vVar.a("是否冷启", "", valueOf);
            z9vVar.b("命中预热", "fromPrefetch", "");
            z9vVar.b("命中缓存", "isLoadFromCache", "");
            if (TBMainHost.b().getContext() == context) {
                z = true;
            }
            z9vVar.a("主Tab", "", String.valueOf(z));
            m9v d = m9v.d(c9x.CART_BIZ_NAME);
            String l = d.l("lastAppVersion");
            String a2 = scv.a();
            z9vVar.q("安装后首次使用", Boolean.valueOf(true ^ a2.equals(l)));
            d.s("lastAppVersion", a2);
        }
    }
}
