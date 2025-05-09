package com.taobao.tao.powermsg.common;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.powermsg.model.MessageFrame;
import java.util.ArrayList;
import java.util.List;
import tb.dva;
import tb.ikl;
import tb.t2o;
import tb.wg2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PowerMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bizCode;
    public byte[] data;
    public List<a> dataList;
    public String from;
    public StreamFullLinkMonitor fullLink;
    public int fullLinkFlag;
    public String messageId;
    public boolean needAck;
    public long pmDownTime;
    public int priority;
    public int qosLevel;
    public boolean sendFullTags;
    public long seqNum;
    public int sourceType;
    public String streamId;
    public String[] tags;
    public long timestamp;
    public String to;
    public String topic;
    public int type = -1;
    public String userId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f12572a;
        public byte[] b;

        static {
            t2o.a(628097224);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ff27d1ad", new Object[]{this});
            }
            return this.f12572a;
        }

        public byte[] b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("f00686de", new Object[]{this});
            }
            return this.b;
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68101fd1", new Object[]{this, str});
            } else {
                this.f12572a = str;
            }
        }

        public void d(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3b7155a", new Object[]{this, bArr});
            } else {
                this.b = bArr;
            }
        }
    }

    static {
        t2o.a(628097223);
    }

    public static String safeToString(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29c80e72", new Object[]{powerMessage});
        }
        if (powerMessage == null) {
            return "";
        }
        return "topic= " + powerMessage.topic + " messageid" + powerMessage.messageId + " bizCode=" + powerMessage.bizCode + " type=" + powerMessage.type;
    }

    public void copyStreamFromPackage(ikl<BaseMessage> iklVar) {
        wg2[] wg2VarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cedf1fad", new Object[]{this, iklVar});
            return;
        }
        try {
            dva dvaVar = iklVar.f21366a.header;
            if (!(dvaVar == null || TextUtils.isEmpty(dvaVar.p))) {
                this.streamId = dvaVar.p;
                this.seqNum = dvaVar.o;
                this.pmDownTime = iklVar.j;
                this.fullLink = iklVar.p;
                BaseMessage baseMessage = iklVar.f21366a;
                if ((baseMessage instanceof MessageFrame) && (wg2VarArr = ((MessageFrame) baseMessage).frame.f29998a) != null && wg2VarArr.length > 0) {
                    if (this.dataList == null) {
                        this.dataList = new ArrayList();
                    }
                    for (wg2 wg2Var : wg2VarArr) {
                        a aVar = new a();
                        aVar.c(wg2Var.f30675a);
                        aVar.d(wg2Var.c);
                        this.dataList.add(aVar);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (TextUtils.isEmpty(this.streamId) || !(obj instanceof PowerMessage)) {
            return super.equals(obj);
        }
        PowerMessage powerMessage = (PowerMessage) obj;
        if (!this.streamId.equals(powerMessage.streamId) || this.seqNum != powerMessage.seqNum) {
            return false;
        }
        return true;
    }

    public void fromData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da05c0fb", new Object[]{this});
        }
    }

    public void toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695e56cc", new Object[]{this});
        }
    }
}
