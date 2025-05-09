package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GuidelineReference extends WidgetRun {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public GuidelineReference(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.mHorizontalRun.clear();
        constraintWidget.mVerticalRun.clear();
        this.orientation = ((Guideline) constraintWidget).getOrientation();
    }

    private void addDependency(DependencyNode dependencyNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce0901a", new Object[]{this, dependencyNode});
            return;
        }
        this.start.mDependencies.add(dependencyNode);
        dependencyNode.mTargets.add(this.start);
    }

    public static /* synthetic */ Object ipc$super(GuidelineReference guidelineReference, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/widgets/analyzer/GuidelineReference");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void apply() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            return;
        }
        Guideline guideline = (Guideline) this.mWidget;
        int relativeBegin = guideline.getRelativeBegin();
        int relativeEnd = guideline.getRelativeEnd();
        guideline.getRelativePercent();
        if (guideline.getOrientation() == 1) {
            if (relativeBegin != -1) {
                this.start.mTargets.add(this.mWidget.mParent.mHorizontalRun.start);
                this.mWidget.mParent.mHorizontalRun.start.mDependencies.add(this.start);
                this.start.mMargin = relativeBegin;
            } else if (relativeEnd != -1) {
                this.start.mTargets.add(this.mWidget.mParent.mHorizontalRun.end);
                this.mWidget.mParent.mHorizontalRun.end.mDependencies.add(this.start);
                this.start.mMargin = -relativeEnd;
            } else {
                DependencyNode dependencyNode = this.start;
                dependencyNode.delegateToWidgetRun = true;
                dependencyNode.mTargets.add(this.mWidget.mParent.mHorizontalRun.end);
                this.mWidget.mParent.mHorizontalRun.end.mDependencies.add(this.start);
            }
            addDependency(this.mWidget.mHorizontalRun.start);
            addDependency(this.mWidget.mHorizontalRun.end);
            return;
        }
        if (relativeBegin != -1) {
            this.start.mTargets.add(this.mWidget.mParent.mVerticalRun.start);
            this.mWidget.mParent.mVerticalRun.start.mDependencies.add(this.start);
            this.start.mMargin = relativeBegin;
        } else if (relativeEnd != -1) {
            this.start.mTargets.add(this.mWidget.mParent.mVerticalRun.end);
            this.mWidget.mParent.mVerticalRun.end.mDependencies.add(this.start);
            this.start.mMargin = -relativeEnd;
        } else {
            DependencyNode dependencyNode2 = this.start;
            dependencyNode2.delegateToWidgetRun = true;
            dependencyNode2.mTargets.add(this.mWidget.mParent.mVerticalRun.end);
            this.mWidget.mParent.mVerticalRun.end.mDependencies.add(this.start);
        }
        addDependency(this.mWidget.mVerticalRun.start);
        addDependency(this.mWidget.mVerticalRun.end);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.start.clear();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.start.resolved = false;
        this.end.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4837404", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd43579", new Object[]{this, dependency});
            return;
        }
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.readyToSolve && !dependencyNode.resolved) {
            this.start.resolve((int) ((dependencyNode.mTargets.get(0).value * ((Guideline) this.mWidget).getRelativePercent()) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f8c34", new Object[]{this});
        } else if (((Guideline) this.mWidget).getOrientation() == 1) {
            this.mWidget.setX(this.start.value);
        } else {
            this.mWidget.setY(this.start.value);
        }
    }
}
