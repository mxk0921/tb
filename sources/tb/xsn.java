package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.videoc.expose.impl.RecyclerViewZone;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import tb.a10;
import tb.b10;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xsn<ExposeKey, ExposeData> extends b10<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final WeakReference<RecyclerView> b;
    public xsn<ExposeKey, ExposeData>.c c;
    public final Set<String> d = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b<ExposeKey, ExposeData> extends b10.a<ExposeKey, ExposeData, a10.b<ExposeData>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final RecyclerView e;

        static {
            t2o.a(444597115);
        }

        public b(RecyclerView recyclerView, RecyclerViewZone.b<ExposeKey, ExposeData> bVar) {
            this(recyclerView, bVar, new u07());
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/videoc/expose/RecyclerViewExposureEngine$Builder");
        }

        @Override // tb.b10.a
        public j4c<ExposeKey, ExposeData> b(n4c<ExposeKey, ExposeData> n4cVar, Collection<m4c<ExposeKey, ExposeData>> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j4c) ipChange.ipc$dispatch("8c2d7c47", new Object[]{this, n4cVar, collection});
            }
            return new xsn(this.e, n4cVar);
        }

        public b(RecyclerView recyclerView, RecyclerViewZone.b<ExposeKey, ExposeData> bVar, i4c<ExposeKey, ExposeData, a10.b<ExposeData>> i4cVar) {
            super(new RecyclerViewZone.a(recyclerView).e(bVar), i4cVar);
            this.e = recyclerView;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597116);
        }

        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            for (String str : xsn.n(xsn.this)) {
                xsn.o(xsn.this).e(str);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else {
                xsn.p(xsn.this).f();
            }
        }
    }

    static {
        t2o.a(444597113);
    }

    public xsn(RecyclerView recyclerView, n4c<ExposeKey, ExposeData> n4cVar) {
        super(n4cVar);
        this.b = new WeakReference<>(recyclerView);
    }

    public static /* synthetic */ Object ipc$super(xsn xsnVar, String str, Object... objArr) {
        if (str.hashCode() == 1270773011) {
            super.m((String) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/videoc/expose/RecyclerViewExposureEngine");
    }

    public static /* synthetic */ Set n(xsn xsnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8edc5e72", new Object[]{xsnVar});
        }
        return xsnVar.d;
    }

    public static /* synthetic */ n4c o(xsn xsnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n4c) ipChange.ipc$dispatch("dcbd234e", new Object[]{xsnVar});
        }
        return xsnVar.f16120a;
    }

    public static /* synthetic */ n4c p(xsn xsnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n4c) ipChange.ipc$dispatch("e6d2112d", new Object[]{xsnVar});
        }
        return xsnVar.f16120a;
    }

    @Override // tb.j4c
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{this, str});
            return;
        }
        if (str == null) {
            for (m4c<ExposeKey, ExposeData> m4cVar : this.f16120a.h()) {
                ((HashSet) this.d).add(m4cVar.key());
            }
        } else {
            ((HashSet) this.d).add(str);
        }
        if (this.c == null) {
            this.c = new c();
            RecyclerView recyclerView = this.b.get();
            if (recyclerView != null) {
                recyclerView.addOnAttachStateChangeListener(this.c);
            }
        } else if (str == null) {
            this.f16120a.j();
        } else {
            this.f16120a.e(str);
        }
    }

    @Override // tb.b10
    public void m(String str) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbe7513", new Object[]{this, str});
            return;
        }
        super.m(str);
        if (str == null) {
            ((HashSet) this.d).clear();
        } else {
            ((HashSet) this.d).remove(str);
        }
        if (this.c != null && ((HashSet) this.d).isEmpty() && (recyclerView = this.b.get()) != null) {
            recyclerView.removeOnAttachStateChangeListener(this.c);
        }
    }

    @Override // tb.j4c
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            m(null);
        }
    }
}
