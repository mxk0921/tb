package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliMonitorInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jc5 implements kub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile AliMonitorInterface f21912a;

    @Override // tb.kub
    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db371a1c", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        if (this.f21912a == null) {
            d();
        }
        if (this.f21912a != null) {
            this.f21912a.a(str, str2, str3, str4, str5);
        }
    }

    @Override // tb.kub
    public void b(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c9adc9f", new Object[]{this, str, str2, str3, new Double(d)});
            return;
        }
        if (this.f21912a == null) {
            d();
        }
        if (this.f21912a != null) {
            this.f21912a.b(str, str2, str3, d);
        }
    }

    @Override // tb.kub
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4250c703", new Object[]{this, str, str2, str3});
            return;
        }
        if (this.f21912a == null) {
            d();
        }
        if (this.f21912a != null) {
            this.f21912a.c(str, str2, str3);
        }
    }

    public final synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b7c70ea", new Object[]{this});
            return;
        }
        if (this.f21912a == null) {
            this.f21912a = nq0.c();
        }
    }
}
