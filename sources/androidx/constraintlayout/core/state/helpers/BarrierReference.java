package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.HelperWidget;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BarrierReference extends HelperReference {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Barrier mBarrierWidget;
    private State.Direction mDirection;
    private int mMargin;

    /* compiled from: Taobao */
    /* renamed from: androidx.constraintlayout.core.state.helpers.BarrierReference$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Direction;

        static {
            int[] iArr = new int[State.Direction.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Direction = iArr;
            try {
                iArr[State.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Direction[State.Direction.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public BarrierReference(State state) {
        super(state, State.Helper.BARRIER);
    }

    public static /* synthetic */ Object ipc$super(BarrierReference barrierReference, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/helpers/BarrierReference");
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            return;
        }
        getHelperWidget();
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Direction[this.mDirection.ordinal()];
        if (i2 == 3 || i2 == 4) {
            i = 1;
        } else if (i2 == 5) {
            i = 2;
        } else if (i2 == 6) {
            i = 3;
        }
        this.mBarrierWidget.setBarrierType(i);
        this.mBarrierWidget.setMargin(this.mMargin);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget getHelperWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HelperWidget) ipChange.ipc$dispatch("cb8761a0", new Object[]{this});
        }
        if (this.mBarrierWidget == null) {
            this.mBarrierWidget = new Barrier();
        }
        return this.mBarrierWidget;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference margin(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("9146fc12", new Object[]{this, obj});
        }
        margin(this.mHelperState.convertDimension(obj));
        return this;
    }

    public void setBarrierDirection(State.Direction direction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a3bca0", new Object[]{this, direction});
        } else {
            this.mDirection = direction;
        }
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference margin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("275a8415", new Object[]{this, new Integer(i)});
        }
        this.mMargin = i;
        return this;
    }
}
