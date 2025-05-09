package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.rql;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class qql<T extends rql> extends oa4<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<oa4> f26883a;

    static {
        t2o.a(912261450);
    }

    public qql(Context context, ze7 ze7Var, T t, DataEntry... dataEntryArr) {
        super(context, ze7Var, t, dataEntryArr);
        List<nb4> r = ((rql) this.mComponentData).r();
        if (r != null) {
            for (nb4 nb4Var : r) {
                oa4 b = this.mDetailContext.d().b(nb4Var, dataEntryArr);
                if (b != null) {
                    u(b);
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(qql qqlVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1757188355:
                return super.findComponentByUltronName((String) objArr[0]);
            case -1022038770:
                super.willAppear();
                return null;
            case 395904714:
                super.disAppear();
                return null;
            case 1368016771:
                super.create();
                return null;
            case 1580371323:
                super.didAppear();
                return null;
            case 2023000967:
                return super.findComponent((String) objArr[0]);
            case 2099530776:
                super.willDisAppear();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/ParentComponent");
        }
    }

    public void a(oa4 oa4Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ac43c3", new Object[]{this, oa4Var, new Integer(i)});
            return;
        }
        if (this.f26883a == null) {
            this.f26883a = new ArrayList();
        }
        oa4Var.mParentGroup = this;
        this.f26883a.add(i, oa4Var);
    }

    @Override // tb.oa4
    public void create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a4783", new Object[]{this});
            return;
        }
        List<oa4> list = this.f26883a;
        if (list != null) {
            for (oa4 oa4Var : list) {
                oa4Var.create();
            }
        }
        super.create();
    }

    @Override // tb.oa4
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        List<oa4> list = this.f26883a;
        if (list != null) {
            for (oa4 oa4Var : list) {
                oa4Var.destroy();
            }
        }
        super.destroy();
    }

    @Override // tb.oa4
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        List<oa4> list = this.f26883a;
        if (list != null) {
            for (oa4 oa4Var : list) {
                oa4Var.didAppear();
            }
        }
        super.didAppear();
    }

    @Override // tb.oa4
    public void disAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179906ca", new Object[]{this});
            return;
        }
        List<oa4> list = this.f26883a;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((oa4) it.next()).disAppear();
            }
        }
        super.disAppear();
    }

    @Override // tb.oa4
    public <C extends oa4> C findComponent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("78948b87", new Object[]{this, str}));
        }
        List<oa4> list = this.f26883a;
        if (list != null) {
            for (oa4 oa4Var : list) {
                C c = (C) oa4Var.findComponent(str);
                if (c != null) {
                    return c;
                }
            }
        }
        return (C) super.findComponent(str);
    }

    @Override // tb.oa4
    public <C extends oa4> C findComponentByUltronName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("97436efd", new Object[]{this, str}));
        }
        List<oa4> list = this.f26883a;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C c = (C) ((oa4) it.next()).findComponentByUltronName(str);
                if (c != null) {
                    return c;
                }
            }
        }
        return (C) super.findComponentByUltronName(str);
    }

    public void u(oa4 oa4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd371740", new Object[]{this, oa4Var});
            return;
        }
        if (this.f26883a == null) {
            this.f26883a = new ArrayList();
        }
        oa4Var.mParentGroup = this;
        this.f26883a.add(oa4Var);
    }

    public <C extends oa4> C v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("923f84a8", new Object[]{this, new Integer(i)}));
        }
        List<oa4> list = this.f26883a;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return (C) this.f26883a.get(i);
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        List<oa4> list = this.f26883a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // tb.oa4
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
            return;
        }
        List<oa4> list = this.f26883a;
        if (list != null) {
            for (oa4 oa4Var : list) {
                oa4Var.willAppear();
            }
        }
        super.willAppear();
    }

    @Override // tb.oa4
    public void willDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d244c18", new Object[]{this});
            return;
        }
        List<oa4> list = this.f26883a;
        if (list != null) {
            for (oa4 oa4Var : list) {
                oa4Var.willDisAppear();
            }
        }
        super.willDisAppear();
    }

    public void x(oa4 oa4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba76c23", new Object[]{this, oa4Var});
            return;
        }
        List<oa4> list = this.f26883a;
        if (list != null) {
            list.remove(oa4Var);
        }
    }
}
