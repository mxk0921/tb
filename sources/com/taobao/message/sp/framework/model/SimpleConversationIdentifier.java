package com.taobao.message.sp.framework.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleConversationIdentifier implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String bizType;
    private Map<String, Object> createContext = new HashMap();
    private String entityType;
    private SimpleTarget target;

    static {
        t2o.a(552599664);
    }

    public SimpleConversationIdentifier() {
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SimpleConversationIdentifier simpleConversationIdentifier = (SimpleConversationIdentifier) obj;
            SimpleTarget simpleTarget = this.target;
            if (simpleTarget == null ? simpleConversationIdentifier.target == null : simpleTarget.equals(simpleConversationIdentifier.target)) {
                String str = this.bizType;
                if (str != null) {
                    if (str.equals(simpleConversationIdentifier.bizType)) {
                        String str2 = this.entityType;
                        String str3 = simpleConversationIdentifier.entityType;
                        if (str2 != null) {
                            return str2.equals(str3);
                        }
                        if (str3 == null) {
                            return true;
                        }
                        return false;
                    }
                } else if (simpleConversationIdentifier.bizType == null) {
                    String str4 = this.entityType;
                    String str5 = simpleConversationIdentifier.entityType;
                    if (str4 != null) {
                        return str4.equals(str5);
                    }
                    if (str5 == null) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.bizType;
    }

    public Map<String, Object> getCreateContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1bedf699", new Object[]{this});
        }
        return this.createContext;
    }

    public String getEntityType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f36bd726", new Object[]{this});
        }
        return this.entityType;
    }

    public SimpleTarget getTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleTarget) ipChange.ipc$dispatch("9c76a0a6", new Object[]{this});
        }
        return this.target;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        SimpleTarget simpleTarget = this.target;
        if (simpleTarget != null) {
            i = simpleTarget.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str = this.bizType;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.entityType;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i5 + i3;
    }

    public void setBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.bizType = str;
        }
    }

    public void setCreateContext(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbb80ad", new Object[]{this, map});
        } else {
            this.createContext = map;
        }
    }

    public void setEntityType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f89510", new Object[]{this, str});
        } else {
            this.entityType = str;
        }
    }

    public void setTarget(SimpleTarget simpleTarget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480ce878", new Object[]{this, simpleTarget});
        } else {
            this.target = simpleTarget;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ConversationIdentifier{target=" + this.target + ", bizType='" + this.bizType + "', entityType='" + this.entityType + "', createCtx=" + this.createContext + '}';
    }

    public SimpleConversationIdentifier(SimpleTarget simpleTarget, String str, String str2) {
        this.target = simpleTarget;
        this.bizType = str;
        this.entityType = str2;
    }
}
