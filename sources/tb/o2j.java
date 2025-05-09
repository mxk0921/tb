package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.taobao.windvane.jsbridge.api.WVFile;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsMainService;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.MessageFilter;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.init.Launcher_InitPush;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.NoTraceTriggerHelper;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.exception.IPCException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o2j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Set<String> c;
    public static volatile o2j d = null;

    /* renamed from: a  reason: collision with root package name */
    public String f25096a;
    public int b;

    static {
        t2o.a(343933093);
    }

    public static /* synthetic */ Set b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c8f10726", new Object[0]);
        }
        return c;
    }

    public static o2j f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o2j) ipChange.ipc$dispatch("129e8b0c", new Object[0]);
        }
        if (d == null) {
            synchronized (o2j.class) {
                try {
                    if (d == null) {
                        d = new o2j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static /* synthetic */ void q(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f965b054", new Object[]{context, intent});
        } else {
            f().e(context, intent);
        }
    }

    public String g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e630668", new Object[]{this, context});
        }
        return xd0.msgService;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0 A[Catch: IPCException -> 0x0193, TryCatch #0 {IPCException -> 0x0193, blocks: (B:65:0x016b, B:74:0x018d, B:79:0x0198, B:81:0x01a0, B:82:0x01a4), top: B:94:0x016b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.content.Context r27, android.content.Intent r28, java.lang.String r29, java.lang.String r30, int r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, com.taobao.accs.IAppReceiver r35, int r36) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.o2j.l(android.content.Context, android.content.Intent, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, com.taobao.accs.IAppReceiver, int):void");
    }

    public final boolean r(String str, String str2, Intent intent) {
        byte[] byteArrayExtra;
        MessageFilter messageFilter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f0f9b35", new Object[]{this, str, str2, intent})).booleanValue();
        }
        try {
            byteArrayExtra = intent.getByteArrayExtra("data");
            messageFilter = GlobalClientInfo.FILTERS.get(str);
        } catch (Throwable th) {
            ALog.e("MsgDistribute", "msgFilter err", th, new Object[0]);
        }
        if (byteArrayExtra != null && messageFilter != null && messageFilter.onReceiveBackgroundMessage(str2, byteArrayExtra)) {
            return true;
        }
        if ("amp-sync".equals(str) && "imba".equals(((HashMap) intent.getSerializableExtra(TaoBaseService.ExtraInfo.EXT_HEADER)).get(4))) {
            ALog.e("MsgDistribute", "imba filtered", new Object[0]);
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f25097a;

        public a(Context context) {
            this.f25097a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ALog.e("MsgDistribute", "reportToken by uploadVendorToken", new Object[0]);
                Launcher_InitPush.manuMonitor.isAgooControlCmd = true;
                Launcher_InitPush.initPushChannel((Application) this.f25097a);
                y2w.a((Application) this.f25097a);
            } catch (Throwable th) {
                ALog.e("MsgDistribute", "reportToken by uploadVendorToken err", th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25098a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Intent c;

        public b(String str, String str2, Intent intent) {
            this.f25098a = str;
            this.b = str2;
            this.c = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (o2j.b() != null && o2j.b().contains(this.f25098a)) {
                ALog.e("MsgDistribute", "routing msg time out, try election", "dataId", this.f25098a, "serviceId", this.b);
                o2j.b().remove(this.f25098a);
                c71.a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "", "timeout", "pkg:" + this.c.getPackage());
            }
        }
    }

    public static void d(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a32d07c", new Object[]{context, intent});
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("dataId");
            if (UtilityImpl.isServiceIdPrintLog(intent.getStringExtra("serviceId"))) {
                ALog.e("MsgDistribute", "distribMessage", "dataId", stringExtra);
            }
            brt.h().execute(new Runnable() { // from class: tb.n2j
                @Override // java.lang.Runnable
                public final void run() {
                    o2j.q(context, intent);
                }
            });
        } catch (Throwable th) {
            ALog.e("MsgDistribute", "distribMessage", th, new Object[0]);
        }
    }

    public final boolean i(Context context, String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33c87215", new Object[]{this, context, str, intent})).booleanValue();
        }
        if (!str.equals(Constants.TARGET_SERVICE_AGOO_CONTROL_CMD)) {
            return false;
        }
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            if (!(byteArrayExtra == null || byteArrayExtra.length == 0)) {
                String str2 = new String(byteArrayExtra, "utf-8");
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.i("MsgDistribute", "handle AgooReportToken,", "message", str2);
                }
                if (!TextUtils.isEmpty(str2) && "uploadVendorToken".equals(new JSONObject(str2).getString(Constants.KEY_CMD_TYPE))) {
                    brt.h().schedule(new a(context), 3L, TimeUnit.SECONDS);
                }
            }
        } catch (Throwable th) {
            ALog.e("MsgDistribute", "handleAgooReportToken err", th, new Object[0]);
        }
        return true;
    }

    public final boolean j(Context context, String str, Intent intent) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bfe7522", new Object[]{this, context, str, intent})).booleanValue();
        }
        if (!str.equals("agooControl")) {
            return false;
        }
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            if (!(byteArrayExtra == null || byteArrayExtra.length == 0)) {
                String str2 = new String(byteArrayExtra, "utf-8");
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.i("MsgDistribute", "handle agooControl message", "message", str2);
                }
                if (!TextUtils.isEmpty(str2)) {
                    JSONObject jSONObject = new JSONObject(str2);
                    boolean z = jSONObject.getBoolean(Constants.KEY_CONTROL);
                    j8l.F(context, Constants.KEY_CONTROL, z);
                    if (!(!z || (jSONArray = jSONObject.getJSONArray(Constants.KEY_PACKAGES)) == null || jSONArray.length() == 0)) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            NoTraceTriggerHelper.f(context, jSONArray.getString(i), 4);
                        }
                    }
                }
            }
        } catch (Exception e) {
            ALog.e("MsgDistribute", "handleBusinessMsg process agooControl message error", e, new Object[0]);
        }
        return true;
    }

    public final boolean p(Context context, Intent intent) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18b2d6be", new Object[]{this, context, intent})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            ALog.e("MsgDistribute", "handleSyncMessage err", th, new Object[0]);
        }
        if (!(intent.getBooleanExtra(Constants.KEY_SKIP_SYNC, false) || (map = (Map) intent.getSerializableExtra(TaoBaseService.ExtraInfo.EXT_HEADER)) == null || map.size() == 0)) {
            String str = (String) map.get(34);
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("streamId");
                int optInt = jSONObject.optInt("streamSeqNum");
                String stringExtra = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                if (!TextUtils.isEmpty(optString) && optInt > 0 && !TextUtils.isEmpty(stringExtra)) {
                    if (!com.taobao.accs.connection.state.a.v().A(context)) {
                        ALog.e("MsgDistribute", "handleSyncMessage drop", new Object[0]);
                        return true;
                    }
                    intent.putExtra(Constants.KEY_STREAM_ID, optString);
                    intent.putExtra(Constants.KEY_STREAM_SEQ, optInt);
                    if (UtilityImpl.isMainProcess(context)) {
                        AccsMainService.a(intent);
                    } else {
                        intent.putExtra(Constants.KEY_REUSE_BINDER, false);
                        intent.setClassName(context, AccsMainService.className);
                        lef.f(context, intent);
                    }
                    synchronized (this) {
                        if (!TextUtils.isEmpty(this.f25096a) && optString.equals(this.f25096a)) {
                            int i = this.b;
                            if (optInt >= i && optInt - i <= 1) {
                                c71.b("accs", BaseMonitor.ALARM_MSG_ORDER, "");
                                this.b = Math.max(optInt, this.b);
                            }
                            ALog.e("MsgDistribute", "out of order", "dataId", intent.getStringExtra("dataId"), "streamSeq", Integer.valueOf(optInt), "streamCacheSeq", Integer.valueOf(this.b));
                            c71.a("accs", BaseMonitor.ALARM_MSG_ORDER, "", "", "");
                            this.b = Math.max(optInt, this.b);
                        }
                        this.f25096a = optString;
                        this.b = optInt;
                        this.b = Math.max(optInt, this.b);
                    }
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean c(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b0f4756", new Object[]{this, new Integer(i), str, str2})).booleanValue();
        }
        if (i != 100 && !GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            long usableSpace = UtilityImpl.getUsableSpace();
            if (usableSpace != -1 && usableSpace <= WVFile.FILE_MAX_SIZE) {
                c71.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "space low");
                ALog.e("MsgDistribute", "user space low, don't distribute", "size", Long.valueOf(usableSpace), "serviceId", str);
                return true;
            }
        }
        return false;
    }

    public final boolean o(Context context, Intent intent, String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cab47e50", new Object[]{this, context, intent, str, str2})).booleanValue();
        }
        boolean booleanExtra = intent.getBooleanExtra("routingAck", false);
        boolean booleanExtra2 = intent.getBooleanExtra("routingMsg", false);
        if (booleanExtra) {
            ALog.e("MsgDistribute", "recieve routiong ack", "dataId", str, "serviceId", str2);
            Set<String> set = c;
            if (set != null) {
                ((HashSet) set).remove(str);
            }
            c71.b("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "");
            z = true;
        } else {
            z = false;
        }
        if (booleanExtra2) {
            try {
                String stringExtra = intent.getStringExtra("packageName");
                ALog.e("MsgDistribute", "send routiong ack", "dataId", str, "to pkg", stringExtra, "serviceId", str2);
                Intent intent2 = new Intent(Constants.ACTION_COMMAND);
                intent2.putExtra("command", 106);
                intent2.setClassName(stringExtra, xd0.channelService);
                intent2.putExtra("routingAck", true);
                intent2.putExtra("packageName", stringExtra);
                intent2.putExtra("dataId", str);
                lef.f(context, intent2);
            } catch (Throwable th) {
                ALog.e("MsgDistribute", "send routing ack", th, "serviceId", str2);
            }
        }
        return z;
    }

    public void h(Context context, Map<String, IAppReceiver> map, Intent intent, int i, int i2) {
        TaoBaseService.ConnectInfo connectInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e671b1d0", new Object[]{this, context, map, intent, new Integer(i), new Integer(i2)});
            return;
        }
        ALog.e("MsgDistribute", "handBroadCastMsg", "command", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry<String, IAppReceiver> entry : map.entrySet()) {
                Map<String, String> allService = GlobalClientInfo.getInstance(context).getAllService(entry.getKey());
                if (allService == null) {
                    try {
                        allService = entry.getValue().getAllServices();
                    } catch (IPCException e) {
                        ALog.e("MsgDistribute", "handBroadCastMsg getAllServices", e, new Object[0]);
                    }
                }
                if (allService != null) {
                    hashMap.putAll(allService);
                }
            }
        }
        if (i == 103) {
            ALog.e("MsgDistribute", "handBroadCastMsg ACTION_CONNECT_INFO in MsgDistributeService", new Object[0]);
            for (String str : hashMap.keySet()) {
                if ("accs".equals(str) || "windvane".equals(str) || "motu-remote".equals(str)) {
                    String str2 = (String) hashMap.get(str);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = GlobalClientInfo.getInstance(context).getService(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setClassName(context, str2);
                        lef.f(context, intent);
                    }
                }
            }
            boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
            String stringExtra = intent.getStringExtra("host");
            String stringExtra2 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
            boolean booleanExtra2 = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
            boolean booleanExtra3 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
            if (!TextUtils.isEmpty(stringExtra)) {
                if (booleanExtra) {
                    connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3);
                } else {
                    connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3, i2, stringExtra2);
                }
                connectInfo.connected = booleanExtra;
            } else {
                connectInfo = null;
            }
            if (connectInfo != null) {
                ALog.d("MsgDistribute", "handBroadCastMsg ACTION_CONNECT_INFO", connectInfo);
                Intent intent2 = new Intent(Constants.ACTION_CONNECT_INFO);
                intent2.setPackage(context.getPackageName());
                intent2.putExtra(Constants.KEY_CONNECT_INFO, connectInfo);
                context.sendBroadcast(intent2);
            } else {
                ALog.e("MsgDistribute", "handBroadCastMsg connect info null, host empty", new Object[0]);
            }
            if (intent.getBooleanExtra(Constants.KEY_INVOKE_MAIN, false) && UtilityImpl.isMainProcess(context)) {
                ALog.d("MsgDistribute", "KEY_INVOKE_MAIN: 103", new Object[0]);
                c71.c("accs", BaseMonitor.COUNT_INVOKE_MAIN, "103", vu3.b.GEO_NOT_SUPPORT);
            }
        } else if (i == 104) {
            for (String str3 : hashMap.keySet()) {
                String str4 = (String) hashMap.get(str3);
                if (TextUtils.isEmpty(str4)) {
                    str4 = GlobalClientInfo.getInstance(context).getService(str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    intent.setClassName(context, str4);
                    lef.f(context, intent);
                }
            }
        } else {
            ALog.w("MsgDistribute", "handBroadCastMsg not handled command", new Object[0]);
        }
    }

    public final boolean n(Context context, Intent intent, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ade8983d", new Object[]{this, context, intent, str, str2, str3})).booleanValue();
        }
        AccsClientConfig configByTag = !TextUtils.isEmpty(str3) ? AccsClientConfig.getConfigByTag(str3) : null;
        if (context.getPackageName().equals(intent.getPackage())) {
            return false;
        }
        try {
            NoTraceTriggerHelper.f(context, intent.getPackage(), 6);
            boolean z = configByTag != null && configByTag.isPullUpEnable();
            c71.c("accs", BaseMonitor.COUNT_FULL_VERIFY, "handleRoutingMsg-" + z, vu3.b.GEO_NOT_SUPPORT);
            ALog.e("MsgDistribute", "start MsgDistributeService", "receive pkg", context.getPackageName(), "target pkg", intent.getPackage(), "serviceId", str2);
            if (z) {
                intent.setClassName(intent.getPackage(), xd0.msgService);
                intent.putExtra("routingMsg", true);
                intent.putExtra("packageName", context.getPackageName());
                lef.f(context, intent);
                if (c == null) {
                    c = new HashSet();
                }
                c.add(str);
                brt.m(new b(str, str2, intent), 10L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            c71.a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "", "exception", th.toString());
            ALog.e("MsgDistribute", "routing msg error, try election", th, "serviceId", str2, "dataId", str);
        }
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:26:0x00bb
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public void e(android.content.Context r31, android.content.Intent r32) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.o2j.e(android.content.Context, android.content.Intent):void");
    }

    public void k(Context context, IAppReceiver iAppReceiver, Intent intent, String str, String str2, int i, int i2) {
        AccsDataListener accsDataListener;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e37bf7", new Object[]{this, context, iAppReceiver, intent, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        if (UtilityImpl.isServiceIdPrintLog(str)) {
            ALog.e("MsgDistribute", "handleBusinessMsg start", "dataId", str2, "serviceId", str, "command", Integer.valueOf(i));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!j(context, str, intent)) {
            if (("OPPO".equals(Build.BRAND) && !UtilityImpl.isAppKeepAlive()) || !i(context, str, intent)) {
                String service = GlobalClientInfo.getInstance(context).getService(intent.getStringExtra(Constants.KEY_CONFIG_TAG), str);
                if (TextUtils.isEmpty(service) && iAppReceiver != null) {
                    try {
                        service = iAppReceiver.getService(str);
                    } catch (IPCException unused) {
                    }
                }
                if (TextUtils.isEmpty(service)) {
                    service = GlobalClientInfo.getInstance(context).getService(str);
                }
                boolean isEmpty = TextUtils.isEmpty(service);
                boolean z = !isEmpty;
                if (isEmpty || !UtilityImpl.isMainProcess(context) || !j8l.z(context, 4, str)) {
                    accsDataListener = null;
                } else {
                    accsDataListener = GlobalClientInfo.getInstance(context).getListener(str);
                    z = accsDataListener == null;
                }
                DataReceiveMonitor dataReceiveMonitor = DataReceiveMonitor.get(intent);
                if (dataReceiveMonitor != null) {
                    dataReceiveMonitor.startBusinessTime = currentTimeMillis;
                    if (z) {
                        str3 = "service";
                    } else {
                        str3 = DataReceiveMonitor.CB_LISTENER;
                    }
                    dataReceiveMonitor.callback = str3;
                    dataReceiveMonitor.dispatchTime = System.currentTimeMillis();
                }
                if (z) {
                    if (UtilityImpl.isServiceIdPrintLog(str)) {
                        ALog.e("MsgDistribute", "handleBusinessMsg to start service", "className", service);
                    }
                    intent.setClassName(context, service);
                    lef.f(context, intent);
                } else {
                    if (accsDataListener == null) {
                        accsDataListener = GlobalClientInfo.getInstance(context).getListener(str);
                    }
                    if (accsDataListener != null) {
                        f70.h(context, intent, accsDataListener);
                    } else if (!TextUtils.isEmpty(str) && !m8l.d().contains(str)) {
                        ALog.e("MsgDistribute", "handleBusinessMsg getListener also null", "serviceId", str, "dataId", str2);
                        c71.c("accs", BaseMonitor.COUNT_MSG_LOST, "no listener", vu3.b.GEO_NOT_SUPPORT);
                        c71.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "service is null");
                    }
                }
                c71.c("accs", BaseMonitor.COUNT_POINT_TO_BUSS, "2commandId=" + i + "serviceId=" + str, vu3.b.GEO_NOT_SUPPORT);
            }
        }
    }

    public boolean m(Context context, String str, String str2, Intent intent, IAppReceiver iAppReceiver) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c760ef8a", new Object[]{this, context, str, str2, intent, iAppReceiver})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String service = GlobalClientInfo.getInstance(context).getService(intent.getStringExtra(Constants.KEY_CONFIG_TAG), str);
            if (TextUtils.isEmpty(service) && iAppReceiver != null) {
                try {
                    service = iAppReceiver.getService(str);
                } catch (IPCException unused) {
                }
            }
            if (TextUtils.isEmpty(service)) {
                service = GlobalClientInfo.getInstance(context).getService(str);
            }
            if (UtilityImpl.isChannelProcess(context) && !com.taobao.accs.connection.state.a.v().A(context) && r(str, str2, intent)) {
                ALog.e("MsgDistribute", "message filtered", "serviceId", str, "dataId", str2);
                c71.c("accs", BaseMonitor.COUNT_VERIFY, "message_filter_" + str, vu3.b.GEO_NOT_SUPPORT);
                return true;
            } else if (!j8l.z(context, 5, str) || com.taobao.accs.connection.state.a.v().A(context)) {
                if (!TextUtils.isEmpty(service) || UtilityImpl.isMainProcess(context)) {
                    z = false;
                } else {
                    ALog.e("MsgDistribute", "start MsgDistributeService", "dataId", str2);
                    intent.setClassName(intent.getPackage(), g(context));
                    lef.f(context, intent);
                }
                return z;
            } else {
                ALog.e("MsgDistribute", "main process not alive, forbidden msg", "serviceId", str);
                return true;
            }
        } catch (Throwable th) {
            ALog.e("MsgDistribute", "handleMsgInChannelProcess", th, new Object[0]);
            return false;
        }
    }
}
