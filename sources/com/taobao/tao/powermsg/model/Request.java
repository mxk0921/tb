package com.taobao.tao.powermsg.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.MessageNano;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import java.util.HashMap;
import java.util.Map;
import tb.bh2;
import tb.cs6;
import tb.l2o;
import tb.p1n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Request extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public bh2 body;

    static {
        t2o.a(628097297);
    }

    public Request() {
    }

    public static Request create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("1225a11e", new Object[0]);
        }
        Request request = new Request();
        request.assemble();
        request.msgType = 3;
        request.sysCode = 1;
        request.type = 4;
        request.needACK = true;
        request.body = new bh2();
        return request;
    }

    public static /* synthetic */ Object ipc$super(Request request, String str, Object... objArr) {
        if (str.hashCode() == 1519072899) {
            super.fromProtocol((cs6) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/model/Request");
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
        bh2 bh2Var = this.body;
        if (bh2Var != null) {
            return MessageNano.toByteArray(bh2Var);
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
        this.body = bh2.c(p1n.b(cs6Var));
    }

    public void setBizTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67dae25a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.body.d = str;
        }
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizCode", Integer.valueOf(this.bizCode));
        hashMap.put("topic", this.header.f18091a);
        hashMap.put("role", Integer.valueOf(this.body.c));
        hashMap.put(l2o.COL_BTAG, this.body.d);
        hashMap.put("offset", Long.valueOf(this.body.f16382a));
        hashMap.put("pagesize", Integer.valueOf(this.body.b));
        hashMap.put("sdkversion", "0.3.0");
        hashMap.put("timestamp", Long.valueOf(this.createTime));
        return hashMap;
    }

    public Request(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = 1;
        this.type = 4;
        this.needACK = true;
        this.body = new bh2();
    }
}
