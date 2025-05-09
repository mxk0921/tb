package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21692a;
    public final SearchBarHintBean b;

    static {
        t2o.a(815793258);
    }

    public j0p(String str, SearchBarHintBean searchBarHintBean) {
        this.f21692a = str;
        this.b = searchBarHintBean;
    }

    public static j0p a(String str, SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j0p) ipChange.ipc$dispatch("46a855ef", new Object[]{str, searchBarHintBean});
        }
        return new j0p(str, searchBarHintBean);
    }
}
