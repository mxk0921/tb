package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.permission.auth.model.AuthAgreementModel;
import com.taobao.themis.open.permission.auth.model.AuthTextModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class qj1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<AuthTextModel> f26779a;
    public String b;
    public String c;
    public String d;
    public List<AuthAgreementModel> e;

    static {
        t2o.a(843055333);
    }

    public final List<AuthAgreementModel> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e39eece1", new Object[]{this});
        }
        return this.e;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("210d51f4", new Object[]{this});
        }
        return this.d;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82cef0a9", new Object[]{this});
        }
        return this.c;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
        }
        return this.b;
    }

    public final List<AuthTextModel> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4357a895", new Object[]{this});
        }
        return this.f26779a;
    }

    public final void f(List<AuthAgreementModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511595a3", new Object[]{this, list});
        } else {
            this.e = list;
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7a4702", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec65355", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b790109b", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void j(List<AuthTextModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd40e36f", new Object[]{this, list});
        } else {
            this.f26779a = list;
        }
    }
}
