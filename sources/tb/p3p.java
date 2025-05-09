package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.search.SearchHistory;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<SearchHistory> f25859a = new ArrayList(20);
    public SharedPreferences b;

    static {
        t2o.a(295699397);
    }

    public p3p(Context context) {
        c(context);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b56563", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            SearchHistory searchHistory = new SearchHistory();
            searchHistory.key = str;
            ((ArrayList) this.f25859a).remove(searchHistory);
            ((ArrayList) this.f25859a).add(0, searchHistory);
            if (((ArrayList) this.f25859a).size() > 20) {
                ArrayList arrayList = (ArrayList) this.f25859a;
                Objects.toString((SearchHistory) arrayList.remove(arrayList.size() - 1));
            }
        }
    }

    public List<SearchHistory> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        return this.f25859a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Context context) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796ad4fa", new Object[]{this, context});
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(vrp.BIZ_GOODS_LIST, 0);
            this.b = sharedPreferences;
            list = JSON.parseArray(sharedPreferences.getString("goods-search-history", ""), SearchHistory.class);
        } catch (Throwable unused) {
            list = null;
        }
        if (!(list == null || list.isEmpty())) {
            int min = Math.min(list.size(), 20);
            for (int i = 0; i < min; i++) {
                this.f25859a.add(list.get(i));
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d10884", new Object[]{this});
            return;
        }
        List<SearchHistory> list = this.f25859a;
        if (list != null) {
            ((ArrayList) list).clear();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec35019", new Object[]{this});
        } else {
            this.b.edit().putString("goods-search-history", JSON.toJSONString(this.f25859a)).apply();
        }
    }
}
