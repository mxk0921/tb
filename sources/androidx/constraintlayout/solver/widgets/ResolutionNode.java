package androidx.constraintlayout.solver.widgets;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ResolutionNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REMOVED = 2;
    public static final int RESOLVED = 1;
    public static final int UNRESOLVED = 0;
    public HashSet<ResolutionNode> dependents = new HashSet<>(2);
    public int state = 0;

    public void addDependent(ResolutionNode resolutionNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3884b294", new Object[]{this, resolutionNode});
        } else {
            this.dependents.add(resolutionNode);
        }
    }

    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        this.state = 0;
        Iterator<ResolutionNode> it = this.dependents.iterator();
        while (it.hasNext()) {
            it.next().invalidate();
        }
    }

    public void invalidateAnchors() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a1fadaa", new Object[]{this});
            return;
        }
        if (this instanceof ResolutionAnchor) {
            this.state = 0;
        }
        Iterator<ResolutionNode> it = this.dependents.iterator();
        while (it.hasNext()) {
            it.next().invalidateAnchors();
        }
    }

    public void remove(ResolutionDimension resolutionDimension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc116fa", new Object[]{this, resolutionDimension});
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.state = 0;
        this.dependents.clear();
    }

    public void resolve() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74533073", new Object[]{this});
        }
    }

    public void didResolve() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e781de74", new Object[]{this});
            return;
        }
        this.state = 1;
        Iterator<ResolutionNode> it = this.dependents.iterator();
        while (it.hasNext()) {
            it.next().resolve();
        }
    }

    public boolean isResolved() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebad76cd", new Object[]{this})).booleanValue();
        }
        return this.state == 1;
    }
}
