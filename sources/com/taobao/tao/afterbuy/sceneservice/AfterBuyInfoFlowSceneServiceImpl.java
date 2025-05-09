package com.taobao.tao.afterbuy.sceneservice;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import tb.cfc;
import tb.dvb;
import tb.e8e;
import tb.fve;
import tb.h06;
import tb.iht;
import tb.mvv;
import tb.oza;
import tb.s66;
import tb.t2o;
import tb.zn4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AfterBuyInfoFlowSceneServiceImpl extends SceneServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GLOBAL_THEME_BIZ_NAME = "homepage";
    private static final String TAG = "HomeMainLandInfoFlowSceneService";
    private cfc infoFlowContext;
    private mvv utInvoker;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements IDxItemRenderService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cfc f11894a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.afterbuy.sceneservice.AfterBuyInfoFlowSceneServiceImpl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0671a implements dvb {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0671a(a aVar) {
            }

            @Override // tb.dvb
            public /* synthetic */ boolean a() {
                return false;
            }

            @Override // tb.dvb
            public boolean b(Context context) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a0472965", new Object[]{this, context})).booleanValue();
                }
                return oza.a(context);
            }

            @Override // tb.dvb
            public int c(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("b7653c70", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
                }
                return i2;
            }

            @Override // tb.dvb
            public void disableForceDark(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ecef35d2", new Object[]{this, view});
                }
            }
        }

        public a(AfterBuyInfoFlowSceneServiceImpl afterBuyInfoFlowSceneServiceImpl, cfc cfcVar) {
            this.f11894a = cfcVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.a
        public void a(DinamicXEngine dinamicXEngine) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed34c11a", new Object[]{this, dinamicXEngine});
                return;
            }
            iht.b(dinamicXEngine, this.f11894a);
            dinamicXEngine.W0(h06.DX_EVENT_HWEBVIEWPREREQUEST, new h06());
            dinamicXEngine.W0(s66.DX_EVENT_OPENRECSKU, new s66());
            dinamicXEngine.O0(new C0671a(this));
        }
    }

    static {
        t2o.a(729809245);
    }

    private void initBiz(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c30016", new Object[]{this, cfcVar});
            return;
        }
        initDxCustomRegister(cfcVar);
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
            if (zn4.c(cfcVar.getContainerType().getContainerId())) {
                iDxItemRenderService.setDxEngineConfigBuilder(new DXEngineConfig.b("dressUpInfoFlow"));
            }
            iDxItemRenderService.setOnDxRegisterListener(new a(this, cfcVar));
        }
    }

    public static /* synthetic */ Object ipc$super(AfterBuyInfoFlowSceneServiceImpl afterBuyInfoFlowSceneServiceImpl, String str, Object... objArr) {
        if (str.hashCode() == 178259487) {
            super.onCreateService((cfc) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/afterbuy/sceneservice/AfterBuyInfoFlowSceneServiceImpl");
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        fve.e(ISceneService.SERVICE_NAME, "createView");
        IContainerService iContainerService = (IContainerService) this.infoFlowContext.a(IContainerService.class);
        if (iContainerService != null) {
            return iContainerService.createContainer(context);
        }
        throw new IllegalArgumentException("SceneService, createView containerService is null");
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
