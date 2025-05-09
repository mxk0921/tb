package androidx.constraintlayout.core.dsl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConstraintSet {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<Constraint> mConstraints = new ArrayList<>();
    public ArrayList<Helper> mHelpers = new ArrayList<>();
    private final String mName;

    public ConstraintSet(String str) {
        this.mName = str;
    }

    public void add(Constraint constraint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9155bb9c", new Object[]{this, constraint});
        } else {
            this.mConstraints.add(constraint);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(this.mName + ":{\n");
        if (!this.mConstraints.isEmpty()) {
            Iterator<Constraint> it = this.mConstraints.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
            }
        }
        if (!this.mHelpers.isEmpty()) {
            Iterator<Helper> it2 = this.mHelpers.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().toString());
            }
        }
        sb.append("},\n");
        return sb.toString();
    }

    public void add(Helper helper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf1b4ab", new Object[]{this, helper});
        } else {
            this.mHelpers.add(helper);
        }
    }
}
