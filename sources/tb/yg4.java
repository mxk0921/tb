package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yg4 implements cgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f32070a;

    public yg4(Application application) {
        this.f32070a = application;
    }

    @Override // tb.cgd
    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86fd28c7", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (trq.c(str)) {
            return z;
        }
        return pno.b(this.f32070a, "SwallowsRemoteSoSwitch", str, z);
    }

    @Override // tb.cgd
    public List<String> b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b413ea7", new Object[]{this, str, str2});
        }
        if (trq.c(str)) {
            return Collections.emptyList();
        }
        String e = pno.e(this.f32070a, "SwallowsRemoteSoSwitch", str, str2);
        if (trq.c(e)) {
            return Collections.emptyList();
        }
        return yb1.c(e.split(","));
    }

    @Override // tb.cgd
    public long c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53ef7cd5", new Object[]{this, str, new Long(j)})).longValue();
        }
        if (trq.c(str)) {
            return j;
        }
        return pno.c(this.f32070a, "SwallowsRemoteSoSwitch", str, j);
    }

    @Override // tb.cgd
    public String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68e2387e", new Object[]{this, str, str2});
        }
        if (trq.c(str)) {
            return str2;
        }
        return pno.e(this.f32070a, "SwallowsRemoteSoSwitch", str, str2);
    }

    @Override // tb.cgd
    public List<String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("65375c31", new Object[]{this, str});
        }
        return b(str, "");
    }

    @Override // tb.cgd
    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45a83c1d", new Object[]{this, str});
        }
        return bh4.e(this.f32070a, str);
    }

    @Override // tb.cgd
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
        }
    }

    @Override // tb.cgd
    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac927ec", new Object[]{this, str})).booleanValue();
        }
        return pno.a(this.f32070a, "SwallowsRemoteSoSwitch", "key_lib_disabled_list2", str);
    }
}
