package com.taobao.detail.rate.preload;

import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.model.RateInfoV2;
import com.taobao.detail.rate.mtop.RateListDetailRequest;
import com.taobao.detail.rate.preload.RateListPreRequestManager;
import com.taobao.detail.rate.vivid.utils.WeexUtils;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.a07;
import tb.ckf;
import tb.cw6;
import tb.n9l;
import tb.odg;
import tb.qp0;
import tb.sgn;
import tb.uhn;
import tb.wt6;
import tb.xgn;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RateListPreRequestManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static RateListPreRequestManager d;
    public static final JSONObject e;

    /* renamed from: a  reason: collision with root package name */
    public final List<PreRequestTask> f10343a = new ArrayList();
    public final sgn b = new sgn();
    public final ThreadPoolExecutor c;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/taobao/detail/rate/preload/RateListPreRequestManager$PreRequestTask;", "Ljava/lang/Runnable;", "Lcom/taobao/detail/rate/model/RateInfoV2;", "rateInfo", "<init>", "(Lcom/taobao/detail/rate/model/RateInfoV2;)V", "Ltb/xhv;", "run", "()V", "Lcom/taobao/detail/rate/mtop/RateListDetailRequest;", "a", "Lcom/taobao/detail/rate/mtop/RateListDetailRequest;", TplMsg.VALUE_T_NATIVE_RETURN, "()Lcom/taobao/detail/rate/mtop/RateListDetailRequest;", "request", "Lcom/taobao/detail/rate/model/RateInfoV2;", "()Lcom/taobao/detail/rate/model/RateInfoV2;", "c", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class PreRequestTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final RateListDetailRequest f10344a;
        private RateInfoV2 b;

        public PreRequestTask(RateInfoV2 rateInfoV2) {
            ckf.g(rateInfoV2, "rateInfo");
            this.b = rateInfoV2;
            this.f10344a = wt6.Companion.d(rateInfoV2);
        }

        public final RateInfoV2 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RateInfoV2) ipChange.ipc$dispatch("b4af9e08", new Object[]{this});
            }
            return this.b;
        }

        public final RateListDetailRequest b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RateListDetailRequest) ipChange.ipc$dispatch("3b9f7514", new Object[]{this});
            }
            return this.f10344a;
        }

        public final void c(RateInfoV2 rateInfoV2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ade99a16", new Object[]{this, rateInfoV2});
                return;
            }
            ckf.g(rateInfoV2, "<set-?>");
            this.b = rateInfoV2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            odg.c("RateListPreRequestManager", "PreRequestTask run start");
            if (cw6.b()) {
                odg.c("RateListPreRequestManager", "PreRequestTask run start: request = " + JSON.toJSON(this.f10344a));
            }
            MtopBusiness.build(Mtop.instance(null), this.f10344a).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.detail.rate.preload.RateListPreRequestManager$PreRequestTask$run$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    StringBuilder sb = new StringBuilder("PreRequestTask onError, msg = ");
                    String str2 = null;
                    if (mtopResponse != null) {
                        str = mtopResponse.getRetMsg();
                    } else {
                        str = null;
                    }
                    sb.append(str);
                    sb.append(" ,code=");
                    if (mtopResponse != null) {
                        str2 = mtopResponse.getRetCode();
                    }
                    sb.append(str2);
                    odg.c("RateListPreRequestManager", sb.toString());
                    RateListPreRequestManager.c(RateListPreRequestManager.Companion.a()).remove(this);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    StringBuilder sb = new StringBuilder("PreRequestTask onSuccess, msg = ");
                    String str2 = null;
                    if (mtopResponse != null) {
                        str = mtopResponse.getRetMsg();
                    } else {
                        str = null;
                    }
                    sb.append(str);
                    sb.append(" ,code=");
                    if (mtopResponse != null) {
                        str2 = mtopResponse.getRetCode();
                    }
                    sb.append(str2);
                    odg.c("RateListPreRequestManager", sb.toString());
                    uhn.a("Page_DetailComments2", "Page_DetailComments2_Pre_Request_Success");
                    ckf.d(mtopResponse);
                    JSONObject parseObject = JSON.parseObject(mtopResponse.getDataJsonObject().toString());
                    RateListPreRequestManager.a aVar = RateListPreRequestManager.Companion;
                    sgn a2 = RateListPreRequestManager.a(aVar.a());
                    RateListDetailRequest b = RateListPreRequestManager.PreRequestTask.this.b();
                    ckf.f(parseObject, "dataJson");
                    a2.e(b, parseObject, "PreRequest");
                    RateListPreRequestManager.c(aVar.a()).remove(this);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    StringBuilder sb = new StringBuilder("PreRequestTask onSystemError, msg = ");
                    String str2 = null;
                    if (mtopResponse != null) {
                        str = mtopResponse.getRetMsg();
                    } else {
                        str = null;
                    }
                    sb.append(str);
                    sb.append(" ,code=");
                    if (mtopResponse != null) {
                        str2 = mtopResponse.getRetCode();
                    }
                    sb.append(str2);
                    odg.c("RateListPreRequestManager", sb.toString());
                    RateListPreRequestManager.c(RateListPreRequestManager.Companion.a()).remove(this);
                }
            }).reqMethod(MethodEnum.POST).startRequest();
            odg.c("RateListPreRequestManager", "PreRequestTask run end");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final RateListPreRequestManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RateListPreRequestManager) ipChange.ipc$dispatch("4838f79a", new Object[]{this});
            }
            if (RateListPreRequestManager.b() == null) {
                RateListPreRequestManager.e(new RateListPreRequestManager());
            }
            RateListPreRequestManager b = RateListPreRequestManager.b();
            ckf.d(b);
            return b;
        }

        public final JSONObject b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("3a9db519", new Object[]{this});
            }
            return RateListPreRequestManager.d();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f10345a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            ckf.g(runnable, "runnable");
            this.f10345a++;
            Thread thread = new Thread(runnable);
            thread.setName("RateListPreRequestThread-" + this.f10345a);
            return thread;
        }
    }

    static {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWeex", (Object) String.valueOf(WeexUtils.INSTANCE.e()));
        e = jSONObject;
    }

    public RateListPreRequestManager() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 3, 30L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b(), new ThreadPoolExecutor.DiscardPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        xhv xhvVar = xhv.INSTANCE;
        this.c = threadPoolExecutor;
    }

    public static final /* synthetic */ sgn a(RateListPreRequestManager rateListPreRequestManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgn) ipChange.ipc$dispatch("96e6e0f6", new Object[]{rateListPreRequestManager});
        }
        return rateListPreRequestManager.b;
    }

    public static final /* synthetic */ RateListPreRequestManager b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateListPreRequestManager) ipChange.ipc$dispatch("8afe3e9f", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ List c(RateListPreRequestManager rateListPreRequestManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89d09ce5", new Object[]{rateListPreRequestManager});
        }
        return rateListPreRequestManager.f10343a;
    }

    public static final /* synthetic */ JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f5ec7b46", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ void e(RateListPreRequestManager rateListPreRequestManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3a5a37", new Object[]{rateListPreRequestManager});
        } else {
            d = rateListPreRequestManager;
        }
    }

    public final boolean f(PreRequestTask preRequestTask) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec2ebc0f", new Object[]{this, preRequestTask})).booleanValue();
        }
        xgn xgnVar = xgn.INSTANCE;
        if (!xgnVar.d() || !n9l.INSTANCE.f()) {
            z = false;
        } else {
            z = true;
        }
        int b2 = xgnVar.b();
        int a2 = xgnVar.a();
        int commentCount = preRequestTask.a().getCommentCount();
        float c = qp0.c();
        odg.c("RateListPreRequestManager", "checkCondition, enable = " + z + ", minCommentCount = " + b2 + ", maxDeviceScore = " + a2 + " currCommentCount = " + commentCount + ", deviceScore = " + c);
        if (!z || preRequestTask.a().getCommentCount() < b2 || c > a2) {
            return false;
        }
        return true;
    }

    public final boolean g(PreRequestTask preRequestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3986d323", new Object[]{this, preRequestTask})).booleanValue();
        }
        if (this.b.a(preRequestTask.b()) != null) {
            return true;
        }
        return false;
    }

    public final void h(RateInfoV2 rateInfoV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f871a9", new Object[]{this, rateInfoV2});
            return;
        }
        ckf.g(rateInfoV2, "rateInfo");
        i(new PreRequestTask(rateInfoV2));
    }

    public final void j(JSONObject jSONObject, RateInfoV2 rateInfoV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158e08f1", new Object[]{this, jSONObject, rateInfoV2});
            return;
        }
        ckf.g(jSONObject, "rateInfoJSON");
        ckf.g(rateInfoV2, "rateInfo");
        if (!f(new PreRequestTask(rateInfoV2))) {
            odg.c("RateListPreRequestManager", "submitTaskForWeex error, not satisfied the condition！");
            return;
        }
        WeexUtils weexUtils = WeexUtils.INSTANCE;
        JSONObject g = weexUtils.g(jSONObject);
        weexUtils.i(g, weexUtils.f(g, jSONObject), UltronTradeHybridStage.ON_IDLE);
        uhn.b("Page_DetailComments2", "Page_DetailComments2_Pre_Request_Start", e);
    }

    public final void i(PreRequestTask preRequestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f335781", new Object[]{this, preRequestTask});
        } else if (((ArrayList) this.f10343a).size() >= 3) {
            odg.c("RateListPreRequestManager", "submitTask error, taskList is full！");
        } else if (g(preRequestTask)) {
            odg.c("RateListPreRequestManager", "submitTask error, cache is exist！");
        } else if (!f(preRequestTask)) {
            odg.c("RateListPreRequestManager", "submitTask error, not satisfied the condition！");
        } else {
            try {
                ((ArrayList) this.f10343a).add(preRequestTask);
                this.c.execute(preRequestTask);
                uhn.a("Page_DetailComments2", "Page_DetailComments2_Pre_Request_Start");
                odg.c("RateListPreRequestManager", "submitTask success. task: " + preRequestTask);
            } catch (Throwable th) {
                odg.c("RateListPreRequestManager", "submitTask error", th);
            }
        }
    }
}
