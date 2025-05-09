package com.taobao.android.meta.structure.list;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.meta.structure.list.MetaListView;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.searchbaseframe.business.common.list.BaseListView;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.list.ScrollToHelper;
import com.taobao.android.searchbaseframe.xsl.section.refact.ClipDecoration;
import com.taobao.android.searchbaseframe.xsl.section.refact.ListBackgroundDecoration;
import com.taobao.android.searchbaseframe.xsl.section.refact.XSectionLayout;
import com.taobao.nestedscroll.recyclerview.layoutmanager.InternalStaggeredGridLayoutManager;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import tb.ay4;
import tb.bsi;
import tb.c4p;
import tb.ckf;
import tb.cuc;
import tb.d1a;
import tb.dji;
import tb.dod;
import tb.duk;
import tb.euc;
import tb.g1a;
import tb.igw;
import tb.njg;
import tb.pwo;
import tb.t2o;
import tb.t7p;
import tb.u7p;
import tb.xhv;
import tb.znx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MetaListView extends BaseListView<FrameLayout, cuc> implements euc, XSectionLayout.a, pwo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final bsi j;
    public FrameLayout k;
    public XSectionLayout l;
    public ListBackgroundDecoration m;
    public BaseListView.a n;
    public LinearLayout o;
    public LinearLayout p;
    public dji q;
    public boolean r;
    public int s = -1;
    public final njg t = kotlin.a.b(new d1a() { // from class: tb.nez
        @Override // tb.d1a
        public final Object invoke() {
            ScrollToHelper D0;
            D0 = MetaListView.D0(MetaListView.this);
            return D0;
        }
    });

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(993001531);
            int[] iArr = new int[WindowType.values().length];
            try {
                iArr[WindowType.MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WindowType.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WindowType.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PartnerRecyclerView f8937a;

        public b(PartnerRecyclerView partnerRecyclerView) {
            this.f8937a = partnerRecyclerView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            } else {
                this.f8937a.setTotalScrollOffset(-this.f8937a.getHeaderFrame().getTop());
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements duk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.duk
        public void a(dji.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33366006", new Object[]{this, cVar});
                return;
            }
            ckf.g(cVar, "config");
            RecyclerView.LayoutManager layoutManager = MetaListView.b0(MetaListView.this).getLayoutManager();
            ckf.e(layoutManager, "null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager");
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int spanCount = staggeredGridLayoutManager.getSpanCount();
            MetaListView metaListView = MetaListView.this;
            ListStyle c0 = MetaListView.c0(metaListView);
            ckf.f(c0, "access$getMStyle$p(...)");
            int n0 = metaListView.n0(c0);
            staggeredGridLayoutManager.setSpanCount(n0);
            MetaListView.h0(MetaListView.this, n0, spanCount);
        }

        @Override // tb.duk
        public void onScale(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2015500", new Object[]{this, scaleGestureDetector});
            } else {
                ckf.g(scaleGestureDetector, "detector");
            }
        }
    }

    static {
        t2o.a(993001530);
        t2o.a(993001525);
        t2o.a(993002113);
        t2o.a(993001961);
    }

    public MetaListView(bsi bsiVar) {
        ckf.g(bsiVar, "metaConfig");
        this.j = bsiVar;
    }

    public static final xhv A0(MetaListView metaListView, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("bf1fea5b", new Object[]{metaListView, num});
        }
        ckf.g(metaListView, "this$0");
        FrameLayout frameLayout = metaListView.k;
        if (frameLayout != null) {
            ckf.d(num);
            igw.b(frameLayout, num.intValue());
            return xhv.INSTANCE;
        }
        ckf.y("rootView");
        throw null;
    }

    public static final xhv B0(PartnerRecyclerView partnerRecyclerView, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("369e82e9", new Object[]{partnerRecyclerView, bool});
        }
        ckf.g(partnerRecyclerView, "$recyclerView");
        ckf.d(bool);
        partnerRecyclerView.setPreserveFocusAfterLayout(!bool.booleanValue());
        return xhv.INSTANCE;
    }

    public static final xhv E0(PartnerRecyclerView partnerRecyclerView, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7aa7758d", new Object[]{partnerRecyclerView, num});
        }
        ckf.d(partnerRecyclerView);
        ckf.d(num);
        partnerRecyclerView.setTriggerScrollDistance(num.intValue());
        return xhv.INSTANCE;
    }

    public static final /* synthetic */ void W(MetaListView metaListView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26532d96", new Object[]{metaListView});
        } else {
            metaListView.k0();
        }
    }

    public static final /* synthetic */ boolean X(MetaListView metaListView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b227fc8d", new Object[]{metaListView})).booleanValue();
        }
        return metaListView.r;
    }

    public static final /* synthetic */ PartnerRecyclerView b0(MetaListView metaListView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PartnerRecyclerView) ipChange.ipc$dispatch("dbd06766", new Object[]{metaListView});
        }
        return metaListView.e;
    }

    public static final /* synthetic */ ListStyle c0(MetaListView metaListView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("72407eab", new Object[]{metaListView});
        }
        return metaListView.g;
    }

    public static final xhv d0(PartnerRecyclerView partnerRecyclerView, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f57c30d6", new Object[]{partnerRecyclerView, num});
        }
        ckf.g(partnerRecyclerView, "$rv");
        FrameLayout headerFrame = partnerRecyclerView.getHeaderFrame();
        ckf.f(headerFrame, "getHeaderFrame(...)");
        ckf.d(num);
        znx.b(headerFrame, num.intValue());
        return xhv.INSTANCE;
    }

    public static final xhv e0(PartnerRecyclerView partnerRecyclerView, MetaListView metaListView, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("1c9e79dc", new Object[]{partnerRecyclerView, metaListView, num});
        }
        ckf.g(partnerRecyclerView, "$rv");
        ckf.g(metaListView, "this$0");
        FrameLayout headerFrame = partnerRecyclerView.getHeaderFrame();
        ckf.f(headerFrame, "getHeaderFrame(...)");
        ckf.d(num);
        int intValue = num.intValue();
        Integer f = metaListView.j.D().f();
        ckf.d(f);
        znx.a(headerFrame, intValue + f.intValue());
        return xhv.INSTANCE;
    }

    public static final xhv f0(FrameLayout frameLayout, MetaListView metaListView, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c20a097e", new Object[]{frameLayout, metaListView, num});
        }
        ckf.g(metaListView, "this$0");
        ckf.d(frameLayout);
        ckf.d(num);
        int intValue = num.intValue();
        Integer f = metaListView.j.C().f();
        ckf.d(f);
        znx.b(frameLayout, intValue + f.intValue());
        return xhv.INSTANCE;
    }

    public static final xhv g0(FrameLayout frameLayout, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("11bafe32", new Object[]{frameLayout, num});
        }
        ckf.d(frameLayout);
        ckf.d(num);
        znx.a(frameLayout, num.intValue());
        return xhv.INSTANCE;
    }

    public static final /* synthetic */ void h0(MetaListView metaListView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d71bba", new Object[]{metaListView, new Integer(i), new Integer(i2)});
        } else {
            metaListView.r0(i, i2);
        }
    }

    public static /* synthetic */ Object ipc$super(MetaListView metaListView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == -1346023839) {
            super.J((ListStyle) objArr[0]);
            return null;
        } else if (hashCode == 1978689528) {
            super.K((RecyclerView.Adapter) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/meta/structure/list/MetaListView");
        }
    }

    public static final xhv s0(MetaListView metaListView, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("98d6c77d", new Object[]{metaListView, num});
        }
        ckf.g(metaListView, "this$0");
        BaseListView.a o0 = metaListView.o0();
        if (o0 != null) {
            RecyclerView.ItemDecoration itemDecoration = metaListView.d;
            ckf.d(num);
            int intValue = num.intValue();
            Integer f = metaListView.j.A().f();
            ckf.d(f);
            o0.c(itemDecoration, intValue, f.intValue());
        }
        ListStyle listStyle = metaListView.g;
        ckf.f(listStyle, "mStyle");
        metaListView.V(listStyle);
        return xhv.INSTANCE;
    }

    public static final xhv t0(MetaListView metaListView, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("81de8c7e", new Object[]{metaListView, num});
        }
        ckf.g(metaListView, "this$0");
        BaseListView.a o0 = metaListView.o0();
        if (o0 != null) {
            RecyclerView.ItemDecoration itemDecoration = metaListView.d;
            Integer f = metaListView.j.z().f();
            ckf.d(f);
            int intValue = f.intValue();
            ckf.d(num);
            o0.c(itemDecoration, intValue, num.intValue());
        }
        ListStyle listStyle = metaListView.g;
        ckf.f(listStyle, "mStyle");
        metaListView.V(listStyle);
        return xhv.INSTANCE;
    }

    public static final xhv u0(MetaListView metaListView, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("6ae6517f", new Object[]{metaListView, num});
        }
        ckf.g(metaListView, "this$0");
        ckf.d(num);
        int intValue = num.intValue();
        if (intValue <= 0) {
            return xhv.INSTANCE;
        }
        if (metaListView.e.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            RecyclerView.LayoutManager layoutManager = metaListView.e.getLayoutManager();
            ckf.e(layoutManager, "null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager");
            ((StaggeredGridLayoutManager) layoutManager).setSpanCount(intValue);
        }
        return xhv.INSTANCE;
    }

    public static final xhv v0(PartnerRecyclerView partnerRecyclerView, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("3cdba6ee", new Object[]{partnerRecyclerView, num});
        }
        ckf.g(partnerRecyclerView, "$rv");
        ckf.d(num);
        partnerRecyclerView.setTopRadius(num.intValue());
        return xhv.INSTANCE;
    }

    public static final xhv w0(PartnerRecyclerView partnerRecyclerView, MetaListView metaListView, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("5190a2c4", new Object[]{partnerRecyclerView, metaListView, num});
        }
        ckf.g(partnerRecyclerView, "$rv");
        ckf.g(metaListView, "this$0");
        FrameLayout headerFrame = partnerRecyclerView.getHeaderFrame();
        ckf.f(headerFrame, "getHeaderFrame(...)");
        ckf.d(num);
        int intValue = num.intValue();
        Integer f = metaListView.j.x().f();
        ckf.d(f);
        znx.a(headerFrame, intValue + f.intValue());
        return xhv.INSTANCE;
    }

    public static final xhv x0(FrameLayout frameLayout, MetaListView metaListView, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("66995666", new Object[]{frameLayout, metaListView, num});
        }
        ckf.g(metaListView, "this$0");
        ckf.d(frameLayout);
        ckf.d(num);
        int intValue = num.intValue();
        Integer f = metaListView.j.w().f();
        ckf.d(f);
        znx.b(frameLayout, intValue + f.intValue());
        return xhv.INSTANCE;
    }

    public static final xhv y0(MetaListView metaListView, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c33cb14", new Object[]{metaListView, num});
        }
        ckf.g(metaListView, "this$0");
        XSectionLayout xSectionLayout = metaListView.l;
        if (xSectionLayout != null) {
            ckf.d(num);
            xSectionLayout.setSectionStart(num.intValue());
            return xhv.INSTANCE;
        }
        ckf.y("sectionLayout");
        throw null;
    }

    public static final xhv z0(MetaListView metaListView, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("1b9933eb", new Object[]{metaListView, bool});
        }
        ckf.g(metaListView, "this$0");
        XSectionLayout xSectionLayout = metaListView.l;
        if (xSectionLayout != null) {
            ckf.d(bool);
            xSectionLayout.setObserveStickySectionChange(bool.booleanValue());
            return xhv.INSTANCE;
        }
        ckf.y("sectionLayout");
        throw null;
    }

    @Override // tb.kib
    public ViewGroup B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d9090cb0", new Object[]{this});
        }
        LinearLayout linearLayout = this.p;
        if (linearLayout != null) {
            return linearLayout;
        }
        ckf.y("headerContainer");
        throw null;
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView, tb.kib
    public void K(RecyclerView.Adapter<?> adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f067f8", new Object[]{this, adapter});
            return;
        }
        super.K(adapter);
        if (this.j.c0()) {
            XSectionLayout xSectionLayout = this.l;
            if (xSectionLayout != null) {
                RecyclerView recyclerView = getRecyclerView();
                ckf.e(adapter, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.xsl.section.ISectionAdapter");
                dod dodVar = (dod) adapter;
                xSectionLayout.attach(recyclerView, dodVar);
                ListBackgroundDecoration listBackgroundDecoration = this.m;
                if (listBackgroundDecoration != null) {
                    listBackgroundDecoration.a(getRecyclerView(), dodVar);
                } else {
                    ckf.y("bgDecoration");
                    throw null;
                }
            } else {
                ckf.y("sectionLayout");
                throw null;
            }
        }
    }

    @Override // tb.euc
    public void M(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51049376", new Object[]{this, new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.o;
        if (linearLayout != null) {
            if (!z) {
                i = 8;
            }
            linearLayout.setVisibility(i);
            return;
        }
        ckf.y("footerContainer");
        throw null;
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView
    public RecyclerView.ItemDecoration Q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemDecoration) ipChange.ipc$dispatch("fe774692", new Object[]{this, new Integer(i)});
        }
        BaseListView.a o0 = o0();
        if (o0 != null) {
            return o0.b(i, ((cuc) P()).X());
        }
        return null;
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView
    public int R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8878654", new Object[]{this})).intValue();
        }
        return this.j.m0();
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView
    public StaggeredGridLayoutManager S(final PartnerRecyclerView partnerRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StaggeredGridLayoutManager) ipChange.ipc$dispatch("3a87848b", new Object[]{this, partnerRecyclerView});
        }
        ckf.g(partnerRecyclerView, OrderConfigs.RECYCLERVIEW);
        final int c2 = ((cuc) P()).c2();
        InternalStaggeredGridLayoutManager metaListView$onCreateLayoutManager$layoutManager$1 = new InternalStaggeredGridLayoutManager(c2) { // from class: com.taobao.android.meta.structure.list.MetaListView$onCreateLayoutManager$layoutManager$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public Parcelable b;

            public static /* synthetic */ Object ipc$super(MetaListView$onCreateLayoutManager$layoutManager$1 metaListView$onCreateLayoutManager$layoutManager$12, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -579854207) {
                    super.onLayoutCompleted((RecyclerView.State) objArr[0]);
                    return null;
                } else if (hashCode == 1050392251) {
                    super.onDetachedFromWindow((RecyclerView) objArr[0], (RecyclerView.Recycler) objArr[1]);
                    return null;
                } else if (hashCode == 1242672066) {
                    super.onAttachedToWindow((RecyclerView) objArr[0]);
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/meta/structure/list/MetaListView$onCreateLayoutManager$layoutManager$1");
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onAttachedToWindow(RecyclerView recyclerView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4a11abc2", new Object[]{this, recyclerView});
                    return;
                }
                Parcelable parcelable = this.b;
                if (parcelable != null) {
                    onRestoreInstanceState(parcelable);
                    this.b = null;
                }
                super.onAttachedToWindow(recyclerView);
            }

            @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e9bb6bb", new Object[]{this, recyclerView, recycler});
                    return;
                }
                if (getSpanCount() > 1) {
                    this.b = onSaveInstanceState();
                }
                super.onDetachedFromWindow(recyclerView, recycler);
            }

            @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onLayoutCompleted(RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd702081", new Object[]{this, state});
                    return;
                }
                ckf.g(state, "state");
                super.onLayoutCompleted(state);
                PartnerRecyclerView.this.notifyLayoutComplete();
            }
        };
        metaListView$onCreateLayoutManager$layoutManager$1.y(partnerRecyclerView);
        return metaListView$onCreateLayoutManager$layoutManager$1;
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView
    public void U(final PartnerRecyclerView partnerRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51abb0a", new Object[]{this, partnerRecyclerView});
        } else {
            this.j.i0().d(new g1a() { // from class: tb.xez
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv E0;
                    E0 = MetaListView.E0(PartnerRecyclerView.this, (Integer) obj);
                    return E0;
                }
            });
        }
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView
    public void V(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c6cfb6", new Object[]{this, listStyle});
            return;
        }
        ckf.g(listStyle, "style");
        BaseListView.a o0 = o0();
        if (o0 != null) {
            o0.a(listStyle, this.f, ((cuc) P()).X(), this.e, this.d);
        }
    }

    @Override // tb.euc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3189632", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.o;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        } else {
            ckf.y("footerContainer");
            throw null;
        }
    }

    @Override // tb.rz, tb.p9e
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        dji djiVar = this.q;
        if (djiVar != null) {
            djiVar.j();
        }
    }

    @Override // tb.euc
    public void e(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b4f45e", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        getRecyclerView().stopScroll();
        m0().F(0, z, i, i2);
    }

    @Override // tb.euc
    public void f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7eed3cf", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        LinearLayout linearLayout = this.o;
        if (linearLayout != null) {
            linearLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        } else {
            ckf.y("footerContainer");
            throw null;
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.refact.XSectionLayout.a
    public void g(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("549af5fa", new Object[]{this, view, new Boolean(z)});
        }
    }

    public final void i0(final PartnerRecyclerView partnerRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d38c0e8", new Object[]{this, partnerRecyclerView});
            return;
        }
        this.j.G().d(new g1a() { // from class: tb.bfz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv v0;
                v0 = MetaListView.v0(PartnerRecyclerView.this, (Integer) obj);
                return v0;
            }
        });
        this.j.D().d(new g1a() { // from class: tb.cfz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv w0;
                w0 = MetaListView.w0(PartnerRecyclerView.this, this, (Integer) obj);
                return w0;
            }
        });
        RecyclerView recyclerView = getRecyclerView();
        ckf.e(recyclerView, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        final FrameLayout footerFrame = ((PartnerRecyclerView) recyclerView).getFooterFrame();
        this.j.C().d(new g1a() { // from class: tb.dfz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv x0;
                x0 = MetaListView.x0(footerFrame, this, (Integer) obj);
                return x0;
            }
        });
        this.j.y().d(new g1a() { // from class: tb.oez
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv d0;
                d0 = MetaListView.d0(PartnerRecyclerView.this, (Integer) obj);
                return d0;
            }
        });
        this.j.x().d(new g1a() { // from class: tb.pez
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv e0;
                e0 = MetaListView.e0(PartnerRecyclerView.this, this, (Integer) obj);
                return e0;
            }
        });
        this.j.w().d(new g1a() { // from class: tb.qez
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv f0;
                f0 = MetaListView.f0(footerFrame, this, (Integer) obj);
                return f0;
            }
        });
        this.j.v().d(new g1a() { // from class: tb.rez
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv g0;
                g0 = MetaListView.g0(footerFrame, (Integer) obj);
                return g0;
            }
        });
        this.j.z().d(new g1a() { // from class: tb.sez
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv s0;
                s0 = MetaListView.s0(MetaListView.this, (Integer) obj);
                return s0;
            }
        });
        this.j.A().d(new g1a() { // from class: tb.tez
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv t0;
                t0 = MetaListView.t0(MetaListView.this, (Integer) obj);
                return t0;
            }
        });
        this.j.i().d(new g1a() { // from class: tb.uez
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv u0;
                u0 = MetaListView.u0(MetaListView.this, (Integer) obj);
                return u0;
            }
        });
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6356f3b1", new Object[]{this});
        } else if (this.j.c0()) {
            FrameLayout frameLayout = this.k;
            if (frameLayout != null) {
                XSectionLayout xSectionLayout = this.l;
                if (xSectionLayout != null) {
                    frameLayout.addView(xSectionLayout, new FrameLayout.LayoutParams(-1, -1));
                    this.j.d0().d(new g1a() { // from class: tb.zez
                        @Override // tb.g1a
                        public final Object invoke(Object obj) {
                            xhv y0;
                            y0 = MetaListView.y0(MetaListView.this, (Integer) obj);
                            return y0;
                        }
                    });
                    this.j.O().d(new g1a() { // from class: tb.afz
                        @Override // tb.g1a
                        public final Object invoke(Object obj) {
                            xhv z0;
                            z0 = MetaListView.z0(MetaListView.this, (Boolean) obj);
                            return z0;
                        }
                    });
                    XSectionLayout xSectionLayout2 = this.l;
                    if (xSectionLayout2 != null) {
                        xSectionLayout2.setSectionChangeListener((u7p) P());
                    } else {
                        ckf.y("sectionLayout");
                        throw null;
                    }
                } else {
                    ckf.y("sectionLayout");
                    throw null;
                }
            } else {
                ckf.y("rootView");
                throw null;
            }
        }
    }

    public final void k0() {
        try {
            if (ClipDecoration.h == null) {
                Method declaredMethod = StaggeredGridLayoutManager.class.getDeclaredMethod("checkForGaps", new Class[0]);
                ClipDecoration.h = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = ClipDecoration.h.invoke(getRecyclerView().getLayoutManager(), new Object[0]);
            ckf.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) invoke).booleanValue();
            if (this.r && booleanValue) {
                this.r = false;
            }
        } catch (Exception unused) {
        }
    }

    public final ScrollToHelper m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollToHelper) ipChange.ipc$dispatch("424be9d7", new Object[]{this});
        }
        return (ScrollToHelper) this.t.getValue();
    }

    @Override // tb.euc
    public void n(int i, int i2, boolean z, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96419287", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3)});
            return;
        }
        getRecyclerView().stopScroll();
        RecyclerView recyclerView = getRecyclerView();
        ckf.e(recyclerView, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        m0().F(i + ((PartnerRecyclerView) recyclerView).getHeaderViewsCount(), z, i2, i3);
    }

    public int n0(ListStyle listStyle) {
        Activity activity;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f2380ca", new Object[]{this, listStyle})).intValue();
        }
        ckf.g(listStyle, "listStyle");
        if (listStyle == ListStyle.LIST) {
            return 1;
        }
        Context context = getView().getContext();
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity == null) {
            return 2;
        }
        this.j.i();
        boolean k = this.j.k();
        dji.c p = dji.c.p(activity);
        if (this.s == 3 && k) {
            return p.o();
        }
        WindowType M = TBAutoSizeConfig.x().M(activity);
        if (M == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[M.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return 2;
                }
                if (k) {
                    return p.q();
                }
            } else if (k) {
                return p.s();
            }
            return 4;
        } else if (k) {
            return p.r();
        } else {
            return 5;
        }
    }

    public final BaseListView.a o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseListView.a) ipChange.ipc$dispatch("efed3791", new Object[]{this});
        }
        if (this.n == null) {
            ay4<Void, BaseListView.a> g0 = this.j.g0();
            BaseListView.a aVar = null;
            if (g0 != null) {
                aVar = g0.a(null);
            }
            this.n = aVar;
        }
        return this.n;
    }

    @Override // tb.euc
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd61f52", new Object[]{this});
            return;
        }
        PartnerRecyclerView partnerRecyclerView = this.e;
        if (partnerRecyclerView != null) {
            partnerRecyclerView.invalidateItemDecorations();
        }
        if (this.j.s()) {
            RecyclerView.LayoutManager layoutManager = this.e.getLayoutManager();
            ckf.e(layoutManager, "null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager");
            ((StaggeredGridLayoutManager) layoutManager).invalidateSpanAssignments();
        }
    }

    /* renamed from: p0 */
    public FrameLayout getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d5c6a177", new Object[]{this});
        }
        FrameLayout frameLayout = this.k;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootView");
        throw null;
    }

    public final void q0(Context context, PartnerRecyclerView partnerRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631ff89c", new Object[]{this, context, partnerRecyclerView});
        } else if (this.j.k()) {
            dji djiVar = new dji(context);
            djiVar.o(new c());
            this.q = djiVar;
            partnerRecyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: tb.yez
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean C0;
                    C0 = MetaListView.C0(MetaListView.this, view, motionEvent);
                    return C0;
                }
            });
        }
    }

    public final void r0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccd4d81", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.g != ListStyle.LIST) {
            if (i > i2) {
                Toast.makeText(this.c, Localization.q(R.string.sf_show_more_content), 0).show();
            } else if (i < i2) {
                Toast.makeText(this.c, Localization.q(R.string.sf_show_less_content), 0).show();
            } else if (i <= 3) {
                Toast.makeText(this.c, Localization.q(R.string.sf_cannot_scale_up), 0).show();
            } else {
                Toast.makeText(this.c, Localization.q(R.string.sf_cannot_scale_down), 0).show();
            }
        }
    }

    @Override // tb.euc
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b832b080", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.p;
        if (linearLayout != null) {
            linearLayout.setMinimumHeight(0);
            LinearLayout linearLayout2 = this.p;
            if (linearLayout2 != null) {
                linearLayout2.removeAllViews();
            } else {
                ckf.y("headerContainer");
                throw null;
            }
        } else {
            ckf.y("headerContainer");
            throw null;
        }
    }

    public static final boolean C0(MetaListView metaListView, View view, MotionEvent motionEvent) {
        WindowType M;
        dji djiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcd88e09", new Object[]{metaListView, view, motionEvent})).booleanValue();
        }
        ckf.g(metaListView, "this$0");
        if (!(metaListView.g == ListStyle.LIST || (M = TBAutoSizeConfig.x().M(metaListView.c)) == WindowType.MIN || M == WindowType.SMALL || (djiVar = metaListView.q) == null)) {
            djiVar.l(motionEvent);
        }
        return false;
    }

    public static final ScrollToHelper D0(MetaListView metaListView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollToHelper) ipChange.ipc$dispatch("9a222b3f", new Object[]{metaListView});
        }
        ckf.g(metaListView, "this$0");
        return new ScrollToHelper(metaListView.getRecyclerView(), true, ((cuc) metaListView.P()).getAdapter());
    }

    @Override // tb.euc
    public void v(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d645b1f", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        LinearLayout linearLayout = this.p;
        if (linearLayout != null) {
            linearLayout.addView(view);
            LinearLayout linearLayout2 = this.p;
            if (linearLayout2 != null) {
                linearLayout2.setMinimumHeight(1);
            } else {
                ckf.y("headerContainer");
                throw null;
            }
        } else {
            ckf.y("headerContainer");
            throw null;
        }
    }

    @Override // tb.pwo
    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f1aecd", new Object[]{this, new Integer(i)});
            return;
        }
        this.s = i;
        PartnerRecyclerView partnerRecyclerView = this.e;
        if (partnerRecyclerView != null) {
            RecyclerView.LayoutManager layoutManager = partnerRecyclerView.getLayoutManager();
            ckf.e(layoutManager, "null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager");
            ListStyle listStyle = this.g;
            ckf.f(listStyle, "mStyle");
            int n0 = n0(listStyle);
            ((StaggeredGridLayoutManager) layoutManager).setSpanCount(n0);
            c4p.D("ms.containerWidth", "update span count to " + n0, new Object[0]);
        }
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView, tb.kib
    public void J(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc54e61", new Object[]{this, listStyle});
            return;
        }
        ckf.g(listStyle, "style");
        super.J(listStyle);
        RecyclerView.LayoutManager layoutManager = this.e.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return;
        }
        if (listStyle == ListStyle.LIST) {
            ((StaggeredGridLayoutManager) layoutManager).setSpanCount(n0(listStyle));
            this.r = false;
            return;
        }
        Integer f = this.j.i().f();
        ckf.d(f);
        int intValue = f.intValue();
        if (intValue > 0) {
            ((StaggeredGridLayoutManager) layoutManager).setSpanCount(intValue);
        } else {
            ((StaggeredGridLayoutManager) layoutManager).setSpanCount(n0(listStyle));
        }
        this.r = true;
    }

    /* renamed from: l0 */
    public FrameLayout t(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("59aa5e3a", new Object[]{this, context, viewGroup});
        }
        ckf.g(context, "context");
        this.k = new FrameLayout(context);
        this.j.u().d(new g1a() { // from class: tb.vez
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv A0;
                A0 = MetaListView.A0(MetaListView.this, (Integer) obj);
                return A0;
            }
        });
        Object a2 = this.j.X().a(context);
        ckf.f(a2, "create(...)");
        final PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) a2;
        if (this.j.Z()) {
            partnerRecyclerView.restrainFirstScrollChange();
            this.j.T0(false);
        }
        partnerRecyclerView.disableScrollFeature();
        ScreenType g = ScreenType.g(context);
        if (g != null) {
            g.i(this);
            this.s = g.c();
            q0(context, partnerRecyclerView);
        }
        FrameLayout frameLayout = this.k;
        if (frameLayout != null) {
            frameLayout.addView(partnerRecyclerView, new FrameLayout.LayoutParams(-1, -1));
            XSectionLayout xSectionLayout = new XSectionLayout(context, this.j.h());
            this.l = xSectionLayout;
            xSectionLayout.setOverlayHeight(this.j.b0());
            XSectionLayout xSectionLayout2 = this.l;
            if (xSectionLayout2 != null) {
                xSectionLayout2.setBackgroundSetter(this);
                XSectionLayout xSectionLayout3 = this.l;
                if (xSectionLayout3 != null) {
                    xSectionLayout3.setItemBackgroundProvider((t7p.a) P());
                    j0();
                    T(partnerRecyclerView, context, viewGroup);
                    i0(partnerRecyclerView);
                    ListBackgroundDecoration listBackgroundDecoration = new ListBackgroundDecoration();
                    this.m = listBackgroundDecoration;
                    listBackgroundDecoration.c((t7p.a) P());
                    LinearLayout linearLayout = new LinearLayout(context);
                    this.o = linearLayout;
                    linearLayout.setOrientation(1);
                    LinearLayout linearLayout2 = this.o;
                    if (linearLayout2 != null) {
                        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        LinearLayout linearLayout3 = this.o;
                        if (linearLayout3 != null) {
                            partnerRecyclerView.addFooterView(linearLayout3);
                            partnerRecyclerView.setFixTrigger(this.j.l());
                            partnerRecyclerView.getHeaderFrame().addOnAttachStateChangeListener(new b(partnerRecyclerView));
                            this.j.f0().d(new g1a() { // from class: tb.wez
                                @Override // tb.g1a
                                public final Object invoke(Object obj) {
                                    xhv B0;
                                    B0 = MetaListView.B0(PartnerRecyclerView.this, (Boolean) obj);
                                    return B0;
                                }
                            });
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            this.p = linearLayout4;
                            linearLayout4.setOrientation(1);
                            LinearLayout linearLayout5 = this.p;
                            if (linearLayout5 != null) {
                                partnerRecyclerView.addHeaderView(linearLayout5);
                                if (this.j.d()) {
                                    partnerRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.meta.structure.list.MetaListView$createView$4
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        public static /* synthetic */ Object ipc$super(MetaListView$createView$4 metaListView$createView$4, String str, Object... objArr) {
                                            str.hashCode();
                                            int hashCode = str.hashCode();
                                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/list/MetaListView$createView$4");
                                        }

                                        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                                        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                                            IpChange ipChange2 = $ipChange;
                                            if (ipChange2 instanceof IpChange) {
                                                ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                                            } else if (MetaListView.X(MetaListView.this)) {
                                                MetaListView.W(MetaListView.this);
                                            }
                                        }
                                    });
                                }
                                if (this.j.a()) {
                                    partnerRecyclerView.setDescendantFocusability(393216);
                                }
                                FrameLayout frameLayout2 = this.k;
                                if (frameLayout2 != null) {
                                    return frameLayout2;
                                }
                                ckf.y("rootView");
                                throw null;
                            }
                            ckf.y("headerContainer");
                            throw null;
                        }
                        ckf.y("footerContainer");
                        throw null;
                    }
                    ckf.y("footerContainer");
                    throw null;
                }
                ckf.y("sectionLayout");
                throw null;
            }
            ckf.y("sectionLayout");
            throw null;
        }
        ckf.y("rootView");
        throw null;
    }
}
