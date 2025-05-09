package com.taobao.message.sp.framework.implement;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcConversationCreateRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcConversationCreateResponse;
import com.taobao.message.sp.framework.service.SimpleConversationCache;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.List;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.ckf;
import tb.t2o;
import tb.xz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleBCConversationService;", "Lcom/taobao/message/sp/framework/implement/SimpleBaseConversationService;", "", "mIdentifier", "mChannelType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "targetId", "Lcom/taobao/message/kit/core/IObserver;", "", "observer", "Ltb/xhv;", "createConversation", "(Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", "", "getListConversationsChannelList", "()Ljava/util/List;", "Ljava/lang/String;", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleBCConversationService extends SimpleBaseConversationService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        t2o.a(552599642);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBCConversationService(String str, String str2) {
        super(str, str2);
        ckf.h(str, "mIdentifier");
        ckf.h(str2, "mChannelType");
        this.mIdentifier = str;
        this.mChannelType = str2;
    }

    public static /* synthetic */ Object ipc$super(SimpleBCConversationService simpleBCConversationService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/framework/implement/SimpleBCConversationService");
    }

    @Override // com.taobao.message.sp.framework.implement.SimpleBaseConversationService, com.taobao.message.sp.framework.service.ISimpleConversationService
    public void createConversation(final String str, final IObserver<Boolean> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd5d578e", new Object[]{this, str, iObserver});
            return;
        }
        ckf.h(str, "targetId");
        ckf.h(iObserver, "observer");
        MtopTaobaoWirelessAmp2BcConversationCreateRequest mtopTaobaoWirelessAmp2BcConversationCreateRequest = new MtopTaobaoWirelessAmp2BcConversationCreateRequest();
        mtopTaobaoWirelessAmp2BcConversationCreateRequest.setReceiverMainNick(str);
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoWirelessAmp2BcConversationCreateRequest).registerListener(new IRemoteListener() { // from class: com.taobao.message.sp.framework.implement.SimpleBCConversationService$createConversation$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str2;
                JSONObject dataJsonObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse == null || (dataJsonObject = mtopResponse.getDataJsonObject()) == null) {
                    str2 = null;
                } else {
                    str2 = dataJsonObject.toString();
                }
                TLog.loge("createSimpleConversation", str2);
                iObserver.onNext(Boolean.FALSE);
                iObserver.onComplete();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                JSONObject dataJsonObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null || (dataJsonObject = mtopResponse.getDataJsonObject()) == null || !dataJsonObject.optBoolean("result")) {
                    iObserver.onNext(Boolean.FALSE);
                    iObserver.onComplete();
                } else {
                    SimpleConversationCache.INSTANCE.markCreated(str);
                    iObserver.onNext(Boolean.TRUE);
                    iObserver.onComplete();
                }
            }
        }).startRequest(MtopTaobaoWirelessAmp2BcConversationCreateResponse.class);
    }

    @Override // com.taobao.message.sp.framework.implement.SimpleBaseConversationService
    public List<String> getListConversationsChannelList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f4c553bb", new Object[]{this});
        }
        return xz3.e("bc");
    }
}
