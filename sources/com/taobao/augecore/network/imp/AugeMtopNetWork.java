package com.taobao.augecore.network.imp;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.augecore.network.NetworkRequest;
import com.taobao.augecore.network.NetworkResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.gj1;
import tb.guj;
import tb.hj1;
import tb.jj1;
import tb.vsj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AugeMtopNetWork implements vsj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void a(AugeMtopNetWork augeMtopNetWork, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4e0f0a", new Object[]{augeMtopNetWork, mtopResponse});
        } else {
            augeMtopNetWork.d(mtopResponse);
        }
    }

    public static /* synthetic */ NetworkResponse b(AugeMtopNetWork augeMtopNetWork, MtopResponse mtopResponse, BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkResponse) ipChange.ipc$dispatch("dfc6aaff", new Object[]{augeMtopNetWork, mtopResponse, baseOutDo});
        }
        return augeMtopNetWork.c(mtopResponse, baseOutDo);
    }

    public final NetworkResponse c(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkResponse) ipChange.ipc$dispatch("766b583", new Object[]{this, mtopResponse, baseOutDo});
        }
        NetworkResponse networkResponse = new NetworkResponse();
        if (mtopResponse == null) {
            return networkResponse;
        }
        networkResponse.errorCode = mtopResponse.getRetCode();
        networkResponse.errorMsg = mtopResponse.getRetMsg();
        networkResponse.isSuccess = mtopResponse.isApiSuccess();
        networkResponse.pojo = baseOutDo;
        if (mtopResponse.getDataJsonObject() != null) {
            networkResponse.jsonData = mtopResponse.getDataJsonObject().toString();
        }
        return networkResponse;
    }

    public final void d(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefaeda5", new Object[]{this, mtopResponse});
            return;
        }
        if (mtopResponse.isApiSuccess()) {
            hj1.a(jj1.LOG_TAG, "网络请求成功");
        } else if (mtopResponse.isSessionInvalid()) {
            hj1.b(jj1.LOG_TAG, "session 失效， do autologin or login business msg = " + mtopResponse.getRetMsg());
        } else if (mtopResponse.isSystemError() || mtopResponse.isNetworkError() || mtopResponse.isExpiredRequest() || mtopResponse.is41XResult() || mtopResponse.isApiLockedResult() || mtopResponse.isMtopSdkError()) {
            hj1.b(jj1.LOG_TAG, "系统错误，网络错误，防刷，防雪崩 msg =" + mtopResponse.getRetMsg());
        } else {
            hj1.b(jj1.LOG_TAG, "业务错误 msg =" + mtopResponse.getRetMsg());
        }
        hj1.a(jj1.LOG_TAG, "回调所在线程：" + Thread.currentThread().getName());
    }

    public boolean e(final guj gujVar, NetworkRequest networkRequest, Handler handler, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89743a73", new Object[]{this, gujVar, networkRequest, handler, cls})).booleanValue();
        }
        if (networkRequest == null) {
            if (gujVar != null) {
                ((gj1.a) gujVar).a(null);
            } else {
                hj1.b(jj1.LOG_TAG, "sendRequest 失败，request & listener 为 null");
            }
            return false;
        }
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, jj1.h().f22023a), networkRequest);
        build.setSocketTimeoutMilliSecond(15000);
        build.setConnectionTimeoutMilliSecond(15000);
        if (handler != null) {
            build.handler(handler);
        }
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.augecore.network.imp.AugeMtopNetWork.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AugeMtopNetWork.a(AugeMtopNetWork.this, mtopResponse);
                ((gj1.a) gujVar).a(AugeMtopNetWork.b(AugeMtopNetWork.this, mtopResponse, null));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                AugeMtopNetWork.a(AugeMtopNetWork.this, mtopResponse);
                ((gj1.a) gujVar).b(AugeMtopNetWork.b(AugeMtopNetWork.this, mtopResponse, baseOutDo));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AugeMtopNetWork.a(AugeMtopNetWork.this, mtopResponse);
                ((gj1.a) gujVar).a(AugeMtopNetWork.b(AugeMtopNetWork.this, mtopResponse, null));
            }
        }).startRequest(cls);
        return true;
    }
}
