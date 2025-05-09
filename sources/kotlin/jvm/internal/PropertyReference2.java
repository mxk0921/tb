package kotlin.jvm.internal;

import tb.d0g;
import tb.dun;
import tb.vyf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class PropertyReference2 extends PropertyReference implements d0g {
    public PropertyReference2() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public vyf computeReflected() {
        dun.j(this);
        return this;
    }

    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    @Override // tb.d0g
    public Object getDelegate(Object obj, Object obj2) {
        return ((d0g) getReflected()).getDelegate(obj, obj2);
    }

    @Override // tb.u1a
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public d0g.a getGetter() {
        ((d0g) getReflected()).getGetter();
        return null;
    }
}
