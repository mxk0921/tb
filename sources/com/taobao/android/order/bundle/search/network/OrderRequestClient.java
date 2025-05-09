package com.taobao.android.order.bundle.search.network;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b6o;
import tb.lor;
import tb.r3o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderRequestClient implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RemoteBusiness mBusiness;
    private Map<String, String> mBusinessParam;
    private r3o mQueryListener;
    private static String TAG = OrderRequestClient.class.getSimpleName();
    private static int retryTime = 1;
    private static int mBizId = 20;

    static {
        t2o.a(713031872);
        t2o.a(713031873);
        t2o.a(589299719);
    }

    public void initParam(String str, String str2, String str3, Map<String, String> map, r3o r3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c729bb73", new Object[]{this, str, str2, str3, map, r3oVar});
            return;
        }
        this.mBusinessParam = map;
        RemoteBusiness build = RemoteBusiness.build(b6o.a(str, str2, map), str3);
        this.mBusiness = build;
        build.setBizId(20);
        this.mBusiness.reqMethod(MethodEnum.POST);
        this.mBusiness.setUnitStrategy("UNIT_TRADE");
        this.mBusiness.retryTime(retryTime);
        this.mBusiness.registeListener((IRemoteListener) this);
    }

    public void onCancelRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dddec9d", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.mBusiness;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
        Map<String, String> map = this.mBusinessParam;
        if (map != null) {
            map.clear();
            this.mBusiness = null;
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String str = "";
        if (mtopResponse != null) {
            String str2 = TAG;
            String api = mtopResponse.getApi();
            String retCode = mtopResponse.getRetCode();
            StringBuilder sb = new StringBuilder("mBusinessParam:");
            Map<String, String> map = this.mBusinessParam;
            if (map != null) {
                str = map.toString();
            }
            sb.append(str);
            lor.c(str2, "onError", api, retCode, sb.toString());
            return;
        }
        String str3 = TAG;
        StringBuilder sb2 = new StringBuilder("mBusinessParam:");
        Map<String, String> map2 = this.mBusinessParam;
        if (map2 != null) {
            str = map2.toString();
        }
        sb2.append(str);
        lor.c(str3, "onError", sb2.toString());
    }

    public void onStartRequest() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.mBusiness;
        if (remoteBusiness != null) {
            remoteBusiness.startRequest();
        }
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("mBusinessParam:");
        Map<String, String> map = this.mBusinessParam;
        if (map == null) {
            str = "";
        } else {
            str = map.toString();
        }
        sb.append(str);
        lor.c(str2, "onStartRequest", sb.toString());
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        String str = "";
        if (mtopResponse != null) {
            String str2 = TAG;
            String api = mtopResponse.getApi();
            String retCode = mtopResponse.getRetCode();
            StringBuilder sb = new StringBuilder("mBusinessParam:");
            Map<String, String> map = this.mBusinessParam;
            if (map != null) {
                str = map.toString();
            }
            sb.append(str);
            lor.c(str2, "onSuccess", api, retCode, sb.toString());
            return;
        }
        String str3 = TAG;
        StringBuilder sb2 = new StringBuilder("mBusinessParam:");
        Map<String, String> map2 = this.mBusinessParam;
        if (map2 != null) {
            str = map2.toString();
        }
        sb2.append(str);
        lor.c(str3, "onSuccess", sb2.toString());
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String str = "";
        if (mtopResponse != null) {
            String str2 = TAG;
            String api = mtopResponse.getApi();
            String retCode = mtopResponse.getRetCode();
            if (("mBusinessParam:" + this.mBusinessParam) != null) {
                str = this.mBusinessParam.toString();
            }
            lor.c(str2, "onSystemError", api, retCode, str);
            return;
        }
        String str3 = TAG;
        StringBuilder sb = new StringBuilder("mBusinessParam:");
        Map<String, String> map = this.mBusinessParam;
        if (map != null) {
            str = map.toString();
        }
        sb.append(str);
        lor.c(str3, "onSystemError", sb.toString());
    }
}
