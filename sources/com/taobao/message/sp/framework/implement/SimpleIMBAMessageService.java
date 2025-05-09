package com.taobao.message.sp.framework.implement;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleMessageListResult;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmpImbaMessageSessionListRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmpImbaMessageSessionListResponse;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import kotlin.Metadata;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ=\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0019J=\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0016¢\u0006\u0004\b\u001d\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleIMBAMessageService;", "Lcom/taobao/message/sp/framework/implement/SimpleBaseMessageService;", "", "mIdentifier", "mChannelType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "receiverId", "msgBody", "Lcom/taobao/message/kit/core/IObserver;", "", "observer", "Ltb/xhv;", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", "receiverNick", "sendMessageByNick", "targetId", "", "cursor", "forward", "", "count", "Lcom/taobao/message/sp/framework/model/SimpleMessageListResult;", "listMessages", "(Ljava/lang/String;JZILcom/taobao/message/kit/core/IObserver;)V", "nick", "listMessagesByNick", "ccode", "listMessagesByCCode", "Ljava/lang/String;", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleIMBAMessageService extends SimpleBaseMessageService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        t2o.a(552599656);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleIMBAMessageService(String str, String str2) {
        super(str, str2);
        ckf.h(str, "mIdentifier");
        ckf.h(str2, "mChannelType");
        this.mIdentifier = str;
        this.mChannelType = str2;
    }

    public static /* synthetic */ Object ipc$super(SimpleIMBAMessageService simpleIMBAMessageService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/framework/implement/SimpleIMBAMessageService");
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
        iObserver.onError(new IllegalAccessException("not impl"));
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
        MtopTaobaoWirelessAmpImbaMessageSessionListRequest mtopTaobaoWirelessAmpImbaMessageSessionListRequest = new MtopTaobaoWirelessAmpImbaMessageSessionListRequest();
        mtopTaobaoWirelessAmpImbaMessageSessionListRequest.setAccessKey("taobao-app");
        mtopTaobaoWirelessAmpImbaMessageSessionListRequest.setAccessToken("taobao-app-secret");
        mtopTaobaoWirelessAmpImbaMessageSessionListRequest.setLastMsgTime(j);
        mtopTaobaoWirelessAmpImbaMessageSessionListRequest.setConversationId(str);
        mtopTaobaoWirelessAmpImbaMessageSessionListRequest.setPageSize(i);
        mtopTaobaoWirelessAmpImbaMessageSessionListRequest.setDirection(z ? 0L : 1L);
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoWirelessAmpImbaMessageSessionListRequest).registerListener((IRemoteListener) new SimpleIMBAMessageService$listMessagesByCCode$1(iObserver)).startRequest(MtopTaobaoWirelessAmpImbaMessageSessionListResponse.class);
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
        iObserver.onError(new IllegalAccessException("not impl"));
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
        iObserver.onError(new IllegalAccessException("not impl"));
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
        iObserver.onError(new IllegalAccessException("not impl"));
    }
}
