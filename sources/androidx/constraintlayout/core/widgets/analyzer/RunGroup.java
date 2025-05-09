package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RunGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    public int mDirection;
    public WidgetRun mFirstRun;
    public int mGroupIndex;
    public WidgetRun mLastRun;
    public int position = 0;
    public boolean dual = false;
    public ArrayList<WidgetRun> mRuns = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i) {
        this.mFirstRun = null;
        this.mLastRun = null;
        int i2 = index;
        this.mGroupIndex = i2;
        index = i2 + 1;
        this.mFirstRun = widgetRun;
        this.mLastRun = widgetRun;
        this.mDirection = i;
    }

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("590202f4", new Object[]{this, widgetRun, new Integer(i)})).booleanValue();
        }
        if (!widgetRun.mWidget.isTerminalWidget[i]) {
            return false;
        }
        for (Dependency dependency : widgetRun.start.mDependencies) {
            if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).mRun) != widgetRun && dependencyNode2 == widgetRun3.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it = ((ChainRun) widgetRun).mWidgets.iterator();
                    while (it.hasNext()) {
                        defineTerminalWidget(it.next(), i);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.mWidget.isTerminalWidget[i] = false;
                }
                defineTerminalWidget(dependencyNode2.mRun, i);
            }
        }
        for (Dependency dependency2 : widgetRun.end.mDependencies) {
            if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).mRun) != widgetRun && dependencyNode == widgetRun2.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it2 = ((ChainRun) widgetRun).mWidgets.iterator();
                    while (it2.hasNext()) {
                        defineTerminalWidget(it2.next(), i);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.mWidget.isTerminalWidget[i] = false;
                }
                defineTerminalWidget(dependencyNode.mRun, i);
            }
        }
        return false;
    }

    public void add(WidgetRun widgetRun) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0aa78d", new Object[]{this, widgetRun});
            return;
        }
        this.mRuns.add(widgetRun);
        this.mLastRun = widgetRun;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        WidgetRun widgetRun3;
        long wrapDimension;
        int i2;
        DependencyNode dependencyNode;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44fb5ab1", new Object[]{this, constraintWidgetContainer, new Integer(i)})).longValue();
        }
        WidgetRun widgetRun5 = this.mFirstRun;
        long j = 0;
        if (widgetRun5 instanceof ChainRun) {
            if (((ChainRun) widgetRun5).orientation != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(widgetRun5 instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun5 instanceof VerticalWidgetRun)) {
            return 0L;
        }
        if (i == 0) {
            widgetRun = constraintWidgetContainer.mHorizontalRun;
        } else {
            widgetRun = constraintWidgetContainer.mVerticalRun;
        }
        DependencyNode dependencyNode3 = widgetRun.start;
        if (i == 0) {
            widgetRun2 = constraintWidgetContainer.mHorizontalRun;
        } else {
            widgetRun2 = constraintWidgetContainer.mVerticalRun;
        }
        DependencyNode dependencyNode4 = widgetRun2.end;
        boolean contains = widgetRun5.start.mTargets.contains(dependencyNode3);
        boolean contains2 = this.mFirstRun.end.mTargets.contains(dependencyNode4);
        long wrapDimension2 = this.mFirstRun.getWrapDimension();
        if (contains && contains2) {
            long traverseStart = traverseStart(this.mFirstRun.start, 0L);
            long traverseEnd = traverseEnd(this.mFirstRun.end, 0L);
            long j2 = traverseStart - wrapDimension2;
            WidgetRun widgetRun6 = this.mFirstRun;
            int i3 = widgetRun6.end.mMargin;
            if (j2 >= (-i3)) {
                j2 += i3;
            }
            int i4 = widgetRun6.start.mMargin;
            long j3 = ((-traverseEnd) - wrapDimension2) - i4;
            if (j3 >= i4) {
                j3 -= i4;
            }
            float biasPercent = widgetRun6.mWidget.getBiasPercent(i);
            if (biasPercent > 0.0f) {
                j = (((float) j3) / biasPercent) + (((float) j2) / (1.0f - biasPercent));
            }
            float f = (float) j;
            long j4 = (f * biasPercent) + 0.5f + wrapDimension2 + (f * (1.0f - biasPercent)) + 0.5f;
            wrapDimension = widgetRun4.start.mMargin + j4;
            i2 = this.mFirstRun.end.mMargin;
        } else if (contains) {
            return Math.max(traverseStart(this.mFirstRun.start, dependencyNode2.mMargin), this.mFirstRun.start.mMargin + wrapDimension2);
        } else if (contains2) {
            return Math.max(-traverseEnd(this.mFirstRun.end, dependencyNode.mMargin), (-this.mFirstRun.end.mMargin) + wrapDimension2);
        } else {
            wrapDimension = widgetRun3.start.mMargin + this.mFirstRun.getWrapDimension();
            i2 = this.mFirstRun.end.mMargin;
        }
        return wrapDimension - i2;
    }

    public void defineTerminalWidgets(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e09b89f", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            WidgetRun widgetRun = this.mFirstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z2) {
            WidgetRun widgetRun2 = this.mFirstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }

    private long traverseEnd(DependencyNode dependencyNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcce4c1", new Object[]{this, dependencyNode, new Long(j)})).longValue();
        }
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j;
        }
        int size = dependencyNode.mDependencies.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = dependencyNode.mDependencies.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    j2 = Math.min(j2, traverseEnd(dependencyNode2, dependencyNode2.mMargin + j));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return j2;
        }
        long wrapDimension = j - widgetRun.getWrapDimension();
        return Math.min(Math.min(j2, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.mMargin);
    }

    private long traverseStart(DependencyNode dependencyNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e477e11a", new Object[]{this, dependencyNode, new Long(j)})).longValue();
        }
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j;
        }
        int size = dependencyNode.mDependencies.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = dependencyNode.mDependencies.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    j2 = Math.max(j2, traverseStart(dependencyNode2, dependencyNode2.mMargin + j));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return j2;
        }
        long wrapDimension = j + widgetRun.getWrapDimension();
        return Math.max(Math.max(j2, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.mMargin);
    }
}
