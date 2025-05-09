package org.android.agoo.huawei;

import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class HuaweiPushMessageService extends HmsMessageService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HUAWEI_TOKEN = "HW_TOKEN";
    private static final String TAG = "HuaweiPushMessageService";
    private AgooFactory agooFactory;

    public static /* synthetic */ Object ipc$super(HuaweiPushMessageService huaweiPushMessageService, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2086362198:
                super.onMessageReceived((RemoteMessage) objArr[0]);
                return null;
            case -2053364300:
                super.onSendError((String) objArr[0], (Exception) objArr[1]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -913259663:
                super.onMessageSent((String) objArr[0]);
                return null;
            case -266699219:
                super.onDeletedMessages();
                return null;
            case 51128253:
                return super.onBind((Intent) objArr[0]);
            case 1992651935:
                return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
            case 2081081289:
                super.onNewToken((String) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/agoo/huawei/HuaweiPushMessageService");
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService, android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return super.onBind(intent);
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onDeletedMessages() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01a7e2d", new Object[]{this});
        } else {
            super.onDeletedMessages();
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService, android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a4a3aa", new Object[]{this, remoteMessage});
            return;
        }
        super.onMessageReceived(remoteMessage);
        try {
            if (HuaWeiRegister.isChannelRegister) {
                Intent intent = new Intent();
                intent.setAction("org.agoo.android.intent.action.PING_V4");
                intent.setClassName("com.taobao.taobao", xd0.channelService);
                intent.putExtra("source", "huawei-bundle");
                startService(intent);
            }
            String data = remoteMessage.getData();
            ALog.i(TAG, "onPushMsg", "content", data);
            if (this.agooFactory == null) {
                AgooFactory agooFactory = new AgooFactory();
                this.agooFactory = agooFactory;
                agooFactory.init(this, null, null);
            }
            this.agooFactory.msgRecevie(data.getBytes(), "huawei", null);
        } catch (Throwable th) {
            ALog.e(TAG, "onPushMsg", th, new Object[0]);
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageSent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c990c371", new Object[]{this, str});
        } else {
            super.onMessageSent(str);
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onNewToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0ac7c9", new Object[]{this, str});
            return;
        }
        super.onNewToken(str);
        try {
            ALog.e(TAG, "onNewToken", "token", str);
            if (!TextUtils.isEmpty(str)) {
                NotifManager notifManager = new NotifManager();
                notifManager.init(getApplicationContext());
                notifManager.reportThirdPushToken(str, HUAWEI_TOKEN);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "onToken", th, new Object[0]);
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onSendError(String str, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859c25b4", new Object[]{this, str, exc});
        } else {
            super.onSendError(str, exc);
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        return super.onStartCommand(intent, i, i2);
    }
}
