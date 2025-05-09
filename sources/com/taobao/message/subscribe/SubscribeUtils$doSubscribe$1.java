package com.taobao.message.subscribe;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.message_open_api_adapter.api.data.eventchannel.ChannelEventManager;
import com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.ChannelEvent;
import com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.IChannelSubscriber;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TypeCastException;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ckf;
import tb.jk;
import tb.uj3;
import tb.wsq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ5\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"com/taobao/message/subscribe/SubscribeUtils$doSubscribe$1", "Lcom/taobao/tao/remotebusiness/IRemoteBaseListener;", "", "requestType", "Lmtopsdk/mtop/domain/MtopResponse;", "mtopResponse", "", o.b, "Ltb/xhv;", "onSystemError", "(ILmtopsdk/mtop/domain/MtopResponse;Ljava/lang/Object;)V", "Lmtopsdk/mtop/domain/BaseOutDo;", "baseOutDo", "onSuccess", "(ILmtopsdk/mtop/domain/MtopResponse;Lmtopsdk/mtop/domain/BaseOutDo;Ljava/lang/Object;)V", "onError", "message_base_tb_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SubscribeUtils$doSubscribe$1 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $activityType;
    public final /* synthetic */ IObserver $observer;
    public final /* synthetic */ String $subFrom;
    public final /* synthetic */ String $topicId;
    public final /* synthetic */ String $type;

    public SubscribeUtils$doSubscribe$1(IObserver iObserver, String str, String str2, String str3, String str4) {
        this.$observer = iObserver;
        this.$type = str;
        this.$topicId = str2;
        this.$activityType = str3;
        this.$subFrom = str4;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        try {
            final SubScribeCenterResultDTO subScribeCenterResultDTO = new SubScribeCenterResultDTO();
            subScribeCenterResultDTO.setToastText(Constants.DEFAULT_TOAST);
            subScribeCenterResultDTO.setRetCode("MTOP_FAIL");
            subScribeCenterResultDTO.setRetMsg("接口调用失败");
            UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$doSubscribe$1$onSystemError$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Application application = Globals.getApplication();
                    String toastText = SubScribeCenterResultDTO.this.getToastText();
                    ckf.c(toastText, "subScribeCenterResultDTO.toastText");
                    TBToast.makeText(application, Util.processUIText(toastText)).show();
                }
            });
            this.$observer.onNext(subScribeCenterResultDTO);
            this.$observer.onComplete();
            if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                if (bytedata != null) {
                    TLog.loge(Constants.TAG, this.$type + " onSystemError() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString((MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse) JSON.parseObject(new String(bytedata, uj3.UTF_8), MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.class)) + "], o = [" + obj + ']');
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type mtopsdk.mtop.domain.MtopResponse");
        } catch (Throwable th) {
            TLog.loge(Constants.TAG, Log.getStackTraceString(th));
            this.$observer.onError(th);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data2;
        SubScribeCenterResultDTO subScribeCenterResultDTO;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data3;
        SubScribeCenterResultDTO subScribeCenterResultDTO2;
        final String toastText;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data4;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        try {
            if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                ckf.c(bytedata, "(mtopResponse as MtopResponse).bytedata");
                MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse = (MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse) JSON.parseObject(new String(bytedata, uj3.UTF_8), MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.class);
                TLog.loge(Constants.TAG, this.$type + " onError() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString(mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse) + "], o = [" + obj + ']');
                if ((mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse != null ? mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData() : null) != null) {
                    if (((mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse == null || (data5 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData()) == null) ? null : data5.model) == null) {
                        mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData().model = new SubScribeCenterResultDTO();
                    }
                }
                if (!(mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse == null || (data4 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData()) == null || data4.model == null)) {
                    String str = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getRet()[0];
                    ckf.c(str, "response.ret[0]");
                    List z0 = wsq.z0(str, new String[]{"::"}, false, 0, 6, null);
                    SubScribeCenterResultDTO subScribeCenterResultDTO3 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData().model;
                    ckf.c(subScribeCenterResultDTO3, "response.data.model");
                    subScribeCenterResultDTO3.setRetCode((String) z0.get(0));
                    SubScribeCenterResultDTO subScribeCenterResultDTO4 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData().model;
                    ckf.c(subScribeCenterResultDTO4, "response.data.model");
                    subScribeCenterResultDTO4.setRetMsg((String) z0.get(1));
                }
                if (!(mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse == null || (data3 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData()) == null || (subScribeCenterResultDTO2 = data3.model) == null || (toastText = subScribeCenterResultDTO2.getToastText()) == null || TextUtils.isEmpty(toastText))) {
                    UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$doSubscribe$1$onError$2$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText)).show();
                            }
                        }
                    });
                }
                if (((mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse == null || (data2 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData()) == null || (subScribeCenterResultDTO = data2.model) == null) ? null : subScribeCenterResultDTO.getToastText()) == null) {
                    UIHandler.post(SubscribeUtils$doSubscribe$1$onError$3.INSTANCE);
                }
                IObserver iObserver = this.$observer;
                SubScribeCenterResultDTO subScribeCenterResultDTO5 = (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse == null || (data = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData()) == null) ? null : data.model;
                if (subScribeCenterResultDTO5 != null) {
                    iObserver.onNext(subScribeCenterResultDTO5);
                    this.$observer.onComplete();
                    return;
                }
                ckf.s();
                throw null;
            }
            throw new TypeCastException("null cannot be cast to non-null type mtopsdk.mtop.domain.MtopResponse");
        } catch (Throwable th) {
            TLog.loge(Constants.TAG, Log.getStackTraceString(th));
            UIHandler.post(SubscribeUtils$doSubscribe$1$onError$4.INSTANCE);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data2;
        SubScribeCenterResultDTO subScribeCenterResultDTO;
        final String toastText;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data3;
        SubScribeCenterResultDTO subScribeCenterResultDTO2;
        Map<String, Object> subscribeConfirmResponse;
        MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        try {
            final MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse = (MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse) baseOutDo;
            TLog.loge(Constants.TAG, this.$type + " onSuccess() called with: requestType = [" + i + "], mtopResponse = [" + JSON.toJSONString(mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse) + "], o = [" + obj + ']');
            if (!(mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse == null || (data4 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData()) == null || data4.model == null)) {
                String str = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getRet()[0];
                ckf.c(str, "response.ret[0]");
                List z0 = wsq.z0(str, new String[]{"::"}, false, 0, 6, null);
                SubScribeCenterResultDTO subScribeCenterResultDTO3 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData().model;
                ckf.c(subScribeCenterResultDTO3, "response.data.model");
                subScribeCenterResultDTO3.setRetCode((String) z0.get(0));
                SubScribeCenterResultDTO subScribeCenterResultDTO4 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData().model;
                ckf.c(subScribeCenterResultDTO4, "response.data.model");
                subScribeCenterResultDTO4.setRetMsg((String) z0.get(1));
            }
            SubScribeCenterResultDTO subScribeCenterResultDTO5 = null;
            if (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse == null || (data3 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData()) == null || (subScribeCenterResultDTO2 = data3.model) == null || (subscribeConfirmResponse = subScribeCenterResultDTO2.getSubscribeConfirmResponse()) == null || !ckf.b(subscribeConfirmResponse.get("needConfirm"), "true")) {
                if (!(mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse == null || (data2 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData()) == null || (subScribeCenterResultDTO = data2.model) == null || (toastText = subScribeCenterResultDTO.getToastText()) == null || TextUtils.isEmpty(toastText))) {
                    UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$doSubscribe$1$onSuccess$3$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                TBToast.makeText(Globals.getApplication(), Util.processUIText(toastText)).show();
                            }
                        }
                    });
                }
                IObserver iObserver = this.$observer;
                SubScribeCenterResultDTO subScribeCenterResultDTO6 = (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse == null || (data = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData()) == null) ? null : data.model;
                if (subScribeCenterResultDTO6 != null) {
                    iObserver.onNext(subScribeCenterResultDTO6);
                    this.$observer.onComplete();
                    Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                    intent.putExtra("event", "poplayer://2020PushRecall");
                    LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
                    return;
                }
                ckf.s();
                throw null;
            }
            final String uuid = UUID.randomUUID().toString();
            ckf.c(uuid, "UUID.randomUUID().toString()");
            ChannelEventManager.INSTANCE.addSubscriber(new IChannelSubscriber() { // from class: com.taobao.message.subscribe.SubscribeUtils$doSubscribe$1$onSuccess$$inlined$let$lambda$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.IChannelSubscriber
                public String topic() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("9373c52a", new Object[]{this});
                    }
                    return "confirmStatus";
                }

                @Override // com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.IChannelSubscriber
                public void onEvent(List<ChannelEvent> list) {
                    SubScribeCenterResultDTO subScribeCenterResultDTO7;
                    MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data5;
                    MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data6;
                    MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data7;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("38ab9ff3", new Object[]{this, list});
                        return;
                    }
                    ckf.h(list, "event");
                    if (!list.isEmpty()) {
                        JSONObject data8 = list.get(0).getData();
                        if (ckf.b(uuid, data8.getString("traceId"))) {
                            String string = data8.getString("retType");
                            String string2 = data8.getString("retData");
                            if (string != null) {
                                int hashCode = string.hashCode();
                                if (hashCode != -1093910523) {
                                    if (hashCode == 193898076 && string.equals("clickAllowResultFail")) {
                                        SubScribeCenterResultDTO subScribeCenterResultDTO8 = new SubScribeCenterResultDTO();
                                        JSONObject parseObject = JSON.parseObject(string2);
                                        subScribeCenterResultDTO8.setToastText("");
                                        subScribeCenterResultDTO8.setRetCode(parseObject.getString(jk.KEY_RET_CODE));
                                        subScribeCenterResultDTO8.setRetMsg(parseObject.getString(jk.KEY_RET_MSG));
                                        this.$observer.onNext(subScribeCenterResultDTO8);
                                        this.$observer.onComplete();
                                        ChannelEventManager.INSTANCE.removeSubscriber(this);
                                    }
                                } else if (string.equals("clickAllowResultSuccess")) {
                                    try {
                                        final MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2 = (MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse) JSON.parseObject(string2, MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.class);
                                        String str2 = null;
                                        if ((mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2 != null ? mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.getData() : null) != null) {
                                            if (((mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2 == null || (data7 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.getData()) == null) ? null : data7.model) == null) {
                                                mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.getData().model = new SubScribeCenterResultDTO();
                                            }
                                        }
                                        if (!(mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2 == null || (data6 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.getData()) == null || data6.model == null)) {
                                            String str3 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.getRet()[0];
                                            ckf.c(str3, "retResponse.ret[0]");
                                            List z02 = wsq.z0(str3, new String[]{"::"}, false, 0, 6, null);
                                            SubScribeCenterResultDTO subScribeCenterResultDTO9 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.getData().model;
                                            ckf.c(subScribeCenterResultDTO9, "retResponse.data.model");
                                            subScribeCenterResultDTO9.setRetCode((String) z02.get(0));
                                            SubScribeCenterResultDTO subScribeCenterResultDTO10 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.getData().model;
                                            ckf.c(subScribeCenterResultDTO10, "retResponse.data.model");
                                            subScribeCenterResultDTO10.setRetMsg((String) z02.get(1));
                                        }
                                        IObserver iObserver2 = this.$observer;
                                        SubScribeCenterResultDTO subScribeCenterResultDTO11 = (mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2 == null || (data5 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.getData()) == null) ? null : data5.model;
                                        if (subScribeCenterResultDTO11 != null) {
                                            iObserver2.onNext(subScribeCenterResultDTO11);
                                            this.$observer.onComplete();
                                            ChannelEventManager.INSTANCE.removeSubscriber(this);
                                            MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data9 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse2.getData();
                                            if (!(data9 == null || (subScribeCenterResultDTO7 = data9.model) == null)) {
                                                str2 = subScribeCenterResultDTO7.getToastText();
                                            }
                                            if (!TextUtils.isEmpty(str2)) {
                                                UIHandler.post(new Runnable() { // from class: com.taobao.message.subscribe.SubscribeUtils$doSubscribe$1$onSuccess$$inlined$let$lambda$1.1
                                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        IpChange ipChange3 = $ipChange;
                                                        if (ipChange3 instanceof IpChange) {
                                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                            return;
                                                        }
                                                        Application application = Globals.getApplication();
                                                        SubScribeCenterResultDTO subScribeCenterResultDTO12 = MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.this.getData().model;
                                                        ckf.c(subScribeCenterResultDTO12, "retResponse.data.model");
                                                        String toastText2 = subScribeCenterResultDTO12.getToastText();
                                                        ckf.c(toastText2, "retResponse.data.model.toastText");
                                                        TBToast.makeText(application, Util.processUIText(toastText2)).show();
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        ckf.s();
                                        throw null;
                                    } catch (Throwable unused) {
                                        ChannelEventManager.INSTANCE.removeSubscriber(this);
                                        this.$observer.onError(new RuntimeException("data parse error "));
                                    }
                                }
                            }
                        }
                    }
                }
            });
            Intent intent2 = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            intent2.putExtra("event", "poplayer://2020SubscribeConfirm");
            StringBuilder sb = new StringBuilder("poplayer://2020SubscribeConfirm?model=");
            MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data5 = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse.getData();
            if (data5 != null) {
                subScribeCenterResultDTO5 = data5.model;
            }
            sb.append(URLEncoder.encode(JSON.toJSONString(subScribeCenterResultDTO5)));
            sb.append("&topicId=");
            sb.append(this.$topicId);
            sb.append("&activityType=");
            sb.append(this.$activityType);
            sb.append("&subFrom=");
            sb.append(this.$subFrom);
            sb.append("&traceId=");
            sb.append(uuid);
            intent2.putExtra("param", sb.toString());
            LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent2);
        } catch (Throwable th) {
            TLog.loge(Constants.TAG, Log.getStackTraceString(th));
            this.$observer.onError(new RuntimeException("data parse error "));
        }
    }
}
