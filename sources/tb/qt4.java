package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.xsearchplugin.jarvis.utils.FixedSizeLinkedHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qt4 implements xgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f26915a;
    public final otf b;
    public volatile FixedSizeLinkedHashMap<String, BaseCellBean> c;
    public volatile FixedSizeLinkedHashMap<String, BaseCellBean> d;
    public volatile FixedSizeLinkedHashMap<String, BaseCellBean> e;
    public volatile List<String> f = new ArrayList();
    public volatile List<String> g = new ArrayList();
    public final Object h = new Object();
    public final Object i = new Object();
    public final Object j = new Object();

    static {
        t2o.a(995098647);
        t2o.a(995098648);
    }

    public qt4(otf otfVar, int i) {
        this.f26915a = i;
        this.b = otfVar;
        this.c = new FixedSizeLinkedHashMap<>(i);
        this.d = new FixedSizeLinkedHashMap<>(i);
        this.e = new FixedSizeLinkedHashMap<>(i);
    }

    @Override // tb.xgd
    public Map<String, BaseCellBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("382bdf65", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.xgd
    public Map<String, BaseCellBean> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f9dc20d2", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.xgd
    public void d(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ad84d4", new Object[]{this, list});
        } else {
            this.g = list;
        }
    }

    @Override // tb.xgd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71fd353", new Object[]{this});
            return;
        }
        synchronized (this.j) {
            this.e = new FixedSizeLinkedHashMap<>(this.f26915a);
        }
    }

    @Override // tb.xgd
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0fc57c6", new Object[]{this});
            return;
        }
        synchronized (this.i) {
            this.d = new FixedSizeLinkedHashMap<>(this.f26915a);
        }
    }

    @Override // tb.xgd
    public void g(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f30d5cb", new Object[]{this, list});
        } else {
            this.f = list;
        }
    }

    @Override // tb.xgd
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e0cbe7", new Object[]{this});
            return;
        }
        synchronized (this.h) {
            this.c = new FixedSizeLinkedHashMap<>(this.f26915a);
        }
    }

    @Override // tb.xgd
    public List<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4683cc92", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.xgd
    public List<String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("723827f2", new Object[]{this});
        }
        return this.f;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329857fb", new Object[]{this});
            return;
        }
        i();
        f();
        e();
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2c5079", new Object[]{this, new Integer(i)});
            return;
        }
        this.f26915a = i;
        this.c.setMaxSize(i);
        this.d.setMaxSize(i);
        this.e.setMaxSize(i);
    }

    @Override // tb.xgd
    public void a(Collection<BaseCellBean> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c02790a", new Object[]{this, collection});
            return;
        }
        synchronized (this.i) {
            try {
                FixedSizeLinkedHashMap<String, BaseCellBean> m = m(this.d, this.b);
                for (BaseCellBean baseCellBean : collection) {
                    m.remove(baseCellBean.itemId);
                    m.put(baseCellBean.itemId, baseCellBean);
                }
                this.d = m;
            } catch (Throwable th) {
                throw th;
            }
        }
        c4p.D("[XSearchJarvis]", "当前广告结果buffer个数：" + this.d.size(), new Object[0]);
    }

    @Override // tb.xgd
    public void h(Collection<BaseCellBean> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86a18a5", new Object[]{this, collection});
            return;
        }
        synchronized (this.h) {
            try {
                FixedSizeLinkedHashMap<String, BaseCellBean> m = m(this.c, this.b);
                for (BaseCellBean baseCellBean : collection) {
                    m.remove(baseCellBean.itemId);
                    m.put(baseCellBean.itemId, baseCellBean);
                }
                this.c = m;
            } catch (Throwable th) {
                throw th;
            }
        }
        c4p.D("[XSearchJarvis]", "当前自然结果buffer个数：" + this.c.size(), new Object[0]);
    }

    public final FixedSizeLinkedHashMap<String, BaseCellBean> m(Map<String, BaseCellBean> map, otf otfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FixedSizeLinkedHashMap) ipChange.ipc$dispatch("53473080", new Object[]{this, map, otfVar});
        }
        FixedSizeLinkedHashMap<String, BaseCellBean> fixedSizeLinkedHashMap = new FixedSizeLinkedHashMap<>(this.f26915a);
        for (Map.Entry<String, BaseCellBean> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!otfVar.E2(key)) {
                fixedSizeLinkedHashMap.put(key, entry.getValue());
            } else {
                c4p.D("[XSearchJarvis]", "buffer中的" + key + "已曝光，移除", new Object[0]);
            }
        }
        return fixedSizeLinkedHashMap;
    }
}
