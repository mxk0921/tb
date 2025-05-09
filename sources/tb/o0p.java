package tb;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayMap<String, SearchBarHintBean> f25068a = new ArrayMap<>();

    static {
        t2o.a(815793086);
    }

    public void a(String str, SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db91e99", new Object[]{this, str, searchBarHintBean});
        } else if (TextUtils.isEmpty(str)) {
            b4p.b("SearchBarHintManager", "addSearchBarHint tab is empty");
        } else if (searchBarHintBean == null) {
            b4p.b("SearchBarHintManager", "searchBarHint is null");
        } else {
            this.f25068a.put(str, searchBarHintBean);
        }
    }

    public SearchBarHintBean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarHintBean) ipChange.ipc$dispatch("2a1af3b8", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.f25068a.get(str);
        }
        b4p.b("SearchBarHintManager", "getSearchBarHint tab is empty");
        return null;
    }
}
