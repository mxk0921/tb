package com.taobao.message.unread;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.ckf;
import tb.g1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\f\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/message/unread/RemoteGlobalUnread;", "", "<init>", "()V", "", "", "channelTypes", "Lkotlin/Function1;", "", "Ltb/xhv;", "onSuccess", "onFail", "request", "(Ljava/util/List;Ltb/g1a;Ltb/g1a;)V", "message_base_tb_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RemoteGlobalUnread {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final RemoteGlobalUnread INSTANCE = new RemoteGlobalUnread();

    static {
        t2o.a(530579502);
    }

    private RemoteGlobalUnread() {
    }

    @JvmStatic
    public static final void request(List<String> list, final g1a<? super Integer, xhv> g1aVar, final g1a<? super String, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8e8413", new Object[]{list, g1aVar, g1aVar2});
            return;
        }
        ckf.h(list, "channelTypes");
        ckf.h(g1aVar, "onSuccess");
        ckf.h(g1aVar2, "onFail");
        MtopTaobaoWirelessAmpMessageUnreadcountRequest mtopTaobaoWirelessAmpMessageUnreadcountRequest = new MtopTaobaoWirelessAmpMessageUnreadcountRequest();
        mtopTaobaoWirelessAmpMessageUnreadcountRequest.setSource("mtop");
        mtopTaobaoWirelessAmpMessageUnreadcountRequest.setMsgChannelTypeList(JSON.toJSONString(list));
        mtopTaobaoWirelessAmpMessageUnreadcountRequest.setStartTime(System.currentTimeMillis() - 1209600000);
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoWirelessAmpMessageUnreadcountRequest).registerListener(new IRemoteListener() { // from class: com.taobao.message.unread.RemoteGlobalUnread$request$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    g1aVar2.invoke("onError");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                JSONObject dataJsonObject;
                JSONObject jSONObject;
                int i2 = 0;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (!(mtopResponse == null || (dataJsonObject = mtopResponse.getDataJsonObject()) == null || dataJsonObject.getBoolean("fail"))) {
                    try {
                        g1a g1aVar3 = g1a.this;
                        JSONObject dataJsonObject2 = mtopResponse.getDataJsonObject();
                        if (!(dataJsonObject2 == null || (jSONObject = dataJsonObject2.getJSONObject("data")) == null)) {
                            i2 = jSONObject.getInt("totalUnReadNum");
                        }
                        g1aVar3.invoke(Integer.valueOf(i2));
                        return;
                    } catch (Exception e) {
                        TLog.loge("RemoteGlobalUnread", Log.getStackTraceString(e));
                        g1aVar2.invoke("lack data");
                    }
                }
                g1aVar2.invoke("service fail");
            }
        }).startRequest(MtopTaobaoWirelessAmpMessageUnreadcountResponse.class);
    }
}
