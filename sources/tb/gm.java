package tb;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f20084a = gm.class.getSimpleName();
    public int b = 1;
    public final SparseIntArray c = new SparseIntArray();
    public final Map<String, Integer> d = new HashMap();
    public final SparseArray<String> e = new SparseArray<>();
    public final SparseArray<AURARenderComponentContainer> f = new SparseArray<>();
    public final Map<String, jcb> g = new HashMap();

    static {
        t2o.a(80740566);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d569c80", new Object[]{this});
            return;
        }
        this.c.clear();
        this.f.clear();
        this.e.clear();
    }

    public final jcb b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jcb) ipChange.ipc$dispatch("c836c87", new Object[]{this, str});
        }
        if (str != null) {
            return (jcb) ((HashMap) this.g).get(str.toLowerCase());
        }
        ck.g().b(this.f20084a, "getComponentCreator", "containerType is null");
        return null;
    }

    public final String c(AURARenderComponent aURARenderComponent) {
        AURARenderComponentContainer f;
        jcb b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ca6fa03", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent == null || (f = f(aURARenderComponent)) == null || (b = b(f.containerType)) == null) {
            return "";
        }
        return b.l(aURARenderComponent);
    }

    public jcb d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jcb) ipChange.ipc$dispatch("81db1a68", new Object[]{this, new Integer(i)});
        }
        String str = this.e.get(i(i, Integer.MIN_VALUE));
        if (str != null) {
            return b(str);
        }
        rbb g = ck.g();
        String str2 = this.f20084a;
        g.b(str2, "getComponentCreatorOfPosition", "containerType of position[" + i + "] is null");
        return null;
    }

    public jcb e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jcb) ipChange.ipc$dispatch("2264f1d2", new Object[]{this, new Integer(i)});
        }
        String str = this.e.get(i);
        if (str == null) {
            str = this.e.get(-i);
        }
        if (str != null) {
            return b(str);
        }
        rbb g = ck.g();
        String str2 = this.f20084a;
        g.b(str2, "getComponentCreatorOfPosition", "containerType of viewType[" + i + "] is null");
        return null;
    }

    public final AURARenderComponentContainer f(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentContainer) ipChange.ipc$dispatch("a7cb1e4f", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null) {
            return null;
        }
        return aURARenderComponentData.container;
    }

    public AURARenderComponentContainer g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentContainer) ipChange.ipc$dispatch("46d52ddd", new Object[]{this, new Integer(i)});
        }
        AURARenderComponentContainer aURARenderComponentContainer = this.f.get(i);
        if (aURARenderComponentContainer == null) {
            return this.f.get(-i);
        }
        return aURARenderComponentContainer;
    }

    public jcb h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jcb) ipChange.ipc$dispatch("c1846df2", new Object[]{this});
        }
        String str = dm.d;
        jcb b = b(str);
        if (b != null) {
            return b;
        }
        vh vhVar = new vh();
        l(str, vhVar);
        return vhVar;
    }

    public int i(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4659e64f", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return this.c.get(i, i2);
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2453d2", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !((HashMap) this.d).containsKey(str)) {
            ((HashMap) this.d).put(str, Integer.valueOf(this.b));
            this.b++;
        }
    }

    public final void k(int i, AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6f29c2", new Object[]{this, new Integer(i), aURARenderComponent, str});
        } else if (aURARenderComponent == null) {
            this.c.put(i, -2147483647);
        } else {
            AURARenderComponentContainer f = f(aURARenderComponent);
            if (f == null) {
                this.c.put(i, -2147483645);
                return;
            }
            jcb b = b(f.containerType);
            if (b == null) {
                this.c.put(i, -2147483644);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                rbb g = ck.g();
                String str2 = this.f20084a;
                g.b(str2, "processPosition2ViewType", "the itemViewType generated from componentCreator[" + b + "] is empty");
            }
            Integer num = (Integer) ((HashMap) this.d).get(str);
            if (num == null) {
                this.c.put(i, -2147483646);
                ck.g().b(this.f20084a, "processPosition2ViewType", "cannot find viewType from itemViewType " + str + " generated from componentCreator[" + b + "]");
                return;
            }
            this.c.put(i, num.intValue());
            this.e.put(num.intValue(), b.a());
            this.f.put(num.intValue(), f);
        }
    }

    public final void l(String str, jcb jcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32340cdf", new Object[]{this, str, jcbVar});
        } else if (TextUtils.isEmpty(str)) {
            ck.g().b(this.f20084a, "setComponentCreator", "containerType is empty");
        } else if (jcbVar == null) {
            rbb g = ck.g();
            String str2 = this.f20084a;
            g.b(str2, "setComponentCreator", "componentExtension of " + str + " is null");
        } else {
            ((HashMap) this.g).put(str.toLowerCase(), jcbVar);
        }
    }

    public void m(yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6662bae", new Object[]{this, yiVar});
            return;
        }
        List<jcb> f = yiVar.f(jcb.class);
        if (!f.isEmpty()) {
            for (jcb jcbVar : f) {
                String a2 = jcbVar.a();
                if (TextUtils.isEmpty(a2)) {
                    rbb g = ck.g();
                    String str = this.f20084a;
                    g.b(str, "", "componentType of " + jcbVar + " is empty!!!");
                } else {
                    l(a2, jcbVar);
                }
            }
            bi biVar = new bi();
            l(biVar.a(), biVar);
        }
    }

    public final void n(int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4ef7cb", new Object[]{this, new Integer(i), aURARenderComponent});
            return;
        }
        String c = c(aURARenderComponent);
        j(c);
        k(i, aURARenderComponent, c);
    }

    public void o(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f2a0e4", new Object[]{this, list});
            return;
        }
        a();
        if (!(list == null || list.isEmpty())) {
            for (int i = 0; i < list.size(); i++) {
                n(i, list.get(i));
            }
        }
    }
}
