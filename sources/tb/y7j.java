package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y7j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355987);
    }

    public static Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3cfc760f", new Object[0]);
        }
        HashSet hashSet = new HashSet();
        hashSet.add(zxg.LIVE_DETAIL_QUERY);
        hashSet.add(zxg.RECOMMEND_DETAIL);
        hashSet.add("mtop.tblive.recommend.updown.lives");
        hashSet.add("mtop.roomstudio.live.display.detail");
        hashSet.add("mtop.tblive.recommend.popview.query");
        hashSet.add("mtop.iliad.interact.queryliveinteracts");
        hashSet.add("mtop.tblive.live.item.ultron.render");
        return hashSet;
    }
}
