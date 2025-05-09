package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, h4e<?>> f25025a = new HashMap();
    public final List<Pair<Integer, com.alibaba.android.ultron.ext.vlayout.a>> b = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Comparator<Pair<Integer, com.alibaba.android.ultron.ext.vlayout.a>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(nxu nxuVar) {
        }

        /* renamed from: a */
        public int compare(Pair<Integer, com.alibaba.android.ultron.ext.vlayout.a> pair, Pair<Integer, com.alibaba.android.ultron.ext.vlayout.a> pair2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8d8bc39f", new Object[]{this, pair, pair2})).intValue();
            }
            return ((Integer) pair.first).intValue() - ((Integer) pair2.first).intValue();
        }
    }

    static {
        t2o.a(80740767);
    }

    public nxu() {
        i();
    }

    public final int a(AURARenderComponent aURARenderComponent) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de0b0a22", new Object[]{this, aURARenderComponent})).intValue();
        }
        List<AURARenderComponent> list = aURARenderComponent.children;
        if (list == null) {
            return 0;
        }
        for (AURARenderComponent aURARenderComponent2 : list) {
            if (aURARenderComponent2.isRenderAbleLeaf()) {
                i++;
            }
        }
        return i;
    }

    public final Pair<Integer, com.alibaba.android.ultron.ext.vlayout.a> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4284066a", new Object[]{this, new Integer(i)});
        }
        int size = ((ArrayList) this.b).size();
        if (i <= 0 || i >= size) {
            return null;
        }
        return (Pair) ((ArrayList) this.b).get(i - 1);
    }

    public void c(List<AURARenderComponent> list, List<com.alibaba.android.ultron.ext.vlayout.a> list2, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea37f5a4", new Object[]{this, list, list2, aURARenderComponent});
            return;
        }
        if (aURARenderComponent.isRoot()) {
            ((ArrayList) this.b).clear();
        }
        if (!d(list, aURARenderComponent) && aURARenderComponent.isRenderAbleLeaf()) {
            list.add(aURARenderComponent);
        }
        List<AURARenderComponent> list3 = aURARenderComponent.children;
        if (list3 != null) {
            for (AURARenderComponent aURARenderComponent2 : list3) {
                c(list, list2, aURARenderComponent2);
            }
            if (aURARenderComponent.isRoot()) {
                h(list, list2);
            }
        }
    }

    public final boolean d(List<AURARenderComponent> list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36f39897", new Object[]{this, list, aURARenderComponent})).booleanValue();
        }
        h4e<?> g = g(aURARenderComponent);
        if (g == null) {
            return false;
        }
        ((ArrayList) this.b).add(Pair.create(Integer.valueOf(list.size()), g.b(a(aURARenderComponent), f(aURARenderComponent))));
        return true;
    }

    public final h4e<?> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h4e) ipChange.ipc$dispatch("faead097", new Object[]{this});
        }
        return (h4e) ((HashMap) this.f25025a).get("linear");
    }

    public final Map<String, Object> f(AURARenderComponent aURARenderComponent) {
        AURARenderComponentLayout aURARenderComponentLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70cda7b8", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null) {
            return null;
        }
        return aURARenderComponentLayout.style;
    }

    public final h4e<?> g(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        AURARenderComponentLayout aURARenderComponentLayout;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h4e) ipChange.ipc$dispatch("aac66907", new Object[]{this, aURARenderComponent});
        }
        if (!aURARenderComponent.isValidLayout() || (aURARenderComponentData = aURARenderComponent.data) == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null || (str = aURARenderComponentLayout.type) == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return (h4e) ((HashMap) this.f25025a).get(str);
    }

    public final void h(List<AURARenderComponent> list, List<com.alibaba.android.ultron.ext.vlayout.a> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7284db", new Object[]{this, list, list2});
        } else if (((ArrayList) this.b).isEmpty()) {
            list2.add(e().b(list.size(), null));
        } else {
            Collections.sort(this.b, new a(this));
            for (int i = 0; i < ((ArrayList) this.b).size(); i++) {
                Pair pair = (Pair) ((ArrayList) this.b).get(i);
                Integer num = (Integer) pair.first;
                com.alibaba.android.ultron.ext.vlayout.a aVar = (com.alibaba.android.ultron.ext.vlayout.a) pair.second;
                Pair<Integer, com.alibaba.android.ultron.ext.vlayout.a> b = b(i);
                if (b == null) {
                    h4e<?> e = e();
                    if (num.intValue() > 0) {
                        list2.add(e.b(num.intValue(), null));
                    }
                    list2.add(aVar);
                } else {
                    int intValue = num.intValue() - (((com.alibaba.android.ultron.ext.vlayout.a) b.second).m() + ((Integer) b.first).intValue());
                    if (intValue > 0) {
                        list2.add(e().b(intValue, null));
                        list2.add(aVar);
                    } else {
                        list2.add(aVar);
                    }
                }
            }
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1710038", new Object[]{this});
            return;
        }
        mm mmVar = new mm();
        this.f25025a.put(mmVar.a(), mmVar);
        sm smVar = new sm();
        this.f25025a.put(smVar.a(), smVar);
        zl zlVar = new zl();
        this.f25025a.put(zlVar.a(), zlVar);
    }
}
