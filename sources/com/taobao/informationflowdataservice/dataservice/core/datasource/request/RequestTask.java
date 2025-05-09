package com.taobao.informationflowdataservice.dataservice.core.datasource.request;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetRequestParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.edv;
import tb.fdv;
import tb.fs8;
import tb.i65;
import tb.jrg;
import tb.mst;
import tb.n3o;
import tb.nt6;
import tb.q4a;
import tb.t2o;
import tb.ugh;
import tb.w5o;
import tb.xs6;
import tb.zqm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RequestTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RemoteBusiness f10838a;
    public final AwesomeGetRequestParams b;
    public final fs8 c;
    public n3o d;
    public String f;
    public final AwesomeMtopListener g = new AwesomeMtopListener();
    public final zqm e = new zqm();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopResponse f10839a;

        public a(MtopResponse mtopResponse) {
            this.f10839a = mtopResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RequestTask.c(RequestTask.this, this.f10839a);
            }
        }
    }

    static {
        t2o.a(487587898);
    }

    public RequestTask(AwesomeGetRequestParams awesomeGetRequestParams, fs8 fs8Var) {
        this.b = awesomeGetRequestParams;
        this.c = fs8Var;
    }

    public static /* synthetic */ void a(RequestTask requestTask, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86aeb9c4", new Object[]{requestTask, mtopResponse});
        } else {
            requestTask.j(mtopResponse);
        }
    }

    public static /* synthetic */ n3o b(RequestTask requestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n3o) ipChange.ipc$dispatch("3d969224", new Object[]{requestTask});
        }
        return requestTask.d;
    }

    public static /* synthetic */ void c(RequestTask requestTask, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d3d182", new Object[]{requestTask, mtopResponse});
        } else {
            requestTask.d(mtopResponse);
        }
    }

    public final void d(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6cfb43", new Object[]{this, mtopResponse});
            return;
        }
        try {
            jrg.e(fdv.F_NETWORK_REQUEST, "gateway.RequestTask", "AwesomeGetRequestParams ：" + JSON.toJSONString(this.b) + " ---- result : " + new String(mtopResponse.getBytedata()));
        } catch (OutOfMemoryError unused) {
            jrg.c(fdv.F_NETWORK_REQUEST, "gateway.RequestTask", "oom, no log.", "", "");
        } catch (Throwable th) {
            jrg.c(fdv.F_NETWORK_REQUEST, "gateway.RequestTask", "log error, no log.", "", th.getMessage());
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745ee826", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.f10838a;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
    }

    public void f(n3o n3oVar, Map<String, String> map, xs6 xs6Var) {
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa243b87", new Object[]{this, n3oVar, map, xs6Var});
            return;
        }
        this.d = n3oVar;
        ugh.b("gateway2-RequestTask.execute", "");
        Set<String> g = g();
        if (g.size() != 0) {
            this.f = h(g().iterator().next());
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) this.b, q4a.c);
            this.f10838a = build;
            build.setBizTopic(this.f);
            fs8 fs8Var = this.c;
            if (!(fs8Var == null || (methodEnum = fs8Var.b) == null)) {
                this.f10838a.reqMethod(methodEnum);
            }
            if (map != null) {
                this.f10838a.headers(map);
            }
            fs8 fs8Var2 = this.c;
            if (fs8Var2 == null || !fs8Var2.c) {
                this.f10838a.registerListener((IRemoteListener) this.g).startRequest(AwesomeGetResponse.class);
                if (n3oVar != null) {
                    n3oVar.start();
                    return;
                }
                return;
            }
            i65.c("doRequest", " 预加载请求, requestType:" + this.f);
            this.e.c(this.f10838a, this.c, xs6Var, g);
        }
    }

    public Set<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("e98c6fe3", new Object[]{this});
        }
        return this.b.getContainerParams().keySet();
    }

    public String h(String str) {
        AwesomeGetContainerParams awesomeGetContainerParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b500d9c", new Object[]{this, str});
        }
        AwesomeGetRequestParams awesomeGetRequestParams = this.b;
        if (awesomeGetRequestParams == null || awesomeGetRequestParams.getContainerParams() == null || (awesomeGetContainerParams = this.b.getContainerParams().get(str)) == null) {
            return "";
        }
        return awesomeGetContainerParams.getRequestType();
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f8429b0", new Object[]{this});
        }
        return this.c.f19496a;
    }

    public final void j(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab09188", new Object[]{this, mtopResponse});
        } else if (this.b != null && mtopResponse != null && mtopResponse.getMtopStat() != null) {
            if (mst.a()) {
                nt6.a().c(new a(mtopResponse));
            } else {
                d(mtopResponse);
            }
            w5o.a(mtopResponse, w5o.c(this.b));
        }
    }

    public boolean k(String str, String str2) {
        AwesomeGetContainerParams awesomeGetContainerParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5fe3068", new Object[]{this, str, str2})).booleanValue();
        }
        AwesomeGetRequestParams awesomeGetRequestParams = this.b;
        if (awesomeGetRequestParams == null || awesomeGetRequestParams.getContainerParams() == null || (awesomeGetContainerParams = this.b.getContainerParams().get(str2)) == null) {
            return false;
        }
        return str.equals(awesomeGetContainerParams.getRequestType());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class AwesomeMtopListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(487587900);
            t2o.a(589299719);
        }

        public AwesomeMtopListener() {
        }

        private boolean isResponseEmpty(BaseOutDo baseOutDo) {
            AwesomeGetData data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e8fc1675", new Object[]{this, baseOutDo})).booleanValue();
            }
            if (baseOutDo == null || baseOutDo.getData() == null || !(baseOutDo instanceof AwesomeGetResponse) || (data = ((AwesomeGetResponse) baseOutDo).getData()) == null || data.getContainers() == null || data.getContainers().isEmpty()) {
                return true;
            }
            boolean z = true;
            for (AwesomeGetContainerData awesomeGetContainerData : data.getContainers().values()) {
                if (awesomeGetContainerData.getBaseData() == null && awesomeGetContainerData.getDeltaData() == null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    break;
                }
            }
            return z;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            process(false, null, mtopResponse, obj);
            RequestTask.a(RequestTask.this, mtopResponse);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                onError(i, mtopResponse, obj);
            }
        }

        public void process(boolean z, AwesomeGetData awesomeGetData, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d174b88", new Object[]{this, new Boolean(z), awesomeGetData, mtopResponse, obj});
                return;
            }
            if (!z) {
                if (mtopResponse != null) {
                    if (!TextUtils.isEmpty(mtopResponse.getMtopStat().fullTraceId)) {
                        edv.c(mtopResponse.getApi(), mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), "fullTraceID", mtopResponse.getMtopStat().fullTraceId);
                    } else {
                        edv.c(mtopResponse.getApi(), mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), null, null);
                    }
                }
                if (RequestTask.b(RequestTask.this) != null) {
                    RequestTask.b(RequestTask.this).error(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                }
            } else if (RequestTask.b(RequestTask.this) != null) {
                RequestTask.b(RequestTask.this).a(awesomeGetData);
            }
            ugh.b("gateway2-RequestTask.process", mtopResponse.getRetCode() + "," + mtopResponse.getApi());
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (isResponseEmpty(baseOutDo)) {
                process(false, null, mtopResponse, obj);
                jrg.c(fdv.F_NETWORK_REQUEST, "result_error", "网络请求结果数据为空", "gateway.RequestTask", "response is empty");
            } else {
                process(true, ((AwesomeGetResponse) baseOutDo).getData(), mtopResponse, obj);
                RequestTask.a(RequestTask.this, mtopResponse);
            }
        }
    }
}
