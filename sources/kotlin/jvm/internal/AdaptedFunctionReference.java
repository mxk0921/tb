package kotlin.jvm.internal;

import java.io.Serializable;
import tb.ckf;
import tb.dun;
import tb.m2a;
import tb.xyf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class AdaptedFunctionReference implements m2a, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public AdaptedFunctionReference(int i, Class cls, String str, String str2, int i2) {
        this(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        if (this.isTopLevel != adaptedFunctionReference.isTopLevel || this.arity != adaptedFunctionReference.arity || this.flags != adaptedFunctionReference.flags || !ckf.b(this.receiver, adaptedFunctionReference.receiver) || !ckf.b(this.owner, adaptedFunctionReference.owner) || !this.name.equals(adaptedFunctionReference.name) || !this.signature.equals(adaptedFunctionReference.signature)) {
            return false;
        }
        return true;
    }

    @Override // tb.m2a
    public int getArity() {
        return this.arity;
    }

    public xyf getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return dun.c(cls);
        }
        return dun.b(cls);
    }

    public int hashCode() {
        int i;
        int i2;
        Object obj = this.receiver;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Class cls = this.owner;
        if (cls != null) {
            i3 = cls.hashCode();
        }
        int hashCode = (((((i4 + i3) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31;
        if (this.isTopLevel) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((hashCode + i2) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return dun.l(this);
    }

    public AdaptedFunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
