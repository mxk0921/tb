package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 \"2\u00060\u0001j\u0002`\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R2\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgCountValueParams;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "bizCode", "Ljava/lang/Integer;", "getBizCode", "()Ljava/lang/Integer;", "setBizCode", "(Ljava/lang/Integer;)V", "", "needACK", "Ljava/lang/Boolean;", "getNeedACK", "()Ljava/lang/Boolean;", "setNeedACK", "(Ljava/lang/Boolean;)V", "", "topic", "Ljava/lang/String;", "getTopic", "()Ljava/lang/String;", "setTopic", "(Ljava/lang/String;)V", "", "", "params", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "setParams", "(Ljava/util/Map;)V", "Companion", "a", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSPowerMsgCountValueParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private Integer bizCode;
    private Boolean needACK;
    private Map<String, ? extends Object> params;
    private String topic;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1002438911);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438910);
    }

    public final Integer getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("828c7dd8", new Object[]{this});
        }
        return this.bizCode;
    }

    public final Boolean getNeedACK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c8110e61", new Object[]{this});
        }
        return this.needACK;
    }

    public final Map<String, Object> getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.params;
    }

    public final String getTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.topic;
    }

    public final void setBizCode(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8961f2", new Object[]{this, num});
        } else {
            this.bizCode = num;
        }
    }

    public final void setNeedACK(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c43ef5", new Object[]{this, bool});
        } else {
            this.needACK = bool;
        }
    }

    public final void setParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
        } else {
            this.params = map;
        }
    }

    public final void setTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.topic = str;
        }
    }
}
