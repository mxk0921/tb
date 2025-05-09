package anet.channel.analysis;

import anet.channel.fulltrace.IFullTraceAnalysisV3;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import java.util.Map;
import org.json.JSONObject;
import tb.gz8;
import tb.oz8;
import tb.raq;
import tb.t2o;
import tb.tz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DefaultFullTraceAnalysisV3 implements IFullTraceAnalysisV3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "network";
    private static final String SCENE = "Network_UnknownScene";
    private static final String TAG = "awcn.DefaultFullTraceAnalysisV3";
    private oz8 appStatusSpan;
    private boolean isAnalysisValid;
    private boolean isFalcoValid = false;
    private tz8 falcoTracer = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class SpanProxy implements IFullTraceAnalysisV3.ISpan<gz8> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final gz8 span;

        static {
            t2o.a(607125561);
            t2o.a(607125661);
        }

        public SpanProxy(gz8 gz8Var) {
            this.span = gz8Var;
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysisV3.ISpan
        public gz8 getSpan() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (gz8) ipChange.ipc$dispatch("ed34b38d", new Object[]{this}) : this.span;
        }
    }

    static {
        t2o.a(607125560);
        t2o.a(607125660);
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
    public void recordAppStatus(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad5503d", new Object[]{this, str, str2});
        } else if (this.isAnalysisValid && this.isFalcoValid) {
            if (this.appStatusSpan == null) {
                this.appStatusSpan = this.falcoTracer.d("network", "Network_App_Status").h();
            }
            oz8 oz8Var = this.appStatusSpan;
            oz8Var.log(str + "|" + str2);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
    public void setRequestStage(IFullTraceAnalysisV3.ISpan iSpan, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d792305e", new Object[]{this, iSpan, str, new Long(j)});
        } else if (this.isAnalysisValid && this.isFalcoValid && iSpan != null) {
            gz8 gz8Var = (gz8) iSpan.getSpan();
            if ("netReqStart".equals(str)) {
                gz8Var.l(Long.valueOf(j));
            } else if ("netReqProcessStart".equals(str)) {
                gz8Var.o0(Long.valueOf(j));
            } else if ("netReqSendStart".equals(str)) {
                gz8Var.x(Long.valueOf(j));
            } else if (IFullTraceAnalysisV3.Stage.RSP_RECV_START.equals(str)) {
                gz8Var.b0(Long.valueOf(j));
            } else if ("netRspRecvEnd".equals(str)) {
                gz8Var.W(Long.valueOf(j));
            } else if ("netRspCbDispatch".equals(str)) {
                gz8Var.Y(Long.valueOf(j));
            } else if ("netRspCbStart".equals(str)) {
                gz8Var.i0(Long.valueOf(j));
            } else if ("netRspCbEnd".equals(str)) {
                gz8Var.m0(Long.valueOf(j));
            } else if ("serverRT".equals(str)) {
                gz8Var.s(j);
            }
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
    public IFullTraceAnalysisV3.ISpan createRequest(Map<String, String> map) {
        raq k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFullTraceAnalysisV3.ISpan) ipChange.ipc$dispatch("403cf90f", new Object[]{this, map});
        }
        if (!this.isAnalysisValid) {
            ALog.e(TAG, "[AnalysisV3] createRequest, isAnalysisValid=false", null, new Object[0]);
            return null;
        } else if (!this.isFalcoValid) {
            ALog.e(TAG, "[AnalysisV3] createRequest, isFalcoValid=false", null, new Object[0]);
            return null;
        } else {
            tz8.a d = this.falcoTracer.d("network", SCENE);
            if (!(map == null || map.isEmpty() || (k = this.falcoTracer.k(map)) == null)) {
                d.b(k);
            }
            gz8 h = d.h();
            if (h == null) {
                ALog.e(TAG, "[AnalysisV3] createRequest, networkSpan=null", null, new Object[0]);
            }
            h.C("process_request");
            return new SpanProxy(h);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
    public void log(IFullTraceAnalysisV3.ISpan iSpan, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8841c77d", new Object[]{this, iSpan, str, str2});
        } else if (!this.isAnalysisValid) {
            ALog.e(TAG, "[AnalysisV3] log, isAnalysisValid=false", null, new Object[0]);
        } else if (!this.isFalcoValid) {
            ALog.e(TAG, "[AnalysisV3] log, isFalcoValid=false", null, new Object[0]);
        } else if (iSpan == null) {
            ALog.e(TAG, "[AnalysisV3] log, span=null", null, new Object[0]);
        } else {
            ((gz8) iSpan.getSpan()).A("module=network,stage=" + str + ",content=" + str2);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
    public void finishRequest(IFullTraceAnalysisV3.ISpan iSpan, RequestStatistic requestStatistic) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de0c17", new Object[]{this, iSpan, requestStatistic});
        } else if (this.isAnalysisValid) {
            tryGetFalcoTracer();
            if (this.isFalcoValid && requestStatistic != null && iSpan != null) {
                setRequestStage(iSpan, "netReqStart", requestStatistic.netReqStart);
                setRequestStage(iSpan, "netReqProcessStart", requestStatistic.reqStart);
                setRequestStage(iSpan, "netReqSendStart", requestStatistic.sendStart);
                setRequestStage(iSpan, "serverRT", requestStatistic.serverRT);
                setRequestStage(iSpan, IFullTraceAnalysisV3.Stage.RSP_RECV_START, requestStatistic.rspStart);
                setRequestStage(iSpan, "netRspRecvEnd", requestStatistic.rspEnd);
                setRequestStage(iSpan, "netRspCbDispatch", requestStatistic.rspCbDispatch);
                setRequestStage(iSpan, "netRspCbStart", requestStatistic.rspCbStart);
                setRequestStage(iSpan, "netRspCbEnd", requestStatistic.rspCbEnd);
                gz8 gz8Var = (gz8) iSpan.getSpan();
                gz8.HOST.a(gz8Var, requestStatistic.host);
                gz8.URL.a(gz8Var, requestStatistic.url);
                gz8.IP.a(gz8Var, requestStatistic.ip);
                gz8.BIZ_ID.a(gz8Var, requestStatistic.bizId);
                gz8.RETRY_TIMES.a(gz8Var, Integer.valueOf(requestStatistic.retryTimes));
                gz8.PROTOCOL_TYPE.a(gz8Var, requestStatistic.protocolType);
                oz8.ERROR_CODE.a(gz8Var, String.valueOf(requestStatistic.statusCode));
                gz8.IS_CB_MAIN.a(gz8Var, 0);
                gz8.IS_REQ_MAIN.a(gz8Var, Integer.valueOf(requestStatistic.isReqMain ? 1 : 0));
                gz8.IS_REQ_SYNC.a(gz8Var, Integer.valueOf(requestStatistic.isReqSync ? 1 : 0));
                gz8.RET.a(gz8Var, Integer.valueOf(requestStatistic.ret));
                gz8.NET_TYPE.a(gz8Var, requestStatistic.netType);
                gz8.SEND_DATA_TIME.a(gz8Var, Long.valueOf(requestStatistic.sendDataTime));
                gz8.FIRST_DATA_TIME.a(gz8Var, Long.valueOf(requestStatistic.firstDataTime));
                gz8.REQ_DEFLATE_SIZE.a(gz8Var, Long.valueOf(requestStatistic.reqHeadDeflateSize + requestStatistic.reqBodyDeflateSize));
                gz8.REQ_INFLATE_SIZE.a(gz8Var, Long.valueOf(requestStatistic.reqHeadInflateSize + requestStatistic.reqBodyInflateSize));
                gz8.RSP_DEFLATE_SIZE.a(gz8Var, Long.valueOf(requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize));
                gz8.RSP_INFLATE_SIZE.a(gz8Var, Long.valueOf(requestStatistic.rspHeadInflateSize + requestStatistic.rspBodyInflateSize));
                JSONObject jSONObject = requestStatistic.extra;
                if (jSONObject != null) {
                    gz8Var.X("firstIp", jSONObject.optString("firstIp"));
                } else {
                    gz8Var.X("firstIp", requestStatistic.ip);
                }
                if (requestStatistic.retryTimes > 0) {
                    gz8Var.X("firstProtocol", requestStatistic.firstProtocol);
                    gz8Var.f("firstErrorCode", Integer.valueOf(requestStatistic.firstErrorCode));
                } else {
                    gz8Var.X("firstProtocol", requestStatistic.protocolType);
                    gz8Var.f("firstErrorCode", Integer.valueOf(requestStatistic.statusCode));
                }
                gz8Var.f("isTunnel", Integer.valueOf(requestStatistic.isTunnel ? 1 : 0));
                gz8Var.X("tunnelInfo", requestStatistic.tunnelInfo);
                gz8Var.X("cid", requestStatistic.cid);
                gz8Var.f("ipStackType", Integer.valueOf(requestStatistic.ipStackType));
                gz8Var.f("isBg", Integer.valueOf(!"fg".equalsIgnoreCase(requestStatistic.isBg) ? 1 : 0));
                gz8Var.X("falcoId", requestStatistic.falcoId);
                gz8Var.X("httpMethod", requestStatistic.httpMethod);
                gz8Var.f("connTimeoutInterval", Long.valueOf(requestStatistic.connTimeoutInterval));
                gz8Var.f("socketTimeoutInterval", Long.valueOf(requestStatistic.socketTimeoutInterval));
                if (requestStatistic.ret == 0) {
                    str = "failed";
                } else if (requestStatistic.ret == 1) {
                    str = "succeed";
                } else {
                    str = "cancel";
                }
                gz8Var.t(str);
            }
        }
    }

    public DefaultFullTraceAnalysisV3() {
        try {
            this.isAnalysisValid = true;
            tryGetFalcoTracer();
            ALog.e(TAG, "[AnalysisV3] DefaultFullTraceAnalysisV3", null, "isAnalysisValid", Boolean.valueOf(this.isAnalysisValid), "isFalcoValid", Boolean.valueOf(this.isFalcoValid));
        } catch (Throwable th) {
            ALog.e(TAG, "[AnalysisV3] not support FullTraceAnalysis v3", null, "isAnalysisValid", Boolean.valueOf(this.isAnalysisValid), "error", th);
        }
    }

    private void tryGetFalcoTracer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04a4fd6", new Object[]{this});
            return;
        }
        try {
            if (!this.isFalcoValid) {
                tz8 tz8Var = FalcoGlobalTracer.get();
                this.falcoTracer = tz8Var;
                if (tz8Var != null) {
                    this.isFalcoValid = true;
                }
                ALog.e(TAG, "[AnalysisV3] tryGetFalcoTracer", null, "isAnalysisValid", Boolean.valueOf(this.isAnalysisValid), "isFalcoValid", Boolean.valueOf(this.isFalcoValid));
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[AnalysisV3] tryGetFalcoTracer error", null, "isAnalysisValid", Boolean.valueOf(this.isAnalysisValid), "error", th);
        }
    }
}
