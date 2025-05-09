package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rbi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f27261a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;

    static {
        t2o.a(503317090);
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e04c29", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (!(this.f == i && this.g == i2 && this.h == i3 && this.i == i4)) {
            this.f27261a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
        if (akt.G()) {
            this.f27261a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rbi)) {
            return false;
        }
        rbi rbiVar = (rbi) obj;
        if (this.f27261a == rbiVar.f27261a && this.b == rbiVar.b && this.c == rbiVar.c && this.d == rbiVar.d && this.e == rbiVar.e) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "[width = " + this.f27261a + ",height=" + this.b + ",x=" + this.c + ",y=" + this.d + "]";
    }
}
