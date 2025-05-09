package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.d6b;
import tb.dtc;
import tb.e6b;
import tb.ev0;
import tb.fzo;
import tb.i2q;
import tb.j2q;
import tb.kd7;
import tb.ld7;
import tb.lvp;
import tb.m2m;
import tb.md7;
import tb.mr7;
import tb.n2m;
import tb.nj7;
import tb.ntc;
import tb.q84;
import tb.qc7;
import tb.rc7;
import tb.s8d;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.vu3;
import tb.z3a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PicContainerViewHolder extends kd7<n2m> implements View.OnClickListener, View.OnLongClickListener, ntc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DETAIL_IMG_BIZ_CODE = 1530;
    public static final String DETAIL_IMG_BIZ_CODE_STR = "1530";
    public static final String DETAIL_IMG_BIZ_NAME = "detail_desc";
    public int h;
    public int i;
    public final ObserverFrameLayout j;
    public ArrayList<i2q> k;
    public final ImageView l;
    public String m;
    public boolean n = false;
    public int o;
    public ArrayList<ev0> p;
    public static final Set<Integer> q = new HashSet();
    public static final boolean B = vbl.f1();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ObserverFrameLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc3c9bc8", new Object[]{this, new Integer(i)});
            } else if (nj7.h()) {
                PicContainerViewHolder.w(PicContainerViewHolder.this, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(PicContainerViewHolder picContainerViewHolder) {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f6897a;
        public final /* synthetic */ n2m b;

        public c(TUrlImageView tUrlImageView, n2m n2mVar) {
            this.f6897a = tUrlImageView;
            this.b = n2mVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            TUrlImageView tUrlImageView = this.f6897a;
            if (tUrlImageView == null) {
                return false;
            }
            if (tUrlImageView.getDrawable() != null) {
                PicContainerViewHolder.x(PicContainerViewHolder.this, this.f6897a.getDrawable().getIntrinsicWidth(), this.f6897a.getDrawable().getIntrinsicHeight(), this.b);
            }
            PicContainerViewHolder.y().add(Integer.valueOf(this.b.m.hashCode()));
            return false;
        }
    }

    static {
        t2o.a(912262383);
        t2o.a(912261362);
    }

    public PicContainerViewHolder(Context context) {
        super(context);
        this.h = mr7.f(context);
        ObserverFrameLayout observerFrameLayout = new ObserverFrameLayout(this.f22590a);
        this.j = observerFrameLayout;
        if (nj7.h()) {
            observerFrameLayout.setOnSizeChangedListener(new a());
        }
        TUrlImageView tUrlImageView = new TUrlImageView(this.f22590a);
        tUrlImageView.setErrorImageResId(R.drawable.tt_detail_img_load_fail);
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ImageStrategyConfig.b v = ImageStrategyConfig.v(DETAIL_IMG_BIZ_NAME, DETAIL_IMG_BIZ_CODE);
        if (B) {
            v.o(true);
        }
        tUrlImageView.setStrategyConfig(v.a());
        this.l = tUrlImageView;
        observerFrameLayout.addView(tUrlImageView);
        F();
    }

    public static /* synthetic */ Object ipc$super(PicContainerViewHolder picContainerViewHolder, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.p();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/PicContainerViewHolder");
    }

    public static /* synthetic */ int w(PicContainerViewHolder picContainerViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c24a7d7", new Object[]{picContainerViewHolder, new Integer(i)})).intValue();
        }
        picContainerViewHolder.h = i;
        return i;
    }

    public static /* synthetic */ void x(PicContainerViewHolder picContainerViewHolder, double d, double d2, n2m n2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81e24c8", new Object[]{picContainerViewHolder, new Double(d), new Double(d2), n2mVar});
        } else {
            picContainerViewHolder.E(d, d2, n2mVar);
        }
    }

    public static /* synthetic */ Set y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("e222f228", new Object[0]);
        }
        return q;
    }

    public void A(ArrayList<md7> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b48dbdb", new Object[]{this, arrayList});
        } else if (arrayList != null && !arrayList.isEmpty()) {
            try {
                Iterator<md7> it = arrayList.iterator();
                while (it.hasNext()) {
                    md7 next = it.next();
                    if (next.h()) {
                        kd7<? extends md7> a2 = ld7.a(this.f22590a, next);
                        if (a2 instanceof i2q) {
                            if (this.k == null) {
                                this.k = new ArrayList<>();
                            }
                            i2q i2qVar = (i2q) a2;
                            this.k.add(i2qVar);
                            View o = i2qVar.o((j2q) next);
                            i2qVar.g((j2q) next);
                            if (o != null) {
                                int B2 = (int) (this.h * i2qVar.B());
                                int C = (int) (this.i * i2qVar.C());
                                o.measure(-2, -2);
                                int measuredWidth = o.getMeasuredWidth() + B2;
                                int i = this.h;
                                if (measuredWidth > i) {
                                    B2 = i - o.getMeasuredWidth();
                                }
                                int measuredHeight = o.getMeasuredHeight() + C;
                                int i2 = this.i;
                                if (measuredHeight > i2) {
                                    C = i2 - o.getMeasuredHeight();
                                }
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o.getLayoutParams();
                                if (layoutParams == null) {
                                    layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                }
                                layoutParams.leftMargin = B2;
                                layoutParams.topMargin = C;
                                o.setLayoutParams(layoutParams);
                                this.j.addView(o);
                            }
                        } else if (a2 instanceof d6b) {
                            d6b d6bVar = (d6b) a2;
                            d6bVar.o((e6b) next);
                            d6bVar.g((e6b) next);
                            d6bVar.w(this.j, this.h, this.i);
                        }
                    }
                }
            } catch (Exception e) {
                tgh.c("PicContainerViewHolder", "drawChildrenView", e);
            }
        }
    }

    /* renamed from: B */
    public void h(n2m n2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee7439e", new Object[]{this, n2mVar});
        } else if (!TextUtils.isEmpty(n2mVar.m)) {
            J(n2mVar);
            this.l.setOnClickListener(this);
            this.l.setOnLongClickListener(this);
            A(n2mVar.b());
            if (vbl.x()) {
                z(n2mVar);
            }
        }
    }

    /* renamed from: C */
    public View j(n2m n2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("80af86ae", new Object[]{this, n2mVar});
        }
        return this.j;
    }

    /* renamed from: D */
    public boolean m(n2m n2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dbccd22", new Object[]{this, n2mVar})).booleanValue();
        }
        return TextUtils.isEmpty(n2mVar.m);
    }

    public final void E(double d, double d2, n2m n2mVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c9e561", new Object[]{this, new Double(d), new Double(d2), n2mVar});
            return;
        }
        ImageView imageView = this.l;
        if (imageView != null && d2 > vu3.b.GEO_NOT_SUPPORT && d > vu3.b.GEO_NOT_SUPPORT) {
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.i));
            double d3 = d2 / d;
            double d4 = this.i / this.h;
            if (Math.abs(d3 - d4) >= 0.001d) {
                Context context = this.f22590a;
                if (TextUtils.isEmpty(this.m)) {
                    str = "";
                } else {
                    str = this.m;
                }
                q84.f(context, new m2m(str, d3, d, d2, d4, this.h, this.i));
                this.i = (int) Math.round(this.h * d3);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, this.i);
                } else {
                    layoutParams.height = this.i;
                }
                this.l.setLayoutParams(layoutParams);
                G();
            }
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c42e6b", new Object[]{this});
        } else {
            q84.i(this.f22590a, fzo.class, this);
        }
    }

    public final void G() {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1add17c0", new Object[]{this});
            return;
        }
        ObserverFrameLayout observerFrameLayout = this.j;
        if (observerFrameLayout != null && observerFrameLayout.getChildCount() > 1 && (layoutParams = this.j.getLayoutParams()) != null) {
            int i = layoutParams.height;
            int i2 = this.i;
            if (i != i2) {
                layoutParams.height = i2;
                this.j.setLayoutParams(layoutParams);
            }
        }
    }

    public void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c9f618", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cea4712", new Object[]{this});
        } else {
            q84.l(this.f22590a, fzo.class);
        }
    }

    public void J(n2m n2mVar) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d54e590", new Object[]{this, n2mVar});
            return;
        }
        this.m = n2mVar.m;
        this.i = (int) Math.round(((this.h * 1.0d) * n2mVar.l) / n2mVar.k);
        this.l.setLayoutParams(new FrameLayout.LayoutParams(-1, this.i));
        this.l.setScaleType(ImageView.ScaleType.FIT_XY);
        TUrlImageView tUrlImageView = (TUrlImageView) this.l;
        if (vbl.J()) {
            if (TextUtils.isEmpty(this.m) || !this.m.toLowerCase().endsWith(".gif")) {
                z = false;
            } else {
                z = true;
            }
            tUrlImageView.setSkipAutoSize(z);
        }
        if (!((HashSet) q).contains(Integer.valueOf(n2mVar.m.hashCode()))) {
            if (this.o <= 0) {
                z2 = true;
            }
            tUrlImageView.setFadeIn(z2);
            tUrlImageView.setImageUrl(n2mVar.m, new PhenixOptions().preloadWithSmall(true).scaleFromLarge(true));
        } else {
            tUrlImageView.setFadeIn(false);
            if (vbl.g0()) {
                tUrlImageView.asyncSetImageUrl(n2mVar.m);
            } else {
                tUrlImageView.setImageUrl(n2mVar.m);
            }
        }
        tUrlImageView.failListener(new b(this));
        tUrlImageView.succListener(new c(tUrlImageView, n2mVar));
        this.l.setTag(n2mVar.m);
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getTag() instanceof String) {
            String str = (String) view.getTag();
            T t = this.g;
            if (((n2m) t).j != null && !((ArrayList) ((n2m) t).j).isEmpty()) {
                qc7.a(this.f22590a, ((n2m) this.g).j);
            }
            z3a z3aVar = new z3a();
            z3aVar.f32510a = true;
            z3aVar.b = 0;
            z3aVar.e = view;
            z3aVar.d.add(str);
            q84.f(this.f22590a, new lvp(z3aVar));
        }
    }

    @Override // tb.kd7
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        I();
        ((HashSet) q).clear();
        super.p();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        if (this.n) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("share_businessId", (Object) "picture-desc");
        jSONObject.put("share_imageUrl", (Object) this.m);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("detailShareParams", (Object) jSONObject);
        q84.f(this.f22590a, new rc7("share", jSONObject2, new RuntimeAbilityParam[0]));
        return false;
    }

    public final void z(n2m n2mVar) {
        ArrayList<n2m.a> arrayList;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd02748", new Object[]{this, n2mVar});
            return;
        }
        ArrayList<ev0> arrayList2 = this.p;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator<ev0> it = this.p.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
            this.p.clear();
        }
        if (n2mVar != null && (arrayList = n2mVar.n) != null && !arrayList.isEmpty()) {
            if (TextUtils.isEmpty(n2mVar.m)) {
                str = "";
            } else {
                str = n2mVar.m;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page", (Object) "Page_Detail");
            jSONObject.put("eventId", (Object) "2201");
            jSONObject.put("arg1", (Object) "Page_Detail_Show-MatchTag_ItemCount");
            jSONObject.put("args", (Object) new JSONObject(str) { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.PicContainerViewHolder.4
                public final /* synthetic */ String val$imgUrl;

                {
                    this.val$imgUrl = str;
                    put("imgUrl", (Object) str);
                }
            });
            q84.f(this.f22590a, new rc7("userTrack", jSONObject, new RuntimeAbilityParam[0]));
            Iterator<n2m.a> it2 = n2mVar.n.iterator();
            while (it2.hasNext()) {
                n2m.a next = it2.next();
                ev0 ev0Var = new ev0(this.f22590a, str);
                ev0Var.e();
                ev0Var.c(next);
                ev0Var.d(next, this.j, this.h, this.i);
                if (this.p == null) {
                    this.p = new ArrayList<>();
                }
                this.p.add(ev0Var);
            }
        }
    }

    @Override // tb.ntc
    public boolean y1(dtc dtcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7cc73d0", new Object[]{this, dtcVar})).booleanValue();
        }
        if (!(dtcVar instanceof fzo)) {
            return false;
        }
        this.n = fzo.SCROLLING.equals(((fzo) dtcVar).a());
        return true;
    }
}
