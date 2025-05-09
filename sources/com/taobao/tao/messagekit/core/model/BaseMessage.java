package com.taobao.tao.messagekit.core.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Map;
import tb.cs6;
import tb.dva;
import tb.p1n;
import tb.p2j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class BaseMessage implements IProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bizCode;
    public long createTime;
    public String ext;
    public dva header;
    public String internalExt;
    public int msgType;
    public boolean needACK;
    public byte qosLevel;
    public byte retain;
    public String routerId;
    public byte serializeType;
    public int sysCode;
    public int type;
    public byte typeVersion;
    public int version;

    static {
        t2o.a(628097156);
        t2o.a(628097160);
    }

    public BaseMessage() {
        this.routerId = "";
        this.ext = "";
        this.internalExt = "";
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public void assemble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41fc8959", new Object[]{this});
            return;
        }
        this.createTime = System.currentTimeMillis();
        this.version = 1;
        this.serializeType = (byte) 1;
        this.typeVersion = (byte) 1;
        dva dvaVar = new dva();
        this.header = dvaVar;
        dvaVar.f = p2j.b();
        this.header.e = p2j.e();
        dva dvaVar2 = this.header;
        dvaVar2.d = "0.3.0";
        dvaVar2.h = p2j.d();
        this.header.i = p2j.c();
        this.header.l = 1;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa54921a", new Object[]{this})).intValue();
        }
        return this.bizCode;
    }

    public abstract byte[] bizToProtocol();

    public abstract byte[] bodyToProtocol();

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public long createTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb18f1e4", new Object[]{this})).longValue();
        }
        return this.createTime;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(cs6 cs6Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8b3683", new Object[]{this, cs6Var});
            return;
        }
        this.msgType = cs6Var.f17284a;
        if (cs6Var.b == 0) {
            z = false;
        }
        this.needACK = z;
        this.qosLevel = cs6Var.c;
        this.retain = cs6Var.d;
        this.version = cs6Var.e;
        this.serializeType = cs6Var.f;
        this.sysCode = cs6Var.g;
        this.type = cs6Var.h;
        this.typeVersion = cs6Var.i;
        this.bizCode = cs6Var.j;
        this.header = dva.c(p1n.c(cs6Var));
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public String getID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b12904a8", new Object[]{this});
        }
        return this.header.f;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int monitorTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a6ce85a", new Object[]{this})).intValue();
        }
        return this.header.j;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int msgType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a55ee155", new Object[]{this})).intValue();
        }
        return this.msgType;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public boolean needACK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5333e71e", new Object[]{this})).booleanValue();
        }
        return this.needACK;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public byte qosLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6392f62", new Object[]{this})).byteValue();
        }
        return this.qosLevel;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public String routerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4290f35", new Object[]{this});
        }
        return this.routerId;
    }

    public void setID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c884e3ce", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.header.f = str;
        }
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int statusCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc4b95f9", new Object[]{this})).intValue();
        }
        dva dvaVar = this.header;
        if (dvaVar == null) {
            return -1;
        }
        return dvaVar.c;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int subType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25f7c914", new Object[]{this})).intValue();
        }
        return this.header.g;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int sysCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c43c79d4", new Object[]{this})).intValue();
        }
        return this.sysCode;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        return new HashMap();
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public byte[] toProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fd8f9ee3", new Object[]{this});
        }
        return new cs6(this.msgType, this.needACK ? 1 : 0, this.qosLevel, this.retain, this.version, this.serializeType, this.sysCode, this.type, this.typeVersion, this.bizCode).g(MessageNano.toByteArray(this.header), bodyToProtocol(), bizToProtocol());
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public String topic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9373c52a", new Object[]{this});
        }
        return this.header.f18091a;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return this.type;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public String userId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d219c873", new Object[]{this});
        }
        return this.header.h;
    }

    public BaseMessage(BaseMessage baseMessage) {
        this.routerId = "";
        this.ext = "";
        this.internalExt = "";
        this.msgType = baseMessage.msgType;
        this.needACK = baseMessage.needACK;
        this.qosLevel = baseMessage.qosLevel;
        this.retain = baseMessage.retain;
        this.version = baseMessage.version;
        this.serializeType = baseMessage.serializeType;
        this.sysCode = baseMessage.sysCode;
        this.type = baseMessage.type;
        this.typeVersion = baseMessage.typeVersion;
        this.bizCode = baseMessage.bizCode;
        this.header = baseMessage.header;
        this.routerId = baseMessage.routerId;
    }
}
