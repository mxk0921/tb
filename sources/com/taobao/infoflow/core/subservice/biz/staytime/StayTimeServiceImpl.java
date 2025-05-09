package com.taobao.infoflow.core.subservice.biz.staytime;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.staytime.impl.StayTimeWaiter;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.infoflow.protocol.subservice.biz.IStayTimeService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.lang.ref.WeakReference;
import tb.cfc;
import tb.get;
import tb.h6d;
import tb.iqb;
import tb.t2o;
import tb.zxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StayTimeServiceImpl implements IStayTimeService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cfc mInfoFlowContext;
    private WeakReference<iqb.a> mOnContainerListenerWeakReference;
    private WeakReference<h6d> mPageLifeCycleWeakReference;
    private WeakReference<IRocketSubService.a> mRocketListenerWeakReference;
    private final StayTimeWaiter mStayTimeWaiter = new StayTimeWaiter();
    private WeakReference<zxd> mTabLifeCycleWeakReference;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.h6d
        public void onActivityResult(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            }
        }

        @Override // tb.h6d
        public void onColdStartResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45e9b853", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onDestroyView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onNewIntent(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            }
        }

        @Override // tb.h6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                StayTimeServiceImpl.access$100(StayTimeServiceImpl.this);
            }
        }

        @Override // tb.h6d
        public void onRestart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            } else {
                StayTimeServiceImpl.access$000(StayTimeServiceImpl.this);
            }
        }

        @Override // tb.h6d
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onWillExit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements zxd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.zxd
        public void onPageScrolled(float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
            }
        }

        @Override // tb.zxd
        public void onPageSelected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            } else {
                StayTimeServiceImpl.access$000(StayTimeServiceImpl.this);
            }
        }

        @Override // tb.zxd
        public void onPageUnSelected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            } else {
                StayTimeServiceImpl.access$100(StayTimeServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements iqb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.iqb.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30cf99d1", new Object[]{this});
            }
        }

        @Override // tb.iqb.a
        public void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df5adadd", new Object[]{this, context});
            }
        }

        @Override // tb.iqb.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afa2fd3d", new Object[]{this});
            } else {
                StayTimeServiceImpl.access$000(StayTimeServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements IRocketSubService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b5feb20", new Object[]{this, new Boolean(z)});
            } else if (z) {
                StayTimeServiceImpl.access$000(StayTimeServiceImpl.this);
            } else {
                StayTimeServiceImpl.access$100(StayTimeServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10664a;
        public final /* synthetic */ int[] b;

        public e(long j, int[] iArr) {
            this.f10664a = j;
            this.b = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                StayTimeServiceImpl.access$300(StayTimeServiceImpl.this).a(StayTimeServiceImpl.access$200(StayTimeServiceImpl.this), this.f10664a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10665a;
        public final /* synthetic */ int[] b;

        public f(long j, int[] iArr) {
            this.f10665a = j;
            this.b = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                StayTimeServiceImpl.access$300(StayTimeServiceImpl.this).b(StayTimeServiceImpl.access$200(StayTimeServiceImpl.this), this.f10665a, this.b);
            }
        }
    }

    static {
        t2o.a(486539599);
        t2o.a(488636608);
    }

    public static /* synthetic */ void access$000(StayTimeServiceImpl stayTimeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee751fa", new Object[]{stayTimeServiceImpl});
        } else {
            stayTimeServiceImpl.commitEnter();
        }
    }

    public static /* synthetic */ void access$100(StayTimeServiceImpl stayTimeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb5d07b", new Object[]{stayTimeServiceImpl});
        } else {
            stayTimeServiceImpl.commitLeave();
        }
    }

    public static /* synthetic */ cfc access$200(StayTimeServiceImpl stayTimeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("dd7e95ac", new Object[]{stayTimeServiceImpl});
        }
        return stayTimeServiceImpl.mInfoFlowContext;
    }

    public static /* synthetic */ StayTimeWaiter access$300(StayTimeServiceImpl stayTimeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StayTimeWaiter) ipChange.ipc$dispatch("21f6e774", new Object[]{stayTimeServiceImpl});
        }
        return stayTimeServiceImpl.mStayTimeWaiter;
    }

    private void commitEnter() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac1c3e8", new Object[]{this});
            return;
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.mInfoFlowContext.a(IRocketSubService.class);
        if (iRocketSubService != null) {
            z = iRocketSubService.isOnRocketState();
        }
        if (z) {
            get.a().i(new e(System.nanoTime(), StayTimeWaiter.d(this.mInfoFlowContext)));
        }
    }

    private void commitLeave() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20eb0447", new Object[]{this});
        } else {
            get.a().i(new f(System.nanoTime(), StayTimeWaiter.d(this.mInfoFlowContext)));
        }
    }

    private iqb.a createOnContainerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iqb.a) ipChange.ipc$dispatch("11514f60", new Object[]{this});
        }
        return new c();
    }

    private h6d createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("8602dec9", new Object[]{this});
        }
        return new a();
    }

    private IRocketSubService.a createRocketListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRocketSubService.a) ipChange.ipc$dispatch("50f54402", new Object[]{this});
        }
        return new d();
    }

    private zxd createTabLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxd) ipChange.ipc$dispatch("34d67fe5", new Object[]{this});
        }
        return new b();
    }

    private void destroyUnRegister(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da23723", new Object[]{this, cfcVar});
            return;
        }
        unRegisterPageChangeListener(cfcVar);
        unRegisterTabChangeListener(cfcVar);
        unRegisterContainerListener(cfcVar);
        unRegisterRocketListener(cfcVar);
    }

    private void initRegister(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb40f826", new Object[]{this, cfcVar});
            return;
        }
        registerPageChangeListener(cfcVar);
        registerTabChangeListener(cfcVar);
        registerContainerListener(cfcVar);
        registerRocketListener(cfcVar);
    }

    private void registerContainerListener(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350b61a7", new Object[]{this, cfcVar});
            return;
        }
        IContainerService iContainerService = (IContainerService) cfcVar.a(IContainerService.class);
        if (iContainerService != null) {
            iqb.a createOnContainerListener = createOnContainerListener();
            iContainerService.addOnContainerListener(createOnContainerListener);
            this.mOnContainerListenerWeakReference = new WeakReference<>(createOnContainerListener);
        }
    }

    private void registerPageChangeListener(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3d9e23", new Object[]{this, cfcVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            h6d createPageLifeCycle = createPageLifeCycle();
            this.mPageLifeCycleWeakReference = new WeakReference<>(createPageLifeCycle);
            iMainLifecycleService.getPageLifeCycleRegister().a(createPageLifeCycle);
        }
    }

    private void registerRocketListener(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8a53ce", new Object[]{this, cfcVar});
            return;
        }
        IRocketSubService iRocketSubService = (IRocketSubService) cfcVar.a(IRocketSubService.class);
        if (iRocketSubService != null) {
            IRocketSubService.a createRocketListener = createRocketListener();
            iRocketSubService.addRocketListener(createRocketListener);
            this.mRocketListenerWeakReference = new WeakReference<>(createRocketListener);
        }
    }

    private void registerTabChangeListener(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c8ec03", new Object[]{this, cfcVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            zxd createTabLifeCycle = createTabLifeCycle();
            iMainLifecycleService.getTabLifeCycleRegister().a(createTabLifeCycle);
            this.mTabLifeCycleWeakReference = new WeakReference<>(createTabLifeCycle);
        }
    }

    private void unRegisterContainerListener(cfc cfcVar) {
        WeakReference<iqb.a> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87a5ee0", new Object[]{this, cfcVar});
            return;
        }
        IContainerService iContainerService = (IContainerService) cfcVar.a(IContainerService.class);
        if (iContainerService != null && (weakReference = this.mOnContainerListenerWeakReference) != null && weakReference.get() != null) {
            iContainerService.removeOnContainerListener(this.mOnContainerListenerWeakReference.get());
        }
    }

    private void unRegisterPageChangeListener(cfc cfcVar) {
        WeakReference<h6d> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ae480a", new Object[]{this, cfcVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null && (weakReference = this.mPageLifeCycleWeakReference) != null && weakReference.get() != null) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycleWeakReference.get());
        }
    }

    private void unRegisterRocketListener(cfc cfcVar) {
        WeakReference<IRocketSubService.a> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38320935", new Object[]{this, cfcVar});
            return;
        }
        IRocketSubService iRocketSubService = (IRocketSubService) cfcVar.a(IRocketSubService.class);
        if (iRocketSubService != null && (weakReference = this.mRocketListenerWeakReference) != null && weakReference.get() != null) {
            iRocketSubService.removeRocketListener(this.mRocketListenerWeakReference.get());
        }
    }

    private void unRegisterTabChangeListener(cfc cfcVar) {
        WeakReference<zxd> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a37e93c", new Object[]{this, cfcVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null && (weakReference = this.mTabLifeCycleWeakReference) != null && weakReference.get() != null) {
            iMainLifecycleService.getTabLifeCycleRegister().b(this.mTabLifeCycleWeakReference.get());
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        initRegister(cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            destroyUnRegister(this.mInfoFlowContext);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IStayTimeService
    public void setFilterInterval(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cedcbaa5", new Object[]{this, l});
        } else {
            this.mStayTimeWaiter.e(l);
        }
    }
}
