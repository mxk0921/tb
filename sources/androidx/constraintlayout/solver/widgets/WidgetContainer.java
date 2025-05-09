package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WidgetContainer extends ConstraintWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<ConstraintWidget> mChildren = new ArrayList<>();

    public WidgetContainer() {
    }

    public static Rectangle getBounds(ArrayList<ConstraintWidget> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rectangle) ipChange.ipc$dispatch("c9bd1dd8", new Object[]{arrayList});
        }
        Rectangle rectangle = new Rectangle();
        if (arrayList.size() == 0) {
            return rectangle;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget = arrayList.get(i5);
            if (constraintWidget.getX() < i3) {
                i3 = constraintWidget.getX();
            }
            if (constraintWidget.getY() < i4) {
                i4 = constraintWidget.getY();
            }
            if (constraintWidget.getRight() > i) {
                i = constraintWidget.getRight();
            }
            if (constraintWidget.getBottom() > i2) {
                i2 = constraintWidget.getBottom();
            }
        }
        rectangle.setBounds(i3, i4, i - i3, i2 - i4);
        return rectangle;
    }

    public static /* synthetic */ Object ipc$super(WidgetContainer widgetContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1172969603:
                super.updateDrawPosition();
                return null;
            case 795080067:
                super.resetSolverVariables((Cache) objArr[0]);
                return null;
            case 1969280764:
                super.setOffset(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2022597206:
                super.reset();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/solver/widgets/WidgetContainer");
        }
    }

    public void add(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d4e7de", new Object[]{this, constraintWidget});
            return;
        }
        this.mChildren.add(constraintWidget);
        if (constraintWidget.getParent() != null) {
            ((WidgetContainer) constraintWidget.getParent()).remove(constraintWidget);
        }
        constraintWidget.setParent(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    public ConstraintWidget findWidget(float f, float f2) {
        WidgetContainer widgetContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("87f9365a", new Object[]{this, new Float(f), new Float(f2)});
        }
        int drawX = getDrawX();
        int drawY = getDrawY();
        int width = getWidth() + drawX;
        int height = getHeight() + drawY;
        if (f < drawX || f > width || f2 < drawY || f2 > height) {
            widgetContainer = null;
        } else {
            widgetContainer = this;
        }
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof WidgetContainer) {
                constraintWidget = ((WidgetContainer) constraintWidget).findWidget(f, f2);
                if (constraintWidget == null) {
                }
                widgetContainer = constraintWidget;
            } else {
                int drawX2 = constraintWidget.getDrawX();
                int drawY2 = constraintWidget.getDrawY();
                int width2 = constraintWidget.getWidth() + drawX2;
                int height2 = constraintWidget.getHeight() + drawY2;
                if (f >= drawX2) {
                    if (f <= width2) {
                        if (f2 >= drawY2) {
                            if (f2 > height2) {
                            }
                            widgetContainer = constraintWidget;
                        }
                    }
                }
            }
        }
        return widgetContainer;
    }

    public ArrayList<ConstraintWidget> findWidgets(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1eb31dd7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        ArrayList<ConstraintWidget> arrayList = new ArrayList<>();
        Rectangle rectangle = new Rectangle();
        rectangle.setBounds(i, i2, i3, i4);
        int size = this.mChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i5);
            Rectangle rectangle2 = new Rectangle();
            rectangle2.setBounds(constraintWidget.getDrawX(), constraintWidget.getDrawY(), constraintWidget.getWidth(), constraintWidget.getHeight());
            if (rectangle.intersects(rectangle2)) {
                arrayList.add(constraintWidget);
            }
        }
        return arrayList;
    }

    public ArrayList<ConstraintWidget> getChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1036ab56", new Object[]{this});
        }
        return this.mChildren;
    }

    public ConstraintWidgetContainer getRootConstraintContainer() {
        ConstraintWidgetContainer constraintWidgetContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidgetContainer) ipChange.ipc$dispatch("b0c3db8c", new Object[]{this});
        }
        ConstraintWidget parent = getParent();
        if (this instanceof ConstraintWidgetContainer) {
            constraintWidgetContainer = (ConstraintWidgetContainer) this;
        } else {
            constraintWidgetContainer = null;
        }
        while (parent != null) {
            ConstraintWidget parent2 = parent.getParent();
            if (parent instanceof ConstraintWidgetContainer) {
                constraintWidgetContainer = (ConstraintWidgetContainer) parent;
            }
            parent = parent2;
        }
        return constraintWidgetContainer;
    }

    public void layout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144adab1", new Object[]{this});
            return;
        }
        updateDrawPosition();
        ArrayList<ConstraintWidget> arrayList = this.mChildren;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = this.mChildren.get(i);
                if (constraintWidget instanceof WidgetContainer) {
                    ((WidgetContainer) constraintWidget).layout();
                }
            }
        }
    }

    public void remove(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45df79b", new Object[]{this, constraintWidget});
            return;
        }
        this.mChildren.remove(constraintWidget);
        constraintWidget.setParent(null);
    }

    public void removeAllChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6885623", new Object[]{this});
        } else {
            this.mChildren.clear();
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mChildren.clear();
        super.reset();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void resetSolverVariables(Cache cache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f63f583", new Object[]{this, cache});
            return;
        }
        super.resetSolverVariables(cache);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            this.mChildren.get(i).resetSolverVariables(cache);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void setOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560d6fc", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.setOffset(i, i2);
        int size = this.mChildren.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.mChildren.get(i3).setOffset(getRootX(), getRootY());
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void updateDrawPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba15e77d", new Object[]{this});
            return;
        }
        super.updateDrawPosition();
        ArrayList<ConstraintWidget> arrayList = this.mChildren;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = this.mChildren.get(i);
                constraintWidget.setOffset(getDrawX(), getDrawY());
                if (!(constraintWidget instanceof ConstraintWidgetContainer)) {
                    constraintWidget.updateDrawPosition();
                }
            }
        }
    }

    public WidgetContainer(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public WidgetContainer(int i, int i2) {
        super(i, i2);
    }

    public void add(ConstraintWidget... constraintWidgetArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e4fb679", new Object[]{this, constraintWidgetArr});
            return;
        }
        for (ConstraintWidget constraintWidget : constraintWidgetArr) {
            add(constraintWidget);
        }
    }
}
