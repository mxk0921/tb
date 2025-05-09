package com.taobao.kmp.nexus.arch.openArch.service.message.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgCountMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgJoinMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgMessageHeader;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgPowerMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgTextMessage;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMMessageResponse;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.a1g;
import tb.b1g;
import tb.ckf;
import tb.d1a;
import tb.dun;
import tb.iky;
import tb.n0g;
import tb.ns3;
import tb.nzf;
import tb.pus;
import tb.t2o;
import tb.tsq;
import tb.w0g;
import tb.y0g;
import tb.z0g;
import tb.zp1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b0\n\u0002\u0010 \n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 }2\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u00012\u00020\u00052\u00060\u0006j\u0002`\u0007:\u0001~B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR2\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u001a\"\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010.R$\u0010/\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010%R$\u00102\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010%R$\u00105\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\"\u001a\u0004\b6\u0010\u0015\"\u0004\b7\u0010%R$\u00108\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010+\u001a\u0004\b?\u0010\u0018\"\u0004\b@\u0010.R$\u0010A\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010+\u001a\u0004\bB\u0010\u0018\"\u0004\bC\u0010.R$\u0010D\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00109\u001a\u0004\bE\u0010;\"\u0004\bF\u0010=R*\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010N\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\"\u001a\u0004\bO\u0010\u0015\"\u0004\bP\u0010%R$\u0010Q\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\"\u001a\u0004\bR\u0010\u0015\"\u0004\bS\u0010%R$\u0010T\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010+\u001a\u0004\bU\u0010\u0018\"\u0004\bV\u0010.R$\u0010W\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010\"\u001a\u0004\bX\u0010\u0015\"\u0004\bY\u0010%R$\u0010Z\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\"\u001a\u0004\b[\u0010\u0015\"\u0004\b\\\u0010%R$\u0010]\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010+\u001a\u0004\b^\u0010\u0018\"\u0004\b_\u0010.R$\u0010`\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010+\u001a\u0004\ba\u0010\u0018\"\u0004\bb\u0010.R$\u0010c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010+\u001a\u0004\bd\u0010\u0018\"\u0004\be\u0010.R2\u0010f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010\u001c\u001a\u0004\bg\u0010\u001e\"\u0004\bh\u0010 R$\u0010i\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010\"\u001a\u0004\bj\u0010\u0015\"\u0004\bk\u0010%R$\u0010l\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bl\u0010\"\u001a\u0004\bm\u0010\u0015\"\u0004\bn\u0010%R\"\u0010p\u001a\u00020o8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010w\u001a\u00020v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|¨\u0006\u007f"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/PMMessageResponse;", "Ltb/iky;", "", "", "", "Ltb/nzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "Ltb/y0g;", "result", "", "isSuccessSubscribeResponse$nexus_release", "(Ltb/y0g;)Z", "isSuccessSubscribeResponse", "Ltb/b1g;", "isSuccessUnsubscribeResponse$nexus_release", "(Ltb/b1g;)Z", "isSuccessUnsubscribeResponse", "fetchMsgId", "()Ljava/lang/String;", "", "fetchType", "()Ljava/lang/Integer;", "isEmpty", "()Z", "data", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "setData", "(Ljava/util/Map;)V", "topic", "Ljava/lang/String;", "getTopic", "setTopic", "(Ljava/lang/String;)V", "isSuccess", "Z", "setSuccess", "(Z)V", "type", "Ljava/lang/Integer;", NetworkAbility.API_GET_TYPE, "setType", "(Ljava/lang/Integer;)V", "from", "getFrom", "setFrom", "to", "getTo", "setTo", "messageId", "getMessageId", "setMessageId", "needAck", "Ljava/lang/Boolean;", "getNeedAck", "()Ljava/lang/Boolean;", "setNeedAck", "(Ljava/lang/Boolean;)V", "priority", "getPriority", "setPriority", "qosLevel", "getQosLevel", "setQosLevel", "sendFullTags", "getSendFullTags", "setSendFullTags", "", "tags", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "timestamp", "getTimestamp", "setTimestamp", "userId", "getUserId", "setUserId", "errorCode", "getErrorCode", "setErrorCode", "abilityErrorCode", "getAbilityErrorCode", "setAbilityErrorCode", "errorMsg", "getErrorMsg", "setErrorMsg", "totalCount", "getTotalCount", "setTotalCount", "onlineCount", "getOnlineCount", "setOnlineCount", "pageViewCount", "getPageViewCount", "setPageViewCount", "addUsers", "getAddUsers", "setAddUsers", "text", "getText", "setText", "uuid", "getUuid", "setUuid", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/PMMessageRawResponse;", "rawResponse", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/PMMessageRawResponse;", "getRawResponse", "()Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/PMMessageRawResponse;", "setRawResponse", "(Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/PMMessageRawResponse;)V", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/OpenArchPMMessageCategory;", "messageCategory", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/OpenArchPMMessageCategory;", "getMessageCategory", "()Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/OpenArchPMMessageCategory;", "setMessageCategory", "(Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/OpenArchPMMessageCategory;)V", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PMMessageResponse implements iky<Map<String, ? extends Object>>, nzf, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String abilityErrorCode;
    private Map<String, ? extends Object> addUsers;
    private Map<String, ? extends Object> data;
    private Integer errorCode;
    private String errorMsg;
    private String from;
    private String messageId;
    private Boolean needAck;
    private Integer onlineCount;
    private Integer pageViewCount;
    private Integer priority;
    private Integer qosLevel;
    private Boolean sendFullTags;
    private List<String> tags;
    private String text;
    private String timestamp;
    private String to;
    private String topic;
    private Integer totalCount;
    private Integer type;
    private String userId;
    private String uuid;
    private boolean isSuccess = true;
    private PMMessageRawResponse rawResponse = new PMMessageRawResponse();
    private OpenArchPMMessageCategory messageCategory = OpenArchPMMessageCategory.undefined;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536591);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final String d(KSPowerMsgPowerMessage kSPowerMsgPowerMessage) {
            Integer num;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e1a00128", new Object[]{kSPowerMsgPowerMessage});
            }
            StringBuilder sb = new StringBuilder("assembleData KSPowerMsgPowerMessage:data length ");
            String data = kSPowerMsgPowerMessage.getData();
            if (data != null) {
                num = Integer.valueOf(data.length());
            } else {
                num = null;
            }
            sb.append(num);
            sb.append(" message is null :");
            if (kSPowerMsgPowerMessage.getData() == null) {
                z = true;
            }
            sb.append(z);
            return sb.toString();
        }

        public static final String e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f51ea69e", new Object[]{str});
            }
            return "strStriped " + str.length();
        }

        public static final String f(String str) {
            Integer num;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bee649de", new Object[]{str});
            }
            StringBuilder sb = new StringBuilder("base64DecodeStr2 ");
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            sb.append(num);
            return sb.toString();
        }

        public final PMMessageResponse g(n0g n0gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PMMessageResponse) ipChange.ipc$dispatch("c023566b", new Object[]{this, n0gVar});
            }
            ckf.g(n0gVar, "result");
            PMMessageResponse pMMessageResponse = new PMMessageResponse();
            pMMessageResponse.setAbilityErrorCode(n0gVar.a());
            pMMessageResponse.setErrorMsg(n0gVar.b());
            pMMessageResponse.setMessageCategory(OpenArchPMMessageCategory.onErrorArrived);
            return pMMessageResponse;
        }

        public final PMMessageResponse h(KSPowerMsgCountMessage kSPowerMsgCountMessage) {
            PMMessageResponse pMMessageResponse;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PMMessageResponse) ipChange.ipc$dispatch("72504eea", new Object[]{this, kSPowerMsgCountMessage});
            }
            ckf.g(kSPowerMsgCountMessage, "message");
            KSPowerMsgMessageHeader header = kSPowerMsgCountMessage.getHeader();
            if (header == null || (pMMessageResponse = PMMessageResponse.Companion.q(header)) == null) {
                pMMessageResponse = new PMMessageResponse();
            }
            pMMessageResponse.setData(kSPowerMsgCountMessage.getValues());
            pMMessageResponse.setMessageCategory(OpenArchPMMessageCategory.onCountMessageArrived);
            pMMessageResponse.getRawResponse().setValues(kSPowerMsgCountMessage.getValues());
            return pMMessageResponse;
        }

        public final PMMessageResponse i(KSPowerMsgJoinMessage kSPowerMsgJoinMessage) {
            PMMessageResponse pMMessageResponse;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PMMessageResponse) ipChange.ipc$dispatch("d5d19b33", new Object[]{this, kSPowerMsgJoinMessage});
            }
            ckf.g(kSPowerMsgJoinMessage, "message");
            KSPowerMsgMessageHeader header = kSPowerMsgJoinMessage.getHeader();
            if (header == null || (pMMessageResponse = PMMessageResponse.Companion.q(header)) == null) {
                pMMessageResponse = new PMMessageResponse();
            }
            pMMessageResponse.setTotalCount(kSPowerMsgJoinMessage.getTotalCount());
            pMMessageResponse.setOnlineCount(kSPowerMsgJoinMessage.getOnlineCount());
            pMMessageResponse.setPageViewCount(kSPowerMsgJoinMessage.getPageViewCount());
            pMMessageResponse.setAddUsers(kSPowerMsgJoinMessage.getAddUsers());
            pMMessageResponse.setMessageCategory(OpenArchPMMessageCategory.onJoinMessageArrived);
            return pMMessageResponse;
        }

        public final PMMessageResponse k(w0g w0gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PMMessageResponse) ipChange.ipc$dispatch("af227177", new Object[]{this, w0gVar});
            }
            ckf.g(w0gVar, "message");
            PMMessageResponse pMMessageResponse = new PMMessageResponse();
            pMMessageResponse.getRawResponse().setResult(w0gVar.b());
            return pMMessageResponse;
        }

        public final PMMessageResponse l(y0g y0gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PMMessageResponse) ipChange.ipc$dispatch("fb794b3d", new Object[]{this, y0gVar});
            }
            ckf.g(y0gVar, "subscribeResult");
            PMMessageResponse pMMessageResponse = new PMMessageResponse();
            pMMessageResponse.setData(y0gVar.b());
            pMMessageResponse.setTopic(y0gVar.c());
            pMMessageResponse.setErrorCode(y0gVar.a());
            pMMessageResponse.setMessageCategory(OpenArchPMMessageCategory.onSubscribed);
            pMMessageResponse.getRawResponse().setResult(y0gVar.b());
            pMMessageResponse.setMessageId("-1");
            pMMessageResponse.setSuccess(pMMessageResponse.isSuccessSubscribeResponse$nexus_release(y0gVar));
            return pMMessageResponse;
        }

        public final PMMessageResponse m(KSPowerMsgTextMessage kSPowerMsgTextMessage) {
            PMMessageResponse pMMessageResponse;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PMMessageResponse) ipChange.ipc$dispatch("3441fb10", new Object[]{this, kSPowerMsgTextMessage});
            }
            ckf.g(kSPowerMsgTextMessage, "message");
            KSPowerMsgMessageHeader header = kSPowerMsgTextMessage.getHeader();
            if (header == null || (pMMessageResponse = PMMessageResponse.Companion.q(header)) == null) {
                pMMessageResponse = new PMMessageResponse();
            }
            pMMessageResponse.setText(kSPowerMsgTextMessage.getText());
            pMMessageResponse.setData(kSPowerMsgTextMessage.getValues());
            pMMessageResponse.setMessageCategory(OpenArchPMMessageCategory.onTextMessageArrived);
            pMMessageResponse.getRawResponse().setText(kSPowerMsgTextMessage.getText());
            pMMessageResponse.getRawResponse().setValues(kSPowerMsgTextMessage.getValues());
            return pMMessageResponse;
        }

        public final PMMessageResponse n(z0g z0gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PMMessageResponse) ipChange.ipc$dispatch("fa506df4", new Object[]{this, z0gVar});
            }
            ckf.g(z0gVar, "message");
            PMMessageResponse pMMessageResponse = new PMMessageResponse();
            pMMessageResponse.setMessageCategory(OpenArchPMMessageCategory.onTopicStatus);
            pMMessageResponse.getRawResponse().setDigNUM(z0gVar.a());
            pMMessageResponse.getRawResponse().setMsgNUM(z0gVar.b());
            pMMessageResponse.getRawResponse().setVisitNUM(z0gVar.e());
            pMMessageResponse.getRawResponse().setOnlineNUM(z0gVar.c());
            pMMessageResponse.getRawResponse().setTotalNUM(z0gVar.d());
            return pMMessageResponse;
        }

        public final PMMessageResponse o(a1g a1gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PMMessageResponse) ipChange.ipc$dispatch("e004bf08", new Object[]{this, a1gVar});
            }
            ckf.g(a1gVar, "message");
            PMMessageResponse pMMessageResponse = new PMMessageResponse();
            pMMessageResponse.setMessageCategory(OpenArchPMMessageCategory.onTopicUsers);
            pMMessageResponse.getRawResponse().setUsers(a1gVar.a());
            return pMMessageResponse;
        }

        public final PMMessageResponse p(b1g b1gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PMMessageResponse) ipChange.ipc$dispatch("910156a4", new Object[]{this, b1gVar});
            }
            ckf.g(b1gVar, "unsubscribeResult");
            PMMessageResponse pMMessageResponse = new PMMessageResponse();
            pMMessageResponse.setData(b1gVar.b());
            pMMessageResponse.setTopic(b1gVar.c());
            pMMessageResponse.setErrorCode(b1gVar.a());
            pMMessageResponse.setMessageCategory(OpenArchPMMessageCategory.onUnSubscribed);
            pMMessageResponse.getRawResponse().setResult(b1gVar.b());
            pMMessageResponse.setSuccess(pMMessageResponse.isSuccessUnsubscribeResponse$nexus_release(b1gVar));
            return pMMessageResponse;
        }

        public final PMMessageResponse q(KSPowerMsgMessageHeader kSPowerMsgMessageHeader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PMMessageResponse) ipChange.ipc$dispatch("5b9e6fd", new Object[]{this, kSPowerMsgMessageHeader});
            }
            PMMessageResponse pMMessageResponse = new PMMessageResponse();
            pMMessageResponse.setTopic(kSPowerMsgMessageHeader.getTopic());
            pMMessageResponse.setType(kSPowerMsgMessageHeader.getType());
            pMMessageResponse.setPriority(kSPowerMsgMessageHeader.getPriority());
            pMMessageResponse.setQosLevel(kSPowerMsgMessageHeader.getQosLevel());
            pMMessageResponse.setNeedAck(kSPowerMsgMessageHeader.getNeedACK());
            pMMessageResponse.setSendFullTags(kSPowerMsgMessageHeader.getSendFullTags());
            pMMessageResponse.setTimestamp(kSPowerMsgMessageHeader.getTimestamp());
            pMMessageResponse.setMessageId(kSPowerMsgMessageHeader.getMessageID());
            pMMessageResponse.setUserId(kSPowerMsgMessageHeader.getUserID());
            pMMessageResponse.setFrom(kSPowerMsgMessageHeader.getFrom());
            pMMessageResponse.setTo(kSPowerMsgMessageHeader.getTo());
            pMMessageResponse.setTags(kSPowerMsgMessageHeader.getTags());
            return pMMessageResponse;
        }

        public a() {
        }

        public final PMMessageResponse j(final KSPowerMsgPowerMessage kSPowerMsgPowerMessage, boolean z) {
            PMMessageResponse pMMessageResponse;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PMMessageResponse) ipChange.ipc$dispatch("8c6b55b0", new Object[]{this, kSPowerMsgPowerMessage, new Boolean(z)});
            }
            ckf.g(kSPowerMsgPowerMessage, "message");
            KSPowerMsgMessageHeader header = kSPowerMsgPowerMessage.getHeader();
            if (header == null || (pMMessageResponse = PMMessageResponse.Companion.q(header)) == null) {
                pMMessageResponse = new PMMessageResponse();
            }
            pus pusVar = pus.INSTANCE;
            pusVar.i(String.valueOf(((ns3) dun.b(PMMessageResponse.class)).getSimpleName()), "", new d1a() { // from class: tb.qsy
                @Override // tb.d1a
                public final Object invoke() {
                    String d;
                    d = PMMessageResponse.a.d(KSPowerMsgPowerMessage.this);
                    return d;
                }
            });
            pMMessageResponse.setMessageCategory(OpenArchPMMessageCategory.onMessageArrived);
            pMMessageResponse.getRawResponse().setData(kSPowerMsgPowerMessage.getData());
            String data = kSPowerMsgPowerMessage.getData();
            if (data == null || data.length() != 0) {
                String data2 = kSPowerMsgPowerMessage.getData();
                Map<String, ? extends Object> map = null;
                if (data2 != null) {
                    final String E = tsq.E(tsq.E(data2, "\n", "", false, 4, null), "\r", "", false, 4, null);
                    pusVar.i(String.valueOf(((ns3) dun.b(PMMessageResponse.class)).getSimpleName()), "", new d1a() { // from class: tb.rsy
                        @Override // tb.d1a
                        public final Object invoke() {
                            String e;
                            e = PMMessageResponse.a.e(E);
                            return e;
                        }
                    });
                    if (z) {
                        E = zp1.INSTANCE.a(E);
                        pusVar.i(String.valueOf(((ns3) dun.b(PMMessageResponse.class)).getSimpleName()), "", new d1a() { // from class: tb.ssy
                            @Override // tb.d1a
                            public final Object invoke() {
                                String f;
                                f = PMMessageResponse.a.f(E);
                                return f;
                            }
                        });
                    }
                    Object a2 = E != null ? KMPJSONUtils_androidKt.a(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, E) : null;
                    KMPJsonObject kMPJsonObject = a2 instanceof KMPJsonObject ? (KMPJsonObject) a2 : null;
                    if (kMPJsonObject != null) {
                        map = kMPJsonObject.toMap();
                    }
                }
                pMMessageResponse.setData(map);
            }
            return pMMessageResponse;
        }
    }

    static {
        t2o.a(1004536590);
        t2o.a(1004536578);
        t2o.a(1029701651);
    }

    @Override // tb.iky
    public String fetchMsgId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b358e57", new Object[]{this});
        }
        return this.messageId;
    }

    @Override // tb.iky
    public Integer fetchType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("40530602", new Object[]{this});
        }
        return this.type;
    }

    public final String getAbilityErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40392818", new Object[]{this});
        }
        return this.abilityErrorCode;
    }

    public final Map<String, Object> getAddUsers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6b050099", new Object[]{this});
        }
        return this.addUsers;
    }

    public final Integer getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("a5caf00d", new Object[]{this});
        }
        return this.errorCode;
    }

    public final String getErrorMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.errorMsg;
    }

    public final String getFrom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3302d9", new Object[]{this});
        }
        return this.from;
    }

    public final OpenArchPMMessageCategory getMessageCategory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchPMMessageCategory) ipChange.ipc$dispatch("ee30e769", new Object[]{this});
        }
        return this.messageCategory;
    }

    public final String getMessageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff27d1ad", new Object[]{this});
        }
        return this.messageId;
    }

    public final Boolean getNeedAck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("8e761261", new Object[]{this});
        }
        return this.needAck;
    }

    public final Integer getOnlineCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("493bc4b4", new Object[]{this});
        }
        return this.onlineCount;
    }

    public final Integer getPageViewCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d22b7613", new Object[]{this});
        }
        return this.pageViewCount;
    }

    public final Integer getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4790b788", new Object[]{this});
        }
        return this.priority;
    }

    public final Integer getQosLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("74313e13", new Object[]{this});
        }
        return this.qosLevel;
    }

    public final PMMessageRawResponse getRawResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PMMessageRawResponse) ipChange.ipc$dispatch("f02b172a", new Object[]{this});
        }
        return this.rawResponse;
    }

    public final Boolean getSendFullTags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("7121b2a", new Object[]{this});
        }
        return this.sendFullTags;
    }

    public final List<String> getTags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("248771f1", new Object[]{this});
        }
        return this.tags;
    }

    public final String getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.text;
    }

    public final String getTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86bed099", new Object[]{this});
        }
        return this.timestamp;
    }

    public final String getTo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c0f328", new Object[]{this});
        }
        return this.to;
    }

    @Override // tb.iky
    public String getTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.topic;
    }

    public final Integer getTotalCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("dab7194f", new Object[]{this});
        }
        return this.totalCount;
    }

    public final Integer getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("1fd3c39e", new Object[]{this});
        }
        return this.type;
    }

    public final String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.userId;
    }

    @Override // tb.nzf
    public String getUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this});
        }
        return this.uuid;
    }

    @Override // tb.iky
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        Map<String, Object> data = getData();
        if (data == null || data.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.isSuccess;
    }

    public nzf keepObj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzf) ipChange.ipc$dispatch("f9044030", new Object[]{this});
        }
        return nzf.a.a(this);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            nzf.a.b(this);
        }
    }

    public final void setAbilityErrorCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e695e", new Object[]{this, str});
        } else {
            this.abilityErrorCode = str;
        }
    }

    public final void setAddUsers(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f574c515", new Object[]{this, map});
        } else {
            this.addUsers = map;
        }
    }

    public final void setErrorCode(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c25635d", new Object[]{this, num});
        } else {
            this.errorCode = num;
        }
    }

    public final void setErrorMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
        } else {
            this.errorMsg = str;
        }
    }

    public final void setFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
        } else {
            this.from = str;
        }
    }

    public final void setMessageCategory(OpenArchPMMessageCategory openArchPMMessageCategory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa895b3", new Object[]{this, openArchPMMessageCategory});
            return;
        }
        ckf.g(openArchPMMessageCategory, "<set-?>");
        this.messageCategory = openArchPMMessageCategory;
    }

    public final void setMessageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68101fd1", new Object[]{this, str});
        } else {
            this.messageId = str;
        }
    }

    public final void setNeedAck(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccffbaf5", new Object[]{this, bool});
        } else {
            this.needAck = bool;
        }
    }

    public final void setOnlineCount(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80841096", new Object[]{this, num});
        } else {
            this.onlineCount = num;
        }
    }

    public final void setPageViewCount(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95b83817", new Object[]{this, num});
        } else {
            this.pageViewCount = num;
        }
    }

    public final void setPriority(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6cbfaa", new Object[]{this, num});
        } else {
            this.priority = num;
        }
    }

    public final void setQosLevel(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5dd0a7f", new Object[]{this, num});
        } else {
            this.qosLevel = num;
        }
    }

    public final void setRawResponse(PMMessageRawResponse pMMessageRawResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38ebf52", new Object[]{this, pMMessageRawResponse});
            return;
        }
        ckf.g(pMMessageRawResponse, "<set-?>");
        this.rawResponse = pMMessageRawResponse;
    }

    public final void setSendFullTags(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a752b4", new Object[]{this, bool});
        } else {
            this.sendFullTags = bool;
        }
    }

    public void setSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.isSuccess = z;
        }
    }

    public final void setTags(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6edab93", new Object[]{this, list});
        } else {
            this.tags = list;
        }
    }

    public final void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.text = str;
        }
    }

    public final void setTimestamp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d358fe65", new Object[]{this, str});
        } else {
            this.timestamp = str;
        }
    }

    public final void setTo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12eac54e", new Object[]{this, str});
        } else {
            this.to = str;
        }
    }

    public void setTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.topic = str;
        }
    }

    public final void setTotalCount(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58c09c3", new Object[]{this, num});
        } else {
            this.totalCount = num;
        }
    }

    public final void setType(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99261054", new Object[]{this, num});
        } else {
            this.type = num;
        }
    }

    public final void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }

    @Override // tb.nzf
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.uuid = str;
        }
    }

    public Map<String, Object> getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this}) : this.data;
    }

    public void setData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd3172", new Object[]{this, map});
        } else {
            this.data = map;
        }
    }

    public final boolean isSuccessSubscribeResponse$nexus_release(y0g y0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c820f859", new Object[]{this, y0gVar})).booleanValue();
        }
        ckf.g(y0gVar, "result");
        if (y0gVar.a() == null) {
            return true;
        }
        Integer a2 = y0gVar.a();
        return a2 != null && a2.intValue() == 1000;
    }

    public final boolean isSuccessUnsubscribeResponse$nexus_release(b1g b1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0b73b59", new Object[]{this, b1gVar})).booleanValue();
        }
        ckf.g(b1gVar, "result");
        if (b1gVar.a() == null) {
            return true;
        }
        Integer a2 = b1gVar.a();
        return a2 != null && a2.intValue() == 1000;
    }
}
