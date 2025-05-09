package com.taobao.tao.messagekit.core.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Map;
import tb.cs6;
import tb.t2o;
import tb.xg2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Monitor extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public xg2 body;

    static {
        t2o.a(628097162);
    }

    public Monitor() {
    }

    public static Monitor create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Monitor) ipChange.ipc$dispatch("dfcf30de", new Object[0]);
        }
        Monitor monitor = new Monitor();
        monitor.assemble();
        monitor.msgType = 3;
        monitor.type = 7;
        monitor.sysCode = 2;
        xg2 xg2Var = new xg2();
        monitor.body = xg2Var;
        xg2Var.f31370a = "0.3.0";
        return monitor;
    }

    public static /* synthetic */ Object ipc$super(Monitor monitor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/core/model/Monitor");
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa54921a", new Object[]{this})).intValue();
        }
        return this.bizCode;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bizToProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("972ab150", new Object[]{this});
        }
        return new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bodyToProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d8e964e1", new Object[]{this});
        }
        xg2 xg2Var = this.body;
        if (xg2Var != null) {
            return MessageNano.toByteArray(xg2Var);
        }
        return new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public long createTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb18f1e4", new Object[]{this})).longValue();
        }
        return this.createTime;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(cs6 cs6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8b3683", new Object[]{this, cs6Var});
            return;
        }
        this.msgType = 3;
        this.type = 7;
        xg2 xg2Var = new xg2();
        this.body = xg2Var;
        xg2Var.f31370a = "0.3.0";
    }

    public xg2 getBody() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xg2) ipChange.ipc$dispatch("6d30e512", new Object[]{this});
        }
        return this.body;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public String getID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b12904a8", new Object[]{this});
        }
        return this.header.f;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int msgType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a55ee155", new Object[]{this})).intValue();
        }
        return this.msgType;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public boolean needACK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5333e71e", new Object[]{this})).booleanValue();
        }
        return this.needACK;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public byte qosLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6392f62", new Object[]{this})).byteValue();
        }
        return this.qosLevel;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public String routerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4290f35", new Object[]{this});
        }
        return this.routerId;
    }

    public void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.body.b = str;
        }
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public void setID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c884e3ce", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.header.f = str;
        }
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int subType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25f7c914", new Object[]{this})).intValue();
        }
        return this.header.g;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int sysCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c43c79d4", new Object[]{this})).intValue();
        }
        return this.sysCode;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data", this.body.b);
        hashMap.put("sdkversion", this.body.f31370a);
        return hashMap;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public byte[] toProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fd8f9ee3", new Object[]{this});
        }
        return bodyToProtocol();
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public String topic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9373c52a", new Object[]{this});
        }
        return this.header.f18091a;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return this.type;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public String userId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d219c873", new Object[]{this});
        }
        return this.header.h;
    }

    public Monitor(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.type = 7;
        this.sysCode = 2;
        xg2 xg2Var = new xg2();
        this.body = xg2Var;
        xg2Var.f31370a = "0.3.0";
    }
}
