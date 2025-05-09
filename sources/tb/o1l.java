package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.service.powermsg.OpenArchPMBizCode;
import com.taobao.kmp.nexus.arch.openArch.service.powermsg.OpenArchPMBizTag;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class o1l implements nzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f25087a;
    public final OpenArchPMBizCode b;
    public final OpenArchPMBizTag c;
    public boolean d;
    public String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536654);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final o1l a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o1l) ipChange.ipc$dispatch("3789ac7d", new Object[]{this, str});
            }
            return new o1l(str, OpenArchPMBizCode.DefaultBizCode, OpenArchPMBizTag.TaoBao, null, String.valueOf(srv.a()), null, 40, null);
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536653);
        t2o.a(1004536553);
        t2o.a(1029701651);
    }

    public o1l() {
        this(null, null, null, null, null, null, 63, null);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43374a6", new Object[]{this, str});
        }
    }

    public final OpenArchPMBizCode c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchPMBizCode) ipChange.ipc$dispatch("204f1dde", new Object[]{this});
        }
        return this.b;
    }

    public final OpenArchPMBizTag d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchPMBizTag) ipChange.ipc$dispatch("64caae3e", new Object[]{this});
        }
        return this.c;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a296f54", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b2369d", new Object[]{this});
        }
        return this.f25087a;
    }

    @Override // tb.nzf
    public String getUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this});
        }
        return this.e;
    }

    public final void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db17dff8", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6a17e1", new Object[]{this, str});
        } else {
            this.f25087a = str;
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1f49fa", new Object[]{this, str});
        } else {
            this.f25087a = str;
        }
    }

    @Override // tb.nzf
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public o1l(String str, OpenArchPMBizCode openArchPMBizCode, OpenArchPMBizTag openArchPMBizTag, String str2, String str3, String str4) {
        this.f25087a = str;
        this.b = openArchPMBizCode;
        this.c = openArchPMBizTag;
        this.d = true;
    }

    public /* synthetic */ o1l(String str, OpenArchPMBizCode openArchPMBizCode, OpenArchPMBizTag openArchPMBizTag, String str2, String str3, String str4, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? OpenArchPMBizCode.DefaultBizCode : openArchPMBizCode, (i & 4) != 0 ? OpenArchPMBizTag.TaoBao : openArchPMBizTag, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
