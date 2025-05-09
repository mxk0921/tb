package com.taobao.tao.powermsg.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.MessageNano;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import tb.cs6;
import tb.p1n;
import tb.t2o;
import tb.zg2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class P2P extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public zg2 body;
    public byte[] content;

    static {
        t2o.a(628097294);
    }

    public P2P() {
    }

    public static P2P create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (P2P) ipChange.ipc$dispatch("4e3d89bf", new Object[0]);
        }
        P2P p2p = new P2P();
        p2p.assemble();
        p2p.msgType = 3;
        p2p.sysCode = 1;
        p2p.type = 5;
        p2p.body = new zg2();
        return p2p;
    }

    public static /* synthetic */ Object ipc$super(P2P p2p, String str, Object... objArr) {
        if (str.hashCode() == 1519072899) {
            super.fromProtocol((cs6) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/model/P2P");
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
        zg2 zg2Var = this.body;
        if (zg2Var != null) {
            return MessageNano.toByteArray(zg2Var);
        }
        return new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(cs6 cs6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8b3683", new Object[]{this, cs6Var});
            return;
        }
        super.fromProtocol(cs6Var);
        this.body = zg2.c(p1n.b(cs6Var));
        this.content = p1n.a(cs6Var);
        this.routerId = this.body.f32741a;
    }

    public P2P(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = 1;
        this.type = 5;
        zg2 zg2Var = new zg2();
        this.body = zg2Var;
        zg2Var.f32741a = this.routerId;
    }
}
