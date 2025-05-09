package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class fwa<MODEL, VIEW extends View> extends BaseComponent<MODEL, VIEW> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19576a = o().getContext();
    public List<fwa<?, ?>> b;
    public fwa<?, ?> c;
    public final qpu d;

    static {
        t2o.a(919601243);
    }

    public fwa(qpu qpuVar) {
        ckf.g(qpuVar, "turboEngineContext");
        this.d = qpuVar;
    }

    public static /* synthetic */ Object ipc$super(fwa fwaVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1502133455:
                super.onStart((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -560092455:
                super.onDestroy((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -258772824:
                super.onResume((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case 316403507:
                super.onStop((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case 1484435997:
                super.onPause((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/component/HierarchyComponent");
        }
    }

    public abstract String getComponentId();

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public final Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f19576a;
    }

    public final void k(fwa<?, ?> fwaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c8128c", new Object[]{this, fwaVar});
            return;
        }
        ckf.g(fwaVar, "component");
        if (this.b == null) {
            this.b = new ArrayList();
        }
        List<fwa<?, ?>> list = this.b;
        if (list != null) {
            ((ArrayList) list).add(fwaVar);
        }
        fwaVar.c = this;
        q(fwaVar);
    }

    public final fwa<?, ?> l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fwa) ipChange.ipc$dispatch("a559b058", new Object[]{this, str});
        }
        ckf.g(str, "id");
        return m(n(), str);
    }

    public final fwa<?, ?> m(fwa<?, ?> fwaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fwa) ipChange.ipc$dispatch("64e64044", new Object[]{this, fwaVar, str});
        }
        if (ckf.b(fwaVar.getComponentId(), str)) {
            return fwaVar;
        }
        List<fwa<?, ?>> list = fwaVar.b;
        if (list == null) {
            return null;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            fwa<?, ?> m = m((fwa) it.next(), str);
            if (m != null) {
                return m;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fwa<?, ?> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fwa) ipChange.ipc$dispatch("926ba5d6", new Object[]{this});
        }
        fwa fwaVar = this;
        while (true) {
            fwa fwaVar2 = fwaVar.c;
            if (fwaVar2 == null) {
                return fwaVar;
            }
            ckf.d(fwaVar2);
            fwaVar = fwaVar2;
        }
    }

    public qpu o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpu) ipChange.ipc$dispatch("3d61b71e", new Object[]{this});
        }
        return this.d;
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onDestroy(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9daad9", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onDestroy(iComponentLifecycle$TriggerType);
        List<fwa<?, ?>> list = this.b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((fwa) it.next()).onDestroy(iComponentLifecycle$TriggerType);
            }
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onPause(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ab21d", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onPause(iComponentLifecycle$TriggerType);
        List<fwa<?, ?>> list = this.b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((fwa) it.next()).onPause(iComponentLifecycle$TriggerType);
            }
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onResume(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09370a8", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onResume(iComponentLifecycle$TriggerType);
        List<fwa<?, ?>> list = this.b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((fwa) it.next()).onResume(iComponentLifecycle$TriggerType);
            }
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStart(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6774331", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onStart(iComponentLifecycle$TriggerType);
        List<fwa<?, ?>> list = this.b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((fwa) it.next()).onStart(iComponentLifecycle$TriggerType);
            }
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStop(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dbef33", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onStop(iComponentLifecycle$TriggerType);
        List<fwa<?, ?>> list = this.b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((fwa) it.next()).onStop(iComponentLifecycle$TriggerType);
            }
        }
    }

    public final void p(fwa<?, ?> fwaVar) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0625a09", new Object[]{this, fwaVar});
            return;
        }
        ckf.g(fwaVar, "component");
        List<fwa<?, ?>> list = this.b;
        if (list != null) {
            bool = Boolean.valueOf(((ArrayList) list).remove(fwaVar));
        } else {
            bool = null;
        }
        if (ckf.b(bool, Boolean.TRUE)) {
            r(fwaVar);
        }
    }

    public final void q(fwa<?, ?> fwaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("952d80d8", new Object[]{this, fwaVar});
            return;
        }
        switch (ewa.$EnumSwitchMapping$0[getState().ordinal()]) {
            case 1:
                return;
            case 2:
                fwaVar.onStart(IComponentLifecycle$TriggerType.UNSPECIFIED);
                return;
            case 3:
                IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.UNSPECIFIED;
                fwaVar.onStart(iComponentLifecycle$TriggerType);
                fwaVar.onResume(iComponentLifecycle$TriggerType);
                return;
            case 4:
                IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType2 = IComponentLifecycle$TriggerType.UNSPECIFIED;
                fwaVar.onStart(iComponentLifecycle$TriggerType2);
                fwaVar.onResume(iComponentLifecycle$TriggerType2);
                fwaVar.onPause(iComponentLifecycle$TriggerType2);
                return;
            case 5:
                IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType3 = IComponentLifecycle$TriggerType.UNSPECIFIED;
                fwaVar.onStart(iComponentLifecycle$TriggerType3);
                fwaVar.onResume(iComponentLifecycle$TriggerType3);
                fwaVar.onPause(iComponentLifecycle$TriggerType3);
                fwaVar.onStop(iComponentLifecycle$TriggerType3);
                return;
            case 6:
                fwaVar.onDestroy(IComponentLifecycle$TriggerType.UNSPECIFIED);
                return;
            default:
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, "HierarchyComponent", "transferComponentState: parent state " + getState(), null, 4, null);
                return;
        }
    }

    public final void r(fwa<?, ?> fwaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b499294d", new Object[]{this, fwaVar});
            return;
        }
        switch (ewa.$EnumSwitchMapping$1[getState().ordinal()]) {
            case 1:
                fwaVar.onDestroy(IComponentLifecycle$TriggerType.UNSPECIFIED);
                return;
            case 2:
                IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.UNSPECIFIED;
                fwaVar.onStop(iComponentLifecycle$TriggerType);
                fwaVar.onDestroy(iComponentLifecycle$TriggerType);
                return;
            case 3:
                IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType2 = IComponentLifecycle$TriggerType.UNSPECIFIED;
                fwaVar.onPause(iComponentLifecycle$TriggerType2);
                fwaVar.onStop(iComponentLifecycle$TriggerType2);
                fwaVar.onDestroy(iComponentLifecycle$TriggerType2);
                return;
            case 4:
                IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType3 = IComponentLifecycle$TriggerType.UNSPECIFIED;
                fwaVar.onStop(iComponentLifecycle$TriggerType3);
                fwaVar.onDestroy(iComponentLifecycle$TriggerType3);
                return;
            case 5:
                fwaVar.onDestroy(IComponentLifecycle$TriggerType.UNSPECIFIED);
                return;
            case 6:
                fwaVar.onDestroy(IComponentLifecycle$TriggerType.UNSPECIFIED);
                return;
            default:
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, "HierarchyComponent", "transferComponentStateWhenRemove: parent state " + getState(), null, 4, null);
                return;
        }
    }
}
