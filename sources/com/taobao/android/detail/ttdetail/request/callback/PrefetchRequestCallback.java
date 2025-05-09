package com.taobao.android.detail.ttdetail.request.callback;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a4o;
import tb.epq;
import tb.g94;
import tb.hi8;
import tb.lf7;
import tb.owc;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.w7j;
import tb.y0i;
import tb.ywk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PrefetchRequestCallback extends MainRequestCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PrefetchRequestCallback";

    static {
        t2o.a(912262169);
    }

    public PrefetchRequestCallback(MainRequestParams mainRequestParams) {
        super(mainRequestParams, null);
    }

    private MtopInfo getDowngradeErrorMtopInfo(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopInfo) ipChange.ipc$dispatch("2d09bf13", new Object[]{this, mtopResponse});
        }
        MtopInfo mtopInfo = new MtopInfo();
        mtopInfo.e(mtopResponse);
        mtopInfo.f(3);
        lf7.r(!w7j.e(mtopResponse.getApi()), this.mParams.getItemId(), epq.a(mtopResponse));
        return mtopInfo;
    }

    private MtopInfo getDowngradeSuccessMtopInfo(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopInfo) ipChange.ipc$dispatch("637f4a0e", new Object[]{this, mtopResponse});
        }
        MtopInfo mtopInfo = new MtopInfo();
        mtopInfo.e(mtopResponse);
        JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
        if (originFastJsonObject == null && mtopResponse.getBytedata() != null) {
            originFastJsonObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
            mtopResponse.setOriginFastJsonObject(originFastJsonObject);
        }
        String a2 = epq.a(mtopResponse);
        if (originFastJsonObject == null) {
            mtopInfo.f(3);
            lf7.p(!w7j.e(mtopResponse.getApi()), this.mParams.getItemId(), a2);
            return mtopInfo;
        }
        JSONObject jSONObject = originFastJsonObject.getJSONObject("data");
        if (jSONObject == null || jSONObject.isEmpty()) {
            mtopInfo.f(3);
            lf7.p(!w7j.e(mtopResponse.getApi()), this.mParams.getItemId(), a2);
            return mtopInfo;
        }
        JSONObject j = DynamicMergeUtils.j(originFastJsonObject);
        if (ywk.h(j)) {
            handleOneProductMMDegrade(j);
        } else {
            mtopInfo.f(2);
        }
        return mtopInfo;
    }

    private void handleListener(owc owcVar, boolean z, MtopInfo mtopInfo, int i, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a47098f", new Object[]{this, owcVar, new Boolean(z), mtopInfo, new Integer(i), baseOutDo, obj});
        } else if (z) {
            owcVar.a(mtopInfo, i, baseOutDo, obj);
        } else {
            owcVar.b(mtopInfo, i, obj);
        }
    }

    public static /* synthetic */ Object ipc$super(PrefetchRequestCallback prefetchRequestCallback, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/callback/PrefetchRequestCallback");
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback
    public void handleDowngrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81c39fe", new Object[]{this, str});
            return;
        }
        new g94(this.mParams).q(this).c();
        tgh.b(TAG, "预请求降级getDetail/6.0");
        lf7.i(this.mParams.getItemId(), str);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback, com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public void handleExceptionDowngrade(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b7034a", new Object[]{this, new Integer(i), obj});
        } else if (vbl.U()) {
            handleDowngrade(epq.a(this.mMtopInfo.a()));
        } else {
            onError(i, this.mMtopInfo.a(), obj);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback
    public void handleOneProductMMDegrade(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a39e904", new Object[]{this, jSONObject});
            return;
        }
        tgh.b(TAG, "一品多商降级");
        String itemId = this.mParams.getItemId();
        Map<String, String> b = ywk.b(jSONObject);
        this.mParams.updateRefreshParams(b);
        new y0i(this.mParams).q(this).c();
        ywk.j(itemId, b);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            prefetchRequestCallback(i, mtopResponse, null, obj, false);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        PerformanceUtils.p(this.mToken, "response", System.currentTimeMillis());
        prefetchRequestCallback(i, mtopResponse, baseOutDo, obj, true);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            prefetchRequestCallback(i, mtopResponse, null, obj, false);
        }
    }

    private void handlePrefetchMtopInfo(int i, BaseOutDo baseOutDo, Object obj, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a76ad65", new Object[]{this, new Integer(i), baseOutDo, obj, new Boolean(z)});
            return;
        }
        a4o a4oVar = new a4o(this.mToken);
        if (!a4oVar.a()) {
            tgh.b(TAG, "预请求数据不回调，token=" + this.mToken);
            return;
        }
        owc h = a4oVar.h();
        if (h != null) {
            if (this.mMtopInfo.b() != 1) {
                a4oVar.b();
            }
            tgh.b(TAG, "预请求数据直接回调，status=" + this.mMtopInfo.b());
            handleListener(h, z, this.mMtopInfo, i, baseOutDo, obj);
            return;
        }
        a4o.a aVar = new a4o.a();
        if (z) {
            str = "success";
        } else {
            str = "error";
        }
        aVar.d(str);
        aVar.c(this.mMtopInfo);
        a4oVar.l(aVar);
        tgh.b(TAG, "缓存预请求结果，status=" + this.mMtopInfo.b());
    }

    private void prefetchRequestCallback(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj, boolean z) {
        MtopInfo mtopInfo;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804d9822", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj, new Boolean(z)});
            return;
        }
        this.mMtopInfo.e(mtopResponse);
        tgh.b(TAG, "主接口预请求回调，isSuccess=" + z);
        if (!epq.e(mtopResponse)) {
            String a2 = epq.a(mtopResponse);
            tgh.b(TAG, "预请求降级 prefetchRequestCallback traceId=" + a2);
            if (hi8.b(mtopResponse)) {
                this.mMtopInfo.f(3);
            } else {
                if (z) {
                    mtopInfo = getDowngradeSuccessMtopInfo(mtopResponse);
                } else {
                    mtopInfo = getDowngradeErrorMtopInfo(mtopResponse);
                }
                this.mMtopInfo = mtopInfo;
            }
        }
        if (this.mMtopInfo.b() != 0) {
            if (this.mMtopInfo.b() == 3) {
                z2 = false;
            }
            handlePrefetchMtopInfo(i, baseOutDo, obj, z2);
        }
    }
}
