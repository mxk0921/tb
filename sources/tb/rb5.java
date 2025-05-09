package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class rb5 implements ea6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public avk f27244a;
    public String[] b;
    public int c;
    public int d;

    static {
        t2o.a(444597619);
        t2o.a(444597640);
    }

    @Override // tb.ba6
    public void a(int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97202a5", new Object[]{this, iArr});
        }
    }

    @Override // tb.ba6
    public int b(DXRefreshLayout dXRefreshLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51f24377", new Object[]{this, dXRefreshLayout, new Boolean(z)})).intValue();
        }
        return 0;
    }

    @Override // tb.ba6
    public void c(DXRefreshLayout dXRefreshLayout, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591e0406", new Object[]{this, dXRefreshLayout, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ba6
    public yc6 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yc6) ipChange.ipc$dispatch("bd643ea8", new Object[]{this});
        }
        return yc6.Translate;
    }

    @Override // tb.ba6
    public void f(DXRefreshLayout.i iVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f00ac779", new Object[]{this, iVar, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ba6
    public void g(DXRefreshLayout dXRefreshLayout, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e919a38", new Object[]{this, dXRefreshLayout, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ba6
    public void h(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14075322", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ba6
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d076a028", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ba6
    public void j(boolean z, float f, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c971f23", new Object[]{this, new Boolean(z), new Float(f), new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbdafdc9", new Object[]{this});
        }
        return n(4);
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c053f0d5", new Object[]{this});
        }
        return n(2);
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da05d5bc", new Object[]{this});
        }
        return n(5);
    }

    public String n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("362007fa", new Object[]{this, new Integer(i)});
        }
        String[] strArr = this.b;
        if (strArr == null) {
            return null;
        }
        return strArr[i];
    }

    public void o(avk avkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63c244a", new Object[]{this, avkVar});
        } else {
            this.f27244a = avkVar;
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476ee2d2", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ac9035", new Object[]{this, str});
        } else {
            u(4, str);
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adfbe541", new Object[]{this, str});
        } else {
            u(2, str);
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6433e9a2", new Object[]{this, str});
        } else {
            u(5, str);
        }
    }

    public void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f307e2", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void u(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5982624", new Object[]{this, new Integer(i), str});
            return;
        }
        if (this.b == null) {
            this.b = new String[6];
        }
        if (i >= 0) {
            String[] strArr = this.b;
            if (i < strArr.length) {
                strArr[i] = str;
            }
        }
    }

    public void v(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253df27", new Object[]{this, strArr});
        } else {
            this.b = strArr;
        }
    }
}
