package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PathProperty<T> extends Property<T, Float> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mCurrentFraction;
    private final float mPathLength;
    private final PathMeasure mPathMeasure;
    private final Property<T, PointF> mProperty;
    private final float[] mPosition = new float[2];
    private final PointF mPointF = new PointF();

    public PathProperty(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.mProperty = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.mPathMeasure = pathMeasure;
        this.mPathLength = pathMeasure.getLength();
    }

    public static /* synthetic */ Object ipc$super(PathProperty pathProperty, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/PathProperty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Float f) {
        set2((PathProperty<T>) obj, f);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public Float get(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("3fc5edc2", new Object[]{this, t}) : Float.valueOf(this.mCurrentFraction);
    }

    /* renamed from: set  reason: avoid collision after fix types in other method */
    public void set2(T t, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec976f4", new Object[]{this, t, f});
            return;
        }
        this.mCurrentFraction = f.floatValue();
        this.mPathMeasure.getPosTan(this.mPathLength * f.floatValue(), this.mPosition, null);
        PointF pointF = this.mPointF;
        float[] fArr = this.mPosition;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.mProperty.set(t, pointF);
    }
}
