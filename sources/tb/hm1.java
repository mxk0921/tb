package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.util.LinkedMapWithMaxSize;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hm1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, BHREvent> f20739a = Collections.synchronizedMap(new LinkedMapWithMaxSize(10));
    @Deprecated
    public final List<BHREvent> b = Collections.synchronizedList(new LinkedList());

    static {
        t2o.a(404750372);
    }

    public final BHREvent a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHREvent) ipChange.ipc$dispatch("84d201a1", new Object[]{this, str});
        }
        try {
            return this.f20739a.get(str);
        } catch (Exception e) {
            TLog.loge("BHREventHistory", "BHREventHistory", e);
            om8.e("BHREventHistory", e);
            return null;
        }
    }

    public BHREvent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHREvent) ipChange.ipc$dispatch("5e487275", new Object[]{this});
        }
        return a("pv");
    }
}
