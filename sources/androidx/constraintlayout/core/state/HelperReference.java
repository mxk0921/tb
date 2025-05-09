package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HelperReference extends ConstraintReference implements Facade {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final State mHelperState;
    private HelperWidget mHelperWidget;
    public ArrayList<Object> mReferences = new ArrayList<>();
    public final State.Helper mType;

    public HelperReference(State state, State.Helper helper) {
        super(state);
        this.mHelperState = state;
        this.mType = helper;
    }

    public static /* synthetic */ Object ipc$super(HelperReference helperReference, String str, Object... objArr) {
        if (str.hashCode() == -2076860171) {
            super.apply();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/HelperReference");
    }

    public HelperReference add(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HelperReference) ipChange.ipc$dispatch("9d320c6b", new Object[]{this, objArr});
        }
        Collections.addAll(this.mReferences, objArr);
        return this;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
        }
    }

    public void applyBase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ec5466", new Object[]{this});
        } else {
            super.apply();
        }
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("d3c63880", new Object[]{this});
        }
        return getHelperWidget();
    }

    public HelperWidget getHelperWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HelperWidget) ipChange.ipc$dispatch("cb8761a0", new Object[]{this});
        }
        return this.mHelperWidget;
    }

    public State.Helper getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (State.Helper) ipChange.ipc$dispatch("dd26fb9b", new Object[]{this});
        }
        return this.mType;
    }

    public void setHelperWidget(HelperWidget helperWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e016be6", new Object[]{this, helperWidget});
        } else {
            this.mHelperWidget = helperWidget;
        }
    }
}
