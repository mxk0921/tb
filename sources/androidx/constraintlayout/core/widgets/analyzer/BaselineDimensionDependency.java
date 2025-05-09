package androidx.constraintlayout.core.widgets.analyzer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BaselineDimensionDependency extends DimensionDependency {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BaselineDimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
    }

    public static /* synthetic */ Object ipc$super(BaselineDimensionDependency baselineDimensionDependency, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/widgets/analyzer/BaselineDimensionDependency");
    }

    public void update(DependencyNode dependencyNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad88797", new Object[]{this, dependencyNode});
            return;
        }
        WidgetRun widgetRun = this.mRun;
        ((VerticalWidgetRun) widgetRun).baseline.mMargin = widgetRun.mWidget.getBaselineDistance();
        this.resolved = true;
    }
}
