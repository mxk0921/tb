package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SearchBarHintBean f23041a;

    static {
        t2o.a(815793260);
    }

    public l0p(SearchBarHintBean searchBarHintBean) {
        this.f23041a = searchBarHintBean;
    }

    public static l0p a(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l0p) ipChange.ipc$dispatch("b2cc4146", new Object[]{searchBarHintBean});
        }
        return new l0p(searchBarHintBean);
    }
}
