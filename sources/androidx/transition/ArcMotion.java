package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ArcMotion extends PathMotion {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float DEFAULT_MAX_ANGLE_DEGREES = 70.0f;
    private static final float DEFAULT_MAX_TANGENT = (float) Math.tan(Math.toRadians(35.0d));
    private static final float DEFAULT_MIN_ANGLE_DEGREES = 0.0f;
    private float mMinimumHorizontalAngle = 0.0f;
    private float mMinimumVerticalAngle = 0.0f;
    private float mMaximumAngle = DEFAULT_MAX_ANGLE_DEGREES;
    private float mMinimumHorizontalTangent = 0.0f;
    private float mMinimumVerticalTangent = 0.0f;
    private float mMaximumTangent = DEFAULT_MAX_TANGENT;

    public ArcMotion() {
    }

    public static /* synthetic */ Object ipc$super(ArcMotion arcMotion, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ArcMotion");
    }

    private static float toTangent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2aa36ff", new Object[]{new Float(f)})).floatValue();
        }
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians(f / 2.0f));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    public float getMaximumAngle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17ed1100", new Object[]{this})).floatValue();
        }
        return this.mMaximumAngle;
    }

    public float getMinimumHorizontalAngle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6cd550e", new Object[]{this})).floatValue();
        }
        return this.mMinimumHorizontalAngle;
    }

    public float getMinimumVerticalAngle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dbeb7fc", new Object[]{this})).floatValue();
        }
        return this.mMinimumVerticalAngle;
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("5709644a", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        }
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        if (f2 <= f4) {
            z = false;
        }
        if (Math.abs(f8) < Math.abs(f9)) {
            float abs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f5 = abs + f4;
                f6 = f3;
            } else {
                f5 = abs + f2;
                f6 = f;
            }
            f7 = this.mMinimumVerticalTangent;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f5 = f2;
                f6 = f14 + f;
            } else {
                f6 = f3 - f14;
                f5 = f4;
            }
            f7 = this.mMinimumHorizontalTangent;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f6;
        float f17 = f12 - f5;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = this.mMaximumTangent;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            if (f18 > f20) {
                f15 = f20;
            } else {
                f15 = 0.0f;
            }
        }
        if (f15 != 0.0f) {
            float sqrt = (float) Math.sqrt(f15 / f18);
            f6 = ((f6 - f11) * sqrt) + f11;
            f5 = f12 + (sqrt * (f5 - f12));
        }
        path.cubicTo((f + f6) / 2.0f, (f2 + f5) / 2.0f, (f6 + f3) / 2.0f, (f5 + f4) / 2.0f, f3, f4);
        return path;
    }

    public void setMaximumAngle(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14b8524", new Object[]{this, new Float(f)});
            return;
        }
        this.mMaximumAngle = f;
        this.mMaximumTangent = toTangent(f);
    }

    public void setMinimumHorizontalAngle(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af5c1d6", new Object[]{this, new Float(f)});
            return;
        }
        this.mMinimumHorizontalAngle = f;
        this.mMinimumHorizontalTangent = toTangent(f);
    }

    public void setMinimumVerticalAngle(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e509a8", new Object[]{this, new Float(f)});
            return;
        }
        this.mMinimumVerticalAngle = f;
        this.mMinimumVerticalTangent = toTangent(f);
    }

    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.ARC_MOTION);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        setMaximumAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, DEFAULT_MAX_ANGLE_DEGREES));
        obtainStyledAttributes.recycle();
    }
}
