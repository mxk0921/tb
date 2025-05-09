package com.taobao.oversea.homepage.recommend.service.scene;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import com.taobao.oversea.baobao.BaobaoManager;
import com.taobao.oversea.baobao.view.DXProgress;
import com.taobao.tao.log.TLog;
import tb.cfc;
import tb.cy5;
import tb.e8e;
import tb.ep5;
import tb.ezt;
import tb.fqa;
import tb.fzt;
import tb.h5b;
import tb.h86;
import tb.hed;
import tb.hzt;
import tb.iht;
import tb.ix9;
import tb.jm5;
import tb.qno;
import tb.rz5;
import tb.s66;
import tb.sgl;
import tb.sve;
import tb.vcq;
import tb.vl5;
import tb.xcq;
import tb.xl5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TmgRecSceneService extends SceneServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_BIZ_TYPE = "HomeRec";
    private Context mContext;
    private cfc mInfoFlowContext;
    private e8e mUtInvoker;
    private ezt pullDownRefreshInvoker;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IDxItemRenderService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TmgRecSceneService tmgRecSceneService) {
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.a
        public void a(DinamicXEngine dinamicXEngine) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed34c11a", new Object[]{this, dinamicXEngine});
                return;
            }
            sgl.a(dinamicXEngine);
            iht.a(dinamicXEngine);
            dinamicXEngine.V0(jm5.DX_PARSER_HLOGIN, new jm5());
            dinamicXEngine.V0(ep5.DX_PARSER_PLUSRENDERBUCKET, new ep5());
            dinamicXEngine.W0(s66.DX_EVENT_OPENRECSKU, new s66());
            dinamicXEngine.V0(vl5.DX_PARSER_HGETDATA, new vl5());
            dinamicXEngine.W0(fqa.DX_EVENT_HSAVEDATA, new fqa());
            dinamicXEngine.W0(h86.DX_EVENT_POSTHEIGHTANIM, new h86());
            dinamicXEngine.W0(cy5.DX_EVENT_GATEWAYREQUEST, new cy5());
            h5b.e().d().V0(xl5.DX_PARSER_HGETFROMSTATICCACHE, new xl5());
            h5b.e().d().W0(rz5.DX_EVENT_HSETTOSTATICCACHE, new rz5());
            dinamicXEngine.e1(DXProgress.DXTMGBAOBAOPROGRESS_TMGBAOBAOPROGRESS, new DXProgress());
            try {
                BaobaoManager.getInstance().init();
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            try {
                TmgRecSceneService tmgRecSceneService = TmgRecSceneService.this;
                TmgRecSceneService.access$200(tmgRecSceneService, TmgRecSceneService.access$100(tmgRecSceneService));
                hzt.c();
                TmgRecSceneService.access$300(TmgRecSceneService.this);
            } catch (Exception e) {
                TLog.loge("TmgRecSceneService", "doAtIdle", e);
            }
            return false;
        }
    }

    public static /* synthetic */ void access$000(TmgRecSceneService tmgRecSceneService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c51491", new Object[]{tmgRecSceneService});
        } else {
            tmgRecSceneService.forceRefresh();
        }
    }

    public static /* synthetic */ cfc access$100(TmgRecSceneService tmgRecSceneService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("4c37f702", new Object[]{tmgRecSceneService});
        }
        return tmgRecSceneService.mInfoFlowContext;
    }

    public static /* synthetic */ void access$200(TmgRecSceneService tmgRecSceneService, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3b4cd", new Object[]{tmgRecSceneService, cfcVar});
        } else {
            tmgRecSceneService.initBroadcastListener(cfcVar);
        }
    }

    public static /* synthetic */ boolean access$300(TmgRecSceneService tmgRecSceneService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a3fbb58", new Object[]{tmgRecSceneService})).booleanValue();
        }
        return tmgRecSceneService.checkRemoteModuleIsInstalled();
    }

    private boolean checkRemoteModuleIsInstalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0512f21", new Object[]{this})).booleanValue();
        }
        vcq.a(this.mContext).c(xcq.c().j(ix9.h(this.mContext, "com.taobao.android.tmgdelivery.TMGDeliveryPurchaseFragment").a()).j(ix9.h(this.mContext, "com.taobao.oversea.live.homepage.ContainerFragment").a()).n());
        return true;
    }

    private void doAtIdle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4b3e99", new Object[]{this});
        } else {
            Looper.myQueue().addIdleHandler(new b());
        }
    }

    private void forceRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16dddf7", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            iContainerDataService.triggerEvent("PullToRefresh", null, new sve("PullToRefresh" + SystemClock.uptimeMillis()));
        }
    }

    private void initBroadcastListener(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c06d54", new Object[]{this, cfcVar});
        } else {
            LocalBroadcastManager.getInstance(this.mContext).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.oversea.homepage.recommend.service.scene.TmgRecSceneService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/recommend/service/scene/TmgRecSceneService$2");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else {
                        TmgRecSceneService.access$000(TmgRecSceneService.this);
                    }
                }
            }, new IntentFilter("CURRENCY_CHANGE"));
        }
    }

    private void initDxRegister(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafe72f2", new Object[]{this, cfcVar});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) cfcVar.a(IDxItemRenderService.class);
        if (iDxItemRenderService != null) {
            iDxItemRenderService.setOnDxRegisterListener(new a(this));
            iDxItemRenderService.setDxEngineConfigBuilder(new DXEngineConfig.b(DX_BIZ_TYPE));
        }
    }

    public static /* synthetic */ Object ipc$super(TmgRecSceneService tmgRecSceneService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 178259487) {
            super.onCreateService((cfc) objArr[0]);
            return null;
        } else if (hashCode == 2040710978) {
            return super.createView((Context) objArr[0]);
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/oversea/homepage/recommend/service/scene/TmgRecSceneService");
        }
    }

    private void requestIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c81efe49", new Object[]{this});
        } else if (qno.a("isOvsFirstStart", true)) {
            forceRefresh();
            qno.c("isOvsFirstStart", false);
        }
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.mContext = context;
        try {
            requestIfNeed();
            doAtIdle();
        } catch (Exception unused) {
        }
        return super.createView(context);
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public hed getPullDownRefreshInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hed) ipChange.ipc$dispatch("64e92110", new Object[]{this});
        }
        if (this.pullDownRefreshInvoker == null) {
            this.pullDownRefreshInvoker = new ezt(this.mInfoFlowContext);
        }
        return this.pullDownRefreshInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public e8e getUtInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e8e) ipChange.ipc$dispatch("fb13fc2e", new Object[]{this});
        }
        if (this.mUtInvoker == null) {
            this.mUtInvoker = new fzt(this.mInfoFlowContext);
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
        initDxRegister(cfcVar);
        IThemeService iThemeService = (IThemeService) cfcVar.a(IThemeService.class);
        if (iThemeService != null) {
            iThemeService.setEnableCreateGlobalTheme("homepagehtao");
        }
    }
}
