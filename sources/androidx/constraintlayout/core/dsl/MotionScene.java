package androidx.constraintlayout.core.dsl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MotionScene {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<Transition> mTransitions = new ArrayList<>();
    public ArrayList<ConstraintSet> mConstraintSets = new ArrayList<>();

    public void addConstraintSet(ConstraintSet constraintSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfa1735", new Object[]{this, constraintSet});
        } else {
            this.mConstraintSets.add(constraintSet);
        }
    }

    public void addTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("521c52cf", new Object[]{this, transition});
        } else {
            this.mTransitions.add(transition);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("{\n");
        if (!this.mTransitions.isEmpty()) {
            sb.append("Transitions:{\n");
            Iterator<Transition> it = this.mTransitions.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
            }
            sb.append("},\n");
        }
        if (!this.mConstraintSets.isEmpty()) {
            sb.append("ConstraintSets:{\n");
            Iterator<ConstraintSet> it2 = this.mConstraintSets.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().toString());
            }
            sb.append("},\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}
