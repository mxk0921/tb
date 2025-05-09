package com.taobao.message.sp.framework.model;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bmi;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleMessage implements Cloneable, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "channelType")
    private int channelType;
    @JSONField(name = "code")
    private SimpleMsgCode code;
    @JSONField(name = "conversationCode")
    private String conversationCode;
    @JSONField(name = SimpleProfile.KEY_MODIFY_TIME)
    private long modifyTime;
    @JSONField(name = "msgType")
    private int msgType;
    @JSONField(name = bmi.KEY_RECEIVER)
    private SimpleTarget receiver;
    @JSONField(name = "receiverState")
    private SimpleMessageReceiverState receiverState;
    @JSONField(name = NotificationCompat.CATEGORY_REMINDER)
    private SimpleMessageReminder reminder;
    @JSONField(name = "selfState")
    private int selfState;
    @JSONField(name = RemoteMessageConst.SEND_TIME)
    private long sendTime;
    @JSONField(name = "sender")
    private SimpleTarget sender;
    @JSONField(name = "sortTimeMicrosecond")
    private long sortTimeMicrosecond;
    @JSONField(name = "status")
    private int status;
    @JSONField(name = "summary")
    private String summary;
    @JSONField(name = "tag")
    private String tag;
    @JSONField(name = "originalData")
    private Map<String, Object> originalData = new HashMap();
    @JSONField(name = "ext")
    private Map<String, Object> ext = new HashMap();
    @JSONField(name = "localExt")
    private Map<String, Object> localExt = new HashMap();
    @JSONField(name = "viewMap")
    private Map<String, Object> viewMap = new ConcurrentHashMap();

    static {
        t2o.a(552599665);
    }

    public SimpleMessage() {
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleMsgCode simpleMsgCode = this.code;
        SimpleMsgCode simpleMsgCode2 = ((SimpleMessage) obj).code;
        if (simpleMsgCode != null) {
            return simpleMsgCode.equals(simpleMsgCode2);
        }
        if (simpleMsgCode2 == null) {
            return true;
        }
        return false;
    }

    public int getChannelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7e5e6a1", new Object[]{this})).intValue();
        }
        return this.channelType;
    }

    public SimpleMsgCode getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleMsgCode) ipChange.ipc$dispatch("95525a6d", new Object[]{this});
        }
        return this.code;
    }

    public String getConversationCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c7f233", new Object[]{this});
        }
        return this.conversationCode;
    }

    public Map<String, Object> getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7b9b14a7", new Object[]{this});
        }
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        return this.ext;
    }

    public Map<String, Object> getLocalExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a66f1fa8", new Object[]{this});
        }
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        return this.localExt;
    }

    public long getModifyTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8999f898", new Object[]{this})).longValue();
        }
        return this.modifyTime;
    }

    public int getMsgType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f35281f", new Object[]{this})).intValue();
        }
        return this.msgType;
    }

    public Map<String, Object> getOriginalData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b5d36bcd", new Object[]{this});
        }
        return this.originalData;
    }

    public SimpleTarget getReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleTarget) ipChange.ipc$dispatch("57c5ac08", new Object[]{this});
        }
        return this.receiver;
    }

    public SimpleMessageReceiverState getReceiverState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleMessageReceiverState) ipChange.ipc$dispatch("11a08ed7", new Object[]{this});
        }
        return this.receiverState;
    }

    public SimpleMessageReminder getReminder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleMessageReminder) ipChange.ipc$dispatch("940b9ec7", new Object[]{this});
        }
        return this.reminder;
    }

    public int getSelfState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1c1ae9", new Object[]{this})).intValue();
        }
        return this.selfState;
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

    public long getSortTimeMicrosecond() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("796d4372", new Object[]{this})).longValue();
        }
        return this.sortTimeMicrosecond;
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.status;
    }

    public String getSummary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9114d189", new Object[]{this});
        }
        return this.summary;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.tag;
    }

    public Map<String, Object> getViewMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("258c607d", new Object[]{this});
        }
        if (this.viewMap == null) {
            this.viewMap = new ConcurrentHashMap();
        }
        return this.viewMap;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        SimpleMsgCode simpleMsgCode = this.code;
        if (simpleMsgCode != null) {
            return simpleMsgCode.hashCode();
        }
        return 0;
    }

    public void setChannelType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d3f721", new Object[]{this, new Integer(i)});
        } else {
            this.channelType = i;
        }
    }

    public void setCode(SimpleMsgCode simpleMsgCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926338dd", new Object[]{this, simpleMsgCode});
        } else {
            this.code = simpleMsgCode;
        }
    }

    public void setConversationCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df78e2a3", new Object[]{this, str});
        } else {
            this.conversationCode = str;
        }
    }

    public void setExt(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ccc35f", new Object[]{this, map});
        } else {
            this.ext = map;
        }
    }

    public void setExtValue(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7ab07f", new Object[]{this, str, obj});
            return;
        }
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put(str, obj);
    }

    public void setLocalExt(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274e87e6", new Object[]{this, map});
        } else {
            this.localExt = map;
        }
    }

    public void setLocalExtValue(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4f4a46", new Object[]{this, str, obj});
            return;
        }
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        this.localExt.put(str, obj);
    }

    public void setModifyTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07c2c14", new Object[]{this, new Long(j)});
        } else {
            this.modifyTime = j;
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

    public void setOriginalData(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d8e661", new Object[]{this, map});
        } else if (this.originalData != null) {
            this.originalData = map;
        }
    }

    public void setReceiver(SimpleTarget simpleTarget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb77656", new Object[]{this, simpleTarget});
        } else {
            this.receiver = simpleTarget;
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

    public void setReminder(SimpleMessageReminder simpleMessageReminder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5aa08d", new Object[]{this, simpleMessageReminder});
        } else {
            this.reminder = simpleMessageReminder;
        }
    }

    public void setSelfState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5e1ed9", new Object[]{this, new Integer(i)});
        } else {
            this.selfState = i;
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

    public void setSortTimeMicrosecond(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64086c12", new Object[]{this, new Long(j)});
        } else {
            this.sortTimeMicrosecond = j;
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

    public void setSummary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9888e875", new Object[]{this, str});
        } else {
            this.summary = str;
        }
    }

    public void setTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.tag = str;
        }
    }

    public void setViewMap(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73800c49", new Object[]{this, map});
            return;
        }
        if (this.viewMap == null) {
            this.viewMap = new ConcurrentHashMap();
        }
        this.viewMap.putAll(map);
    }

    public void setViewMapValue(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63d48e9", new Object[]{this, str, obj});
        } else if (str == null || obj == null) {
            Log.e("messagesdkwrapper", "invalid parameters");
        } else {
            if (this.viewMap == null) {
                this.viewMap = new ConcurrentHashMap();
            }
            this.viewMap.put(str, obj);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Message{conversationCode='" + this.conversationCode + "', code=" + this.code + ", sender=" + this.sender + ", receiver=" + this.receiver + ", msgType=" + this.msgType + ", sortTimeMicrosecond=" + this.sortTimeMicrosecond + ", sendTime=" + this.sendTime + ", modifyTime=" + this.modifyTime + ", summary='" + this.summary + "', tag='" + this.tag + "', status=" + this.status + ", reminder=" + this.reminder + ", receiverState=" + this.receiverState + ", selfState=" + this.selfState + ", channelType=" + this.channelType + '}';
    }

    public SimpleMessage clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleMessage) ipChange.ipc$dispatch("6281eb8e", new Object[]{this});
        }
        try {
            return (SimpleMessage) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public SimpleMessage(SimpleMsgCode simpleMsgCode) {
        this.code = simpleMsgCode;
    }
}
