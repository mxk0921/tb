package tb;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class n92 implements TypeEvaluator<PointF> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PointF f24579a;
    public PointF b;

    static {
        t2o.a(806355848);
    }

    public n92(PointF pointF) {
        this.f24579a = pointF;
    }

    /* renamed from: a */
    public PointF evaluate(float f, PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("3d57b937", new Object[]{this, new Float(f), pointF, pointF2});
        }
        float f2 = 1.0f - f;
        if (this.b == null) {
            this.b = new PointF();
        }
        PointF pointF3 = this.b;
        float f3 = f2 * f2;
        float f4 = f2 * 2.0f * f;
        PointF pointF4 = this.f24579a;
        float f5 = f * f;
        pointF3.x = (pointF.x * f3) + (pointF4.x * f4) + (pointF2.x * f5);
        pointF3.y = (f3 * pointF.y) + (f4 * pointF4.y) + (f5 * pointF2.y);
        return pointF3;
    }
}
