package com.taobao.tab2interact.pageadapter.guangguang.turbo;

import android.content.Context;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.BaseServiceDelegate;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.tab2interact.core.component.browser.BrowserBadge;
import com.taobao.tab2interact.core.component.revisitedu.RevisitEduDialog;
import com.taobao.tab2interact.core.layer.h5.H5InteractLayer;
import com.taobao.tab2interact.tabadapter.shortvideo.redpackage.RedpackageAdapter;
import java.util.Map;
import tb.a07;
import tb.b3a;
import tb.bpa;
import tb.bvy;
import tb.byd;
import tb.ckf;
import tb.cpa;
import tb.d1c;
import tb.em2;
import tb.evy;
import tb.fll;
import tb.hgf;
import tb.jmi;
import tb.k7d;
import tb.kxd;
import tb.sff;
import tb.sj4;
import tb.t2o;
import tb.vaj;
import tb.vgh;
import tb.vv1;
import tb.xey;
import tb.yff;
import tb.yps;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class GGInteractContainerComponent extends xey<FrameLayout> implements k7d, d1c, byd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String TAG = "GGInteractContainerComponent";
    private sff interactContainer;
    private yff interactPageAdapterManager;
    private hgf interactTabAdapterManager;
    private jmi messageCenter;
    private RedpackageAdapter redpackageAdapter;
    private bvy revisitEduDialogGGPageAdapter;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963219);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963218);
        t2o.a(919601328);
        t2o.a(916455442);
        t2o.a(916455448);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGInteractContainerComponent(BaseOuterComponent.OuterComponentType outerComponentType, String str, Context context, Object obj, String str2, String str3, BaseServiceDelegate baseServiceDelegate) {
        super(outerComponentType, str, context, obj, str2, str3, baseServiceDelegate);
        ckf.g(outerComponentType, OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE);
        ckf.g(str, "componentId");
        ckf.g(context, "context");
        ckf.g(str2, "pageURL");
        ckf.g(str3, "engineId");
        ckf.g(baseServiceDelegate, "serviceDelegate");
    }

    private final void handleOnSubPageCreate(BaseSubPageComponent.SubPageModel subPageModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b19638", new Object[]{this, subPageModel, iComponentLifecycle$TriggerType});
            return;
        }
        String id = subPageModel.getId();
        String type = subPageModel.getType();
        vgh.c(this, TAG, "在子页面创建的时机处理，subPageId=" + id + "，subPageType=" + type + "，triggerType=" + iComponentLifecycle$TriggerType);
        if (ckf.b(type, "video")) {
            String appendBizName = FluidInstanceConfig.appendBizName(FluidInstanceConfig.CONTAINER_NAME_GG_TAG3, id, getEngineId());
            hgf hgfVar = this.interactTabAdapterManager;
            if (hgfVar != null) {
                ckf.f(appendBizName, "tabFluidInstanceId");
                hgfVar.e(id, appendBizName);
            } else {
                ckf.y("interactTabAdapterManager");
                throw null;
            }
        }
        sff sffVar = this.interactContainer;
        if (sffVar != null) {
            sffVar.k(id, type);
        } else {
            ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
            throw null;
        }
    }

    private final void handleOnSubPageDestroy(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce970f8", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        vgh.c(this, TAG, "在子页面销毁的时机处理，subPageId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType);
        sff sffVar = this.interactContainer;
        if (sffVar != null) {
            sffVar.l(str);
            hgf hgfVar = this.interactTabAdapterManager;
            if (hgfVar != null) {
                hgfVar.f(str);
            } else {
                ckf.y("interactTabAdapterManager");
                throw null;
            }
        } else {
            ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
            throw null;
        }
    }

    private final void handleOnSubPagePause(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00aa57c", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        vgh.c(this, TAG, "在子页面暂停的时机处理，subPageId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType);
        if (iComponentLifecycle$TriggerType == IComponentLifecycle$TriggerType.DRAWER_OPEN_CLOSE || iComponentLifecycle$TriggerType == IComponentLifecycle$TriggerType.TAB_SELECT) {
            sff sffVar = this.interactContainer;
            if (sffVar != null) {
                sffVar.n(str, "tab");
            } else {
                ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
                throw null;
            }
        } else {
            sff sffVar2 = this.interactContainer;
            if (sffVar2 != null) {
                sffVar2.n(str, "other");
                sff sffVar3 = this.interactContainer;
                if (sffVar3 != null) {
                    sffVar3.i("other");
                } else {
                    ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
                    throw null;
                }
            } else {
                ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
                throw null;
            }
        }
    }

    private final void handleOnSubPageResume(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4e4795", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        vgh.c(this, TAG, "在子页面恢复的时机处理，subPageId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType);
        if (iComponentLifecycle$TriggerType == IComponentLifecycle$TriggerType.DRAWER_OPEN_CLOSE || iComponentLifecycle$TriggerType == IComponentLifecycle$TriggerType.TAB_SELECT) {
            sff sffVar = this.interactContainer;
            if (sffVar != null) {
                sffVar.m(str, "tab");
            } else {
                ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
                throw null;
            }
        } else {
            sff sffVar2 = this.interactContainer;
            if (sffVar2 != null) {
                sffVar2.h("other");
                sff sffVar3 = this.interactContainer;
                if (sffVar3 != null) {
                    sffVar3.m(str, "other");
                } else {
                    ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
                    throw null;
                }
            } else {
                ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
                throw null;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(GGInteractContainerComponent gGInteractContainerComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1986290286:
                return new Boolean(super.handleBack((String) objArr[0], (IPageBackLifecycle.TriggerType) objArr[1]));
            case -1098451737:
                super.handleOuterMessage((BaseOuterComponent.b) objArr[0]);
                return null;
            case -560092455:
                super.onDestroy((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -128189347:
                super.onCreate((GGInteractContainerComponent) objArr[0], (IComponentLifecycle$TriggerType) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/pageadapter/guangguang/turbo/GGInteractContainerComponent");
        }
    }

    private final void notifyPageURLQueryChange(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe9cd3d", new Object[]{this, map});
            return;
        }
        vgh.c(this, TAG, "通知页面URL参数发生改变，query=" + map);
        if (map.isEmpty()) {
            vgh.c(this, TAG, "通知页面URL参数发生改变，query为空");
            return;
        }
        sff sffVar = this.interactContainer;
        if (sffVar != null) {
            sffVar.j(map);
        } else {
            ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
            throw null;
        }
    }

    @Override // tb.xey
    public boolean handleBack(String str, IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("899b9d92", new Object[]{this, str, triggerType})).booleanValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(triggerType, "triggerType");
        super.handleBack(str, triggerType);
        vgh.c(this, TAG, "处理返回，tabId=" + str + "，triggerType=" + triggerType);
        bvy bvyVar = this.revisitEduDialogGGPageAdapter;
        if (bvyVar != null) {
            return bvyVar.d(str);
        }
        ckf.y("revisitEduDialogGGPageAdapter");
        throw null;
    }

    @Override // com.taobao.android.turbo.core.component.BaseOuterComponent
    public void handleOuterMessage(BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be86f4e7", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "message");
        super.handleOuterMessage(bVar);
        JSONObject b = BaseOuterComponent.b.Companion.b(bVar);
        b3a b3aVar = b3a.INSTANCE;
        jmi jmiVar = this.messageCenter;
        if (jmiVar != null) {
            b3aVar.d(jmiVar, b, null);
            RedpackageAdapter redpackageAdapter = this.redpackageAdapter;
            if (redpackageAdapter != null) {
                redpackageAdapter.m0(bVar);
            } else {
                ckf.y("redpackageAdapter");
                throw null;
            }
        } else {
            ckf.y("messageCenter");
            throw null;
        }
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
        vgh.c(this, TAG, "互动容器组件销毁的时机");
        sff sffVar = this.interactContainer;
        if (sffVar != null) {
            sffVar.g();
            hgf hgfVar = this.interactTabAdapterManager;
            if (hgfVar != null) {
                hgfVar.d();
                yff yffVar = this.interactPageAdapterManager;
                if (yffVar != null) {
                    yffVar.c();
                } else {
                    ckf.y("interactPageAdapterManager");
                    throw null;
                }
            } else {
                ckf.y("interactTabAdapterManager");
                throw null;
            }
        } else {
            ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
            throw null;
        }
    }

    @Override // tb.d1c
    public void onDrawerCreate(DrawerModel drawerModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac7cfc7", new Object[]{this, drawerModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(drawerModel, "drawerData");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        handleOnSubPageCreate(drawerModel, iComponentLifecycle$TriggerType);
    }

    @Override // tb.d1c
    public void onDrawerDestroy(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f6fde0", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, "drawerId");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        handleOnSubPageDestroy(str, iComponentLifecycle$TriggerType);
    }

    @Override // tb.d1c
    public void onDrawerPause(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2664c64", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, "drawerId");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        handleOnSubPagePause(str, iComponentLifecycle$TriggerType);
    }

    @Override // tb.d1c
    public void onDrawerResume(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83677dad", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, "drawerId");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        handleOnSubPageResume(str, iComponentLifecycle$TriggerType);
    }

    @Override // tb.d1c
    public void onDrawerStart(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c104078", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, "drawerId");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
    }

    @Override // tb.d1c
    public void onDrawerStop(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d887738", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, "drawerId");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
    }

    @Override // tb.byd
    public void onTabCreate(TabModel tabModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447fb771", new Object[]{this, tabModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(tabModel, "tabData");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        handleOnSubPageCreate(tabModel, iComponentLifecycle$TriggerType);
    }

    @Override // tb.byd
    public void onTabDestroy(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238822e6", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        handleOnSubPageDestroy(str, iComponentLifecycle$TriggerType);
    }

    @Override // tb.byd
    public void onTabPause(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e8faea", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        handleOnSubPagePause(str, iComponentLifecycle$TriggerType);
    }

    @Override // tb.byd
    public void onTabResume(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13a9fe7", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        handleOnSubPageResume(str, iComponentLifecycle$TriggerType);
    }

    @Override // tb.byd
    public void onTabStart(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e92eefe", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
    }

    @Override // tb.byd
    public void onTabStop(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2452dff2", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
    }

    @Override // tb.k7d
    public void onUrlChanged(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a605d0", new Object[]{this, str, map});
            return;
        }
        ckf.g(str, "newUrl");
        ckf.g(map, "query");
        notifyPageURLQueryChange(map);
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        vgh.c(this, TAG, "创建互动容器组件视图");
        FrameLayout frameLayout = new FrameLayout(getContext());
        sff sffVar = this.interactContainer;
        if (sffVar != null) {
            FrameLayout e = sffVar.e();
            e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(e);
            return frameLayout;
        }
        ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
        throw null;
    }

    public void onCreate(Void r5, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcd9f2", new Object[]{this, r5, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onCreate((GGInteractContainerComponent) r5, iComponentLifecycle$TriggerType);
        vgh.c(this, TAG, "互动容器组件创建的时机");
        createInteractInstance();
        BaseServiceDelegate serviceDelegate = getServiceDelegate();
        if (serviceDelegate != null) {
            kxd kxdVar = (kxd) serviceDelegate;
            notifyPageURLQueryChange(kxdVar.R());
            kxdVar.x(this);
            kxdVar.e(this);
            kxdVar.t(this);
            Map<String, Integer> T = kxdVar.T();
            if (!T.isEmpty()) {
                for (Map.Entry<String, Integer> entry : T.entrySet()) {
                    TabModel X = kxdVar.X(entry.getKey());
                    if (X != null) {
                        moveTab2TargetState(X, entry.getValue().intValue());
                    }
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.base.ITab2ServiceDelegate");
    }

    private final void createInteractInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255f8f0e", new Object[]{this});
            return;
        }
        this.messageCenter = new jmi();
        vv1 vv1Var = new vv1();
        Context context = getContext();
        jmi jmiVar = this.messageCenter;
        if (jmiVar != null) {
            sff sffVar = new sff(context, jmiVar, vv1Var);
            this.interactContainer = sffVar;
            FrameLayout e = sffVar.e();
            Context context2 = getContext();
            jmi jmiVar2 = this.messageCenter;
            if (jmiVar2 != null) {
                BrowserBadge browserBadge = new BrowserBadge(context2, e, jmiVar2, vv1Var);
                sff sffVar2 = this.interactContainer;
                if (sffVar2 != null) {
                    sffVar2.a(browserBadge);
                    Context context3 = getContext();
                    jmi jmiVar3 = this.messageCenter;
                    if (jmiVar3 != null) {
                        RevisitEduDialog revisitEduDialog = new RevisitEduDialog(context3, e, jmiVar3, vv1Var);
                        sff sffVar3 = this.interactContainer;
                        if (sffVar3 != null) {
                            sffVar3.a(revisitEduDialog);
                            Context context4 = getContext();
                            jmi jmiVar4 = this.messageCenter;
                            if (jmiVar4 != null) {
                                H5InteractLayer h5InteractLayer = new H5InteractLayer(context4, e, jmiVar4, vv1Var);
                                sff sffVar4 = this.interactContainer;
                                if (sffVar4 != null) {
                                    sffVar4.b(h5InteractLayer);
                                    yps ypsVar = new yps();
                                    jmi jmiVar5 = this.messageCenter;
                                    if (jmiVar5 != null) {
                                        this.interactTabAdapterManager = new hgf(jmiVar5, ypsVar);
                                        jmi jmiVar6 = this.messageCenter;
                                        if (jmiVar6 != null) {
                                            em2 em2Var = new em2(jmiVar6, vv1Var, ypsVar, browserBadge);
                                            jmi jmiVar7 = this.messageCenter;
                                            if (jmiVar7 != null) {
                                                evy evyVar = new evy(jmiVar7, vv1Var, ypsVar, revisitEduDialog);
                                                jmi jmiVar8 = this.messageCenter;
                                                if (jmiVar8 != null) {
                                                    cpa cpaVar = new cpa(jmiVar8, vv1Var, ypsVar, h5InteractLayer);
                                                    Context context5 = getContext();
                                                    BaseServiceDelegate serviceDelegate = getServiceDelegate();
                                                    if (serviceDelegate != null) {
                                                        kxd kxdVar = (kxd) serviceDelegate;
                                                        jmi jmiVar9 = this.messageCenter;
                                                        if (jmiVar9 != null) {
                                                            this.redpackageAdapter = new RedpackageAdapter(context5, kxdVar, jmiVar9, vv1Var, ypsVar);
                                                            hgf hgfVar = this.interactTabAdapterManager;
                                                            if (hgfVar != null) {
                                                                hgfVar.a(em2Var);
                                                                hgf hgfVar2 = this.interactTabAdapterManager;
                                                                if (hgfVar2 != null) {
                                                                    hgfVar2.a(evyVar);
                                                                    hgf hgfVar3 = this.interactTabAdapterManager;
                                                                    if (hgfVar3 != null) {
                                                                        hgfVar3.a(cpaVar);
                                                                        hgf hgfVar4 = this.interactTabAdapterManager;
                                                                        if (hgfVar4 != null) {
                                                                            RedpackageAdapter redpackageAdapter = this.redpackageAdapter;
                                                                            if (redpackageAdapter != null) {
                                                                                hgfVar4.a(redpackageAdapter);
                                                                                fll fllVar = new fll();
                                                                                jmi jmiVar10 = this.messageCenter;
                                                                                if (jmiVar10 != null) {
                                                                                    this.interactPageAdapterManager = new yff(jmiVar10, fllVar);
                                                                                    jmi jmiVar11 = this.messageCenter;
                                                                                    if (jmiVar11 != null) {
                                                                                        this.revisitEduDialogGGPageAdapter = new bvy(jmiVar11, vv1Var, fllVar, revisitEduDialog);
                                                                                        jmi jmiVar12 = this.messageCenter;
                                                                                        if (jmiVar12 != null) {
                                                                                            bpa bpaVar = new bpa(jmiVar12, vv1Var, fllVar, h5InteractLayer);
                                                                                            yff yffVar = this.interactPageAdapterManager;
                                                                                            if (yffVar != null) {
                                                                                                bvy bvyVar = this.revisitEduDialogGGPageAdapter;
                                                                                                if (bvyVar != null) {
                                                                                                    yffVar.a(bvyVar);
                                                                                                    yff yffVar2 = this.interactPageAdapterManager;
                                                                                                    if (yffVar2 != null) {
                                                                                                        yffVar2.a(bpaVar);
                                                                                                        JSONObject jSONObject = new JSONObject();
                                                                                                        jSONObject.put((JSONObject) sj4.TAB2_NATIVE, (String) Boolean.TRUE);
                                                                                                        h5InteractLayer.n1(jSONObject);
                                                                                                        hgf hgfVar5 = this.interactTabAdapterManager;
                                                                                                        if (hgfVar5 != null) {
                                                                                                            hgfVar5.c();
                                                                                                            yff yffVar3 = this.interactPageAdapterManager;
                                                                                                            if (yffVar3 != null) {
                                                                                                                BaseServiceDelegate serviceDelegate2 = getServiceDelegate();
                                                                                                                if (serviceDelegate2 != null) {
                                                                                                                    yffVar3.b((kxd) serviceDelegate2);
                                                                                                                    sff sffVar5 = this.interactContainer;
                                                                                                                    if (sffVar5 != null) {
                                                                                                                        sffVar5.f();
                                                                                                                    } else {
                                                                                                                        ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.base.ITab2ServiceDelegate");
                                                                                                                }
                                                                                                            } else {
                                                                                                                ckf.y("interactPageAdapterManager");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            ckf.y("interactTabAdapterManager");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        ckf.y("interactPageAdapterManager");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    ckf.y("revisitEduDialogGGPageAdapter");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                ckf.y("interactPageAdapterManager");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            ckf.y("messageCenter");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        ckf.y("messageCenter");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    ckf.y("messageCenter");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                ckf.y("redpackageAdapter");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            ckf.y("interactTabAdapterManager");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        ckf.y("interactTabAdapterManager");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    ckf.y("interactTabAdapterManager");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                ckf.y("interactTabAdapterManager");
                                                                throw null;
                                                            }
                                                        } else {
                                                            ckf.y("messageCenter");
                                                            throw null;
                                                        }
                                                    } else {
                                                        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.base.ITab2ServiceDelegate");
                                                    }
                                                } else {
                                                    ckf.y("messageCenter");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("messageCenter");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y("messageCenter");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("messageCenter");
                                        throw null;
                                    }
                                } else {
                                    ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
                                    throw null;
                                }
                            } else {
                                ckf.y("messageCenter");
                                throw null;
                            }
                        } else {
                            ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
                            throw null;
                        }
                    } else {
                        ckf.y("messageCenter");
                        throw null;
                    }
                } else {
                    ckf.y(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
                    throw null;
                }
            } else {
                ckf.y("messageCenter");
                throw null;
            }
        } else {
            ckf.y("messageCenter");
            throw null;
        }
    }

    private final void moveTab2TargetState(TabModel tabModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95db2fd9", new Object[]{this, tabModel, new Integer(i)});
            return;
        }
        vgh.c(this, TAG, "移动Tab到指定状态时，tabModel=" + tabModel + ", state=" + i);
        if (i == 0) {
            onTabCreate(tabModel, IComponentLifecycle$TriggerType.TAB_SELECT);
        } else if (i == 1) {
            onTabCreate(tabModel, IComponentLifecycle$TriggerType.TAB_SELECT);
            onTabStart(tabModel.getId(), IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
        } else if (i == 2) {
            onTabCreate(tabModel, IComponentLifecycle$TriggerType.TAB_SELECT);
            String id = tabModel.getId();
            IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE;
            onTabStart(id, iComponentLifecycle$TriggerType);
            onTabResume(tabModel.getId(), iComponentLifecycle$TriggerType);
        } else if (i == 3) {
            onTabCreate(tabModel, IComponentLifecycle$TriggerType.TAB_SELECT);
            String id2 = tabModel.getId();
            IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType2 = IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE;
            onTabStart(id2, iComponentLifecycle$TriggerType2);
            onTabResume(tabModel.getId(), iComponentLifecycle$TriggerType2);
            onTabPause(tabModel.getId(), iComponentLifecycle$TriggerType2);
        } else if (i != 4) {
            vgh.c(this, TAG, "移动Tab到指定状态时，state=" + i);
        } else {
            onTabCreate(tabModel, IComponentLifecycle$TriggerType.TAB_SELECT);
            String id3 = tabModel.getId();
            IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType3 = IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE;
            onTabStart(id3, iComponentLifecycle$TriggerType3);
            onTabResume(tabModel.getId(), iComponentLifecycle$TriggerType3);
            onTabPause(tabModel.getId(), iComponentLifecycle$TriggerType3);
            onTabStop(tabModel.getId(), iComponentLifecycle$TriggerType3);
        }
    }
}
