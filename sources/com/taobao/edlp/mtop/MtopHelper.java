package com.taobao.edlp.mtop;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.a81;
import tb.b98;
import tb.pp6;
import tb.t2o;
import tb.uto;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1032847381);
    }

    public static void a(final MtopRequest mtopRequest, final pp6<JSONObject> pp6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723f3b7c", new Object[]{mtopRequest, pp6Var});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        MtopBusiness build = MtopBusiness.build(Mtop.instance((Context) null, b98.c()), mtopRequest, b98.c());
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.edlp.mtop.MtopHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.edlp.mtop.MtopHelper$1$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ MtopResponse f10401a;

                public a(MtopResponse mtopResponse) {
                    this.f10401a = mtopResponse;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    pp6.this.onData(JSON.parseObject(new String(this.f10401a.getBytedata())));
                    pp6.this.onComplete();
                    a81.c("Page_Edlp", "tab3PreRequest", mtopRequest.getApiName());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    TLog.loge("tab3edlp", mtopResponse.toString());
                }
                pp6 pp6Var2 = pp6.this;
                if (pp6Var2 != null && mtopResponse != null) {
                    pp6Var2.onError(mtopResponse.getRetCode(), mtopResponse.getRetMsg(), obj);
                    a81.b("Page_Edlp", "tab3PreRequest", mtopRequest.getApiName(), mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (mtopResponse != null) {
                    TLog.loge("tab3edlp", mtopResponse.getApi() + " request use time is  " + (System.currentTimeMillis() - currentTimeMillis));
                }
                if (pp6.this != null && mtopResponse != null) {
                    uto.a().execute(new a(mtopResponse));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    TLog.loge("tab3edlp", mtopResponse.toString());
                }
                pp6 pp6Var2 = pp6.this;
                if (pp6Var2 != null && mtopResponse != null) {
                    pp6Var2.onError(mtopResponse.getRetCode(), mtopResponse.getRetMsg(), obj);
                    a81.b("Page_Edlp", "tab3PreRequest", mtopRequest.getApiName(), mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                }
            }
        });
        build.startRequest();
    }
}
