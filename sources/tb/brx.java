package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ut.device.UTDevice;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class brx implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static brx e;

    /* renamed from: a  reason: collision with root package name */
    public final int f16584a;
    public int b;
    public int c;
    public int d;

    static {
        t2o.a(962592969);
        t2o.a(962592825);
    }

    public brx() {
        this.f16584a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        String utdid = UTDevice.getUtdid(o2w.k().g());
        if (utdid == null || utdid.equals(Constants.UTDID_INVALID)) {
            this.f16584a = 0;
        } else {
            this.f16584a = Math.abs(hsq.d(utdid)) % 10000;
        }
        nhh.f("SampleSipListener", "zstdRandomNumber", Integer.valueOf(this.f16584a));
        this.b = b(x2r.f().e("zstd"), 0);
        this.c = b(x2r.f().e("ut_sample_zstd"), 0);
        this.d = b(x2r.f().e("ut_options_len"), 0);
        x2r.f().i("zstd", this);
        x2r.f().i("ut_sample_zstd", this);
        x2r.f().i("ut_options_len", this);
    }

    public static synchronized brx c() {
        synchronized (brx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (brx) ipChange.ipc$dispatch("ccdb7e06", new Object[0]);
            }
            if (e == null) {
                e = new brx();
            }
            return e;
        }
    }

    public final int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efd7a04c", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44231de2", new Object[]{this})).booleanValue();
        }
        if (this.f16584a < this.d) {
            return true;
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce294099", new Object[]{this})).booleanValue();
        }
        if (this.f16584a < this.c) {
            return true;
        }
        return false;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb6fb9e1", new Object[]{this})).booleanValue();
        }
        nhh.f("", "zstdRandomNumber", Integer.valueOf(this.f16584a), "zstdSample", Integer.valueOf(this.b));
        return this.f16584a < this.b;
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
            return;
        }
        nhh.f("TnetSipHostPortMgr", "key", str, "value", str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if ("zstd".equalsIgnoreCase(str)) {
                this.b = b(x2r.f().e("zstd"), 0);
            }
            if ("ut_sample_zstd".equalsIgnoreCase(str)) {
                this.c = b(x2r.f().e("ut_sample_zstd"), 0);
            }
            if ("ut_options_len".equalsIgnoreCase(str)) {
                this.d = b(x2r.f().e("ut_options_len"), 0);
            }
        }
    }
}
