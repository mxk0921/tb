package kotlin.jvm.internal;

import tb.a0g;
import tb.ckf;
import tb.vyf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class PropertyReference extends CallableReference implements a0g {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public vyf compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        return super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (!getOwner().equals(propertyReference.getOwner()) || !getName().equals(propertyReference.getName()) || !getSignature().equals(propertyReference.getSignature()) || !ckf.b(getBoundReceiver(), propertyReference.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof a0g) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public abstract /* synthetic */ a0g.a getGetter();

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // tb.a0g
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // tb.a0g
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        vyf compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public a0g getReflected() {
        if (!this.syntheticJavaProperty) {
            return (a0g) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public PropertyReference(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        boolean z = false;
        this.syntheticJavaProperty = (i & 2) == 2 ? true : z;
    }
}
