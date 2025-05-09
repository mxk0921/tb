package com.taobao.android.detail.ttdetail.async.mtop;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.a;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.k3i;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MtopRequester {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler d;

    /* renamed from: a  reason: collision with root package name */
    public final String f6694a;
    public final String b;
    public final JSONObject c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void onFail(String str);

        void onSuccess(JSONObject jSONObject);
    }

    static {
        t2o.a(912261285);
        HandlerThread handlerThread = new HandlerThread("TTDetailAsyncComponent");
        handlerThread.start();
        d = new Handler(handlerThread.getLooper());
    }

    public MtopRequester(a.c cVar) {
        this.f6694a = cVar.b();
        this.b = cVar.c();
        this.c = new JSONObject(k3i.c(cVar.a()));
    }

    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4bb1a6", new Object[]{this, aVar});
        } else if (aVar != null && !TextUtils.isEmpty(this.f6694a) && !TextUtils.isEmpty(this.b) && this.c != null) {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setData(this.c.toJSONString());
            mtopRequest.setApiName(this.f6694a);
            mtopRequest.setVersion(this.b);
            RemoteBusiness build = RemoteBusiness.build(mtopRequest);
            build.handler(d);
            build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private void error(String str, MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9f4ec1e", new Object[]{this, str, mtopResponse});
                        return;
                    }
                    String str2 = "source=" + str;
                    try {
                        if (mtopResponse != null) {
                            str2 = str2 + ", api=" + mtopResponse.getApi() + ", isApiSuccess=" + mtopResponse.isApiSuccess() + ", ResponseErrorMsg: " + mtopResponse.getRetMsg();
                        } else {
                            str2 = str2 + "mtopResponse null";
                        }
                        aVar.onFail(str2);
                        tgh.b("MtopRequester", str2);
                    } catch (Throwable th) {
                        tgh.b("MtopRequester", str2 + "exception=" + Log.getStackTraceString(th));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        error("onError", mtopResponse);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    if (mtopResponse == null || mtopResponse.getBytedata() == null || !mtopResponse.isApiSuccess()) {
                        error("onSuccess", mtopResponse);
                    }
                    aVar.onSuccess(JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data"));
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        error("onSystemError", mtopResponse);
                    }
                }
            });
            build.reqMethod(MethodEnum.POST);
            build.startRequest();
        }
    }
}
