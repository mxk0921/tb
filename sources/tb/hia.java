package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f20663a;
    public long b;
    public String c;
    public boolean d;
    public boolean e;
    public int f = 0;
    public boolean g = false;
    public boolean h;

    static {
        t2o.a(295699281);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.e = false;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85578f99", new Object[]{this})).booleanValue();
        }
        if (this.b > 0) {
            return true;
        }
        return false;
    }

    public void c(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2037de53", new Object[]{this, str, new Long(j), str2});
            return;
        }
        this.f20663a = str;
        this.b = j;
        this.c = str2;
        this.d = false;
        this.g = false;
        this.e = true;
        this.h = true;
    }
}
