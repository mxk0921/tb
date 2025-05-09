package kotlin.jvm.internal;

import tb.b0g;
import tb.dun;
import tb.vyf;
import tb.xzf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements xzf {
    public MutablePropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public vyf computeReflected() {
        dun.e(this);
        return this;
    }

    public abstract /* synthetic */ Object get();

    @Override // tb.b0g
    public Object getDelegate() {
        return ((xzf) getReflected()).getDelegate();
    }

    @Override // tb.d1a
    public Object invoke() {
        return get();
    }

    public abstract /* synthetic */ void set(Object obj);

    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference
    public b0g.a getGetter() {
        ((xzf) getReflected()).getGetter();
        return null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, tb.xzf
    public xzf.a getSetter() {
        ((xzf) getReflected()).getSetter();
        return null;
    }

    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
