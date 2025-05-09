package tb;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class at extends sw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740619);
    }

    public static /* synthetic */ Object ipc$super(at atVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/vlayouthelper/AbsAURAFillFullLayoutHelper");
    }

    public boolean g0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7a4acaf", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar.getOrientation() == 1) {
            return true;
        }
        return false;
    }

    public void h0(View view, vig vigVar, b bVar, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ea3aa4", new Object[]{this, view, vigVar, bVar, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        if (z) {
            Z(view, i2, i, i4, i3, bVar);
        } else {
            X(view, i2, i, i4, i3, bVar);
        }
        V(vigVar, view);
    }

    public int f0(View[] viewArr, RecyclerView.Recycler recycler, VirtualLayoutManager.f fVar, b bVar) {
        View l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("298cfba", new Object[]{this, viewArr, recycler, fVar, bVar})).intValue();
        }
        if (m() != viewArr.length) {
            ck.g().b("AbsAURAFillFullLayoutHelper", "getAllChildren", "toFill的大小和itemCount不一致");
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < m() && (l = fVar.l(recycler)) != null; i2++) {
            if (l.getLayoutParams() == null) {
                if (g0(bVar)) {
                    l.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                } else {
                    l.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                }
            }
            viewArr[i2] = l;
            i++;
        }
        return i;
    }
}
