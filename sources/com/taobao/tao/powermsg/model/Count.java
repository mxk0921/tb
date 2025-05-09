package com.taobao.tao.powermsg.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.MessageNano;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.cs6;
import tb.p1n;
import tb.sg2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Count extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public sg2 body;

    static {
        t2o.a(628097291);
    }

    public Count() {
    }

    public static Count create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Count) ipChange.ipc$dispatch("a2404f1e", new Object[0]);
        }
        Count count = new Count();
        count.assemble();
        count.msgType = 3;
        count.sysCode = 1;
        count.type = 2;
        count.body = new sg2();
        return count;
    }

    public static /* synthetic */ Object ipc$super(Count count, String str, Object... objArr) {
        if (str.hashCode() == 1519072899) {
            super.fromProtocol((cs6) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/model/Count");
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
        sg2 sg2Var = this.body;
        if (sg2Var != null) {
            return MessageNano.toByteArray(sg2Var);
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
        this.body = sg2.c(p1n.b(cs6Var));
    }

    public Count(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = 1;
        this.type = 2;
        this.body = new sg2();
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("namespace", Integer.valueOf(this.bizCode));
            hashMap.put("topic", this.header.f18091a);
            hashMap.put("countMap", new JSONObject(this.body.f28030a).toString());
            hashMap.put("sdkVersion", "0.3.0");
        } catch (Exception e) {
            MsgLog.f("Count", e, new Object[0]);
        }
        return hashMap;
    }
}
