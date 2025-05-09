package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jt0 implements eq7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int[] b;
    public static final String[] c = {"top1", "top2", "top3", "top4", "top5", "top6"};
    public static final int d;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, zp7> f22193a = new HashMap();

    public final synchronized zp7 a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zp7) ipChange.ipc$dispatch("8e3ab50b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        it0 it0Var = (it0) ((HashMap) this.f22193a).get(Integer.valueOf(i));
        if (it0Var == null) {
            it0Var = new it0(i, c[i2]);
            ((HashMap) this.f22193a).put(Integer.valueOf(i), it0Var);
        }
        return it0Var;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e8f93d", new Object[]{this});
            return;
        }
        try {
            if (!dp.h().j()) {
                dp.h().c((Application) s0m.B().b());
            }
        } catch (Throwable th) {
            fiv.c("DiskCache", "alivfs inited error=%s", th);
        }
    }

    /* renamed from: c */
    public synchronized it0 get(int i) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (it0) ipChange.ipc$dispatch("468d400", new Object[]{this, new Integer(i)});
            }
            for (int i2 = 0; i2 < d; i2++) {
                if (b[i2] == i) {
                    return (it0) a(i, i2);
                }
            }
            return null;
        }
    }

    @Override // tb.eq7
    public synchronized Collection<zp7> getAll() {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Collection) ipChange.ipc$dispatch("d4057695", new Object[]{this});
            }
            for (int i = 0; i < d; i++) {
                a(b[i], i);
            }
            return ((HashMap) this.f22193a).values();
        }
    }

    static {
        int[] iArr = {17, 34, 51, 68, 85, 102};
        b = iArr;
        d = iArr.length;
    }
}
