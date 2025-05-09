package kotlin.jvm.internal;

import tb.ls3;
import tb.wyf;
import tb.xyf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(xyf xyfVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ls3) xyfVar).b(), str, str2, !(xyfVar instanceof wyf) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1
    public Object get(Object obj) {
        getGetter();
        throw null;
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
