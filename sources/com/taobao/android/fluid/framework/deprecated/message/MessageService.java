package com.taobao.android.fluid.framework.deprecated.message;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import java.util.HashMap;
import tb.aca;
import tb.c7c;
import tb.csp;
import tb.hmi;
import tb.htc;
import tb.kpi;
import tb.lr9;
import tb.ncp;
import tb.o6d;
import tb.ood;
import tb.t2o;
import tb.uq9;
import tb.vrp;
import tb.wmi;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MessageService implements IMessageService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IMessageService";
    private static final String TAG = "MessageService";
    private aca globalNativeMessageHandler;
    private final FluidContext mFluidContext;
    private ILifecycleService mILifecycleService;
    private hmi mMessageCenter;
    private final kpi mMessageListenerManager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements c7c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.c7c
        public void onFirstCardRenderFailed(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb19bec", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.c7c
        public void onFirstCardRenderSuccess(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2639cf64", new Object[]{this, uq9Var});
            } else {
                ((IMessageService) MessageService.access$000(MessageService.this).getService(IMessageService.class)).sendMessage(new vrp(csp.FIRST_FRAME_RENDER_FINISH_NAME, "-1", null));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends o6d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/deprecated/message/MessageService$2");
        }

        @Override // tb.o6d.a, tb.o6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            } else {
                MessageService.access$100(MessageService.this).d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ood {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.ood
        public void onServerConfigChanged(ncp ncpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23d4bb4", new Object[]{this, ncpVar});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("options", wmi.b(MessageService.access$000(MessageService.this), null));
            ((IMessageService) MessageService.access$000(MessageService.this).getService(IMessageService.class)).sendMessage(new vrp("VSMSG_initEnvOptionsChange", "-1", hashMap));
        }
    }

    static {
        t2o.a(468714321);
        t2o.a(468714320);
    }

    public MessageService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mMessageListenerManager = new kpi(fluidContext);
    }

    public static /* synthetic */ FluidContext access$000(MessageService messageService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("fc82cbcb", new Object[]{messageService});
        }
        return messageService.mFluidContext;
    }

    public static /* synthetic */ hmi access$100(MessageService messageService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hmi) ipChange.ipc$dispatch("ba95680a", new Object[]{messageService});
        }
        return messageService.mMessageCenter;
    }

    private void observeFirstCardRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff7c261", new Object[]{this});
        } else {
            ((IContainerService) this.mFluidContext.getService(IContainerService.class)).addFirstCardRenderListener(new a());
        }
    }

    private void observePageLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11a9ee6", new Object[]{this});
        } else {
            this.mILifecycleService.addPageLifecycleListener((o6d.a) new b());
        }
    }

    private void observeServerConfigChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7e02b8", new Object[]{this});
        } else {
            ((IDataService) this.mFluidContext.getService(IDataService.class)).addServerConfigChangeListener(new c());
        }
    }

    private void registerGlobalMessageHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b9eb10", new Object[]{this});
            return;
        }
        FluidContext fluidContext = this.mFluidContext;
        aca acaVar = new aca(fluidContext, fluidContext.getContext());
        this.globalNativeMessageHandler = acaVar;
        registerMessageHandler(acaVar);
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.IMessageService
    public void addMessageListener(String str, htc htcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e810ea44", new Object[]{this, str, htcVar});
        } else {
            this.mMessageListenerManager.b(str, htcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.IMessageService
    public aca getGlobalNativeMessageHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aca) ipChange.ipc$dispatch("612a8e05", new Object[]{this});
        }
        return this.globalNativeMessageHandler;
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.IMessageService
    public hmi getMessageCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hmi) ipChange.ipc$dispatch("2b3b087b", new Object[]{this});
        }
        return this.mMessageCenter;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mILifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        this.mMessageCenter = new hmi(this.mFluidContext, this.mMessageListenerManager);
        observePageLifecycle();
        observeServerConfigChange();
        observeFirstCardRender();
        registerGlobalMessageHandler();
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.IMessageService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.mMessageCenter.d();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            onDestroy();
        }
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.IMessageService
    public void registerMessageHandler(lr9 lr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fafcd48f", new Object[]{this, lr9Var});
        } else {
            this.mMessageCenter.e(lr9Var);
        }
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.IMessageService
    public void removeMessageListener(String str, htc htcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725e29e7", new Object[]{this, str, htcVar});
        } else {
            this.mMessageListenerManager.c(str, htcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.IMessageService
    public void sendMessage(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82892d4d", new Object[]{this, vrpVar});
        } else {
            this.mMessageCenter.f(vrpVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.IMessageService
    public void unRegisterMessageHandler(lr9 lr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c88d48", new Object[]{this, lr9Var});
        } else {
            this.mMessageCenter.g(lr9Var);
        }
    }
}
