package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zv3 implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f33036a = false;

    static {
        t2o.a(962592879);
        t2o.a(962592825);
    }

    public zv3() {
        c(x2r.f().e("close_detect_ipv6"));
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
            return ((Boolean) ipChange.ipc$dispatch("d8cfb73c", new Object[]{this})).booleanValue();
        }
        return this.f33036a;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
            return;
        }
        nhh.f("CloseDetectIpv6Listener", "parseConfig value", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ("1".equalsIgnoreCase(str)) {
            this.f33036a = true;
        } else {
            this.f33036a = false;
        }
    }
}
