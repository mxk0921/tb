package com.taobao.tao.powermsg.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.MessageNano;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import java.util.HashMap;
import java.util.Map;
import tb.ah2;
import tb.cs6;
import tb.dva;
import tb.p1n;
import tb.p2j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Report extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ah2 body;

    static {
        t2o.a(628097295);
    }

    public Report() {
    }

    public static Report create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Report) ipChange.ipc$dispatch("adf095b5", new Object[0]);
        }
        Report report = new Report();
        report.assemble();
        report.type = 6;
        report.msgType = 3;
        report.sysCode = 1;
        report.body = new ah2();
        return report;
    }

    public static /* synthetic */ Object ipc$super(Report report, String str, Object... objArr) {
        if (str.hashCode() == 1519072899) {
            super.fromProtocol((cs6) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/model/Report");
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
        ah2 ah2Var = this.body;
        if (ah2Var != null) {
            return MessageNano.toByteArray(ah2Var);
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
        this.body = ah2.c(p1n.b(cs6Var));
    }

    public void setBizTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67dae25a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.body.f15735a = str;
        }
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("namespace", Integer.valueOf(this.bizCode));
        hashMap.put("topic", this.header.f18091a);
        hashMap.put("biztag", this.body.f15735a);
        hashMap.put("messageid", this.header.f);
        hashMap.put("subtype", Integer.valueOf(this.header.g));
        hashMap.put("presubtype", Integer.valueOf(this.body.b));
        hashMap.put("source", Integer.valueOf(this.body.c));
        hashMap.put("sdkversion", "0.3.0");
        hashMap.put("timestamp", Long.valueOf(this.createTime));
        return hashMap;
    }

    public Report(BaseMessage baseMessage, int i, String str, int i2) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = 1;
        this.type = 6;
        ah2 ah2Var = new ah2();
        this.body = ah2Var;
        ah2Var.b = baseMessage.header.g;
        ah2Var.c = i2;
        this.header.g = i;
        this.needACK = false;
        setBizTag(str);
        this.version = 1;
        this.serializeType = (byte) 1;
        this.typeVersion = (byte) 1;
        this.header.e = p2j.e();
        dva dvaVar = this.header;
        dvaVar.d = "0.3.0";
        dvaVar.h = p2j.d();
        this.header.i = p2j.c();
        this.body.d = System.currentTimeMillis();
    }
}
