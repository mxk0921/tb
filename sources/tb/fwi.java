package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fwi implements v0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kmb f19579a;

    static {
        t2o.a(478151193);
        t2o.a(478151174);
    }

    public fwi(kmb kmbVar) {
        this.f19579a = kmbVar;
    }

    @Override // tb.v0c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfd60d07", new Object[]{this})).booleanValue();
        }
        return true ^ this.f19579a.d().K();
    }

    @Override // tb.v0c
    public boolean b(IDMComponent iDMComponent) {
        Map<String, List<gsb>> eventMap;
        List<gsb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("997f4c8d", new Object[]{this, iDMComponent})).booleanValue();
        }
        return iDMComponent != null && iDMComponent.getKey() != null && this.f19579a.d().K() && !this.f19579a.W().u() && this.f19579a.d().J() && (eventMap = iDMComponent.getEventMap()) != null && (list = eventMap.get("reorderGroupLongClick")) != null && !list.isEmpty();
    }
}
