package kotlin.jvm.internal;

import tb.b0g;
import tb.dun;
import tb.vyf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class PropertyReference0 extends PropertyReference implements b0g {
    public PropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public vyf computeReflected() {
        dun.h(this);
        return this;
    }

    public abstract /* synthetic */ Object get();

    @Override // tb.b0g
    public Object getDelegate() {
        return ((b0g) getReflected()).getDelegate();
    }

    @Override // tb.d1a
    public Object invoke() {
        return get();
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public b0g.a getGetter() {
        ((b0g) getReflected()).getGetter();
        return null;
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
