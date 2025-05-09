package com.taobao.android.dinamicx.widget.recycler.manager.datasource;

import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import tb.bi6;
import tb.la6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXDataSourceLruManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXRecyclerLruCache f7480a;
    public b b;
    public List<Object> c;
    public List<Long> d;
    public final int e;
    public final AtomicLong f = new AtomicLong(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class DXRecyclerLruCache extends LruCache<Long, DXWidgetNode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Map<Long, DXWidgetNode> b = new HashMap();
        public final b c;

        static {
            t2o.a(444597566);
        }

        public DXRecyclerLruCache(int i, b bVar) {
            super(i);
            this.c = bVar;
        }

        public static /* synthetic */ Object ipc$super(DXRecyclerLruCache dXRecyclerLruCache, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/manager/datasource/DXDataSourceLruManager$DXRecyclerLruCache");
        }

        /* renamed from: a */
        public void entryRemoved(boolean z, Long l, DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5786fe", new Object[]{this, new Boolean(z), l, dXWidgetNode, dXWidgetNode2});
            } else if (z) {
                b(l, dXWidgetNode);
            }
        }

        public void b(Long l, DXWidgetNode dXWidgetNode) {
            b bVar;
            Long l2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("daa690a0", new Object[]{this, l, dXWidgetNode});
            } else if (dXWidgetNode != null && (bVar = this.c) != null && bVar.a(l, dXWidgetNode)) {
                Iterator<Map.Entry<Long, DXWidgetNode>> it = snapshot().entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        l2 = null;
                        break;
                    }
                    Map.Entry<Long, DXWidgetNode> next = it.next();
                    l2 = next.getKey();
                    if (!this.c.a(l2, next.getValue())) {
                        break;
                    }
                }
                if (l2 != null) {
                    remove(l2);
                    put(l, dXWidgetNode);
                    return;
                }
                ((HashMap) this.b).put(l, dXWidgetNode);
            }
        }

        public DXWidgetNode c(Long l, DXWidgetNode dXWidgetNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("3d65c75", new Object[]{this, l, dXWidgetNode});
            }
            DXWidgetNode put = put(l, dXWidgetNode);
            if (!((HashMap) this.b).isEmpty()) {
                resize(maxSize() + ((HashMap) this.b).size());
                for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
                    put(entry.getKey(), entry.getValue());
                }
                ((HashMap) this.b).clear();
            }
            return put;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(DXDataSourceLruManager dXDataSourceLruManager) {
        }

        @Override // com.taobao.android.dinamicx.widget.recycler.manager.datasource.DXDataSourceLruManager.b
        public boolean a(Long l, DXWidgetNode dXWidgetNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("308ace71", new Object[]{this, l, dXWidgetNode})).booleanValue();
            }
            if (!(dXWidgetNode instanceof bi6) || !((bi6) dXWidgetNode).K()) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        boolean a(Long l, DXWidgetNode dXWidgetNode);
    }

    static {
        t2o.a(444597564);
        t2o.a(444597570);
    }

    public DXDataSourceLruManager(int i) {
        this.e = i;
    }

    public void a(int i, Collection<DXWidgetNode> collection) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990767ba", new Object[]{this, new Integer(i), collection});
        } else if (collection != null && !collection.isEmpty() && this.f7480a != null && this.d != null) {
            for (DXWidgetNode dXWidgetNode : collection) {
                int i3 = i + i2;
                Long e = e(i3, dXWidgetNode);
                if (i3 >= 0 && i3 <= ((ArrayList) this.d).size()) {
                    ((ArrayList) this.d).add(i3, e);
                    this.f7480a.c(e, dXWidgetNode);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void b(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98655fa7", new Object[]{this, new Integer(i), dXWidgetNode});
        } else if (this.f7480a != null && this.d != null) {
            Long e = e(i, dXWidgetNode);
            if (i < 0 || i > ((ArrayList) this.d).size()) {
                la6.b("DXRecyclerLayout(LRU) appendItem indexOutOfBounds: " + i + " size: " + ((ArrayList) this.d).size());
                return;
            }
            ((ArrayList) this.d).add(i, e);
            this.f7480a.c(e, dXWidgetNode);
        }
    }

    public boolean c(int i, DXWidgetNode dXWidgetNode) {
        List<Long> list;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41ccb54a", new Object[]{this, new Integer(i), dXWidgetNode})).booleanValue();
        }
        if (this.f7480a == null || (list = this.d) == null || i < 0 || i >= ((ArrayList) list).size() || (l = (Long) ((ArrayList) this.d).get(i)) == null) {
            return false;
        }
        this.f7480a.c(l, dXWidgetNode);
        return true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b92a987", new Object[]{this});
            return;
        }
        DXRecyclerLruCache dXRecyclerLruCache = this.f7480a;
        if (!(dXRecyclerLruCache == null || dXRecyclerLruCache.size() == 0)) {
            for (Map.Entry<Long, DXWidgetNode> entry : this.f7480a.snapshot().entrySet()) {
                if ((entry.getValue() instanceof bi6) && !((bi6) entry.getValue()).K()) {
                    this.f7480a.remove(entry.getKey());
                }
            }
        }
    }

    public Long e(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("f1b0debd", new Object[]{this, new Integer(i), dXWidgetNode});
        }
        return Long.valueOf(this.f.getAndIncrement());
    }

    public List<Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb16ea5", new Object[]{this});
        }
        return this.c;
    }

    public DXWidgetNode g(int i) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("e59e5492", new Object[]{this, new Integer(i)});
        }
        if (this.f7480a != null && i >= 0 && i < ((ArrayList) this.d).size() && (l = (Long) ((ArrayList) this.d).get(i)) != null) {
            return this.f7480a.get(l);
        }
        return null;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8d12aa4", new Object[]{this})).intValue();
        }
        DXRecyclerLruCache dXRecyclerLruCache = this.f7480a;
        if (dXRecyclerLruCache == null) {
            return 0;
        }
        return dXRecyclerLruCache.size();
    }

    public List<DXWidgetNode> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("886500dc", new Object[]{this});
        }
        if (this.f7480a == null) {
            return null;
        }
        return new ArrayList(this.f7480a.snapshot().values());
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e642a55", new Object[]{this})).intValue();
        }
        List<Object> list = this.c;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.c.size();
    }

    public int k(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4339b5ff", new Object[]{this, dXWidgetNode})).intValue();
        }
        if (dXWidgetNode == null || this.c == null || dXWidgetNode.getDXRuntimeContext().O() == null) {
            return -1;
        }
        return this.c.indexOf(dXWidgetNode.getDXRuntimeContext().O());
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac331342", new Object[]{this})).booleanValue();
        }
        DXRecyclerLruCache dXRecyclerLruCache = this.f7480a;
        if (dXRecyclerLruCache != null && dXRecyclerLruCache.size() > 0) {
            return false;
        }
        return true;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfe11168", new Object[]{this})).booleanValue();
        }
        if (this.f7480a == null) {
            return true;
        }
        return false;
    }

    public b n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("eec8bd60", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new a(this);
        }
        return this.b;
    }

    public DXWidgetNode o(int i) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("468b3324", new Object[]{this, new Integer(i)});
        }
        if (this.f7480a == null) {
            return null;
        }
        List<Long> list = this.d;
        if (list == null || i < 0 || i >= ((ArrayList) list).size()) {
            l = null;
        } else {
            l = (Long) ((ArrayList) this.d).remove(i);
        }
        if (l != null) {
            return this.f7480a.remove(l);
        }
        return null;
    }

    public void p(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88534c5f", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }

    public void q(int i, DXWidgetNode dXWidgetNode) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60b4028", new Object[]{this, new Integer(i), dXWidgetNode});
        } else if (this.f7480a != null) {
            List<Long> list = this.d;
            if (list == null || i < 0 || i >= ((ArrayList) list).size()) {
                l = null;
            } else {
                l = (Long) ((ArrayList) this.d).get(i);
            }
            if (l != null) {
                this.f7480a.remove(l);
                Long e = e(i, dXWidgetNode);
                ((ArrayList) this.d).set(i, e);
                this.f7480a.c(e, dXWidgetNode);
            }
        }
    }

    public void r(List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed48870", new Object[]{this, list});
        } else if (list != null) {
            int max = Math.max(this.e, list.size());
            this.d = new ArrayList();
            this.f7480a = new DXRecyclerLruCache(max, n());
            for (int i = 0; i < list.size(); i++) {
                Long e = e(i, list.get(i));
                ((ArrayList) this.d).add(e);
                this.f7480a.c(e, list.get(i));
            }
        }
    }
}
