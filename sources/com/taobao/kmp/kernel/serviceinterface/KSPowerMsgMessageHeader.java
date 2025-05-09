package com.taobao.kmp.kernel.serviceinterface;

import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\t\b\u0016\u0018\u0000 92\u00060\u0001j\u0002`\u0002:\u0001:B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R$\u0010&\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010)\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R$\u0010,\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R$\u0010/\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R*\u00103\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgMessageHeader;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "type", "Ljava/lang/Integer;", NetworkAbility.API_GET_TYPE, "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "priority", "getPriority", "setPriority", "qosLevel", "getQosLevel", "setQosLevel", "", "needACK", "Ljava/lang/Boolean;", "getNeedACK", "()Ljava/lang/Boolean;", "setNeedACK", "(Ljava/lang/Boolean;)V", "sendFullTags", "getSendFullTags", "setSendFullTags", "", "timestamp", "Ljava/lang/String;", "getTimestamp", "()Ljava/lang/String;", "setTimestamp", "(Ljava/lang/String;)V", "messageID", "getMessageID", "setMessageID", LoggingSPCache.STORAGE_USERID, "getUserID", "setUserID", "topic", "getTopic", "setTopic", "from", "getFrom", "setFrom", "to", "getTo", "setTo", "", "tags", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "Companion", "a", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class KSPowerMsgMessageHeader implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String from;
    private String messageID;
    private Boolean needACK;
    private Integer priority;
    private Integer qosLevel;
    private Boolean sendFullTags;
    private List<String> tags;
    private String timestamp;
    private String to;
    private String topic;
    private Integer type;
    private String userID;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1002438918);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438917);
    }

    public final String getFrom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3302d9", new Object[]{this});
        }
        return this.from;
    }

    public final String getMessageID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e707dcd", new Object[]{this});
        }
        return this.messageID;
    }

    public final Boolean getNeedACK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c8110e61", new Object[]{this});
        }
        return this.needACK;
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

    public final String getTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.topic;
    }

    public final Integer getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("1fd3c39e", new Object[]{this});
        }
        return this.type;
    }

    public final String getUserID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87f5e75d", new Object[]{this});
        }
        return this.userID;
    }

    public final void setFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
        } else {
            this.from = str;
        }
    }

    public final void setMessageID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21dcf7b1", new Object[]{this, str});
        } else {
            this.messageID = str;
        }
    }

    public final void setNeedACK(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c43ef5", new Object[]{this, bool});
        } else {
            this.needACK = bool;
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

    public final void setSendFullTags(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a752b4", new Object[]{this, bool});
        } else {
            this.sendFullTags = bool;
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

    public final void setTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.topic = str;
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

    public final void setUserID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1670f1b9", new Object[]{this, str});
        } else {
            this.userID = str;
        }
    }
}
