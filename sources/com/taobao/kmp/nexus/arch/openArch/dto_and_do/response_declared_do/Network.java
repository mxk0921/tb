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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u000f2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/Network;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/Vatsb;", "<set-?>", "vatsb$delegate", "Ltb/qjg;", "getVatsb", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/Vatsb;", "setVatsb", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/Vatsb;)V", "vatsb", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class Network extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg vatsb$delegate = new qjg(null, this, Network$vatsb$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536395);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(Network network, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/Network");
    }

    public final Vatsb getVatsb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vatsb) ipChange.ipc$dispatch("285a31f", new Object[]{this});
        }
        return (Vatsb) this.vatsb$delegate.b(this, $$delegatedProperties[0]);
    }

    public final void setVatsb(Vatsb vatsb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e2f36f", new Object[]{this, vatsb});
        } else {
            this.vatsb$delegate.a(this, $$delegatedProperties[0], vatsb);
        }
    }

    static {
        t2o.a(1004536394);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(Network.class, "vatsb", "getVatsb()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/Vatsb;", 0);
        dun.f(mutablePropertyReference1Impl);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl};
    }
}
