package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.sync.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ut.device.UTDevice;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rqo implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static rqo h;

    /* renamed from: a  reason: collision with root package name */
    public int f27559a = 3;
    public int b = 0;
    public int c = 0;
    public int d = 10000;
    public int e = 2;
    public int f = 2;
    public int g = 2;

    static {
        t2o.a(962592922);
        t2o.a(962592825);
    }

    public static synchronized rqo e() {
        synchronized (rqo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rqo) ipChange.ipc$dispatch("dbc9e16a", new Object[0]);
            }
            if (h == null) {
                h = new rqo();
            }
            return h;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d786ce12", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("752b0ce3", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public final int d(String str, int i) {
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

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3442d47", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29202d13", new Object[]{this})).booleanValue();
        }
        if (this.d < this.c) {
            return true;
        }
        return false;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d99e57fe", new Object[]{this})).booleanValue();
        }
        if (this.d < this.b) {
            return true;
        }
        return false;
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e77d7", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            this.b = 0;
            this.c = 0;
        } else {
            String[] split = str.split("_");
            if (split.length < 2) {
                this.b = 0;
                this.c = 0;
                return;
            }
            this.b = d(split[0], 0);
            this.c = d(split[1], 0);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        String utdid = UTDevice.getUtdid(o2w.k().g());
        if (utdid == null || utdid.equals(Constants.UTDID_INVALID)) {
            this.d = 0;
        } else {
            this.d = Math.abs(hsq.d(utdid)) % 10000;
        }
        nhh.f("SampleSipListener", "sipRandomNumber", Integer.valueOf(this.d));
        j(x2r.f().e("amdc_sip_sample"));
        this.e = d(x2r.f().e("sip_fail_count"), 2);
        this.f = d(x2r.f().e("amdc_sip_fail_count"), 2);
        this.g = d(x2r.f().e("amdc_sip_fail_count_all"), 2);
        this.f27559a = d(x2r.f().e("upload_count"), 3);
        b.i().e(this.f27559a);
        x2r.f().i("amdc_sip_sample", this);
        x2r.f().i("sip_fail_count", this);
        x2r.f().i("amdc_sip_fail_count", this);
        x2r.f().i("amdc_sip_fail_count_all", this);
        x2r.f().i("upload_count", this);
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
            if ("amdc_sip_sample".equalsIgnoreCase(str)) {
                j(str2);
            }
            if ("sip_fail_count".equalsIgnoreCase(str)) {
                this.e = d(str2, 2);
            }
            if ("amdc_sip_fail_count".equalsIgnoreCase(str)) {
                this.f = d(str2, 2);
            }
            if ("amdc_sip_fail_count_all".equalsIgnoreCase(str)) {
                this.g = d(str2, 2);
            }
            if ("upload_count".equalsIgnoreCase(str)) {
                this.f27559a = d(str2, 3);
                b.i().e(this.f27559a);
            }
        }
    }
}
