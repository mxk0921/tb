package com.taobao.android.detail.ttdetail.request.preload;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.izd;
import tb.jtm;
import tb.owc;
import tb.t2o;
import tb.tgh;
import tb.w0i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainPreloadTaskCallback extends MainRequestCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MainPreloadTaskCallback";
    private w0i mMainPreloadRequestParams;
    private izd mTaskCallback;

    static {
        t2o.a(912262197);
    }

    public MainPreloadTaskCallback(w0i w0iVar, owc owcVar) {
        super(w0iVar.b(), owcVar);
        this.mMainPreloadRequestParams = w0iVar;
    }

    public static /* synthetic */ Object ipc$super(MainPreloadTaskCallback mainPreloadTaskCallback, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/preload/MainPreloadTaskCallback");
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        izd izdVar = this.mTaskCallback;
        if (izdVar != null) {
            izdVar.onFinish();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        izd izdVar = this.mTaskCallback;
        if (izdVar != null) {
            izdVar.onFinish();
        }
    }

    public void setTaskCallback(izd izdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f957b48", new Object[]{this, izdVar});
        } else {
            this.mTaskCallback = izdVar;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        boolean c = this.mMainPreloadRequestParams.c();
        tgh.b(TAG, "批量预加载请求成功回调，isNavPreload=" + c + ", currentThread=" + Thread.currentThread().getName());
        jtm.a().j(mtopResponse, this.mMainPreloadRequestParams.a(), true);
        izd izdVar = this.mTaskCallback;
        if (izdVar != null) {
            izdVar.onFinish();
        }
    }
}
