package com.taobao.kmp.nexus.arch.openArch.service.message.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import kotlin.Metadata;
import tb.a07;
import tb.iky;
import tb.nzf;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b \u0018\u0000 :2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00060\u0004j\u0002`\u0005:\u0001;B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0011\u001a\u0004\b)\u0010\t\"\u0004\b*\u0010\u0014R$\u0010+\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0011\u001a\u0004\b2\u0010\t\"\u0004\b3\u0010\u0014R$\u00104\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0011\u001a\u0004\b5\u0010\t\"\u0004\b6\u0010\u0014R$\u00107\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0011\u001a\u0004\b8\u0010\t\"\u0004\b9\u0010\u0014¨\u0006<"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/CDNMessagePayload;", "Ltb/iky;", "", "Ltb/nzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "fetchMsgId", "()Ljava/lang/String;", "", "fetchType", "()Ljava/lang/Integer;", "", "isEmpty", "()Z", "data", "Ljava/lang/String;", "getData", "setData", "(Ljava/lang/String;)V", "isSuccess", "Z", "setSuccess", "(Z)V", RemoteMessageConst.MSGID, "getMsgId", "setMsgId", "", "pushTime", "Ljava/lang/Long;", "getPushTime", "()Ljava/lang/Long;", "setPushTime", "(Ljava/lang/Long;)V", "subType", "Ljava/lang/Integer;", "getSubType", "setSubType", "(Ljava/lang/Integer;)V", "topic", "getTopic", "setTopic", "undroppable", "Ljava/lang/Boolean;", "getUndroppable", "()Ljava/lang/Boolean;", "setUndroppable", "(Ljava/lang/Boolean;)V", "senderId", "getSenderId", "setSenderId", yj4.PARAM_OPEN_REWARD_SENDER_USER_NICK, "getSenderNick", "setSenderNick", "uuid", "getUuid", "setUuid", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class CDNMessagePayload implements iky<String>, nzf, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String data;
    private boolean isSuccess = true;
    private String msgId;
    private Long pushTime;
    private String senderId;
    private String senderNick;
    private Integer subType;
    private String topic;
    private Boolean undroppable;
    private String uuid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536575);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536574);
        t2o.a(1004536578);
        t2o.a(1029701651);
    }

    @Override // tb.iky
    public String fetchMsgId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b358e57", new Object[]{this});
        }
        return this.msgId;
    }

    @Override // tb.iky
    public Integer fetchType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("40530602", new Object[]{this});
        }
        return this.subType;
    }

    public final String getMsgId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ab64bf3", new Object[]{this});
        }
        return this.msgId;
    }

    public final Long getPushTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("7f304c11", new Object[]{this});
        }
        return this.pushTime;
    }

    public final String getSenderId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e603eb13", new Object[]{this});
        }
        return this.senderId;
    }

    public final String getSenderNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86d1dc8b", new Object[]{this});
        }
        return this.senderNick;
    }

    public final Integer getSubType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4471aa52", new Object[]{this});
        }
        return this.subType;
    }

    @Override // tb.iky
    public String getTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.topic;
    }

    public final Boolean getUndroppable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4bd531d0", new Object[]{this});
        }
        return this.undroppable;
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
        String data = getData();
        if (data == null || data.length() == 0) {
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

    public final void setMsgId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ebc84b", new Object[]{this, str});
        } else {
            this.msgId = str;
        }
    }

    public final void setPushTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5389a7cf", new Object[]{this, l});
        } else {
            this.pushTime = l;
        }
    }

    public final void setSenderId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6556d1c3", new Object[]{this, str});
        } else {
            this.senderId = str;
        }
    }

    public final void setSenderNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca533c4b", new Object[]{this, str});
        } else {
            this.senderNick = str;
        }
    }

    public final void setSubType(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e649c4b8", new Object[]{this, num});
        } else {
            this.subType = num;
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

    public void setTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.topic = str;
        }
    }

    public final void setUndroppable(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c145a366", new Object[]{this, bool});
        } else {
            this.undroppable = bool;
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

    public String getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this}) : this.data;
    }

    public void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else {
            this.data = str;
        }
    }
}
