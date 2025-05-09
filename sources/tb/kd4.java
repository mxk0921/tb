package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class kd4 implements pr7, qr7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<pr7> f22582a;
    public volatile boolean b;

    static {
        t2o.a(377487421);
        t2o.a(377487426);
        t2o.a(377487427);
    }

    @Override // tb.qr7
    public boolean a(pr7 pr7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8932c86", new Object[]{this, pr7Var})).booleanValue();
        }
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                HashSet<pr7> hashSet = this.f22582a;
                if (hashSet != null && hashSet.remove(pr7Var)) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b(pr7 pr7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cef0c57c", new Object[]{this, pr7Var})).booleanValue();
        }
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        HashSet<pr7> hashSet = this.f22582a;
                        if (hashSet == null) {
                            hashSet = new HashSet<>();
                            this.f22582a = hashSet;
                        }
                        hashSet.add(pr7Var);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        pr7Var.dispose();
        return false;
    }

    public void c(HashSet<pr7> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c4407", new Object[]{this, hashSet});
        } else if (hashSet != null) {
            Iterator<pr7> it = hashSet.iterator();
            while (it.hasNext()) {
                pr7 next = it.next();
                if (next instanceof pr7) {
                    try {
                        next.dispose();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // tb.pr7
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        this.b = true;
                        HashSet<pr7> hashSet = this.f22582a;
                        this.f22582a = null;
                        c(hashSet);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
