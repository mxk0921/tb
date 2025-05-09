package tb;

import android.util.Pair;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cmj implements aae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ViewEngine f17153a;
    public int b = 0;
    public final Map<String, Pair<z9e, Integer>> c = new HashMap();
    public final Map<Integer, String> d = new HashMap();

    static {
        t2o.a(157286755);
        t2o.a(157286754);
    }

    public cmj(ViewEngine viewEngine) {
        this.f17153a = viewEngine;
    }

    @Override // tb.aae
    public RecyclerViewHolder a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("af72af69", new Object[]{this, viewGroup, new Integer(i)});
        }
        return d(viewGroup, (String) ((HashMap) this.d).get(Integer.valueOf(i)));
    }

    @Override // tb.aae
    public int b(IDMComponent iDMComponent) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d26c6ff8", new Object[]{this, iDMComponent})).intValue();
        }
        if (!((HashMap) this.c).containsKey(iDMComponent.getType())) {
            return -1;
        }
        if (!this.f17153a.n0()) {
            return ((Integer) ((Pair) ((HashMap) this.c).get(iDMComponent.getType())).second).intValue();
        }
        int intValue = ((Integer) ((Pair) ((HashMap) this.c).get(iDMComponent.getType())).second).intValue();
        try {
            i = this.f17153a.H().getData().indexOf(iDMComponent);
        } catch (Exception unused) {
        }
        int i2 = (intValue * 50) + i;
        ((HashMap) this.d).put(Integer.valueOf(i2), iDMComponent.getType());
        return i2;
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

    public final RecyclerViewHolder d(ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("b1abd4bf", new Object[]{this, viewGroup, str});
        }
        if (str == null) {
            return new RecyclerViewHolder(mgw.a(this.f17153a.K()), null);
        }
        sz a2 = ((z9e) ((Pair) ((HashMap) this.c).get(str)).first).a(this.f17153a);
        a2.b(viewGroup);
        return new RecyclerViewHolder(a2.c(), a2);
    }

    @Override // tb.aae
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void e(String str, z9e z9eVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45418955", new Object[]{this, str, z9eVar});
            return;
        }
        if (!((HashMap) this.c).containsKey(str)) {
            i = this.b;
            this.b = 1 + i;
            ((HashMap) this.c).put(str, new Pair(z9eVar, Integer.valueOf(i)));
        } else {
            i = ((Integer) ((Pair) ((HashMap) this.c).get(str)).second).intValue();
        }
        ((HashMap) this.d).put(Integer.valueOf(i), str);
    }
}
