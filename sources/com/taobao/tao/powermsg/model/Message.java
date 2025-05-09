package com.taobao.tao.powermsg.model;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.MessageNano;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.HashMap;
import java.util.Map;
import tb.cs6;
import tb.p1n;
import tb.t2o;
import tb.yg2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Message extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public yg2 body;
    public byte[] content;

    static {
        t2o.a(628097292);
    }

    public Message() {
    }

    public static Message create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("e0b42a6", new Object[0]);
        }
        Message message = new Message();
        message.assemble();
        message.msgType = 3;
        message.sysCode = 1;
        message.type = 1;
        message.body = new yg2();
        return message;
    }

    public static /* synthetic */ Object ipc$super(Message message, String str, Object... objArr) {
        if (str.hashCode() == 1519072899) {
            super.fromProtocol((cs6) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/model/Message");
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bizToProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("972ab150", new Object[]{this});
        }
        byte[] bArr = this.content;
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
        yg2 yg2Var = this.body;
        if (yg2Var != null) {
            return MessageNano.toByteArray(yg2Var);
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
        this.body = yg2.c(p1n.b(cs6Var));
        this.content = p1n.a(cs6Var);
    }

    public Message(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = 1;
        this.type = 1;
        this.body = new yg2();
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("namespace", Integer.valueOf(this.bizCode));
            hashMap.put("topic", this.header.f18091a);
            hashMap.put("sendAll", Boolean.valueOf(this.body.d));
            JSONArray jSONArray = new JSONArray();
            for (String str : this.body.e) {
                if (!TextUtils.isEmpty(str)) {
                    jSONArray.add(str);
                }
            }
            hashMap.put("tagList", jSONArray.toString());
            hashMap.put("subType", Integer.valueOf(this.header.g));
            hashMap.put(RemoteMessageConst.MSGID, this.header.f);
            hashMap.put("qos", Integer.valueOf(this.qosLevel));
            hashMap.put("sdkVersion", "0.3.0");
            byte[] bArr = this.content;
            if (bArr != null) {
                hashMap.put("bizData", Base64.encodeToString(bArr, 0));
            }
        } catch (Exception e) {
            MsgLog.f("Message", e, new Object[0]);
        }
        return hashMap;
    }
}
