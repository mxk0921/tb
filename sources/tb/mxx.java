package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mxx implements gzx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Handler e;
    public final com.uploader.implement.a g;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<j5y> f24377a = new ArrayList<>();
    public final ArrayList<b> b = new ArrayList<>();
    public final ArrayList<a> c = new ArrayList<>();
    public final ArrayList<Pair<a, j5y>> d = new ArrayList<>();
    public final int f = hashCode();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final oxx f24378a;
        public final i5y b;
        public final b4y c;

        public a(oxx oxxVar, i5y i5yVar, b4y b4yVar) {
            this.f24378a = oxxVar;
            this.b = i5yVar;
            this.c = b4yVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final j5y f24379a;
        public final ArrayList<j5y> b;
        public final ArrayList<b> c;

        public b(j5y j5yVar, ArrayList<j5y> arrayList, ArrayList<b> arrayList2) {
            this.f24379a = j5yVar;
            this.b = arrayList;
            this.c = arrayList2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.b.remove(this.f24379a);
            this.c.remove(this);
            this.f24379a.c();
        }
    }

    public mxx(com.uploader.implement.a aVar, Looper looper) {
        this.g = aVar;
        this.e = new Handler(looper);
    }

    public static int a(wtx wtxVar, ArrayList<j5y> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62bee9db", new Object[]{wtxVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).a().equals(wtxVar)) {
                return i;
            }
        }
        return -1;
    }

    public static int b(oxx oxxVar, i5y i5yVar, ArrayList<Pair<a, j5y>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d845d508", new Object[]{oxxVar, i5yVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) arrayList.get(i).first;
            if (aVar.b.equals(i5yVar) && aVar.f24378a.equals(oxxVar)) {
                return i;
            }
        }
        return -1;
    }

    public static int c(j5y j5yVar, ArrayList<b> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73801ddf", new Object[]{j5yVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).f24379a.equals(j5yVar)) {
                return i;
            }
        }
        return -1;
    }

    public static int k(wtx wtxVar, ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda687a", new Object[]{wtxVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).b.a().equals(wtxVar)) {
                return i;
            }
        }
        return -1;
    }

    public static int l(oxx oxxVar, i5y i5yVar, ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f73f27", new Object[]{oxxVar, i5yVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = arrayList.get(i);
            if (aVar.b.equals(i5yVar) && aVar.f24378a.equals(oxxVar)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean m(wtx wtxVar, ArrayList<Pair<a, j5y>> arrayList) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96f5e72a", new Object[]{wtxVar, arrayList})).booleanValue();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((a) arrayList.get(i2).first).b.a().equals(wtxVar) && i - 1 == 0) {
                return false;
            }
        }
        return true;
    }

    public final j5y d(wtx wtxVar, j5y j5yVar, boolean z) {
        int a2;
        int c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5y) ipChange.ipc$dispatch("b9b4bcf0", new Object[]{this, wtxVar, j5yVar, new Boolean(z)});
        }
        if (!(j5yVar != null || (a2 = a(wtxVar, this.f24377a)) == -1 || (c = c((j5yVar = this.f24377a.remove(a2)), this.b)) == -1)) {
            this.e.removeCallbacks(this.b.remove(c));
        }
        if (j5yVar != null) {
            j5yVar.b(null);
            if (!z) {
                j5yVar.c();
            }
            if (j5yVar.d()) {
                j5yVar = wtxVar.a(this.g);
            }
        } else {
            j5yVar = wtxVar.a(this.g);
        }
        if (rtx.d(2)) {
            rtx.a(2, "ConnectionRecycler", this.f + " retrieve, connection:" + j5yVar.hashCode() + " keepAlive:" + z);
        }
        return j5yVar;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.clear();
        for (int size = this.b.size() - 1; size >= 0; size--) {
            this.e.removeCallbacks(this.b.get(size));
        }
        this.b.clear();
        for (int size2 = this.d.size() - 1; size2 >= 0; size2--) {
            j5y j5yVar = (j5y) this.d.get(size2).second;
            j5yVar.b(null);
            j5yVar.c();
        }
        this.d.clear();
        for (int size3 = this.f24377a.size() - 1; size3 >= 0; size3--) {
            j5y j5yVar2 = this.f24377a.get(size3);
            j5yVar2.b(null);
            j5yVar2.c();
        }
        this.f24377a.clear();
        if (rtx.d(2)) {
            rtx.a(2, "ConnectionRecycler", this.f + " reset");
        }
    }

    public final void f(j5y j5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e8167e", new Object[]{this, j5yVar});
            return;
        }
        int k = k(j5yVar.a(), this.c);
        if (k != -1) {
            a remove = this.c.remove(k);
            this.d.add(new Pair<>(remove, j5yVar));
            ((hzx) remove.c).o(remove.f24378a, remove.b, j5yVar);
            if (rtx.d(2)) {
                rtx.a(2, "ConnectionRecycler", this.f + " rebind, onAvailable:" + remove.f24378a.hashCode() + " request:" + remove.b.hashCode());
                return;
            }
            return;
        }
        this.f24377a.add(j5yVar);
        b bVar = new b(j5yVar, this.f24377a, this.b);
        this.e.postDelayed(bVar, 27000L);
        this.b.add(bVar);
        if (rtx.d(2)) {
            rtx.a(2, "ConnectionRecycler", this.f + " rebind, start timeout connection:" + j5yVar.hashCode());
        }
    }

    public boolean g(oxx oxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff054342", new Object[]{this, oxxVar})).booleanValue();
        }
        boolean z = false;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            if (this.c.get(size).f24378a.equals(oxxVar)) {
                this.c.remove(size);
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int size2 = this.d.size() - 1; size2 >= 0; size2--) {
            Pair<a, j5y> pair = this.d.get(size2);
            if (((a) pair.first).f24378a.equals(oxxVar)) {
                this.d.remove(size2);
                arrayList.add(d(((a) pair.first).b.a(), (j5y) pair.second, false));
                z = true;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f((j5y) it.next());
        }
        if (rtx.d(2)) {
            rtx.a(2, "ConnectionRecycler", this.f + " unregister, session:" + oxxVar.hashCode() + " removed:" + z);
        }
        return z;
    }

    public boolean h(oxx oxxVar, i5y i5yVar, b4y b4yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("903c87f0", new Object[]{this, oxxVar, i5yVar, b4yVar})).booleanValue();
        }
        if (rtx.d(2)) {
            rtx.a(2, "ConnectionRecycler", this.f + " register start, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode());
        }
        wtx a2 = i5yVar.a();
        if (!a2.e) {
            j5y a3 = a2.a(this.g);
            ((hzx) b4yVar).o(oxxVar, i5yVar, a3);
            if (rtx.d(2)) {
                rtx.a(2, "ConnectionRecycler", this.f + " register, onAvailable short lived connection:" + a3.hashCode() + " request:" + i5yVar.hashCode());
            }
            return true;
        }
        if (b(oxxVar, i5yVar, this.d) != -1 && rtx.d(8)) {
            rtx.a(8, "ConnectionRecycler", this.f + " register, is bounding, request:" + i5yVar.hashCode());
        }
        if (l(oxxVar, i5yVar, this.c) != -1 && rtx.d(8)) {
            rtx.a(8, "ConnectionRecycler", this.f + " register, is waiting, request:" + i5yVar.hashCode());
        }
        a aVar = new a(oxxVar, i5yVar, b4yVar);
        if (3 <= this.d.size() || !m(a2, this.d)) {
            this.c.add(aVar);
            if (rtx.d(2)) {
                rtx.a(2, "ConnectionRecycler", this.f + " register, waiting request:" + i5yVar.hashCode());
            }
            return true;
        }
        j5y d = d(a2, null, true);
        this.d.add(new Pair<>(aVar, d));
        ((hzx) b4yVar).o(oxxVar, i5yVar, d);
        if (rtx.d(2)) {
            rtx.a(2, "ConnectionRecycler", this.f + " register, onAvailable long lived connection:" + d.hashCode() + " request:" + i5yVar.hashCode());
        }
        return true;
    }

    public boolean i(oxx oxxVar, i5y i5yVar, i5y i5yVar2, b4y b4yVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("105e93d5", new Object[]{this, oxxVar, i5yVar, i5yVar2, b4yVar, new Boolean(z)})).booleanValue();
        }
        if (rtx.d(2)) {
            rtx.a(2, "ConnectionRecycler", this.f + " replace start, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode() + " newRequest:" + i5yVar2.hashCode() + " keepAlive:" + z);
        }
        wtx a2 = i5yVar.a();
        if (!a2.equals(i5yVar2.a())) {
            if (rtx.d(2)) {
                rtx.a(2, "ConnectionRecycler", this.f + " replace:failure, false !=, request:" + i5yVar.hashCode() + " newRequest:" + i5yVar2.hashCode());
            }
            return false;
        } else if (!a2.e) {
            if (rtx.d(2)) {
                rtx.a(2, "ConnectionRecycler", this.f + " replace:false, !isLongLived");
            }
            return false;
        } else {
            int l = l(oxxVar, i5yVar, this.c);
            if (l != -1) {
                this.c.set(l, new a(oxxVar, i5yVar2, b4yVar));
                if (rtx.d(2)) {
                    rtx.a(2, "ConnectionRecycler", this.f + " replace, waiting, request:" + i5yVar.hashCode() + " newRequest:" + i5yVar2.hashCode());
                }
                return true;
            }
            int b2 = b(oxxVar, i5yVar, this.d);
            if (b2 == -1) {
                if (rtx.d(2)) {
                    rtx.a(2, "ConnectionRecycler", this.f + " replace failure, !bounding, request:" + i5yVar.hashCode());
                }
                return false;
            }
            j5y d = d(a2, (j5y) this.d.get(b2).second, z);
            this.d.set(b2, new Pair<>(new a(oxxVar, i5yVar2, b4yVar), d));
            ((hzx) b4yVar).o(oxxVar, i5yVar2, d);
            if (rtx.d(8)) {
                rtx.a(8, "ConnectionRecycler", this.f + " replace, bounding, request:" + i5yVar.hashCode() + " newRequest:" + i5yVar2.hashCode() + " available connection:" + d.hashCode());
            }
            return true;
        }
    }

    public boolean j(oxx oxxVar, i5y i5yVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("836b91c3", new Object[]{this, oxxVar, i5yVar, new Boolean(z)})).booleanValue();
        }
        wtx a2 = i5yVar.a();
        if (rtx.d(2)) {
            rtx.a(2, "ConnectionRecycler", this.f + " unregister start, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode());
        }
        if (!a2.e) {
            if (rtx.d(2)) {
                rtx.a(2, "ConnectionRecycler", this.f + " unregister, !isLongLived, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode());
            }
            return false;
        }
        int l = l(oxxVar, i5yVar, this.c);
        if (l != -1) {
            this.c.remove(l);
            if (rtx.d(2)) {
                rtx.a(2, "ConnectionRecycler", this.f + " unregister, waiting, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode());
            }
            return true;
        }
        int b2 = b(oxxVar, i5yVar, this.d);
        if (b2 == -1) {
            return false;
        }
        Pair<a, j5y> remove = this.d.remove(b2);
        j5y d = d(((a) remove.first).b.a(), (j5y) remove.second, z);
        f(d);
        if (rtx.d(2)) {
            rtx.a(2, "ConnectionRecycler", this.f + " unregister, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode() + " connection:" + d.hashCode());
        }
        return true;
    }
}
