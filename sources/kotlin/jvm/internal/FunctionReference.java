package kotlin.jvm.internal;

import tb.ckf;
import tb.dun;
import tb.m2a;
import tb.vyf;
import tb.zyf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FunctionReference extends CallableReference implements m2a, zyf {
    private final int arity;
    private final int flags;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public vyf computeReflected() {
        dun.a(this);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (!getName().equals(functionReference.getName()) || !getSignature().equals(functionReference.getSignature()) || this.flags != functionReference.flags || this.arity != functionReference.arity || !ckf.b(getBoundReceiver(), functionReference.getBoundReceiver()) || !ckf.b(getOwner(), functionReference.getOwner())) {
                return false;
            }
            return true;
        } else if (obj instanceof zyf) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @Override // tb.m2a
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int i;
        if (getOwner() == null) {
            i = 0;
        } else {
            i = getOwner().hashCode() * 31;
        }
        return ((i + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // tb.zyf
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // tb.zyf
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // tb.zyf
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // tb.zyf
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, tb.vyf
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        vyf compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public zyf getReflected() {
        return (zyf) super.getReflected();
    }

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
