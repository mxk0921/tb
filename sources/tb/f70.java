package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.NetworkDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.AckExtraData;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.exception.IPCException;
import java.util.HashMap;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f70 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AccsHandler";

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f19053a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AccsDataListener f19054a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Intent d;

        public a(AccsDataListener accsDataListener, String str, int i, Intent intent) {
            this.f19054a = accsDataListener;
            this.b = str;
            this.c = i;
            this.d = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f19054a.onBind(this.b, this.c, f70.a(this.d));
            } catch (IPCException e) {
                ALog.e(f70.TAG, "onReceiveData onBind", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AccsDataListener f19055a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Intent d;

        public b(AccsDataListener accsDataListener, String str, int i, Intent intent) {
            this.f19055a = accsDataListener;
            this.b = str;
            this.c = i;
            this.d = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f19055a.onUnbind(this.b, this.c, f70.a(this.d));
            } catch (IPCException e) {
                ALog.e(f70.TAG, "onReceiveData onUnbind", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DataReceiveMonitor f19056a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ AccsDataListener e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ Intent g;
        public final /* synthetic */ Context h;
        public final /* synthetic */ String i;
        public final /* synthetic */ byte[] j;
        public final /* synthetic */ TaoBaseService.ExtraInfo k;

        public c(DataReceiveMonitor dataReceiveMonitor, String str, String str2, int i, AccsDataListener accsDataListener, boolean z, Intent intent, Context context, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
            this.f19056a = dataReceiveMonitor;
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = accsDataListener;
            this.f = z;
            this.g = intent;
            this.h = context;
            this.i = str3;
            this.j = bArr;
            this.k = extraInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DataReceiveMonitor dataReceiveMonitor = this.f19056a;
                if (dataReceiveMonitor != null) {
                    dataReceiveMonitor.endTime = System.currentTimeMillis();
                    AppMonitor.getInstance().commitStat(this.f19056a);
                }
                if (f70.b(this.b)) {
                    ALog.e(f70.TAG, "onData start", "dataId", this.c, "serviceId", this.b, "command", Integer.valueOf(this.d), "className", this.e.getClass().getName());
                }
                if (this.f && Constants.IMPAAS.equals(this.b) && m8l.t()) {
                    com.taobao.accs.a accsInstance = ACCSManager.getAccsInstance(this.h, this.g.getStringExtra("appKey"), this.g.getStringExtra(Constants.KEY_CONFIG_TAG));
                    if (accsInstance != null) {
                        accsInstance.addBizAckInfo(this.c, "accs", new AckExtraData("200"));
                    } else {
                        ALog.e(f70.TAG, "no acsmgr addBizAckInfo", "dataId", this.c);
                        c71.c("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, "no acsmgr addBizAckInfo", vu3.b.GEO_NOT_SUPPORT);
                    }
                }
                this.e.onData(this.b, this.i, this.c, this.j, this.k);
                if (f70.b(this.b)) {
                    ALog.e(f70.TAG, "onData end", "dataId", this.c);
                }
            } catch (Throwable th) {
                ALog.e(f70.TAG, "onReceiveData onData", th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19057a;
        public final /* synthetic */ String b;
        public final /* synthetic */ AccsDataListener c;
        public final /* synthetic */ int d;
        public final /* synthetic */ byte[] e;
        public final /* synthetic */ Intent f;

        public d(String str, String str2, AccsDataListener accsDataListener, int i, byte[] bArr, Intent intent) {
            this.f19057a = str;
            this.b = str2;
            this.c = accsDataListener;
            this.d = i;
            this.e = bArr;
            this.f = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (f70.b(this.f19057a)) {
                    ALog.e(f70.TAG, "onResponse start dataId:" + this.b + " serviceId:" + this.f19057a, new Object[0]);
                }
                this.c.onResponse(this.f19057a, this.b, this.d, this.e, f70.a(this.f));
                if (f70.b(this.f19057a)) {
                    ALog.e(f70.TAG, "onResponse end dataId:" + this.b, new Object[0]);
                }
            } catch (IPCException e) {
                ALog.e(f70.TAG, "onReceiveData onResponse", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AccsDataListener f19059a;
        public final /* synthetic */ boolean b;

        public f(AccsDataListener accsDataListener, boolean z) {
            this.f19059a = accsDataListener;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f19059a.onAntiBrush(this.b, null);
            } catch (IPCException e) {
                ALog.e(f70.TAG, "onReceiveData onAntiBrush", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AccsDataListener f19060a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        public g(AccsDataListener accsDataListener, String str, boolean z, boolean z2) {
            this.f19060a = accsDataListener;
            this.b = str;
            this.c = z;
            this.d = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f19060a.onConnected(new TaoBaseService.ConnectInfo(this.b, this.c, this.d));
            } catch (IPCException e) {
                ALog.e(f70.TAG, "onReceiveData onConnected", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AccsDataListener f19061a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;

        public h(AccsDataListener accsDataListener, String str, boolean z, boolean z2, int i, String str2) {
            this.f19061a = accsDataListener;
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = i;
            this.f = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f19061a.onDisconnected(new TaoBaseService.ConnectInfo(this.b, this.c, this.d, this.e, this.f));
            } catch (IPCException e) {
                ALog.e(f70.TAG, "onReceiveData onDisconnected", e, new Object[0]);
            }
        }
    }

    static {
        t2o.a(343933217);
    }

    public static /* synthetic */ TaoBaseService.ExtraInfo a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoBaseService.ExtraInfo) ipChange.ipc$dispatch("f0ba1cd5", new Object[]{intent});
        }
        return f(intent);
    }

    public static /* synthetic */ boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd2b2e86", new Object[]{str})).booleanValue();
        }
        return g(str);
    }

    public static void d(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a18a46", new Object[]{str, runnable});
        } else if (Constants.IMPAAS.equals(str) || GlobalClientInfo.AGOO_SERVICE_ID.equals(str) || j8l.z(GlobalClientInfo.getContext(), 3, str)) {
            brt.c(runnable);
        } else if ("powermsg3".equals(str)) {
            brt.k().execute(runnable);
        } else {
            f19053a.post(runnable);
        }
    }

    public static Map<TaoBaseService.ExtHeaderType, String> e(Map<Integer, String> map) {
        Exception e2;
        TaoBaseService.ExtHeaderType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1e147b7b", new Object[]{map});
        }
        HashMap hashMap = null;
        if (map == null) {
            return null;
        }
        try {
            HashMap hashMap2 = new HashMap();
            try {
                for (TaoBaseService.ExtHeaderType extHeaderType : TaoBaseService.ExtHeaderType.values()) {
                    String str = map.get(Integer.valueOf(extHeaderType.ordinal()));
                    if (!TextUtils.isEmpty(str)) {
                        hashMap2.put(extHeaderType, str);
                    }
                }
                return hashMap2;
            } catch (Exception e3) {
                e2 = e3;
                hashMap = hashMap2;
                ALog.e(TAG, "getExtHeader", e2, new Object[0]);
                return hashMap;
            }
        } catch (Exception e4) {
            e2 = e4;
        }
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cc42076", new Object[]{str})).booleanValue();
        }
        return UtilityImpl.isServiceIdPrintLog(str);
    }

    public static TaoBaseService.ExtraInfo f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoBaseService.ExtraInfo) ipChange.ipc$dispatch("511d920d", new Object[]{intent});
        }
        TaoBaseService.ExtraInfo extraInfo = new TaoBaseService.ExtraInfo();
        try {
            HashMap hashMap = (HashMap) intent.getSerializableExtra(TaoBaseService.ExtraInfo.EXT_HEADER);
            Map<TaoBaseService.ExtHeaderType, String> e2 = e(hashMap);
            String stringExtra = intent.getStringExtra("packageName");
            String stringExtra2 = intent.getStringExtra("host");
            extraInfo.connType = intent.getIntExtra(Constants.KEY_CONN_TYPE, 0);
            extraInfo.extHeader = e2;
            extraInfo.oriExtHeader = hashMap;
            extraInfo.fromPackage = stringExtra;
            extraInfo.fromHost = stringExtra2;
            if (intent.hasExtra(Constants.KEY_FULL_LINK)) {
                extraInfo.fullLink = (TaoBaseService.AccsFullLink) intent.getSerializableExtra(Constants.KEY_FULL_LINK);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "getExtraInfo err", th, new Object[0]);
        }
        return extraInfo;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19058a;
        public final /* synthetic */ String b;
        public final /* synthetic */ AccsDataListener c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Intent e;

        public e(String str, String str2, AccsDataListener accsDataListener, int i, Intent intent) {
            this.f19058a = str;
            this.b = str2;
            this.c = accsDataListener;
            this.d = i;
            this.e = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (f70.b(this.f19058a)) {
                    ALog.e(f70.TAG, "onSendData start dataId:" + this.b + " serviceId:" + this.f19058a, new Object[0]);
                }
                this.c.onSendData(this.f19058a, this.b, this.d, f70.a(this.e));
                if (f70.b(this.f19058a)) {
                    ALog.e(f70.TAG, "onSendData end dataId:" + this.b, new Object[0]);
                }
            } catch (IPCException e) {
                ALog.e(f70.TAG, "onReceiveData onSendData", e, new Object[0]);
            }
            try {
                if (this.e.hasExtra(Constants.KEY_UP_RTT) && this.e.hasExtra("host")) {
                    String stringExtra = this.e.getStringExtra("host");
                    long longExtra = this.e.getLongExtra(Constants.KEY_UP_RTT, 0L);
                    NetworkDetector.getRTTDetector().recordRTT(stringExtra, 2, longExtra);
                    ALog.e(f70.TAG, "recordRTT", "host", stringExtra, "rtt", Long.valueOf(longExtra));
                }
            } catch (Throwable th) {
                ALog.e(f70.TAG, "NetworkDetector err", th, new Object[0]);
            }
        }
    }

    public static void c(Context context, Intent intent, String str, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f9c7db", new Object[]{context, intent, str, map});
        } else if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("host");
                String stringExtra2 = intent.getStringExtra("source");
                String stringExtra3 = intent.getStringExtra("target");
                String stringExtra4 = intent.getStringExtra("appKey");
                String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                short shortExtra = intent.getShortExtra("flags", (short) 0);
                com.taobao.accs.a accsInstance = ACCSManager.getAccsInstance(context, stringExtra4, stringExtra5);
                if (accsInstance != null) {
                    map.put(20, "1");
                    accsInstance.delaySendBusinessAck(stringExtra3, stringExtra2, str, shortExtra, stringExtra, map);
                } else {
                    c71.c("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, "no acsmgr sendDelayedBizAck", vu3.b.GEO_NOT_SUPPORT);
                }
            } catch (Throwable th) {
                ALog.e(TAG, "sendDelayedBizAck", th, new Object[0]);
                c71.c("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, th.toString(), vu3.b.GEO_NOT_SUPPORT);
            }
        }
    }

    public static int h(Context context, Intent intent, AccsDataListener accsDataListener) {
        String str;
        String str2;
        Exception e2;
        TaoBaseService.ExtraInfo f2;
        String str3;
        DataReceiveMonitor dataReceiveMonitor;
        String str4 = "onReceiveData";
        String str5 = "accs";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9787fa20", new Object[]{context, intent, accsDataListener})).intValue();
        }
        if (accsDataListener == null || context == null) {
            ALog.e(TAG, "onReceiveData listener or context null", new Object[0]);
            return 2;
        } else if (intent == null) {
            return 2;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    int intExtra = intent.getIntExtra("command", -1);
                    int intExtra2 = intent.getIntExtra("errorCode", 0);
                    String stringExtra = intent.getStringExtra(Constants.KEY_USER_ID);
                    String stringExtra2 = intent.getStringExtra("dataId");
                    str2 = intent.getStringExtra("serviceId");
                    ALog.e(TAG, str4, "dataId", stringExtra2, "serviceId", str2, "command", Integer.valueOf(intExtra), "className", accsDataListener.getClass().getName());
                    try {
                        if (intExtra > 0) {
                            try {
                                c71.c(str5, BaseMonitor.COUNT_POINT_TO_BUSS, "3commandId=" + intExtra + "serviceId=" + str2, vu3.b.GEO_NOT_SUPPORT);
                                if (intExtra == 5) {
                                    str4 = str5;
                                    str = str4;
                                    str5 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                    str2 = "1";
                                    d(str2, new a(accsDataListener, str2, intExtra2, intent));
                                } else if (intExtra == 6) {
                                    str4 = str5;
                                    str = str4;
                                    str5 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                    str2 = "1";
                                    d(str2, new b(accsDataListener, str2, intExtra2, intent));
                                } else if (intExtra == 100) {
                                    str4 = str5;
                                    str = str4;
                                    str5 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                    str2 = "1";
                                    if (TextUtils.equals(Constants.SEND_TYPE_RES, intent.getStringExtra(Constants.KEY_SEND_TYPE))) {
                                        d(str2, new d(str2, stringExtra2, accsDataListener, intExtra2, intent.getByteArrayExtra("data"), intent));
                                    } else {
                                        d(str2, new e(str2, stringExtra2, accsDataListener, intExtra2, intent));
                                    }
                                } else if (intExtra == 101) {
                                    try {
                                        byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                                        boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_NEED_BUSINESS_ACK, false);
                                        if (byteArrayExtra != null) {
                                            try {
                                                if (intent.getBooleanExtra(Constants.KEY_INVOKE_MAIN, false) && UtilityImpl.isMainProcess(context)) {
                                                    ALog.d(TAG, "KEY_INVOKE_MAIN: ", "serviceId", str2);
                                                    c71.c(str5, BaseMonitor.COUNT_INVOKE_MAIN, str2, vu3.b.GEO_NOT_SUPPORT);
                                                }
                                                if (g(str2)) {
                                                    ALog.e(TAG, "onReceiveData COMMAND_RECEIVE_DATA onData dataId:" + stringExtra2 + " serviceId:" + str2, new Object[0]);
                                                }
                                                f2 = f(intent);
                                                if (booleanExtra) {
                                                    ALog.e(TAG, "onReceiveData needBizAck, try to send bizAck", "dataId", stringExtra2);
                                                    if (!Constants.IMPAAS.equals(str2) || !m8l.t()) {
                                                        str3 = str2;
                                                        i(context, intent, stringExtra2, f2.oriExtHeader);
                                                    } else {
                                                        str3 = str2;
                                                        c(context, intent, stringExtra2, f2.oriExtHeader);
                                                    }
                                                } else {
                                                    str3 = str2;
                                                }
                                                try {
                                                    intent.getExtras().setClassLoader(NetPerformanceMonitor.class.getClassLoader());
                                                } catch (Exception e3) {
                                                    ALog.e(TAG, "get NetPerformanceMonitor Error:", e3, new Object[0]);
                                                }
                                                c71.c(str5, BaseMonitor.COUNT_POINT_TO_BUSS_SUCCESS, "1commandId=101serviceId=" + str3, vu3.b.GEO_NOT_SUPPORT);
                                                dataReceiveMonitor = DataReceiveMonitor.get(intent);
                                                if (dataReceiveMonitor != null) {
                                                    dataReceiveMonitor.accsHandlerTime = currentTimeMillis;
                                                    dataReceiveMonitor.accsExecTime = System.currentTimeMillis();
                                                }
                                                str4 = str5;
                                                str = str4;
                                                str5 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                            } catch (Exception e4) {
                                                e2 = e4;
                                                str4 = str5;
                                                str = str4;
                                                str5 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                            }
                                            try {
                                                d(str3, new c(dataReceiveMonitor, str3, stringExtra2, intExtra, accsDataListener, booleanExtra, intent, context, stringExtra, byteArrayExtra, f2));
                                                return 2;
                                            } catch (Exception e5) {
                                                e2 = e5;
                                                str2 = "1";
                                                c71.a(str4, str5, "", str2, "callback error" + e2.toString());
                                                ALog.e(TAG, str, e2, new Object[0]);
                                                return 2;
                                            }
                                        } else {
                                            str4 = str5;
                                            str = str4;
                                            try {
                                                ALog.e(TAG, "onReceiveData COMMAND_RECEIVE_DATA msg null", new Object[0]);
                                                str2 = "1";
                                                str5 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                            } catch (Exception e6) {
                                                e2 = e6;
                                                str2 = "1";
                                                str5 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                            }
                                            try {
                                                c71.a(str4, str5, str2, str2, "COMMAND_RECEIVE_DATA msg null");
                                                return 2;
                                            } catch (Exception e7) {
                                                e2 = e7;
                                                c71.a(str4, str5, "", str2, "callback error" + e2.toString());
                                                ALog.e(TAG, str, e2, new Object[0]);
                                                return 2;
                                            }
                                        }
                                    } catch (Exception e8) {
                                        e2 = e8;
                                        str4 = str5;
                                        str = str4;
                                        str5 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                        str2 = "1";
                                    }
                                } else if (intExtra == 103) {
                                    boolean booleanExtra2 = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
                                    String stringExtra3 = intent.getStringExtra("host");
                                    String stringExtra4 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
                                    boolean booleanExtra3 = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
                                    boolean booleanExtra4 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
                                    if (TextUtils.isEmpty(stringExtra3)) {
                                        return 2;
                                    }
                                    if (booleanExtra2) {
                                        d(str2, new g(accsDataListener, stringExtra3, booleanExtra3, booleanExtra4));
                                        return 2;
                                    }
                                    d(str2, new h(accsDataListener, stringExtra3, booleanExtra3, booleanExtra4, intExtra2, stringExtra4));
                                    return 2;
                                } else if (intExtra != 104) {
                                    ALog.w(TAG, "onReceiveData command not handled", new Object[0]);
                                    return 2;
                                } else {
                                    boolean booleanExtra5 = intent.getBooleanExtra(Constants.KEY_ANTI_BRUSH_RET, false);
                                    ALog.e(TAG, "onReceiveData anti brush result:" + booleanExtra5, new Object[0]);
                                    d(str2, new f(accsDataListener, booleanExtra5));
                                    return 2;
                                }
                            } catch (Exception e9) {
                                e2 = e9;
                                str4 = str5;
                                str = str4;
                                str5 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                                str2 = "1";
                            }
                        } else {
                            str = str4;
                            str2 = "1";
                            str4 = str5;
                            str5 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                            ALog.w(TAG, "onReceiveData command not handled", new Object[0]);
                        }
                        return 2;
                    } catch (Exception e10) {
                        e2 = e10;
                    }
                } catch (Exception e11) {
                    e2 = e11;
                    str = str4;
                    str2 = "1";
                    str4 = str5;
                    str5 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                }
            } finally {
            }
        }
    }

    public static void i(Context context, Intent intent, String str, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6f939e", new Object[]{context, intent, str, map});
            return;
        }
        try {
            ALog.i(TAG, "sendBusinessAck", "dataId", str);
            if (intent != null) {
                String stringExtra = intent.getStringExtra("host");
                String stringExtra2 = intent.getStringExtra("source");
                String stringExtra3 = intent.getStringExtra("target");
                String stringExtra4 = intent.getStringExtra("appKey");
                String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                short shortExtra = intent.getShortExtra("flags", (short) 0);
                com.taobao.accs.a accsInstance = ACCSManager.getAccsInstance(context, stringExtra4, stringExtra5);
                if (accsInstance != null) {
                    accsInstance.sendBusinessAck(stringExtra3, stringExtra2, str, shortExtra, stringExtra, map);
                    c71.c("accs", BaseMonitor.COUNT_BUSINESS_ACK_SUCC, "", vu3.b.GEO_NOT_SUPPORT);
                } else {
                    c71.c("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, "no acsmgr", vu3.b.GEO_NOT_SUPPORT);
                }
            }
        } catch (Throwable th) {
            ALog.e(TAG, "sendBusinessAck", th, new Object[0]);
            c71.c("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, th.toString(), vu3.b.GEO_NOT_SUPPORT);
        }
    }
}
