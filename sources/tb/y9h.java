package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y9h implements cgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f31921a;
    public volatile boolean b;
    public volatile boolean c;

    public y9h(cgd cgdVar) {
        this.f31921a = cgdVar;
    }

    @Override // tb.cgd
    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86fd28c7", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (this.b) {
            return Boolean.parseBoolean(d1r.c("SwallowsRemoteSoSwitch").getProperty(str, String.valueOf(z)));
        }
        return this.f31921a.a(str, z);
    }

    @Override // tb.cgd
    public List<String> b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b413ea7", new Object[]{this, str, str2});
        }
        if (!this.b) {
            return this.f31921a.b(str, str2);
        }
        String property = d1r.c("SwallowsRemoteSoSwitch").getProperty(str, str2);
        if (trq.e(property)) {
            return yb1.c(property.split(","));
        }
        return Collections.emptyList();
    }

    @Override // tb.cgd
    public long c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53ef7cd5", new Object[]{this, str, new Long(j)})).longValue();
        }
        if (this.b) {
            return Long.parseLong(d1r.c("SwallowsRemoteSoSwitch").getProperty(str, String.valueOf(j)));
        }
        return this.f31921a.c(str, j);
    }

    @Override // tb.cgd
    public String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68e2387e", new Object[]{this, str, str2});
        }
        if (this.b) {
            return d1r.c("SwallowsRemoteSoSwitch").getProperty(str, str2);
        }
        return this.f31921a.d(str, str2);
    }

    @Override // tb.cgd
    public List<String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("65375c31", new Object[]{this, str});
        }
        if (!this.b) {
            return this.f31921a.e(str);
        }
        String property = d1r.c("SwallowsRemoteSoSwitch").getProperty(str, "");
        if (trq.e(property)) {
            return yb1.c(property.split(","));
        }
        return Collections.emptyList();
    }

    @Override // tb.cgd
    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45a83c1d", new Object[]{this, str});
        }
        if (this.c) {
            return d1r.b("SwallowsRemoteSoIndex");
        }
        return this.f31921a.f(str);
    }

    @Override // tb.cgd
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
            return;
        }
        this.f31921a.g();
        this.b = d1r.a("SwallowsRemoteSoSwitch");
        this.c = d1r.a("SwallowsRemoteSoIndex");
    }

    @Override // tb.cgd
    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac927ec", new Object[]{this, str})).booleanValue();
        }
        if (!this.b) {
            return this.f31921a.h(str);
        }
        if (trq.c(str)) {
            return false;
        }
        return d1r.c("SwallowsRemoteSoSwitch").getProperty("key_lib_disabled_list2", "").contains(str);
    }
}
