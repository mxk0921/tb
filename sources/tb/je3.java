package tb;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.CartFragmentLayout;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.android.icart.widget.touch.DragParentFrameLayout;
import com.taobao.ptr.PtrBase;
import com.taobao.taobao.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class je3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile b f21948a;
    public static final Object b = new Object();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final AtomicBoolean d = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f21949a;

        public a(Activity activity) {
            this.f21949a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                synchronized (je3.a()) {
                    View h = je3.h(this.f21949a);
                    je3.c(new b());
                    b.b(je3.b(), h);
                    b.c(je3.b(), (LinearLayout) h.findViewById(R.id.status_container));
                    b.d(je3.b(), (LinearLayout) h.findViewById(R.id.cart_top_layout));
                    b.e(je3.b(), (LinearLayout) h.findViewById(R.id.cart_bottom_layout));
                    b.f(je3.b(), (CartRecyclerView) h.findViewById(R.id.cart_recycler_view));
                    b.g(je3.b(), h.findViewById(R.id.ptr_loading));
                    b.h(je3.b(), (DragParentFrameLayout) h.findViewById(R.id.drag_parent_layout));
                    b.i(je3.b(), (PtrBase) h.findViewById(R.id.cart_refresh));
                    b.a(je3.b(), (ViewGroup) h.findViewById(R.id.cart_bottom_float_layout));
                    je3.d().set(true);
                    hav.d("CartViewPreLoader", "结束预加载");
                }
            } catch (Throwable th) {
                ei8.a("CartViewPreLoader", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public View f21950a;
        public LinearLayout b;
        public LinearLayout c;
        public LinearLayout d;
        public View e;
        public CartRecyclerView f;
        public DragParentFrameLayout g;
        public PtrBase h;
        public ViewGroup i;

        static {
            t2o.a(478150836);
        }

        public static /* synthetic */ ViewGroup a(b bVar, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("fac48356", new Object[]{bVar, viewGroup});
            }
            bVar.i = viewGroup;
            return viewGroup;
        }

        public static /* synthetic */ View b(b bVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("88d162c7", new Object[]{bVar, view});
            }
            bVar.f21950a = view;
            return view;
        }

        public static /* synthetic */ LinearLayout c(b bVar, LinearLayout linearLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinearLayout) ipChange.ipc$dispatch("641dceb2", new Object[]{bVar, linearLayout});
            }
            bVar.b = linearLayout;
            return linearLayout;
        }

        public static /* synthetic */ LinearLayout d(b bVar, LinearLayout linearLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinearLayout) ipChange.ipc$dispatch("f0d428f3", new Object[]{bVar, linearLayout});
            }
            bVar.c = linearLayout;
            return linearLayout;
        }

        public static /* synthetic */ LinearLayout e(b bVar, LinearLayout linearLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinearLayout) ipChange.ipc$dispatch("7d8a8334", new Object[]{bVar, linearLayout});
            }
            bVar.d = linearLayout;
            return linearLayout;
        }

        public static /* synthetic */ CartRecyclerView f(b bVar, CartRecyclerView cartRecyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CartRecyclerView) ipChange.ipc$dispatch("1b8aa6ad", new Object[]{bVar, cartRecyclerView});
            }
            bVar.f = cartRecyclerView;
            return cartRecyclerView;
        }

        public static /* synthetic */ View g(b bVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("93dba8c", new Object[]{bVar, view});
            }
            bVar.e = view;
            return view;
        }

        public static /* synthetic */ DragParentFrameLayout h(b bVar, DragParentFrameLayout dragParentFrameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DragParentFrameLayout) ipChange.ipc$dispatch("534a453d", new Object[]{bVar, dragParentFrameLayout});
            }
            bVar.g = dragParentFrameLayout;
            return dragParentFrameLayout;
        }

        public static /* synthetic */ PtrBase i(b bVar, PtrBase ptrBase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PtrBase) ipChange.ipc$dispatch("c0d4f190", new Object[]{bVar, ptrBase});
            }
            bVar.h = ptrBase;
            return ptrBase;
        }

        public LinearLayout j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinearLayout) ipChange.ipc$dispatch("90a5d0c4", new Object[]{this});
            }
            return this.d;
        }

        public DragParentFrameLayout k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DragParentFrameLayout) ipChange.ipc$dispatch("947dd404", new Object[]{this});
            }
            return this.g;
        }

        public ViewGroup l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("17154e63", new Object[]{this});
            }
            return this.i;
        }

        public LinearLayout m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinearLayout) ipChange.ipc$dispatch("ccb79379", new Object[]{this});
            }
            return this.c;
        }

        public PtrBase n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PtrBase) ipChange.ipc$dispatch("a85b8baa", new Object[]{this});
            }
            return this.h;
        }

        public View o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("b6eec0cf", new Object[]{this});
            }
            return this.e;
        }

        public CartRecyclerView p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CartRecyclerView) ipChange.ipc$dispatch("6812520e", new Object[]{this});
            }
            return this.f;
        }

        public View q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
            }
            return this.f21950a;
        }

        public LinearLayout r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinearLayout) ipChange.ipc$dispatch("9cd20fd7", new Object[]{this});
            }
            return this.b;
        }
    }

    static {
        t2o.a(478150834);
    }

    public static /* synthetic */ Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7d600c9b", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("bb660c70", new Object[0]);
        }
        return f21948a;
    }

    public static /* synthetic */ b c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("acfa5686", new Object[]{bVar});
        }
        f21948a = bVar;
        return bVar;
    }

    public static /* synthetic */ AtomicBoolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("5528d467", new Object[0]);
        }
        return d;
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
        } else {
            f21948a = null;
        }
    }

    public static b f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("64db758", new Object[]{activity});
        }
        b bVar = f21948a;
        if (!d.get() || bVar == null || bVar.q() == null || bVar.q().getContext() != activity) {
            hav.d("CartViewPreLoader", "未命中预加载");
            return null;
        }
        f21948a = null;
        hav.d("CartViewPreLoader", "命中预加载");
        return bVar;
    }

    public static View h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ced92d82", new Object[]{context});
        }
        if (vav.a(c9x.CART_BIZ_NAME, "inflateCartFragmentLayoutFromCode", true)) {
            return new CartFragmentLayout(context);
        }
        return LayoutInflater.from(context).inflate(R.layout.icart_fragment_cart_v2, (ViewGroup) null, false);
    }

    public static b g(Activity activity) {
        b f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3cb2d6ad", new Object[]{activity});
        }
        if (!vav.a(c9x.CART_BIZ_NAME, "waitSyncToGetCartViewBean", true)) {
            return f(activity);
        }
        synchronized (b) {
            f = f(activity);
        }
        return f;
    }

    public static void i(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e78d84", new Object[]{activity});
        } else if (cc3.a("viewPreLoader")) {
            if (c.getAndSet(true) || activity == null || !ic3.c()) {
                hav.d("CartViewPreLoader", "跳过");
            } else if (DataBizContext.ShareContext.enablePrefetchView()) {
                hav.d("CartViewPreLoader", "开始预加载");
                tuo.c(new a(activity));
            }
        }
    }
}
