package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 \"2\u00060\u0001j\u0002`\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R2\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgJoinMessage;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgMessageHeader;", "header", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgMessageHeader;", "getHeader", "()Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgMessageHeader;", "setHeader", "(Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgMessageHeader;)V", "", "totalCount", "Ljava/lang/Integer;", "getTotalCount", "()Ljava/lang/Integer;", "setTotalCount", "(Ljava/lang/Integer;)V", "onlineCount", "getOnlineCount", "setOnlineCount", "pageViewCount", "getPageViewCount", "setPageViewCount", "", "", "", "addUsers", "Ljava/util/Map;", "getAddUsers", "()Ljava/util/Map;", "setAddUsers", "(Ljava/util/Map;)V", "Companion", "a", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSPowerMsgJoinMessage implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private Map<String, ? extends Object> addUsers;
    private KSPowerMsgMessageHeader header;
    private Integer onlineCount;
    private Integer pageViewCount;
    private Integer totalCount;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1002438916);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438915);
    }

    public final Map<String, Object> getAddUsers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6b050099", new Object[]{this});
        }
        return this.addUsers;
    }

    public final KSPowerMsgMessageHeader getHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSPowerMsgMessageHeader) ipChange.ipc$dispatch("a54bcd38", new Object[]{this});
        }
        return this.header;
    }

    public final Integer getOnlineCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("493bc4b4", new Object[]{this});
        }
        return this.onlineCount;
    }

    public final Integer getPageViewCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d22b7613", new Object[]{this});
        }
        return this.pageViewCount;
    }

    public final Integer getTotalCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("dab7194f", new Object[]{this});
        }
        return this.totalCount;
    }

    public final void setAddUsers(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f574c515", new Object[]{this, map});
        } else {
            this.addUsers = map;
        }
    }

    public final void setHeader(KSPowerMsgMessageHeader kSPowerMsgMessageHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38535f82", new Object[]{this, kSPowerMsgMessageHeader});
        } else {
            this.header = kSPowerMsgMessageHeader;
        }
    }

    public final void setOnlineCount(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80841096", new Object[]{this, num});
        } else {
            this.onlineCount = num;
        }
    }

    public final void setPageViewCount(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95b83817", new Object[]{this, num});
        } else {
            this.pageViewCount = num;
        }
    }

    public final void setTotalCount(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58c09c3", new Object[]{this, num});
        } else {
            this.totalCount = num;
        }
    }
}
