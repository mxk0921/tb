package kotlin.jvm.internal;

import tb.ls3;
import tb.wyf;
import tb.xyf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class PropertyReference2Impl extends PropertyReference2 {
    public PropertyReference2Impl(xyf xyfVar, String str, String str2) {
        super(((ls3) xyfVar).b(), str, str2, !(xyfVar instanceof wyf) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference2
    public Object get(Object obj, Object obj2) {
        getGetter();
        throw null;
    }

    public PropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }
}
