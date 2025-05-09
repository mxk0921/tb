package com.taobao.kmp.nexus.arch.openArch.service.message.context;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class b extends com.taobao.kmp.nexus.arch.openArch.service.message.context.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public String e;
    public final String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536551);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("528b420f", new Object[]{this, str});
            }
            return new b(str, "", OpenArchMessageCompensationType.Comment);
        }

        public final List<b> b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("b035db61", new Object[]{this, str});
            }
            return yz3.l(c(str), a(str));
        }

        public final b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("517767c6", new Object[]{this, str});
            }
            return new b(str, "", OpenArchMessageCompensationType.Goods);
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536550);
    }

    public b() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/message/context/CompensationMessageProcessorContext");
    }

    @Override // com.taobao.kmp.nexus.arch.openArch.service.message.context.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("873e9f0e", new Object[]{this});
        }
        return this.f;
    }

    @Override // com.taobao.kmp.nexus.arch.openArch.service.message.context.a
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b2369d", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.taobao.kmp.nexus.arch.openArch.service.message.context.a
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6a17e1", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public /* synthetic */ b(String str, String str2, OpenArchMessageCompensationType openArchMessageCompensationType, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? OpenArchMessageCompensationType.Unknown : openArchMessageCompensationType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, OpenArchMessageCompensationType openArchMessageCompensationType) {
        super(str, str2);
        ckf.g(openArchMessageCompensationType, "compensationType");
        this.e = str;
        this.f = str2;
    }
}
