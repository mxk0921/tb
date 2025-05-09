package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ui9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ph8 errorCodeMappingAfterFilter = new ph8();
    public static final kqm prefetchDuplexFilter = new kqm();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w4j f29396a;
        public final /* synthetic */ MtopResponse b;
        public final /* synthetic */ MtopFinishEvent c;

        public a(w4j w4jVar, MtopResponse mtopResponse, MtopFinishEvent mtopFinishEvent) {
            this.f29396a = w4jVar;
            this.b = mtopResponse;
            this.c = mtopFinishEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f29396a.g.serverTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(this.b.getHeaderFields(), HttpHeaderConstant.SERVER_TRACE_ID);
                this.f29396a.g.eagleEyeTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(this.b.getHeaderFields(), "eagleeye-traceid");
                this.f29396a.g.statusCode = this.b.getResponseCode();
                this.f29396a.g.retCode = this.b.getRetCode();
                this.f29396a.g.mappingCode = this.b.getMappingCode();
                if (this.b.isApiSuccess()) {
                    MtopStatistics mtopStatistics = this.f29396a.g;
                    if (3 == mtopStatistics.cacheHitType) {
                        mtopStatistics.statusCode = 304;
                    }
                }
                w4j w4jVar = this.f29396a;
                boolean z = w4jVar.o instanceof MtopBusiness;
                if (!z) {
                    FullTraceHelper.recordRspCbStart(w4jVar.g);
                }
                w4j w4jVar2 = this.f29396a;
                MtopListener mtopListener = w4jVar2.e;
                if (mtopListener instanceof MtopCallback.MtopFinishListener) {
                    ((MtopCallback.MtopFinishListener) mtopListener).onFinished(this.c, w4jVar2.d.reqContext);
                } else {
                    ((MtopCallback.MtopStreamListener) mtopListener).onFinish(this.c, w4jVar2.d.reqContext);
                }
                this.f29396a.g.onEndAndCommit();
                if (!z) {
                    FullTraceHelper.recordRspCbEnd(this.f29396a.g);
                    this.f29396a.g.commitFullTrace();
                }
            } catch (Exception unused) {
            }
        }
    }

    static {
        t2o.a(589299843);
    }

    public static void a(hi9 hi9Var, w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e9a62d", new Object[]{hi9Var, w4jVar});
        } else if (hi9Var == null) {
            MtopResponse mtopResponse = new MtopResponse(ErrorConstant.ERRCODE_MTOPSDK_INIT_ERROR, ErrorConstant.ERRMSG_MTOPSDK_INIT_ERROR);
            MtopRequest mtopRequest = w4jVar.b;
            if (mtopRequest != null) {
                mtopResponse.setApi(mtopRequest.getApiName());
                mtopResponse.setV(w4jVar.b.getVersion());
            }
            w4jVar.c = mtopResponse;
            b(w4jVar);
        }
    }

    public static void b(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6069f8f8", new Object[]{w4jVar});
            return;
        }
        MtopResponse mtopResponse = w4jVar.c;
        if (mtopResponse != null) {
            MtopListener mtopListener = w4jVar.e;
            if ((mtopListener instanceof MtopCallback.MtopFinishListener) || (mtopListener instanceof MtopCallback.MtopStreamListener)) {
                mtopResponse.setMtopStat(w4jVar.g);
                MtopFinishEvent mtopFinishEvent = new MtopFinishEvent(mtopResponse);
                mtopFinishEvent.seqNo = w4jVar.h;
                FullTraceHelper.recordRspCbDispatch(w4jVar.g);
                prefetchDuplexFilter.c(w4jVar);
                errorCodeMappingAfterFilter.c(w4jVar);
                d(w4jVar.d.handler, new a(w4jVar, mtopResponse, mtopFinishEvent), w4jVar.h.hashCode());
            }
        }
    }

    public static void c(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07f463e", new Object[]{mtopResponse});
        } else if (mtopResponse != null) {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.X_RETCODE);
            mtopResponse.mappingCodeSuffix = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.X_MAPPING_CODE);
            if (StringUtils.isNotBlank(singleHeaderFieldByKey)) {
                mtopResponse.setRetCode(singleHeaderFieldByKey);
            } else {
                mtopResponse.parseJsonByte();
            }
        }
    }

    public static void d(Handler handler, Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b64760c", new Object[]{handler, runnable, new Integer(i)});
        } else if (handler != null) {
            handler.post(runnable);
        } else {
            MtopSDKThreadPoolExecutorFactory.submitCallbackTask(i, runnable);
        }
    }

    public static void e(Handler handler, Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("affb406c", new Object[]{handler, runnable, new Integer(i)});
        } else if (handler != null) {
            handler.post(runnable);
        } else {
            MtopSDKThreadPoolExecutorFactory.submitStreamCallbackTask(i, runnable);
        }
    }
}
