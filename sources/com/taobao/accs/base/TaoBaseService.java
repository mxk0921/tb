package com.taobao.accs.base;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.aranger.constant.Constants;
import java.io.Serializable;
import java.util.Map;
import tb.brt;
import tb.f70;
import tb.h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class TaoBaseService extends Service implements AccsDataListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaoBaseService";
    private static boolean isBinded = false;
    private Messenger messenger = new Messenger(new Handler() { // from class: com.taobao.accs.base.TaoBaseService.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/base/TaoBaseService$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message != null) {
                ALog.i(TaoBaseService.TAG, "handleMessage on receive msg", "msg", message.toString());
                Intent intent = (Intent) message.getData().getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                if (intent != null) {
                    ALog.i(TaoBaseService.TAG, "handleMessage get intent success", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent.toString());
                    TaoBaseService.this.onStartCommand(intent, 0, 0);
                }
            }
        }
    });

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum ExtHeaderType {
        TYPE_BUSINESS,
        TYPE_SID,
        TYPE_USERID,
        TYPE_COOKIE,
        TYPE_TAG,
        TYPE_STATUS,
        TYPE_DELAY,
        TYPE_EXPIRE,
        TYPE_LOCATION,
        TYPE_UNIT,
        TYPE_NEED_BUSINESS_ACK;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ExtHeaderType extHeaderType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/base/TaoBaseService$ExtHeaderType");
        }

        public static ExtHeaderType valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExtHeaderType) ipChange.ipc$dispatch("da81d8d0", new Object[]{str}) : (ExtHeaderType) Enum.valueOf(ExtHeaderType.class, str);
        }

        public static ExtHeaderType valueOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExtHeaderType) ipChange.ipc$dispatch("c202298b", new Object[]{new Integer(i)});
            }
            switch (i) {
                case 0:
                    return TYPE_BUSINESS;
                case 1:
                    return TYPE_SID;
                case 2:
                    return TYPE_USERID;
                case 3:
                    return TYPE_COOKIE;
                case 4:
                    return TYPE_TAG;
                case 5:
                    return TYPE_STATUS;
                case 6:
                    return TYPE_DELAY;
                case 7:
                    return TYPE_EXPIRE;
                case 8:
                    return TYPE_LOCATION;
                case 9:
                    return TYPE_UNIT;
                case 10:
                    return TYPE_NEED_BUSINESS_ACK;
                default:
                    return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ExtraInfo implements Serializable {
        public static final String EXT_HEADER = "ext_header";
        public int connType;
        public Map<ExtHeaderType, String> extHeader;
        public String fromHost;
        public String fromPackage;
        public AccsFullLink fullLink = null;
        public Map<Integer, String> oriExtHeader;

        static {
            t2o.a(343933020);
        }
    }

    static {
        t2o.a(343933013);
        t2o.a(343933002);
    }

    private void bindSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30edc930", new Object[]{this});
        } else if (!h.a(Constants.INTENT_KEY_SERVICE)) {
            getApplicationContext().bindService(new Intent(this, getClass()), new ServiceConnection() { // from class: com.taobao.accs.base.TaoBaseService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    }
                }
            }, 1);
        }
    }

    public static /* synthetic */ Object ipc$super(TaoBaseService taoBaseService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/accs/base/TaoBaseService");
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onAntiBrush(boolean z, ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7a087d", new Object[]{this, new Boolean(z), extraInfo});
        }
    }

    public void onConnected(ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    public void onDisconnected(ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
        }
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        DataReceiveMonitor dataReceiveMonitor = DataReceiveMonitor.get(intent);
        if (dataReceiveMonitor != null) {
            dataReceiveMonitor.svcStartTime = System.currentTimeMillis();
        }
        brt.b(new Runnable() { // from class: com.taobao.accs.base.TaoBaseService.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TaoBaseService taoBaseService = TaoBaseService.this;
                f70.h(taoBaseService, intent, taoBaseService);
            }
        });
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (!isBinded) {
            isBinded = true;
            ALog.d(TAG, "onBind serviceName = " + getClass(), new Object[0]);
            bindSelf();
        }
        return this.messenger.getBinder();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class AccsFullLink implements Serializable {
        public long accsCallbackTime;
        public long accsDownTime;
        public long accsReceivedTime;
        public long accsUpTime;
        public long networkReceivedTime;
        public long send2NetworkEndTime;
        public long send2NetworkStartTime;

        static {
            t2o.a(343933017);
        }

        public AccsFullLink(long j, long j2, long j3) {
            this.accsUpTime = j;
            this.send2NetworkStartTime = j2;
            this.send2NetworkEndTime = j3;
        }

        public AccsFullLink(long j, long j2, long j3, long j4) {
            this.accsDownTime = j;
            this.networkReceivedTime = j2;
            this.accsReceivedTime = j3;
            this.accsCallbackTime = j4;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ConnectInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 8974674111758240362L;
        public boolean connected;
        public int errorCode;
        public String errordetail;
        public String host;
        public boolean isCenterHost;
        public boolean isInapp;
        public String process;

        static {
            t2o.a(343933018);
        }

        public ConnectInfo(String str, boolean z, boolean z2) {
            this.host = str;
            this.isInapp = z;
            this.isCenterHost = z2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ConnectInfo{host='" + this.host + "', isInapp=" + this.isInapp + ", isCenterHost=" + this.isCenterHost + ", connected=" + this.connected + ", errorCode=" + this.errorCode + ", errorDetail='" + this.errordetail + "'}";
        }

        public ConnectInfo(String str, boolean z, boolean z2, int i, String str2) {
            this.host = str;
            this.isInapp = z;
            this.isCenterHost = z2;
            this.errorCode = i;
            this.errordetail = str2;
        }
    }
}
