package com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt;

import android.content.Intent;
import com.alipay.mobile.common.amnet.api.OutEventNotifyManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.util.SecureRunnable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetLocalAppEventListener extends EventInterfaceAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AmnetLocalAppEventListener f4199a;

    public static /* synthetic */ OutEventNotifyManager access$000(AmnetLocalAppEventListener amnetLocalAppEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutEventNotifyManager) ipChange.ipc$dispatch("f29bc380", new Object[]{amnetLocalAppEventListener});
        }
        return amnetLocalAppEventListener.a();
    }

    public static final AmnetLocalAppEventListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetLocalAppEventListener) ipChange.ipc$dispatch("57a76667", new Object[0]);
        }
        AmnetLocalAppEventListener amnetLocalAppEventListener = f4199a;
        if (amnetLocalAppEventListener != null) {
            return amnetLocalAppEventListener;
        }
        synchronized (AmnetLocalAppEventListener.class) {
            try {
                AmnetLocalAppEventListener amnetLocalAppEventListener2 = f4199a;
                if (amnetLocalAppEventListener2 != null) {
                    return amnetLocalAppEventListener2;
                }
                AmnetLocalAppEventListener amnetLocalAppEventListener3 = new AmnetLocalAppEventListener();
                f4199a = amnetLocalAppEventListener3;
                return amnetLocalAppEventListener3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AmnetLocalAppEventListener amnetLocalAppEventListener, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/amnetlocaladapt/AmnetLocalAppEventListener");
    }

    public final OutEventNotifyManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutEventNotifyManager) ipChange.ipc$dispatch("d23dcb26", new Object[]{this});
        }
        return AmnetHelper.getAmnetManager().getOutEventNotifyManager();
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onAppLeaveEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfccd8c", new Object[]{this});
        } else if (AmnetHelper.getAmnetManager().isActivated()) {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt.AmnetLocalAppEventListener.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/amnetlocaladapt/AmnetLocalAppEventListener$3");
                }

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                        return;
                    }
                    LogCatUtil.printInfo("AmnetLocalAppEventListener", "onAppLeaveEvent");
                    AmnetLocalAppEventListener.access$000(AmnetLocalAppEventListener.this).notifyAppLeaveEvent();
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onAppResumeEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efc9c52", new Object[]{this});
        } else if (AmnetHelper.getAmnetManager().isActivated()) {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt.AmnetLocalAppEventListener.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/amnetlocaladapt/AmnetLocalAppEventListener$4");
                }

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                        return;
                    }
                    LogCatUtil.printInfo("AmnetLocalAppEventListener", "onAppResumeEvent");
                    AmnetLocalAppEventListener.access$000(AmnetLocalAppEventListener.this).notifyAppResumeEvent();
                }
            });
        }
    }

    public void onNetworkChanged(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7be629", new Object[]{this, intent});
        } else if (AmnetHelper.getAmnetManager().isActivated()) {
            LogCatUtil.printInfo("AmnetLocalAppEventListener", "onNetworkChanged");
            a().receiveNetInfo(intent);
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onSeceenOffEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ed782e", new Object[]{this});
        } else if (AmnetHelper.getAmnetManager().isActivated()) {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt.AmnetLocalAppEventListener.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/amnetlocaladapt/AmnetLocalAppEventListener$2");
                }

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                        return;
                    }
                    LogCatUtil.printInfo("AmnetLocalAppEventListener", "onSeceenOffEvent");
                    AmnetLocalAppEventListener.access$000(AmnetLocalAppEventListener.this).notifySeceenOffEvent();
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onSeceenOnEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f150c6", new Object[]{this});
        } else if (AmnetHelper.getAmnetManager().isActivated()) {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt.AmnetLocalAppEventListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/amnetlocaladapt/AmnetLocalAppEventListener$1");
                }

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                        return;
                    }
                    LogCatUtil.printInfo("AmnetLocalAppEventListener", "onSeceenOnEvent");
                    AmnetLocalAppEventListener.access$000(AmnetLocalAppEventListener.this).notifySeceenOnEvent();
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onSyncInitChanged(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64f75d4", new Object[]{this, map});
        }
    }
}
