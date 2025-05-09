package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.mzf;
import tb.qjg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0001\u0018\u0000 \u001f2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR/\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\r¨\u0006!"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/Atmosphere;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "headIcon$delegate", "Ltb/qjg;", "getHeadIcon", "()Ljava/lang/String;", "setHeadIcon", "(Ljava/lang/String;)V", "headIcon", "headIconForLight$delegate", "getHeadIconForLight", "setHeadIconForLight", "headIconForLight", "questionChallenge$delegate", "getQuestionChallenge", "setQuestionChallenge", "questionChallenge", "questionUrl$delegate", "getQuestionUrl", "setQuestionUrl", "questionUrl", "questionExplain$delegate", "getQuestionExplain", "setQuestionExplain", "questionExplain", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class Atmosphere extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg headIcon$delegate = new qjg(null, this, Atmosphere$headIcon$2.INSTANCE);
    private final qjg headIconForLight$delegate = new qjg(null, this, Atmosphere$headIconForLight$2.INSTANCE);
    private final qjg questionChallenge$delegate = new qjg(null, this, Atmosphere$questionChallenge$2.INSTANCE);
    private final qjg questionUrl$delegate = new qjg(null, this, Atmosphere$questionUrl$2.INSTANCE);
    private final qjg questionExplain$delegate = new qjg(null, this, Atmosphere$questionExplain$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004535878);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(Atmosphere atmosphere, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/Atmosphere");
    }

    public final String getHeadIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ad7e6a", new Object[]{this});
        }
        return (String) this.headIcon$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getHeadIconForLight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce6b319d", new Object[]{this});
        }
        return (String) this.headIconForLight$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getQuestionChallenge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76229af2", new Object[]{this});
        }
        return (String) this.questionChallenge$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String getQuestionExplain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b98f25de", new Object[]{this});
        }
        return (String) this.questionExplain$delegate.b(this, $$delegatedProperties[4]);
    }

    public final String getQuestionUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666dbe66", new Object[]{this});
        }
        return (String) this.questionUrl$delegate.b(this, $$delegatedProperties[3]);
    }

    public final void setHeadIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edfa94c", new Object[]{this, str});
        } else {
            this.headIcon$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setHeadIconForLight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3d9079", new Object[]{this, str});
        } else {
            this.headIconForLight$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setQuestionChallenge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bafcb2c", new Object[]{this, str});
        } else {
            this.questionChallenge$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setQuestionExplain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327d6ac0", new Object[]{this, str});
        } else {
            this.questionExplain$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    public final void setQuestionUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f013d38", new Object[]{this, str});
        } else {
            this.questionUrl$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    static {
        t2o.a(1004535877);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(Atmosphere.class, "headIcon", "getHeadIcon()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(Atmosphere.class, "headIconForLight", "getHeadIconForLight()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(Atmosphere.class, "questionChallenge", "getQuestionChallenge()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(Atmosphere.class, "questionUrl", "getQuestionUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(Atmosphere.class, "questionExplain", "getQuestionExplain()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5};
    }
}
