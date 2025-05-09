package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rpg extends sw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int n;
    public boolean o;

    static {
        t2o.a(156237998);
    }

    public rpg() {
        this(0);
    }

    public static /* synthetic */ Object ipc$super(rpg rpgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 417178499) {
            super.h((RecyclerView.State) objArr[0], (VirtualLayoutManager.d) objArr[1], (b) objArr[2]);
            return null;
        } else if (hashCode == 1372393155) {
            return new Integer(super.j(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue(), (b) objArr[3]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/ext/vlayout/layout/LinearLayoutHelper");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f0  */
    @Override // tb.sw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b0(androidx.recyclerview.widget.RecyclerView.Recycler r20, androidx.recyclerview.widget.RecyclerView.State r21, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.f r22, tb.vig r23, com.alibaba.android.ultron.ext.vlayout.b r24) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rpg.b0(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager$f, tb.vig, com.alibaba.android.ultron.ext.vlayout.b):void");
    }

    public void f0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e74dbe", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.n = i;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void h(RecyclerView.State state, VirtualLayoutManager.d dVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18dda383", new Object[]{this, state, dVar, bVar});
            return;
        }
        super.h(state, dVar, bVar);
        this.o = true;
    }

    @Override // tb.z3i, com.alibaba.android.ultron.ext.vlayout.a
    public int j(int i, boolean z, boolean z2, b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51cd0ec3", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), bVar})).intValue();
        }
        if (bVar.getOrientation() == 1) {
            z3 = true;
        }
        if (z) {
            if (i == m() - 1) {
                if (z3) {
                    i4 = this.i;
                    i5 = this.e;
                } else {
                    i4 = this.g;
                    i5 = this.c;
                }
                return i4 + i5;
            }
        } else if (i == 0) {
            if (z3) {
                i2 = -this.h;
                i3 = this.d;
            } else {
                i2 = -this.f;
                i3 = this.b;
            }
            return i2 - i3;
        }
        return super.j(i, z, z2, bVar);
    }

    public rpg(int i) {
        this(i, 0);
    }

    public rpg(int i, int i2) {
        this.n = 0;
        this.o = false;
        z(i2);
        f0(i);
    }
}
