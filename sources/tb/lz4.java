package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lz4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f23657a = null;
    public AtomicBoolean b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final lz4 f23658a = new lz4();

        static {
            t2o.a(790626318);
        }

        public static /* synthetic */ lz4 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lz4) ipChange.ipc$dispatch("4578ea38", new Object[0]);
            }
            return f23658a;
        }
    }

    static {
        t2o.a(790626317);
    }

    public static lz4 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lz4) ipChange.ipc$dispatch("67841b73", new Object[0]);
        }
        return a.a();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15009e4a", new Object[]{this})).booleanValue();
        }
        return tz4.a(sz4.USE_MD5);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("868a8aa3", new Object[]{this})).booleanValue();
        }
        return tz4.b(sz4.CHECK_BACKGROUND_NOT_INTERRUPT, true);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0818ed1", new Object[]{this})).booleanValue();
        }
        return tz4.b(sz4.CHECK_FLOAT_PERMISSION, true);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76453a55", new Object[]{this})).booleanValue();
        }
        return tz4.b(sz4.CHECK_GP_MARKET, true);
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12c45d7a", new Object[]{this})).longValue();
        }
        return tz4.c(sz4.GLOBAL_POP_INTERVAL_DAY, 3L);
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d100ef2", new Object[]{this})).longValue();
        }
        return tz4.c(sz4.PRE_DOWNLOAD_WINDOW_DAY, 3L);
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1707b3d3", new Object[]{this})).longValue();
        }
        return tz4.c(sz4.UPDATE_DATA_VALID_INTERVAL, 86400L);
    }

    public void m(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457d4e02", new Object[]{this, str, new Boolean(z)});
        } else {
            tz4.f(str, z);
        }
    }

    public void n(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6424fec", new Object[]{this, str, new Long(j)});
        } else {
            tz4.g(str, j);
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec8d2eb9", new Object[]{this})).booleanValue();
        }
        return tz4.b(sz4.GREY_DOWNLOAD_ENABLE, false);
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49ca7b17", new Object[]{this})).booleanValue();
        }
        if (this.f23657a == null) {
            this.f23657a = new AtomicBoolean(tz4.b(sz4.NEW_STRATEGY_ENABLE, true));
        }
        return this.f23657a.get();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8063a52d", new Object[]{this})).booleanValue();
        }
        return tz4.b(sz4.NEW_STRATEGY_FORBID_MTL_POP_ENABLE, true);
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edbcdd1a", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            this.b = new AtomicBoolean(tz4.b(sz4.WIFI_PRE_DOWNLOAD, true));
        }
        return this.b.get();
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f4ec88", new Object[]{this})).booleanValue();
        }
        return tz4.b(sz4.USE_ARCH, true);
    }
}
