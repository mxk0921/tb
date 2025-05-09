package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ygv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Integer f32081a;
    public byte[] b;

    static {
        t2o.a(839909922);
    }

    public final byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e8f891d0", new Object[]{this});
        }
        return this.b;
    }

    public final Integer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("63d51765", new Object[]{this});
        }
        return this.f32081a;
    }

    public final void c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe266a40", new Object[]{this, bArr});
        } else {
            this.b = bArr;
        }
    }

    public final void d(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d16816d", new Object[]{this, num});
        } else {
            this.f32081a = num;
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12364fd1", new Object[]{this, new Boolean(z)});
        }
    }
}
