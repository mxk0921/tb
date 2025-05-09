package com.taobao.tao.messagekit.core.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cs6;
import tb.p1n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Ack extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Object body;
    public Object data;
    public byte[] reContent;
    public byte[] retBody;

    static {
        t2o.a(628097155);
    }

    public Ack() {
    }

    public static Ack create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("3af6c20f", new Object[0]);
        }
        Ack ack = new Ack();
        ack.msgType = 4;
        ack.assemble();
        return ack;
    }

    public static /* synthetic */ Object ipc$super(Ack ack, String str, Object... objArr) {
        if (str.hashCode() == 1519072899) {
            super.fromProtocol((cs6) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/core/model/Ack");
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
        byte[] bArr = this.reContent;
        if (bArr != null) {
            return bArr;
        }
        return new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bodyToProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d8e964e1", new Object[]{this});
        }
        byte[] bArr = this.retBody;
        if (bArr != null) {
            return bArr;
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
        super.fromProtocol(cs6Var);
        this.retBody = p1n.b(cs6Var);
        this.reContent = p1n.a(cs6Var);
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
    public int monitorTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a6ce85a", new Object[]{this})).intValue();
        }
        return this.header.j;
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

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public void setID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c884e3ce", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.header.f = str;
        }
    }

    public void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.header.c = i;
        }
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int statusCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc4b95f9", new Object[]{this})).intValue();
        }
        return this.header.c;
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

    public Ack(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 4;
    }

    public Ack(IProtocol iProtocol) {
        assemble();
        this.msgType = iProtocol.msgType();
        this.needACK = iProtocol.needACK();
        this.qosLevel = iProtocol.qosLevel();
        this.sysCode = iProtocol.sysCode();
        this.type = iProtocol.type();
        this.bizCode = iProtocol.bizCode();
        this.routerId = iProtocol.routerId();
        this.msgType = 4;
        this.header.f18091a = iProtocol.topic();
        this.header.c = iProtocol.statusCode();
        this.header.f = iProtocol.getID();
        this.header.g = iProtocol.subType();
        this.header.h = iProtocol.userId();
        this.header.j = iProtocol.monitorTag();
    }
}
