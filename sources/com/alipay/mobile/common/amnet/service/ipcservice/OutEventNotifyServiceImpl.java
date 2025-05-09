package com.alipay.mobile.common.amnet.service.ipcservice;

import android.content.Intent;
import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetManager;
import com.alipay.mobile.common.amnet.api.AmnetUserInfo;
import com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService;
import com.alipay.mobile.common.amnet.service.AmnetInitInfosHelper;
import com.alipay.mobile.common.amnet.service.util.AmnetManagerFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class OutEventNotifyServiceImpl implements OutEventNotifyService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "OutEventNotifyServiceImpl";
    public static OutEventNotifyServiceImpl e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3917a = false;
    public boolean b = false;
    public boolean c = false;
    public List<OutEventListener> d;

    public static final OutEventNotifyService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutEventNotifyService) ipChange.ipc$dispatch("dd23300d", new Object[0]);
        }
        OutEventNotifyServiceImpl outEventNotifyServiceImpl = e;
        if (outEventNotifyServiceImpl != null) {
            return outEventNotifyServiceImpl;
        }
        synchronized (OutEventNotifyServiceImpl.class) {
            try {
                OutEventNotifyServiceImpl outEventNotifyServiceImpl2 = e;
                if (outEventNotifyServiceImpl2 != null) {
                    return outEventNotifyServiceImpl2;
                }
                OutEventNotifyServiceImpl outEventNotifyServiceImpl3 = new OutEventNotifyServiceImpl();
                e = outEventNotifyServiceImpl3;
                return outEventNotifyServiceImpl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AmnetManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetManager) ipChange.ipc$dispatch("d8ce485c", new Object[]{this});
        }
        return AmnetManagerFactory.getInstance();
    }

    public void addOutEventListener(OutEventListener outEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50125ce7", new Object[]{this, outEventListener});
        } else {
            b().add(outEventListener);
        }
    }

    public final List<OutEventListener> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new ArrayList(3);
        }
        return this.d;
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifyAppLeaveEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf400562", new Object[]{this});
        } else if (a().isActivated() && this.f3917a) {
            this.f3917a = false;
            a().getOutEventNotifyManager().notifyAppLeaveEvent();
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifyAppResumeEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4205f3c", new Object[]{this});
            return;
        }
        c();
        if (a().isActivated() && !this.f3917a) {
            this.f3917a = true;
            a().getOutEventNotifyManager().notifyAppResumeEvent();
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifyLoginOrLogoutEvent(String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d384136f", new Object[]{this, str, str2, bArr});
            return;
        }
        a().getOutEventNotifyManager().notifyLoginOrLogoutEvent(str, str2, bArr);
        AmnetInitInfosHelper.updateUserInfoForInitInfo(AmnetUserInfo.getUserId(), AmnetUserInfo.getSessionId());
    }

    public void notifyMainProcExistStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e8bb5a", new Object[]{this, new Integer(i)});
        } else if (a().isActivated()) {
            if (i == 1) {
                if (!this.c) {
                    this.c = true;
                } else {
                    return;
                }
            } else if (this.c) {
                this.f3917a = false;
                this.c = false;
            } else {
                return;
            }
            a().getOutEventNotifyManager().notifyMainProcExistStateChanged(i);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifyResendSessionid(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7f3ec8", new Object[]{this, str, str2});
        } else if (a().isActivated()) {
            a().getOutEventNotifyManager().notifyResendSessionid(str, str2);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifySceneEvent(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6433e2ec", new Object[]{this, str, new Boolean(z)});
        } else if (a().isActivated()) {
            a().getOutEventNotifyManager().notifySceneEvent(str, z);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifySeceenOffEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b113b18", new Object[]{this});
        } else if (a().isActivated() && this.b) {
            this.b = false;
            a().getOutEventNotifyManager().notifySeceenOffEvent();
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifySeceenOnEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9434889c", new Object[]{this});
        } else if (a().isActivated() && !this.b) {
            this.b = true;
            a().getOutEventNotifyManager().notifySeceenOnEvent();
        }
    }

    public void notifySwitchDelayHandshake(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c83a30b", new Object[]{this, new Integer(i)});
        } else {
            a().getOutEventNotifyManager().notifySwitchDelayHandshake(i);
        }
    }

    public void notifySwitchOrtt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7294663c", new Object[]{this, new Integer(i)});
        } else {
            a().getOutEventNotifyManager().notifySwitchOrtt(i);
        }
    }

    public void notifySwitchSmartHeartBeat(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f112cc", new Object[]{this, new Integer(i)});
        } else {
            a().getOutEventNotifyManager().notifySwitchSmartHeartBeat(i);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void notifyUpdateDnsInfo(byte b, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb7e565a", new Object[]{this, new Byte(b), str});
        } else if (a().isActivated()) {
            if (TextUtils.isEmpty(str)) {
                LogCatUtil.debug(TAG, "notifyUpdateDnsInfo,dnsType:" + ((int) b) + ",ipInfo is null,need't notify MNET");
                return;
            }
            a().getOutEventNotifyManager().notifyUpdateDnsInfo(b, str);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void onSyncInitChanged(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64f75d4", new Object[]{this, map});
        } else {
            AmnetInitInfosHelper.updateSyncInitInfo(map);
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService
    public void receiveNetInfo(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b1a6cc", new Object[]{this, intent});
        } else if (a().isActivated()) {
            a().getOutEventNotifyManager().receiveNetInfo(intent);
        }
    }

    public void resetEventStates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f304a74", new Object[]{this});
            return;
        }
        this.f3917a = false;
        this.b = false;
        this.c = false;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<OutEventListener> list = this.d;
        if (list != null && !((ArrayList) list).isEmpty()) {
            try {
                int size = ((ArrayList) this.d).size();
                for (int i = 0; i < size; i++) {
                    ((OutEventListener) ((ArrayList) this.d).get(i)).onAppResumeEvent();
                }
            } catch (Throwable th) {
                LogCatUtil.warn(TAG, "notifyAppResumeEvent2Listeners fail. ", th);
            }
        }
    }
}
