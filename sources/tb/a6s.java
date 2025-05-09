package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a6s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Integer encryptionType = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f15572a;
    public String b;
    public String c;
    public String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final a6s f15573a = new a6s();

        static {
            t2o.a(856686603);
        }

        public static /* synthetic */ a6s a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a6s) ipChange.ipc$dispatch("3d354abe", new Object[0]);
            }
            return f15573a;
        }
    }

    static {
        t2o.a(856686601);
    }

    public static synchronized a6s a() {
        synchronized (a6s.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a6s) ipChange.ipc$dispatch("9b9cc218", new Object[0]);
            }
            return b.a();
        }
    }

    public String b(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de961546", new Object[]{this, str});
        }
        if (this.c == null) {
            this.c = wp1.k(man.a(str.getBytes(), d()));
        }
        String str2 = this.c;
        if (str2 != null) {
            return str2;
        }
        Log.e(this.f15572a, " rc4 Encrypt secret obtain failure ");
        return null;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df19775c", new Object[]{this});
        }
        if (this.d == null) {
            this.d = loh.a(d().getBytes());
        }
        return this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c78081bf", new Object[]{this});
        }
        String str = this.b;
        if (str == null) {
            return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC1cueeBrz4VMOr09PxnO7ILYh6jDhcZwEUgzjPfwy2apBZIHAfGagR8LzN35O0UhvoeN570mJP4g0nLm2KL1H/K1NGYqT254w0sdV51kzO/yu+WcfgPkPLosnR1kVaPqiYKT2Bl1Yi85ZJwApO2y8lPmFwpIrMmKiTYqR2Gmd9nQIDAQAB";
        }
        return str;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add67b29", new Object[]{this, str});
        } else if (str != null) {
            this.b = str;
        }
    }

    public a6s() {
        this.f15572a = "TLogProtocol";
        this.b = null;
    }
}
