package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l6h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOAD_FROM_ALREADY_LOADED = "already_loaded";
    public static final String LOAD_FROM_DEFAULT = "default";
    public static final String LOAD_FROM_FALLBACK_SYS_LOAD = "fallback_sys_load";
    public static final String LOAD_FROM_PREFER_SYS_LOAD = "prefer_sys_load";
    public static final String LOAD_FROM_REMOTE_SO_LOAD = "remote_so_load";

    /* renamed from: a  reason: collision with root package name */
    public final String f23136a;
    public String b = null;
    public String c = null;
    public String d = "init";
    public final RSoException e;

    public l6h(String str, RSoException rSoException) {
        this.f23136a = str;
        this.e = rSoException;
    }

    public static l6h a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("73816e89", new Object[]{str, new Integer(i)});
        }
        return new l6h(str, RSoException.error(i));
    }

    public static l6h b(String str, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("f46cc4bb", new Object[]{str, rSoException});
        }
        return new l6h(str, rSoException);
    }

    public static l6h j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("4f8bc15", new Object[]{str});
        }
        return new l6h(str, null);
    }

    public RSoException c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RSoException) ipChange.ipc$dispatch("1c9a7f15", new Object[]{this});
        }
        return this.e;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ff65cbf", new Object[]{this});
        }
        return this.f23136a;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("181793", new Object[]{this});
        }
        return "default";
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ced26c4", new Object[]{this});
        }
        return this.b;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("321246c0", new Object[]{this});
        }
        return this.c;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        return this.d;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f4973be", new Object[]{this})).booleanValue();
        }
        if (this.e == null) {
            return true;
        }
        return false;
    }

    public l6h k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("82020693", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public l6h l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("461446ce", new Object[]{this, str, str2});
        }
        this.b = str;
        this.c = str2;
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LoadResult{libName='" + this.f23136a + "', majorVersion='" + this.b + "', minorVersion='" + this.c + "', from='" + this.d + "', loadFrom='default', exception=" + this.e + '}';
    }
}
