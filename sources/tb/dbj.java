package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.service.multitab.component.MultiTabComponent;
import java.util.Map;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dbj implements xwc, umd, p6d, rjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f17708a;
    public MultiTabComponent b;
    public final bbj c = new bbj();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455550);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455549);
        t2o.a(916455446);
        t2o.a(919601330);
        t2o.a(919601322);
        t2o.a(916455433);
    }

    /* renamed from: B */
    public void Z0(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778f7a72", new Object[]{this, pageModel});
            return;
        }
        ckf.g(pageModel, "data");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabService", "设置多Tab数据，data=" + pageModel, null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            multiTabComponent.updateData(pageModel);
        } else {
            ckf.y("multiTabComponent");
            throw null;
        }
    }

    @Override // tb.xwc
    public int E1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("221d1801", new Object[]{this, str})).intValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            return multiTabComponent.o(str);
        }
        ckf.y("multiTabComponent");
        throw null;
    }

    @Override // tb.iae
    public void H0(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c112a576", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabService", "服务暂停的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            multiTabComponent.onPause(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("multiTabComponent");
            throw null;
        }
    }

    @Override // tb.iae
    public void H1(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9ca3a0", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabService", "服务停止的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            multiTabComponent.onStop(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("multiTabComponent");
            throw null;
        }
    }

    @Override // tb.iae
    public void I0(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48b848b", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabService", "服务恢复的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            multiTabComponent.onResume(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("multiTabComponent");
            throw null;
        }
    }

    @Override // tb.xwc
    public boolean K(IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fa1481c", new Object[]{this, triggerType})).booleanValue();
        }
        ckf.g(triggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabService", "处理返回，triggerType=" + triggerType, null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            return multiTabComponent.handleBack(triggerType);
        }
        ckf.y("multiTabComponent");
        throw null;
    }

    @Override // tb.xwc
    public void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de66eb9e", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "MultiTabService", "处理分享", null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            multiTabComponent.handleShare();
        } else {
            ckf.y("multiTabComponent");
            throw null;
        }
    }

    @Override // tb.vpj
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2918e2c9", new Object[]{this});
        }
    }

    @Override // tb.xwc
    public Map<String, Integer> T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("59432d6e", new Object[]{this});
        }
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            return multiTabComponent.s();
        }
        ckf.y("multiTabComponent");
        throw null;
    }

    @Override // tb.xwc
    public wwc Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wwc) ipChange.ipc$dispatch("2dace268", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.xwc
    public View b1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97c9ffb4", new Object[]{this, str});
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            return multiTabComponent.p(str);
        }
        ckf.y("multiTabComponent");
        throw null;
    }

    @Override // tb.xwc
    public TabModel d0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabModel) ipChange.ipc$dispatch("423f2306", new Object[]{this, new Integer(i)});
        }
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            return multiTabComponent.r(i);
        }
        ckf.y("multiTabComponent");
        throw null;
    }

    @Override // tb.xwc
    public int getCurrentIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            return multiTabComponent.l();
        }
        ckf.y("multiTabComponent");
        throw null;
    }

    @Override // tb.xwc
    public int getScrollState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue();
        }
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            return multiTabComponent.q();
        }
        ckf.y("multiTabComponent");
        throw null;
    }

    @Override // tb.xwc
    public void i(BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be86f4e7", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "message");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabService", "处理外部消息，message=" + bVar, null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            multiTabComponent.handleOuterMessage(bVar);
        } else {
            ckf.y("multiTabComponent");
            throw null;
        }
    }

    @Override // tb.xwc
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f594a6bb", new Object[]{this, new Boolean(z)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabService", "设置是否可以滚动，enableScroll=" + z, null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            multiTabComponent.A(z);
        } else {
            ckf.y("multiTabComponent");
            throw null;
        }
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "MultiTabService", "服务创建的时机", null, 4, null);
        this.f17708a = qpuVar;
        MultiTabComponent multiTabComponent = new MultiTabComponent(qpuVar, this.c);
        this.b = multiTabComponent;
        multiTabComponent.onCreate(null, IComponentLifecycle$TriggerType.UNSPECIFIED);
        ((b7d) qpuVar.getService(b7d.class)).e1(this);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "MultiTabService", "服务销毁的时机", null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            multiTabComponent.onDestroy(IComponentLifecycle$TriggerType.UNSPECIFIED);
            ((b7d) qpuVar.getService(b7d.class)).T0(this);
            return;
        }
        ckf.y("multiTabComponent");
        throw null;
    }

    @Override // tb.p6d
    public void onPageCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b8731", new Object[]{this});
            return;
        }
        qpu qpuVar = this.f17708a;
        if (qpuVar != null) {
            ((tjb) qpuVar.getService(tjb.class)).B(this);
        } else {
            ckf.y("turboEngineContext");
            throw null;
        }
    }

    @Override // tb.p6d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
            return;
        }
        qpu qpuVar = this.f17708a;
        if (qpuVar != null) {
            ((vmd) qpuVar.getService(vmd.class)).B(this);
            qpu qpuVar2 = this.f17708a;
            if (qpuVar2 != null) {
                ((tjb) qpuVar2.getService(tjb.class)).L(this);
            } else {
                ckf.y("turboEngineContext");
                throw null;
            }
        } else {
            ckf.y("turboEngineContext");
            throw null;
        }
    }

    @Override // tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
            return;
        }
        qpu qpuVar = this.f17708a;
        if (qpuVar != null) {
            ((vmd) qpuVar.getService(vmd.class)).r(this);
        } else {
            ckf.y("turboEngineContext");
            throw null;
        }
    }

    @Override // tb.p6d
    public void onPageStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8245a7b", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d0eb7", new Object[]{this});
        }
    }

    @Override // tb.ujb
    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cacfd02", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.iae
    public void r1(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a79875e2", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabService", "服务启动的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            multiTabComponent.onStart(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("multiTabComponent");
            throw null;
        }
    }

    @Override // com.taobao.tao.navigation.a.g
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        }
    }

    @Override // tb.xwc
    public boolean selectTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33f96ace", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        tpu.a.b(tpu.Companion, "MultiTabService", "选择指定Tab，tabId=".concat(str), null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            return multiTabComponent.z(str);
        }
        ckf.y("multiTabComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    @Override // tb.iae
    public View z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5e7be40a", new Object[]{this});
        }
        tpu.a.b(tpu.Companion, "MultiTabService", "创建多Tab视图", null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            return multiTabComponent.createView();
        }
        ckf.y("multiTabComponent");
        throw null;
    }

    @Override // tb.hvd
    public void onTabChanged(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
        } else if (i == 1) {
            qpu qpuVar = this.f17708a;
            if (qpuVar != null) {
                nuo h0 = ((vmd) qpuVar.getService(vmd.class)).h0(nuo.MSG_ICON_CHANGE);
                if (h0 != null) {
                    String d = h0.d();
                    if (d != null) {
                        MultiTabComponent multiTabComponent = this.b;
                        if (multiTabComponent != null) {
                            int o = multiTabComponent.o(d);
                            if (o >= 0) {
                                MultiTabComponent multiTabComponent2 = this.b;
                                if (multiTabComponent2 == null) {
                                    ckf.y("multiTabComponent");
                                    throw null;
                                } else if (o != multiTabComponent2.l()) {
                                    selectTab(o);
                                    return;
                                }
                            }
                            tpu.a aVar = tpu.Companion;
                            tpu.a.b(aVar, "MultiTabService", "icon承接, 目标index和当前index相同, 无需设置 " + o, null, 4, null);
                            return;
                        }
                        ckf.y("multiTabComponent");
                        throw null;
                    }
                    tpu.a.b(tpu.Companion, "MultiTabService", "icon承接, 目标tabId为空，无法设置", null, 4, null);
                    return;
                }
                return;
            }
            ckf.y("turboEngineContext");
            throw null;
        }
    }

    @Override // tb.xwc
    public boolean selectTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffde1207", new Object[]{this, new Integer(i)})).booleanValue();
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabService", "选择指定Tab，index=" + i, null, 4, null);
        MultiTabComponent multiTabComponent = this.b;
        if (multiTabComponent != null) {
            return multiTabComponent.y(i);
        }
        ckf.y("multiTabComponent");
        throw null;
    }

    @Override // tb.umd
    public boolean x(nuo nuoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a060199f", new Object[]{this, nuoVar})).booleanValue();
        }
        ckf.g(nuoVar, "schedulerMessage");
        if (ckf.b(nuoVar.c(), "forceRefresh")) {
            MultiTabComponent multiTabComponent = this.b;
            if (multiTabComponent != null) {
                BaseSubPageComponent<?, ?> m = multiTabComponent.m();
                if (m != null) {
                    m.onRefresh(null);
                    return true;
                }
                tpu.a.b(tpu.Companion, "MultiTabService", "当前没有子页面，无法刷新", null, 4, null);
            } else {
                ckf.y("multiTabComponent");
                throw null;
            }
        } else if (ckf.b(nuoVar.c(), nuo.MSG_SELECT_TAB)) {
            String d = nuoVar.d();
            if (d != null) {
                MultiTabComponent multiTabComponent2 = this.b;
                if (multiTabComponent2 != null) {
                    int o = multiTabComponent2.o(d);
                    if (o >= 0) {
                        MultiTabComponent multiTabComponent3 = this.b;
                        if (multiTabComponent3 == null) {
                            ckf.y("multiTabComponent");
                            throw null;
                        } else if (o != multiTabComponent3.l()) {
                            selectTab(o);
                            return true;
                        }
                    }
                    tpu.a aVar = tpu.Companion;
                    tpu.a.b(aVar, "MultiTabService", "目标index和当前index相同, 无需设置 " + o, null, 4, null);
                    return true;
                }
                ckf.y("multiTabComponent");
                throw null;
            }
            tpu.a.b(tpu.Companion, "MultiTabService", "目标tabId为空，无法设置", null, 4, null);
        } else if (ckf.b(nuoVar.c(), nuo.MSG_URL_REFRESH)) {
            MultiTabComponent multiTabComponent4 = this.b;
            if (multiTabComponent4 != null) {
                int l = multiTabComponent4.l();
                MultiTabComponent multiTabComponent5 = this.b;
                if (multiTabComponent5 != null) {
                    TabModel r = multiTabComponent5.r(l);
                    MultiTabComponent multiTabComponent6 = this.b;
                    if (multiTabComponent6 != null) {
                        BaseSubPageComponent<?, ?> m2 = multiTabComponent6.m();
                        if (m2 == null || r == null || (!ckf.b(r.getId(), nuoVar.d()) && nuoVar.d() != null)) {
                            tpu.a.b(tpu.Companion, "MultiTabService", "当前没有子页面，无法消费url刷新消息", null, 4, null);
                        } else {
                            m2.onRefresh(nuoVar.a());
                            return true;
                        }
                    } else {
                        ckf.y("multiTabComponent");
                        throw null;
                    }
                } else {
                    ckf.y("multiTabComponent");
                    throw null;
                }
            } else {
                ckf.y("multiTabComponent");
                throw null;
            }
        }
        return false;
    }
}
