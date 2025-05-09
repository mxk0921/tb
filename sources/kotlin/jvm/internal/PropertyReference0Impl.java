package kotlin.jvm.internal;

import tb.ls3;
import tb.wyf;
import tb.xyf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(xyf xyfVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ls3) xyfVar).b(), str, str2, !(xyfVar instanceof wyf) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference0
    public Object get() {
        getGetter();
        throw null;
    }

    public PropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
