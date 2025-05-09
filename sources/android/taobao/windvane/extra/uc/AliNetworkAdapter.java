package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.taobao.windvane.extra.performance2.WVWPData;
import android.taobao.windvane.extra.uc.interfaces.EventHandler;
import android.taobao.windvane.extra.uc.interfaces.INetwork;
import android.taobao.windvane.extra.uc.interfaces.IRequest;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.util.HttpConstant;
import anetwork.channel.Header;
import anetwork.channel.IBodyHandler;
import anetwork.channel.Network;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.http.HttpNetwork;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.riverlogger.RVLLevel;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.http.ParseException;
import org.json.JSONException;
import org.json.JSONObject;
import tb.aka;
import tb.bka;
import tb.gtw;
import tb.icn;
import tb.j2x;
import tb.lcn;
import tb.og8;
import tb.t2o;
import tb.trw;
import tb.tz8;
import tb.urb;
import tb.v7t;
import tb.vpw;
import tb.wpw;
import tb.wqw;
import tb.x74;
import tb.y71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AliNetworkAdapter implements INetwork, urb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOGTAG = "AliNetwork";
    public static final int NETWORK_WORKING_MODE_ASYNC = 1;
    public static final int NETWORK_WORKING_MODE_SYNC = 0;
    private static String RVLOG_NETWORK_MODEL = "WindVane/Network";
    private static boolean enableAir = false;
    private static IOnSgHttpRequestCallback iOnSgHttpRequestCallback;
    private int BUFFER_SIZE;
    private String bizCode;
    public boolean isReload;
    public boolean isStop;
    private boolean isUseWebpImg;
    private Network mAliNetwork;
    private Context mContext;
    private int mNetworkType;
    private WVUCWebView mWebView;
    private int mWorkingMode;
    public HashSet<EventHandler> mainRequest;
    private String pid;
    private String uid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AliNetCallback implements NetworkCallBack.FinishListener, NetworkCallBack.ResponseCodeListener, NetworkCallBack.ProgressListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public urb id;
        public EventHandler mEventHandler;
        public IRequest mReq;
        public String mUrl;
        public int size = 0;
        public int total = 0;

        static {
            t2o.a(989856041);
            t2o.a(607125966);
            t2o.a(607125969);
            t2o.a(607125968);
        }

        public AliNetCallback() {
        }

        private String getCacheUrlFromWebView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aa12ed6d", new Object[]{this});
            }
            if (AliNetworkAdapter.access$000(AliNetworkAdapter.this) != null) {
                return AliNetworkAdapter.access$000(AliNetworkAdapter.this).getCachedUrl();
            }
            return null;
        }

        private void monitorOnResponse(int i, String str, String str2, boolean z, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3becd1a7", new Object[]{this, new Integer(i), str, str2, new Boolean(z), map});
            } else if (trw.getWVNetWorkMonitorInterface() != null) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                trw.getWVNetWorkMonitorInterface().onResponse(this.mUrl, str2, i, z, map);
                if (i >= 400) {
                    wpUpload(str2, i, str, z);
                } else if (i >= 200 && i < 300) {
                    try {
                        if (z) {
                            AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData.setPageCurrentStatus(WVWPData.RESPONSE_HTML);
                        } else if (str == null) {
                        } else {
                            if (str.endsWith(".js")) {
                                AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData.setPageCurrentStatus(WVWPData.RESPONSE_JS);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        private void monitorOnResponseNew(int i, String str, String str2, boolean z, Map<String, List<String>> map, boolean z2, IRequest iRequest) {
            RVLLevel rVLLevel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("703defab", new Object[]{this, new Integer(i), str, str2, new Boolean(z), map, new Boolean(z2), iRequest});
                return;
            }
            monitorOnResponse(i, str, str2, z, map);
            if (iRequest instanceof AliRequestAdapter) {
                AliRequestAdapter aliRequestAdapter = (AliRequestAdapter) iRequest;
                if (z2) {
                    rVLLevel = RVLLevel.Info;
                } else {
                    rVLLevel = RVLLevel.Warn;
                }
                lcn.a(rVLLevel, AliNetworkAdapter.access$400()).k("response", aliRequestAdapter.getCurId()).m(aliRequestAdapter.getPId()).a("url", str).a("statusCode", Integer.valueOf(i)).a("header", map).f();
            }
        }

        private void monitorWebpResource(String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("926ab5d5", new Object[]{this, str});
            } else if (j2x.needSampleWebp()) {
                if (AliNetworkAdapter.access$000(AliNetworkAdapter.this) != null) {
                    str2 = AliNetworkAdapter.access$000(AliNetworkAdapter.this).getCachedUrl();
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    j2x.commitWebpResource(str, str2, 3);
                }
            }
        }

        private void reSendRequest(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("726261f2", new Object[]{this, new Integer(i), str});
                return;
            }
            AliRequestAdapter aliRequestAdapter = (AliRequestAdapter) this.mReq;
            Request aliRequest = aliRequestAdapter.getAliRequest();
            Request createRequest = aliRequestAdapter.createRequest(str, aliRequest.getMethod(), aliRequest.getHeaders());
            AliNetworkAdapter.access$100(AliNetworkAdapter.this, createRequest);
            AliNetworkAdapter.access$200(AliNetworkAdapter.this, aliRequestAdapter);
            EventHandler eventHandler = aliRequestAdapter.getEventHandler();
            v7t.d(AliNetworkAdapter.LOGTAG, "404 reSendRequest eventId=" + aliRequestAdapter.getEventHandler().hashCode() + ", unchangedUrl=" + str + ",isSync=" + eventHandler.isSynchronous() + ",errorUrl=" + aliRequest.getUrlString());
            AliNetworkAdapter.access$300(AliNetworkAdapter.this, aliRequestAdapter, createRequest, eventHandler);
            y71.commitFail("reSendRequest", i, str, aliRequest.getUrlString());
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
                return;
            }
            v7t.i(AliNetworkAdapter.LOGTAG, "[onDataReceived] event:" + progressEvent + "event.getSize():" + progressEvent.getSize() + ", data:" + progressEvent.getBytedata().length + " bytes");
            this.mEventHandler.data(progressEvent.getBytedata(), progressEvent.getSize());
            this.size = this.size + progressEvent.getSize();
            if (this.total == 0) {
                this.total = progressEvent.getTotal();
            }
        }

        public void setEventHandler(EventHandler eventHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31cc001", new Object[]{this, eventHandler});
            } else {
                this.mEventHandler = eventHandler;
            }
        }

        public void setId(urb urbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("799f6d32", new Object[]{this, urbVar});
            } else {
                this.id = urbVar;
            }
        }

        public void setRequest(IRequest iRequest) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e61966", new Object[]{this, iRequest});
            } else {
                this.mReq = iRequest;
            }
        }

        public void setURL(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b79a47e", new Object[]{this, str});
            } else {
                this.mUrl = str;
            }
        }

        private void addGreyPageInfo(Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f54fe1e1", new Object[]{this, map});
                return;
            }
            try {
                List<String> list = map.get(aka.KEY_GREY);
                String str = null;
                String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
                List<String> list2 = map.get(aka.KEY_ENV);
                if (list2 != null && list2.size() > 0) {
                    str = list2.get(0);
                }
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    bka.c().a(new aka(this.mUrl, str, str2));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        private void wpUpload(String str, int i, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50bf9432", new Object[]{this, str, new Integer(i), str2, new Boolean(z)});
                return;
            }
            try {
                if (z) {
                    AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData.setHtmlError(i, str2);
                    AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData.ucBkpg = false;
                    v7t.d(AliNetworkAdapter.LOGTAG, "onOccurWhitePage " + str2);
                    if (vpw.commonConfig.n0 >= Math.random()) {
                        y71.commitWPData(str, AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData);
                    }
                } else if (str2 == null) {
                } else {
                    if (str2.endsWith(".js")) {
                        AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData.setJsErrorCode(i, str2);
                        WVWPData wVWPData = AliNetworkAdapter.access$000(AliNetworkAdapter.this).wpData;
                        wVWPData.addProbableReason("js Download failed: errorCode=" + i + " url=" + this.mUrl);
                    }
                }
            } catch (Throwable unused) {
                v7t.d(AliNetworkAdapter.LOGTAG, "");
            }
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            if (AliNetworkAdapter.access$000(AliNetworkAdapter.this) != null) {
                AliNetworkAdapter.access$000(AliNetworkAdapter.this).pageTracker.onResourceFinished(this.mUrl, this.size);
            }
            v7t.d(AliNetworkAdapter.LOGTAG, "onFinished code = " + finishEvent.getHttpCode() + ", url = " + this.mUrl + ", rev_size = " + this.size + ", total_size = " + this.total);
            if (vpw.commonConfig.p3) {
                try {
                    if (AliNetworkAdapter.access$000(AliNetworkAdapter.this) != null) {
                        monitorOnFinished(finishEvent);
                    }
                } catch (Throwable th) {
                    v7t.e(AliNetworkAdapter.LOGTAG, "monitorOnFinished error, url=" + this.mUrl, th, new Object[0]);
                }
            } else {
                monitorOnFinished(finishEvent);
            }
            if (trw.getPerformanceMonitor() != null) {
                try {
                    String str = finishEvent.getStatisticData().connectionType;
                    long j = finishEvent.getStatisticData().tcpConnTime;
                    trw.getPerformanceMonitor().didResourceFinishLoadAtTime(this.mUrl, System.currentTimeMillis(), str, 0L);
                } catch (Throwable th2) {
                    trw.getPerformanceMonitor().didResourceFinishLoadAtTime(this.mUrl, System.currentTimeMillis(), "unknown", 0L);
                    v7t.e(AliNetworkAdapter.LOGTAG, "didResourceFinishLoadAtTime failed ", th2, new Object[0]);
                }
            }
            AliRequestAdapter aliRequestAdapter = (AliRequestAdapter) this.mReq;
            int httpCode = finishEvent.getHttpCode();
            UCNetworkDelegate.getInstance().onFinish(httpCode, this.mUrl);
            if (httpCode < 0) {
                v7t.d(AliNetworkAdapter.LOGTAG, "error code=" + httpCode + ",desc=" + finishEvent.getDesc() + ",url=" + this.mUrl);
                this.mEventHandler.error(httpCode, finishEvent.getDesc());
                aliRequestAdapter.complete();
                return;
            }
            aliRequestAdapter.cancelPhase = AliRequestAdapter.PHASE_ENDDATA;
            this.mEventHandler.endData();
            aliRequestAdapter.complete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
            if (android.text.TextUtils.equals(tb.gtw.i(r3), tb.gtw.i(android.taobao.windvane.extra.uc.AliNetworkAdapter.access$000(r9.this$0).getCachedUrl())) != false) goto L_0x0075;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void monitorOnFinished(anetwork.channel.NetworkEvent.FinishEvent r10) {
            /*
                r9 = this;
                r0 = 1
                r1 = 0
                com.android.alibaba.ip.runtime.IpChange r2 = android.taobao.windvane.extra.uc.AliNetworkAdapter.AliNetCallback.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0016
                java.lang.String r3 = "f74e6fd2"
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r1] = r9
                r4[r0] = r10
                r2.ipc$dispatch(r3, r4)
                return
            L_0x0016:
                tb.vpw.b()
                tb.wpw r2 = tb.vpw.commonConfig
                boolean r2 = r2.H0
                if (r2 == 0) goto L_0x00e0
                if (r10 == 0) goto L_0x00e0
                int r2 = r10.getHttpCode()
                if (r2 >= 0) goto L_0x00e0
                tb.wqw r2 = tb.trw.getWVNetWorkMonitorInterface()
                if (r2 == 0) goto L_0x00e0
                r2 = 0
                android.taobao.windvane.extra.uc.interfaces.IRequest r3 = r9.mReq     // Catch: all -> 0x0055
                if (r3 == 0) goto L_0x0057
                java.util.Map r3 = r3.getHeaders()     // Catch: all -> 0x0055
                if (r3 == 0) goto L_0x0057
                java.lang.String r4 = "Referer"
                java.lang.Object r4 = r3.get(r4)     // Catch: all -> 0x0055
                java.lang.String r4 = (java.lang.String) r4     // Catch: all -> 0x0055
                boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: all -> 0x0050
                if (r2 == 0) goto L_0x0053
                java.lang.String r2 = "referer"
                java.lang.Object r2 = r3.get(r2)     // Catch: all -> 0x0050
                java.lang.String r2 = (java.lang.String) r2     // Catch: all -> 0x0050
                goto L_0x0057
            L_0x0050:
                r2 = r4
                goto L_0x0076
            L_0x0053:
                r2 = r4
                goto L_0x0057
            L_0x0055:
                goto L_0x0076
            L_0x0057:
                java.lang.String r3 = r9.mUrl     // Catch: all -> 0x0055
                if (r3 == 0) goto L_0x0074
                java.lang.String r3 = tb.gtw.i(r3)     // Catch: all -> 0x0055
                android.taobao.windvane.extra.uc.AliNetworkAdapter r4 = android.taobao.windvane.extra.uc.AliNetworkAdapter.this     // Catch: all -> 0x0055
                android.taobao.windvane.extra.uc.WVUCWebView r4 = android.taobao.windvane.extra.uc.AliNetworkAdapter.access$000(r4)     // Catch: all -> 0x0055
                java.lang.String r4 = r4.getCachedUrl()     // Catch: all -> 0x0055
                java.lang.String r4 = tb.gtw.i(r4)     // Catch: all -> 0x0055
                boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch: all -> 0x0055
                if (r3 == 0) goto L_0x0074
                goto L_0x0075
            L_0x0074:
                r0 = 0
            L_0x0075:
                r1 = r0
            L_0x0076:
                tb.wpw r0 = tb.vpw.commonConfig
                boolean r0 = r0.c1
                if (r0 == 0) goto L_0x00c0
                com.taobao.android.riverlogger.RVLLevel r0 = com.taobao.android.riverlogger.RVLLevel.Info
                java.lang.String r3 = android.taobao.windvane.extra.uc.AliNetworkAdapter.access$400()
                tb.icn r0 = tb.lcn.a(r0, r3)
                android.taobao.windvane.extra.uc.AliNetworkAdapter r3 = android.taobao.windvane.extra.uc.AliNetworkAdapter.this
                java.lang.String r3 = r3.getCurId()
                java.lang.String r4 = "finish"
                tb.icn r0 = r0.k(r4, r3)
                android.taobao.windvane.extra.uc.AliNetworkAdapter r3 = android.taobao.windvane.extra.uc.AliNetworkAdapter.this
                android.taobao.windvane.extra.uc.WVUCWebView r3 = android.taobao.windvane.extra.uc.AliNetworkAdapter.access$000(r3)
                android.taobao.windvane.extra.performance2.WVPageTracker r3 = r3.pageTracker
                java.lang.String r3 = r3.getPageIdentifier()
                tb.icn r0 = r0.m(r3)
                java.lang.String r3 = "url"
                java.lang.String r4 = r9.mUrl
                tb.icn r0 = r0.a(r3, r4)
                anetwork.channel.statist.StatisticData r3 = r10.getStatisticData()
                long r3 = r3.totalSize
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.String r4 = "dataSize"
                tb.icn r0 = r0.a(r4, r3)
                r0.f()
            L_0x00c0:
                tb.wqw r3 = tb.trw.getWVNetWorkMonitorInterface()
                java.lang.String r4 = r9.mUrl
                if (r2 != 0) goto L_0x00cd
                java.lang.String r0 = "unknown"
                r5 = r0
                goto L_0x00ce
            L_0x00cd:
                r5 = r2
            L_0x00ce:
                int r6 = r10.getHttpCode()
                r8 = 0
                r7 = r1
                r3.onResponse(r4, r5, r6, r7, r8)
                int r10 = r10.getHttpCode()
                java.lang.String r0 = r9.mUrl
                r9.wpUpload(r2, r10, r0, r1)
            L_0x00e0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.AliNetworkAdapter.AliNetCallback.monitorOnFinished(anetwork.channel.NetworkEvent$FinishEvent):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:116:0x024a A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:11:0x0041, B:13:0x0047, B:15:0x0050, B:19:0x005b, B:21:0x007c, B:22:0x0084, B:24:0x008a, B:26:0x0096, B:28:0x00a2, B:29:0x00b1, B:31:0x00b7, B:32:0x00c4, B:34:0x00ca, B:35:0x00d4, B:36:0x00e1, B:40:0x00f3, B:42:0x0108, B:44:0x0116, B:51:0x012a, B:53:0x0132, B:55:0x0138, B:56:0x013e, B:58:0x0144, B:60:0x014c, B:64:0x015b, B:73:0x017b, B:75:0x0181, B:77:0x0187, B:79:0x0190, B:84:0x01b4, B:93:0x01c9, B:95:0x01d3, B:97:0x01de, B:99:0x01ea, B:101:0x01f4, B:103:0x01fb, B:104:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x021d, B:110:0x0222, B:111:0x0237, B:112:0x023a, B:114:0x0244, B:116:0x024a, B:118:0x0252, B:121:0x025d, B:123:0x0265, B:125:0x027e, B:129:0x0298, B:130:0x02ad, B:132:0x02b1, B:134:0x02b7, B:135:0x02bc, B:136:0x02c9, B:138:0x02d1), top: B:156:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:132:0x02b1 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:11:0x0041, B:13:0x0047, B:15:0x0050, B:19:0x005b, B:21:0x007c, B:22:0x0084, B:24:0x008a, B:26:0x0096, B:28:0x00a2, B:29:0x00b1, B:31:0x00b7, B:32:0x00c4, B:34:0x00ca, B:35:0x00d4, B:36:0x00e1, B:40:0x00f3, B:42:0x0108, B:44:0x0116, B:51:0x012a, B:53:0x0132, B:55:0x0138, B:56:0x013e, B:58:0x0144, B:60:0x014c, B:64:0x015b, B:73:0x017b, B:75:0x0181, B:77:0x0187, B:79:0x0190, B:84:0x01b4, B:93:0x01c9, B:95:0x01d3, B:97:0x01de, B:99:0x01ea, B:101:0x01f4, B:103:0x01fb, B:104:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x021d, B:110:0x0222, B:111:0x0237, B:112:0x023a, B:114:0x0244, B:116:0x024a, B:118:0x0252, B:121:0x025d, B:123:0x0265, B:125:0x027e, B:129:0x0298, B:130:0x02ad, B:132:0x02b1, B:134:0x02b7, B:135:0x02bc, B:136:0x02c9, B:138:0x02d1), top: B:156:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:138:0x02d1 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:11:0x0041, B:13:0x0047, B:15:0x0050, B:19:0x005b, B:21:0x007c, B:22:0x0084, B:24:0x008a, B:26:0x0096, B:28:0x00a2, B:29:0x00b1, B:31:0x00b7, B:32:0x00c4, B:34:0x00ca, B:35:0x00d4, B:36:0x00e1, B:40:0x00f3, B:42:0x0108, B:44:0x0116, B:51:0x012a, B:53:0x0132, B:55:0x0138, B:56:0x013e, B:58:0x0144, B:60:0x014c, B:64:0x015b, B:73:0x017b, B:75:0x0181, B:77:0x0187, B:79:0x0190, B:84:0x01b4, B:93:0x01c9, B:95:0x01d3, B:97:0x01de, B:99:0x01ea, B:101:0x01f4, B:103:0x01fb, B:104:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x021d, B:110:0x0222, B:111:0x0237, B:112:0x023a, B:114:0x0244, B:116:0x024a, B:118:0x0252, B:121:0x025d, B:123:0x0265, B:125:0x027e, B:129:0x0298, B:130:0x02ad, B:132:0x02b1, B:134:0x02b7, B:135:0x02bc, B:136:0x02c9, B:138:0x02d1), top: B:156:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:152:0x032e  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x0335  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0181 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:11:0x0041, B:13:0x0047, B:15:0x0050, B:19:0x005b, B:21:0x007c, B:22:0x0084, B:24:0x008a, B:26:0x0096, B:28:0x00a2, B:29:0x00b1, B:31:0x00b7, B:32:0x00c4, B:34:0x00ca, B:35:0x00d4, B:36:0x00e1, B:40:0x00f3, B:42:0x0108, B:44:0x0116, B:51:0x012a, B:53:0x0132, B:55:0x0138, B:56:0x013e, B:58:0x0144, B:60:0x014c, B:64:0x015b, B:73:0x017b, B:75:0x0181, B:77:0x0187, B:79:0x0190, B:84:0x01b4, B:93:0x01c9, B:95:0x01d3, B:97:0x01de, B:99:0x01ea, B:101:0x01f4, B:103:0x01fb, B:104:0x0204, B:105:0x020a, B:107:0x0216, B:109:0x021d, B:110:0x0222, B:111:0x0237, B:112:0x023a, B:114:0x0244, B:116:0x024a, B:118:0x0252, B:121:0x025d, B:123:0x0265, B:125:0x027e, B:129:0x0298, B:130:0x02ad, B:132:0x02b1, B:134:0x02b7, B:135:0x02bc, B:136:0x02c9, B:138:0x02d1), top: B:156:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01a8  */
        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onResponseCode(int r23, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r24, java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 832
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.AliNetworkAdapter.AliNetCallback.onResponseCode(int, java.util.Map, java.lang.Object):boolean");
        }
    }

    static {
        t2o.a(989856039);
        t2o.a(989856159);
        t2o.a(989856196);
    }

    public AliNetworkAdapter(Context context) {
        this(context, "windvane");
    }

    public static /* synthetic */ WVUCWebView access$000(AliNetworkAdapter aliNetworkAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("c1792d92", new Object[]{aliNetworkAdapter});
        }
        return aliNetworkAdapter.mWebView;
    }

    public static /* synthetic */ void access$100(AliNetworkAdapter aliNetworkAdapter, Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e8d294", new Object[]{aliNetworkAdapter, request});
        } else {
            aliNetworkAdapter.injectTraceContext(request);
        }
    }

    public static /* synthetic */ void access$200(AliNetworkAdapter aliNetworkAdapter, AliRequestAdapter aliRequestAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5448b36", new Object[]{aliNetworkAdapter, aliRequestAdapter});
        } else {
            aliNetworkAdapter.monitorRequest(aliRequestAdapter);
        }
    }

    public static /* synthetic */ void access$300(AliNetworkAdapter aliNetworkAdapter, AliRequestAdapter aliRequestAdapter, Request request, EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac5b9ad", new Object[]{aliNetworkAdapter, aliRequestAdapter, request, eventHandler});
        } else {
            aliNetworkAdapter.syncSendRequest(aliRequestAdapter, request, eventHandler);
        }
    }

    public static /* synthetic */ String access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60292585", new Object[0]);
        }
        return RVLOG_NETWORK_MODEL;
    }

    public static /* synthetic */ int access$500(AliNetworkAdapter aliNetworkAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25a886bd", new Object[]{aliNetworkAdapter})).intValue();
        }
        return aliNetworkAdapter.BUFFER_SIZE;
    }

    public static /* synthetic */ Context access$600(AliNetworkAdapter aliNetworkAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("cb9b8183", new Object[]{aliNetworkAdapter});
        }
        return aliNetworkAdapter.mContext;
    }

    public static void addHttpRequestCallback(IOnSgHttpRequestCallback iOnSgHttpRequestCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00f21c1", new Object[]{iOnSgHttpRequestCallback2});
            return;
        }
        iOnSgHttpRequestCallback = iOnSgHttpRequestCallback2;
        v7t.d(LOGTAG, "addHttpRequestCallback");
    }

    private void asyncSendRequest(AliRequestAdapter aliRequestAdapter, Request request, EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49edb37", new Object[]{this, aliRequestAdapter, request, eventHandler});
            return;
        }
        if (!(request.getHeaders() == null || request.getHeaders().size() == 0)) {
            JSONObject jSONObject = new JSONObject();
            for (Header header : request.getHeaders()) {
                try {
                    jSONObject.put(header.getName(), header.getValue());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        AliNetCallback aliNetCallback = new AliNetCallback();
        aliNetCallback.setId(this);
        aliNetCallback.setEventHandler(eventHandler);
        aliNetCallback.setURL(aliRequestAdapter.getUrl());
        aliNetCallback.setRequest(aliRequestAdapter);
        aliRequestAdapter.setFutureResponse(this.mAliNetwork.asyncSend(request, aliRequestAdapter.originalUrl, null, aliNetCallback));
    }

    public static void clearHttpRequestCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de1fdfc6", new Object[0]);
            return;
        }
        iOnSgHttpRequestCallback = null;
        v7t.d(LOGTAG, "clearHttpRequestCallback");
    }

    private void injectTraceContext(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f2f3b0", new Object[]{this, request});
            return;
        }
        try {
            WVUCWebView wVUCWebView = this.mWebView;
            if (wVUCWebView != null && wVUCWebView.getSpanWrapper() != null) {
                tz8 tz8Var = FalcoGlobalTracer.get();
                if (tz8Var != null) {
                    request.setTraceContext(tz8Var.c(this.mWebView.getSpanWrapper().a()));
                }
            } else if (this.mWebView == null) {
                v7t.i(LOGTAG, "webView == null");
            } else {
                v7t.i(LOGTAG, "webView.getFalcoSpan() == null");
            }
        } catch (Throwable th) {
            v7t.d(LOGTAG, x74.i(th));
        }
    }

    public static void setEnableAir(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef20fc8", new Object[]{new Boolean(z)});
        } else {
            enableAir = z;
        }
    }

    private void setRequestBodyHandler(Request request, AliRequestAdapter aliRequestAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313a83f", new Object[]{this, request, aliRequestAdapter});
        } else if (aliRequestAdapter.getUploadFileTotalLen() != 0) {
            Map<String, String> uploadFileMap = aliRequestAdapter.getUploadFileMap();
            Map<String, byte[]> uploadDataMap = aliRequestAdapter.getUploadDataMap();
            request.setBodyHandler(new IBodyHandler(uploadFileMap.size() + uploadDataMap.size(), uploadFileMap, uploadDataMap) { // from class: android.taobao.windvane.extra.uc.AliNetworkAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public byte[] buffer;
                public List<InputStream> instream;
                public final /* synthetic */ Map val$dataMap;
                public final /* synthetic */ Map val$fileMap;
                public final /* synthetic */ int val$totalFileNum;
                public boolean isCompleted = false;
                public int postedLen = 0;
                public int curFilenum = 0;
                public String fileNameValue = null;
                public byte[] dataValue = null;
                public boolean hasInitilized = false;

                {
                    this.val$totalFileNum = r2;
                    this.val$fileMap = uploadFileMap;
                    this.val$dataMap = uploadDataMap;
                    this.buffer = new byte[AliNetworkAdapter.access$500(AliNetworkAdapter.this)];
                    this.instream = new ArrayList(r2);
                }

                @Override // anetwork.channel.IBodyHandler
                public boolean isCompleted() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("8c6bb44c", new Object[]{this})).booleanValue();
                    }
                    boolean z = this.isCompleted;
                    if (!z) {
                        return z;
                    }
                    this.isCompleted = false;
                    this.hasInitilized = false;
                    try {
                        for (InputStream inputStream : this.instream) {
                            inputStream.close();
                        }
                        this.instream.clear();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;
                }

                public void initStream() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ef4b4137", new Object[]{this});
                        return;
                    }
                    try {
                        this.curFilenum = 0;
                        while (true) {
                            int i = this.curFilenum;
                            if (i < this.val$totalFileNum) {
                                this.fileNameValue = (String) this.val$fileMap.get(String.valueOf(i));
                                this.dataValue = (byte[]) this.val$dataMap.get(String.valueOf(this.curFilenum));
                                if (v7t.h() && this.dataValue != null) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("len =");
                                    sb.append(this.dataValue.length);
                                    sb.append(",datavalue=");
                                    byte[] bArr = this.dataValue;
                                    sb.append(new String(bArr, 0, bArr.length));
                                    v7t.a(AliNetworkAdapter.LOGTAG, sb.toString());
                                }
                                String str = this.fileNameValue;
                                if (str == null) {
                                    this.instream.add(this.curFilenum, new ByteArrayInputStream(this.dataValue));
                                } else if (str.toLowerCase().startsWith("content://")) {
                                    this.instream.add(this.curFilenum, AliNetworkAdapter.access$600(AliNetworkAdapter.this).getContentResolver().openInputStream(Uri.parse(this.fileNameValue)));
                                } else {
                                    this.instream.add(this.curFilenum, new FileInputStream(this.fileNameValue));
                                }
                                this.curFilenum++;
                            } else {
                                return;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override // anetwork.channel.IBodyHandler
                public int read(byte[] bArr) {
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
                    }
                    if (!this.hasInitilized) {
                        initStream();
                        List<InputStream> list = this.instream;
                        if (list == null || list.size() == 0) {
                            this.isCompleted = true;
                            return 0;
                        }
                        this.hasInitilized = true;
                    }
                    for (InputStream inputStream : this.instream) {
                        try {
                            if (AliNetworkAdapter.access$500(AliNetworkAdapter.this) > bArr.length) {
                                i = bArr.length;
                            } else {
                                i = AliNetworkAdapter.access$500(AliNetworkAdapter.this);
                            }
                            int read = inputStream.read(this.buffer, 0, i);
                            if (read != -1) {
                                System.arraycopy(this.buffer, 0, bArr, 0, read);
                                this.postedLen += read;
                                v7t.i(AliNetworkAdapter.LOGTAG, "read len=" + read);
                                return read;
                            }
                        } catch (Exception e) {
                            v7t.i(AliNetworkAdapter.LOGTAG, "read exception" + e.getMessage());
                            this.isCompleted = true;
                            return 0;
                        }
                    }
                    v7t.i(AliNetworkAdapter.LOGTAG, "read finish");
                    this.isCompleted = true;
                    return 0;
                }
            });
        }
    }

    public static boolean willLog(EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a80d945", new Object[]{eventHandler})).booleanValue();
        }
        int resourceType = eventHandler.getResourceType();
        boolean isSynchronous = eventHandler.isSynchronous();
        if (resourceType == 0 || resourceType == 14 || isSynchronous) {
            return true;
        }
        return false;
    }

    public void destoryWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78625e6c", new Object[]{this});
        } else {
            this.mWebView = null;
        }
    }

    @Override // tb.urb
    public String getCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24aaca54", new Object[]{this});
        }
        return "WVNet_" + this.uid;
    }

    public int getErrorFromException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9892708e", new Object[]{this, th})).intValue();
        }
        if (th instanceof ParseException) {
            return -43;
        }
        if (th instanceof SocketTimeoutException) {
            return -46;
        }
        if (th instanceof SocketException) {
            return -47;
        }
        if (th instanceof IOException) {
            return -44;
        }
        if (th instanceof IllegalStateException) {
            return -45;
        }
        if (th instanceof UnknownHostException) {
            return -2;
        }
        return -99;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public int getNetworkType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("700d68cc", new Object[]{this})).intValue();
        }
        return 1;
    }

    public String getPId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc67dba4", new Object[]{this});
        }
        return this.pid;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return "1.0";
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public boolean sendRequest(IRequest iRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f55a9b04", new Object[]{this, iRequest})).booleanValue();
        }
        return sendRequestInternal((AliRequestAdapter) iRequest);
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.bizCode = str;
        }
    }

    public void setId(urb urbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799f6d32", new Object[]{this, urbVar});
        } else if (urbVar != null) {
            this.pid = urbVar.getCurId();
        }
    }

    public void updateCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ea03b9", new Object[]{this});
            return;
        }
        this.uid = "" + urb.id.addAndGet(1);
    }

    public AliNetworkAdapter(Context context, String str) {
        this(context, 2, str);
    }

    private boolean sendRequestInternal(AliRequestAdapter aliRequestAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99a0d8fe", new Object[]{this, aliRequestAdapter})).booleanValue();
        }
        Request aliRequest = aliRequestAdapter.getAliRequest();
        injectTraceContext(aliRequest);
        monitorRequest(aliRequestAdapter);
        EventHandler eventHandler = aliRequestAdapter.getEventHandler();
        v7t.i(LOGTAG, "requestURL eventId=" + aliRequestAdapter.getEventHandler().hashCode() + ", url=" + aliRequestAdapter.getUrl() + ",isSync=" + eventHandler.isSynchronous());
        int i = this.mWorkingMode;
        if (i == 0) {
            syncSendRequest(aliRequestAdapter, aliRequest, eventHandler);
        } else if (i == 1) {
            asyncSendRequest(aliRequestAdapter, aliRequest, eventHandler);
        }
        return true;
    }

    public AliNetworkAdapter(Context context, String str, WVUCWebView wVUCWebView) {
        this(context, 2, str);
        this.mWebView = wVUCWebView;
    }

    private void monitorRequest(AliRequestAdapter aliRequestAdapter) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee01600b", new Object[]{this, aliRequestAdapter});
            return;
        }
        try {
            String url = aliRequestAdapter.getUrl();
            if (url != null && TextUtils.equals(gtw.i(url), gtw.i(this.mWebView.getCachedUrl()))) {
                z = true;
            }
            if (z) {
                this.mWebView.wpData.setPageCurrentStatus(WVWPData.REQUEST_HTML);
            } else if (url != null && url.endsWith(".js")) {
                this.mWebView.wpData.setPageCurrentStatus(WVWPData.REQUEST_JS);
            }
            if (vpw.commonConfig.c1) {
                icn m = lcn.a(RVLLevel.Info, RVLOG_NETWORK_MODEL).k("request", getCurId()).m(this.mWebView.pageTracker.getPageIdentifier());
                if (z) {
                    m.a("isPage", 1);
                }
                m.a("url", url).a("method", aliRequestAdapter.getMethod()).a("header", aliRequestAdapter.getHeaders());
                m.f();
            }
        } catch (Throwable unused) {
        }
    }

    private void syncSendRequest(AliRequestAdapter aliRequestAdapter, Request request, EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da0038", new Object[]{this, aliRequestAdapter, request, eventHandler});
            return;
        }
        Response syncSend = this.mAliNetwork.syncSend(request, null);
        Throwable error = syncSend.getError();
        if (error != null) {
            eventHandler.error(getErrorFromException(error), error.toString());
            return;
        }
        int statusCode = syncSend.getStatusCode();
        String str = syncSend.getStatisticData().connectionType;
        if (TextUtils.isEmpty(str) || !str.startsWith(ConnType.HTTP2)) {
            eventHandler.status(0, 0, statusCode, "");
        } else {
            eventHandler.status(2, 0, statusCode, "");
        }
        if (v7t.h()) {
            v7t.a(LOGTAG, "status code=" + statusCode);
        }
        eventHandler.headers(syncSend.getConnHeadFields());
        byte[] bytedata = syncSend.getBytedata();
        if (bytedata != null) {
            eventHandler.data(bytedata, bytedata.length);
        }
        aliRequestAdapter.cancelPhase = AliRequestAdapter.PHASE_ENDDATA;
        eventHandler.endData();
    }

    public AliNetworkAdapter(Context context, int i) {
        this(context, i, "windvane");
    }

    public AliNetworkAdapter(Context context, int i, String str) {
        this.mNetworkType = -1;
        this.mWorkingMode = 1;
        this.BUFFER_SIZE = 1024;
        this.isUseWebpImg = true;
        this.bizCode = "";
        this.isReload = false;
        this.isStop = false;
        this.pid = "";
        this.uid = "";
        this.mainRequest = new HashSet<>();
        this.mContext = context;
        this.mNetworkType = i;
        this.bizCode = str;
        if (vpw.commonConfig.d > Math.random()) {
            this.isUseWebpImg = true;
        } else {
            this.isUseWebpImg = false;
        }
        int i2 = this.mNetworkType;
        if (i2 == 0) {
            this.mAliNetwork = new HttpNetwork(context);
        } else if (i2 == 1 || i2 == 2) {
            this.mAliNetwork = new DegradableNetwork(context);
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public IRequest formatRequest(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRequest) ipChange.ipc$dispatch("5c346fdd", new Object[]{this, eventHandler, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2)});
        }
        updateCurId();
        String tryDecodeUrl = Escape.tryDecodeUrl(str);
        if (og8.b() && enableAir) {
            map.put(aka.KEY_GREY, "true");
        }
        if (trw.getWVNetWorkMonitorInterface() != null) {
            String str3 = map.get(HttpConstant.REFERER);
            wqw wVNetWorkMonitorInterface = trw.getWVNetWorkMonitorInterface();
            if (str3 == null) {
                str3 = "unknown";
            }
            wVNetWorkMonitorInterface.onFormatRequest(tryDecodeUrl, str3, str2);
        }
        WVHeaderManager.getInstance().addCustomRequestHeaderCheck(tryDecodeUrl, map);
        sgRequestCheck(tryDecodeUrl, str2, z, map, map2, map3, map4, i);
        AliRequestAdapter aliRequestAdapter = new AliRequestAdapter(eventHandler, tryDecodeUrl, str2, z, map, map2, map3, map4, j, i, i2, this.isUseWebpImg, this.bizCode, this.mContext);
        if (vpw.commonConfig.c1) {
            aliRequestAdapter.setCurId(getCurId());
        }
        aliRequestAdapter.setId(this.pid);
        if (this.isReload) {
            aliRequestAdapter.cancelPhase = "reload";
        }
        setRequestBodyHandler(aliRequestAdapter.getAliRequest(), aliRequestAdapter);
        eventHandler.setRequest(aliRequestAdapter);
        eventHandler.setResourceType(i);
        return aliRequestAdapter;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public boolean requestURL(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85230ab7", new Object[]{this, eventHandler, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2)})).booleanValue();
        }
        updateCurId();
        v7t.i(LOGTAG, "requestURL:" + str + " isUCProxyReq:" + z + " requestType:" + i);
        String tryDecodeUrl = Escape.tryDecodeUrl(str);
        if (og8.b() && enableAir) {
            map.put(aka.KEY_GREY, "true");
        }
        AliRequestAdapter aliRequestAdapter = new AliRequestAdapter(eventHandler, tryDecodeUrl, str2, z, map, map2, map3, map4, j, i, i2, this.isUseWebpImg, this.bizCode, this.mContext);
        if (vpw.commonConfig.c1) {
            aliRequestAdapter.setCurId(getCurId());
        }
        aliRequestAdapter.setId(this.pid);
        if (this.isReload) {
            aliRequestAdapter.cancelPhase = "reload";
        }
        setRequestBodyHandler(aliRequestAdapter.getAliRequest(), aliRequestAdapter);
        eventHandler.setRequest(aliRequestAdapter);
        return sendRequestInternal(aliRequestAdapter);
    }

    private void sgRequestCheck(String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, int i) {
        Map<String, String> map5;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9decb137", new Object[]{this, str, str2, new Boolean(z), map, map2, map3, map4, new Integer(i)});
            return;
        }
        try {
            if (iOnSgHttpRequestCallback != null) {
                wpw wpwVar = vpw.commonConfig;
                if (wpwVar.K) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (!wpwVar.L) {
                        map5 = iOnSgHttpRequestCallback.onSgHttpRequest(str, str2, z, map, map2, map3, map4);
                    } else if (i == 0 || i == 1) {
                        v7t.l(LOGTAG, "sgRequestCheck() called with: url = [" + str + "], method = [" + str2 + "], isUCProxyReq = [" + z + "], headers = [" + map + "], ucHeaders = [" + map2 + "], uploadFileMap = [" + map3 + "], uploadDataMap = [" + map4 + "], requestType = [" + i + "]");
                        map5 = iOnSgHttpRequestCallback.onSgHttpRequest(str, str2, z, map, map2, map3, map4);
                    } else {
                        map5 = null;
                        z2 = false;
                    }
                    if (z2) {
                        v7t.d(LOGTAG, "onSgHttpRequest use time:" + (SystemClock.uptimeMillis() - uptimeMillis));
                    }
                    if (map5 != null) {
                        for (String str3 : map5.keySet()) {
                            if (!map.containsKey(str3)) {
                                String str4 = map5.get(str3);
                                map.put(str3, str4);
                                v7t.l(LOGTAG, "add header key:" + str3 + " value:" + str4);
                            } else {
                                v7t.d(LOGTAG, "add header conflict key:" + str3);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
