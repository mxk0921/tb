package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class wnf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30791a;
    public long b;
    public String c;
    public long d;
    public String e;

    static {
        t2o.a(502268271);
    }

    public wnf(String str, long j, String str2, long j2, String str3) {
        ckf.g(str, yh6.CONFIG_KEY_TEMPLATE_NAME);
        ckf.g(str2, WVMicorPublishPlugin.TEMPLATE_URL);
        ckf.g(str3, "lastRenderedUrl");
        this.f30791a = str;
        this.b = j;
        this.c = str2;
        this.d = j2;
        this.e = str3;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("842319eb", new Object[]{this});
        }
        return this.e;
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9792c2b2", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public final long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99d922bc", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8afad3e", new Object[]{this});
        }
        return this.f30791a;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c62d2fa", new Object[]{this});
        }
        return this.c;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba67f853", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.e = str;
    }

    public final void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d4d2", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public final void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910a6308", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57aebb24", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.c = str;
    }
}
