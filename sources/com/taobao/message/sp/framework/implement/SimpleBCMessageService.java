package com.taobao.message.sp.framework.implement;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.launcher.server_time.AmpTimeStampManager;
import com.taobao.message.sp.framework.model.SimpleMessageListResult;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcMessageListRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcMessageListResponse;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcMessageSendRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcMessageSendResponse;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u001aJ-\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ=\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u001cJ=\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ=\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0016¢\u0006\u0004\b \u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!¨\u0006\""}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleBCMessageService;", "Lcom/taobao/message/sp/framework/implement/SimpleBaseMessageService;", "", "mIdentifier", "mChannelType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "receiverNick", "msgBody", "", "isNick", "Lcom/taobao/message/kit/core/IObserver;", "observer", "Ltb/xhv;", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;ZLcom/taobao/message/kit/core/IObserver;)V", "targetId", "", "cursor", "forward", "", "count", "Lcom/taobao/message/sp/framework/model/SimpleMessageListResult;", "listMessages", "(Ljava/lang/String;JZIZLcom/taobao/message/kit/core/IObserver;)V", "receiverId", "(Ljava/lang/String;Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", "sendMessageByNick", "(Ljava/lang/String;JZILcom/taobao/message/kit/core/IObserver;)V", "nick", "listMessagesByNick", "ccode", "listMessagesByCCode", "Ljava/lang/String;", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleBCMessageService extends SimpleBaseMessageService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        t2o.a(552599644);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBCMessageService(String str, String str2) {
        super(str, str2);
        ckf.h(str, "mIdentifier");
        ckf.h(str2, "mChannelType");
        this.mIdentifier = str;
        this.mChannelType = str2;
    }

    public static /* synthetic */ Object ipc$super(SimpleBCMessageService simpleBCMessageService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/framework/implement/SimpleBCMessageService");
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleMessageService
    public void listMessages(String str, long j, boolean z, int i, IObserver<SimpleMessageListResult> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a3e806", new Object[]{this, str, new Long(j), new Boolean(z), new Integer(i), iObserver});
            return;
        }
        ckf.h(str, "targetId");
        ckf.h(iObserver, "observer");
        listMessages(str, j, z, i, false, iObserver);
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleMessageService
    public void listMessagesByCCode(String str, long j, boolean z, int i, IObserver<SimpleMessageListResult> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96cfc36b", new Object[]{this, str, new Long(j), new Boolean(z), new Integer(i), iObserver});
            return;
        }
        ckf.h(str, "ccode");
        ckf.h(iObserver, "observer");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleMessageService
    public void listMessagesByNick(String str, long j, boolean z, int i, IObserver<SimpleMessageListResult> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22396900", new Object[]{this, str, new Long(j), new Boolean(z), new Integer(i), iObserver});
            return;
        }
        ckf.h(str, "nick");
        ckf.h(iObserver, "observer");
        listMessages(str, j, z, i, true, iObserver);
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleMessageService
    public void sendMessage(String str, String str2, IObserver<Boolean> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33bffac4", new Object[]{this, str, str2, iObserver});
            return;
        }
        ckf.h(str, "receiverId");
        ckf.h(str2, "msgBody");
        ckf.h(iObserver, "observer");
        sendMessage(str, str2, false, iObserver);
    }

    private final void listMessages(String str, long j, boolean z, int i, boolean z2, IObserver<SimpleMessageListResult> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a509ca2", new Object[]{this, str, new Long(j), new Boolean(z), new Integer(i), new Boolean(z2), iObserver});
            return;
        }
        MtopTaobaoWirelessAmp2BcMessageListRequest mtopTaobaoWirelessAmp2BcMessageListRequest = new MtopTaobaoWirelessAmp2BcMessageListRequest();
        if (z2) {
            mtopTaobaoWirelessAmp2BcMessageListRequest.setTargetUserNick(str);
        } else {
            mtopTaobaoWirelessAmp2BcMessageListRequest.setTargetUserId(Long.parseLong(str));
        }
        if (j == 0) {
            AmpTimeStampManager instance = AmpTimeStampManager.instance();
            ckf.c(instance, "AmpTimeStampManager.instance()");
            j = instance.getCurrentTimeStamp();
        }
        mtopTaobaoWirelessAmp2BcMessageListRequest.setCursor(j);
        mtopTaobaoWirelessAmp2BcMessageListRequest.setForward(z);
        mtopTaobaoWirelessAmp2BcMessageListRequest.setCount(i);
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoWirelessAmp2BcMessageListRequest).registerListener((IRemoteListener) new SimpleBCMessageService$listMessages$1(z2, iObserver)).startRequest(MtopTaobaoWirelessAmp2BcMessageListResponse.class);
    }

    private final void sendMessage(String str, String str2, boolean z, final IObserver<Boolean> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b6e1a4", new Object[]{this, str, str2, new Boolean(z), iObserver});
            return;
        }
        MtopTaobaoWirelessAmp2BcMessageSendRequest mtopTaobaoWirelessAmp2BcMessageSendRequest = new MtopTaobaoWirelessAmp2BcMessageSendRequest();
        if (z) {
            mtopTaobaoWirelessAmp2BcMessageSendRequest.setReceiverNick(str);
        } else {
            mtopTaobaoWirelessAmp2BcMessageSendRequest.setReceiverId(Long.parseLong(str));
        }
        mtopTaobaoWirelessAmp2BcMessageSendRequest.setMessage(str2);
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoWirelessAmp2BcMessageSendRequest).registerListener(new IRemoteListener() { // from class: com.taobao.message.sp.framework.implement.SimpleBCMessageService$sendMessage$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    IObserver.this.onError(new IllegalStateException(String.valueOf(i)));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                String str3;
                JSONObject dataJsonObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                IObserver iObserver2 = IObserver.this;
                if (mtopResponse == null || (dataJsonObject = mtopResponse.getDataJsonObject()) == null || (str3 = dataJsonObject.getString("result")) == null) {
                    str3 = "false";
                }
                iObserver2.onNext(Boolean.valueOf(ckf.b("true", str3)));
                IObserver.this.onComplete();
            }
        }).startRequest(MtopTaobaoWirelessAmp2BcMessageSendResponse.class);
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleMessageService
    public void sendMessageByNick(String str, String str2, IObserver<Boolean> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea48b24a", new Object[]{this, str, str2, iObserver});
            return;
        }
        ckf.h(str, "receiverNick");
        ckf.h(str2, "msgBody");
        ckf.h(iObserver, "observer");
        sendMessage(str, str2, true, iObserver);
    }
}
