package com.ali.user.open.core.task;

import android.webkit.CookieSyncManager;
import com.ali.user.open.core.callback.InitResultCallback;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.device.DeviceInfo;
import com.ali.user.open.core.exception.MemberSDKException;
import com.ali.user.open.core.service.MemberExecutorService;
import com.ali.user.open.core.service.RpcService;
import com.ali.user.open.core.service.StorageService;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.service.impl.ExecutorServiceImpl;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.core.util.ReflectionUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class InitTask implements Callable<Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "initTask";
    private InitResultCallback initResultCallback;

    static {
        t2o.a(71303228);
    }

    public InitTask(InitResultCallback initResultCallback) {
        this.initResultCallback = initResultCallback;
    }

    public static /* synthetic */ InitResultCallback access$000(InitTask initTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InitResultCallback) ipChange.ipc$dispatch("656724a2", new Object[]{initTask});
        }
        return initTask.initResultCallback;
    }

    private void asyncRun() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c81376", new Object[]{this});
        } else if (!initialize()) {
            SDKLogger.d(TAG, "INIT FAILURE");
            KernelContext.executorService.postUITask(new Runnable() { // from class: com.ali.user.open.core.task.InitTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (InitTask.access$000(InitTask.this) != null) {
                        InitTask.access$000(InitTask.this).onFailure(-1, "service register fail");
                    }
                }
            });
        } else {
            KernelContext.executorService.postUITask(new Runnable() { // from class: com.ali.user.open.core.task.InitTask.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (InitTask.access$000(InitTask.this) != null) {
                        InitTask.access$000(InitTask.this).onSuccess();
                    }
                }
            });
            SDKLogger.d(TAG, "INIT SUCCESS");
        }
    }

    private Object getServiceInstance(String str, String[] strArr, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7da5945b", new Object[]{this, str, strArr, objArr});
        }
        try {
            return ReflectionUtils.newInstance(str, strArr, objArr);
        } catch (NoSuchMethodError e) {
            e.printStackTrace();
            return null;
        }
    }

    private void initUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949b2ed7", new Object[]{this});
        } else {
            DeviceInfo.init(KernelContext.getApplicationContext());
        }
    }

    private boolean initializeCoreComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63ce89d0", new Object[]{this})).booleanValue();
        }
        KernelContext.wrapServiceRegistry();
        ConfigManager.getInstance().init();
        if (!registerRpc() || !registerStorage() || !registerUserTrack()) {
            return false;
        }
        ReflectionUtils.invoke("com.ali.user.open.module.SessionModule", "init", null, null, null);
        ReflectionUtils.invoke("com.ali.user.open.oauth.module.OauthModule", "init", null, null, null);
        ReflectionUtils.invoke("com.ali.user.open.ucc.module.UccModule", "init", null, null, null);
        ReflectionUtils.invoke("com.ali.user.open.authorize.module.AuthorizeModule", "init", null, null, null);
        KernelContext.registerService(new Class[]{MemberExecutorService.class, ExecutorService.class}, new ExecutorServiceImpl(), null);
        loadDownload();
        boolean loadLogin = loadLogin();
        CommonUtils.sendUT("init_step_ucc_load_success");
        SDKLogger.d(TAG, "INIT SUCCESS");
        return loadLogin;
    }

    private boolean loadDownload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bb8b919", new Object[]{this})).booleanValue();
        }
        SDKLogger.d(TAG, "register download jsbridge");
        try {
            ReflectionUtils.invoke("com.ali.user.open.MemberDownload", "init", null, Class.forName("com.ali.user.open.MemberDownload"), null);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private boolean loadLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd8b152e", new Object[]{this})).booleanValue();
        }
        SDKLogger.d(TAG, "register login service");
        try {
            ReflectionUtils.invoke("com.ali.user.open.tbauth.TbAuthLifecycleAdapter", "init", null, Class.forName("com.ali.user.open.tbauth.TbAuthLifecycleAdapter"), null);
        } catch (ClassNotFoundException unused) {
        }
        return true;
    }

    public void doWhenException(Throwable th) {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6c1a4", new Object[]{this, th});
            return;
        }
        if (th instanceof MemberSDKException) {
            MemberSDKException memberSDKException = (MemberSDKException) th;
            i = memberSDKException.code;
            str = memberSDKException.message;
        } else {
            str = CommonUtils.toString(th);
            i = 10010;
        }
        CommonUtils.onFailure(this.initResultCallback, i, str);
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("b898ca78", new Object[]{this});
        }
        ReentrantLock reentrantLock = KernelContext.initLock;
        reentrantLock.lock();
        try {
            asyncRun();
        } catch (Throwable th) {
            try {
                SDKLogger.e(TAG, th.getMessage(), th);
                doWhenException(th);
                reentrantLock = KernelContext.initLock;
            } catch (Throwable th2) {
                KernelContext.initLock.unlock();
                throw th2;
            }
        }
        reentrantLock.unlock();
        return null;
    }

    private boolean initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b11081b", new Object[]{this})).booleanValue();
        }
        SDKLogger.d(TAG, "sdk version = 4.7.1");
        initUtdid();
        try {
            CookieSyncManager.createInstance(KernelContext.getApplicationContext());
            if (initializeCoreComponents()) {
                KernelContext.sdkInitialized = Boolean.TRUE;
                return true;
            }
        } catch (Throwable th) {
            SDKLogger.e(TAG, "fail to sync start", th);
            doWhenException(th);
        }
        return false;
    }

    private boolean registerRpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a79ffcd", new Object[]{this})).booleanValue();
        }
        SDKLogger.d(TAG, "registerRpc");
        try {
            KernelContext.registerService(new Class[]{RpcService.class}, getServiceInstance("com.ali.user.open.mtop.rpc.impl.MtopRpcServiceImpl", null, null), null);
            return true;
        } catch (NoSuchMethodError e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean registerStorage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d7b16e3", new Object[]{this})).booleanValue();
        }
        SDKLogger.d(TAG, "registerStorage");
        try {
            KernelContext.isMini = false;
        } catch (Throwable unused) {
        }
        try {
            KernelContext.registerService(new Class[]{StorageService.class}, getServiceInstance("com.ali.user.open.securityguard.SecurityGuardWrapper", null, null), null);
            return true;
        } catch (NoSuchMethodError e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean registerUserTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a93342e8", new Object[]{this})).booleanValue();
        }
        SDKLogger.d(TAG, "registerUserTrack");
        try {
            KernelContext.registerService(new Class[]{UserTrackerService.class}, getServiceInstance("com.ali.user.open.ut.UserTrackerImpl", null, null), null);
            return true;
        } catch (NoSuchMethodError e) {
            e.printStackTrace();
            return false;
        }
    }
}
