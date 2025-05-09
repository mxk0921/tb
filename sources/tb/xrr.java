package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xrr extends zrr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean c;

    static {
        t2o.a(824180744);
        try {
            IpChange ipChange = bzn.$ipChange;
            c = true;
        } catch (ClassNotFoundException unused) {
            c = false;
        }
    }

    public static /* synthetic */ Object ipc$super(xrr xrrVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1537573029) {
            return super.b((String) objArr[0]);
        }
        if (hashCode == 1547291546) {
            return super.loadLibrary((String) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tbuprofen/adapter/TBPRemoteSoLoader");
    }

    @Override // tb.zrr, tb.xjc
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c8678b2", new Object[]{this})).booleanValue();
        }
        return c;
    }

    @Override // tb.zrr, tb.xjc
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ba580a5", new Object[]{this, str});
        }
        if (!c) {
            return super.b(str);
        }
        b79 d = bzn.b().d(str);
        if (!d.i()) {
            return "";
        }
        urr.a("TBPRemoteSoLoader", "Fetch library %s by remoteso", str);
        return d.d();
    }

    @Override // tb.zrr, tb.xjc
    public String loadLibrary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c39cb9a", new Object[]{this, str});
        }
        if (!c) {
            return super.loadLibrary(str);
        }
        if (!bzn.d().load(str).i()) {
            return "Can't find the library.";
        }
        urr.a("TBPRemoteSoLoader", "Load library %s by remoteso", str);
        return null;
    }
}
