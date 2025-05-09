package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAIConfiguration;
import com.tmall.android.dai.compute.DAIComputeService;
import com.tmall.android.dai.internal.config.ConfigServiceImpl;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.ut.device.UTDevice;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static kzo n;

    /* renamed from: a  reason: collision with root package name */
    public Context f23027a;
    public String b;
    public boolean c;
    public int[] d;
    public DAIComputeService h;
    public ConfigServiceImpl i;
    public UserTrackDO j;
    public final Set<Integer> e = new CopyOnWriteArraySet();
    public final Set<String> f = new CopyOnWriteArraySet();
    public final Set<String> g = new CopyOnWriteArraySet();
    public boolean k = false;
    public volatile boolean l = false;
    public volatile boolean m = false;

    static {
        t2o.a(1034944606);
    }

    public static synchronized kzo c() {
        synchronized (kzo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kzo) ipChange.ipc$dispatch("d0ecd094", new Object[0]);
            }
            if (n == null) {
                n = new kzo();
                try {
                    Class.forName("com.taobao.android.mnndebug.workbench.MNNWB");
                } catch (Throwable unused) {
                }
            }
            return n;
        }
    }

    public ConfigServiceImpl a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigServiceImpl) ipChange.ipc$dispatch("d3c5f295", new Object[]{this});
        }
        if (this.i == null) {
            synchronized (this) {
                try {
                    if (this.i == null) {
                        this.i = new ConfigServiceImpl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.i;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = this.f23027a;
        if (context == null) {
            return ewv.a();
        }
        return context;
    }

    public UserTrackDO d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserTrackDO) ipChange.ipc$dispatch("9de268ce", new Object[]{this});
        }
        return this.j;
    }

    public DAIComputeService e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DAIComputeService) ipChange.ipc$dispatch("284fd54f", new Object[]{this});
        }
        if (this.h == null) {
            synchronized (this) {
                try {
                    if (this.h == null) {
                        this.h = new ie4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.h;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91228927", new Object[]{this})).longValue();
        }
        return 0L;
    }

    public Set<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("cee48241", new Object[]{this});
        }
        return this.g;
    }

    public int[] h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("8a202f3a", new Object[]{this});
        }
        if (m()) {
            return this.d;
        }
        return null;
    }

    public Set<Integer> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("14308e08", new Object[]{this});
        }
        if (m()) {
            return this.e;
        }
        return null;
    }

    public String j() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (ld0.c() != null) {
            str = ld0.c().getUtdid();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) && b() != null) {
            try {
                str = UTDevice.getUtdid(b());
            } catch (Exception unused) {
                str = "";
            }
        }
        if (!TextUtils.isEmpty(str)) {
            this.b = str;
        }
        return str;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[]{this});
        }
        return ewv.c(b());
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35a33847", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7735c3ea", new Object[]{this})).booleanValue();
        }
        return true ^ this.c;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aef245", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dbba038", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a602ab9", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void q(DAIConfiguration dAIConfiguration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5826788", new Object[]{this, dAIConfiguration});
        }
    }

    public void r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.f23027a = context;
        }
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1374e42", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        if (z) {
            kgh.e("SdkContext", "DAI已降级。");
        }
    }

    public void t(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28f50b6", new Object[]{this, userTrackDO});
        } else {
            this.j = userTrackDO;
        }
    }

    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a28c7b", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45970e58", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void w(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("279dd053", new Object[]{this, iArr});
        } else if (iArr != null) {
            for (int i : iArr) {
                ((CopyOnWriteArraySet) this.e).add(Integer.valueOf(i));
            }
        }
    }

    public void x(List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e0baea", new Object[]{this, list, list2});
            return;
        }
        if (list != null) {
            ((CopyOnWriteArraySet) this.f).clear();
            ((CopyOnWriteArraySet) this.f).addAll(list);
        }
        if (list2 != null) {
            ((CopyOnWriteArraySet) this.g).clear();
            ((CopyOnWriteArraySet) this.g).addAll(list2);
        }
    }

    public void y(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02c10ec", new Object[]{this, iArr});
        } else {
            this.d = iArr;
        }
    }

    public boolean z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f088765", new Object[]{this, str})).booleanValue();
        }
        if (str == null || !((CopyOnWriteArraySet) this.f).contains(str)) {
            return false;
        }
        return true;
    }
}
