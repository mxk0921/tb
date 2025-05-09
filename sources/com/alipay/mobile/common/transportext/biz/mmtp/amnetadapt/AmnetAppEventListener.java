package com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt;

import com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService;
import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.ipc.api.IPCCallManager;
import com.alipay.mobile.common.ipc.api.IPCContextManager;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter;
import com.alipay.mobile.common.transportext.biz.util.SecureRunnable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetAppEventListener extends EventInterfaceAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AmnetAppEventListener b;

    /* renamed from: a  reason: collision with root package name */
    public OutEventNotifyService f4193a;

    public static final AmnetAppEventListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetAppEventListener) ipChange.ipc$dispatch("2751cc55", new Object[0]);
        }
        AmnetAppEventListener amnetAppEventListener = b;
        if (amnetAppEventListener != null) {
            return amnetAppEventListener;
        }
        synchronized (AmnetAppEventListener.class) {
            try {
                AmnetAppEventListener amnetAppEventListener2 = b;
                if (amnetAppEventListener2 != null) {
                    return amnetAppEventListener2;
                }
                AmnetAppEventListener amnetAppEventListener3 = new AmnetAppEventListener();
                b = amnetAppEventListener3;
                return amnetAppEventListener3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AmnetAppEventListener amnetAppEventListener, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/amnetadapt/AmnetAppEventListener");
    }

    public final IPCContextManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPCContextManager) ipChange.ipc$dispatch("7c4fd3b9", new Object[]{this});
        }
        try {
            return IPCApiFactory.getSingletonIPCContextManager();
        } catch (Exception e) {
            LogCatUtil.error("AmnetAppEventListener", e);
            return null;
        }
    }

    public IPCCallManager getCallManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPCCallManager) ipChange.ipc$dispatch("51a15f48", new Object[]{this});
        }
        return a().getIpcCallManager();
    }

    public OutEventNotifyService getOutEventNotifyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutEventNotifyService) ipChange.ipc$dispatch("9c0b840e", new Object[]{this});
        }
        if (this.f4193a == null) {
            this.f4193a = (OutEventNotifyService) getCallManager().getIpcProxy(OutEventNotifyService.class);
        }
        return this.f4193a;
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onAppLeaveEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfccd8c", new Object[]{this});
        } else if (TransportStrategy.isNetworkRunInSingleProcess(TransportEnvUtil.getContext())) {
            LogCatUtil.printInfo("AmnetAppEventListener", "onAppLeaveEvent,network single process,not IPC");
        } else {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetAppEventListener.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/amnetadapt/AmnetAppEventListener$3");
                }

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                    } else {
                        AmnetAppEventListener.this.getOutEventNotifyService().notifyAppLeaveEvent();
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onAppResumeEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efc9c52", new Object[]{this});
        } else if (TransportStrategy.isNetworkRunInSingleProcess(TransportEnvUtil.getContext())) {
            LogCatUtil.printInfo("AmnetAppEventListener", "onAppResumeEvent,network single process,not IPC");
        } else {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetAppEventListener.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/amnetadapt/AmnetAppEventListener$4");
                }

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                    } else {
                        AmnetAppEventListener.this.getOutEventNotifyService().notifyAppResumeEvent();
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onSeceenOffEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ed782e", new Object[]{this});
        } else if (TransportStrategy.isNetworkRunInSingleProcess(TransportEnvUtil.getContext())) {
            LogCatUtil.printInfo("AmnetAppEventListener", "onSeceenOffEvent,network single process,not IPC");
        } else {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetAppEventListener.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/amnetadapt/AmnetAppEventListener$2");
                }

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                    } else {
                        AmnetAppEventListener.this.getOutEventNotifyService().notifySeceenOffEvent();
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onSeceenOnEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f150c6", new Object[]{this});
        } else if (TransportStrategy.isNetworkRunInSingleProcess(TransportEnvUtil.getContext())) {
            LogCatUtil.printInfo("AmnetAppEventListener", "onSeceenOnEvent,network single process,not IPC");
        } else {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetAppEventListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/amnetadapt/AmnetAppEventListener$1");
                }

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                    } else {
                        AmnetAppEventListener.this.getOutEventNotifyService().notifySeceenOnEvent();
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onSyncInitChanged(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64f75d4", new Object[]{this, map});
        } else if (TransportStrategy.isNetworkRunInSingleProcess(TransportEnvUtil.getContext())) {
            LogCatUtil.printInfo("AmnetAppEventListener", "onSyncInitChanged,network single process,not IPC");
        } else {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetAppEventListener.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/amnetadapt/AmnetAppEventListener$5");
                }

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                    } else {
                        AmnetAppEventListener.this.getOutEventNotifyService().onSyncInitChanged(map);
                    }
                }
            });
        }
    }
}
