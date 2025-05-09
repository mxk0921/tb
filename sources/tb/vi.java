package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.component.lifeCycle.exposureItem")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class vi implements kcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f30024a;
    public kbb b;
    public pp8 c;
    public Boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURARenderComponent f30025a;

        public a(AURARenderComponent aURARenderComponent) {
            this.f30025a = aURARenderComponent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                vi.x(vi.this, vi.r(vi.this, this.f30025a), this.f30025a);
            } catch (Throwable th) {
                rbb g = ck.g();
                g.e("checkAndExecuteComponentEvent exception " + th.toString());
            }
        }
    }

    static {
        t2o.a(81789008);
        t2o.a(80740550);
    }

    public static /* synthetic */ List r(vi viVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4de829d2", new Object[]{viVar, aURARenderComponent});
        }
        return viVar.L(aURARenderComponent);
    }

    public static /* synthetic */ void x(vi viVar, List list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f397ac05", new Object[]{viVar, list, aURARenderComponent});
        } else {
            viVar.J0(list, aURARenderComponent);
        }
    }

    public final void B(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f186f1", new Object[]{this, aURARenderComponent});
        } else if (K0(aURARenderComponent)) {
            if (m0()) {
                dn.h(new a(aURARenderComponent));
            } else {
                J0(L(aURARenderComponent), aURARenderComponent);
            }
            pp8 pp8Var = this.c;
            if (pp8Var != null && aURARenderComponent != null) {
                pp8Var.a(aURARenderComponent.key);
            }
        }
    }

    @Override // tb.kcb
    public void E(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df0d417", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else if (!aURARenderComponent.isAsync()) {
            B(aURARenderComponent);
        } else if (aURARenderComponent.asyncStatus().equals("success")) {
            B(aURARenderComponent);
        }
    }

    public final void J0(List<Event> list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29fed0b4", new Object[]{this, list, aURARenderComponent});
        } else if (list != null) {
            for (Event event : list) {
                qi qiVar = new qi();
                qiVar.n(event.getFields());
                qiVar.t(aURARenderComponent);
                qiVar.o(event.getTag());
                pi.b(this.f30024a.c(), event.getType(), qiVar);
            }
        }
    }

    public final boolean K0(AURARenderComponent aURARenderComponent) {
        int i;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cd3ef00", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        kbb kbbVar = this.b;
        if (kbbVar != null) {
            i = kbbVar.n();
        } else {
            i = 0;
        }
        if (i == 0) {
            return true;
        }
        pp8 pp8Var = this.c;
        if (!(pp8Var == null || aURARenderComponent == null)) {
            z = pp8Var.b(aURARenderComponent.key);
        }
        return !z;
    }

    public final List<Event> L(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, List<Event>> map;
        List<Event> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7bdcc639", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null || (map = aURARenderComponentData.events) == null || map.isEmpty() || (list = map.get("exposureItem")) == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    @Override // tb.kcb
    public void N(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3c8047", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        }
    }

    public final boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("380c5fa3", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            this.d = (Boolean) this.f30024a.h("enableAsyncUT", Boolean.class, Boolean.FALSE);
        }
        Boolean bool = this.d;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        this.f30024a = loVar;
        this.b = (kbb) yiVar.e(kbb.class);
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        pp8 pp8Var = (pp8) aURAGlobalData.get("exposureItemRecorder", pp8.class);
        if (pp8Var == null) {
            pp8Var = new pp8();
            aURAGlobalData.update("exposureItemRecorder", pp8Var);
        }
        this.c = pp8Var;
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }
}
