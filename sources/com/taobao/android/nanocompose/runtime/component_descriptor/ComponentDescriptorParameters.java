package com.taobao.android.nanocompose.runtime.component_descriptor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.DefaultMeasurePolicy;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.ejz;
import tb.g1a;
import tb.jkz;
import tb.mdz;
import tb.ndz;
import tb.t2o;
import tb.waz;
import tb.xaz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ComponentDescriptorParameters {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f9023a;
    public final int b;
    public final Object c;
    public final g1a<? super ndz, ? extends mdz> d;
    public final d1a<jkz> e;
    public final d1a<NCComponentViewHandler> f;
    public final boolean g;
    public final g1a<OriginNode, ejz> h;
    public final g1a<waz, xaz> i;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.nanocompose.runtime.component_descriptor.ComponentDescriptorParameters$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<ndz, DefaultMeasurePolicy> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/component_descriptor/ComponentDescriptorParameters$1");
        }

        public final DefaultMeasurePolicy invoke(ndz ndzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DefaultMeasurePolicy) ipChange.ipc$dispatch("12aa5f7e", new Object[]{this, ndzVar});
            }
            ckf.g(ndzVar, "measurePolicyCreateParams");
            return new DefaultMeasurePolicy(ndzVar, null, null, 6, null);
        }
    }

    static {
        t2o.a(598737242);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComponentDescriptorParameters(String str, int i, Object obj, g1a<? super ndz, ? extends mdz> g1aVar, d1a<? extends jkz> d1aVar, d1a<? extends NCComponentViewHandler> d1aVar2, boolean z, g1a<? super OriginNode, ? extends ejz> g1aVar2, g1a<? super waz, ? extends xaz> g1aVar3) {
        ckf.g(str, "componentName");
        ckf.g(g1aVar, "measurePolicyCreator");
        ckf.g(d1aVar, "propsCreator");
        this.f9023a = str;
        this.b = i;
        this.c = obj;
        this.d = g1aVar;
        this.e = d1aVar;
        this.f = d1aVar2;
        this.g = z;
        this.h = g1aVar2;
        this.i = g1aVar3;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a01a051c", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return this.f9023a;
    }

    public final d1a<NCComponentViewHandler> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("506f67e8", new Object[]{this});
        }
        return this.f;
    }

    public final Object d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3b2b1877", new Object[]{this});
        }
        return this.c;
    }

    public final g1a<waz, xaz> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("4e3d5977", new Object[]{this});
        }
        return this.i;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentDescriptorParameters)) {
            return false;
        }
        ComponentDescriptorParameters componentDescriptorParameters = (ComponentDescriptorParameters) obj;
        if (ckf.b(this.f9023a, componentDescriptorParameters.f9023a) && this.b == componentDescriptorParameters.b && ckf.b(this.c, componentDescriptorParameters.c) && ckf.b(this.d, componentDescriptorParameters.d) && ckf.b(this.e, componentDescriptorParameters.e) && ckf.b(this.f, componentDescriptorParameters.f) && this.g == componentDescriptorParameters.g && ckf.b(this.h, componentDescriptorParameters.h) && ckf.b(this.i, componentDescriptorParameters.i)) {
            return true;
        }
        return false;
    }

    public final g1a<ndz, mdz> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("8dba1c3e", new Object[]{this});
        }
        return this.d;
    }

    public final g1a<OriginNode, ejz> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("1384c8fb", new Object[]{this});
        }
        return this.h;
    }

    public final d1a<jkz> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("ab28fc84", new Object[]{this});
        }
        return this.e;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = ((this.f9023a.hashCode() * 31) + this.b) * 31;
        Object obj = this.c;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        d1a<NCComponentViewHandler> d1aVar = this.f;
        if (d1aVar == null) {
            i2 = 0;
        } else {
            i2 = d1aVar.hashCode();
        }
        int i6 = (hashCode2 + i2) * 31;
        boolean z = this.g;
        if (!z) {
            i5 = z ? 1 : 0;
        }
        int i7 = (i6 + i5) * 31;
        g1a<OriginNode, ejz> g1aVar = this.h;
        if (g1aVar == null) {
            i3 = 0;
        } else {
            i3 = g1aVar.hashCode();
        }
        int i8 = (i7 + i3) * 31;
        g1a<waz, xaz> g1aVar2 = this.i;
        if (g1aVar2 != null) {
            i4 = g1aVar2.hashCode();
        }
        return i8 + i4;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6c28c", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ComponentDescriptorParameters(componentName=" + this.f9023a + ", componentID=" + this.b + ", flavor=" + this.c + ", measurePolicyCreator=" + this.d + ", propsCreator=" + this.e + ", componentViewHandlerCreator=" + this.f + ", isVirtual=" + this.g + ", originNodeCoordinatorCreator=" + this.h + ", layoutNodeCoordinatorCreator=" + this.i + ')';
    }

    public /* synthetic */ ComponentDescriptorParameters(String str, int i, Object obj, g1a g1aVar, d1a d1aVar, d1a d1aVar2, boolean z, g1a g1aVar2, g1a g1aVar3, int i2, a07 a07Var) {
        this(str, i, (i2 & 4) != 0 ? null : obj, (i2 & 8) != 0 ? AnonymousClass1.INSTANCE : g1aVar, d1aVar, d1aVar2, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : g1aVar2, (i2 & 256) != 0 ? null : g1aVar3);
    }
}
