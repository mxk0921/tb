package com.taobao.tao.infoflow.scene.homemainland.subservice;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import tb.cfc;
import tb.dt8;
import tb.dzc;
import tb.e8e;
import tb.f18;
import tb.hed;
import tb.j18;
import tb.mvv;
import tb.s4u;
import tb.t2o;
import tb.vxl;
import tb.x4n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HomeMainLandInfoFlowSceneService extends SceneServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GLOBAL_THEME_BIZ_NAME = "homepage";
    private static final String TAG = "HomeMainLandInfoFlowSceneService";
    private cfc infoFlowContext;
    private dzc naviBarInvoker;
    private x4n pullDownRefreshInvoker;
    private mvv utInvoker;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements IDxItemRenderService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cfc f12491a;

        public a(HomeMainLandInfoFlowSceneService homeMainLandInfoFlowSceneService, cfc cfcVar) {
            this.f12491a = cfcVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.a
        public void a(DinamicXEngine dinamicXEngine) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed34c11a", new Object[]{this, dinamicXEngine});
            } else {
                dt8.a(dinamicXEngine, this.f12491a);
            }
        }
    }

    static {
        t2o.a(729809614);
    }

    private void initBiz(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c30016", new Object[]{this, cfcVar});
            return;
        }
        if (vxl.b().M()) {
            DinamicXEngine f = f18.f(j18.HOMEPAGE_DX_MODULE);
            if (f != null) {
                dt8.a(f, cfcVar);
            } else {
                initDxCustomRegister(cfcVar);
            }
        } else {
            initDxCustomRegister(cfcVar);
        }
        IThemeService iThemeService = (IThemeService) cfcVar.a(IThemeService.class);
        if (iThemeService != null) {
            iThemeService.setEnableCreateGlobalTheme("homepage");
        }
    }

    private void initDxCustomRegister(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ba0fc1", new Object[]{this, cfcVar});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) cfcVar.a(IDxItemRenderService.class);
        if (iDxItemRenderService != null) {
            iDxItemRenderService.setOnDxRegisterListener(new a(this, cfcVar));
        }
    }

    public static /* synthetic */ Object ipc$super(HomeMainLandInfoFlowSceneService homeMainLandInfoFlowSceneService, String str, Object... objArr) {
        if (str.hashCode() == 178259487) {
            super.onCreateService((cfc) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/scene/homemainland/subservice/HomeMainLandInfoFlowSceneService");
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public dzc getNaviBarInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dzc) ipChange.ipc$dispatch("93ccde42", new Object[]{this});
        }
        if (this.naviBarInvoker == null) {
            this.naviBarInvoker = new s4u(this.infoFlowContext);
        }
        return this.naviBarInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public hed getPullDownRefreshInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hed) ipChange.ipc$dispatch("64e92110", new Object[]{this});
        }
        if (this.pullDownRefreshInvoker == null) {
            this.pullDownRefreshInvoker = new x4n(this.infoFlowContext);
        }
        return this.pullDownRefreshInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public e8e getUtInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e8e) ipChange.ipc$dispatch("fb13fc2e", new Object[]{this});
        }
        if (this.utInvoker == null) {
            this.utInvoker = new mvv(this.infoFlowContext);
        }
        return this.utInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        super.onCreateService(cfcVar);
        this.infoFlowContext = cfcVar;
        initBiz(cfcVar);
    }
}
