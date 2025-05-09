package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g15 extends cy1<g15> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String g;
    public boolean h;
    public Map<String, String> i;
    public Map<String, String> j;
    public int k = -1;
    public boolean l = false;

    static {
        t2o.a(794820626);
    }

    public g15(String str, String str2, String str3, String str4) {
        super(str, str3, str4);
        this.g = str2;
    }

    public static /* synthetic */ Object ipc$super(g15 g15Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/common/kit/tracker/model/CustomModel");
    }

    public static g15 l(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g15) ipChange.ipc$dispatch("3cdc1760", new Object[]{str, str2, str3, str4});
        }
        return new g15(str, str2, str3, str4);
    }

    public g15 j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g15) ipChange.ipc$dispatch("2742886f", new Object[]{this, new Integer(i)});
        }
        this.k = i;
        return this;
    }

    public g15 k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g15) ipChange.ipc$dispatch("6bd3d672", new Object[]{this, new Boolean(z)});
        }
        this.l = z;
        return this;
    }

    public g15 m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g15) ipChange.ipc$dispatch("848c3fb6", new Object[]{this, str, str2});
        }
        if (!(str == null || str2 == null)) {
            if (this.i == null) {
                this.i = new HashMap();
            }
            this.i.put(str, str2);
        }
        return this;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ed5c112", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.g;
    }

    public Map<String, String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ae114b7f", new Object[]{this});
        }
        return this.i;
    }

    public Map<String, String> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db918036", new Object[]{this});
        }
        return this.j;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return null;
    }

    public g15 s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g15) ipChange.ipc$dispatch("dad4fa9f", new Object[]{this, str, str2});
        }
        if (!(str == null || str2 == null)) {
            if (this.j == null) {
                this.j = new HashMap();
            }
            this.j.put(str, str2);
        }
        return this;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("496a5f1", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public g15 v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g15) ipChange.ipc$dispatch("e951b24d", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public g15 w(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g15) ipChange.ipc$dispatch("93e85407", new Object[]{this, new Float(f)});
        }
        this.b = f;
        return this;
    }

    public g15 x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g15) ipChange.ipc$dispatch("5168d67f", new Object[]{this, new Boolean(z)});
        }
        this.h = z;
        return this;
    }
}
