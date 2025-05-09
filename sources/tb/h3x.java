package tb;

import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h3x implements aae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ViewEngine f20399a;
    public final List<Pair<String, Integer>> b = new ArrayList();
    public final List<g3x> c = new ArrayList();
    public fce d;

    static {
        t2o.a(157286804);
        t2o.a(157286754);
    }

    public h3x(ViewEngine viewEngine) {
        this.f20399a = viewEngine;
    }

    @Override // tb.aae
    public RecyclerViewHolder a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("af72af69", new Object[]{this, viewGroup, new Integer(i)});
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            if (pair != null && ((Integer) pair.second).intValue() == i) {
                String str = (String) pair.first;
                break;
            }
        }
        g3x g3xVar = new g3x(this.f20399a);
        g3xVar.b(viewGroup);
        g3xVar.t(this.d);
        ((ArrayList) this.c).add(g3xVar);
        return new RecyclerViewHolder(g3xVar.c(), g3xVar);
    }

    @Override // tb.aae
    public void c(RecyclerViewHolder recyclerViewHolder, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca458c3", new Object[]{this, recyclerViewHolder, iDMComponent});
        } else if (recyclerViewHolder == null) {
            UnifyLog.e("Weex2ViewHolderProvider.bindData", "viewHolder is null");
        } else {
            sz e0 = recyclerViewHolder.e0();
            if (e0 == null) {
                UnifyLog.e("Weex2ViewHolderProvider.bindData", "subViewHolder is null");
            } else {
                e0.a(iDMComponent);
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            g3x g3xVar = (g3x) it.next();
            if (g3xVar != null) {
                g3xVar.p();
            }
        }
    }

    @Override // tb.aae
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            g3x g3xVar = (g3x) it.next();
            if (g3xVar != null) {
                g3xVar.f();
            }
        }
        ((ArrayList) this.c).clear();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            g3x g3xVar = (g3x) it.next();
            if (g3xVar != null) {
                g3xVar.q();
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            g3x g3xVar = (g3x) it.next();
            if (g3xVar != null) {
                g3xVar.r();
            }
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            g3x g3xVar = (g3x) it.next();
            if (g3xVar != null) {
                g3xVar.s();
            }
        }
    }

    public void h(fce fceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b343ef", new Object[]{this, fceVar});
        } else {
            this.d = fceVar;
        }
    }

    @Override // tb.aae
    public int b(IDMComponent iDMComponent) {
        JSONObject containerInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d26c6ff8", new Object[]{this, iDMComponent})).intValue();
        }
        if (iDMComponent == null || (containerInfo = iDMComponent.getContainerInfo()) == null) {
            return 0;
        }
        String string = containerInfo.getString("url");
        if (TextUtils.isEmpty(string)) {
            return 0;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair != null && TextUtils.equals(string, (CharSequence) pair.first)) {
                return ((Integer) pair.second).intValue();
            }
        }
        int hashCode = string.hashCode();
        ((ArrayList) this.b).add(new Pair(string, Integer.valueOf(hashCode)));
        return hashCode;
    }
}
