package com.taobao.oversea.homepage.litetao.service.biz.sceneservice;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import tb.bpj;
import tb.cfc;
import tb.dct;
import tb.dzc;
import tb.e8e;
import tb.hed;
import tb.hng;
import tb.l69;
import tb.pgt;
import tb.rgc;
import tb.rvg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LiteTaoSceneService extends SceneServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_BIZ_TYPE = "HomeTaoTe";
    private static final String TAG = "LiteTaoSceneService";
    private Context context;
    private cfc mInfoFlowContext;
    private rvg mLiteTaoPullDownRefreshInvoker;
    private e8e mUtInvoker;
    private bpj naviBarInvoker;
    private FrameLayout rootView;
    private View taoteView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IDxItemRenderService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(LiteTaoSceneService liteTaoSceneService) {
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.a
        public void a(DinamicXEngine dinamicXEngine) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed34c11a", new Object[]{this, dinamicXEngine});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IItemRenderService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cfc f11431a;

        public b(LiteTaoSceneService liteTaoSceneService, cfc cfcVar) {
            this.f11431a = cfcVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IItemRenderService.a
        public rgc a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rgc) ipChange.ipc$dispatch("4d5593c6", new Object[]{this, str});
            }
            if ("error".equals(str)) {
                return new pgt(this.f11431a);
            }
            return null;
        }
    }

    private View createTaoTeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("417bdd65", new Object[]{this});
        }
        return ((IContainerService) this.mInfoFlowContext.a(IContainerService.class)).createContainer(this.context);
    }

    private void initBiz(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c30016", new Object[]{this, cfcVar});
            return;
        }
        initMainFeedsConfig(cfcVar);
        initDxRegister(cfcVar);
        initRegisterItemRenderFactory(cfcVar);
        initLifeCycleListener(cfcVar);
    }

    private void initDxRegister(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafe72f2", new Object[]{this, cfcVar});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) cfcVar.a(IDxItemRenderService.class);
        if (iDxItemRenderService != null) {
            iDxItemRenderService.setDxEngineConfigBuilder(new DXEngineConfig.b(DX_BIZ_TYPE));
            iDxItemRenderService.setOnDxRegisterListener(new a(this));
        }
    }

    private void initLifeCycleListener(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c771752b", new Object[]{this, cfcVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            hng hngVar = new hng(cfcVar);
            iMainLifecycleService.getPageLifeCycleRegister().a(hngVar);
            iMainLifecycleService.getTabLifeCycleRegister().a(hngVar);
        }
    }

    private void initMainFeedsConfig(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed66748b", new Object[]{this, cfcVar});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.setInitConfig(new l69.b().e(-1).d());
        }
    }

    private void initRegisterItemRenderFactory(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f908596b", new Object[]{this, cfcVar});
        } else {
            ((IItemRenderService) cfcVar.a(IItemRenderService.class)).setItemRenderFactory(new b(this, cfcVar));
        }
    }

    public static /* synthetic */ Object ipc$super(LiteTaoSceneService liteTaoSceneService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 151698896) {
            super.onPageSelected();
            return null;
        } else if (hashCode == 178259487) {
            super.onCreateService((cfc) objArr[0]);
            return null;
        } else if (hashCode == 1997193377) {
            super.onDestroyService();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/oversea/homepage/litetao/service/biz/sceneservice/LiteTaoSceneService");
        }
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.context = context;
        if (this.rootView == null) {
            this.rootView = new FrameLayout(context);
        }
        return this.rootView;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public dzc getNaviBarInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dzc) ipChange.ipc$dispatch("93ccde42", new Object[]{this});
        }
        bpj bpjVar = this.naviBarInvoker;
        if (bpjVar == null) {
            return new bpj(this.mInfoFlowContext);
        }
        return bpjVar;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public hed getPullDownRefreshInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hed) ipChange.ipc$dispatch("64e92110", new Object[]{this});
        }
        if (this.mLiteTaoPullDownRefreshInvoker == null) {
            this.mLiteTaoPullDownRefreshInvoker = new rvg(this.mInfoFlowContext);
        }
        return this.mLiteTaoPullDownRefreshInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public e8e getUtInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e8e) ipChange.ipc$dispatch("fb13fc2e", new Object[]{this});
        }
        if (this.mUtInvoker == null) {
            this.mUtInvoker = new dct(this.mInfoFlowContext);
        }
        return this.mUtInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        super.onCreateService(cfcVar);
        this.mInfoFlowContext = cfcVar;
        initBiz(cfcVar);
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            super.onDestroyService();
        }
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.zxd
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        super.onPageSelected();
        if (this.taoteView == null) {
            View createTaoTeView = createTaoTeView();
            this.taoteView = createTaoTeView;
            this.rootView.addView(createTaoTeView);
        }
    }
}
