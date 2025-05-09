package com.taobao.tao.powermsg.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.MessageNano;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import java.util.Map;
import tb.cs6;
import tb.p1n;
import tb.t2o;
import tb.vg2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MessageFrame extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public vg2 frame;

    static {
        t2o.a(628097293);
    }

    public MessageFrame() {
    }

    public static MessageFrame create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageFrame) ipChange.ipc$dispatch("d52bf903", new Object[0]);
        }
        MessageFrame messageFrame = new MessageFrame();
        messageFrame.assemble();
        messageFrame.msgType = 3;
        messageFrame.sysCode = 1;
        messageFrame.type = 2;
        messageFrame.frame = new vg2();
        return messageFrame;
    }

    public static /* synthetic */ Object ipc$super(MessageFrame messageFrame, String str, Object... objArr) {
        if (str.hashCode() == 1519072899) {
            super.fromProtocol((cs6) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/model/MessageFrame");
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
        vg2 vg2Var = this.frame;
        if (vg2Var != null) {
            return MessageNano.toByteArray(vg2Var);
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
        this.frame = vg2.c(p1n.b(cs6Var));
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        return null;
    }

    public MessageFrame(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = 1;
        this.type = 2;
        this.frame = new vg2();
    }
}
