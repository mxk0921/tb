package mtopsdk.mtop.network;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopHeaderEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopStatistics;
import tb.f10;
import tb.hi9;
import tb.htj;
import tb.o9o;
import tb.q9o;
import tb.t2o;
import tb.ui9;
import tb.w4j;
import tb.zu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkCallbackAdapter implements htj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.NetworkCallbackAdapter";
    public hi9 filterManager;
    public MtopCallback.MtopFinishListener finishListener;
    public MtopCallback.MtopHeaderListener headerListener;
    public final w4j mtopContext;

    static {
        t2o.a(589299969);
        t2o.a(589300021);
    }

    public NetworkCallbackAdapter(w4j w4jVar) {
        this.mtopContext = w4jVar;
        if (w4jVar != null) {
            Mtop mtop = w4jVar.f30449a;
            if (mtop != null) {
                this.filterManager = mtop.getMtopConfig().filterManager;
            }
            MtopListener mtopListener = w4jVar.e;
            if (mtopListener instanceof MtopCallback.MtopHeaderListener) {
                this.headerListener = (MtopCallback.MtopHeaderListener) mtopListener;
            }
            if (mtopListener instanceof MtopCallback.MtopFinishListener) {
                this.finishListener = (MtopCallback.MtopFinishListener) mtopListener;
            }
        }
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

    public void onFinish(o9o o9oVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a238d6", new Object[]{this, o9oVar, obj});
        } else {
            onFinish(o9oVar, obj, false);
        }
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

    @Override // tb.htj
    public void onResponse(zu2 zu2Var, o9o o9oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7ed339", new Object[]{this, zu2Var, o9oVar});
        } else {
            onFinish(o9oVar, o9oVar.f25231a.r, true);
        }
    }

    public void onFinish(final o9o o9oVar, final Object obj, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba594be", new Object[]{this, o9oVar, obj, new Boolean(z)});
            return;
        }
        MtopStatistics mtopStatistics = this.mtopContext.g;
        mtopStatistics.netSendEndTime = mtopStatistics.currentTimeMillis();
        this.mtopContext.d.reqContext = obj;
        Runnable runnable = new Runnable() { // from class: mtopsdk.mtop.network.NetworkCallbackAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FullTraceHelper.beginSection("mtop_networkCb", NetworkCallbackAdapter.this.mtopContext.h);
                try {
                    if (z) {
                        NetworkCallbackAdapter.this.onHeader(o9oVar, obj);
                    }
                    MtopStatistics mtopStatistics2 = NetworkCallbackAdapter.this.mtopContext.g;
                    mtopStatistics2.startCallbackTime = mtopStatistics2.currentTimeMillis();
                    FullTraceHelper.recordRspProcessStart(NetworkCallbackAdapter.this.mtopContext.g);
                    w4j w4jVar = NetworkCallbackAdapter.this.mtopContext;
                    MtopStatistics mtopStatistics3 = w4jVar.g;
                    o9o o9oVar2 = o9oVar;
                    mtopStatistics3.netStats = o9oVar2.f;
                    w4jVar.n = o9oVar2;
                    MtopResponse mtopResponse = new MtopResponse(NetworkCallbackAdapter.this.mtopContext.b.getApiName(), NetworkCallbackAdapter.this.mtopContext.b.getVersion(), null, null);
                    mtopResponse.setResponseCode(o9oVar.b);
                    mtopResponse.setHeaderFields(o9oVar.d);
                    mtopResponse.setMtopStat(NetworkCallbackAdapter.this.mtopContext.g);
                    q9o q9oVar = o9oVar.e;
                    if (q9oVar != null) {
                        try {
                            mtopResponse.setBytedata(q9oVar.c());
                        } catch (IOException e) {
                            TBSdkLog.e(NetworkCallbackAdapter.TAG, NetworkCallbackAdapter.this.mtopContext.h, "call getBytes of response.body() error.", e);
                        }
                        mtopResponse.setOriginFastJsonObject(o9oVar.i);
                        mtopResponse.setSupportStreamJson(NetworkCallbackAdapter.this.mtopContext.k.z);
                    }
                    NetworkCallbackAdapter networkCallbackAdapter = NetworkCallbackAdapter.this;
                    w4j w4jVar2 = networkCallbackAdapter.mtopContext;
                    w4jVar2.c = mtopResponse;
                    ((f10) networkCallbackAdapter.filterManager).c(null, w4jVar2);
                } catch (Throwable th) {
                    TBSdkLog.e(NetworkCallbackAdapter.TAG, NetworkCallbackAdapter.this.mtopContext.h, "onFinish failed.", th);
                }
                FullTraceHelper.endSection();
            }
        };
        w4j w4jVar = this.mtopContext;
        ui9.d(w4jVar.d.handler, runnable, w4jVar.h.hashCode());
    }

    public void onHeader(o9o o9oVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8319c", new Object[]{this, o9oVar, obj});
            return;
        }
        try {
            if (this.headerListener != null) {
                MtopHeaderEvent mtopHeaderEvent = new MtopHeaderEvent(o9oVar.b, o9oVar.d);
                mtopHeaderEvent.seqNo = this.mtopContext.h;
                this.headerListener.onHeader(mtopHeaderEvent, obj);
            }
        } catch (Throwable th) {
            TBSdkLog.e(TAG, this.mtopContext.h, "onHeader failed.", th);
        }
    }
}
