package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b79 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16226a;
    public final String b;
    public String c = null;
    public String d = null;
    public String e = "init";
    public final RSoException f;

    public b79(String str, String str2, RSoException rSoException) {
        this.f16226a = str;
        this.b = str2;
        this.f = rSoException;
    }

    public static b79 a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("15aa3759", new Object[]{str, new Integer(i)});
        }
        return new b79(str, null, RSoException.error(i));
    }

    public static b79 b(String str, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("918c90b", new Object[]{str, rSoException});
        }
        return new b79(str, null, rSoException);
    }

    public static b79 j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("edd61daf", new Object[]{str, str2});
        }
        return new b79(str, str2, null);
    }

    public RSoException c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RSoException) ipChange.ipc$dispatch("1c9a7f15", new Object[]{this});
        }
        return this.f;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1702316", new Object[]{this});
        }
        return this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ff65cbf", new Object[]{this});
        }
        return this.f16226a;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ced26c4", new Object[]{this});
        }
        return this.c;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("321246c0", new Object[]{this});
        }
        return this.d;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        return this.e;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caacd13e", new Object[]{this})).booleanValue();
        }
        String str = this.b;
        if (str == null || str.length() <= 0 || this.f != null) {
            return false;
        }
        return true;
    }

    public b79 k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("8664f4e3", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public b79 l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("8ee8125e", new Object[]{this, str, str2});
        }
        this.c = str;
        this.d = str2;
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FetchResult{libName='" + this.f16226a + "', libFullPath='" + this.b + "', majorVersion='" + this.c + "', minorVersion='" + this.d + "', from='" + this.e + "', exception=" + this.f + '}';
    }
}
