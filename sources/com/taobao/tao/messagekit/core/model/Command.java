package com.taobao.tao.messagekit.core.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.MessageNano;
import tb.cs6;
import tb.p1n;
import tb.rg2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Command extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public rg2 body;

    static {
        t2o.a(628097157);
    }

    public Command() {
    }

    public static Command create(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Command) ipChange.ipc$dispatch("27806bd0", new Object[]{new Integer(i)});
        }
        Command command = new Command();
        command.assemble();
        command.msgType = 3;
        command.sysCode = i;
        command.type = 3;
        command.body = new rg2();
        return command;
    }

    public static /* synthetic */ Object ipc$super(Command command, String str, Object... objArr) {
        if (str.hashCode() == 1519072899) {
            super.fromProtocol((cs6) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/core/model/Command");
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
        rg2 rg2Var = this.body;
        if (rg2Var != null) {
            return MessageNano.toByteArray(rg2Var);
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
        this.body = rg2.c(p1n.b(cs6Var));
    }

    public Command(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = baseMessage.sysCode;
        this.type = 3;
        this.body = new rg2();
    }
}
