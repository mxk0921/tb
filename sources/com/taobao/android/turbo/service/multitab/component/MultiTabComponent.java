package com.taobao.android.turbo.service.multitab.component;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.lifecycle.EngineState;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.service.multitab.adapter.MultiTabAdapter;
import com.taobao.android.turbo.service.multitab.handler.TabLifecycleHandler;
import com.taobao.android.turbo.view.ScrollControlViewPager;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.bbj;
import tb.ckf;
import tb.f2e;
import tb.k1e;
import tb.kqs;
import tb.krs;
import tb.lqs;
import tb.ors;
import tb.q2c;
import tb.qpu;
import tb.t2o;
import tb.tpu;
import tb.vaj;
import tb.xv1;
import tb.yfc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/turbo/service/multitab/component/MultiTabComponent;", "Ltb/xv1;", "Lcom/taobao/android/turbo/model/PageModel;", "Landroid/widget/FrameLayout;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class MultiTabComponent extends xv1<PageModel, FrameLayout> implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "MultiTabComponent";
    public ScrollControlViewPager c;
    public MultiTabAdapter d;
    public int e;
    public kqs f;
    public TabLifecycleHandler g;
    public krs h;
    public ors i;
    public lqs j;
    public int k = -1;
    public String l;
    public final bbj m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455554);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455553);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTabComponent(qpu qpuVar, bbj bbjVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(bbjVar, "multiTabRegistry");
        this.m = bbjVar;
    }

    public static /* synthetic */ Object ipc$super(MultiTabComponent multiTabComponent, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/multitab/component/MultiTabComponent");
        }
    }

    public final void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f594a6bb", new Object[]{this, new Boolean(z)});
            return;
        }
        ScrollControlViewPager scrollControlViewPager = this.c;
        if (scrollControlViewPager != null) {
            scrollControlViewPager.setEnableScroll(z);
        }
    }

    /* renamed from: D */
    public void updateDataImpl(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d033d9", new Object[]{this, pageModel});
            return;
        }
        ckf.g(pageModel, "data");
        List<TabModel> tabs = pageModel.getTabs();
        if (tabs != null) {
            boolean isCache = pageModel.isCache();
            ScrollControlViewPager scrollControlViewPager = this.c;
            if (scrollControlViewPager == null) {
                C(tabs, isCache);
            } else {
                E(scrollControlViewPager, tabs, isCache);
            }
            lqs lqsVar = this.j;
            if (lqsVar != null) {
                lqsVar.c();
                ((k1e) k().getService(k1e.class)).r0(scrollControlViewPager != null ? scrollControlViewPager.getCurrentItem() : -1);
                return;
            }
            ckf.y("tabDarkStateUpdateNotifier");
            throw null;
        }
    }

    public final void E(ScrollControlViewPager scrollControlViewPager, List<TabModel> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bbfd351", new Object[]{this, scrollControlViewPager, list, new Boolean(z)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "非首次更新数据，tabs=" + list + "，isCache=" + z, null, 4, null);
        MultiTabAdapter multiTabAdapter = this.d;
        if (multiTabAdapter != null) {
            multiTabAdapter.o(list);
        }
        int currentItem = scrollControlViewPager.getCurrentItem();
        MultiTabAdapter multiTabAdapter2 = this.d;
        TabModel i = multiTabAdapter2 != null ? multiTabAdapter2.i(currentItem) : null;
        String id = i != null ? i.getId() : null;
        if (this.k == currentItem && !ckf.b(this.l, id)) {
            w(currentItem, id, i != null ? i.getSpm() : null);
        }
        TabLifecycleHandler tabLifecycleHandler = this.g;
        if (tabLifecycleHandler != null) {
            tabLifecycleHandler.c(IComponentLifecycle$TriggerType.UNSPECIFIED);
            ors orsVar = this.i;
            if (orsVar != null) {
                orsVar.a(list, z);
            } else {
                ckf.y("tabSelectHelper");
                throw null;
            }
        } else {
            ckf.y("tabLifecycleHandler");
            throw null;
        }
    }

    public final void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22632a06", new Object[]{this, str});
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
        String e = bVar.e();
        kqs kqsVar = this.f;
        if (kqsVar != null) {
            kqsVar.g(e, bVar);
        } else {
            ckf.y("tabComponentManager");
            throw null;
        }
    }

    public final void handleShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de66eb9e", new Object[]{this});
            return;
        }
        String n = n();
        if (n == null) {
            tpu.a.b(tpu.Companion, TAG, "处理分享，tabId为空", null, 4, null);
            return;
        }
        kqs kqsVar = this.f;
        if (kqsVar != null) {
            kqsVar.h(n);
        } else {
            ckf.y("tabComponentManager");
            throw null;
        }
    }

    public final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        ScrollControlViewPager scrollControlViewPager = this.c;
        if (scrollControlViewPager != null) {
            return scrollControlViewPager.getCurrentItem();
        }
        return -1;
    }

    public final BaseSubPageComponent<?, ?> m() {
        MultiTabAdapter multiTabAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSubPageComponent) ipChange.ipc$dispatch("fbc95a7", new Object[]{this});
        }
        if (!(this.c == null || (multiTabAdapter = this.d) == null)) {
            ckf.d(multiTabAdapter);
            ScrollControlViewPager scrollControlViewPager = this.c;
            ckf.d(scrollControlViewPager);
            TabModel i = multiTabAdapter.i(scrollControlViewPager.getCurrentItem());
            if (i != null) {
                kqs kqsVar = this.f;
                if (kqsVar != null) {
                    return kqsVar.b(i.getId());
                }
                ckf.y("tabComponentManager");
                throw null;
            }
        }
        return null;
    }

    public final String n() {
        int i;
        TabModel tabModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a5d090c", new Object[]{this});
        }
        ScrollControlViewPager scrollControlViewPager = this.c;
        if (scrollControlViewPager != null) {
            i = scrollControlViewPager.getCurrentItem();
        } else {
            i = -1;
        }
        MultiTabAdapter multiTabAdapter = this.d;
        if (multiTabAdapter != null) {
            tabModel = multiTabAdapter.i(i);
        } else {
            tabModel = null;
        }
        if (tabModel != null) {
            return tabModel.getId();
        }
        return null;
    }

    public final int o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("221d1801", new Object[]{this, str})).intValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        MultiTabAdapter multiTabAdapter = this.d;
        if (multiTabAdapter != null) {
            return multiTabAdapter.h(str);
        }
        return -1;
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
        TabLifecycleHandler tabLifecycleHandler = this.g;
        if (tabLifecycleHandler != null) {
            tabLifecycleHandler.l(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("tabLifecycleHandler");
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
        tpu.a.b(aVar, TAG, "页面滚动状态变化的时机，state=" + i, null, 4, null);
        this.e = i;
        BaseSubPageComponent<?, ?> m = m();
        if (m != null) {
            m.onMultiTabScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        MultiTabAdapter multiTabAdapter = this.d;
        String str = null;
        TabModel i2 = multiTabAdapter != null ? multiTabAdapter.i(i) : null;
        String id = i2 != null ? i2.getId() : null;
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "页面选中的时机，position=" + i + "，tabId=" + id, null, 4, null);
        if (i2 != null) {
            str = i2.getSpm();
        }
        w(i, id, str);
        ((k1e) k().getService(k1e.class)).r0(i);
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
        TabLifecycleHandler tabLifecycleHandler = this.g;
        if (tabLifecycleHandler != null) {
            tabLifecycleHandler.m(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("tabLifecycleHandler");
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
        TabLifecycleHandler tabLifecycleHandler = this.g;
        if (tabLifecycleHandler != null) {
            tabLifecycleHandler.n(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("tabLifecycleHandler");
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
        TabLifecycleHandler tabLifecycleHandler = this.g;
        if (tabLifecycleHandler != null) {
            tabLifecycleHandler.o(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("tabLifecycleHandler");
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
        TabLifecycleHandler tabLifecycleHandler = this.g;
        if (tabLifecycleHandler != null) {
            tabLifecycleHandler.p(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("tabLifecycleHandler");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ViewGroup p(java.lang.String r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.turbo.service.multitab.component.MultiTabComponent.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "4fba89e3"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            return r5
        L_0x0018:
            java.lang.String r0 = "tabId"
            tb.ckf.g(r5, r0)
            com.taobao.android.turbo.service.multitab.adapter.MultiTabAdapter r0 = r4.d
            r1 = 0
            if (r0 == 0) goto L_0x002c
            int r5 = r0.h(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x002d
        L_0x002c:
            r5 = r1
        L_0x002d:
            if (r5 == 0) goto L_0x003c
            int r5 = r5.intValue()
            com.taobao.android.turbo.service.multitab.adapter.MultiTabAdapter r0 = r4.d
            if (r0 == 0) goto L_0x003c
            android.widget.FrameLayout r5 = r0.k(r5)
            goto L_0x003d
        L_0x003c:
            r5 = r1
        L_0x003d:
            if (r5 == 0) goto L_0x0040
            return r5
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.turbo.service.multitab.component.MultiTabComponent.p(java.lang.String):android.view.ViewGroup");
    }

    public final int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final TabModel r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabModel) ipChange.ipc$dispatch("423f2306", new Object[]{this, new Integer(i)});
        }
        MultiTabAdapter multiTabAdapter = this.d;
        if (multiTabAdapter != null) {
            return multiTabAdapter.i(i);
        }
        return null;
    }

    public final Map<String, Integer> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("59432d6e", new Object[]{this});
        }
        return this.m.a();
    }

    public final void t(ScrollControlViewPager scrollControlViewPager, List<TabModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec6ba81", new Object[]{this, scrollControlViewPager, list});
            return;
        }
        this.c = scrollControlViewPager;
        scrollControlViewPager.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        krs krsVar = this.h;
        if (krsVar != null) {
            kqs kqsVar = this.f;
            if (kqsVar != null) {
                MultiTabAdapter multiTabAdapter = new MultiTabAdapter(list, krsVar, kqsVar);
                scrollControlViewPager.setAdapter(multiTabAdapter);
                this.d = multiTabAdapter;
                scrollControlViewPager.addOnPageChangeListener(this);
                TabLifecycleHandler tabLifecycleHandler = this.g;
                if (tabLifecycleHandler != null) {
                    tabLifecycleHandler.s(scrollControlViewPager);
                    TabLifecycleHandler tabLifecycleHandler2 = this.g;
                    if (tabLifecycleHandler2 != null) {
                        tabLifecycleHandler2.r(multiTabAdapter);
                        ors orsVar = this.i;
                        if (orsVar != null) {
                            orsVar.e(scrollControlViewPager);
                            ors orsVar2 = this.i;
                            if (orsVar2 != null) {
                                orsVar2.d(multiTabAdapter);
                                lqs lqsVar = this.j;
                                if (lqsVar != null) {
                                    lqsVar.e(multiTabAdapter);
                                } else {
                                    ckf.y("tabDarkStateUpdateNotifier");
                                    throw null;
                                }
                            } else {
                                ckf.y("tabSelectHelper");
                                throw null;
                            }
                        } else {
                            ckf.y("tabSelectHelper");
                            throw null;
                        }
                    } else {
                        ckf.y("tabLifecycleHandler");
                        throw null;
                    }
                } else {
                    ckf.y("tabLifecycleHandler");
                    throw null;
                }
            } else {
                ckf.y("tabComponentManager");
                throw null;
            }
        } else {
            ckf.y("tabRenderHelper");
            throw null;
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551e2bb3", new Object[]{this});
        } else {
            ((q2c) k().getService(q2c.class)).onStateChanged(EngineState.VISIBLE);
        }
    }

    /* renamed from: v */
    public void onCreate(PageModel pageModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b551a", new Object[]{this, pageModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onCreate(pageModel, iComponentLifecycle$TriggerType);
        this.f = new kqs();
        qpu k = k();
        kqs kqsVar = this.f;
        if (kqsVar != null) {
            this.g = new TabLifecycleHandler(k, kqsVar, this.m);
            qpu k2 = k();
            kqs kqsVar2 = this.f;
            if (kqsVar2 != null) {
                TabLifecycleHandler tabLifecycleHandler = this.g;
                if (tabLifecycleHandler != null) {
                    this.h = new krs(k2, kqsVar2, tabLifecycleHandler);
                    this.i = new ors(k());
                    this.j = new lqs(k(), this.m);
                    return;
                }
                ckf.y("tabLifecycleHandler");
                throw null;
            }
            ckf.y("tabComponentManager");
            throw null;
        }
        ckf.y("tabComponentManager");
        throw null;
    }

    public final void w(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2801f9f", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "Tab选中的时机，lastSelectedPosition=" + this.k + "，lastSelectedTabId=" + this.l + "，position=" + i + "，tabId=" + str, null, 4, null);
        ScrollControlViewPager scrollControlViewPager = this.c;
        MultiTabAdapter multiTabAdapter = this.d;
        if (!(scrollControlViewPager == null || multiTabAdapter == null)) {
            multiTabAdapter.instantiateItem((ViewGroup) scrollControlViewPager, i);
        }
        TabLifecycleHandler tabLifecycleHandler = this.g;
        if (tabLifecycleHandler != null) {
            tabLifecycleHandler.g(this.l, str, getState());
            this.m.h(this.k, this.l, i, str);
            this.k = i;
            this.l = str;
            F(str2);
            return;
        }
        ckf.y("tabLifecycleHandler");
        throw null;
    }

    public final void x(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e9c30d", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        MultiTabAdapter multiTabAdapter = this.d;
        TabModel i2 = multiTabAdapter != null ? multiTabAdapter.i(i) : null;
        MultiTabAdapter multiTabAdapter2 = this.d;
        FrameLayout k = multiTabAdapter2 != null ? multiTabAdapter2.k(i) : null;
        if (i2 != null && k != null) {
            krs krsVar = this.h;
            if (krsVar != null) {
                krsVar.e(i, f, i2, k);
            } else {
                ckf.y("tabRenderHelper");
                throw null;
            }
        }
    }

    public final boolean y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffde1207", new Object[]{this, new Integer(i)})).booleanValue();
        }
        ors orsVar = this.i;
        if (orsVar != null) {
            return orsVar.b(i);
        }
        ckf.y("tabSelectHelper");
        throw null;
    }

    public final boolean z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33f96ace", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ors orsVar = this.i;
        if (orsVar != null) {
            return orsVar.c(str);
        }
        ckf.y("tabSelectHelper");
        throw null;
    }

    public final void C(List<TabModel> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe8a41f", new Object[]{this, list, new Boolean(z)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "首次更新数据，tabs=" + list + "，isCache=" + z, null, 4, null);
        ScrollControlViewPager scrollControlViewPager = new ScrollControlViewPager(getContext());
        t(scrollControlViewPager, list);
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout != null) {
            frameLayout.addView(scrollControlViewPager);
        }
        ors orsVar = this.i;
        String str = null;
        if (orsVar != null) {
            orsVar.a(list, z);
            int currentItem = scrollControlViewPager.getCurrentItem();
            MultiTabAdapter multiTabAdapter = this.d;
            TabModel i = multiTabAdapter != null ? multiTabAdapter.i(currentItem) : null;
            if (i != null) {
                str = i.getId();
            }
            if (currentItem == 0 && str != null) {
                w(0, str, i.getSpm());
            }
            if (!ckf.b(str, "video")) {
                u();
                return;
            }
            return;
        }
        ckf.y("tabSelectHelper");
        throw null;
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this}) : new FrameLayout(getContext());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        aVar.c(TAG, "页面滚动的时机，position=" + i + "，positionOffset=" + f + "，positionOffsetPixels=" + i2);
        ScrollControlViewPager scrollControlViewPager = this.c;
        int currentItem = scrollControlViewPager != null ? scrollControlViewPager.getCurrentItem() : -1;
        if (i == currentItem) {
            x(1 + i, f);
        } else if (i == currentItem - 1) {
            x(i, 1 - f);
        }
        lqs lqsVar = this.j;
        if (lqsVar != null) {
            lqsVar.d(i, f);
            this.m.g(i, f, i2);
            return;
        }
        ckf.y("tabDarkStateUpdateNotifier");
        throw null;
    }

    public final boolean handleBack(IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fa1481c", new Object[]{this, triggerType})).booleanValue();
        }
        ckf.g(triggerType, "triggerType");
        String n = n();
        if (n == null) {
            tpu.a.b(tpu.Companion, TAG, "处理返回，tabId为空", null, 4, null);
            return false;
        }
        kqs kqsVar = this.f;
        if (kqsVar == null) {
            ckf.y("tabComponentManager");
            throw null;
        } else if (kqsVar.e(n, triggerType)) {
            tpu.a.b(tpu.Companion, TAG, "处理返回，isTabSuccess为true", null, 4, null);
            return true;
        } else if (!((yfc) k().getService(yfc.class)).d(n, triggerType)) {
            return false;
        } else {
            tpu.a.b(tpu.Companion, TAG, "处理返回，isInteractSuccess为true", null, 4, null);
            return true;
        }
    }
}
