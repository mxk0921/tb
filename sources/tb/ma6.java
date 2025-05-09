package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ma6 implements mwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile AliLogInterface f23885a;

    @Override // tb.mwb
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4508586", new Object[]{this, str, str2, str3});
            return;
        }
        if (this.f23885a == null) {
            c();
        }
        if (this.f23885a != null) {
            this.f23885a.a(str, str2, str3);
        }
    }

    @Override // tb.mwb
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e727b88a", new Object[]{this, str, str2, str3});
            return;
        }
        if (this.f23885a == null) {
            c();
        }
        if (this.f23885a != null) {
            this.f23885a.b(str, str2, str3);
        }
    }

    public final synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b7c70ea", new Object[]{this});
            return;
        }
        if (this.f23885a == null) {
            this.f23885a = jq0.c();
        }
    }
}
