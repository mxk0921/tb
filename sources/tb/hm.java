package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hm implements ocb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740584);
        t2o.a(80740581);
    }

    @Override // tb.ocb
    public void a(List<AURARenderComponent> list, List<nt> list2, List<a> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e47df043", new Object[]{this, list, list2, list3});
            return;
        }
        int i = 0;
        for (nt ntVar : list2) {
            if ("card".equalsIgnoreCase(ntVar.a()) && !d(ntVar)) {
                int o = ntVar.o() + i;
                AURARenderComponent aURARenderComponent = new AURARenderComponent();
                StringBuilder sb = new StringBuilder();
                String str = dm.e;
                sb.append(str);
                sb.append(o);
                aURARenderComponent.key = sb.toString();
                AURARenderComponentData aURARenderComponentData = new AURARenderComponentData();
                aURARenderComponentData.container = new AURARenderComponentContainer(str, "", "", null, "", "");
                Map<String, Object> c = c(ntVar.q());
                if (c != null) {
                    AURARenderComponentLayout aURARenderComponentLayout = new AURARenderComponentLayout();
                    aURARenderComponentLayout.style = c;
                    aURARenderComponentData.layout = aURARenderComponentLayout;
                }
                aURARenderComponent.data = aURARenderComponentData;
                if (o < 0 || o > list.size()) {
                    rbb g = ck.g();
                    g.b("AURARenderLayoutDataCardLayoutPostProcessor", "flatRenderComponent", "error insert componentIndexToInsert=" + o);
                } else {
                    list.add(o, aURARenderComponent);
                }
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= list3.size()) {
                        i2 = -1;
                        break;
                    }
                    i3 += list3.get(i2).m();
                    if (i3 == o) {
                        i2++;
                        break;
                    } else if (i3 > o) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0 || i2 > list3.size()) {
                    rbb g2 = ck.g();
                    g2.b("AURARenderLayoutDataCardLayoutPostProcessor", "flatRenderComponent", "error insert insertIndex=" + i2);
                } else {
                    nt b = b(aURARenderComponent);
                    b.v(1);
                    list3.add(i2, b.f());
                }
                i++;
            }
        }
    }

    public final nt b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nt) ipChange.ipc$dispatch("3f2aa259", new Object[]{this, aURARenderComponent});
        }
        return new lm(aURARenderComponent);
    }

    public final Map<String, Object> c(AURARenderComponent aURARenderComponent) {
        AURARenderComponentLayout aURARenderComponentLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("27de2d51", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null) {
            return null;
        }
        return aURARenderComponentLayout.style;
    }

    public final boolean d(nt ntVar) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2891a6e", new Object[]{this, ntVar})).booleanValue();
        }
        try {
            int h = ntVar.h();
            if (h == 0) {
                return true;
            }
            for (int i = 0; i < h; i++) {
                AURARenderComponent g = ntVar.g(i);
                if (!(g == null || (aURARenderComponentData = g.data) == null || (map = aURARenderComponentData.fields) == null || map.isEmpty() || (1 == g.data.fields.size() && g.data.fields.containsKey("cornerType")))) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            f9v.q(xh8.a("AURA").c("isAllChildComponentFieldsEmptyException").message(e.getMessage()));
            return false;
        }
    }
}
