package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.mh1;
import tb.mzf;
import tb.qjg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0001\u0018\u0000 \u001f2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR/\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\r¨\u0006!"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/DataMessage;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "backgroundUrl$delegate", "Ltb/qjg;", "getBackgroundUrl", "()Ljava/lang/String;", "setBackgroundUrl", "(Ljava/lang/String;)V", "backgroundUrl", "clickUrl$delegate", "getClickUrl", "setClickUrl", mh1.PRD_P4P_URL, "animatedUrl$delegate", "getAnimatedUrl", "setAnimatedUrl", "animatedUrl", "title$delegate", "getTitle", "setTitle", "title", "amountStr$delegate", "getAmountStr", "setAmountStr", "amountStr", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DataMessage extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg backgroundUrl$delegate = new qjg(null, this, DataMessage$backgroundUrl$2.INSTANCE);
    private final qjg clickUrl$delegate = new qjg(null, this, DataMessage$clickUrl$2.INSTANCE);
    private final qjg animatedUrl$delegate = new qjg(null, this, DataMessage$animatedUrl$2.INSTANCE);
    private final qjg title$delegate = new qjg(null, this, DataMessage$title$2.INSTANCE);
    private final qjg amountStr$delegate = new qjg(null, this, DataMessage$amountStr$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004535986);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(DataMessage dataMessage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/DataMessage");
    }

    public final String getAmountStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8f2f6d6", new Object[]{this});
        }
        return (String) this.amountStr$delegate.b(this, $$delegatedProperties[4]);
    }

    public final String getAnimatedUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6778523", new Object[]{this});
        }
        return (String) this.animatedUrl$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String getBackgroundUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1cdd7a2e", new Object[]{this});
        }
        return (String) this.backgroundUrl$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getClickUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69622edc", new Object[]{this});
        }
        return (String) this.clickUrl$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return (String) this.title$delegate.b(this, $$delegatedProperties[3]);
    }

    public final void setAmountStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a99fc8", new Object[]{this, str});
        } else {
            this.amountStr$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    public final void setAnimatedUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30304e1b", new Object[]{this, str});
        } else {
            this.animatedUrl$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setBackgroundUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b371ad70", new Object[]{this, str});
        } else {
            this.backgroundUrl$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setClickUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc1071a", new Object[]{this, str});
        } else {
            this.clickUrl$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    static {
        t2o.a(1004535985);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(DataMessage.class, "backgroundUrl", "getBackgroundUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(DataMessage.class, mh1.PRD_P4P_URL, "getClickUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(DataMessage.class, "animatedUrl", "getAnimatedUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(DataMessage.class, "title", "getTitle()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(DataMessage.class, "amountStr", "getAmountStr()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5};
    }
}
