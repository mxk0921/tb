package com.taobao.message.subscribe;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.message.WVSubscribePlugin;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ckf;
import tb.t2o;
import tb.uj3;
import tb.wsq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u000eJC\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/taobao/message/subscribe/SubscribeUtils;", "", "<init>", "()V", "", "topicId", "activityType", "version", "subFrom", "Lcom/taobao/message/kit/core/IObserver;", "Lcom/taobao/message/message_open_api/api/data/topicsubscribe/rpc/SubScribeCenterResultDTO;", "observer", "Ltb/xhv;", WVSubscribePlugin.ACTION_DO_SUBSCRIBE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", WVSubscribePlugin.ACTION_CANCEL_SUBSCRIBE, "topicIds", WVSubscribePlugin.ACTION_QUERY_SUBSCRIBE, "message_base_tb_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SubscribeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SubscribeUtils INSTANCE = new SubscribeUtils();

    static {
        t2o.a(530579479);
    }

    private SubscribeUtils() {
    }

    public final void cancelSubscribe(String str, String str2, String str3, String str4, final IObserver<SubScribeCenterResultDTO> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced58bff", new Object[]{this, str, str2, str3, str4, iObserver});
            return;
        }
        ckf.h(iObserver, "observer");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            iObserver.onError(new RuntimeException("param error "));
            return;
        }
        MtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest = new MtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest();
        if (str3 == null) {
            mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest.setVersion(1L);
        } else {
            mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest.setVersion(Long.parseLong(str3));
        }
        mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest.setTopicId(str);
        mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest.setActivityType(str2);
        mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest.setSdkVersion(Constants.SDK_VERSION);
        if (str4 != null) {
            mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest.setSubFrom(str4);
        }
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.message.subscribe.SubscribeUtils$cancelSubscribe$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                try {
                    final SubScribeCenterResultDTO subScribeCenterResultDTO = new SubScribeCenterResultDTO();
                    subScribeCenterResultDTO.setToastText(Constants.DEFAULT_TOAST);
                    subScribeCenterResultDTO.setRetCode("MTOP_FAIL");
                    subScribeCenterResultDTO.setRetMsg("接口调用失败");
                    UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$cancelSubscribe$1$onSystemError$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            Application application = Globals.getApplication();
                            String toastText = SubScribeCenterResultDTO.this.getToastText();
                            ckf.c(toastText, "subScribeCenterResultDTO.toastText");
                            TBToast.makeText(application, Util.processUIText(toastText)).show();
                        }
                    });
                    IObserver.this.onNext(subScribeCenterResultDTO);
                    IObserver.this.onComplete();
                    if (mtopResponse != null) {
                        byte[] bytedata = mtopResponse.getBytedata();
                        ckf.c(bytedata, "(mtopResponse as MtopResponse).bytedata");
                        TLog.loge(Constants.TAG, r2 + " onSystemError() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString((MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse) JSON.parseObject(new String(bytedata, uj3.UTF_8), MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.class)) + "], o = [" + obj + ']');
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type mtopsdk.mtop.domain.MtopResponse");
                } catch (Throwable th) {
                    TLog.loge(Constants.TAG, Log.getStackTraceString(th));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData data;
                MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData data2;
                SubScribeCenterResultDTO subScribeCenterResultDTO;
                MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData data3;
                SubScribeCenterResultDTO subScribeCenterResultDTO2;
                final String toastText;
                MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData data4;
                MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData data5;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                try {
                    if (mtopResponse != null) {
                        byte[] bytedata = mtopResponse.getBytedata();
                        ckf.c(bytedata, "(mtopResponse as MtopResponse).bytedata");
                        MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse = (MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse) JSON.parseObject(new String(bytedata, uj3.UTF_8), MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.class);
                        TLog.loge(Constants.TAG, r2 + " onError() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString(mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse) + "], o = [" + obj + ']');
                        if ((mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse != null ? mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData() : null) != null) {
                            if (((mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse == null || (data5 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData()) == null) ? null : data5.model) == null) {
                                mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData().model = new SubScribeCenterResultDTO();
                            }
                        }
                        if (!(mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse == null || (data4 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData()) == null || data4.model == null)) {
                            String str5 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getRet()[0];
                            ckf.c(str5, "response.ret[0]");
                            List z0 = wsq.z0(str5, new String[]{"::"}, false, 0, 6, null);
                            SubScribeCenterResultDTO subScribeCenterResultDTO3 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData().model;
                            ckf.c(subScribeCenterResultDTO3, "response.data.model");
                            subScribeCenterResultDTO3.setRetCode((String) z0.get(0));
                            SubScribeCenterResultDTO subScribeCenterResultDTO4 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData().model;
                            ckf.c(subScribeCenterResultDTO4, "response.data.model");
                            subScribeCenterResultDTO4.setRetMsg((String) z0.get(1));
                        }
                        if (!(mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse == null || (data3 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData()) == null || (subScribeCenterResultDTO2 = data3.model) == null || (toastText = subScribeCenterResultDTO2.getToastText()) == null || TextUtils.isEmpty(toastText))) {
                            UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$cancelSubscribe$1$onError$2$1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText)).show();
                                    }
                                }
                            });
                        }
                        if (((mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse == null || (data2 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData()) == null || (subScribeCenterResultDTO = data2.model) == null) ? null : subScribeCenterResultDTO.getToastText()) == null) {
                            UIHandler.post(SubscribeUtils$cancelSubscribe$1$onError$3.INSTANCE);
                        }
                        IObserver iObserver2 = IObserver.this;
                        SubScribeCenterResultDTO subScribeCenterResultDTO5 = (mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse == null || (data = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData()) == null) ? null : data.model;
                        if (subScribeCenterResultDTO5 != null) {
                            iObserver2.onNext(subScribeCenterResultDTO5);
                            IObserver.this.onComplete();
                            return;
                        }
                        ckf.s();
                        throw null;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type mtopsdk.mtop.domain.MtopResponse");
                } catch (Throwable th) {
                    TLog.loge(Constants.TAG, Log.getStackTraceString(th));
                    UIHandler.post(SubscribeUtils$cancelSubscribe$1$onError$4.INSTANCE);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                SubScribeCenterResultDTO subScribeCenterResultDTO;
                final String toastText;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    if (baseOutDo != null) {
                        MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse = (MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse) baseOutDo;
                        TLog.loge(Constants.TAG, r2 + " onSuccess() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString(mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse) + "], o = [" + obj + ']');
                        MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData data = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData();
                        if (!(data == null || data.model == null)) {
                            String str5 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getRet()[0];
                            ckf.c(str5, "response.ret[0]");
                            List z0 = wsq.z0(str5, new String[]{"::"}, false, 0, 6, null);
                            SubScribeCenterResultDTO subScribeCenterResultDTO2 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData().model;
                            ckf.c(subScribeCenterResultDTO2, "response.data.model");
                            subScribeCenterResultDTO2.setRetCode((String) z0.get(0));
                            SubScribeCenterResultDTO subScribeCenterResultDTO3 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData().model;
                            ckf.c(subScribeCenterResultDTO3, "response.data.model");
                            subScribeCenterResultDTO3.setRetMsg((String) z0.get(1));
                        }
                        MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData data2 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData();
                        if (!(data2 == null || (subScribeCenterResultDTO = data2.model) == null || (toastText = subScribeCenterResultDTO.getToastText()) == null || TextUtils.isEmpty(toastText))) {
                            UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$cancelSubscribe$1$onSuccess$2$1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText)).show();
                                    }
                                }
                            });
                        }
                        IObserver iObserver2 = IObserver.this;
                        MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData data3 = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.getData();
                        SubScribeCenterResultDTO subScribeCenterResultDTO4 = data3 != null ? data3.model : null;
                        if (subScribeCenterResultDTO4 != null) {
                            iObserver2.onNext(subScribeCenterResultDTO4);
                            IObserver.this.onComplete();
                            return;
                        }
                        ckf.s();
                        throw null;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.subscribe.MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse");
                } catch (Throwable th) {
                    TLog.loge(Constants.TAG, Log.getStackTraceString(th));
                }
            }
        });
        build.startRequest(MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse.class);
    }

    public final void querySubscribe(String str, String str2, String str3, String str4, final IObserver<SubScribeCenterResultDTO> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a4ed4d", new Object[]{this, str, str2, str3, str4, iObserver});
            return;
        }
        ckf.h(iObserver, "observer");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            iObserver.onError(new RuntimeException("param error "));
            return;
        }
        MtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest = new MtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest();
        if (str3 == null) {
            mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest.setVersion(1L);
        } else {
            mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest.setVersion(Long.parseLong(str3));
        }
        mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest.setTopicIds(str);
        mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest.setActivityType(str2);
        mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest.setSdkVersion(Constants.SDK_VERSION);
        if (str4 != null) {
            mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest.setSubFrom(str4);
        }
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopTaobaoAlimpBentleySubscribeCenterActionQueryRequest);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.message.subscribe.SubscribeUtils$querySubscribe$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                try {
                    SubScribeCenterResultDTO subScribeCenterResultDTO = new SubScribeCenterResultDTO();
                    subScribeCenterResultDTO.setToastText("");
                    subScribeCenterResultDTO.setRetCode("MTOP_FAIL");
                    subScribeCenterResultDTO.setRetMsg("接口调用失败");
                    IObserver.this.onNext(subScribeCenterResultDTO);
                    IObserver.this.onComplete();
                    if (mtopResponse != null) {
                        byte[] bytedata = mtopResponse.getBytedata();
                        ckf.c(bytedata, "(mtopResponse as MtopResponse).bytedata");
                        TLog.loge(Constants.TAG, r2 + " onSystemError() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString((MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse) JSON.parseObject(new String(bytedata, uj3.UTF_8), MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.class)) + "], o = [" + obj + ']');
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type mtopsdk.mtop.domain.MtopResponse");
                } catch (Throwable th) {
                    TLog.loge(Constants.TAG, Log.getStackTraceString(th));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData data;
                MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData data2;
                MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData data3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                try {
                    if (mtopResponse != null) {
                        byte[] bytedata = mtopResponse.getBytedata();
                        ckf.c(bytedata, "(mtopResponse as MtopResponse).bytedata");
                        MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse = (MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse) JSON.parseObject(new String(bytedata, uj3.UTF_8), MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.class);
                        TLog.loge(Constants.TAG, r2 + " onError() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString(mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse) + "], o = [" + obj + ']');
                        if ((mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse != null ? mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getData() : null) != null) {
                            if (((mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse == null || (data3 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getData()) == null) ? null : data3.model) == null) {
                                mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getData().model = new SubScribeCenterResultDTO();
                            }
                        }
                        if (!(mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse == null || (data2 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getData()) == null || data2.model == null)) {
                            String str5 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getRet()[0];
                            ckf.c(str5, "response.ret[0]");
                            List z0 = wsq.z0(str5, new String[]{"::"}, false, 0, 6, null);
                            SubScribeCenterResultDTO subScribeCenterResultDTO = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getData().model;
                            ckf.c(subScribeCenterResultDTO, "response.data.model");
                            subScribeCenterResultDTO.setRetCode((String) z0.get(0));
                            SubScribeCenterResultDTO subScribeCenterResultDTO2 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getData().model;
                            ckf.c(subScribeCenterResultDTO2, "response.data.model");
                            subScribeCenterResultDTO2.setRetMsg((String) z0.get(1));
                        }
                        IObserver iObserver2 = IObserver.this;
                        SubScribeCenterResultDTO subScribeCenterResultDTO3 = (mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse == null || (data = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getData()) == null) ? null : data.model;
                        if (subScribeCenterResultDTO3 != null) {
                            iObserver2.onNext(subScribeCenterResultDTO3);
                            IObserver.this.onComplete();
                            return;
                        }
                        ckf.s();
                        throw null;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type mtopsdk.mtop.domain.MtopResponse");
                } catch (Throwable th) {
                    TLog.loge(Constants.TAG, Log.getStackTraceString(th));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                SubScribeCenterResultDTO subScribeCenterResultDTO;
                final String toastText;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    if (baseOutDo != null) {
                        MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse = (MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse) baseOutDo;
                        TLog.loge(Constants.TAG, r2 + " onSuccess() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString(mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse) + "], o = [" + obj + ']');
                        MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData data = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getData();
                        if (!(data == null || data.model == null)) {
                            String str5 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getRet()[0];
                            ckf.c(str5, "response.ret[0]");
                            List z0 = wsq.z0(str5, new String[]{"::"}, false, 0, 6, null);
                            SubScribeCenterResultDTO subScribeCenterResultDTO2 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getData().model;
                            ckf.c(subScribeCenterResultDTO2, "response.data.model");
                            subScribeCenterResultDTO2.setRetCode((String) z0.get(0));
                            SubScribeCenterResultDTO subScribeCenterResultDTO3 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getData().model;
                            ckf.c(subScribeCenterResultDTO3, "response.data.model");
                            subScribeCenterResultDTO3.setRetMsg((String) z0.get(1));
                        }
                        MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData data2 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getData();
                        if (!(data2 == null || (subScribeCenterResultDTO = data2.model) == null || (toastText = subScribeCenterResultDTO.getToastText()) == null || TextUtils.isEmpty(toastText))) {
                            UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$querySubscribe$1$onSuccess$2$1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText)).show();
                                    }
                                }
                            });
                        }
                        IObserver iObserver2 = IObserver.this;
                        MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData data3 = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.getData();
                        SubScribeCenterResultDTO subScribeCenterResultDTO4 = data3 != null ? data3.model : null;
                        if (subScribeCenterResultDTO4 != null) {
                            iObserver2.onNext(subScribeCenterResultDTO4);
                            IObserver.this.onComplete();
                            return;
                        }
                        ckf.s();
                        throw null;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.subscribe.MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse");
                } catch (Throwable th) {
                    TLog.loge(Constants.TAG, Log.getStackTraceString(th));
                }
            }
        });
        build.startRequest(MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse.class);
    }

    public final void doSubscribe(String str, String str2, String str3, String str4, IObserver<SubScribeCenterResultDTO> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881d0a90", new Object[]{this, str, str2, str3, str4, iObserver});
            return;
        }
        ckf.h(iObserver, "observer");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            iObserver.onError(new RuntimeException("param error "));
            return;
        }
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest = new MtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest();
        if (str3 == null) {
            mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setVersion(1L);
        } else {
            mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setVersion(Long.parseLong(str3));
        }
        mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setTopicId(str);
        mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setActivityType(str2);
        mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setBindingPreCheck(true);
        mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setSdkVersion(Constants.SDK_VERSION);
        if (str4 != null) {
            mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest.setSubFrom(str4);
        }
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopTaobaoAlimpBentleySubscribeCenterActionBindingRequest);
        build.registerListener((IRemoteListener) new SubscribeUtils$doSubscribe$1(iObserver, "DoSubscribeCall", str, str2, str4));
        build.startRequest(MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.class);
    }
}
