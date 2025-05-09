package mtopsdk.mtop.network;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopStatistics;
import tb.f10;
import tb.hi9;
import tb.htj;
import tb.jpq;
import tb.o9o;
import tb.q9o;
import tb.t2o;
import tb.ui9;
import tb.w4j;
import tb.zu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class StreamNetworkCallbackAdapter implements htj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.StreamNetworkCallbackAdapter";
    public hi9 filterManager;
    public final w4j mtopContext;
    public MtopCallback.MtopStreamListener streamListener;

    static {
        t2o.a(589299973);
        t2o.a(589300021);
    }

    public StreamNetworkCallbackAdapter(w4j w4jVar) {
        this.mtopContext = w4jVar;
        if (w4jVar != null) {
            Mtop mtop = w4jVar.f30449a;
            if (mtop != null) {
                this.filterManager = mtop.getMtopConfig().filterManager;
            }
            MtopListener mtopListener = w4jVar.e;
            if (mtopListener instanceof MtopCallback.MtopStreamListener) {
                this.streamListener = (MtopCallback.MtopStreamListener) mtopListener;
            }
        }
    }

    public static /* synthetic */ MtopResponse access$000(StreamNetworkCallbackAdapter streamNetworkCallbackAdapter, o9o o9oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("2489444b", new Object[]{streamNetworkCallbackAdapter, o9oVar});
        }
        return streamNetworkCallbackAdapter.buildMtopResponse(o9oVar);
    }

    private MtopResponse buildMtopResponse(o9o o9oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("816f7fc6", new Object[]{this, o9oVar});
        }
        MtopResponse mtopResponse = new MtopResponse(this.mtopContext.b.getApiName(), this.mtopContext.b.getVersion(), null, null);
        mtopResponse.setResponseCode(o9oVar.b);
        mtopResponse.setHeaderFields(o9oVar.d);
        mtopResponse.setMtopStat(this.mtopContext.g);
        mtopResponse.setStreamModeData(o9oVar.h);
        mtopResponse.setSupportStreamJson(this.mtopContext.q);
        JSONObject jSONObject = o9oVar.i;
        if (jSONObject != null) {
            mtopResponse.setOriginFastJsonObject(jSONObject);
        }
        byte[] bArr = o9oVar.g;
        if (bArr != null) {
            mtopResponse.setBytedata(bArr);
        } else {
            q9o q9oVar = o9oVar.e;
            if (q9oVar != null) {
                try {
                    mtopResponse.setBytedata(q9oVar.c());
                } catch (IOException e) {
                    TBSdkLog.e(TAG, this.mtopContext.h, "call getBytes of response.body() error.", e);
                }
            }
        }
        return mtopResponse;
    }

    @Override // tb.htj
    public void onCancel(zu2 zu2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b9b7f3", new Object[]{this, zu2Var});
            return;
        }
        o9o e = new o9o.b().l(zu2Var.request()).g(-8).e();
        onFinish(e, e.f25231a.r);
    }

    @Override // tb.htj
    public void onFailure(zu2 zu2Var, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8b04c1", new Object[]{this, zu2Var, exc});
            return;
        }
        o9o e = new o9o.b().l(zu2Var.request()).g(-7).i(exc.getMessage()).e();
        onFinish(e, e.f25231a.r);
    }

    public void onFinish(final o9o o9oVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a238d6", new Object[]{this, o9oVar, obj});
            return;
        }
        MtopStatistics mtopStatistics = this.mtopContext.g;
        mtopStatistics.streamRequest = true;
        mtopStatistics.netSendEndTime = mtopStatistics.currentTimeMillis();
        this.mtopContext.d.reqContext = obj;
        Runnable runnable = new Runnable() { // from class: mtopsdk.mtop.network.StreamNetworkCallbackAdapter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MtopStatistics mtopStatistics2 = StreamNetworkCallbackAdapter.this.mtopContext.g;
                    mtopStatistics2.startCallbackTime = mtopStatistics2.currentTimeMillis();
                    FullTraceHelper.recordRspProcessStart(StreamNetworkCallbackAdapter.this.mtopContext.g);
                    StreamNetworkCallbackAdapter streamNetworkCallbackAdapter = StreamNetworkCallbackAdapter.this;
                    w4j w4jVar = streamNetworkCallbackAdapter.mtopContext;
                    MtopStatistics mtopStatistics3 = w4jVar.g;
                    o9o o9oVar2 = o9oVar;
                    mtopStatistics3.netStats = o9oVar2.f;
                    w4jVar.n = o9oVar2;
                    w4jVar.c = StreamNetworkCallbackAdapter.access$000(streamNetworkCallbackAdapter, o9oVar2);
                    jpq jpqVar = o9oVar.h;
                    if (jpqVar != null) {
                        MtopStatistics mtopStatistics4 = StreamNetworkCallbackAdapter.this.mtopContext.g;
                        mtopStatistics4.streamResponse = true;
                        mtopStatistics4.responseCount = jpqVar.f22144a;
                        mtopStatistics4.responseValidCount = jpqVar.b;
                        mtopStatistics4.receivedNetDuration = jpqVar.j;
                    }
                    StreamNetworkCallbackAdapter streamNetworkCallbackAdapter2 = StreamNetworkCallbackAdapter.this;
                    ((f10) streamNetworkCallbackAdapter2.filterManager).c(null, streamNetworkCallbackAdapter2.mtopContext);
                } catch (Throwable th) {
                    TBSdkLog.e(StreamNetworkCallbackAdapter.TAG, StreamNetworkCallbackAdapter.this.mtopContext.h, "onFinish failed.", th);
                }
            }
        };
        w4j w4jVar = this.mtopContext;
        ui9.e(w4jVar.d.handler, runnable, w4jVar.h.hashCode());
    }

    public void onHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce9b7d3", new Object[]{this});
            return;
        }
        MtopStatistics mtopStatistics = this.mtopContext.g;
        mtopStatistics.receivedResponseCodeTime = mtopStatistics.currentTimeMillis();
    }

    public void onReceiveData(final o9o o9oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7818be7e", new Object[]{this, o9oVar});
            return;
        }
        Runnable runnable = new Runnable() { // from class: mtopsdk.mtop.network.StreamNetworkCallbackAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                byte[] bArr;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MtopFinishEvent mtopFinishEvent = new MtopFinishEvent(StreamNetworkCallbackAdapter.access$000(StreamNetworkCallbackAdapter.this, o9oVar));
                String str = StreamNetworkCallbackAdapter.this.mtopContext.h;
                mtopFinishEvent.seqNo = str;
                TBSdkLog.e(StreamNetworkCallbackAdapter.TAG, str, "[onReceiveData----] callback");
                MtopStatistics mtopStatistics = StreamNetworkCallbackAdapter.this.mtopContext.g;
                if (mtopStatistics.streamFirstResponseSize <= 0 && (bArr = o9oVar.g) != null) {
                    mtopStatistics.streamFirstResponseSize = bArr.length;
                }
                if (mtopStatistics.streamFirstDataCallbackTime <= 0 && o9oVar.g != null) {
                    mtopStatistics.streamFirstDataCallbackTime = mtopStatistics.currentTimeMillis();
                    StreamNetworkCallbackAdapter.this.mtopContext.g.bizFirstChunkTime = System.currentTimeMillis();
                }
                jpq jpqVar = o9oVar.h;
                if (jpqVar != null) {
                    MtopStatistics mtopStatistics2 = StreamNetworkCallbackAdapter.this.mtopContext.g;
                    if (mtopStatistics2.parseStreamFirstDataDuration <= 0) {
                        long j = jpqVar.d;
                        if (j > 0) {
                            mtopStatistics2.parseStreamFirstDataDuration = j;
                        }
                    }
                    if (mtopStatistics2.parseSSEDataDuration <= 0) {
                        mtopStatistics2.parseSSEDataDuration = jpqVar.e;
                    }
                    if (mtopStatistics2.expansionCount <= 0) {
                        mtopStatistics2.expansionCount = jpqVar.f;
                    }
                    if (mtopStatistics2.copyDataDuration <= 0) {
                        mtopStatistics2.copyDataDuration = jpqVar.g;
                    }
                    if (mtopStatistics2.receivedCount <= 0) {
                        mtopStatistics2.receivedCount = jpqVar.h;
                    }
                    if (mtopStatistics2.findEndDuration <= 0) {
                        mtopStatistics2.findEndDuration = jpqVar.i;
                    }
                }
                StreamNetworkCallbackAdapter streamNetworkCallbackAdapter = StreamNetworkCallbackAdapter.this;
                streamNetworkCallbackAdapter.streamListener.onReceiveData(mtopFinishEvent, streamNetworkCallbackAdapter.mtopContext.d.reqContext);
            }
        };
        w4j w4jVar = this.mtopContext;
        ui9.e(w4jVar.d.handler, runnable, w4jVar.h.hashCode());
    }

    @Override // tb.htj
    public void onResponse(zu2 zu2Var, o9o o9oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7ed339", new Object[]{this, zu2Var, o9oVar});
        } else {
            onFinish(o9oVar, o9oVar.f25231a.r);
        }
    }
}
