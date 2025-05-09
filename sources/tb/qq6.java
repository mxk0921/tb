package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import tb.rg7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qq6 implements ood, uxb, dzb, rg7.c, rg7.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f26877a;
    public final olk<rg7.c> b = new olk<>();
    public final olk<dzb> c = new olk<>();
    public final olk<uxb> d = new olk<>();
    public final olk<ood> e = new olk<>();
    public boolean f = false;

    static {
        t2o.a(468714221);
        t2o.a(468714223);
        t2o.a(468714225);
        t2o.a(468714222);
        t2o.a(468714224);
        t2o.a(468714256);
        t2o.a(468714257);
    }

    public qq6(FluidContext fluidContext) {
        this.f26877a = fluidContext;
    }

    public void addDataChangeListener(uxb uxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c33e537", new Object[]{this, uxbVar});
        } else if (uxbVar != null) {
            this.d.a(uxbVar);
        }
    }

    public void addDetailRequestListener(rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c46039", new Object[]{this, cVar});
            return;
        }
        ir9.a("DataListenerManager", "addDetailRequestListener ");
        if (cVar != null) {
            this.b.a(cVar);
        }
    }

    public void addDetailRequestSuccessListener(dzb dzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58cd169d", new Object[]{this, dzbVar});
        } else if (dzbVar != null) {
            this.c.a(dzbVar);
        }
    }

    public void addMultiDetailRequestListener(rg7.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e12e13", new Object[]{this, dVar});
        }
    }

    public void addServerConfigChangeListener(ood oodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7cd2cc7", new Object[]{this, oodVar});
        } else if (oodVar != null) {
            this.e.a(oodVar);
        }
    }

    public boolean isDetailRequestSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ba4767a", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void notifyContentDetailCallback(rg7.c cVar, yao<Pair<a, MediaMixContentDetail>> yaoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e71ba78", new Object[]{this, cVar, yaoVar});
            return;
        }
        ir9.b("DataListenerManager", "notifyContentDetailCallback");
        if (cVar != null) {
            cVar.onResult(yaoVar);
        }
        ncp j = ((IDataService) this.f26877a.getService(IDataService.class)).getConfig().j();
        boolean equalsIgnoreCase = "video".equalsIgnoreCase(this.f26877a.getInstanceConfig().getTabId());
        if (j != null && equalsIgnoreCase) {
            ggs.e("tab2FrameworkRefactor", Boolean.valueOf(j.F));
        }
    }

    @Override // tb.uxb
    public void onDataChanged(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559b0a2d", new Object[]{this, aVar});
            return;
        }
        for (uxb uxbVar : this.d.b()) {
            try {
                uxbVar.onDataChanged(aVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f26877a, uxbVar, "onDataChanged", e);
            }
        }
    }

    @Override // tb.rg7.d
    public void onResult(yao<Pair<a, MediaMixContentDetail>> yaoVar, yao<Pair<a, MediaMixContentDetail>> yaoVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc2f754b", new Object[]{this, yaoVar, yaoVar2});
        }
    }

    @Override // tb.ood
    public void onServerConfigChanged(ncp ncpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23d4bb4", new Object[]{this, ncpVar});
            return;
        }
        for (ood oodVar : this.e.b()) {
            try {
                oodVar.onServerConfigChanged(ncpVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f26877a, oodVar, "onServerConfigChanged", e);
            }
        }
    }

    @Override // tb.rg7.d
    public void onStartRequest(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a52f90", new Object[]{this, new Integer(i)});
        }
    }

    public void removeDataChangeListener(uxb uxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed948c34", new Object[]{this, uxbVar});
        } else if (uxbVar != null) {
            this.d.e(uxbVar);
        }
    }

    public void removeDetailRequestListener(rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7e199c", new Object[]{this, cVar});
        }
    }

    public void removeDetailRequestSuccessListener(dzb dzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755bccc0", new Object[]{this, dzbVar});
        } else if (dzbVar != null) {
            this.c.e(dzbVar);
        }
    }

    public void removeMultiDetailRequestListener(rg7.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3f8c7b6", new Object[]{this, dVar});
        }
    }

    public void removeServerConfigChangeListener(ood oodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b727e184", new Object[]{this, oodVar});
        } else if (oodVar != null) {
            this.e.e(oodVar);
        }
    }

    @Override // tb.dzb
    public void onDetailRequestSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cae82b", new Object[]{this});
            return;
        }
        this.f = true;
        for (dzb dzbVar : this.c.b()) {
            try {
                dzbVar.onDetailRequestSuccess();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f26877a, dzbVar, "onDetailRequestSuccess", e);
            }
        }
    }

    @Override // tb.rg7.c
    public void onResult(yao<Pair<a, MediaMixContentDetail>> yaoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fcf9b57", new Object[]{this, yaoVar});
            return;
        }
        ir9.b("DataListenerManager", "onResult ");
        for (rg7.c cVar : this.b.b()) {
            try {
                cVar.onResult(yaoVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f26877a, cVar, "onStartRequest", e);
            }
        }
    }

    @Override // tb.rg7.c
    public void onStartRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
            return;
        }
        ir9.b("DataListenerManager", "onStartRequest ");
        for (rg7.c cVar : this.b.b()) {
            try {
                cVar.onStartRequest();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f26877a, cVar, "onStartRequest", e);
            }
        }
    }
}
