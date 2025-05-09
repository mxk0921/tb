package com.taobao.tbpoplayer.nativerender;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tbpoplayer.nativerender.PreRequestFetcher;
import com.taobao.tbpoplayer.nativerender.dsl.ConditionModel;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.PreFetchModel;
import com.taobao.tbpoplayer.nativerender.info.PreFetchContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.a1n;
import tb.af4;
import tb.kmj;
import tb.oe8;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PreRequestFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final oe8 f13406a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements kmj.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PreFetchContext f13407a;
        public final /* synthetic */ PreFetchModel b;
        public final /* synthetic */ b c;

        public a(PreFetchContext preFetchContext, PreFetchModel preFetchModel, b bVar) {
            this.f13407a = preFetchContext;
            this.b = preFetchModel;
            this.c = bVar;
        }

        @Override // tb.kmj.b
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            try {
                PreFetchContext preFetchContext = this.f13407a;
                preFetchContext.success = true;
                preFetchContext.resData = str;
                PreFetchModel preFetchModel = this.b;
                wdm.d("dealPreFetch.WINDVANE.apiName=%s.params=%s.result=%s", preFetchModel.requestMethod, preFetchModel.requestParams, str);
                PreRequestFetcher.c(PreRequestFetcher.this).z(this.b.dataId, JSON.parseObject(str));
                boolean a2 = af4.a(this.b.requestSuccessJudge, PreRequestFetcher.c(PreRequestFetcher.this), true);
                this.f13407a.conditionSuccess = a2;
                if (!a2) {
                    PreRequestFetcher.c(PreRequestFetcher.this).s("PrefetchWindvaneJudgeFailed", "dealPreFetchWindvane.onSuccess.conditionCheckFailed.");
                } else {
                    this.c.onSuccess();
                }
            } catch (Throwable unused) {
                PreRequestFetcher.c(PreRequestFetcher.this).s("PrefetchWindvaneParseJsonFailed", str);
            }
        }

        @Override // tb.kmj.b
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
                return;
            }
            PreFetchContext preFetchContext = this.f13407a;
            preFetchContext.success = false;
            preFetchContext.resData = str;
            preFetchContext.errorInfo = "返回数据失败";
            PreRequestFetcher.c(PreRequestFetcher.this).s("PrefetchWindvaneFailed", str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onSuccess();
    }

    static {
        t2o.a(790626422);
    }

    public PreRequestFetcher(oe8 oe8Var) {
        this.f13406a = oe8Var;
    }

    public static /* synthetic */ oe8 c(PreRequestFetcher preRequestFetcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oe8) ipChange.ipc$dispatch("810b34fb", new Object[]{preRequestFetcher});
        }
        return preRequestFetcher.f13406a;
    }

    public void d(DSLModel dSLModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7679e65", new Object[]{this, dSLModel});
        } else if (dSLModel != null) {
            try {
                List<PreFetchModel> list = dSLModel.prefetch;
                if (list != null && !list.isEmpty()) {
                    e(dSLModel);
                }
            } catch (Throwable unused) {
                this.f13406a.s("prePareDisplayFailed", "");
            }
        }
    }

    public final void e(DSLModel dSLModel) {
        ConditionModel conditionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c012a6", new Object[]{this, dSLModel});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (PreFetchModel preFetchModel : dSLModel.prefetch) {
            if (!preFetchModel.isValid()) {
                this.f13406a.s("PrefetchConfigInValid", "");
                return;
            } else if (a1n.a(preFetchModel.requestParams) || ((conditionModel = preFetchModel.preCondition) != null && conditionModel.isValid())) {
                arrayList2.add(preFetchModel);
            } else {
                arrayList.add(preFetchModel);
            }
        }
        if (!arrayList.isEmpty()) {
            final CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                PreFetchModel preFetchModel2 = (PreFetchModel) it.next();
                if ("mtop".equals(preFetchModel2.dataSource)) {
                    h(preFetchModel2, new b() { // from class: tb.rnm
                        @Override // com.taobao.tbpoplayer.nativerender.PreRequestFetcher.b
                        public final void onSuccess() {
                            countDownLatch.countDown();
                        }
                    });
                } else if ("windvane".equals(preFetchModel2.dataSource)) {
                    j(preFetchModel2, new b() { // from class: tb.rnm
                        @Override // com.taobao.tbpoplayer.nativerender.PreRequestFetcher.b
                        public final void onSuccess() {
                            countDownLatch.countDown();
                        }
                    });
                }
            }
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
                this.f13406a.s("prePareParallelDisplayOutOfTime", "");
            }
        }
        if (!arrayList2.isEmpty()) {
            CountDownLatch countDownLatch2 = new CountDownLatch(arrayList2.size());
            i(arrayList2, countDownLatch2);
            try {
                countDownLatch2.await(10L, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                this.f13406a.s("prePareSerialDisplayOutOfTime", "");
            }
        }
    }

    public final /* synthetic */ void f(List list, CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d175a2", new Object[]{this, list, countDownLatch});
            return;
        }
        i(list, countDownLatch);
        countDownLatch.countDown();
    }

    public final /* synthetic */ void g(List list, CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71be8cc1", new Object[]{this, list, countDownLatch});
            return;
        }
        i(list, countDownLatch);
        countDownLatch.countDown();
    }

    public final void h(final PreFetchModel preFetchModel, final b bVar) {
        String str;
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743e2786", new Object[]{this, preFetchModel, bVar});
        } else if (!this.f13406a.j().B()) {
            try {
                MtopRequest mtopRequest = new MtopRequest();
                mtopRequest.setApiName(preFetchModel.requestAddress);
                if (!TextUtils.isEmpty(preFetchModel.requestVer)) {
                    str = preFetchModel.requestVer;
                } else if (!TextUtils.isEmpty(preFetchModel.version)) {
                    str = preFetchModel.version;
                } else {
                    str = "1.0";
                }
                mtopRequest.setVersion(str);
                mtopRequest.setNeedEcode(false);
                mtopRequest.setData(a1n.g(this.f13406a, preFetchModel.requestParams));
                final PreFetchContext preFetchContext = new PreFetchContext();
                preFetchContext.preFetchModel = preFetchModel;
                this.f13406a.j().a(preFetchModel, preFetchContext);
                MtopBusiness showLoginUI = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, PopLayer.getReference().getApp()), mtopRequest, TaoPackageInfo.getTTID()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tbpoplayer.nativerender.PreRequestFetcher.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        PreFetchContext preFetchContext2 = preFetchContext;
                        preFetchContext2.success = false;
                        String str2 = "";
                        preFetchContext2.resData = mtopResponse != null ? new String(mtopResponse.getBytedata()) : str2;
                        preFetchContext.errorInfo = "返回数据失败.onError";
                        oe8 c = PreRequestFetcher.c(PreRequestFetcher.this);
                        StringBuilder sb = new StringBuilder("dealPreFetchMTOP.onError.retCode=");
                        if (mtopResponse != null) {
                            str2 = mtopResponse.getRetCode();
                        }
                        sb.append(str2);
                        c.s("PrefetchMtopFailed", sb.toString());
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        PreFetchContext preFetchContext2 = preFetchContext;
                        preFetchContext2.success = false;
                        String str2 = "";
                        preFetchContext2.resData = mtopResponse != null ? new String(mtopResponse.getBytedata()) : str2;
                        preFetchContext.errorInfo = "返回数据失败.onSystemError";
                        oe8 c = PreRequestFetcher.c(PreRequestFetcher.this);
                        StringBuilder sb = new StringBuilder("dealPreFetchMTOP.onSystemError.retCode=");
                        if (mtopResponse != null) {
                            str2 = mtopResponse.getRetCode();
                        }
                        sb.append(str2);
                        c.s("PrefetchMtopFailed", sb.toString());
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        List<String> list;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        if (mtopResponse != null) {
                            preFetchContext.traceId = (mtopResponse.getHeaderFields() == null || (list = mtopResponse.getHeaderFields().get("eagleeye-traceid")) == null || list.isEmpty()) ? null : list.get(0);
                        }
                        if (!(mtopResponse == null || !mtopResponse.isApiSuccess() || mtopResponse.getBytedata() == null)) {
                            try {
                                preFetchContext.success = true;
                                String str2 = new String(mtopResponse.getBytedata(), "UTF-8");
                                if (!TextUtils.isEmpty(str2)) {
                                    preFetchContext.resData = str2;
                                    PreFetchModel preFetchModel2 = preFetchModel;
                                    wdm.d("dealPreFetch.MTOP.apiName=%s.params=%s.result=%s", preFetchModel2.requestAddress, preFetchModel2.requestParams, str2);
                                    JSONObject jSONObject = JSON.parseObject(str2).getJSONObject("data");
                                    if (jSONObject != null) {
                                        PreRequestFetcher.c(PreRequestFetcher.this).z(preFetchModel.dataId, jSONObject);
                                        boolean a2 = af4.a(preFetchModel.requestSuccessJudge, PreRequestFetcher.c(PreRequestFetcher.this), true);
                                        PreFetchContext preFetchContext2 = preFetchContext;
                                        preFetchContext2.conditionSuccess = a2;
                                        if (!a2) {
                                            preFetchContext2.errorInfo = "返回数据成功.成功判定为失败";
                                            PreRequestFetcher.c(PreRequestFetcher.this).s("PrefetchMtopJudgeFailed", "dealPreFetchMTOP.onSuccess.conditionCheckFailed.");
                                            return;
                                        }
                                        bVar.onSuccess();
                                        return;
                                    }
                                }
                            } catch (Throwable th) {
                                wdm.h("dealPreFetchMTOP.parseObject.responseContent.error.", th);
                            }
                        }
                        PreFetchContext preFetchContext3 = preFetchContext;
                        preFetchContext3.errorInfo = "返回数据成功.处理数据失败";
                        preFetchContext3.success = false;
                        PreRequestFetcher.c(PreRequestFetcher.this).s("PrefetchMtopFailed", "dealPreFetchMTOP.onSuccess.getDataFailed.");
                    }
                }).showLoginUI(false);
                if ("GET".equals(preFetchModel.requestMethod)) {
                    methodEnum = MethodEnum.GET;
                } else {
                    methodEnum = MethodEnum.POST;
                }
                MtopBusiness reqMethod = showLoginUI.reqMethod(methodEnum);
                if (preFetchModel.needWua) {
                    reqMethod.useWua();
                }
                if (!TextUtils.isEmpty(preFetchModel.safeToken)) {
                    reqMethod.addHttpQueryParameter("asac", a1n.g(this.f13406a, preFetchModel.safeToken));
                }
                reqMethod.startRequest();
            } catch (Throwable th) {
                wdm.h("dealPreFetchMTOP.mtop.error.", th);
                this.f13406a.s("PrefetchMtopError", "");
            }
        }
    }

    public final void j(PreFetchModel preFetchModel, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f251e8", new Object[]{this, preFetchModel, bVar});
        } else if (!this.f13406a.j().B()) {
            try {
                PreFetchContext preFetchContext = new PreFetchContext();
                preFetchContext.preFetchModel = preFetchModel;
                this.f13406a.j().a(preFetchModel, preFetchContext);
                if (!this.f13406a.k().e(preFetchModel.requestMethodName, a1n.g(this.f13406a, preFetchModel.requestParams), this.f13406a.j().y(), new a(preFetchContext, preFetchModel, bVar))) {
                    this.f13406a.s("PrefetchWindvaneInvalid", "");
                }
            } catch (Throwable th) {
                wdm.h("dealPreFetchMTOP.windvane.error.", th);
                this.f13406a.s("PrefetchWindvaneError", "");
            }
        }
    }

    public final void i(final List<PreFetchModel> list, final CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9860593", new Object[]{this, list, countDownLatch});
        } else if (list != null && !list.isEmpty()) {
            PreFetchModel remove = list.remove(0);
            if (!af4.a(remove.preCondition, this.f13406a, true)) {
                i(list, countDownLatch);
                countDownLatch.countDown();
            } else if ("mtop".equals(remove.dataSource)) {
                h(remove, new b() { // from class: tb.snm
                    @Override // com.taobao.tbpoplayer.nativerender.PreRequestFetcher.b
                    public final void onSuccess() {
                        PreRequestFetcher.this.f(list, countDownLatch);
                    }
                });
            } else if ("windvane".equals(remove.dataSource)) {
                j(remove, new b() { // from class: tb.tnm
                    @Override // com.taobao.tbpoplayer.nativerender.PreRequestFetcher.b
                    public final void onSuccess() {
                        PreRequestFetcher.this.g(list, countDownLatch);
                    }
                });
            } else {
                i(list, countDownLatch);
                countDownLatch.countDown();
            }
        }
    }
}
