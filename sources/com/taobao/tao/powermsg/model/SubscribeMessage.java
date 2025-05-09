package com.taobao.tao.powermsg.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.MessageNano;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.HashMap;
import java.util.Map;
import tb.cs6;
import tb.dh2;
import tb.p1n;
import tb.p2j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SubscribeMessage extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public dh2 body;
    public String routeGroup;

    static {
        t2o.a(628097298);
    }

    public SubscribeMessage() {
    }

    public static SubscribeMessage create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubscribeMessage) ipChange.ipc$dispatch("e5fbb2c", new Object[0]);
        }
        SubscribeMessage subscribeMessage = new SubscribeMessage();
        subscribeMessage.assemble();
        subscribeMessage.msgType = 8;
        subscribeMessage.sysCode = 1;
        subscribeMessage.body = new dh2();
        subscribeMessage.needACK = true;
        return subscribeMessage;
    }

    public static /* synthetic */ Object ipc$super(SubscribeMessage subscribeMessage, String str, Object... objArr) {
        if (str.hashCode() == 1519072899) {
            super.fromProtocol((cs6) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/model/SubscribeMessage");
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
        dh2 dh2Var = this.body;
        if (dh2Var == null) {
            return new byte[0];
        }
        dh2Var.f = this.createTime;
        dh2Var.e = this.ext;
        return MessageNano.toByteArray(dh2Var);
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(cs6 cs6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8b3683", new Object[]{this, cs6Var});
            return;
        }
        super.fromProtocol(cs6Var);
        this.body = dh2.c(p1n.b(cs6Var));
    }

    public void setBizTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67dae25a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.body.c = str;
        }
    }

    public void setFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.body.f17810a = str;
        }
    }

    public SubscribeMessage(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 8;
        this.sysCode = 1;
        this.needACK = true;
        this.body = new dh2();
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
            hashMap.put("role", Integer.valueOf(this.body.b));
            hashMap.put("tag", this.body.c);
            hashMap.put("from", this.body.f17810a);
            hashMap.put("id", this.header.h);
            hashMap.put("sdkVersion", "0.3.0");
            hashMap.put("timestamp", Long.valueOf(this.createTime));
            hashMap.put("utdId", p2j.e);
            hashMap.put("appKey", p2j.g);
            hashMap.put("ext", this.ext);
            hashMap.put("internalExt", this.internalExt);
        } catch (Exception e) {
            MsgLog.f("SubMessage", e, new Object[0]);
        }
        return hashMap;
    }
}
