package androidx.constraintlayout.core.widgets.analyzer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DependencyNode implements Dependency {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int mMargin;
    public WidgetRun mRun;
    public int value;
    public Dependency updateDelegate = null;
    public boolean delegateToWidgetRun = false;
    public boolean readyToSolve = false;
    public Type mType = Type.UNKNOWN;
    public int mMarginFactor = 1;
    public DimensionDependency mMarginDependency = null;
    public boolean resolved = false;
    public List<Dependency> mDependencies = new ArrayList();
    public List<DependencyNode> mTargets = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Type extends Enum<Type> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Type UNKNOWN = new Type("UNKNOWN", 0);
        public static final Type HORIZONTAL_DIMENSION = new Type("HORIZONTAL_DIMENSION", 1);
        public static final Type VERTICAL_DIMENSION = new Type("VERTICAL_DIMENSION", 2);
        public static final Type LEFT = new Type("LEFT", 3);
        public static final Type RIGHT = new Type("RIGHT", 4);
        public static final Type TOP = new Type("TOP", 5);
        public static final Type BOTTOM = new Type("BOTTOM", 6);
        public static final Type BASELINE = new Type("BASELINE", 7);
        private static final /* synthetic */ Type[] $VALUES = $values();

        private static /* synthetic */ Type[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Type[]) ipChange.ipc$dispatch("1a28f91f", new Object[0]) : new Type[]{UNKNOWN, HORIZONTAL_DIMENSION, VERTICAL_DIMENSION, LEFT, RIGHT, TOP, BOTTOM, BASELINE};
        }

        private Type(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/widgets/analyzer/DependencyNode$Type");
        }

        public static Type valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type) ipChange.ipc$dispatch("9410a794", new Object[]{str});
            }
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type[]) ipChange.ipc$dispatch("e3eea5c3", new Object[0]);
            }
            return (Type[]) $VALUES.clone();
        }
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.mRun = widgetRun;
    }

    public void addDependency(Dependency dependency) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e2f77c", new Object[]{this, dependency});
            return;
        }
        this.mDependencies.add(dependency);
        if (this.resolved) {
            dependency.update(dependency);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.mTargets.clear();
        this.mDependencies.clear();
        this.resolved = false;
        this.value = 0;
        this.readyToSolve = false;
        this.delegateToWidgetRun = false;
    }

    public String name() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        String debugName = this.mRun.mWidget.getDebugName();
        Type type = this.mType;
        if (type == Type.LEFT || type == Type.RIGHT) {
            str = debugName + "_HORIZONTAL";
        } else {
            str = debugName + "_VERTICAL";
        }
        return str + ":" + this.mType.name();
    }

    public void resolve(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161350f0", new Object[]{this, new Integer(i)});
        } else if (!this.resolved) {
            this.resolved = true;
            this.value = i;
            for (Dependency dependency : this.mDependencies) {
                dependency.update(dependency);
            }
        }
    }

    public String toString() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mRun.mWidget.getDebugName());
        sb.append(":");
        sb.append(this.mType);
        sb.append(f7l.BRACKET_START_STR);
        if (this.resolved) {
            obj = Integer.valueOf(this.value);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.mTargets.size());
        sb.append(":d=");
        sb.append(this.mDependencies.size());
        sb.append(">");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd43579", new Object[]{this, dependency});
            return;
        }
        for (DependencyNode dependencyNode : this.mTargets) {
            if (!dependencyNode.resolved) {
                return;
            }
        }
        this.readyToSolve = true;
        Dependency dependency2 = this.updateDelegate;
        if (dependency2 != null) {
            dependency2.update(this);
        }
        if (this.delegateToWidgetRun) {
            this.mRun.update(this);
            return;
        }
        DependencyNode dependencyNode2 = null;
        for (DependencyNode dependencyNode3 : this.mTargets) {
            if (!(dependencyNode3 instanceof DimensionDependency)) {
                i++;
                dependencyNode2 = dependencyNode3;
            }
        }
        if (dependencyNode2 != null && i == 1 && dependencyNode2.resolved) {
            DimensionDependency dimensionDependency = this.mMarginDependency;
            if (dimensionDependency != null) {
                if (dimensionDependency.resolved) {
                    this.mMargin = this.mMarginFactor * dimensionDependency.value;
                } else {
                    return;
                }
            }
            resolve(dependencyNode2.value + this.mMargin);
        }
        Dependency dependency3 = this.updateDelegate;
        if (dependency3 != null) {
            dependency3.update(this);
        }
    }
}
