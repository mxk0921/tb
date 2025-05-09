package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class iij implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f21329a;
    public int b;
    public int c;
    public int d;
    public int e = -1;

    static {
        t2o.a(81789352);
    }

    /* renamed from: a */
    public iij clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iij) ipChange.ipc$dispatch("f5b0addd", new Object[]{this});
        }
        iij iijVar = new iij();
        iijVar.f21329a = this.f21329a;
        iijVar.b = this.b;
        iijVar.c = this.c;
        iijVar.d = this.d;
        iijVar.e = this.e;
        return iijVar;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f2a18e9", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2087f1c5", new Object[]{this})).intValue();
        }
        return this.f21329a;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ddec852", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ee5420b", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b9dbf7", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }
}
