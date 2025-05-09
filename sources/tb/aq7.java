package tb;

import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class aq7 implements jn2<eq7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f15932a;
    public boolean b;
    public eq7 c;

    static {
        t2o.a(620757017);
        t2o.a(620757013);
    }

    public aq7() {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        this.f15932a = sparseIntArray;
        sparseIntArray.put(17, 83886080);
        sparseIntArray.put(34, 10485760);
        sparseIntArray.put(51, 31457280);
        sparseIntArray.put(68, 10485760);
        sparseIntArray.put(85, 20971520);
        sparseIntArray.put(102, 10485760);
    }

    public aq7 b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aq7) ipChange.ipc$dispatch("dd1153c3", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        fpm.e(true ^ this.b, "DiskCacheBuilder has been built, not allow maxSize() now");
        this.f15932a.put(i, i2);
        return this;
    }

    public aq7 c(eq7 eq7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aq7) ipChange.ipc$dispatch("f4a390ab", new Object[]{this, eq7Var});
        }
        fpm.e(true ^ this.b, "DiskCacheBuilder has been built, not allow with() now");
        this.c = eq7Var;
        return this;
    }

    public synchronized eq7 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eq7) ipChange.ipc$dispatch("840658f8", new Object[]{this});
        } else if (this.b) {
            return this.c;
        } else {
            if (this.c == null) {
                this.c = new b6k();
                fiv.k("DiskCache", "use default non-operation DiskCacheSupplier, cause not implement a custom DiskCacheSupplier", new Object[0]);
            }
            this.b = true;
            fpm.d(this.c.get(17), "DiskCache for the priority(TOP_USED_1) cannot be null");
            for (zp7 zp7Var : this.c.getAll()) {
                zp7Var.c(this.f15932a.get(zp7Var.getPriority(), 0));
            }
            return this.c;
        }
    }
}
