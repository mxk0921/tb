package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rug {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_ITEM_ADD = 1;
    public static final int FLAG_ITEM_CHANGED = 4;
    public static final int FLAG_ITEM_HEADER = 16;
    public static final int FLAG_ITEM_MOVE = 8;
    public static final int FLAG_ITEM_REMOVED = 2;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f27614a = new ArrayList<>();
    public final okc b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends d {
        public final int b;
        public int c;
        public final boolean d;

        static {
            t2o.a(503316922);
        }

        public a(int i, int i2, boolean z) {
            this.b = i;
            this.c = i2;
            this.d = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends d {
        public final int b;

        static {
            t2o.a(503316923);
        }

        public b(int i) {
            this.b = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c extends d {
        public final int b;
        public int c;

        static {
            t2o.a(503316924);
        }

        public c(int i, int i2) {
            this.b = i;
            this.c = i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f27615a;

        static {
            t2o.a(503316925);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e extends d {
        public final int b;
        public final int c;

        static {
            t2o.a(503316926);
        }

        public e(int i, int i2) {
            this.b = i;
            this.c = i2;
        }
    }

    static {
        t2o.a(503316921);
    }

    public rug(okc okcVar) {
        this.b = okcVar;
    }

    public void a(int i, int i2, int i3, boolean z) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8bcf5d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        d dVar2 = null;
        if (this.f27614a.size() > 0) {
            ArrayList<d> arrayList = this.f27614a;
            dVar = arrayList.get(arrayList.size() - 1);
        } else {
            dVar = null;
        }
        if ((i & 1) != 0) {
            if (akt.Y0() && dVar != null && dVar.f27615a == i) {
                a aVar = (a) dVar;
                int i4 = aVar.b;
                int i5 = aVar.c;
                if (i4 + i5 == i2) {
                    aVar.c = i5 + 1;
                }
            }
            if (dVar != null && dVar.f27615a == i) {
                a aVar2 = (a) dVar;
                if (aVar2.b == i2) {
                    aVar2.c++;
                }
            }
            dVar2 = new a(i2, 1, z);
        } else if ((i & 2) != 0) {
            if (dVar != null && dVar.f27615a == i) {
                c cVar = (c) dVar;
                if (cVar.b == i2) {
                    cVar.c++;
                }
            }
            dVar2 = new c(i2, 1);
        } else if ((i & 8) != 0) {
            dVar2 = new e(i2, i3);
        } else if ((i & 4) != 0) {
            dVar2 = new b(i2);
        }
        if (dVar2 != null) {
            dVar2.f27615a = i;
            this.f27614a.add(dVar2);
        }
    }

    public boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e22ffff2", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z && this.b != null) {
            Iterator<d> it = this.f27614a.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next instanceof a) {
                    okc okcVar = this.b;
                    int i = next.f27615a;
                    a aVar = (a) next;
                    okcVar.onItemInserted(i, aVar.b, aVar.c, aVar.d);
                } else if (next instanceof c) {
                    okc okcVar2 = this.b;
                    int i2 = next.f27615a;
                    c cVar = (c) next;
                    okcVar2.onItemRemoved(i2, cVar.b, cVar.c);
                } else if (next instanceof e) {
                    okc okcVar3 = this.b;
                    int i3 = next.f27615a;
                    e eVar = (e) next;
                    okcVar3.onItemMoved(i3, eVar.b, eVar.c);
                } else if (next instanceof b) {
                    this.b.onItemChange(next.f27615a, ((b) next).b);
                }
            }
        }
        boolean z2 = !this.f27614a.isEmpty();
        this.f27614a.clear();
        return z2;
    }
}
