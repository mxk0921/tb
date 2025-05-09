package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dressup.common.component.dx.DressUpDXUserContext;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.han;
import tb.ian;
import tb.q8u;
import tb.rwb;
import tb.td6;
import tb.tpu;
import tb.wy5;
import tb.ye5;
import tb.ypa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class bc6 implements rwb, iwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public DinamicXEngine f16313a;
    public qpu b;
    public final Map<String, List<rwb.a>> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552739);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552738);
        t2o.a(918552748);
        t2o.a(444596939);
    }

    public final void M(String str, rwb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efdbcfeb", new Object[]{this, str, aVar});
            return;
        }
        tpu.a aVar2 = tpu.Companion;
        tpu.a.b(aVar2, IDxItemRenderService.SERVICE_NAME, "addCallback name:" + str, null, 4, null);
        List list = (List) ((HashMap) this.c).get(str);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.c).put(str, list);
        }
        list.add(aVar);
    }

    @Override // tb.rwb
    public void R0(DXRootView dXRootView, DXTemplateItem dXTemplateItem, l18 l18Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c70bc1", new Object[]{this, dXRootView, dXTemplateItem, l18Var});
            return;
        }
        ckf.g(dXRootView, "dxRootView");
        ckf.g(dXTemplateItem, "template");
        q8u.a aVar = q8u.Companion;
        aVar.a("renderDXTemplate");
        DXTemplateItem u = d().u(dXTemplateItem);
        tpu.a aVar2 = tpu.Companion;
        tpu.a.b(aVar2, IDxItemRenderService.SERVICE_NAME, "renderDXTemplate, template:" + dXTemplateItem + ", availableTemplate:" + u + " data:" + l18Var, null, 4, null);
        if (u != null) {
            DXResult<DXRootView> i1 = d().i1(dXRootView.getContext(), dXRootView, u, l18Var != null ? l18Var.a() : null, -1, new DXRenderOptions.b().G(pb6.j()).t(pb6.i()).E(new DressUpDXUserContext()).q());
            ckf.f(i1, "getDXEngine().renderTemp…build()\n                )");
            if (i1.d()) {
                tpu.a.b(aVar2, IDxItemRenderService.SERVICE_NAME, "renderDXTemplate error: " + i1, null, 4, null);
            }
        }
        aVar.c();
    }

    public final List<rwb.a> c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b81049a1", new Object[]{this, str});
        }
        return (List) ((HashMap) this.c).get(str);
    }

    @Override // tb.rwb
    public DinamicXEngine d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("183ff254", new Object[]{this});
        }
        tpu.a.b(tpu.Companion, IDxItemRenderService.SERVICE_NAME, "getDXEngine", null, 4, null);
        q8u.a aVar = q8u.Companion;
        aVar.a("getDXEngine");
        if (this.f16313a == null) {
            DXEngineConfig.b c0 = new DXEngineConfig.b("dressup").Q(2).c0(1000);
            c0.S(false);
            DinamicXEngine dinamicXEngine = new DinamicXEngine(c0.F());
            qpu qpuVar = this.b;
            if (qpuVar != null) {
                dinamicXEngine.W0(uip.DX_EVENT_CSHARE, new uip(qpuVar));
                qpu qpuVar2 = this.b;
                if (qpuVar2 != null) {
                    dinamicXEngine.W0(it9.DX_EVENT_CFOLLOW, new it9(qpuVar2));
                    qpu qpuVar3 = this.b;
                    if (qpuVar3 != null) {
                        dinamicXEngine.W0(yy3.DX_EVENT_CCOLLECT, new yy3(qpuVar3));
                        qpu qpuVar4 = this.b;
                        if (qpuVar4 != null) {
                            dinamicXEngine.W0(te5.DX_EVENT_CDRESSCARDJUMP, new te5(qpuVar4));
                            qpu qpuVar5 = this.b;
                            if (qpuVar5 != null) {
                                dinamicXEngine.W0(re5.DX_EVENT_CDRESSBANNERCHANGE, new re5(qpuVar5));
                                qpu qpuVar6 = this.b;
                                if (qpuVar6 != null) {
                                    dinamicXEngine.W0(ij6.DX_EVENT_CTRACKCLICK, new ij6(qpuVar6));
                                    qpu qpuVar7 = this.b;
                                    if (qpuVar7 != null) {
                                        dinamicXEngine.W0(lj6.DX_EVENT_CTRACKEXPOSURE, new lj6(qpuVar7));
                                        qpu qpuVar8 = this.b;
                                        if (qpuVar8 != null) {
                                            dinamicXEngine.W0(ne5.DX_EVENT_CADDCART, new ne5(qpuVar8));
                                            qpu qpuVar9 = this.b;
                                            if (qpuVar9 != null) {
                                                dinamicXEngine.W0(ve5.DX_EVENT_CENTERSHOP, new ve5(qpuVar9));
                                                qpu qpuVar10 = this.b;
                                                if (qpuVar10 != null) {
                                                    dinamicXEngine.W0(cf5.DX_EVENT_COPENCOMMENT, new cf5(qpuVar10));
                                                    dinamicXEngine.V0(-2517623531547489759L, new jq5());
                                                    dinamicXEngine.e1(-6240570111658900479L, new wy5.a());
                                                    dinamicXEngine.e1(-7577370574697348630L, new han.a());
                                                    dinamicXEngine.e1(ian.VIEW_IDENTITY, new ian.b());
                                                    dinamicXEngine.e1(1202423593942681808L, new ypa.b());
                                                    dinamicXEngine.e1(ye5.DXCIMAGEVIEW_CIMAGEVIEW, new ye5.a());
                                                    dinamicXEngine.e1(td6.DXTBIFLOTTIEVIEW_TBIFLOTTIEVIEW, new td6.a());
                                                    dinamicXEngine.a1(this);
                                                    this.f16313a = dinamicXEngine;
                                                } else {
                                                    ckf.y("context");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("context");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y("context");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("context");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("context");
                                    throw null;
                                }
                            } else {
                                ckf.y("context");
                                throw null;
                            }
                        } else {
                            ckf.y("context");
                            throw null;
                        }
                    } else {
                        ckf.y("context");
                        throw null;
                    }
                } else {
                    ckf.y("context");
                    throw null;
                }
            } else {
                ckf.y("context");
                throw null;
            }
        }
        aVar.c();
        DinamicXEngine dinamicXEngine2 = this.f16313a;
        ckf.d(dinamicXEngine2);
        return dinamicXEngine2;
    }

    @Override // tb.rwb
    public void o1(DXTemplateItem dXTemplateItem, rwb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d88e35b", new Object[]{this, dXTemplateItem, aVar});
            return;
        }
        ckf.g(dXTemplateItem, "template");
        ckf.g(aVar, "callback");
        q8u.a aVar2 = q8u.Companion;
        aVar2.a("createDXRootView");
        DXTemplateItem u = d().u(dXTemplateItem);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dXTemplateItem);
        d().p(arrayList);
        tpu.a aVar3 = tpu.Companion;
        tpu.a.b(aVar3, IDxItemRenderService.SERVICE_NAME, "createDXRootView template:" + dXTemplateItem + ", availableTemplate:" + u, null, 4, null);
        if (u != null) {
            DinamicXEngine d = d();
            qpu qpuVar = this.b;
            if (qpuVar != null) {
                DXRootView dXRootView = d.o(qpuVar.getContext(), u).f7291a;
                ckf.f(dXRootView, "dxRootView");
                aVar.a(dXRootView, u);
            } else {
                ckf.y("context");
                throw null;
            }
        }
        String str = dXTemplateItem.f7343a;
        ckf.f(str, "template.name");
        M(str, aVar);
        aVar2.c();
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, IDxItemRenderService.SERVICE_NAME, "onCreateService", null, 4, null);
        this.b = qpuVar;
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, IDxItemRenderService.SERVICE_NAME, "onDestroyService", null, 4, null);
    }

    @Override // tb.iwb
    public void onNotificationListener(k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, IDxItemRenderService.SERVICE_NAME, "onNotificationListener result:" + k66Var, null, 4, null);
        if (k66Var != null) {
            List<DXTemplateItem> list = k66Var.f22428a;
            ckf.f(list, "dxNotificationResult.finishedTemplateItems");
            for (DXTemplateItem dXTemplateItem : list) {
                tpu.a aVar2 = tpu.Companion;
                tpu.a.b(aVar2, IDxItemRenderService.SERVICE_NAME, "onNotificationListener finish templateItem:" + dXTemplateItem, null, 4, null);
                String str = dXTemplateItem.f7343a;
                ckf.f(str, "templateItem.name");
                List<rwb.a> c0 = c0(str);
                if (c0 != null) {
                    for (rwb.a aVar3 : c0) {
                        DinamicXEngine d = d();
                        qpu qpuVar = this.b;
                        if (qpuVar != null) {
                            DXRootView dXRootView = d.o(qpuVar.getContext(), dXTemplateItem).f7291a;
                            ckf.f(dXRootView, "dxRootView");
                            aVar3.a(dXRootView, dXTemplateItem);
                        } else {
                            ckf.y("context");
                            throw null;
                        }
                    }
                    continue;
                }
                String str2 = dXTemplateItem.f7343a;
                ckf.f(str2, "templateItem.name");
                z0(str2);
            }
            List<DXTemplateItem> list2 = k66Var.b;
            ckf.f(list2, "dxNotificationResult.failedTemplateItems");
            for (DXTemplateItem dXTemplateItem2 : list2) {
                tpu.a aVar4 = tpu.Companion;
                tpu.a.b(aVar4, IDxItemRenderService.SERVICE_NAME, "onNotificationListener fail templateItem:" + dXTemplateItem2, null, 4, null);
                String str3 = dXTemplateItem2.f7343a;
                ckf.f(str3, "templateItem.name");
                List<rwb.a> c02 = c0(str3);
                if (c02 != null) {
                    for (rwb.a aVar5 : c02) {
                        aVar5.onFail();
                    }
                }
                String str4 = dXTemplateItem2.f7343a;
                ckf.f(str4, "templateItem.name");
                z0(str4);
            }
        }
    }

    public final void z0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9586eba", new Object[]{this, str});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, IDxItemRenderService.SERVICE_NAME, "removeCallback name:" + str, null, 4, null);
        ((HashMap) this.c).remove(str);
    }
}
