package com.taobao.android.detail.ttdetail.request.callback;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.params.PreloadRequestParams;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a4o;
import tb.bw7;
import tb.irm;
import tb.izd;
import tb.jtm;
import tb.mtm;
import tb.owc;
import tb.t2o;
import tb.tgh;
import tb.wrm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PreloadRequestCallback implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVER_RT = "s-rt";
    private static final String TAG = "PreloadRequestCallback";
    private PreloadRequestParams mParams;
    private izd mTaskCallback;

    static {
        t2o.a(912262170);
        t2o.a(589299719);
    }

    public PreloadRequestCallback(PreloadRequestParams preloadRequestParams) {
        this.mParams = preloadRequestParams;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
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
        monitorError();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
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
        monitorError();
    }

    public void setTaskCallback(izd izdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f957b48", new Object[]{this, izdVar});
        } else {
            this.mTaskCallback = izdVar;
        }
    }

    private void monitorError() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a9da55", new Object[]{this});
        } else if (this.mParams.isNavPreload()) {
            HashMap hashMap = new HashMap();
            wrm wrmVar = this.mParams.getItemList().get(0);
            if (wrmVar != null) {
                str = wrmVar.b;
            } else {
                str = "";
            }
            hashMap.put("itemId", str);
            bw7.b(hashMap, -200002, "预加载请求回调失败");
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        String str;
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean isNavPreload = this.mParams.isNavPreload();
        tgh.b(TAG, "预加载请求成功回调，isNavPreload=" + isNavPreload + ", currentThread=" + Thread.currentThread().getName());
        jtm.a().i(mtopResponse, this.mParams.getItemList());
        String detailToken = this.mParams.getDetailToken();
        if (isNavPreload) {
            PerformanceUtils.p(detailToken, "preResponse", currentTimeMillis);
            PerformanceUtils.p(detailToken, "preParse", currentTimeMillis);
            PerformanceUtils.p(detailToken, "preParseEnd", System.currentTimeMillis());
            Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
            if (headerFields != null && headerFields.containsKey("s-rt")) {
                String str2 = headerFields.get("s-rt").get(0);
                if (!TextUtils.isEmpty(str2)) {
                    PerformanceUtils.m(detailToken, "preSRT", Long.valueOf(str2).longValue());
                }
            }
        }
        izd izdVar = this.mTaskCallback;
        if (izdVar != null) {
            izdVar.onFinish();
        }
        a4o a4oVar = new a4o(detailToken);
        if (a4oVar.a() && isNavPreload) {
            wrm wrmVar = this.mParams.getItemList().get(0);
            if (wrmVar != null) {
                str = wrmVar.b;
            } else {
                str = "";
            }
            irm c = jtm.a().c(str);
            if (c != null && (b = c.b()) != null) {
                mtopResponse.setOriginFastJsonObject(b);
                MtopInfo mtopInfo = new MtopInfo();
                mtopInfo.e(mtopResponse);
                mtopInfo.f(2);
                owc h = a4oVar.h();
                if (h != null) {
                    tgh.b(TAG, "预加载数据直接回调");
                    h.a(mtopInfo, i, baseOutDo, obj);
                    mtm.f(str, c.d(), c.c());
                }
            }
        }
    }
}
