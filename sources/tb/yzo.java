package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.SearchApiModel;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class yzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final yzo INSTANCE = new yzo();

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, SearchApiModel> f32432a = new HashMap<>();
    public static final HashMap<String, HashMap<String, String>> b = new HashMap<>();

    static {
        t2o.a(815793498);
    }

    public final void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972ce353", new Object[]{this, str, hashMap});
            return;
        }
        ckf.g(str, "biz");
        ckf.g(hashMap, "api");
        b.put(str, hashMap);
    }

    public final void b(String str, SearchApiModel searchApiModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bee83e", new Object[]{this, str, searchApiModel});
            return;
        }
        ckf.g(str, "tab");
        ckf.g(searchApiModel, "apiBean");
        f32432a.put(str, searchApiModel);
    }

    public final HashMap<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("db908d97", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return b.get(str);
    }

    public final SearchApiModel d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchApiModel) ipChange.ipc$dispatch("e012f0cc", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return f32432a.get(str);
    }
}
