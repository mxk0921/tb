package tb;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.e;
import com.taobao.tao.flexbox.layoutmanager.core.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wy0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_VALUE = -1;
    public PointF c;
    public PointF d;
    public zdu i;

    /* renamed from: a  reason: collision with root package name */
    public int f31007a = -1;
    public int b = -1;
    public float e = -1.0f;
    public int f = 1;
    public int g = -1;
    public int h = -1;

    static {
        t2o.a(503316622);
    }

    public static wy0 a(n nVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wy0) ipChange.ipc$dispatch("5161e9be", new Object[]{nVar});
        }
        View w0 = nVar.w0();
        if (w0 == null) {
            return null;
        }
        wy0 wy0Var = new wy0();
        wy0Var.f31007a = w0.getWidth();
        wy0Var.b = w0.getHeight();
        wy0Var.e = w0.getAlpha();
        if (nVar.K() instanceof e) {
            ViewGroup viewGroup = (ViewGroup) w0;
            if (viewGroup.getChildCount() > 0) {
                i = viewGroup.getChildAt(0).getPaddingLeft();
            }
        } else {
            i = w0.getPaddingLeft();
        }
        wy0Var.h = i;
        w0.getPaddingRight();
        w0.getPaddingTop();
        w0.getPaddingBottom();
        zdu zduVar = new zdu();
        wy0Var.i = zduVar;
        zduVar.c = w0.getRotation();
        wy0Var.i.f32699a = w0.getRotationX();
        wy0Var.i.b = w0.getRotationY();
        wy0Var.i.e = new PointF();
        wy0Var.i.e.x = w0.getTranslationX();
        wy0Var.i.e.y = w0.getTranslationY();
        wy0Var.i.d = new PointF();
        wy0Var.i.d.x = w0.getScaleX();
        wy0Var.i.d.y = w0.getScaleY();
        wy0Var.f = ifs.n(w0);
        wy0Var.g = (int) mfs.o(w0);
        return wy0Var;
    }
}
