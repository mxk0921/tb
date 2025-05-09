package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SearchBarHintBean f22330a;

    static {
        t2o.a(815793259);
    }

    public k0p(SearchBarHintBean searchBarHintBean) {
        this.f22330a = searchBarHintBean;
    }

    public static k0p a(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k0p) ipChange.ipc$dispatch("8ed02f90", new Object[]{searchBarHintBean});
        }
        return new k0p(searchBarHintBean);
    }
}
