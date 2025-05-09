package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f5p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SearchResult f19032a;
    public m1p b;
    public Map<String, String> c;

    static {
        t2o.a(993001946);
    }

    public static f5p a(SearchResult searchResult, m1p m1pVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f5p) ipChange.ipc$dispatch("1a752847", new Object[]{searchResult, m1pVar, map});
        }
        f5p f5pVar = new f5p();
        f5pVar.f19032a = searchResult;
        f5pVar.b = m1pVar;
        f5pVar.c = map;
        return f5pVar;
    }
}
