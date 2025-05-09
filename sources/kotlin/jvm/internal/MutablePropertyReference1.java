package kotlin.jvm.internal;

import tb.c0g;
import tb.dun;
import tb.vyf;
import tb.yzf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements yzf {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public vyf computeReflected() {
        dun.f(this);
        return this;
    }

    public abstract /* synthetic */ Object get(Object obj);

    @Override // tb.c0g
    public Object getDelegate(Object obj) {
        return ((yzf) getReflected()).getDelegate(obj);
    }

    @Override // tb.g1a
    public Object invoke(Object obj) {
        return get(obj);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2);

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference
    public c0g.a getGetter() {
        ((yzf) getReflected()).getGetter();
        return null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, tb.xzf
    public yzf.a getSetter() {
        ((yzf) getReflected()).getSetter();
        return null;
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
