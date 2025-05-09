package tb;

import android.text.TextUtils;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dpe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int[] m = {10, 30, 60, 100, 200, 300, 500, 800, 1100, 1500};

    /* renamed from: a  reason: collision with root package name */
    public final rs2 f17998a;
    public final uuo b;
    public final String c;
    public int d;
    public int e;
    public String f;
    public String g;
    public String h;
    public final int i;
    public final int j;
    public boolean k = false;
    public String l;

    static {
        t2o.a(620757141);
    }

    public dpe(String str, rs2 rs2Var) {
        this.j = 0;
        this.f17998a = rs2Var;
        this.c = str;
        if (str == null) {
            this.b = new uuo(1);
            return;
        }
        uuo d = uuo.d(str);
        this.b = d;
        if (d.c() && d.h) {
            this.i = q0q.f(d.e, d.f);
            this.j = d.e;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53da4561", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (this.l == null) {
                this.l = str;
                return;
            }
            this.l += str;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94a65bba", new Object[]{this})).booleanValue();
        }
        return this.b.h;
    }

    public final int c(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2fd12568", new Object[]{this, new Integer(i)})).intValue();
        }
        int length = m.length;
        int i3 = length / 2;
        char c = 65535;
        while (i3 >= 0 && i3 < length) {
            int i4 = m[i3];
            if (i > i4) {
                if (c >= 0) {
                    if (c == 2) {
                        break;
                    }
                } else {
                    c = 1;
                }
                i3++;
            } else if (i >= i4) {
                break;
            } else {
                if (c >= 0) {
                    if (c == 1) {
                        break;
                    }
                } else {
                    c = 2;
                }
                i3--;
            }
        }
        if (i3 >= 0) {
            if (i3 >= length) {
                i2 = length - 1;
            } else {
                if (c == 1) {
                    int[] iArr = m;
                    if (i <= (iArr[i3 - 1] + iArr[i3]) / 2) {
                        i2 = i3 - 1;
                    }
                }
                if (c == 2) {
                    int[] iArr2 = m;
                    int i5 = 1 + i3;
                    if (i > (iArr2[i3] + iArr2[i5]) / 2) {
                        i2 = i5;
                    }
                }
                i2 = i3;
            }
        }
        return m[i2];
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f3166d7", new Object[]{this})).intValue();
        }
        return this.b.g;
    }

    public rs2 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rs2) ipChange.ipc$dispatch("8892cadb", new Object[]{this});
        }
        return this.f17998a;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c22f764", new Object[]{this})).intValue();
        }
        rs2 rs2Var = this.f17998a;
        if (rs2Var != null) {
            return rs2Var.a(this.c, this.i);
        }
        return this.i;
    }

    public String g() {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8882f649", new Object[]{this});
        }
        if (this.h == null) {
            String str = this.b.b;
            if (str != null) {
                sb = new StringBuilder(str);
            } else {
                sb = new StringBuilder();
            }
            if (d() > 0) {
                sb.append(TplMsg.VALUE_T_NATIVE_RETURN);
                sb.append(d());
            }
            sb.append(this.b.d);
            String sb2 = sb.toString();
            this.h = sb2;
            rs2 rs2Var = this.f17998a;
            if (rs2Var != null) {
                this.h = rs2Var.b(this.c, sb2);
            }
        }
        return this.h;
    }

    public String h() {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18ccf927", new Object[]{this});
        }
        if (this.g == null) {
            String str = this.b.c;
            if (str != null) {
                sb = new StringBuilder(str);
            } else {
                sb = new StringBuilder();
            }
            this.g = sb.toString();
        }
        return this.g;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.b.f;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c182d1f", new Object[]{this});
        }
        return this.b.d;
    }

    public String k() {
        StringBuilder sb;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d3506e5", new Object[]{this});
        }
        if (this.f == null) {
            String str = this.b.b;
            if (str != null) {
                sb = new StringBuilder(str);
            } else {
                sb = new StringBuilder();
            }
            if (d() > 0) {
                sb.append(TplMsg.VALUE_T_NATIVE_RETURN);
                sb.append(d());
            }
            if (this.k || !s0m.B().J()) {
                sb.append(q0q.f(c(this.d), c(this.e)));
                int i2 = this.i;
                if (i2 != 0) {
                    sb.append(i2);
                }
            } else {
                int i3 = this.i;
                if (i3 != 0 || ((i = this.d) == 0 && this.e == 0)) {
                    sb.append(i3);
                } else {
                    sb.append(q0q.f(c(i), c(this.e)));
                }
            }
            String sb2 = sb.toString();
            this.f = sb2;
            rs2 rs2Var = this.f17998a;
            if (rs2Var != null) {
                this.f = rs2Var.c(this.c, sb2);
            }
            if (!(this.f == null || this.l == null)) {
                this.f += this.l;
            }
        }
        return this.f;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        return this.c;
    }

    public uuo m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uuo) ipChange.ipc$dispatch("ead7a856", new Object[]{this});
        }
        return this.b;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81af3836", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.b.e;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d17d9f7", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.l)) {
            if (TextUtils.isEmpty(this.c)) {
                return false;
            }
            if (this.c.indexOf("#") <= 0 && this.c.indexOf("?") <= 0) {
                return false;
            }
        }
        return true;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72e54056", new Object[]{this})).booleanValue();
        }
        return this.b.a();
    }

    public void r(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6bc8d2f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d = i;
        this.e = i2;
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7454287", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "path: " + this.c + "\nscheme info: " + this.b + "\nbase cache catalog: " + f() + "\nmemory cache key: " + k() + "\ndisk cache key: " + g() + "\ndisk cache catalog: " + f();
    }
}
