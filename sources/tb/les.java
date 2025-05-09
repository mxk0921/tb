package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class les {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Incorrect field signature: TT; */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f23301a;
        public final /* synthetic */ g1a<T, xhv> b;

        /* JADX WARN: Incorrect types in method signature: (TT;Ltb/g1a<-TT;Ltb/xhv;>;)V */
        public a(View view, g1a g1aVar) {
            this.f23301a = view;
            this.b = g1aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (les.a(this.f23301a)) {
                g1a<T, xhv> g1aVar = this.b;
                if (view != null) {
                    g1aVar.invoke(view);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type T of com.taobao.themis.utils.TMSViewExtKt.clickWithTrigger");
            }
        }
    }

    static {
        t2o.a(849346582);
    }

    public static final /* synthetic */ boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e47436a4", new Object[]{view})).booleanValue();
        }
        return b(view);
    }

    public static final <T extends View> boolean b(T t) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46f30f64", new Object[]{t})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - g(t) >= f(t)) {
            z = true;
        }
        i(t, currentTimeMillis);
        return z;
    }

    public static final <T extends View> void c(T t, long j, g1a<? super T, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1200c669", new Object[]{t, new Long(j), g1aVar});
            return;
        }
        ckf.g(t, "<this>");
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        h(t, j);
        ViewProxy.setOnClickListener(t, new a(t, g1aVar));
    }

    public static /* synthetic */ void d(View view, long j, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d260759", new Object[]{view, new Long(j), g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            j = 800;
        }
        c(view, j, g1aVar);
    }

    public static final <T extends View> long f(T t) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b144329e", new Object[]{t})).longValue();
        }
        Object tag = t.getTag(612345420);
        if (tag instanceof Long) {
            l = (Long) tag;
        } else {
            l = null;
        }
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public static final <T extends View> long g(T t) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c86b51a", new Object[]{t})).longValue();
        }
        Object tag = t.getTag(612345421);
        if (tag instanceof Long) {
            l = (Long) tag;
        } else {
            l = null;
        }
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static final <T extends View> void h(T t, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34e3066", new Object[]{t, new Long(j)});
        } else {
            t.setTag(612345420, Long.valueOf(j));
        }
    }

    public static final <T extends View> void i(T t, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0ee3d2", new Object[]{t, new Long(j)});
        } else {
            t.setTag(612345421, Long.valueOf(j));
        }
    }

    public static final Pair<Integer, Integer> e(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ae3b7f4c", new Object[]{view, view2});
        }
        ckf.g(view, "<this>");
        ckf.g(view2, f8v.KEY_TARGET_VIEW);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationInWindow(iArr);
            view2.getLocationInWindow(iArr2);
            return new Pair<>(Integer.valueOf(iArr[0] - iArr2[0]), Integer.valueOf(iArr[1] - iArr2[1]));
        } catch (Exception unused) {
            return null;
        }
    }
}
