package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Group extends ConstraintHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Group(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(Group group, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1832146921:
                super.init((AttributeSet) objArr[0]);
                return null;
            case -1705336120:
                super.setVisibility(((Number) objArr[0]).intValue());
                return null;
            case 623635678:
                super.setElevation(((Number) objArr[0]).floatValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/widget/Group");
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void applyLayoutFeaturesInConstraintSet(ConstraintLayout constraintLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950d11df", new Object[]{this, constraintLayout});
        } else {
            applyLayoutFeatures(constraintLayout);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
            return;
        }
        super.init(attributeSet);
        this.mUseViewMeasure = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252becde", new Object[]{this, new Float(f)});
            return;
        }
        super.setElevation(f);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        super.setVisibility(i);
        applyLayoutFeatures();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(ConstraintLayout constraintLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a25b217", new Object[]{this, constraintLayout});
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.mWidget.setWidth(0);
        layoutParams.mWidget.setHeight(0);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
