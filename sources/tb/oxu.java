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
public class oxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f25736a = 1;
    public final SparseIntArray b = new SparseIntArray();
    public final Map<String, Integer> c = new HashMap();
    public final SparseArray<String> d = new SparseArray<>();
    public final SparseArray<AURARenderComponentContainer> e = new SparseArray<>();
    public final Map<String, d4e> f = new HashMap();

    static {
        t2o.a(80740771);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f267d27", new Object[]{this});
            return;
        }
        this.b.clear();
        this.e.clear();
        this.d.clear();
    }

    public final d4e b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d4e) ipChange.ipc$dispatch("1702e396", new Object[]{this, str});
        }
        return (d4e) ((HashMap) this.f).get(str);
    }

    public final String c(AURARenderComponent aURARenderComponent) {
        AURARenderComponentContainer f;
        d4e b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ca6fa03", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent == null || (f = f(aURARenderComponent)) == null || (b = b(f.containerType)) == null) {
            return "";
        }
        return b.l(aURARenderComponent);
    }

    public d4e d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d4e) ipChange.ipc$dispatch("75676c37", new Object[]{this, new Integer(i)});
        }
        String str = this.d.get(h(i, Integer.MIN_VALUE));
        if (str == null) {
            return null;
        }
        return (d4e) ((HashMap) this.f).get(str);
    }

    public d4e e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d4e) ipChange.ipc$dispatch("77828721", new Object[]{this, new Integer(i)});
        }
        String str = this.d.get(i);
        if (str == null) {
            str = this.d.get(-i);
        }
        if (str == null) {
            return null;
        }
        return (d4e) ((HashMap) this.f).get(str);
    }

    public AURARenderComponentContainer f(AURARenderComponent aURARenderComponent) {
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
        AURARenderComponentContainer aURARenderComponentContainer = this.e.get(i);
        if (aURARenderComponentContainer == null) {
            return this.e.get(-i);
        }
        return aURARenderComponentContainer;
    }

    public int h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4659e64f", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return this.b.get(i, i2);
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2453d2", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !((HashMap) this.c).containsKey(str)) {
            ((HashMap) this.c).put(str, Integer.valueOf(this.f25736a));
            this.f25736a++;
        }
    }

    public final void j(int i, AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6f29c2", new Object[]{this, new Integer(i), aURARenderComponent, str});
        } else if (aURARenderComponent == null) {
            this.b.put(i, -2147483647);
        } else {
            AURARenderComponentContainer f = f(aURARenderComponent);
            if (f == null) {
                this.b.put(i, -2147483647);
                return;
            }
            d4e b = b(f.containerType);
            if (b == null) {
                this.b.put(i, -2147483647);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                dxu.a().e("UMFRenderContainerViewTypeTransformer", "the itemViewType generated from componentCreator[" + b + "] is empty");
            }
            Integer num = (Integer) ((HashMap) this.c).get(str);
            if (num == null) {
                this.b.put(i, -2147483646);
                String str2 = "cannot find viewType from itemViewType " + str + " generated from componentCreator[" + b + "]";
                dxu.a().e("UMFRenderContainerViewTypeTransformer", str2);
                gxu.a("UMFFramework", "RENDER_TRANSFORMER_ERROR", "UMF_RENDER_TRANSFORMER", str2);
                return;
            }
            this.b.put(i, num.intValue());
            this.d.put(num.intValue(), b.a());
            this.e.put(num.intValue(), f);
        }
    }

    public void k(d4e d4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cf78f1", new Object[]{this, d4eVar});
        } else {
            ((HashMap) this.f).put(d4eVar.a(), d4eVar);
        }
    }

    public d4e l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d4e) ipChange.ipc$dispatch("be5ccbee", new Object[]{this});
        }
        Map<String, d4e> map = this.f;
        String str = dm.d;
        d4e d4eVar = (d4e) ((HashMap) map).get(str);
        if (d4eVar != null) {
            return d4eVar;
        }
        ywu ywuVar = new ywu();
        ((HashMap) this.f).put(str, ywuVar);
        return ywuVar;
    }

    public final void m(int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4ef7cb", new Object[]{this, new Integer(i), aURARenderComponent});
            return;
        }
        String c = c(aURARenderComponent);
        i(c);
        j(i, aURARenderComponent, c);
    }

    public void n(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f2a0e4", new Object[]{this, list});
            return;
        }
        a();
        if (!(list == null || list.isEmpty())) {
            for (int i = 0; i < list.size(); i++) {
                m(i, list.get(i));
            }
        }
    }
}
