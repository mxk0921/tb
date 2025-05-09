package anet.channel.detect;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.assist.ICapability;
import anet.channel.assist.ISysNetworkCapability;
import anet.channel.assist.NetworkAssist;
import anet.channel.bytes.ByteArray;
import anet.channel.detect.NetworkDetector;
import anet.channel.entity.ConnInfo;
import anet.channel.request.Request;
import anet.channel.session.HttpSession;
import anet.channel.statist.NetworkDiagnosticStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anet.channel.util.Inet64Util;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.android.netutil.NetUtils;
import org.android.netutil.PingEntry;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.json.JSONException;
import tb.ktj;
import tb.pg1;
import tb.t2o;
import tb.xau;
import tb.y1r;
import tb.zzc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ExceptionDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACCS_HOST = "msgacs.m.taobao.com";
    private static final String CDN_HOST = "gw.alicdn.com";
    private static final long EXCEPTION_EXPIRED_TIME = 1800000;
    private static final int MAX_LENGTH = 10;
    private static final String MTOP_HOST = "guide-acs.m.taobao.com";
    private static final int PING_MAX_TIME = 3;
    private static final String TAG = "anet.ExceptionDetector";
    private String accsCurrentIp;
    private String cdnCurrentIp;
    private long exceptionDetectExpiredTime;
    private String mtopCurrentIp;
    private int availableMTU = 0;
    private LimitedQueue<Pair<String, Integer>> recentRequestHistory = new LimitedQueue<>(10);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class DetectInfo {
        public String currentIp;
        public Future<PingResponse> defaultFuture;
        public long dnsTime;
        public String host;
        public String localIp;
        public Future<PingResponse> mtu1000Future;
        public Future<PingResponse> mtu1200Future;
        public Future<PingResponse> mtu1460Future;

        static {
            t2o.a(607125585);
        }

        private DetectInfo() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface TaskType {
        public static final int MTU_1000 = 2;
        public static final int MTU_1200 = 3;
        public static final int MTU_1460 = 4;
        public static final int PING = 1;
    }

    static {
        t2o.a(607125579);
    }

    public static /* synthetic */ LimitedQueue access$000(ExceptionDetector exceptionDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LimitedQueue) ipChange.ipc$dispatch("bc7f1ebf", new Object[]{exceptionDetector});
        }
        return exceptionDetector.recentRequestHistory;
    }

    public static /* synthetic */ void access$1000(ExceptionDetector exceptionDetector, String str, JSONObject jSONObject, NetworkDetector.INetworkDiagnosisCallback iNetworkDiagnosisCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecdd33a", new Object[]{exceptionDetector, str, jSONObject, iNetworkDiagnosisCallback});
        } else {
            exceptionDetector.networkDiagnosisCallbackData(str, jSONObject, iNetworkDiagnosisCallback);
        }
    }

    public static /* synthetic */ long access$102(ExceptionDetector exceptionDetector, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd3e3d9", new Object[]{exceptionDetector, new Long(j)})).longValue();
        }
        exceptionDetector.exceptionDetectExpiredTime = j;
        return j;
    }

    public static /* synthetic */ JSONObject access$1100(ExceptionDetector exceptionDetector, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("677930c3", new Object[]{exceptionDetector, networkStatus});
        }
        return exceptionDetector.getLocalNetworkDetectJson(networkStatus);
    }

    public static /* synthetic */ DetectInfo access$1200(ExceptionDetector exceptionDetector, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetectInfo) ipChange.ipc$dispatch("4b625333", new Object[]{exceptionDetector, str, str2});
        }
        return exceptionDetector.buildPingInfo(str, str2);
    }

    public static /* synthetic */ JSONObject access$1300(ExceptionDetector exceptionDetector, DetectInfo detectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("12bfd432", new Object[]{exceptionDetector, detectInfo});
        }
        return exceptionDetector.getPingResult(detectInfo);
    }

    public static /* synthetic */ JSONObject access$1400(ExceptionDetector exceptionDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("de11bef", new Object[]{exceptionDetector});
        }
        return exceptionDetector.getBizDetectJson();
    }

    public static /* synthetic */ JSONObject access$1500(ExceptionDetector exceptionDetector, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("69876fd8", new Object[]{exceptionDetector, str});
        }
        return exceptionDetector.getRequestDetectJson(str);
    }

    public static /* synthetic */ int access$202(ExceptionDetector exceptionDetector, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d34e0658", new Object[]{exceptionDetector, new Integer(i)})).intValue();
        }
        exceptionDetector.availableMTU = i;
        return i;
    }

    public static /* synthetic */ String access$302(ExceptionDetector exceptionDetector, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f703e8f9", new Object[]{exceptionDetector, str});
        }
        exceptionDetector.mtopCurrentIp = str;
        return str;
    }

    public static /* synthetic */ String access$402(ExceptionDetector exceptionDetector, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d77d3efa", new Object[]{exceptionDetector, str});
        }
        exceptionDetector.accsCurrentIp = str;
        return str;
    }

    public static /* synthetic */ String access$502(ExceptionDetector exceptionDetector, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7f694fb", new Object[]{exceptionDetector, str});
        }
        exceptionDetector.cdnCurrentIp = str;
        return str;
    }

    public static /* synthetic */ boolean access$600(ExceptionDetector exceptionDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8e6dc20", new Object[]{exceptionDetector})).booleanValue();
        }
        return exceptionDetector.isNeedExceptionDetect();
    }

    public static /* synthetic */ JSONObject access$700(ExceptionDetector exceptionDetector) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb4f68db", new Object[]{exceptionDetector});
        }
        return exceptionDetector.exceptionDetectTask();
    }

    public static /* synthetic */ JSONObject access$900(ExceptionDetector exceptionDetector, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1b22efdc", new Object[]{exceptionDetector, networkStatus});
        }
        return exceptionDetector.getNetworkInfoJson(networkStatus);
    }

    private DetectInfo buildPingInfo(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetectInfo) ipChange.ipc$dispatch("47e02bef", new Object[]{this, str, str2});
        }
        DetectInfo detectInfo = new DetectInfo();
        detectInfo.host = str;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            detectInfo.localIp = InetAddress.getByName(str).getHostAddress();
            detectInfo.dnsTime = System.currentTimeMillis() - currentTimeMillis;
        } catch (UnknownHostException unused) {
        }
        if (!TextUtils.isEmpty(str2)) {
            detectInfo.currentIp = str2;
        } else {
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
            if (connStrategyListByHost != null && !connStrategyListByHost.isEmpty()) {
                detectInfo.currentIp = connStrategyListByHost.get(0).getIp();
            }
        }
        if (!TextUtils.isEmpty(detectInfo.currentIp)) {
            str3 = detectInfo.currentIp;
        } else {
            str3 = detectInfo.localIp;
        }
        if (!TextUtils.isEmpty(str3)) {
            detectInfo.defaultFuture = new PingTask(str3, 1000, 3, 0, 0).launch();
            detectInfo.mtu1000Future = new PingTask(str3, 1000, 3, 972, 0).launch();
            detectInfo.mtu1200Future = new PingTask(str3, 1000, 3, 1172, 0).launch();
            detectInfo.mtu1460Future = new PingTask(str3, 1000, 3, 1432, 0).launch();
        }
        return detectInfo;
    }

    private JSONObject getBizDetectJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e798178f", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<Pair<String, Integer>> it = this.recentRequestHistory.iterator();
        while (it.hasNext()) {
            Pair<String, Integer> next = it.next();
            jSONObject2.put((String) next.first, next.second);
        }
        jSONObject.put("bizDetect", (Object) jSONObject2);
        return jSONObject;
    }

    private JSONObject getNetworkInfoJson(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("90e3df00", new Object[]{this, networkStatus});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) networkStatus.getType());
        jSONObject.put("subType", (Object) NetworkStatusHelper.getNetworkSubType());
        if (networkStatus != NetworkStatusHelper.NetworkStatus.NO) {
            if (networkStatus.isMobile()) {
                jSONObject.put("apn", (Object) NetworkStatusHelper.getApn());
                jSONObject.put(DispatchConstants.CARRIER, (Object) NetworkStatusHelper.getCarrier());
            } else {
                jSONObject.put(DispatchConstants.BSSID, (Object) NetworkStatusHelper.getWifiBSSID());
                jSONObject.put("ssid", (Object) NetworkStatusHelper.getWifiSSID());
            }
            jSONObject.put(pg1.ATOM_proxy, (Object) NetworkStatusHelper.getProxyType());
            jSONObject.put("ipStack", (Object) Integer.valueOf(Inet64Util.getStackType()));
        }
        return jSONObject;
    }

    public int getAvailableMTU() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27ce1195", new Object[]{this})).intValue();
        }
        return this.availableMTU;
    }

    public void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
        } else {
            NetworkStatusHelper.addStatusChangeListener(new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: anet.channel.detect.ExceptionDetector.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
                public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                    } else {
                        ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.detect.ExceptionDetector.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                ExceptionDetector.access$000(ExceptionDetector.this).clear();
                                ExceptionDetector.access$102(ExceptionDetector.this, 0L);
                                ExceptionDetector.access$202(ExceptionDetector.this, 0);
                            }
                        });
                    }
                }
            });
        }
    }

    public void startNetworkDiagnosis(final NetworkDetector.INetworkDiagnosisCallback iNetworkDiagnosisCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d8af661", new Object[]{this, iNetworkDiagnosisCallback});
        } else {
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anet.channel.detect.ExceptionDetector.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:46:0x015b
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
                    */
                @Override // java.lang.Runnable
                public void run() {
                    /*
                        Method dump skipped, instructions count: 447
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: anet.channel.detect.ExceptionDetector.AnonymousClass3.run():void");
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
        }
    }

    private JSONObject getRequestDetectJson(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be31c15", new Object[]{this, str});
        }
        HttpUrl parse = HttpUrl.parse(str);
        final JSONObject jSONObject = new JSONObject();
        if (parse == null) {
            return jSONObject;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Request build = new Request.Builder().setUrl(parse).setMethod("GET").build();
        final long currentTimeMillis = System.currentTimeMillis();
        new HttpSession(GlobalAppRuntimeInfo.getContext(), new ConnInfo(parse.host(), "exceptionDetect", null)).request(build, new RequestCb() { // from class: anet.channel.detect.ExceptionDetector.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.RequestCb
            public void onDataReceive(ByteArray byteArray, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                }
            }

            @Override // anet.channel.RequestCb
            public void onFinish(int i, String str2, RequestStatistic requestStatistic) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i), str2, requestStatistic});
                    return;
                }
                jSONObject.put("detectUrl", (Object) str);
                jSONObject.put("statusCode", (Object) Integer.valueOf(i));
                jSONObject.put("errorMsg", (Object) str2);
                jSONObject.put("requestTime", (Object) Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                countDownLatch.countDown();
            }

            @Override // anet.channel.RequestCb
            public void onResponseCode(int i, Map<String, List<String>> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                }
            }
        });
        try {
            countDownLatch.await(20000L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void networkDiagnosisCallbackData(String str, JSONObject jSONObject, NetworkDetector.INetworkDiagnosisCallback iNetworkDiagnosisCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46af1080", new Object[]{this, str, jSONObject, iNetworkDiagnosisCallback});
        } else if (iNetworkDiagnosisCallback != null && jSONObject != null) {
            jSONObject.put("type", (Object) str);
            jSONObject.put(xau.PROPERTY_IS_FINISH, (Object) Boolean.FALSE);
            ALog.e(TAG, "networkDiagnosisCallbackData :" + jSONObject.toString(), null, new Object[0]);
            iNetworkDiagnosisCallback.onNetworkDiagnosisFinished(jSONObject);
        }
    }

    public void commitDetect(final RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f95087", new Object[]{this, requestStatistic});
        } else if (!AwcnConfig.isNetworkDetectEnable()) {
            ALog.i(TAG, "exception detect closed.", null, new Object[0]);
        } else {
            ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.detect.ExceptionDetector.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        RequestStatistic requestStatistic2 = requestStatistic;
                        if (requestStatistic2 != null) {
                            if (!TextUtils.isEmpty(requestStatistic2.ip) && requestStatistic.ret == 0) {
                                if ("guide-acs.m.taobao.com".equalsIgnoreCase(requestStatistic.host)) {
                                    ExceptionDetector.access$302(ExceptionDetector.this, requestStatistic.ip);
                                } else if (ExceptionDetector.ACCS_HOST.equalsIgnoreCase(requestStatistic.host)) {
                                    ExceptionDetector.access$402(ExceptionDetector.this, requestStatistic.ip);
                                } else if (ExceptionDetector.CDN_HOST.equalsIgnoreCase(requestStatistic.host)) {
                                    ExceptionDetector.access$502(ExceptionDetector.this, requestStatistic.ip);
                                }
                            }
                            if (!TextUtils.isEmpty(requestStatistic.url)) {
                                ExceptionDetector.access$000(ExceptionDetector.this).add(Pair.create(requestStatistic.url, Integer.valueOf(requestStatistic.statusCode)));
                            }
                            if (ExceptionDetector.access$600(ExceptionDetector.this)) {
                                ExceptionDetector.access$700(ExceptionDetector.this);
                                ICapability capability = NetworkAssist.getAssistManager().getCapability(3);
                                if (capability != null && capability.isEnable()) {
                                    ((ISysNetworkCapability) capability).syncAppState(true);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        ALog.e(ExceptionDetector.TAG, "network detect fail.", null, th, new Object[0]);
                    }
                }
            });
        }
    }

    private JSONObject getLocalNetworkDetectJson(NetworkStatusHelper.NetworkStatus networkStatus) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ec21d84a", new Object[]{this, networkStatus});
        }
        if (networkStatus.isWifi()) {
            str = NetUtils.getDefaultGateway("114.114.114.114");
        } else {
            str = NetUtils.getPreferNextHop("114.114.114.114", 2);
        }
        Future<PingResponse> launch = !TextUtils.isEmpty(str) ? new PingTask(str, 1000, 3, 0, 0).launch() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nextHop", (Object) str);
        jSONObject.put("ping", (Object) getPingResponse(1, launch));
        return jSONObject;
    }

    private boolean isNeedExceptionDetect() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20ccee5d", new Object[]{this})).booleanValue();
        }
        if (this.recentRequestHistory.size() != 10) {
            return false;
        }
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.NO) {
            ALog.e(TAG, "no network", null, new Object[0]);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.exceptionDetectExpiredTime) {
            return false;
        }
        Iterator<Pair<String, Integer>> it = this.recentRequestHistory.iterator();
        int i = 0;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next().second).intValue();
            if (intValue == -202 || intValue == -400 || intValue == -401 || intValue == -405 || intValue == -406) {
                i++;
            }
        }
        if (i * 2 > 10) {
            z = true;
        }
        if (z) {
            this.exceptionDetectExpiredTime = currentTimeMillis + 1800000;
        }
        return z;
    }

    private ArrayList<String> traceRoute(String str, int i) {
        PingResponse pingResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("4d52c2e8", new Object[]{this, str, new Integer(i)});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i2 = 0;
        while (i2 < i) {
            i2++;
            try {
                pingResponse = new PingTask(str, 0, 1, 0, i2).launch().get();
            } catch (Exception unused) {
                pingResponse = null;
            }
            StringBuilder sb = new StringBuilder();
            if (pingResponse != null) {
                String lastHopIPStr = pingResponse.getLastHopIPStr();
                double d = pingResponse.getResults()[0].rtt;
                int errcode = pingResponse.getErrcode();
                if (TextUtils.isEmpty(lastHopIPStr)) {
                    lastHopIPStr = "*";
                }
                sb.append("hop=");
                sb.append(lastHopIPStr);
                sb.append(",rtt=");
                sb.append(d);
                sb.append(",errCode=");
                sb.append(errcode);
            }
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    private JSONObject exceptionDetectTask() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f226409e", new Object[]{this});
        }
        ALog.e(TAG, "[network_diagnosis_auto]start.", null, new Object[0]);
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        JSONObject jSONObject = new JSONObject();
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        jSONObject.put("networkInfo", (Object) getNetworkInfoJson(status));
        jSONObject.put("localDetect", (Object) getLocalNetworkDetectJson(status));
        DetectInfo buildPingInfo = buildPingInfo("guide-acs.m.taobao.com", this.mtopCurrentIp);
        DetectInfo buildPingInfo2 = buildPingInfo(CDN_HOST, this.cdnCurrentIp);
        DetectInfo buildPingInfo3 = buildPingInfo(ACCS_HOST, this.accsCurrentIp);
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(getPingResult(buildPingInfo));
        jSONArray.add(getPingResult(buildPingInfo2));
        jSONArray.add(getPingResult(buildPingInfo3));
        jSONObject.put("internetDetect", (Object) jSONArray);
        jSONObject.put("bizDetect", (Object) getBizDetectJson());
        ALog.e(TAG, "[network_diagnosis_auto]finish.", null, "result", jSONObject.toString());
        AppMonitor.getInstance().commitStat(new NetworkDiagnosticStat(2));
        zzc a2 = ktj.a();
        if (a2 != null) {
            a2.c().a();
        }
        return jSONObject;
    }

    private JSONObject getPingResult(DetectInfo detectInfo) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f31e482e", new Object[]{this, detectInfo});
        }
        JSONObject jSONObject = new JSONObject();
        if (!(detectInfo == null || detectInfo.defaultFuture == null)) {
            jSONObject.put("host", (Object) detectInfo.host);
            jSONObject.put("currentIp", (Object) detectInfo.currentIp);
            jSONObject.put("localIp", (Object) detectInfo.localIp);
            jSONObject.put("dnsTime", (Object) Long.valueOf(detectInfo.dnsTime));
            jSONObject.put("ping", (Object) getPingResponse(1, detectInfo.defaultFuture));
            jSONObject.put("MTU1000", (Object) getPingResponse(2, detectInfo.mtu1000Future));
            jSONObject.put("MTU1200", (Object) getPingResponse(3, detectInfo.mtu1200Future));
            jSONObject.put("MTU1460", (Object) getPingResponse(4, detectInfo.mtu1460Future));
            if ("guide-acs.m.taobao.com".equals(detectInfo.host)) {
                if (!TextUtils.isEmpty(detectInfo.currentIp)) {
                    str = detectInfo.currentIp;
                } else {
                    str = detectInfo.localIp;
                }
                ArrayList<String> traceRoute = traceRoute(str, 5);
                JSONObject jSONObject2 = new JSONObject();
                while (i < traceRoute.size()) {
                    int i2 = i + 1;
                    jSONObject2.put(String.valueOf(i2), (Object) traceRoute.get(i));
                    i = i2;
                }
                jSONObject.put("traceRoute", (Object) jSONObject2);
            }
        }
        return jSONObject;
    }

    private JSONObject getPingResponse(int i, Future<PingResponse> future) {
        PingResponse pingResponse;
        PingEntry[] results;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("147c78b3", new Object[]{this, new Integer(i), future});
        }
        JSONObject jSONObject = new JSONObject();
        if (future == null) {
            return jSONObject;
        }
        try {
            pingResponse = future.get();
        } catch (Exception unused) {
            pingResponse = null;
        }
        if (pingResponse == null) {
            return jSONObject;
        }
        jSONObject.put("errCode", Integer.valueOf(pingResponse.getErrcode()));
        int successCnt = pingResponse.getSuccessCnt();
        if (successCnt > 0) {
            if (i == 2) {
                this.availableMTU = Math.max(this.availableMTU, 1000);
            } else if (i == 3) {
                this.availableMTU = Math.max(this.availableMTU, 1200);
            } else if (i == 4) {
                this.availableMTU = Math.max(this.availableMTU, 1460);
            }
        }
        jSONObject.put("successCnt", Integer.valueOf(successCnt));
        JSONArray jSONArray = new JSONArray();
        for (PingEntry pingEntry : pingResponse.getResults()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(y1r.COL_SEQ, (Object) Integer.valueOf(pingEntry.seq));
            jSONObject2.put("hop", (Object) Integer.valueOf(pingEntry.hop));
            jSONObject2.put("rtt", (Object) Double.valueOf(pingEntry.rtt));
            jSONArray.add(jSONObject2);
        }
        jSONObject.put("pingCnt", Integer.valueOf(jSONArray.size()));
        jSONObject.put("response", (Object) jSONArray);
        return jSONObject;
    }
}
