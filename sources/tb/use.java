package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class use extends m12 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_NAME = "InShopSearch";
    public static final a Companion = new a(null);
    public final s4p j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793269);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793268);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public use(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar, s4p s4pVar) {
        super(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        this.j = s4pVar;
    }

    public static /* synthetic */ Object ipc$super(use useVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/suggest/InShopSuggestWidget");
    }

    @Override // tb.m12
    public Map<String, String> z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84f64090", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("shop_id", rqp.g(this.j));
        hashMap.put("seller_id", rqp.f(this.j));
        hashMap.put("area", "shop_wireless");
        if (l3p.INSTANCE.b()) {
            hashMap.put("ovsFrom", "inshop");
        }
        hashMap.put("channelSrp", CHANNEL_NAME);
        return hashMap;
    }
}
