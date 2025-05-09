package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.Map;
import tb.r5j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b54 extends psi<frh, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public c11 d;

    static {
        t2o.a(815793392);
    }

    public b54(yko ykoVar, xno xnoVar) {
        super(ykoVar, xnoVar);
    }

    public static /* synthetic */ Object ipc$super(b54 b54Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/datasource/CommonBaseSearchResultAdapter");
    }

    @Override // tb.psi
    public r5j.a B(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r5j.a) ipChange.ipc$dispatch("91c0f517", new Object[]{this, map});
        }
        if (this.d == null) {
            return new r5j.a("mtop.taobao.wsearch.appsearch", "1.0", "wsearch");
        }
        c11 c11Var = this.d;
        return new r5j.a(c11Var.f16765a, c11Var.b, c11Var.c);
    }

    public void F(c11 c11Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac5d92e", new Object[]{this, c11Var});
        } else {
            this.d = c11Var;
        }
    }

    @Override // tb.q02, tb.hy
    public r7b e(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r7b) ipChange.ipc$dispatch("3069cb56", new Object[]{this, map});
        }
        String a2 = d4p.a("66_24.2" + map.get("q") + map.get("page"));
        if ("true".equals(map.get(r4p.KEY_GOOD_PRICE))) {
            str = "https://cdn-hjb-search.alibaba.com/watchcat-z-1111/";
        } else {
            str = "https://cdn-watchcat.s.taobao.com/watchcat-z-66/";
        }
        String str2 = str + a2 + q2s.JSON;
        c4p.D("[requestFallback]", "请求兜底url:%s", str2);
        return new r7b(str2);
    }
}
