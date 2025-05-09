package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import anetwork.channel.Response;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopConvert;
import tb.b9j;
import tb.t2o;
import tb.tgh;
import tb.vdt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AsynApiTask implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f6910a = new Handler(Looper.getMainLooper(), this);
    public final Context b;
    public static final MtopResponse SUCCESS = new MtopResponse("SUCCESS", "调用成功");
    public static final MtopResponse ERROR = new MtopResponse("ANDROID_SYS_NETWORK_ERROR", "网络请求异常");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class MtopResponseWrapper implements Serializable {
        public Object data;
        public String errorRet;
        public MtopResponse mtopResponse;
        public String originalUrl;
        public Response rawResponse;

        static {
            t2o.a(912262457);
        }

        public MtopResponseWrapper() {
        }

        public MtopResponseWrapper(MtopResponse mtopResponse) {
            this.mtopResponse = mtopResponse;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Callable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ApiRequest f6911a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ ApiRequestListener c;

        public a(ApiRequest apiRequest, Map map, ApiRequestListener apiRequestListener) {
            this.f6911a = apiRequest;
            this.b = map;
            this.c = apiRequestListener;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            AsynApiTask.this.f(AsynApiTask.this.a(this.f6911a, this.b), this.c);
            return null;
        }
    }

    public AsynApiTask(Context context) {
        this.b = context;
    }

    public MtopResponseWrapper a(ApiRequest apiRequest, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponseWrapper) ipChange.ipc$dispatch("553139ca", new Object[]{this, apiRequest, map});
        }
        return new MtopResponseWrapper(b9j.c(apiRequest, this.b));
    }

    public abstract Class<? extends BaseOutDo> b();

    public void c(MtopResponseWrapper mtopResponseWrapper, ApiRequestListener apiRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e584c59", new Object[]{this, mtopResponseWrapper, apiRequestListener});
        } else if (apiRequestListener != null) {
            if (mtopResponseWrapper == null) {
                apiRequestListener.onError(ERROR);
                return;
            }
            MtopResponse mtopResponse = mtopResponseWrapper.mtopResponse;
            if (mtopResponse == null) {
                Object obj = mtopResponseWrapper.data;
                if (obj != null) {
                    apiRequestListener.onSuccess(obj);
                } else {
                    apiRequestListener.onError(ERROR);
                }
            } else if (mtopResponse.isApiSuccess()) {
                apiRequestListener.onSuccess(d(mtopResponseWrapper.mtopResponse));
            } else {
                apiRequestListener.onError(mtopResponseWrapper.mtopResponse);
            }
        }
    }

    public Object d(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("793fab92", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null || !mtopResponse.isApiSuccess() || mtopResponse.getBytedata() == null) {
            return null;
        }
        BaseOutDo jsonToOutputDO = MtopConvert.jsonToOutputDO(mtopResponse.getBytedata(), b());
        if (jsonToOutputDO != null) {
            return jsonToOutputDO.getData();
        }
        try {
            tgh.b("AsynApiTask", "output do is empty , http result is ".concat(new String(mtopResponse.getBytedata(), "UTF-8")));
        } catch (Throwable unused) {
        }
        return null;
    }

    public Future e(ApiRequest apiRequest, Map<String, String> map, ApiRequestListener apiRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("a9469a91", new Object[]{this, apiRequest, map, apiRequestListener});
        }
        return vdt.a(new a(apiRequest, map, apiRequestListener));
    }

    public void f(MtopResponseWrapper mtopResponseWrapper, ApiRequestListener apiRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3906c43", new Object[]{this, mtopResponseWrapper, apiRequestListener});
            return;
        }
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        obtain.setData(bundle);
        bundle.putSerializable("mtopResponse", mtopResponseWrapper);
        bundle.putSerializable("apiRequestListener", apiRequestListener);
        this.f6910a.sendMessage(obtain);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        Bundle data = message.getData();
        if (data != null) {
            c((MtopResponseWrapper) data.getSerializable("mtopResponse"), (ApiRequestListener) data.getSerializable("apiRequestListener"));
        }
        return true;
    }

    static {
        t2o.a(912262455);
    }
}
