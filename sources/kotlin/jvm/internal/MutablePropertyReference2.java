package kotlin.jvm.internal;

import tb.d0g;
import tb.dun;
import tb.vyf;
import tb.zzf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements zzf {
    public MutablePropertyReference2() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public vyf computeReflected() {
        dun.g(this);
        return this;
    }

    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    @Override // tb.d0g
    public Object getDelegate(Object obj, Object obj2) {
        return ((zzf) getReflected()).getDelegate(obj, obj2);
    }

    @Override // tb.u1a
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2, Object obj3);

    public MutablePropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference
    public d0g.a getGetter() {
        ((zzf) getReflected()).getGetter();
        return null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, tb.xzf
    public zzf.a getSetter() {
        ((zzf) getReflected()).getSetter();
        return null;
    }
}
