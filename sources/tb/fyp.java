package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fyp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19634a;
    public final byp b;

    static {
        t2o.a(511705476);
    }

    public fyp() {
        byp bypVar;
        if (trt.a()) {
            bypVar = new byp();
        } else {
            bypVar = null;
        }
        this.b = bypVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        byp bypVar = this.b;
        if (bypVar != null) {
            bypVar.close();
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8fb67b0", new Object[]{this, str});
        } else if (this.b != null) {
            if (!TextUtils.isEmpty(str)) {
                this.b.x1(str);
                this.b.u1(true);
                this.b.N0(true);
                this.b.M0(true);
                this.b.u0(0);
            } else {
                this.b.p1();
            }
            this.f19634a = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1425412b", new Object[]{this, str});
        } else if (!TextUtils.equals(str, this.f19634a)) {
            b(str);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.b != null) {
            b(this.f19634a);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        byp bypVar = this.b;
        if (bypVar != null) {
            bypVar.p1();
        }
    }
}
