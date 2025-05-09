package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class cbz implements pfz<ebz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f16967a;
    public final boolean b;

    static {
        t2o.a(598737129);
        t2o.a(598737401);
    }

    public cbz(float f, boolean z) {
        this.f16967a = f;
        this.b = z;
    }

    /* renamed from: b */
    public ebz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ebz) ipChange.ipc$dispatch("f0d22e73", new Object[]{this});
        }
        return new ebz(this.f16967a, this.b);
    }

    /* renamed from: c */
    public void a(ebz ebzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba05810", new Object[]{this, ebzVar});
            return;
        }
        ckf.g(ebzVar, "node");
        ebzVar.r(this.f16967a);
        ebzVar.q(this.b);
    }

    public boolean equals(Object obj) {
        cbz cbzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof cbz) {
            cbzVar = (cbz) obj;
        } else {
            cbzVar = null;
        }
        if (cbzVar != null && this.f16967a == cbzVar.f16967a && this.b == cbzVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (Float.floatToIntBits(this.f16967a) * 31) + bbz.a(this.b);
    }
}
