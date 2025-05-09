package com.taobao.android.detail2.core.mainpic.viewholder;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.widget.MaskImageView;
import com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager;
import com.taobao.android.detail2.core.mainpic.MainPicContainer;
import com.taobao.android.detail2.core.mainpic.a;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import tb.bxj;
import tb.dh7;
import tb.gbx;
import tb.hsm;
import tb.nd2;
import tb.nyj;
import tb.o2r;
import tb.ome;
import tb.q0i;
import tb.q0j;
import tb.qqd;
import tb.qrc;
import tb.s0m;
import tb.s2m;
import tb.s8d;
import tb.t2o;
import tb.txj;
import tb.u0i;
import tb.ue7;
import tb.yf2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainPicImageViewHolder extends MainPicAbsViewHolder<ome> implements qqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String l = "img";
    public static final com.taobao.android.detail2.core.mainpic.viewholder.a m = new e();
    public final ImageView f;
    public final ImageView g;
    public final MaskImageView h;
    public String i;
    public qrc j;
    public final dh7.l k = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements dh7.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.dh7.l
        public void a(int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a5b043d", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            } else if (MainPicImageViewHolder.this.d == 0) {
                txj.e("new_detail异常", "屏幕有变化，但是数据未准备好。不进行下沉主图重新绑定。");
            } else {
                txj.e(txj.TAG_TIP, "屏幕有变化，下沉主图重新绑定中...");
                a.b bVar = MainPicImageViewHolder.this.f7219a;
                if (!(bVar == null || bVar.getNewDetailContext() == null)) {
                    nyj.z().N(MainPicImageViewHolder.this.f7219a.getNewDetailContext().j().G(), "onSizeChange", Boolean.valueOf(z));
                }
                MainPicImageViewHolder mainPicImageViewHolder = MainPicImageViewHolder.this;
                MainPicImageViewHolder.y0(mainPicImageViewHolder, (ome) mainPicImageViewHolder.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends gbx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(View view, Context context, MainPicAbsViewHolder.a aVar) {
            super(view, context, aVar);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/viewholder/MainPicImageViewHolder$2");
        }

        @Override // tb.gbx
        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88ab898b", new Object[]{this});
            }
            return "frame";
        }

        @Override // tb.gbx
        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
            }
            T t = MainPicImageViewHolder.this.d;
            if (t != 0) {
                return ((ome) t).c;
            }
            return -1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends gbx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(View view, Context context, MainPicAbsViewHolder.a aVar) {
            super(view, context, aVar);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/viewholder/MainPicImageViewHolder$3");
        }

        @Override // tb.gbx
        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88ab898b", new Object[]{this});
            }
            return "gaussian";
        }

        @Override // tb.gbx
        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
            }
            T t = MainPicImageViewHolder.this.d;
            if (t != 0) {
                return ((ome) t).c;
            }
            return -1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends gbx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(View view, Context context, MainPicAbsViewHolder.a aVar) {
            super(view, context, aVar);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/viewholder/MainPicImageViewHolder$4");
        }

        @Override // tb.gbx
        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88ab898b", new Object[]{this});
            }
            return "image";
        }

        @Override // tb.gbx
        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
            }
            T t = MainPicImageViewHolder.this.d;
            if (t != 0) {
                return ((ome) t).c;
            }
            return -1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e implements com.taobao.android.detail2.core.mainpic.viewholder.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail2.core.mainpic.viewholder.a
        public MainPicAbsViewHolder a(ViewGroup viewGroup, MainPicContainer mainPicContainer, a.b bVar, MainPicAbsViewHolder.a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MainPicAbsViewHolder) ipChange.ipc$dispatch("eff71e60", new Object[]{this, viewGroup, mainPicContainer, bVar, aVar, new Integer(i)});
            }
            MainPicImageViewHolder mainPicImageViewHolder = new MainPicImageViewHolder((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mainpic_image_layout, viewGroup, false), mainPicContainer, bVar, aVar);
            mainPicContainer.o().w(mainPicImageViewHolder);
            return mainPicImageViewHolder;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f7223a;

        static {
            t2o.a(352322180);
            t2o.a(620757101);
        }

        public g(boolean z) {
            this.f7223a = z;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (failPhenixEvent == null) {
                return false;
            }
            txj.e(txj.TAG_MAIN_PIC, "图片加载失败，是否是gaussian: " + this.f7223a + ", failCode" + failPhenixEvent.getResultCode() + ", url: " + failPhenixEvent.getUrl());
            return false;
        }
    }

    static {
        t2o.a(352322172);
        t2o.a(352322158);
    }

    public MainPicImageViewHolder(ViewGroup viewGroup, MainPicContainer mainPicContainer, a.b bVar, MainPicAbsViewHolder.a aVar) {
        super(viewGroup, mainPicContainer, bVar, aVar);
        viewGroup.setOnTouchListener(new b(viewGroup, viewGroup.getContext(), this.b));
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.image_gaussian);
        this.g = imageView;
        this.h = (MaskImageView) viewGroup.findViewById(R.id.image_gaussian_mask);
        imageView.setHapticFeedbackEnabled(false);
        c cVar = new c(imageView, viewGroup.getContext(), this.b);
        if (this.c.n().f) {
            imageView.setOnTouchListener(cVar);
        }
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.image);
        this.f = imageView2;
        imageView2.setHapticFeedbackEnabled(false);
        imageView2.setOnTouchListener(new d(imageView2, viewGroup.getContext(), this.b));
        B0();
    }

    public static /* synthetic */ Object ipc$super(MainPicImageViewHolder mainPicImageViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/viewholder/MainPicImageViewHolder");
    }

    public static /* synthetic */ void y0(MainPicImageViewHolder mainPicImageViewHolder, ome omeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2169e88c", new Object[]{mainPicImageViewHolder, omeVar});
        } else {
            mainPicImageViewHolder.z0(omeVar);
        }
    }

    /* renamed from: A0 */
    public void j0(ome omeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3797a3bb", new Object[]{this, omeVar});
        } else {
            z0(omeVar);
        }
    }

    public final void B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761a1b6f", new Object[]{this});
            return;
        }
        a.b bVar = this.f7219a;
        if (bVar != null) {
            bVar.e().t(this.k);
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void i0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0cbe96", new Object[]{this, str});
            return;
        }
        this.f7219a.e().N0(null);
        u0(this.j);
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb331c7", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void l0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20012b03", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void m0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bab56e6", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void n0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c806ec99", new Object[]{this, jSONObject});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7d6fb7", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3255bb04", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bf9c08", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void r0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10632c34", new Object[]{this, str});
        }
    }

    @Override // tb.qqd
    public void x(s2m s2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb8f097", new Object[]{this, s2mVar});
        } else {
            s2mVar.s(false, this.j, this.f, null);
        }
    }

    public final void z0(ome omeVar) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733313d0", new Object[]{this, omeVar});
            return;
        }
        o2r.a("mainPicImageOnBindData");
        if (this.d == 0) {
            o2r.b();
            return;
        }
        this.g.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        qrc b2 = q0i.b(this.f7219a.getNewDetailContext(), this.f7219a.d(), ((ome) this.d).f29057a, this.f7219a.a(), this.f7219a.g().t());
        layoutParams.topMargin = b2.f;
        layoutParams.leftMargin = b2.g;
        layoutParams.width = b2.b;
        layoutParams.height = b2.f26895a;
        this.f.setScaleType(b2.h);
        this.f.setLayoutParams(layoutParams);
        this.j = b2;
        String str = null;
        this.c.o().s(true, this.j, this.f, null);
        String str2 = "";
        if (!TextUtils.equals(omeVar.e, this.i)) {
            o2r.a("mainPicImageFirstBind");
            o2r.b();
            if (TextUtils.isEmpty(str2)) {
                Context context = this.g.getContext();
                String str3 = omeVar.e;
                if (this.f7219a.d() == null || !this.f7219a.d().Q0()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                str2 = hsm.d(context, str3, z2);
            }
            if (this.f7219a.getNewDetailContext().p() == null) {
                str = nyj.z().e(this.f7219a.getNewDetailContext().j().G(), "loadMainPic");
            }
            PhenixCreator addLoaderExtra = s0m.B().T(str2).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE);
            if (this.f7219a.d() == null || !this.f7219a.d().Q0()) {
                z = false;
            } else {
                z = true;
            }
            addLoaderExtra.heightScale(z).succListener(new f(this.f7219a, this.f, this.g, this.h, false, this.d, str, this.c)).failListener(new g(false)).fetch();
        }
        if (this.c.n().f && !TextUtils.equals(omeVar.e, this.i)) {
            String j = hsm.j(this.g.getContext(), omeVar.e);
            txj.e(txj.TAG_RENDER, this + "MainPicImageViewHolder.bindGaussian, index: " + ((ome) this.d).c + ", url: " + str2);
            s0m.B().T(j).bitmapProcessors(true, new yf2(this.g.getContext(), this.f7219a.getNewDetailContext().m().x(), 2)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new f(this.f7219a, this.f, this.g, this.h, true, this.d, nyj.z().e(this.f7219a.getNewDetailContext().j().G(), "nd2MainGaussianLoad"), this.c)).failListener(new g(true)).fetch();
        }
        this.i = omeVar.e;
        o2r.b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ImageView f7222a;
        public final ImageView b;
        public final MaskImageView c;
        public final boolean d;
        public final a.b e;
        public final u0i f;
        public final String g;
        public final MainPicContainer h;

        static {
            t2o.a(352322178);
            t2o.a(620757101);
        }

        public f(a.b bVar, ImageView imageView, ImageView imageView2, MaskImageView maskImageView, boolean z, u0i u0iVar, String str, MainPicContainer mainPicContainer) {
            this.f7222a = imageView;
            this.d = z;
            this.e = bVar;
            this.f = u0iVar;
            this.b = imageView2;
            this.c = maskImageView;
            this.h = mainPicContainer;
            this.g = str;
        }

        public static /* synthetic */ void a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("139e4f59", new Object[]{fVar});
            } else {
                fVar.d();
            }
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d6fb69f", new Object[]{this});
            } else if (this.e.getNewDetailContext().j().N().v0()) {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    Thread thread = new Thread(new com.taobao.android.detail2.core.mainpic.viewholder.c(this));
                    thread.setName("NDTraceNetImage");
                    thread.start();
                    return;
                }
                d();
            }
        }

        public final void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eca6a0df", new Object[]{this});
                return;
            }
            try {
                int globalNetworkQuality = NetworkQualityMonitor.getGlobalNetworkQuality();
                double globalPredictBandWidth = NetworkQualityMonitor.getInstance().getGlobalPredictBandWidth();
                q0j.a(this.e.getNewDetailContext().h(), "onFirstPicNetQuality", Integer.valueOf(globalNetworkQuality));
                q0j.a(this.e.getNewDetailContext().h(), "onFirstPicNetSpeed", Double.valueOf(globalPredictBandWidth));
            } catch (Exception e) {
                txj.f("new_detail异常", "traceNet异常", e);
            }
        }

        /* renamed from: b */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            String G = this.e.getNewDetailContext().j().G();
            if (succPhenixEvent == null) {
                if (this.d) {
                    nyj.z().u(G, this.g, "nd2MainGaussianLoad", false);
                } else {
                    nyj.z().u(G, this.g, "loadMainPic", false);
                }
                return false;
            }
            if (this.d) {
                if (!"true".equals(this.f7222a.getTag(1284968164))) {
                    this.b.setAlpha(0.0f);
                }
                this.b.setImageDrawable(succPhenixEvent.getDrawable());
                this.c.bindMask(this.h.n());
                txj.e(txj.TAG_RENDER, this.f.c + "gaussianView设置" + this.b);
                this.e.c();
                nyj.z().u(G, this.g, "nd2MainGaussianLoad", true);
            } else {
                this.f7222a.setImageDrawable(succPhenixEvent.getDrawable());
                this.f7222a.setTag(1284968164, "true");
                this.b.setAlpha(1.0f);
                this.e.c();
                txj.e(txj.TAG_RENDER, this.f.c + "mainPicImageViewHolder 图片设置,parent: " + this.e.d().f31127a);
            }
            e(succPhenixEvent);
            return false;
        }

        public final void e(SuccPhenixEvent succPhenixEvent) {
            u0i u0iVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69e534dd", new Object[]{this, succPhenixEvent});
                return;
            }
            ue7 d = this.e.d();
            if (d != null && (u0iVar = this.f) != null) {
                if (!this.d && d.f31127a == 0 && u0iVar.c == 0 && !d.A && !u0iVar.d && this.e.getNewDetailContext().j().A0()) {
                    o2r.a("mainPicImageFirstSuccess");
                    o2r.b();
                    if (!d.v) {
                        bxj h = this.e.getNewDetailContext().h();
                        q0j.x(h, q0j.SECTION_FIRST_NATIVE_PIC_VISIBLE, "nid=" + d.h);
                        c();
                        if (d.C() != null) {
                            String G = d.C().G();
                            nyj.z().u(G, this.g, "loadMainPic", true);
                            this.e.getNewDetailContext().b();
                            nyj.z().F(G, nyj.TYPE_NATIVE_MAIN_PIC);
                        }
                    }
                    if (d.u0) {
                        d.u0 = false;
                        bxj h2 = this.e.getNewDetailContext().h();
                        q0j.x(h2, q0j.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE, "nid=" + d.h);
                    }
                    if (this.e.getNewDetailContext() != null && this.e.getNewDetailContext().l() != null && this.e.getNewDetailContext().l().f() && d.f31127a == 0 && this.e.getNewDetailContext().l().c() && !NavBarViewManager.H(this.e.getNewDetailContext().j().o())) {
                        this.e.getNewDetailContext().l().j();
                    }
                    this.e.j();
                }
                if (d.f31127a == 1) {
                    u0i u0iVar2 = this.f;
                    if (u0iVar2.c == 0 && !d.A && !u0iVar2.d && !this.d && this.e.getNewDetailContext().j().B0() && this.e.g().s()) {
                        o2r.a("mainPicImageSecondSuccess");
                        o2r.b();
                        bxj h3 = this.e.getNewDetailContext().h();
                        q0j.x(h3, q0j.SECTION_SECOND_NATIVE_PIC_VISIBLE, "nid=" + d.h);
                    }
                }
                txj.e(txj.TAG_MAIN_PIC, succPhenixEvent.getUrl() + "是否命中缓存:" + succPhenixEvent.isImmediate() + ", gaussian: " + this.d);
            }
        }
    }
}
