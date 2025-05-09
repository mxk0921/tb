package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Guideline extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mFilterRedundantCalls = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public static /* synthetic */ Object ipc$super(Guideline guideline, String str, Object... objArr) {
        if (str.hashCode() == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/widget/Guideline");
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setFilterRedundantCalls(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff0026b", new Object[]{this, new Boolean(z)});
        } else {
            this.mFilterRedundantCalls = z;
        }
    }

    public void setGuidelineBegin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30b21a1", new Object[]{this, new Integer(i)});
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (!this.mFilterRedundantCalls || layoutParams.guideBegin != i) {
            layoutParams.guideBegin = i;
            setLayoutParams(layoutParams);
        }
    }

    public void setGuidelineEnd(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194c5c2f", new Object[]{this, new Integer(i)});
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (!this.mFilterRedundantCalls || layoutParams.guideEnd != i) {
            layoutParams.guideEnd = i;
            setLayoutParams(layoutParams);
        }
    }

    public void setGuidelinePercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e4f0c2", new Object[]{this, new Float(f)});
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (!this.mFilterRedundantCalls || layoutParams.guidePercent != f) {
            layoutParams.guidePercent = f;
            setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
        }
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
