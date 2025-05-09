package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.component_descriptor.ComponentDescriptorParameters;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class j2z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ComponentDescriptorParameters f21732a;
    public final g1a<ComponentDescriptorParameters, i2z> b;

    static {
        t2o.a(598737244);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j2z(ComponentDescriptorParameters componentDescriptorParameters, g1a<? super ComponentDescriptorParameters, ? extends i2z> g1aVar) {
        ckf.g(componentDescriptorParameters, "componentDescriptorParameters");
        ckf.g(g1aVar, "componentDescriptorConstructor");
        this.f21732a = componentDescriptorParameters;
        this.b = g1aVar;
    }

    public final g1a<ComponentDescriptorParameters, i2z> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("a0354571", new Object[]{this});
        }
        return this.b;
    }

    public final ComponentDescriptorParameters b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentDescriptorParameters) ipChange.ipc$dispatch("3e645e65", new Object[]{this});
        }
        return this.f21732a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2z)) {
            return false;
        }
        j2z j2zVar = (j2z) obj;
        if (ckf.b(this.f21732a, j2zVar.f21732a) && ckf.b(this.b, j2zVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (this.f21732a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ComponentDescriptorProvider(componentDescriptorParameters=" + this.f21732a + ", componentDescriptorConstructor=" + this.b + ')';
    }
}
