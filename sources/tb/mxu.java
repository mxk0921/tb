package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.alibaba.android.umf.node.service.render.layout.UMFRenderContainerAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class mxu implements g4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f24375a;
    public UMFRenderContainerAdapter b;
    public RecyclerView c;
    public VirtualLayoutManager d;
    public s g;
    public fm i;
    public final List<AURARenderComponent> e = new ArrayList();
    public final List<a> f = new ArrayList();
    public final nxu h = new nxu();
    public final Handler j = new Handler(Looper.getMainLooper());

    static {
        t2o.a(80740764);
        t2o.a(80740763);
    }

    public static /* synthetic */ UMFRenderContainerAdapter a(mxu mxuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFRenderContainerAdapter) ipChange.ipc$dispatch("9a6b9335", new Object[]{mxuVar});
        }
        return mxuVar.b;
    }

    @Override // tb.g4e
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54838a8e", new Object[]{this});
            return;
        }
        i();
        this.b.N(this.f);
        this.b.setData(this.e);
        this.j.post(new kxu(this));
    }

    @Override // tb.g4e
    public void G2(Context context, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("897ead0a", new Object[]{this, context, aURARenderComponent});
            return;
        }
        this.f24375a = context;
        f();
        d(aURARenderComponent);
        c(this.e);
    }

    @Override // tb.g4e
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99da7ea", new Object[]{this});
        } else if (this.b != null) {
            if (this.i == null) {
                this.i = new fm();
            }
            this.i.b(new lxu(this));
        }
    }

    public final RecyclerView b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("4aea47ae", new Object[]{this, context});
        }
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(this.d);
        recyclerView.setAdapter(this.b);
        return recyclerView;
    }

    public final void c(List<AURARenderComponent> list) {
        List<DXTemplateItem> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf2d5ff", new Object[]{this, list});
        } else if (!list.isEmpty() && (c = vwu.c(list)) != null) {
            this.g.h(c);
        }
    }

    public final void d(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6f2c48", new Object[]{this, aURARenderComponent});
            return;
        }
        ((ArrayList) this.e).clear();
        ((ArrayList) this.f).clear();
        this.h.c(this.e, this.f, aURARenderComponent);
    }

    public final View e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("45aa689b", new Object[]{this, context});
        }
        if (this.c == null) {
            this.c = b(context);
        }
        return this.c;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d313033b", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = new VirtualLayoutManager(this.f24375a);
        }
        if (this.b == null) {
            this.b = new UMFRenderContainerAdapter(this.d);
        }
    }

    public final void g(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5280412", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (DXTemplateItem dXTemplateItem : list) {
                h(dXTemplateItem);
            }
        }
    }

    public final void h(DXTemplateItem dXTemplateItem) {
        AURARenderComponentContainer aURARenderComponentContainer;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ff40f3", new Object[]{this, dXTemplateItem});
            return;
        }
        List<AURARenderComponent> list = this.e;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.e).iterator();
            while (it.hasNext()) {
                AURARenderComponentData aURARenderComponentData = ((AURARenderComponent) it.next()).data;
                if (!(aURARenderComponentData == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null || (str = aURARenderComponentContainer.name) == null || !str.equals(dXTemplateItem.f7343a))) {
                    aURARenderComponentContainer.version = String.valueOf(dXTemplateItem.b);
                    aURARenderComponentContainer.isPreset = false;
                }
            }
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4ae7cf", new Object[]{this});
            return;
        }
        VirtualLayoutManager virtualLayoutManager = this.d;
        if (virtualLayoutManager != null) {
            virtualLayoutManager.x0(null);
        }
    }

    @Override // tb.g4e
    public void m0(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5ed4cf", new Object[]{this, sVar});
            return;
        }
        sVar.t(this);
        this.g = sVar;
    }

    @Override // tb.iwb
    public void onNotificationListener(k66 k66Var) {
        List<DXTemplateItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
        } else if (k66Var != null && (list = k66Var.f22428a) != null && !list.isEmpty()) {
            dxu.a().d("UMFRenderContainerExtension", "onNotificationListener#refresh");
            g(list);
            L();
        }
    }

    @Override // tb.g4e
    @Deprecated
    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c9faea6", new Object[]{this});
        }
        return e(this.f24375a);
    }

    @Override // tb.g4e
    public void x(d4e d4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd1eabc", new Object[]{this, d4eVar});
        } else {
            this.b.U(d4eVar);
        }
    }
}
