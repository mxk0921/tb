package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.ClientIntelligenceHelper;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class k2p extends m12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793271);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2p(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
    }

    public static /* synthetic */ Object ipc$super(k2p k2pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/suggest/SearchDoorSuggestWidget");
    }

    @Override // tb.m12
    public Map<String, String> z2() {
        String f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84f64090", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (o4p.d2() && (f = ClientIntelligenceHelper.Companion.a().f(ClientIntelligenceHelper.INVOKE_ID_SEARCH_DOOR_SUGGEST, SearchDoorActivity.PAGE_NAME, Integer.valueOf(o4p.W()))) != null && f.length() > 0) {
            hashMap.put("bxFeature", f);
        }
        return hashMap;
    }
}
