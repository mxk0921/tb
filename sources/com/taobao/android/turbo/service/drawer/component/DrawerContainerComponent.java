package com.taobao.android.turbo.service.drawer.component;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.service.drawer.adapter.DrawerContainerAdapter;
import com.taobao.android.turbo.service.drawer.view.DrawerContainerView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import tb.a07;
import tb.b7d;
import tb.ckf;
import tb.cy7;
import tb.d7d;
import tb.f2e;
import tb.fy7;
import tb.iy7;
import tb.jpu;
import tb.qpu;
import tb.qy7;
import tb.rzh;
import tb.t2o;
import tb.tpu;
import tb.xv1;
import tb.xyh;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/turbo/service/drawer/component/DrawerContainerComponent;", "Ltb/xv1;", "Lcom/taobao/android/turbo/model/PageModel;", "Landroid/widget/FrameLayout;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DrawerContainerComponent extends xv1<PageModel, FrameLayout> implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public DrawerContainerView c;
    public DrawerContainerAdapter d;
    public xyh e;
    public cy7 f;
    public qy7 g;
    public rzh h;
    public int i;
    public boolean j;
    public DrawerModel.DrawerGravity k;
    public final iy7 l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455530);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements d7d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.d7d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("abdb378c", new Object[]{this});
            } else {
                DrawerContainerComponent.l(DrawerContainerComponent.this);
            }
        }
    }

    static {
        t2o.a(916455529);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerContainerComponent(qpu qpuVar, iy7 iy7Var) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(iy7Var, "drawerContainerRegistry");
        this.l = iy7Var;
    }

    public static /* synthetic */ Object ipc$super(DrawerContainerComponent drawerContainerComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1502133455:
                super.onStart((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -560092455:
                super.onDestroy((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -258772824:
                super.onResume((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -128189347:
                super.onCreate(objArr[0], (IComponentLifecycle$TriggerType) objArr[1]);
                return null;
            case 316403507:
                super.onStop((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case 1484435997:
                super.onPause((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/drawer/component/DrawerContainerComponent");
        }
    }

    public static final /* synthetic */ void l(DrawerContainerComponent drawerContainerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23dc674", new Object[]{drawerContainerComponent});
        } else {
            drawerContainerComponent.q();
        }
    }

    public final void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f594a6bb", new Object[]{this, new Boolean(z)});
            return;
        }
        DrawerContainerView drawerContainerView = this.c;
        if (drawerContainerView != null) {
            drawerContainerView.setEnableScroll(z);
        }
        xyh xyhVar = this.e;
        if (xyhVar != null) {
            xyhVar.o(z);
        } else {
            ckf.y("mainContainerComponent");
            throw null;
        }
    }

    public final void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e06c236", new Object[]{this, str});
            return;
        }
        f2e f2eVar = (f2e) k().getService(f2e.class);
        if (str != null) {
            f2eVar.q1(str.concat(".0.0"));
        }
    }

    public final void handleOuterMessage(BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be86f4e7", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "message");
        if (bVar.f() == BaseOuterComponent.OuterComponentType.DRAWER) {
            String e = bVar.e();
            DrawerContainerAdapter drawerContainerAdapter = this.d;
            DrawerModel.DrawerGravity k = drawerContainerAdapter != null ? drawerContainerAdapter.k(e) : null;
            if (k != null) {
                cy7 cy7Var = this.f;
                if (cy7Var != null) {
                    cy7Var.f(k, bVar);
                } else {
                    ckf.y("drawerComponentManager");
                    throw null;
                }
            } else {
                tpu.a.b(tpu.Companion, "DrawerContainerComponent", "发送外部消息，drawerGravity为空", null, 4, null);
            }
        } else {
            xyh xyhVar = this.e;
            if (xyhVar != null) {
                xyhVar.handleOuterMessage(bVar);
            } else {
                ckf.y("mainContainerComponent");
                throw null;
            }
        }
    }

    public final boolean m() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("374b4114", new Object[]{this})).booleanValue();
        }
        DrawerContainerAdapter drawerContainerAdapter = this.d;
        if (drawerContainerAdapter != null) {
            i = drawerContainerAdapter.n();
        } else {
            i = -1;
        }
        return z(i);
    }

    public final DrawerModel.DrawerGravity n() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel.DrawerGravity) ipChange.ipc$dispatch("5b35cf3d", new Object[]{this});
        }
        DrawerContainerView drawerContainerView = this.c;
        if (drawerContainerView != null) {
            i = drawerContainerView.getCurrentItem();
        } else {
            i = -1;
        }
        DrawerContainerAdapter drawerContainerAdapter = this.d;
        if (drawerContainerAdapter != null) {
            return drawerContainerAdapter.j(i);
        }
        return null;
    }

    public final DrawerModel o(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel) ipChange.ipc$dispatch("ab7c2d57", new Object[]{this, drawerGravity});
        }
        ckf.g(drawerGravity, "drawerGravity");
        DrawerContainerAdapter drawerContainerAdapter = this.d;
        if (drawerContainerAdapter != null) {
            return drawerContainerAdapter.h(drawerGravity);
        }
        return null;
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onDestroy(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9daad9", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onDestroy(iComponentLifecycle$TriggerType);
        rzh rzhVar = this.h;
        if (rzhVar != null) {
            rzhVar.p(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("mainDrawerLifecycleHandler");
            throw null;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerComponent", "页面滚动状态变化的时机，state=" + i, null, 4, null);
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onPause(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ab21d", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onPause(iComponentLifecycle$TriggerType);
        rzh rzhVar = this.h;
        if (rzhVar != null) {
            rzhVar.q(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("mainDrawerLifecycleHandler");
            throw null;
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onResume(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09370a8", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onResume(iComponentLifecycle$TriggerType);
        rzh rzhVar = this.h;
        if (rzhVar != null) {
            rzhVar.r(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("mainDrawerLifecycleHandler");
            throw null;
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStart(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6774331", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onStart(iComponentLifecycle$TriggerType);
        rzh rzhVar = this.h;
        if (rzhVar != null) {
            rzhVar.s(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("mainDrawerLifecycleHandler");
            throw null;
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStop(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dbef33", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onStop(iComponentLifecycle$TriggerType);
        rzh rzhVar = this.h;
        if (rzhVar != null) {
            rzhVar.t(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("mainDrawerLifecycleHandler");
            throw null;
        }
    }

    public final DrawerModel.DrawerGravity p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel.DrawerGravity) ipChange.ipc$dispatch("1e2cde54", new Object[]{this, str});
        }
        ckf.g(str, "drawerId");
        DrawerContainerAdapter drawerContainerAdapter = this.d;
        if (drawerContainerAdapter != null) {
            return drawerContainerAdapter.k(str);
        }
        return null;
    }

    public final boolean s() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4840fd3", new Object[]{this})).booleanValue();
        }
        DrawerContainerView drawerContainerView = this.c;
        if (drawerContainerView != null) {
            i = drawerContainerView.getCurrentItem();
        } else {
            i = -1;
        }
        DrawerContainerAdapter drawerContainerAdapter = this.d;
        if (drawerContainerAdapter == null || i != drawerContainerAdapter.n()) {
            return false;
        }
        return true;
    }

    public final boolean t(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd574ab", new Object[]{this, drawerGravity})).booleanValue();
        }
        ckf.g(drawerGravity, "gravity");
        DrawerContainerView drawerContainerView = this.c;
        if (!(drawerContainerView == null || this.d == null)) {
            ckf.d(drawerContainerView);
            int currentItem = drawerContainerView.getCurrentItem();
            if (drawerGravity == DrawerModel.DrawerGravity.LEFT) {
                DrawerContainerAdapter drawerContainerAdapter = this.d;
                ckf.d(drawerContainerAdapter);
                if (drawerContainerAdapter.m() == currentItem) {
                    return true;
                }
                return false;
            } else if (drawerGravity == DrawerModel.DrawerGravity.RIGHT) {
                DrawerContainerAdapter drawerContainerAdapter2 = this.d;
                ckf.d(drawerContainerAdapter2);
                if (drawerContainerAdapter2.p() == currentItem) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: u */
    public void onCreate(PageModel pageModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b551a", new Object[]{this, pageModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onCreate(pageModel, iComponentLifecycle$TriggerType);
        this.e = new xyh(k());
        this.f = new cy7();
        qpu k = k();
        xyh xyhVar = this.e;
        if (xyhVar != null) {
            cy7 cy7Var = this.f;
            if (cy7Var != null) {
                rzh rzhVar = new rzh(k, xyhVar, cy7Var, this.l);
                this.h = rzhVar;
                rzhVar.o(pageModel, iComponentLifecycle$TriggerType);
                qpu k2 = k();
                cy7 cy7Var2 = this.f;
                if (cy7Var2 != null) {
                    rzh rzhVar2 = this.h;
                    if (rzhVar2 != null) {
                        this.g = new qy7(k2, cy7Var2, rzhVar2);
                        ((b7d) k().getService(b7d.class)).g1(new b());
                        return;
                    }
                    ckf.y("mainDrawerLifecycleHandler");
                    throw null;
                }
                ckf.y("drawerComponentManager");
                throw null;
            }
            ckf.y("drawerComponentManager");
            throw null;
        }
        ckf.y("mainContainerComponent");
        throw null;
    }

    public final void v(int i, boolean z, DrawerModel.DrawerGravity drawerGravity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91dd6ae", new Object[]{this, new Integer(i), new Boolean(z), drawerGravity, str});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerComponent", "主容器或抽屉选中的时机，lastPosition=" + this.i + "，isLastMain=" + this.j + "，lastDrawerGravity=" + this.k + "，position=" + i + "，isMain=" + z + "，drawerGravity=" + drawerGravity, null, 4, null);
        DrawerContainerView drawerContainerView = this.c;
        DrawerContainerAdapter drawerContainerAdapter = this.d;
        if (!(drawerContainerView == null || drawerContainerAdapter == null)) {
            drawerContainerAdapter.instantiateItem((ViewGroup) drawerContainerView, i);
        }
        boolean z2 = this.j;
        DrawerModel.DrawerGravity drawerGravity2 = this.k;
        rzh rzhVar = this.h;
        if (rzhVar != null) {
            rzhVar.m(z2, drawerGravity2, z, drawerGravity, getState());
            if (!(z2 == z && this.k == drawerGravity)) {
                if (!z2 && drawerGravity2 != null) {
                    this.l.a(drawerGravity2);
                }
                if (!z && drawerGravity != null) {
                    this.l.f(drawerGravity);
                }
            }
            this.i = i;
            this.j = z;
            this.k = drawerGravity;
            D(str);
            return;
        }
        ckf.y("mainDrawerLifecycleHandler");
        throw null;
    }

    public final boolean w(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("634db84e", new Object[]{this, drawerGravity})).booleanValue();
        }
        ckf.g(drawerGravity, "drawerGravity");
        int i = fy7.$EnumSwitchMapping$0[drawerGravity.ordinal()];
        int i2 = -1;
        if (i == 1) {
            DrawerContainerAdapter drawerContainerAdapter = this.d;
            if (drawerContainerAdapter != null) {
                i2 = drawerContainerAdapter.m();
            }
        } else if (i == 2) {
            DrawerContainerAdapter drawerContainerAdapter2 = this.d;
            if (drawerContainerAdapter2 != null) {
                i2 = drawerContainerAdapter2.p();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return z(i2);
    }

    public final void x(DrawerModel.DrawerGravity drawerGravity, float f) {
        DrawerModel drawerModel;
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76e4bd1c", new Object[]{this, drawerGravity, new Float(f)});
            return;
        }
        DrawerContainerAdapter drawerContainerAdapter = this.d;
        if (drawerContainerAdapter != null) {
            drawerModel = drawerContainerAdapter.h(drawerGravity);
        } else {
            drawerModel = null;
        }
        DrawerContainerAdapter drawerContainerAdapter2 = this.d;
        if (drawerContainerAdapter2 != null) {
            frameLayout = drawerContainerAdapter2.l(drawerGravity);
        } else {
            frameLayout = null;
        }
        if (drawerModel != null && frameLayout != null) {
            qy7 qy7Var = this.g;
            if (qy7Var != null) {
                qy7Var.a(drawerGravity, f, drawerModel, frameLayout);
            } else {
                ckf.y("drawerRenderHelper");
                throw null;
            }
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd7f4cd", new Object[]{this});
            return;
        }
        xyh xyhVar = this.e;
        if (xyhVar != null) {
            xyhVar.n();
        } else {
            ckf.y("mainContainerComponent");
            throw null;
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        Pair pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        aVar.c("DrawerContainerComponent", "页面滚动的时机，position=" + i + "，positionOffset=" + f + "，positionOffsetPixels=" + i2);
        DrawerContainerAdapter drawerContainerAdapter = this.d;
        int i3 = -1;
        int m = drawerContainerAdapter != null ? drawerContainerAdapter.m() : -1;
        DrawerContainerAdapter drawerContainerAdapter2 = this.d;
        if (drawerContainerAdapter2 != null) {
            i3 = drawerContainerAdapter2.p();
        }
        if (i == m) {
            pair = jpu.a(DrawerModel.DrawerGravity.LEFT, Float.valueOf(1 - f));
        } else if (i == i3 - 1) {
            pair = jpu.a(DrawerModel.DrawerGravity.RIGHT, Float.valueOf(f));
        } else if (i == i3) {
            pair = jpu.a(DrawerModel.DrawerGravity.RIGHT, Float.valueOf(1.0f));
        } else {
            pair = jpu.a(DrawerModel.DrawerGravity.LEFT, Float.valueOf(0.0f));
        }
        float floatValue = ((Number) pair.component2()).floatValue();
        x((DrawerModel.DrawerGravity) pair.component1(), floatValue);
        xyh xyhVar = this.e;
        if (xyhVar != null) {
            xyhVar.p(floatValue * 0.7f);
        } else {
            ckf.y("mainContainerComponent");
            throw null;
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2100244", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "DrawerContainerComponent", "在页面尺寸变化时处理", null, 4, null);
        DrawerContainerView drawerContainerView = this.c;
        DrawerContainerAdapter drawerContainerAdapter = this.d;
        PageModel data = getData();
        if (drawerContainerView != null && drawerContainerAdapter != null && data != null) {
            int currentItem = drawerContainerView.getCurrentItem();
            drawerContainerAdapter.u(new PageModel());
            rzh rzhVar = this.h;
            if (rzhVar != null) {
                rzhVar.g(IComponentLifecycle$TriggerType.UNSPECIFIED);
                drawerContainerAdapter.u(data);
                drawerContainerView.setCurrentItem(currentItem, false);
                return;
            }
            ckf.y("mainDrawerLifecycleHandler");
            throw null;
        }
    }

    public final void r(DrawerContainerView drawerContainerView, PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf1ecf", new Object[]{this, drawerContainerView, pageModel});
            return;
        }
        this.c = drawerContainerView;
        drawerContainerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        qpu k = k();
        xyh xyhVar = this.e;
        if (xyhVar != null) {
            qy7 qy7Var = this.g;
            if (qy7Var != null) {
                cy7 cy7Var = this.f;
                if (cy7Var != null) {
                    DrawerContainerAdapter drawerContainerAdapter = new DrawerContainerAdapter(pageModel, k, xyhVar, qy7Var, cy7Var);
                    drawerContainerView.setAdapter(drawerContainerAdapter);
                    this.d = drawerContainerAdapter;
                    drawerContainerView.addOnPageChangeListener(this);
                    int n = drawerContainerAdapter.n();
                    z(n);
                    if (n == 0) {
                        v(n, true, null, null);
                    }
                    rzh rzhVar = this.h;
                    if (rzhVar != null) {
                        rzhVar.w(drawerContainerView);
                        rzh rzhVar2 = this.h;
                        if (rzhVar2 != null) {
                            rzhVar2.v(drawerContainerAdapter);
                        } else {
                            ckf.y("mainDrawerLifecycleHandler");
                            throw null;
                        }
                    } else {
                        ckf.y("mainDrawerLifecycleHandler");
                        throw null;
                    }
                } else {
                    ckf.y("drawerComponentManager");
                    throw null;
                }
            } else {
                ckf.y("drawerRenderHelper");
                throw null;
            }
        } else {
            ckf.y("mainContainerComponent");
            throw null;
        }
    }

    /* renamed from: C */
    public void updateDataImpl(PageModel pageModel) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d033d9", new Object[]{this, pageModel});
            return;
        }
        ckf.g(pageModel, "data");
        DrawerContainerView drawerContainerView = this.c;
        if (drawerContainerView == null) {
            DrawerContainerView drawerContainerView2 = new DrawerContainerView(getContext());
            r(drawerContainerView2, pageModel);
            FrameLayout frameLayout = (FrameLayout) getView();
            if (frameLayout != null) {
                frameLayout.addView(drawerContainerView2);
            }
            xyh xyhVar = this.e;
            if (xyhVar != null) {
                xyhVar.updateData(pageModel);
            } else {
                ckf.y("mainContainerComponent");
                throw null;
            }
        } else {
            DrawerContainerAdapter drawerContainerAdapter = this.d;
            if (drawerContainerAdapter != null) {
                drawerContainerAdapter.u(pageModel);
            }
            int currentItem = drawerContainerView.getCurrentItem();
            DrawerContainerAdapter drawerContainerAdapter2 = this.d;
            if (drawerContainerAdapter2 == null || drawerContainerAdapter2.n() != currentItem) {
                z = false;
            }
            DrawerContainerAdapter drawerContainerAdapter3 = this.d;
            DrawerModel.DrawerGravity j = drawerContainerAdapter3 != null ? drawerContainerAdapter3.j(currentItem) : null;
            if (this.i == currentItem && !(this.j == z && this.k == j)) {
                DrawerModel o = j != null ? o(j) : null;
                v(currentItem, z, j, o != null ? o.getSpm() : null);
            }
            rzh rzhVar = this.h;
            if (rzhVar != null) {
                rzhVar.n(IComponentLifecycle$TriggerType.UNSPECIFIED);
            } else {
                ckf.y("mainDrawerLifecycleHandler");
                throw null;
            }
        }
    }

    public final boolean handleBack(IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fa1481c", new Object[]{this, triggerType})).booleanValue();
        }
        ckf.g(triggerType, "triggerType");
        DrawerContainerView drawerContainerView = this.c;
        int currentItem = drawerContainerView != null ? drawerContainerView.getCurrentItem() : -1;
        DrawerContainerAdapter drawerContainerAdapter = this.d;
        if (drawerContainerAdapter == null || currentItem != drawerContainerAdapter.n()) {
            DrawerContainerAdapter drawerContainerAdapter2 = this.d;
            DrawerModel.DrawerGravity j = drawerContainerAdapter2 != null ? drawerContainerAdapter2.j(currentItem) : null;
            if (j != null) {
                cy7 cy7Var = this.f;
                if (cy7Var == null) {
                    ckf.y("drawerComponentManager");
                    throw null;
                } else if (cy7Var.d(j, triggerType)) {
                    return true;
                } else {
                    m();
                    return true;
                }
            } else {
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, "DrawerContainerComponent", "处理返回，未知的位置，currentItem=" + currentItem, null, 4, null);
                return false;
            }
        } else {
            xyh xyhVar = this.e;
            if (xyhVar != null) {
                return xyhVar.handleBack(triggerType);
            }
            ckf.y("mainContainerComponent");
            throw null;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        DrawerContainerAdapter drawerContainerAdapter = this.d;
        if (drawerContainerAdapter == null || drawerContainerAdapter.n() != i) {
            z = false;
        }
        DrawerContainerAdapter drawerContainerAdapter2 = this.d;
        String str = null;
        DrawerModel.DrawerGravity j = drawerContainerAdapter2 != null ? drawerContainerAdapter2.j(i) : null;
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerComponent", "页面选中的时机，position=" + i + "，isMain=" + z + "，drawerGravity=" + j, null, 4, null);
        DrawerModel o = j != null ? o(j) : null;
        if (o != null) {
            str = o.getSpm();
        }
        v(i, z, j, str);
    }

    public final boolean z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3eae4fa", new Object[]{this, new Integer(i)})).booleanValue();
        }
        DrawerContainerView drawerContainerView = this.c;
        if (drawerContainerView != null && i >= 0) {
            PagerAdapter adapter = drawerContainerView.getAdapter();
            if (i < (adapter != null ? adapter.getCount() : 0)) {
                if (drawerContainerView.getCurrentItem() == i) {
                    tpu.a.b(tpu.Companion, "DrawerContainerComponent", "选择主容器或抽屉，指定主容器或抽屉已选中", null, 4, null);
                    return false;
                }
                drawerContainerView.setCurrentItem(i);
                return true;
            }
        }
        tpu.a.b(tpu.Companion, "DrawerContainerComponent", "选择主容器或抽屉，drawerContainerView为空或位置无效", null, 4, null);
        return false;
    }
}
