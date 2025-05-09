package tb;

import com.alibaba.analytics.core.model.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.ZstdStreamDeflater;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class erx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static erx f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f18786a = false;
    public boolean b = false;
    public ByteArrayOutputStream c = null;
    public frx d = null;
    public ZstdStreamDeflater e = null;

    static {
        t2o.a(962592970);
    }

    public static synchronized erx e() {
        synchronized (erx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (erx) ipChange.ipc$dispatch("17d882a2", new Object[0]);
            }
            if (f == null) {
                f = new erx();
            }
            return f;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f52ae00", new Object[]{this});
            return;
        }
        nhh.f("", "closeOutputStream zstd");
        b(this.d);
        b(this.c);
        if (this.e != null) {
            try {
                nhh.f("", "closeOutputStream deflater");
                this.e.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.e = null;
        }
    }

    public final void b(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b72bf2", new Object[]{this, outputStream});
        } else if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7edbf9e", new Object[]{this});
        } else {
            this.b = true;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19627f16", new Object[]{this});
        } else {
            this.f18786a = true;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce294099", new Object[]{this})).booleanValue();
        }
        if (this.f18786a || this.b || !brx.c().f() || this.d == null) {
            return false;
        }
        return true;
    }

    public void i(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be73cee9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (h() && i > 0 && i2 > 0 && i3 > 0 && q2v.d().f(19997, "_ut_zstd")) {
            HashMap hashMap = new HashMap();
            hashMap.put("base", String.valueOf(i));
            hashMap.put("gzip", String.valueOf(i2));
            hashMap.put("zstd", String.valueOf(i3));
            ofh.l().d(new Log("UT", "19997", "_ut_zstd", "", "", hashMap));
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976294a0", new Object[]{this});
            return;
        }
        nhh.f("", "initZstd zstdDowngradeByClient", Boolean.valueOf(this.b), "zstdDowngradeByServer", Boolean.valueOf(this.f18786a));
        if (!this.b && !this.f18786a) {
            try {
                ZstdStreamDeflater zstdStreamDeflater = new ZstdStreamDeflater();
                this.e = zstdStreamDeflater;
                zstdStreamDeflater.setLevel(7);
                this.c = new ByteArrayOutputStream();
                this.d = new frx(this.c, this.e, true);
            } catch (NoClassDefFoundError unused) {
                this.b = true;
            } catch (Throwable unused2) {
                this.b = true;
            }
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb6fb9e1", new Object[]{this})).booleanValue();
        }
        boolean e = brx.c().e();
        nhh.f("ZstdMgr", "zstdDowngradeByServer", Boolean.valueOf(this.f18786a), "zstdDowngradeByClient", Boolean.valueOf(this.b), "isEnableZstdConfig", Boolean.valueOf(e), "zstdOutputStream", Boolean.valueOf(this.d != null));
        return !this.f18786a && !this.b && e && this.d != null;
    }
}
