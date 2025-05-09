package tb;

import android.content.Context;
import android.text.TextUtils;
import anetwork.channel.Network;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.http.HttpNetwork;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon.ApiRequest;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b9j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ApiProxy";
    public static final String TLOG_TAG = "MultiGWProxy";

    static {
        t2o.a(912262460);
    }

    public static MtopResponse a(ApiRequest apiRequest, Context context) {
        Network network;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("16ec2d5", new Object[]{apiRequest, context});
        }
        if (!apiRequest.httpUrl.contains("_forceHttp")) {
            network = new DegradableNetwork(context);
        } else {
            network = new HttpNetwork(context);
        }
        MtopResponse mtopResponse = new MtopResponse();
        try {
            RequestImpl requestImpl = new RequestImpl(apiRequest.httpUrl);
            if (network instanceof DegradableNetwork) {
                int a2 = xs4.a(IDecisionResult.ENGINE_ERROR, 5000);
                requestImpl.setConnectTimeout(a2);
                requestImpl.setReadTimeout(a2);
            }
            tgh.b(TLOG_TAG, "Send Request");
            Response syncSend = network.syncSend(requestImpl, null);
            if (syncSend == null || syncSend.getBytedata() == null || syncSend.getBytedata().length <= 0) {
                tgh.b(TLOG_TAG, "[EmptyByteData]|repeat request");
                syncSend = new HttpNetwork(context).syncSend(requestImpl, null);
            }
            if (syncSend != null) {
                mtopResponse.setBytedata(syncSend.getBytedata());
                mtopResponse.setRetCode("SUCCESS");
                mtopResponse.setRetMsg(syncSend.getDesc());
                mtopResponse.setHeaderFields(syncSend.getConnHeadFields());
                apiRequest.response = syncSend;
                tgh.b(TLOG_TAG, "[ResponseReturn]|set byte data and retcode ERRCODE_SUCCESS");
                return mtopResponse;
            }
            tgh.b(TLOG_TAG, "[NullResponse]");
            return mtopResponse;
        } catch (Exception e) {
            TBSdkLog.e(TAG, "invoke httpClient.syncCall error.", e);
            tgh.b(TLOG_TAG, "[ExceptionInSendingRequest]|" + e.toString());
            return mtopResponse;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static MtopResponse b(ApiRequest apiRequest, Context context) {
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("8c119815", new Object[]{apiRequest, context});
        }
        MtopBuilder build = Mtop.instance(context).build((MtopRequest) apiRequest, nj7.c());
        if (apiRequest.post) {
            methodEnum = MethodEnum.POST;
        } else {
            methodEnum = MethodEnum.GET;
        }
        MtopBuilder reqMethod = build.reqMethod(methodEnum);
        if (apiRequest.wua) {
            reqMethod = reqMethod.useWua();
        }
        return reqMethod.syncRequest();
    }

    public static MtopResponse c(ApiRequest apiRequest, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("eb868104", new Object[]{apiRequest, context});
        }
        if (apiRequest == null) {
            return null;
        }
        if (TextUtils.isEmpty(apiRequest.httpUrl)) {
            return b(apiRequest, context);
        }
        return a(apiRequest, context);
    }
}
