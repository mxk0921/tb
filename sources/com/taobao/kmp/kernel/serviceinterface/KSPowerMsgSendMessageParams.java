package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgSendMessageParams;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "bizCode", "Ljava/lang/Integer;", "getBizCode", "()Ljava/lang/Integer;", "setBizCode", "(Ljava/lang/Integer;)V", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgPowerMessage;", "message", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgPowerMessage;", "getMessage", "()Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgPowerMessage;", "setMessage", "(Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgPowerMessage;)V", "Companion", "a", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSPowerMsgSendMessageParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private Integer bizCode;
    private KSPowerMsgPowerMessage message;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1002438928);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438927);
    }

    public final Integer getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("828c7dd8", new Object[]{this});
        }
        return this.bizCode;
    }

    public final KSPowerMsgPowerMessage getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSPowerMsgPowerMessage) ipChange.ipc$dispatch("c0d35f6", new Object[]{this});
        }
        return this.message;
    }

    public final void setBizCode(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8961f2", new Object[]{this, num});
        } else {
            this.bizCode = num;
        }
    }

    public final void setMessage(KSPowerMsgPowerMessage kSPowerMsgPowerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab79462", new Object[]{this, kSPowerMsgPowerMessage});
        } else {
            this.message = kSPowerMsgPowerMessage;
        }
    }
}
