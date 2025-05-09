package tb;

import android.net.Uri;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class sf3 extends nx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792597);
    }

    public static /* synthetic */ Object ipc$super(sf3 sf3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/CategoryPreloadHandler");
    }

    @Override // tb.nx
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return "mtop.relationrecommend.WirelessRecommend.recommend";
    }

    @Override // tb.nx
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return "2.0";
    }

    @Override // tb.nx
    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e2dff593", new Object[]{this});
        }
        return a.k(jpu.a("appId", "31198"));
    }

    @Override // tb.nx
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eda8c7e2", new Object[]{this});
        }
        return "category";
    }

    @Override // tb.nx
    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("18244dab", new Object[]{this});
        }
        return a.k(jpu.a("biz", "cateHome"), jpu.a("type", MainRequestParams.INDUSTRY), jpu.a("p2app", "taobao"), jpu.a("n", "10"), jpu.a(o65.SPM_A, "a2141"), jpu.a(o65.SPM_B, "categorytab"), jpu.a(RequestConfig.IS_ICART_IS_FIRST_REQUEST, "true"), jpu.a("sversion", j3p.g().g().a()), jpu.a("tabIndex", "1"), jpu.a("page", "1"), jpu.a("preload", "true"));
    }

    @Override // tb.nx
    public boolean g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23fdc016", new Object[]{this, uri})).booleanValue();
        }
        ckf.g(uri, "data");
        String path = uri.getPath();
        ckf.f(path, "getPath(...)");
        return wsq.O(path, "weex-category-page", false, 2, null);
    }
}
