package com.taobao.appfrmbundle.mkt;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.android.base.Versions;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.speed.TBSpeed;
import com.taobao.aranger.exception.IPCException;
import com.taobao.login4android.api.Login;
import com.taobao.mass.MassClient;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.log.TLog;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import com.taobao.tao.messagekit.base.network.MtopConnection;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import com.taobao.tao.powermsg.common.StreamFullLinkMonitor;
import com.taobao.tao.util.GetAppKeyFromSecurity;
import com.ut.device.UTDevice;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.intf.MtopBuilder;
import tb.bzi;
import tb.jg4;
import tb.lkd;
import tb.p2j;
import tb.stj;
import tb.ts1;
import tb.tvq;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MKTHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_SERVER_ID = "pmmonitor";
    public static final String POWER_SERVER_ID = "powermsg";
    public static final String POWER_SERVER_ID_3 = "powermsg3";
    public static final AccsAbstractDataListener accsListener;
    public static final LinkedHashMap<String, Object> d;
    public static final MKTHandler e;
    public AccsReceiverConnection b;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<String, Object> f10058a = new LinkedHashMap() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appfrmbundle/mkt/MKTHandler$1");
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class MtopConnectionImpl extends MtopConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public MtopConnectionImpl(MKTHandler mKTHandler) {
        }

        public static /* synthetic */ Object ipc$super(MtopConnectionImpl mtopConnectionImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appfrmbundle/mkt/MKTHandler$MtopConnectionImpl");
        }

        @Override // com.taobao.tao.messagekit.base.network.MtopConnection
        public void p(Map<String, Object> map, final lkd lkdVar) {
            HashMap hashMap;
            MethodEnum methodEnum;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc746d49", new Object[]{this, map, lkdVar});
                return;
            }
            if (map.containsKey("namespace")) {
                hashMap = new HashMap();
                hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "powermsg");
                hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, "namespace=" + map.get("namespace"));
            } else {
                hashMap = null;
            }
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName((String) map.get("api"));
            mtopRequest.setVersion((String) map.get("version"));
            mtopRequest.setNeedEcode(false);
            mtopRequest.setNeedSession(false);
            mtopRequest.setData((String) map.get("data"));
            MtopBuilder mtopBuilder = new MtopBuilder(mtopRequest, TaoPackageInfo.getTTID());
            if ("post".equals(map.get("req"))) {
                methodEnum = MethodEnum.POST;
            } else {
                methodEnum = MethodEnum.GET;
            }
            MtopBuilder reqContext = mtopBuilder.reqMethod(methodEnum).reqContext(map.get("context"));
            if (hashMap != null) {
                reqContext.headers(hashMap);
            }
            reqContext.addListener(new MtopCallback.MtopFinishListener() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.MtopConnectionImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
                public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
                        return;
                    }
                    MtopResponse mtopResponse = mtopFinishEvent.getMtopResponse();
                    lkdVar.onResult(mtopResponse.getResponseCode(), new HashMap<String, Object>(mtopResponse, obj) { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.MtopConnectionImpl.1.1
                        public final /* synthetic */ Object val$context;
                        public final /* synthetic */ MtopResponse val$mtopResponse;

                        {
                            this.val$mtopResponse = mtopResponse;
                            this.val$context = obj;
                            put("re_msg", mtopResponse.getRetCode());
                            put("result", mtopResponse.getDataJsonObject());
                            put("context", obj);
                        }
                    });
                }
            });
            Object obj = map.get("timeout");
            if (obj != null) {
                reqContext.setSocketTimeoutMilliSecond(((Integer) obj).intValue() * 1000);
            }
            reqContext.asyncRequest();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements jg4.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f10059a;

        public a(MKTHandler mKTHandler, Application application) {
            this.f10059a = application;
        }

        public String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
            }
            if ("init_async".equals(str2)) {
                return String.valueOf(TBSpeed.isSpeedEdition(this.f10059a, "lpmasyn"));
            }
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        }

        public long b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[]{this})).longValue();
            }
            return SDKUtils.getCorrectionTimeMillis();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements MsgLog.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(MKTHandler mKTHandler) {
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            } else {
                TLog.logd(str, str2);
            }
        }

        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
            } else {
                TLog.loge(str, str2);
            }
        }

        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
            } else {
                TLog.logi(str, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements MsgMonitor.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(MKTHandler mKTHandler) {
        }

        public void a(String str, String str2, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aec33a6b", new Object[]{this, str, str2, new Double(d)});
            } else {
                AppMonitor.Counter.commit(str, str2, d);
            }
        }

        public void b(String str, String str2, String str3, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5653f8a1", new Object[]{this, str, str2, str3, new Double(d)});
            } else {
                AppMonitor.Counter.commit(str, str2, str3, d);
            }
        }

        public void c(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("426ed724", new Object[]{this, str, str2, str3, str4});
            } else {
                AppMonitor.Alarm.commitFail(str, str2, str3, str4);
            }
        }

        public void d(String str, String str2, Map<String, String> map, Map<String, Double> map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15d01226", new Object[]{this, str, str2, map, map2});
            } else {
                AppMonitor.Stat.commit(str, str2, DimensionValueSet.fromStringMap(map), MeasureValueSet.create(map2));
            }
        }

        public void e(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aeeeb8e7", new Object[]{this, str, str2});
            } else {
                AppMonitor.Alarm.commitSuccess(str, str2);
            }
        }

        public void f(String str, String str2, List<String> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62e171a0", new Object[]{this, str, str2, list, list2});
            } else {
                AppMonitor.register(str, str2, MeasureSet.create(list2), DimensionSet.create(list));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements p2j.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(MKTHandler mKTHandler) {
        }

        @Override // tb.p2j.b
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fe3957f0", new Object[]{this});
            }
            return Login.getSid();
        }

        @Override // tb.p2j.b
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("14dcb523", new Object[]{this});
            }
            return Login.getUserId();
        }

        @Override // tb.p2j.b
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1f6e2b01", new Object[]{this});
            }
            return null;
        }

        @Override // tb.p2j.b
        public Boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("9183597d", new Object[]{this});
            }
            return Boolean.valueOf(Versions.isDebug());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements tvq.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(MKTHandler mKTHandler) {
        }

        @Override // tb.tvq.a
        public void a(int i, String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d90cf39", new Object[]{this, new Integer(i), str, str2, str3, str4});
            } else {
                MassClient.getInstance().registerTopic("powermsg", str);
            }
        }

        @Override // tb.tvq.a
        public void b(int i, String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3162572", new Object[]{this, new Integer(i), str, str2, str3, str4});
            } else {
                MassClient.getInstance().unregisterTopic("powermsg", str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f extends AccsAbstractDataListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appfrmbundle/mkt/MKTHandler$9");
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
            Map<Integer, String> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            } else if (str != null) {
                String str4 = null;
                if (extraInfo != null) {
                    map = extraInfo.oriExtHeader;
                } else {
                    map = null;
                }
                if (extraInfo != null) {
                    try {
                        Map<TaoBaseService.ExtHeaderType, String> map2 = extraInfo.extHeader;
                        if (map2 != null) {
                            str4 = map2.get(TaoBaseService.ExtHeaderType.TYPE_TAG);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                ts1.h hVar = new ts1.h(str3, 1, str4, bArr, map);
                if (!(extraInfo == null || extraInfo.fullLink == null)) {
                    StreamFullLinkMonitor streamFullLinkMonitor = new StreamFullLinkMonitor();
                    hVar.f = streamFullLinkMonitor;
                    streamFullLinkMonitor.setAccsDownTime(extraInfo.fullLink.accsDownTime);
                    hVar.f.setNetSDKReceivedTime(extraInfo.fullLink.networkReceivedTime);
                    hVar.f.setAccsReceivedTime(extraInfo.fullLink.accsReceivedTime);
                }
                MKTHandler.d().c().f(hVar);
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
            } else if (MKTHandler.b(MKTHandler.d()).containsKey(str2) && i == 200) {
                onData(str, null, str2, bArr, extraInfo);
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
            } else if (MKTHandler.a().containsKey(str2)) {
                MKTHandler.d().c().q(str2, str, i, extraInfo);
            } else {
                MKTHandler.d().c().p(str2, str, i, null);
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
            }
        }
    }

    static {
        System.setProperty("rx.scheduler.jdk6.purge-frequency-millis", "30000");
        System.setProperty("rx.ring-buffer.size", "300");
        int i = 2;
        int availableProcessors = Runtime.getRuntime().availableProcessors() / 2;
        StringBuilder sb = new StringBuilder("");
        if (availableProcessors >= 2) {
            i = availableProcessors;
        }
        sb.append(i);
        System.setProperty("rx.scheduler.max-computation-threads", sb.toString());
        d = new LinkedHashMap() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appfrmbundle/mkt/MKTHandler$2");
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry entry) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
                }
                if (size() > 1000) {
                    return true;
                }
                return false;
            }
        };
        e = new MKTHandler();
        accsListener = new f();
    }

    public static /* synthetic */ LinkedHashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("c9b7093", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ LinkedHashMap b(MKTHandler mKTHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("3fe0425c", new Object[]{mKTHandler});
        }
        return mKTHandler.f10058a;
    }

    public static MKTHandler d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MKTHandler) ipChange.ipc$dispatch("b137364c", new Object[0]);
        }
        return e;
    }

    public AccsReceiverConnection c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsReceiverConnection) ipChange.ipc$dispatch("3e7826d0", new Object[]{this});
        }
        return this.b;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class AccsReceiverConnection extends AccsConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final AccsStateReceiver g = new AccsStateReceiver();
        public final Context h;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class AccsStateReceiver extends BroadcastReceiver {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public AccsStateReceiver(AccsReceiverConnection accsReceiverConnection) {
            }

            public static /* synthetic */ Object ipc$super(AccsStateReceiver accsStateReceiver, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appfrmbundle/mkt/MKTHandler$AccsReceiverConnection$AccsStateReceiver");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                try {
                    TaoBaseService.ConnectInfo connectInfo = (TaoBaseService.ConnectInfo) intent.getSerializableExtra(Constants.KEY_CONNECT_INFO);
                    if (connectInfo != null) {
                        MsgLog.e("AccsStateReceiver", Boolean.valueOf(connectInfo.connected), Integer.valueOf(connectInfo.errorCode), connectInfo.errordetail);
                        AccsReceiverConnection c = MKTHandler.d().c();
                        if (connectInfo.connected) {
                            i = 1000;
                        } else {
                            i = 2000;
                        }
                        c.m(i, new HashMap<String, String>(connectInfo) { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.AccsReceiverConnection.AccsStateReceiver.1
                            public final /* synthetic */ TaoBaseService.ConnectInfo val$info;

                            {
                                this.val$info = connectInfo;
                                put(ts1.CONNECTION_CODE, "" + connectInfo.errorCode);
                            }
                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public AccsReceiverConnection(Context context) {
            this.h = context;
        }

        public static /* synthetic */ Object ipc$super(AccsReceiverConnection accsReceiverConnection, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appfrmbundle/mkt/MKTHandler$AccsReceiverConnection");
        }

        public void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b418b1b", new Object[]{this});
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(Constants.ACTION_CONNECT_INFO);
            this.h.registerReceiver(this.g, intentFilter);
        }

        public void p(String str, String str2, int i, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6686798e", new Object[]{this, str, str2, new Integer(i), map});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("service_id", str2);
            if (map != null) {
                hashMap.putAll(map);
            }
            g(str, i, hashMap);
        }

        public void q(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83be9faa", new Object[]{this, str, str2, new Integer(i), extraInfo});
            } else if (extraInfo != null && extraInfo.fullLink != null) {
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("accsUpTime", Long.valueOf(extraInfo.fullLink.accsUpTime));
                    hashMap.put("send2NetworkStartTime", Long.valueOf(extraInfo.fullLink.send2NetworkStartTime));
                    hashMap.put("send2NetworkEndTime", Long.valueOf(extraInfo.fullLink.send2NetworkEndTime));
                    g(str, i, hashMap);
                } catch (Exception e) {
                    MsgLog.f("MKTHandler", e, "onSendData2 err");
                }
            }
        }

        @Override // com.taobao.tao.messagekit.base.network.AccsConnection
        public void n(AccsConnection.DataPackage dataPackage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f0cce21", new Object[]{this, dataPackage});
                return;
            }
            String str = "";
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(str + p2j.d(), dataPackage.e, dataPackage.c(), dataPackage.d);
            accsRequest.setTarget(dataPackage.f());
            try {
                if (!TextUtils.isEmpty(dataPackage.f)) {
                    accsRequest.setHost(new URL(dataPackage.f));
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
                MsgLog.f(AccsConnection.TAG, e, new Object[0]);
            }
            if ("powermsg3".equals(dataPackage.e)) {
                HashMap hashMap = new HashMap();
                hashMap.put(35, dataPackage.getRouteInfo());
                accsRequest.setExt(hashMap);
                try {
                    if (dataPackage.g()) {
                        str = ACCSClient.getAccsClient(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG).sendRequest(accsRequest);
                        if (!TextUtils.isEmpty(str)) {
                            MKTHandler.b(MKTHandler.this).put(str, null);
                        }
                    } else {
                        accsRequest.timeout = 5000;
                        str = ACCSClient.getAccsClient(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG).sendData(accsRequest);
                        if (!TextUtils.isEmpty(str)) {
                            MKTHandler.a().put(str, null);
                        }
                    }
                } catch (AccsException e2) {
                    e2.printStackTrace();
                }
                MsgLog.g("MKTHandler", "send pm3", "msgid:", dataPackage.d, "accs-dataid:", str, "isSendRequest:", Boolean.valueOf(dataPackage.g()));
                return;
            }
            ACCSManager.sendData(p2j.h, accsRequest);
        }
    }

    public void e(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
        } else if (!this.c.getAndSet(true)) {
            AccsReceiverConnection accsReceiverConnection = new AccsReceiverConnection(application);
            this.b = accsReceiverConnection;
            stj.b(accsReceiverConnection);
            this.b.o();
            stj.b(new MtopConnectionImpl(this));
            jg4.e(new a(this, application));
            MsgLog.l(new b(this));
            MsgMonitor.h(new c(this));
            p2j.a(application, UTDevice.getUtdid(Globals.getApplication()), GetAppKeyFromSecurity.getAppKey(0), -1, new HashMap<Integer, String>() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.6
                {
                    put(1, "powermsg");
                    put(2, "pmmonitor");
                    put(5, "powermsg3");
                }
            }, new d(this));
            MsgRouter.e().b().d(307, new bzi());
            MsgRouter.e().i().a(new e(this));
            try {
                ACCSClient accsClient = ACCSClient.getAccsClient();
                AccsAbstractDataListener accsAbstractDataListener = accsListener;
                accsClient.registerDataListener("powermsg", accsAbstractDataListener);
                ACCSClient.getAccsClient().registerDataListener("powermsg3", accsAbstractDataListener);
            } catch (Exception e2) {
                y7t.a("MKTHandler", "something wrong to register ACCS listener");
                e2.printStackTrace();
            }
        }
    }
}
