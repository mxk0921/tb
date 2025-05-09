package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wd8 extends ud8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXACT_SIZE_LEVEL = 1;
    public static final int LARGE_SIZE_LEVEL = 4;
    public static final int SMALL_SIZE_LEVEL = 2;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final String m;
    public int n;
    public int o;
    public boolean p;
    public bui q;
    public boolean r;

    static {
        t2o.a(620757087);
    }

    public wd8(ud8 ud8Var, String str, int i, boolean z, String str2) {
        this(ud8Var, str, i, z, str2, false);
    }

    public static bui h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bui) ipChange.ipc$dispatch("e7833446", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.indexOf(46) == 0) {
            str = str.substring(1);
        }
        try {
            for (bui buiVar : z37.ALL_EXTENSION_TYPES) {
                if (buiVar != null && buiVar.e(str)) {
                    return buiVar;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(wd8 wd8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/entity/EncodedImage");
    }

    public wd8 d(ud8 ud8Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wd8) ipChange.ipc$dispatch("4a46b4f3", new Object[]{this, ud8Var, new Integer(i)});
        }
        return e(ud8Var, i, this.j);
    }

    public wd8 e(ud8 ud8Var, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wd8) ipChange.ipc$dispatch("331e6109", new Object[]{this, ud8Var, new Integer(i), new Boolean(z)});
        }
        wd8 wd8Var = new wd8(ud8Var, this.i, i, this.k, this.m, z);
        wd8Var.n = this.n;
        wd8Var.o = this.o;
        wd8Var.p = this.p;
        return wd8Var;
    }

    public wd8 f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wd8) ipChange.ipc$dispatch("a1ee6efb", new Object[]{this, new Boolean(z)});
        }
        this.r = z;
        return this;
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            b(false);
            super.finalize();
        } catch (Throwable unused) {
        }
    }

    public bui g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bui) ipChange.ipc$dispatch("62dc8b3c", new Object[]{this});
        }
        if (this.q == null) {
            this.q = h(this.m);
        }
        return this.q;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("719d7704", new Object[]{this})).booleanValue();
        }
        if (this.r || this.f28582a != 1 || ((this.k && !this.j) || !this.g || this.c == null)) {
            return true;
        }
        return false;
    }

    public void j(bui buiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a2570a", new Object[]{this, buiVar});
        } else {
            this.q = buiVar;
        }
    }

    public wd8(ud8 ud8Var, String str, int i, boolean z, String str2, boolean z2) {
        super(ud8Var == null ? new ud8(false, null, 0, 0) : ud8Var);
        this.i = str;
        this.l = i;
        this.k = z;
        this.m = str2;
        this.j = z2;
    }
}
