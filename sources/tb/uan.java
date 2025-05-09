package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class uan implements cgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f29264a;

    public uan(cgd cgdVar) {
        this.f29264a = cgdVar;
    }

    @Override // tb.cgd
    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86fd28c7", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        boolean a2 = this.f29264a.a(str, z);
        if (a2 != z) {
            RSoLog.a("config -> readBool(), key=" + str + " result=" + a2 + " : defaultValue=" + z);
        }
        return a2;
    }

    @Override // tb.cgd
    public List<String> b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b413ea7", new Object[]{this, str, str2});
        }
        List<String> b = this.f29264a.b(str, str2);
        if (trq.c(str2) && b.isEmpty()) {
            return b;
        }
        RSoLog.a("config -> readStringList(), key=" + str + ", defaultValue=" + str2 + ", result=" + b);
        return b;
    }

    @Override // tb.cgd
    public long c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53ef7cd5", new Object[]{this, str, new Long(j)})).longValue();
        }
        long c = this.f29264a.c(str, j);
        if (c != j) {
            RSoLog.a("config -> readLong(), key=" + str + " longValue=" + c + " : defaultValue=" + j);
        }
        return c;
    }

    @Override // tb.cgd
    public String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68e2387e", new Object[]{this, str, str2});
        }
        String d = this.f29264a.d(str, str2);
        if (!trq.d(d, str2)) {
            RSoLog.a("config -> readString(), key=" + str + " , s=" + d + " : defaultValue=" + str2);
        }
        return d;
    }

    @Override // tb.cgd
    public List<String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("65375c31", new Object[]{this, str});
        }
        List<String> e = this.f29264a.e(str);
        RSoLog.a("config -> readStringList(), key=" + str + ", result=" + e);
        return e;
    }

    @Override // tb.cgd
    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45a83c1d", new Object[]{this, str});
        }
        String f = this.f29264a.f(str);
        if (!trq.d(f, str)) {
            RSoLog.a("config -> readCustomContent(), customContent exist, defaultContent = " + str);
        }
        return f;
    }

    @Override // tb.cgd
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
        } else {
            this.f29264a.g();
        }
    }

    @Override // tb.cgd
    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac927ec", new Object[]{this, str})).booleanValue();
        }
        boolean h = this.f29264a.h(str);
        if (h) {
            RSoLog.d("config -> read sp, libDisabled=true, libName=" + str);
        }
        return h;
    }
}
