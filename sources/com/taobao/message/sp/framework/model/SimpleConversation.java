package com.taobao.message.sp.framework.model;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleConversation implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "channelType")
    private int channelType;
    @JSONField(name = "conversationCode")
    private String conversationCode;
    @JSONField(name = "conversationContent")
    private SimpleConversationContent conversationContent;
    @JSONField(name = "conversationIdentifier")
    private SimpleConversationIdentifier conversationIdentifier;
    @JSONField(name = SimpleProfile.KEY_MODIFY_TIME)
    private long modifyTime;
    @JSONField(name = "orderTime")
    private long orderTime;
    @JSONField(name = "position")
    private int position;
    @JSONField(name = "remindType")
    private int remindType;
    @JSONField(name = "status")
    private int status;
    @JSONField(name = "utags")
    private Map<String, Object> utags = new HashMap();
    @JSONField(name = "ext")
    private Map<String, Object> ext = new HashMap();
    @JSONField(name = "localExt")
    private Map<String, Object> localExt = new HashMap();
    @JSONField(name = "viewMap")
    private Map<String, Object> viewMap = new ConcurrentHashMap();

    static {
        t2o.a(552599662);
    }

    public SimpleConversation() {
    }

    public static int convert(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b49dbff7", new Object[]{str})).intValue();
        }
        if (TextUtils.equals("bc", str)) {
            return 2;
        }
        if (TextUtils.equals("cc", str)) {
            return 0;
        }
        if (TextUtils.equals("notice", str) || TextUtils.equals("subscribe", str)) {
            return 1;
        }
        throw new RuntimeException(str + " is not supported");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleConversation)) {
            return false;
        }
        SimpleConversation simpleConversation = (SimpleConversation) obj;
        String str = this.conversationCode;
        if (str != null && str.equals(simpleConversation.conversationCode)) {
            return true;
        }
        SimpleConversationIdentifier simpleConversationIdentifier = this.conversationIdentifier;
        if (simpleConversationIdentifier == null || !simpleConversationIdentifier.equals(simpleConversation.conversationIdentifier)) {
            return false;
        }
        return true;
    }

    public String getChannelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44447fb2", new Object[]{this});
        }
        return convert(this.channelType);
    }

    public String getConversationCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c7f233", new Object[]{this});
        }
        return this.conversationCode;
    }

    public SimpleConversationContent getConversationContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleConversationContent) ipChange.ipc$dispatch("d2759062", new Object[]{this});
        }
        return this.conversationContent;
    }

    public SimpleConversationIdentifier getConversationIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleConversationIdentifier) ipChange.ipc$dispatch("b1bf33b0", new Object[]{this});
        }
        return this.conversationIdentifier;
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

    public long getOrderTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae0a2280", new Object[]{this})).longValue();
        }
        return this.orderTime;
    }

    public int getPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
        }
        return this.position;
    }

    public int getRemindType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b34023cf", new Object[]{this})).intValue();
        }
        return this.remindType;
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.status;
    }

    public Map<String, Object> getUtags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bb65d0d4", new Object[]{this});
        }
        if (this.utags == null) {
            this.utags = new HashMap();
        }
        return this.utags;
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
        String str = this.conversationCode;
        if (str == null) {
            return super.hashCode();
        }
        return str.hashCode();
    }

    public void setChannelType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c02a56c", new Object[]{this, str});
        } else {
            this.channelType = convert(str);
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

    public void setConversationContent(SimpleConversationContent simpleConversationContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2e63d0", new Object[]{this, simpleConversationContent});
        } else {
            this.conversationContent = simpleConversationContent;
        }
    }

    public void setConversationIdentifier(SimpleConversationIdentifier simpleConversationIdentifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0797998", new Object[]{this, simpleConversationIdentifier});
        } else {
            this.conversationIdentifier = simpleConversationIdentifier;
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

    public void setOrderTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db310dc4", new Object[]{this, new Long(j)});
        } else {
            this.orderTime = j;
        }
    }

    public void setPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ced5a91", new Object[]{this, new Integer(i)});
        } else {
            this.position = i;
        }
    }

    public void setRemindType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9b641b", new Object[]{this, new Integer(i)});
        } else {
            this.remindType = i;
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

    public void setUtags(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e2b9d2", new Object[]{this, map});
        } else {
            this.utags = map;
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
        return "Conversation{conversationIdentifier=" + this.conversationIdentifier + ", channelType='" + this.channelType + "', conversationCode='" + this.conversationCode + "', conversationContent=" + this.conversationContent + ", status=" + this.status + ", remindType=" + this.remindType + ", position=" + this.position + ", modifyTime=" + this.modifyTime + ", orderTime=" + this.orderTime + '}';
    }

    public static String convert(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("515c1e37", new Object[]{new Integer(i)});
        }
        if (i == 2) {
            return "bc";
        }
        if (i == 0) {
            return "cc";
        }
        if (i == 1) {
            return "notice";
        }
        throw new RuntimeException("" + i + " is not supported");
    }

    public SimpleConversation(SimpleConversationIdentifier simpleConversationIdentifier) {
        this.conversationIdentifier = simpleConversationIdentifier;
    }

    public SimpleConversation(String str) {
        this.conversationCode = str;
    }
}
