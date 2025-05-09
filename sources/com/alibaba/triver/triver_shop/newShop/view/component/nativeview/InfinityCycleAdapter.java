package com.alibaba.triver.triver_shop.newShop.view.component.nativeview;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.component.nativeview.ShopIndexNavNativeComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import tb.bmi;
import tb.ckf;
import tb.f8v;
import tb.kew;
import tb.mrk;
import tb.npp;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class InfinityCycleAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f3213a;
    public final ShopIndexNavNativeComponent.b b;
    public final ShopDataParser c;
    public mrk d;
    public a e;
    public int f;
    public final HashMap<Integer, ViewHolder> g = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextView f3214a;
        public final ShopIndexNavNativeComponent.b b;
        public int c;
        public final View.OnClickListener d = new c();
        public final a e = new a();
        public final /* synthetic */ InfinityCycleAdapter f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements ShopIndexNavNativeComponent.b.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.alibaba.triver.triver_shop.newShop.view.component.nativeview.ShopIndexNavNativeComponent.b.a
            public void a(ShopIndexNavNativeComponent.b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5cf37fbf", new Object[]{this, bVar});
                    return;
                }
                ckf.g(bVar, "statusModel");
                ViewHolder.this.m0();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // com.alibaba.triver.triver_shop.newShop.view.component.nativeview.InfinityCycleAdapter.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f3910b4b", new Object[]{this});
                    return;
                }
                ViewHolder viewHolder = ViewHolder.this;
                ViewHolder.b0(viewHolder, viewHolder.f0());
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class c implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ViewHolder viewHolder = ViewHolder.this;
                ViewHolder.c0(viewHolder, viewHolder.e0(), true);
            }
        }

        static {
            t2o.a(766509977);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(InfinityCycleAdapter infinityCycleAdapter, TextView textView, ShopIndexNavNativeComponent.b bVar) {
            super(textView);
            ckf.g(infinityCycleAdapter, "this$0");
            ckf.g(textView, f8v.KEY_TARGET_VIEW);
            ckf.g(bVar, "statusModel");
            this.f = infinityCycleAdapter;
            this.f3214a = textView;
            this.b = bVar;
        }

        public static final /* synthetic */ void b0(ViewHolder viewHolder, TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("599f926d", new Object[]{viewHolder, textView});
            } else {
                viewHolder.g0(textView);
            }
        }

        public static final /* synthetic */ void c0(ViewHolder viewHolder, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66249ab5", new Object[]{viewHolder, new Integer(i), new Boolean(z)});
            } else {
                viewHolder.j0(i, z);
            }
        }

        public static /* synthetic */ Object ipc$super(ViewHolder viewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/InfinityCycleAdapter$ViewHolder");
        }

        public static /* synthetic */ void k0(ViewHolder viewHolder, int i, boolean z, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35a44cd", new Object[]{viewHolder, new Integer(i), new Boolean(z), new Integer(i2), obj});
                return;
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            viewHolder.j0(i, z);
        }

        public final void d0(TextView textView) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9cd2c32", new Object[]{this, textView});
                return;
            }
            String k0 = InfinityCycleAdapter.N(this.f).k0();
            String k02 = InfinityCycleAdapter.N(this.f).k0();
            if (this.b.h() && (this.b.e() || (this.b.d() && this.b.f() && InfinityCycleAdapter.N(this.f).C() == 0))) {
                k0 = k02;
            }
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(1, 17.0f);
            try {
                textView.setTextColor(Color.parseColor(k0));
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
        }

        public final int e0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public final TextView f0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("a54705c7", new Object[]{this});
            }
            return this.f3214a;
        }

        public final void g0(TextView textView) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3a5e830", new Object[]{this, textView});
                return;
            }
            String j0 = InfinityCycleAdapter.N(this.f).j0();
            String i0 = InfinityCycleAdapter.N(this.f).i0();
            if (this.b.h() && (this.b.e() || (this.b.d() && this.b.f() && InfinityCycleAdapter.N(this.f).C() == 0))) {
                j0 = i0;
            }
            textView.setTextSize(1, 17.0f);
            textView.setTypeface(Typeface.DEFAULT);
            try {
                textView.setTextColor(Color.parseColor(j0));
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
        }

        public final void h0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3e5b620", new Object[]{this, new Integer(i)});
                return;
            }
            this.b.a(this.e);
            this.c = i;
            this.f3214a.setText((CharSequence) InfinityCycleAdapter.M(this.f).get(i % InfinityCycleAdapter.M(this.f).size()));
            n0(i);
            l0();
        }

        public final void i0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c7d6fb7", new Object[]{this});
            } else {
                this.b.j(this.e);
            }
        }

        public final void j0(int i, boolean z) {
            mrk P;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a511912", new Object[]{this, new Integer(i), new Boolean(z)});
                return;
            }
            this.f.W(i);
            a Q = this.f.Q();
            if (Q != null) {
                Q.a();
            }
            if (z && (P = this.f.P()) != null) {
                P.onItemClick(i);
            }
            d0(this.f3214a);
            this.f.Y(new b());
        }

        public final void l0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a221390", new Object[]{this});
                return;
            }
            int p = kew.p(Double.valueOf(13.5d));
            if (this.b.d()) {
                this.f3214a.setGravity(16);
                if (this.c == 0) {
                    this.f3214a.setPadding(0, 0, p, 0);
                } else {
                    this.f3214a.setPadding(p, 0, p, 0);
                }
            } else {
                this.f3214a.setGravity(16);
                if (this.c == 0) {
                    this.f3214a.setPadding(0, 0, p, 0);
                } else {
                    this.f3214a.setPadding(p, 0, p, 0);
                }
            }
        }

        public final void m0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3631aef", new Object[]{this});
                return;
            }
            if (this.c == this.f.O()) {
                k0(this, this.c, false, 2, null);
            } else {
                g0(this.f3214a);
            }
            this.f3214a.setOnClickListener(this.d);
            l0();
        }

        public final void n0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bc812b3", new Object[]{this, new Integer(i)});
                return;
            }
            this.c = i;
            if (i == this.f.O()) {
                k0(this, i, false, 2, null);
            } else {
                g0(this.f3214a);
            }
            this.f3214a.setOnClickListener(this.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a();
    }

    static {
        t2o.a(766509975);
    }

    public InfinityCycleAdapter(List<String> list, ShopIndexNavNativeComponent.b bVar, ShopDataParser shopDataParser) {
        ckf.g(list, bmi.CALLBACK_DATA_LIST);
        ckf.g(bVar, "statusModel");
        ckf.g(shopDataParser, "shopData");
        this.f3213a = list;
        this.b = bVar;
        this.c = shopDataParser;
        shopDataParser.h0();
    }

    public static final /* synthetic */ List M(InfinityCycleAdapter infinityCycleAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e317b4e0", new Object[]{infinityCycleAdapter});
        }
        return infinityCycleAdapter.f3213a;
    }

    public static final /* synthetic */ ShopDataParser N(InfinityCycleAdapter infinityCycleAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("79bdfdf3", new Object[]{infinityCycleAdapter});
        }
        return infinityCycleAdapter.c;
    }

    public static /* synthetic */ Object ipc$super(InfinityCycleAdapter infinityCycleAdapter, String str, Object... objArr) {
        if (str.hashCode() == 143764512) {
            super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/InfinityCycleAdapter");
    }

    public final int O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b2a74ee", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public final mrk P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mrk) ipChange.ipc$dispatch("5e0c8f78", new Object[]{this});
        }
        return this.d;
    }

    public final a Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2c1f16fd", new Object[]{this});
        }
        return this.e;
    }

    public final void S(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff68505", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = i;
        ViewHolder viewHolder = this.g.get(Integer.valueOf(i));
        if (viewHolder != null) {
            viewHolder.n0(i);
        }
    }

    /* renamed from: T */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387ad4ec", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        ckf.g(viewHolder, "viewholder");
        viewHolder.h0(i);
        this.g.put(Integer.valueOf(i), viewHolder);
    }

    /* renamed from: U */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewHolder) ipChange.ipc$dispatch("f4a30fe8", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        TextView textView = new TextView(viewGroup.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        textView.setGravity(16);
        return new ViewHolder(this, textView, this.b);
    }

    /* renamed from: V */
    public void onViewRecycled(ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d53bfdf", new Object[]{this, viewHolder});
            return;
        }
        super.onViewRecycled(viewHolder);
        if (viewHolder != null) {
            this.g.remove(Integer.valueOf(viewHolder.e0()));
            viewHolder.i0();
        }
    }

    public final void W(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f0f5dc", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final void X(mrk mrkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df64a52c", new Object[]{this, mrkVar});
        } else {
            this.d = mrkVar;
        }
    }

    public final void Y(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f683d5bd", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.f3213a.size();
    }
}
