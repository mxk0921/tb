package com.taobao.android.promotion.content;

import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;
import tb.zp4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ContentRequestClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zp4 f9196a;
    public final HandlerThread b;
    public final Handler c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class RemoteBaseListenerProxy implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<IRemoteBaseListener> mRefListener;

        static {
            t2o.a(629145618);
            t2o.a(589299719);
        }

        public RemoteBaseListenerProxy(IRemoteBaseListener iRemoteBaseListener) {
            this.mRefListener = new WeakReference<>(iRemoteBaseListener);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            IRemoteBaseListener iRemoteBaseListener = this.mRefListener.get();
            if (iRemoteBaseListener != null) {
                iRemoteBaseListener.onError(i, mtopResponse, obj);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            IRemoteBaseListener iRemoteBaseListener = this.mRefListener.get();
            if (iRemoteBaseListener != null) {
                iRemoteBaseListener.onSuccess(i, mtopResponse, baseOutDo, obj);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            IRemoteBaseListener iRemoteBaseListener = this.mRefListener.get();
            if (iRemoteBaseListener != null) {
                iRemoteBaseListener.onSystemError(i, mtopResponse, obj);
            }
        }
    }

    static {
        t2o.a(629145617);
    }

    public ContentRequestClient(String str, String str2, String str3) {
        HandlerThread handlerThread = new HandlerThread("content request");
        this.b = handlerThread;
        this.f9196a = new zp4(str, str2, str3);
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
    }

    public final RemoteBusiness a(zp4 zp4Var, String str, IRemoteBaseListener iRemoteBaseListener, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("17510cbb", new Object[]{this, zp4Var, str, iRemoteBaseListener, new Boolean(z)});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(JSON.toJSONString(zp4Var.d()));
        if (z) {
            str2 = "mtop.taobao.seed.list";
        } else {
            str2 = "mtop.taobao.detail.content.list";
        }
        mtopRequest.setApiName(str2);
        mtopRequest.setVersion("1.0");
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, str);
        build.registerListener((IRemoteListener) new RemoteBaseListenerProxy(iRemoteBaseListener));
        build.setUnitStrategy("UNIT_TRADE");
        build.setBizId(9998);
        build.handler(this.c);
        return build;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.b.quitSafely();
        }
    }

    public void c(String str, String str2, IRemoteBaseListener iRemoteBaseListener, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbb5a25", new Object[]{this, str, str2, iRemoteBaseListener, new Boolean(z), jSONObject});
            return;
        }
        this.f9196a.b(str);
        this.f9196a.c(str2);
        this.f9196a.a(jSONObject);
        a(this.f9196a, "", iRemoteBaseListener, z).asyncRequest();
    }
}
