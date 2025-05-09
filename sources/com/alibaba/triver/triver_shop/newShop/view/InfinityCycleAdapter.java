package com.alibaba.triver.triver_shop.newShop.view;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.InfinityCycleAdapter;
import com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.jvm.internal.Lambda;
import tb.a1v;
import tb.bmi;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.f8v;
import tb.jpu;
import tb.kew;
import tb.npp;
import tb.ork;
import tb.r54;
import tb.t2o;
import tb.why;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class InfinityCycleAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f3119a;
    public final List<String> b;
    public final ShopIndexNavCycleComponent.b c;
    public final ShopDataParser d;
    public ork e;
    public a f;
    public int g;
    public final HashMap<Integer, ViewHolder> h = new HashMap<>();
    public final boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextView f3120a;
        public final ShopIndexNavCycleComponent.b b;
        public int c;
        public final View.OnClickListener d;
        public final a e = new a();
        public final /* synthetic */ InfinityCycleAdapter f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements ShopIndexNavCycleComponent.b.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent.b.a
            public void a(ShopIndexNavCycleComponent.b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c77dab7f", new Object[]{this, bVar});
                    return;
                }
                ckf.g(bVar, "statusModel");
                ViewHolder.this.l0();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // com.alibaba.triver.triver_shop.newShop.view.InfinityCycleAdapter.a
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

        static {
            t2o.a(766509637);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(final InfinityCycleAdapter infinityCycleAdapter, TextView textView, ShopIndexNavCycleComponent.b bVar) {
            super(textView);
            ckf.g(infinityCycleAdapter, "this$0");
            ckf.g(textView, f8v.KEY_TARGET_VIEW);
            ckf.g(bVar, "statusModel");
            this.f = infinityCycleAdapter;
            this.f3120a = textView;
            this.b = bVar;
            this.d = new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.InfinityCycleAdapter$ViewHolder$targetViewClickListener$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.alibaba.triver.triver_shop.newShop.view.InfinityCycleAdapter$ViewHolder$targetViewClickListener$1$1  reason: invalid class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
                public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ InfinityCycleAdapter this$0;
                    public final /* synthetic */ InfinityCycleAdapter.ViewHolder this$1;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(InfinityCycleAdapter infinityCycleAdapter, InfinityCycleAdapter.ViewHolder viewHolder) {
                        super(0);
                        this.this$0 = infinityCycleAdapter;
                        this.this$1 = viewHolder;
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/InfinityCycleAdapter$ViewHolder$targetViewClickListener$1$1");
                    }

                    @Override // tb.d1a
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                            return;
                        }
                        JSONObject g = brf.g(InfinityCycleAdapter.N(this.this$0).W(), this.this$1.e0());
                        String string = g == null ? null : g.getString("utArg1");
                        if (string != null) {
                            a1v.c(InfinityCycleAdapter.N(this.this$0), string, a.i(jpu.a("actionType", "click")), null, 8, null);
                        }
                    }
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    InfinityCycleAdapter.ViewHolder viewHolder = InfinityCycleAdapter.ViewHolder.this;
                    InfinityCycleAdapter.ViewHolder.c0(viewHolder, viewHolder.e0());
                    r54.P("cycleIndexNavClickTask", new AnonymousClass1(infinityCycleAdapter, InfinityCycleAdapter.ViewHolder.this));
                }
            };
        }

        public static final /* synthetic */ void b0(ViewHolder viewHolder, TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28037992", new Object[]{viewHolder, textView});
            } else {
                viewHolder.g0(textView);
            }
        }

        public static final /* synthetic */ void c0(ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edd5e49e", new Object[]{viewHolder, new Integer(i)});
            } else {
                viewHolder.j0(i);
            }
        }

        public static /* synthetic */ Object ipc$super(ViewHolder viewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/InfinityCycleAdapter$ViewHolder");
        }

        public final void d0(TextView textView) {
            String str;
            String str2;
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9cd2c32", new Object[]{this, textView});
                return;
            }
            if (this.f.P()) {
                str2 = InfinityCycleAdapter.N(this.f).k0();
                str = InfinityCycleAdapter.N(this.f).k0();
            } else {
                str2 = "#111111";
                str = why.DEFAULT_MASK_BACKGROUND_COLOR;
            }
            if (this.b.h() && (this.b.e() || (this.b.d() && this.b.f() && InfinityCycleAdapter.N(this.f).C() == 0))) {
                str2 = str;
            }
            if (!this.b.g() || this.b.c() != 0) {
                str = str2;
            }
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(1, 17.0f);
            try {
                textView.setTextColor(Color.parseColor(str));
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
            return this.f3120a;
        }

        public final void g0(TextView textView) {
            String str;
            String str2;
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3a5e830", new Object[]{this, textView});
                return;
            }
            if (this.f.P()) {
                str2 = InfinityCycleAdapter.N(this.f).j0();
                str = InfinityCycleAdapter.N(this.f).i0();
            } else {
                str2 = "#4c111111";
                str = "#99ffffff";
            }
            if (this.b.h() && (this.b.e() || (this.b.d() && this.b.f() && InfinityCycleAdapter.N(this.f).C() == 0))) {
                str2 = str;
            }
            if (!this.b.g() || this.b.c() != 0) {
                str = str2;
            }
            textView.setTextSize(1, 17.0f);
            textView.setTypeface(Typeface.DEFAULT);
            try {
                textView.setTextColor(Color.parseColor(str));
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
            this.f3120a.setText((CharSequence) InfinityCycleAdapter.M(this.f).get(i % InfinityCycleAdapter.M(this.f).size()));
            m0(i);
            k0();
        }

        public final void i0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c7d6fb7", new Object[]{this});
            } else {
                this.b.j(this.e);
            }
        }

        public final void j0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("870ada02", new Object[]{this, new Integer(i)});
                return;
            }
            this.f.X(i);
            a S = this.f.S();
            if (S != null) {
                S.a();
            }
            ork Q = this.f.Q();
            if (Q != null) {
                Q.onItemClick(i);
            }
            d0(this.f3120a);
            this.f.Z(new b());
        }

        public final void k0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a221390", new Object[]{this});
                return;
            }
            int p = kew.p(Double.valueOf(13.5d));
            if (this.b.d()) {
                this.f3120a.setGravity(16);
                if (this.c == 0) {
                    this.f3120a.setPadding(0, 0, p, 0);
                } else {
                    this.f3120a.setPadding(p, 0, p, 0);
                }
            } else {
                this.f3120a.setGravity(16);
                if (this.c == 0) {
                    this.f3120a.setPadding(0, 0, p, 0);
                } else {
                    this.f3120a.setPadding(p, 0, p, 0);
                }
            }
        }

        public final void l0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3631aef", new Object[]{this});
                return;
            }
            if (this.c == this.f.O()) {
                j0(this.c);
            } else {
                g0(this.f3120a);
            }
            this.f3120a.setOnClickListener(this.d);
            k0();
        }

        public final void m0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bc812b3", new Object[]{this, new Integer(i)});
                return;
            }
            this.c = i;
            if (i == this.f.O()) {
                j0(i);
            } else {
                g0(this.f3120a);
            }
            this.f3120a.setOnClickListener(this.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a();
    }

    static {
        t2o.a(766509635);
    }

    public InfinityCycleAdapter(int i, int i2, List<String> list, ShopIndexNavCycleComponent.b bVar, ShopDataParser shopDataParser) {
        ckf.g(list, bmi.CALLBACK_DATA_LIST);
        ckf.g(bVar, "statusModel");
        ckf.g(shopDataParser, "shopData");
        this.f3119a = i2;
        this.b = list;
        this.c = bVar;
        this.d = shopDataParser;
        this.g = shopDataParser.j(shopDataParser.d0(), shopDataParser.f0());
        this.i = shopDataParser.h0();
    }

    public static final /* synthetic */ List M(InfinityCycleAdapter infinityCycleAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("db0ba1c1", new Object[]{infinityCycleAdapter});
        }
        return infinityCycleAdapter.b;
    }

    public static final /* synthetic */ ShopDataParser N(InfinityCycleAdapter infinityCycleAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("48339da4", new Object[]{infinityCycleAdapter});
        }
        return infinityCycleAdapter.d;
    }

    public static /* synthetic */ Object ipc$super(InfinityCycleAdapter infinityCycleAdapter, String str, Object... objArr) {
        if (str.hashCode() == 143764512) {
            super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/InfinityCycleAdapter");
    }

    public final int O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b2a74ee", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public final boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3f9085a", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final ork Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ork) ipChange.ipc$dispatch("d7fd200b", new Object[]{this});
        }
        return this.e;
    }

    public final a S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("683e8f44", new Object[]{this});
        }
        return this.f;
    }

    public final void T(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff68505", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = i;
        ViewHolder viewHolder = this.h.get(Integer.valueOf(i));
        if (viewHolder != null) {
            viewHolder.m0(i);
        }
    }

    /* renamed from: U */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fb4d91", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        ckf.g(viewHolder, "viewholder");
        viewHolder.h0(i);
        this.h.put(Integer.valueOf(i), viewHolder);
    }

    /* renamed from: V */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewHolder) ipChange.ipc$dispatch("24391b27", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        TextView textView = new TextView(viewGroup.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, this.f3119a));
        textView.setGravity(16);
        return new ViewHolder(this, textView, this.c);
    }

    /* renamed from: W */
    public void onViewRecycled(ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de117ca", new Object[]{this, viewHolder});
            return;
        }
        super.onViewRecycled(viewHolder);
        if (viewHolder != null) {
            this.h.remove(Integer.valueOf(viewHolder.e0()));
            viewHolder.i0();
        }
    }

    public final void X(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f0f5dc", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public final void Y(ork orkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ef2dd1", new Object[]{this, orkVar});
        } else {
            this.e = orkVar;
        }
    }

    public final void Z(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6e64fe", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.b.size();
    }
}
