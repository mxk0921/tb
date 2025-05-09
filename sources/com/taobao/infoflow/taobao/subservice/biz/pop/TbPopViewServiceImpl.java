package com.taobao.infoflow.taobao.subservice.biz.pop;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.event.IPopMessageListener;
import com.taobao.homepage.pop.protocol.event.IPopViewEventListener;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import java.util.Map;
import java.util.WeakHashMap;
import tb.azh;
import tb.ba1;
import tb.bew;
import tb.cew;
import tb.cfc;
import tb.e3b;
import tb.ebd;
import tb.efx;
import tb.f5n;
import tb.fve;
import tb.get;
import tb.gj7;
import tb.iqb;
import tb.ldm;
import tb.mim;
import tb.phg;
import tb.rfm;
import tb.s7x;
import tb.t2o;
import tb.tgm;
import tb.vfm;
import tb.vxl;
import tb.xm4;
import tb.ytq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TbPopViewServiceImpl implements IPopViewService, IFoldDeviceAndPadService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PopViewServiceImpl ";
    private IFoldDeviceAndPadService mFoldAndPadService;
    private final ba1 mFullScreenInvoker;
    private cfc mInfoFlowContext;
    private boolean mIsPortrait;
    private final azh mMainInvoker;
    private ldm mPopBridgeRegister;
    private final e3b mPopEngine;
    private mim mPopViewUpdateProcess;
    private f5n mPullSecondAnimationProcess;
    private final ytq mSubInvoker;
    private final efx mWindowInvoker;
    private final xm4 containerLifecycleRegister = new xm4();
    private final rfm mLifeCycleRegister = new rfm();
    private Map<IPopViewService.b, IPopViewEventListener> eventListenerMap = new WeakHashMap(32);
    private Map<IPopViewService.a, IPopMessageListener> messageListenerMap = new WeakHashMap(32);
    private Map<IPopViewService.c, ebd> mViewUpdateListenerMap = new WeakHashMap(32);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f10779a;

        public a(Context context) {
            this.f10779a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TbPopViewServiceImpl.access$000(TbPopViewServiceImpl.this, this.f10779a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f10780a;

        public b(Context context) {
            this.f10780a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TbPopViewServiceImpl.access$000(TbPopViewServiceImpl.this, this.f10780a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IPopViewEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(TbPopViewServiceImpl tbPopViewServiceImpl, IPopViewService.b bVar) {
        }

        @Override // com.taobao.homepage.pop.protocol.event.IPopViewEventListener
        public void onEvent(int i, IPopData iPopData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b090649f", new Object[]{this, new Integer(i), iPopData});
                return;
            }
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements IPopMessageListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IPopViewService.a f10781a;

        public d(TbPopViewServiceImpl tbPopViewServiceImpl, IPopViewService.a aVar) {
            this.f10781a = aVar;
        }

        @Override // com.taobao.homepage.pop.protocol.event.IPopMessageListener
        public void onMessage(String str, IPopData iPopData, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9b3eda9", new Object[]{this, str, iPopData, jSONObject});
            } else {
                this.f10781a.a(str, iPopData, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements ebd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IPopViewService.c f10782a;

        public e(TbPopViewServiceImpl tbPopViewServiceImpl, IPopViewService.c cVar) {
            this.f10782a = cVar;
        }

        @Override // tb.ebd
        public void a(View view, IPopData<?> iPopData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62ee8b5e", new Object[]{this, view, iPopData});
            } else if (iPopData != null) {
                this.f10782a.b(iPopData.getBusinessID());
            }
        }

        @Override // tb.ebd
        public void b(View view, IPopData<?> iPopData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ff2023e", new Object[]{this, view, iPopData});
            } else if (iPopData != null) {
                this.f10782a.a(iPopData.getBusinessID());
            }
        }
    }

    static {
        t2o.a(491782566);
        t2o.a(488636579);
        t2o.a(488636565);
    }

    public TbPopViewServiceImpl() {
        ba1 ba1Var = new ba1();
        this.mFullScreenInvoker = ba1Var;
        efx efxVar = new efx();
        this.mWindowInvoker = efxVar;
        azh azhVar = new azh();
        this.mMainInvoker = azhVar;
        ytq ytqVar = new ytq();
        this.mSubInvoker = ytqVar;
        phg.i("HomePopEngine");
        this.mPopEngine = new e3b(ba1Var, efxVar, azhVar, ytqVar);
        phg.h("HomePopEngine");
    }

    public static /* synthetic */ void access$000(TbPopViewServiceImpl tbPopViewServiceImpl, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c09482", new Object[]{tbPopViewServiceImpl, context});
        } else {
            tbPopViewServiceImpl.checkInitPop(context);
        }
    }

    private void checkInitPop(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c456c8", new Object[]{this, context});
            return;
        }
        Context realActivityContext = getRealActivityContext(context);
        if (realActivityContext != null) {
            fve.e(TAG, "createContainerInPreRender activity not null");
            this.mWindowInvoker.m(realActivityContext);
            this.mPopEngine.j().j((Activity) realActivityContext);
            return;
        }
        get.a().f(new b(context), 0L);
    }

    private Context getRealActivityContext(Context context) {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("240efdad", new Object[]{this, context});
        }
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof bew) {
            context2 = ((bew) context).b();
        } else if (context instanceof cew) {
            context2 = ((cew) context).a();
        } else {
            fve.e(TAG, "getRealActivityContext in else, activityContext is null");
            context2 = null;
        }
        if (context2 instanceof Activity) {
            return context2;
        }
        return null;
    }

    private void registerOnScreenChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a22299", new Object[]{this});
            return;
        }
        IFoldDeviceAndPadService iFoldDeviceAndPadService = this.mFoldAndPadService;
        if (iFoldDeviceAndPadService != null) {
            iFoldDeviceAndPadService.addOnScreenChangeListener(this);
        }
    }

    private void unRegisterOnScreenChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b0c712", new Object[]{this});
            return;
        }
        IFoldDeviceAndPadService iFoldDeviceAndPadService = this.mFoldAndPadService;
        if (iFoldDeviceAndPadService != null) {
            iFoldDeviceAndPadService.removeOnScreenChangeListener(this);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void addOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c63cf3", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.a(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void addPopEventListener(IPopViewService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd57068", new Object[]{this, bVar});
        } else if (bVar != null) {
            c cVar = new c(this, bVar);
            this.eventListenerMap.put(bVar, cVar);
            this.mPopEngine.a(cVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void addPopMessageListener(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f653ef49", new Object[]{this, aVar});
        } else if (aVar != null) {
            d dVar = new d(this, aVar);
            this.messageListenerMap.put(aVar, dVar);
            this.mPopEngine.b(dVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void addPopViewUpdateListener(IPopViewService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d55b51", new Object[]{this, cVar});
        } else if (cVar != null) {
            e eVar = new e(this, cVar);
            this.mViewUpdateListenerMap.put(cVar, eVar);
            this.mPopEngine.c(eVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService, tb.iqb
    public ViewGroup createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1c667639", new Object[]{this, context});
        }
        if (vxl.b().u()) {
            return createContainerInPreRender(context);
        }
        return createContainerDefault(context);
    }

    public ViewGroup createContainerDefault(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cc49dd70", new Object[]{this, context});
        }
        vfm.f(TAG, "createContainer, hashCode=" + hashCode());
        if (!(context instanceof Activity)) {
            vfm.f(TAG, "pop engine onCreate failed, context not activity");
            return null;
        }
        this.mWindowInvoker.m(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.mSubInvoker.q(frameLayout);
        this.mPopEngine.j().j((Activity) context);
        this.mLifeCycleRegister.c(this.mInfoFlowContext, this.mPopEngine);
        this.mPopBridgeRegister.b(this.mPopEngine);
        this.mIsPortrait = gj7.c(context);
        return frameLayout;
    }

    public ViewGroup createContainerInPreRender(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("61f924a3", new Object[]{this, context});
        }
        vfm.f(TAG, "createContainerInPreRender, hashCode=" + hashCode());
        FrameLayout frameLayout = new FrameLayout(context);
        this.mSubInvoker.q(frameLayout);
        get.a().h(new a(context));
        this.mLifeCycleRegister.c(this.mInfoFlowContext, this.mPopEngine);
        this.mPopBridgeRegister.b(this.mPopEngine);
        this.mIsPortrait = gj7.c(context);
        return frameLayout;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService, tb.iqb
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        vfm.f(TAG, "destroyContainer, hashCode=" + hashCode());
        this.mPopBridgeRegister.c();
        this.mPopEngine.j().l();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public JSONObject getPopDataByBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7a727928", new Object[]{this, str});
        }
        IPopData i = this.mPopEngine.i(str);
        if (i instanceof JSONObject) {
            return (JSONObject) i;
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public boolean isPopViewOnScreen(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ff156ac", new Object[]{this, str})).booleanValue();
        }
        mim mimVar = this.mPopViewUpdateProcess;
        if (mimVar == null) {
            return false;
        }
        return mimVar.e(str);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        vfm.f(TAG, "onDestroyService, hashCode=" + hashCode());
        this.mLifeCycleRegister.a(this.mPopEngine);
        this.mPopEngine.j().l();
        f5n f5nVar = this.mPullSecondAnimationProcess;
        if (f5nVar != null) {
            f5nVar.f();
        }
        mim mimVar = this.mPopViewUpdateProcess;
        if (mimVar != null) {
            mimVar.c();
        }
        unRegisterOnScreenChangeListener();
        ytq ytqVar = this.mSubInvoker;
        if (ytqVar != null) {
            ytqVar.o();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void onIconScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73803697", new Object[]{this, new Integer(i)});
        } else {
            this.mPopEngine.j().n(i);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void onPopTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c7b785", new Object[]{this});
        } else {
            this.mPopEngine.j().o(3);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void onPopTabUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf130ffe", new Object[]{this});
        } else {
            this.mPopEngine.j().p(3);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService.a
    public void onScreenChanged(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86b3b90", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (gj7.a() && z2 && z != this.mIsPortrait) {
            this.mPopEngine.j().w();
            this.mIsPortrait = z;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void removeOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb950956", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.f(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void removePopEventListener(IPopViewService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acea83e5", new Object[]{this, bVar});
        } else if (bVar != null) {
            this.mPopEngine.r(this.eventListenerMap.remove(bVar));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void removePopMessageListener(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156902c6", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.mPopEngine.s(this.messageListenerMap.remove(aVar));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void removePopViewUpdateListener(IPopViewService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfb1d0e", new Object[]{this, cVar});
        } else if (cVar != null) {
            this.mPopEngine.t(this.mViewUpdateListenerMap.remove(cVar));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void triggerPopEvent(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63834865", new Object[]{this, new Integer(i), str});
        } else {
            this.mPopEngine.v(i, str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void triggerPopRemove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2cf362e", new Object[]{this, str});
        } else {
            this.mPopEngine.x(str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void triggerPopShow(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a047d50", new Object[]{this, new Integer(i), str});
        } else {
            this.mPopEngine.y(i, str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void triggerPopShowByCustomData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9661dea1", new Object[]{this, jSONObject});
            return;
        }
        IPopData<PopSectionModel> a2 = tgm.a(jSONObject);
        if (a2 != null) {
            this.mPopEngine.z(a2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void triggerPopShowWithDataReset(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d36dd", new Object[]{this, new Integer(i), str});
        } else {
            this.mPopEngine.B(i, str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        vfm.f(TAG, "onCreateService, hashCode=" + hashCode());
        this.mInfoFlowContext = cfcVar;
        this.mMainInvoker.m(cfcVar);
        this.mSubInvoker.p(cfcVar);
        this.mWindowInvoker.n(cfcVar);
        this.mPopBridgeRegister = new ldm(this.mInfoFlowContext);
        this.mPopEngine.q(2, s7x.class);
        this.mPullSecondAnimationProcess = new f5n(cfcVar, this.mPopEngine);
        this.mPopViewUpdateProcess = new mim(cfcVar);
        this.mFoldAndPadService = (IFoldDeviceAndPadService) cfcVar.a(IFoldDeviceAndPadService.class);
        registerOnScreenChangeListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public boolean triggerPopShowByPopData(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8372266", new Object[]{this, new Integer(i), jSONObject})).booleanValue();
        }
        IPopData<PopSectionModel> a2 = tgm.a(jSONObject);
        if (a2 != null && a2.valid()) {
            return this.mPopEngine.A(i, a2);
        }
        vfm.f(TAG, "triggerPopShowByPopData data inValid");
        return false;
    }
}
