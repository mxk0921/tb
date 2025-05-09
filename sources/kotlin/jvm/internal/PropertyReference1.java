package kotlin.jvm.internal;

import tb.c0g;
import tb.dun;
import tb.vyf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class PropertyReference1 extends PropertyReference implements c0g {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public vyf computeReflected() {
        dun.i(this);
        return this;
    }

    public abstract /* synthetic */ Object get(Object obj);

    @Override // tb.c0g
    public Object getDelegate(Object obj) {
        return ((c0g) getReflected()).getDelegate(obj);
    }

    @Override // tb.g1a
    public Object invoke(Object obj) {
        return get(obj);
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public c0g.a getGetter() {
        ((c0g) getReflected()).getGetter();
        return null;
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
