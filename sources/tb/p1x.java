package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class p1x implements aae {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_URL = "url";

    /* renamed from: a  reason: collision with root package name */
    public final ViewEngine f25823a;
    public int b = 0;
    public final HashMap<String, Integer> c = new HashMap<>();
    public final HashMap<Integer, String> d = new HashMap<>();
    public final List<WeakReference<o1x>> e = new ArrayList();

    static {
        t2o.a(157286761);
        t2o.a(157286754);
    }

    public p1x(ViewEngine viewEngine) {
        this.f25823a = viewEngine;
    }

    @Override // tb.aae
    public RecyclerViewHolder a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("af72af69", new Object[]{this, viewGroup, new Integer(i)});
        }
        o1x o1xVar = new o1x(this.f25823a, this.d.get(Integer.valueOf(i)));
        o1xVar.b(viewGroup);
        ((ArrayList) this.e).add(new WeakReference(o1xVar));
        return new RecyclerViewHolder(o1xVar.c(), o1xVar);
    }

    @Override // tb.aae
    public void c(RecyclerViewHolder recyclerViewHolder, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca458c3", new Object[]{this, recyclerViewHolder, iDMComponent});
            return;
        }
        sz e0 = recyclerViewHolder.e0();
        if (e0 != null) {
            e0.a(iDMComponent);
        }
    }

    @Override // tb.aae
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        List<WeakReference<o1x>> list = this.e;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.e).iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (!(weakReference == null || weakReference.get() == null)) {
                    ((o1x) weakReference.get()).h();
                }
            }
        }
    }

    @Override // tb.aae
    public int b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d26c6ff8", new Object[]{this, iDMComponent})).intValue();
        }
        if (iDMComponent == null || iDMComponent.getContainerInfo() == null) {
            return -1;
        }
        String string = iDMComponent.getContainerInfo().getString("url");
        if (TextUtils.isEmpty(string)) {
            return -1;
        }
        if (this.c.containsKey(string)) {
            return this.c.get(string).intValue();
        }
        int i = this.b + 1;
        this.b = i;
        this.c.put(string, Integer.valueOf(i));
        this.d.put(Integer.valueOf(this.b), string);
        return this.b;
    }
}
