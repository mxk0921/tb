package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;
import tb.dun;
import tb.e1g;
import tb.vyf;
import tb.xyf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class CallableReference implements vyf, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.INSTANCE;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient vyf reflected;
    private final String signature;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class NoReceiver implements Serializable {
        private static final NoReceiver INSTANCE = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return INSTANCE;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @Override // tb.vyf
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // tb.vyf
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public vyf compute() {
        vyf vyfVar = this.reflected;
        if (vyfVar != null) {
            return vyfVar;
        }
        vyf computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract vyf computeReflected();

    @Override // tb.kyf
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // tb.vyf
    public String getName() {
        return this.name;
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

    @Override // tb.vyf
    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    public vyf getReflected() {
        vyf compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // tb.vyf
    public e1g getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // tb.vyf
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // tb.vyf
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // tb.vyf
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // tb.vyf
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // tb.vyf
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // tb.vyf
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
