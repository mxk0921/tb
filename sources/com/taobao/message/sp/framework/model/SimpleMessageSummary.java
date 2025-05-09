package com.taobao.message.sp.framework.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleMessageSummary implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "code")
    private SimpleMsgCode code;
    @JSONField(name = "content")
    private String content;
    @JSONField(name = "msgType")
    private int msgType;
    @JSONField(name = "receiverState")
    private SimpleMessageReceiverState receiverState;
    @JSONField(name = "selfStatus")
    private int selfStatus;
    @JSONField(name = RemoteMessageConst.SEND_TIME)
    private long sendTime;
    @JSONField(name = "sender")
    private SimpleTarget sender;
    @JSONField(name = "status")
    private int status;

    static {
        t2o.a(552599678);
    }

    public SimpleMsgCode getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleMsgCode) ipChange.ipc$dispatch("95525a6d", new Object[]{this});
        }
        return this.code;
    }

    public String getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        return this.content;
    }

    public int getMsgType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f35281f", new Object[]{this})).intValue();
        }
        return this.msgType;
    }

    public SimpleMessageReceiverState getReceiverState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleMessageReceiverState) ipChange.ipc$dispatch("11a08ed7", new Object[]{this});
        }
        return this.receiverState;
    }

    public int getSelfStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9683d4ce", new Object[]{this})).intValue();
        }
        return this.selfStatus;
    }

    public long getSendTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe3a66e6", new Object[]{this})).longValue();
        }
        return this.sendTime;
    }

    public SimpleTarget getSender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleTarget) ipChange.ipc$dispatch("e050f82", new Object[]{this});
        }
        return this.sender;
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.status;
    }

    public void setCode(SimpleMsgCode simpleMsgCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926338dd", new Object[]{this, simpleMsgCode});
        } else {
            this.code = simpleMsgCode;
        }
    }

    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        } else {
            this.content = str;
        }
    }

    public void setMsgType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db94b63", new Object[]{this, new Integer(i)});
        } else {
            this.msgType = i;
        }
    }

    public void setReceiverState(SimpleMessageReceiverState simpleMessageReceiverState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fca193b", new Object[]{this, simpleMessageReceiverState});
        } else {
            this.receiverState = simpleMessageReceiverState;
        }
    }

    public void setSelfStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70cdd2fc", new Object[]{this, new Integer(i)});
        } else {
            this.selfStatus = i;
        }
    }

    public void setSendTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be95486", new Object[]{this, new Long(j)});
        } else {
            this.sendTime = j;
        }
    }

    public void setSender(SimpleTarget simpleTarget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c551c", new Object[]{this, simpleTarget});
        } else {
            this.sender = simpleTarget;
        }
    }

    public void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MessageSummary{content='" + this.content + "', sendTime=" + this.sendTime + ", status=" + this.status + ", selfStatus=" + this.selfStatus + ", receiverState=" + this.receiverState + ", msgType=" + this.msgType + ", code=" + this.code + ", sender=" + this.sender + '}';
    }
}
