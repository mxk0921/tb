package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.cyc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class tin implements cyc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AURARenderComponent f28735a;
    public final fyc b;

    static {
        t2o.a(81789021);
        t2o.a(81789309);
    }

    public tin(fyc fycVar) {
        this.b = fycVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f57b0b5", new Object[]{this, str});
        } else {
            gxu.a("UMFFramework", "RaxFloatCloseListener", "umf-rax-close", str);
        }
    }

    public abstract boolean b(List<Event> list, AURARenderComponent aURARenderComponent);

    public void c(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83195a6f", new Object[]{this, aURARenderComponent});
        } else {
            this.f28735a = aURARenderComponent;
        }
    }

    @Override // tb.cyc.a
    public final boolean onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e155e364", new Object[]{this})).booleanValue();
        }
        AURARenderComponent aURARenderComponent = this.f28735a;
        if (aURARenderComponent == null) {
            a("mRenderComponent is null");
            return false;
        } else if (this.b == null) {
            a("mFloatView is null");
            return false;
        } else {
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData == null) {
                a("componentData is null");
                return false;
            }
            Map<String, List<Event>> map = aURARenderComponentData.events;
            if (map == null || map.isEmpty()) {
                a("events is empty");
                return false;
            }
            List<Event> list = map.get("cancel");
            if (list != null && !list.isEmpty()) {
                return b(list, this.f28735a);
            }
            a("events is empty");
            return false;
        }
    }
}
