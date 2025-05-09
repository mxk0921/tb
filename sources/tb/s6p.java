package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s6p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f27827a;
    public byte[] b;
    public byte[] c;
    public byte[] d;

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fb5a3a9", new Object[]{this});
        }
        return this.d;
    }

    public byte[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3254434d", new Object[]{this});
        }
        return this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7439b22d", new Object[]{this})).intValue();
        }
        return this.f27827a;
    }

    public byte[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("489e7ad9", new Object[]{this});
        }
        return this.c;
    }

    public void e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1debc4ef", new Object[]{this, bArr});
        } else {
            this.d = bArr;
        }
    }

    public void f(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac0d8b5", new Object[]{this, bArr});
        }
    }

    public void g(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e040e863", new Object[]{this, bArr});
        } else {
            this.b = bArr;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d3a17d", new Object[]{this, new Integer(i)});
        } else {
            this.f27827a = i;
        }
    }

    public void i(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933da257", new Object[]{this, bArr});
        } else {
            this.c = bArr;
        }
    }
}
