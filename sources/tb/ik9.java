package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ik9 extends ck9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;

    static {
        t2o.a(156237988);
    }

    public static /* synthetic */ int g0(ik9 ik9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8327ea7c", new Object[]{ik9Var})).intValue();
        }
        throw null;
    }

    public static /* synthetic */ Object ipc$super(ik9 ik9Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -379145078:
                b bVar = (b) objArr[0];
                throw null;
            case 312774690:
                ((Number) objArr[0]).intValue();
                throw null;
            case 1442388153:
                RecyclerView.Recycler recycler = (RecyclerView.Recycler) objArr[0];
                RecyclerView.State state = (RecyclerView.State) objArr[1];
                b bVar2 = (b) objArr[2];
                throw null;
            case 1566030385:
                RecyclerView.Recycler recycler2 = (RecyclerView.Recycler) objArr[0];
                RecyclerView.State state2 = (RecyclerView.State) objArr[1];
                ((Number) objArr[2]).intValue();
                ((Number) objArr[3]).intValue();
                ((Number) objArr[4]).intValue();
                b bVar3 = (b) objArr[5];
                throw null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/layout/FixLayoutHelper");
        }
    }
}
