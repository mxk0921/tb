package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 \u001b2\u00060\u0001j\u0002`\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R2\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgTextMessage;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgMessageHeader;", "header", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgMessageHeader;", "getHeader", "()Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgMessageHeader;", "setHeader", "(Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgMessageHeader;)V", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "", "", pg1.ATOM_values, "Ljava/util/Map;", "getValues", "()Ljava/util/Map;", "setValues", "(Ljava/util/Map;)V", "Companion", "a", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSPowerMsgTextMessage implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private KSPowerMsgMessageHeader header;
    private String text;
    private Map<String, ? extends Object> values;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1002438939);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438938);
    }

    public final KSPowerMsgMessageHeader getHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSPowerMsgMessageHeader) ipChange.ipc$dispatch("a54bcd38", new Object[]{this});
        }
        return this.header;
    }

    public final String getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.text;
    }

    public final Map<String, Object> getValues() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70cb8894", new Object[]{this});
        }
        return this.values;
    }

    public final void setHeader(KSPowerMsgMessageHeader kSPowerMsgMessageHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38535f82", new Object[]{this, kSPowerMsgMessageHeader});
        } else {
            this.header = kSPowerMsgMessageHeader;
        }
    }

    public final void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.text = str;
        }
    }

    public final void setValues(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea33897a", new Object[]{this, map});
        } else {
            this.values = map;
        }
    }
}
