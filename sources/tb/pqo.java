package tb;

import android.text.TextUtils;
import com.alibaba.wireless.security.middletierplugin.open.fc.C0139;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ta.utdid2.device.UTDevice;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pqo implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f26241a = 0;

    static {
        t2o.a(962592883);
        t2o.a(962592825);
    }

    public pqo() {
        c(x2r.f().e("sample_ipv6"));
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
        } else {
            c(str2);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ed9cd9", new Object[]{this})).booleanValue();
        }
        String utdid = UTDevice.getUtdid(o2w.k().g());
        if (utdid == null || utdid.equals(Constants.UTDID_INVALID)) {
            return false;
        }
        int abs = Math.abs(hsq.d(utdid));
        nhh.f("SampleIpv6Listener", "hashcode", Integer.valueOf(abs), C0139.f207, Integer.valueOf(this.f26241a));
        return abs % 10000 < this.f26241a;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
            return;
        }
        nhh.f("SampleIpv6Listener", "parseConfig value", str);
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f26241a = Integer.parseInt(str);
            } catch (Exception unused) {
                this.f26241a = 0;
            }
        }
    }
}
