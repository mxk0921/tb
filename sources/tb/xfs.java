package tb;

import android.graphics.PointF;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xfs extends ofs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final PointF g;

    static {
        t2o.a(503316649);
    }

    public xfs(PointF pointF) {
        this.g = pointF;
    }

    public static /* synthetic */ Object ipc$super(xfs xfsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/TNodeAnimator/TNodePivotAnimator");
    }

    public static xfs o(PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xfs) ipChange.ipc$dispatch("c3d7854a", new Object[]{pointF});
        }
        return new xfs(pointF);
    }

    @Override // tb.wwd
    public int getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e16722de", new Object[]{this})).intValue();
        }
        return 25;
    }

    @Override // tb.ofs
    public float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("954cf076", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    @Override // tb.ofs
    public void k(n nVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f627f6f", new Object[]{this, nVar, view, new Float(f)});
        } else {
            gz0.a(view);
        }
    }

    @Override // tb.ofs
    public void l(n nVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7398e", new Object[]{this, nVar, view, new Float(f)});
        } else {
            gz0.a(view);
        }
    }

    @Override // tb.ofs
    public void m(n nVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b051e7", new Object[]{this, nVar, view, new Float(f)});
        } else if (view != null) {
            PointF pointF = this.g;
            if (pointF == null) {
                gz0.a(view);
                return;
            }
            view.setPivotX(pointF.x);
            view.setPivotY(this.g.y);
        }
    }

    @Override // tb.ofs
    public void n(n nVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59349600", new Object[]{this, nVar, view, new Float(f)});
        }
    }
}
