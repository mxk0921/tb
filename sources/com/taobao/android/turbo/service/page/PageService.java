package com.taobao.android.turbo.service.page;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.page.BasePageService;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.model.TabModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.byb;
import tb.c1c;
import tb.ckf;
import tb.eyb;
import tb.f2e;
import tb.mnv;
import tb.nuo;
import tb.p3h;
import tb.qpu;
import tb.t2o;
import tb.tkq;
import tb.tpu;
import tb.vmd;
import tb.xwc;
import tb.yfc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PageService extends BasePageService implements eyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public qpu i;
    public c1c j;
    public yfc k;
    public ViewGroup l;
    public boolean m;

    static {
        t2o.a(916455571);
        t2o.a(919601268);
    }

    public static /* synthetic */ Object ipc$super(PageService pageService, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1950700062:
                super.onPageResume();
                return null;
            case -1205577093:
                super.onPageStart();
                return null;
            case -105714795:
                super.onCreateService((qpu) objArr[0]);
                return null;
            case -24410319:
                super.onPageCreate();
                return null;
            case 1535991773:
                super.w1((String) objArr[0], (Map) objArr[1]);
                return null;
            case 1753141775:
                super.onPagePause();
                return null;
            case 1882001079:
                super.onPageStop();
                return null;
            case 2095795603:
                super.onPageDestroy();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/page/PageService");
        }
    }

    @Override // tb.eyb
    public void B(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0098e0", new Object[]{this, obj});
        } else if (obj != null) {
            d2((PageModel) obj);
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.IPageBackLifecycle
    public boolean U0(IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eadbf05", new Object[]{this, triggerType})).booleanValue();
        }
        ckf.g(triggerType, "triggerType");
        c1c c1cVar = this.j;
        if (c1cVar != null) {
            return c1cVar.K(triggerType);
        }
        ckf.y("drawerContainerService");
        throw null;
    }

    public final ViewGroup a2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9dd8a4b9", new Object[]{this});
        }
        qpu qpuVar = this.i;
        if (qpuVar != null) {
            FrameLayout frameLayout = new FrameLayout(qpuVar.getContext());
            c1c c1cVar = this.j;
            if (c1cVar != null) {
                View z = c1cVar.z();
                z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(z);
                return frameLayout;
            }
            ckf.y("drawerContainerService");
            throw null;
        }
        ckf.y("turboEngineContext");
        throw null;
    }

    public final void b2(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a0aa8", new Object[]{this, map});
        } else if (map != null) {
            Object obj = map.get("globalUtParams");
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Object obj2 = map.get(p3h.KEY_PAGE_UT_PARAMS);
            if (!(obj2 instanceof Map)) {
                obj2 = null;
            }
            Map map3 = (Map) obj2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
            if (map3 != null) {
                linkedHashMap.putAll(map3);
            }
            qpu qpuVar = this.i;
            if (qpuVar != null) {
                ((f2e) qpuVar.getService(f2e.class)).a1(linkedHashMap);
            } else {
                ckf.y("turboEngineContext");
                throw null;
            }
        }
    }

    public final void c2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f9a692a", new Object[]{this});
            return;
        }
        qpu qpuVar = this.i;
        if (qpuVar != null) {
            vmd vmdVar = (vmd) qpuVar.getService(vmd.class);
            qpu qpuVar2 = this.i;
            if (qpuVar2 != null) {
                String m = qpuVar2.a().m();
                qpu qpuVar3 = this.i;
                if (qpuVar3 != null) {
                    JSONObject e = qpuVar3.a().e();
                    if (m != null || e != null) {
                        mnv.a aVar = mnv.Companion;
                        qpu qpuVar4 = this.i;
                        if (qpuVar4 != null) {
                            vmdVar.Z(new nuo(nuo.MSG_URL_REFRESH, m, e, Integer.MAX_VALUE, aVar.e(Uri.parse(qpuVar4.a().n()))));
                        } else {
                            ckf.y("turboEngineContext");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("turboEngineContext");
                    throw null;
                }
            } else {
                ckf.y("turboEngineContext");
                throw null;
            }
        } else {
            ckf.y("turboEngineContext");
            throw null;
        }
    }

    public final void d2(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f127c3", new Object[]{this, pageModel});
        } else if (pageModel != null) {
            c1c c1cVar = this.j;
            if (c1cVar != null) {
                c1cVar.Z0(pageModel);
            } else {
                ckf.y("drawerContainerService");
                throw null;
            }
        }
    }

    public final void e2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2299cc59", new Object[]{this, str});
            return;
        }
        qpu qpuVar = this.i;
        if (qpuVar != null) {
            ((f2e) qpuVar.getService(f2e.class)).p(str);
        } else {
            ckf.y("turboEngineContext");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(PageModel pageModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e66e7e1", new Object[]{this, pageModel});
            return;
        }
        qpu qpuVar = this.i;
        TabModel tabModel = null;
        if (qpuVar != null) {
            nuo J0 = ((vmd) qpuVar.getService(vmd.class)).J0(PageService$updateSchedulerMessageTabId$schedulerMessage$1.INSTANCE);
            if (J0 == null) {
                tpu.a.b(tpu.Companion, BasePageService.TAG, "更新承接消息对应的Tab id，schedulerMessage为空", null, 4, null);
            } else if (J0.d() != null) {
                tpu.a.b(tpu.Companion, BasePageService.TAG, "更新承接消息对应的Tab id，schedulerMessage.page不为空", null, 4, null);
            } else {
                List<TabModel> tabs = pageModel.getTabs();
                if (tabs != null) {
                    Iterator<T> it = tabs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((TabModel) next).getSelected()) {
                            tabModel = next;
                            break;
                        }
                    }
                    tabModel = tabModel;
                }
                if (tabModel == null || (str = tabModel.getId()) == null) {
                    str = "video";
                }
                tpu.a.b(tpu.Companion, BasePageService.TAG, "更新承接消息对应的Tab id，tabId=".concat(str), null, 4, null);
                J0.h(str);
            }
        } else {
            ckf.y("turboEngineContext");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f2(PageModel pageModel) {
        String url;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91a725", new Object[]{this, pageModel});
            return;
        }
        qpu qpuVar = this.i;
        TabModel tabModel = null;
        if (qpuVar != null) {
            JSONObject l = qpuVar.a().l();
            if (l != null) {
                Object obj = l.get("id");
                Object obj2 = l.get("url");
                if ((obj instanceof String) && (obj2 instanceof String)) {
                    Map<String, String> e = mnv.Companion.e(Uri.parse((String) obj2));
                    List<TabModel> tabs = pageModel.getTabs();
                    if (tabs != null) {
                        Iterator<T> it = tabs.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (ckf.b(((TabModel) next).getId(), obj)) {
                                tabModel = next;
                                break;
                            }
                        }
                        tabModel = tabModel;
                    }
                    if (tabModel != null && (url = tabModel.getUrl()) != null) {
                        tabModel.setUrl(mnv.Companion.d(url, e));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ckf.y("turboEngineContext");
        throw null;
    }

    @Override // tb.b7d
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            return viewGroup.getHeight();
        }
        return 0;
    }

    @Override // tb.b7d
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        ViewGroup viewGroup = this.l;
        ckf.d(viewGroup);
        return viewGroup;
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        super.onCreateService(qpuVar);
        this.i = qpuVar;
        this.j = (c1c) qpuVar.getService(c1c.class);
        qpu qpuVar2 = this.i;
        if (qpuVar2 != null) {
            this.k = (yfc) qpuVar2.getService(yfc.class);
            qpu qpuVar3 = this.i;
            if (qpuVar3 != null) {
                tkq tkqVar = new tkq(qpuVar3);
                qpu qpuVar4 = this.i;
                if (qpuVar4 != null) {
                    ((xwc) qpuVar4.getService(xwc.class)).Y().x(tkqVar);
                } else {
                    ckf.y("turboEngineContext");
                    throw null;
                }
            } else {
                ckf.y("turboEngineContext");
                throw null;
            }
        } else {
            ckf.y("turboEngineContext");
            throw null;
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.p6d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
        } else if (L1(5)) {
            N1();
            super.onPageDestroy();
            qpu qpuVar = this.i;
            if (qpuVar != null) {
                ((byb) qpuVar.getService(byb.class)).T0(this);
                T1();
                return;
            }
            ckf.y("turboEngineContext");
            throw null;
        } else {
            tpu.a.b(tpu.Companion, BasePageService.TAG, "onPageDestroy... can not move to DESTROYED", null, 4, null);
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        } else if (L1(3)) {
            O1();
            super.onPagePause();
            c1c c1cVar = this.j;
            if (c1cVar != null) {
                IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE;
                c1cVar.H0(iComponentLifecycle$TriggerType);
                yfc yfcVar = this.k;
                if (yfcVar != null) {
                    yfcVar.H0(iComponentLifecycle$TriggerType);
                    U1();
                    return;
                }
                ckf.y("interactContainerService");
                throw null;
            }
            ckf.y("drawerContainerService");
            throw null;
        } else {
            tpu.a.b(tpu.Companion, BasePageService.TAG, "onPagePause... can not move to PAUSED", null, 4, null);
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
        } else if (L1(2)) {
            P1();
            super.onPageResume();
            c1c c1cVar = this.j;
            if (c1cVar != null) {
                IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE;
                c1cVar.I0(iComponentLifecycle$TriggerType);
                yfc yfcVar = this.k;
                if (yfcVar != null) {
                    yfcVar.I0(iComponentLifecycle$TriggerType);
                    V1();
                    return;
                }
                ckf.y("interactContainerService");
                throw null;
            }
            ckf.y("drawerContainerService");
            throw null;
        } else {
            tpu.a.b(tpu.Companion, BasePageService.TAG, "onPageResume... can not move to RESUMED", null, 4, null);
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.p6d
    public void onPageStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d0eb7", new Object[]{this});
        } else if (L1(4)) {
            R1();
            super.onPageStop();
            c1c c1cVar = this.j;
            if (c1cVar != null) {
                IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE;
                c1cVar.H1(iComponentLifecycle$TriggerType);
                yfc yfcVar = this.k;
                if (yfcVar != null) {
                    yfcVar.H1(iComponentLifecycle$TriggerType);
                    X1();
                    return;
                }
                ckf.y("interactContainerService");
                throw null;
            }
            ckf.y("drawerContainerService");
            throw null;
        } else {
            tpu.a.b(tpu.Companion, BasePageService.TAG, "onPageStop... can not move to STOPPED", null, 4, null);
        }
    }

    @Override // tb.b7d
    public void u(BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0cdf87", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "message");
        if (bVar.f() == BaseOuterComponent.OuterComponentType.INTERACT_CONTAINER) {
            yfc yfcVar = this.k;
            if (yfcVar != null) {
                yfcVar.i(bVar);
            } else {
                ckf.y("interactContainerService");
                throw null;
            }
        } else {
            c1c c1cVar = this.j;
            if (c1cVar != null) {
                c1cVar.i(bVar);
            } else {
                ckf.y("drawerContainerService");
                throw null;
            }
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.b7d
    public void w1(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8d5fdd", new Object[]{this, str, map});
            return;
        }
        ckf.g(str, "url");
        ckf.g(map, "query");
        super.w1(str, map);
        String str2 = map.get("spm");
        if (str2 != null) {
            e2(str2);
        }
        String str3 = map.get("extParams");
        if (str3 != null) {
            try {
                b2(JSON.parseObject(str3));
            } catch (Exception e) {
                tpu.Companion.a(BasePageService.TAG, "mergeGlobalParams, parse extParams error ".concat(str), e);
            }
        }
    }

    @Override // tb.eyb
    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e1d39a", new Object[]{this});
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.p6d
    public void onPageCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b8731", new Object[]{this});
        } else if (L1(0)) {
            M1();
            super.onPageCreate();
            c2();
            qpu qpuVar = this.i;
            if (qpuVar != null) {
                String k = qpuVar.a().k();
                if (k == null) {
                    k = "a2141.1.tabbar.guangguang";
                }
                e2(k);
                qpu qpuVar2 = this.i;
                if (qpuVar2 != null) {
                    nuo J0 = ((vmd) qpuVar2.getService(vmd.class)).J0(PageService$onPageCreate$schedulerMessage$1.INSTANCE);
                    b2(J0 != null ? J0.a() : null);
                    this.l = a2();
                    qpu qpuVar3 = this.i;
                    if (qpuVar3 != null) {
                        byb bybVar = (byb) qpuVar3.getService(byb.class);
                        bybVar.r(this);
                        Object s = bybVar.s();
                        if (s != null) {
                            PageModel pageModel = (PageModel) s;
                            f2(pageModel);
                            f(pageModel);
                            d2(pageModel);
                            S1();
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.model.PageModel");
                    }
                    ckf.y("turboEngineContext");
                    throw null;
                }
                ckf.y("turboEngineContext");
                throw null;
            }
            ckf.y("turboEngineContext");
            throw null;
        } else {
            tpu.a.b(tpu.Companion, BasePageService.TAG, "onPageCreate... can not move to CREATED", null, 4, null);
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.p6d
    public void onPageStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8245a7b", new Object[]{this});
        } else if (L1(1)) {
            Q1();
            super.onPageStart();
            if (this.m) {
                qpu qpuVar = this.i;
                if (qpuVar != null) {
                    nuo J0 = ((vmd) qpuVar.getService(vmd.class)).J0(PageService$onPageStart$schedulerMessage$1.INSTANCE);
                    b2(J0 != null ? J0.a() : null);
                } else {
                    ckf.y("turboEngineContext");
                    throw null;
                }
            }
            c1c c1cVar = this.j;
            if (c1cVar != null) {
                IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE;
                c1cVar.r1(iComponentLifecycle$TriggerType);
                yfc yfcVar = this.k;
                if (yfcVar != null) {
                    yfcVar.r1(iComponentLifecycle$TriggerType);
                    W1();
                    this.m = true;
                    return;
                }
                ckf.y("interactContainerService");
                throw null;
            }
            ckf.y("drawerContainerService");
            throw null;
        } else {
            tpu.a.b(tpu.Companion, BasePageService.TAG, "onPageStart... can not move to STARTED", null, 4, null);
        }
    }
}
