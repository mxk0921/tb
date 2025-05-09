package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.BaseConnection;
import com.taobao.accs.net.InAppConnection;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.service.IMessageService;
import tb.brt;
import tb.c71;
import tb.m8l;
import tb.o2j;
import tb.rd0;
import tb.t2o;
import tb.va8;
import tb.vu3;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ServiceImpl extends va8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ServiceImpl";
    private Context mContext;
    private String mLastNetWorkType = "unknown";
    private final IMessageService.Stub messageServiceBinder = new IMessageService.Stub() { // from class: com.taobao.accs.internal.ServiceImpl.1

        /* compiled from: Taobao */
        /* renamed from: com.taobao.accs.internal.ServiceImpl$1$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (ServiceImpl.access$000(ServiceImpl.this) == null || !UtilityImpl.getServiceEnabled(ServiceImpl.access$000(ServiceImpl.this))) {
                        Process.killProcess(Process.myPid());
                    } else {
                        Intent intent = new Intent();
                        intent.setAction("org.agoo.android.intent.action.PING_V4");
                        intent.setClassName(ServiceImpl.access$000(ServiceImpl.this).getPackageName(), xd0.channelService);
                        ServiceImpl.access$000(ServiceImpl.this).startService(intent);
                        ALog.d(ServiceImpl.TAG, "ReceiverImpl probeTaoBao........mContext.startService(intent) [probe][successfully]", new Object[0]);
                    }
                    ALog.d(ServiceImpl.TAG, "ReceiverImpl probeTaoBao........messageServiceBinder [probe][end]", new Object[0]);
                } catch (Throwable th) {
                    ALog.d(ServiceImpl.TAG, "ReceiverImpl probeTaoBao error........e=" + th, new Object[0]);
                }
            }
        }

        @Override // org.android.agoo.service.IMessageService
        public boolean ping() throws RemoteException {
            return true;
        }

        @Override // org.android.agoo.service.IMessageService
        public void probe() throws RemoteException {
            ALog.d(ServiceImpl.TAG, "ReceiverImpl probeTaoBao begin......messageServiceBinder [probe]", new Object[0]);
            brt.b(new a());
        }
    };
    private long startTime;

    static {
        t2o.a(343933137);
    }

    public ServiceImpl(Service service) {
        super(service);
        this.mContext = service.getApplicationContext();
    }

    public static /* synthetic */ Context access$000(ServiceImpl serviceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8b781b71", new Object[]{serviceImpl});
        }
        return serviceImpl.mContext;
    }

    public static /* synthetic */ Object ipc$super(ServiceImpl serviceImpl, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/accs/internal/ServiceImpl");
        }
    }

    private void notifyNetChangeOnAllConns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e872bfa", new Object[]{this, str});
            return;
        }
        ConcurrentHashMap<String, BaseConnection> concurrentHashMap = va8.mConnections;
        if (!(concurrentHashMap == null || concurrentHashMap.size() == 0)) {
            for (Map.Entry<String, BaseConnection> entry : va8.mConnections.entrySet()) {
                entry.getValue().z(str);
            }
        }
    }

    private void pingOnAllConns(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb077be", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        ConcurrentHashMap<String, BaseConnection> concurrentHashMap = va8.mConnections;
        if (!(concurrentHashMap == null || concurrentHashMap.size() == 0)) {
            for (Map.Entry<String, BaseConnection> entry : va8.mConnections.entrySet()) {
                entry.getValue().C(z, z2);
            }
        }
    }

    private void shutdownAllConns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53d74a3", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, BaseConnection> concurrentHashMap = va8.mConnections;
        if (!(concurrentHashMap == null || concurrentHashMap.size() == 0)) {
            for (Map.Entry<String, BaseConnection> entry : va8.mConnections.entrySet()) {
                entry.getValue().O();
            }
        }
    }

    @Override // tb.va8, com.taobao.accs.base.IBaseService
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        init();
    }

    @Override // tb.va8, com.taobao.accs.base.IBaseService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ALog.e(TAG, "Service onDestroy", new Object[0]);
        if (!m8l.r()) {
            super.onDestroy();
            this.mContext = null;
            shutdownAllConns();
            Process.killProcess(Process.myPid());
        }
    }

    @Override // tb.va8, com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        return false;
    }

    @Override // tb.va8
    public void onVotedHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eae5f6a", new Object[]{this});
        } else {
            startConnect();
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ALog.d(TAG, "init start", new Object[0]);
        GlobalClientInfo.getInstance(this.mContext);
        rd0.f.incrementAndGet();
        this.startTime = System.currentTimeMillis();
        this.mLastNetWorkType = UtilityImpl.getNetworkTypeExt(this.mContext);
    }

    public void startConnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ded2aaf", new Object[]{this});
            return;
        }
        ALog.i(TAG, "startConnect", new Object[0]);
        try {
            tryConnect();
            pingOnAllConns(false, false);
        } catch (Throwable th) {
            ALog.e(TAG, "tryConnect is error,e=" + th, new Object[0]);
        }
    }

    @Override // tb.va8
    public int onHostStartCommand(Intent intent, int i, int i2) {
        String action;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0ac7ce7", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        if (intent == null) {
            action = null;
        } else {
            try {
                action = intent.getAction();
            } catch (Throwable th) {
                try {
                    ALog.e(TAG, "onHostStartCommand", th, new Object[0]);
                } finally {
                    rd0.f.incrementAndGet();
                }
            }
        }
        if (TextUtils.isEmpty(action)) {
            tryConnect();
            pingOnAllConns(false, false);
            return 1;
        }
        handleAction(intent, action);
        return 1;
    }

    private synchronized void tryConnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe88bb6", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, BaseConnection> concurrentHashMap = va8.mConnections;
        if (!(concurrentHashMap == null || concurrentHashMap.size() == 0)) {
            for (Map.Entry<String, BaseConnection> entry : va8.mConnections.entrySet()) {
                BaseConnection value = entry.getValue();
                if (value == null) {
                    ALog.e(TAG, "tryConnect connection null", "appkey", value.i());
                    return;
                }
                ALog.i(TAG, "tryConnect", "appkey", value.i(), Constants.KEY_CONFIG_TAG, entry.getKey());
                if (!value.u() || !TextUtils.isEmpty(value.i.getAppSecret())) {
                    value.P();
                } else {
                    ALog.e(TAG, "tryConnect secret is null", new Object[0]);
                }
            }
            return;
        }
        ALog.w(TAG, "tryConnect no connections", new Object[0]);
    }

    @Override // tb.va8, com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action) || !TextUtils.equals(action, "org.agoo.android.intent.action.PING_V4")) {
            return null;
        }
        ALog.e(TAG, "onBind", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
        c71.c("accs", BaseMonitor.COUNT_FULL_VERIFY, "agoo_ping", vu3.b.GEO_NOT_SUPPORT);
        return this.messageServiceBinder;
    }

    private void handleAction(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252ff60c", new Object[]{this, intent, str});
            return;
        }
        ALog.d(TAG, "handleAction", "action", str);
        try {
            if ("org.agoo.android.intent.action.PING_V4".equals(str)) {
                String stringExtra = intent.getStringExtra("source");
                ALog.i(TAG, "org.agoo.android.intent.action.PING_V4,start channel by brothers", "serviceStart", Integer.valueOf(rd0.f.intValue()), "source" + stringExtra);
                c71.c("accs", "startChannel", stringExtra, vu3.b.GEO_NOT_SUPPORT);
                if (rd0.b()) {
                    c71.c("accs", "createChannel", stringExtra, vu3.b.GEO_NOT_SUPPORT);
                }
            }
            if (Constants.ACTION_CLOSE_CONNECTION.equals(str)) {
                BaseConnection connection = va8.getConnection(this.mContext, intent.getStringExtra(Constants.KEY_CONFIG_TAG), false, -1);
                if (connection instanceof InAppConnection) {
                    ((InAppConnection) connection).H0();
                }
            } else {
                tryConnect();
            }
            if (TextUtils.equals(str, "android.net.conn.CONNECTIVITY_CHANGE")) {
                String networkTypeExt = UtilityImpl.getNetworkTypeExt(this.mContext);
                boolean isNetworkConnected = UtilityImpl.isNetworkConnected(this.mContext);
                String str2 = "network change:" + this.mLastNetWorkType + " to " + networkTypeExt;
                ALog.i(TAG, str2, new Object[0]);
                if (isNetworkConnected) {
                    this.mLastNetWorkType = networkTypeExt;
                    notifyNetChangeOnAllConns(str2);
                    pingOnAllConns(true, false);
                }
                if (networkTypeExt.equals("unknown")) {
                    notifyNetChangeOnAllConns(str2);
                    this.mLastNetWorkType = networkTypeExt;
                }
            } else if (TextUtils.equals(str, "android.intent.action.USER_PRESENT")) {
                ALog.e(TAG, "action android.intent.action.USER_PRESENT", new Object[0]);
                pingOnAllConns(true, false);
            } else if (str.equals(Constants.ACTION_COMMAND)) {
                handleCommand(intent);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "handleAction", th, new Object[0]);
        }
    }

    private void handleCommand(Intent intent) {
        BaseConnection baseConnection;
        Message.ReqType reqType;
        URL url;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3516a0c7", new Object[]{this, intent});
            return;
        }
        int intExtra = intent.getIntExtra("command", -1);
        ALog.i(TAG, "handleCommand", "command", Integer.valueOf(intExtra));
        String stringExtra = intent.getStringExtra("packageName");
        String stringExtra2 = intent.getStringExtra("serviceId");
        String stringExtra3 = intent.getStringExtra(Constants.KEY_USER_ID);
        String stringExtra4 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
        if (intExtra > 0 && !TextUtils.isEmpty(stringExtra)) {
            BaseConnection connection = va8.getConnection(this.mContext, stringExtra4, true, intExtra);
            if (connection != null) {
                connection.P();
                Message message = null;
                if (intExtra == 100) {
                    byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                    String stringExtra5 = intent.getStringExtra("dataId");
                    String stringExtra6 = intent.getStringExtra("target");
                    String stringExtra7 = intent.getStringExtra("businessId");
                    String stringExtra8 = intent.getStringExtra(Constants.KEY_EXT_TAG);
                    try {
                        reqType = (Message.ReqType) intent.getSerializableExtra(Constants.KEY_SEND_TYPE);
                    } catch (Exception unused) {
                        reqType = null;
                    }
                    if (byteArrayExtra != null) {
                        try {
                            url = new URL(connection.l(null));
                        } catch (MalformedURLException e) {
                            e.printStackTrace();
                            url = null;
                        }
                        baseConnection = connection;
                        ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(stringExtra3, stringExtra2, byteArrayExtra, stringExtra5, stringExtra6, url, stringExtra7);
                        accsRequest.setTag(stringExtra8);
                        if (reqType == null) {
                            message = Message.buildSendData(baseConnection.l(null), stringExtra4, baseConnection.i.getStoreId(), this.mContext, stringExtra, accsRequest, false);
                        } else if (reqType == Message.ReqType.REQ) {
                            message = Message.buildRequest(this.mContext, baseConnection.l(null), stringExtra4, baseConnection.i.getStoreId(), stringExtra, Constants.TARGET_SERVICE_PRE, accsRequest, false);
                        }
                    } else {
                        baseConnection = connection;
                    }
                } else {
                    baseConnection = connection;
                    if (intExtra == 106) {
                        intent.setAction(Constants.ACTION_RECEIVE);
                        intent.putExtra("command", -1);
                        o2j.f().e(this.mContext, intent);
                        return;
                    }
                }
                if (message != null) {
                    ALog.d(TAG, "try send message", new Object[0]);
                    if (message.getNetPermanceMonitor() != null) {
                        message.getNetPermanceMonitor().onSend();
                    }
                    baseConnection.J(message, true);
                    return;
                }
                ALog.e(TAG, "message is null", new Object[0]);
                baseConnection.A(Message.buildParameterError(stringExtra, intExtra), -2);
                return;
            }
            ALog.e(TAG, "no connection", Constants.KEY_CONFIG_TAG, stringExtra4, "command", Integer.valueOf(intExtra));
        }
    }
}
