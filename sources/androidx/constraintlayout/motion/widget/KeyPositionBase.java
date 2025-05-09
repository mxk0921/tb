package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class KeyPositionBase extends Key {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float SELECTION_SLOPE = 20.0f;
    public int mCurveFit = Key.UNSET;

    public static /* synthetic */ Object ipc$super(KeyPositionBase keyPositionBase, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/widget/KeyPositionBase");
    }

    public abstract void calcPosition(int i, int i2, float f, float f2, float f3, float f4);

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9934fc4", new Object[]{this, hashSet});
        }
    }

    public abstract float getPositionX();

    public abstract float getPositionY();

    public abstract boolean intersects(int i, int i2, RectF rectF, RectF rectF2, float f, float f2);

    public abstract void positionAttributes(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr);
}
