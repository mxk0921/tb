package tb;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class aa9<T> extends z99<T, Object> {
    final long z;

    public aa9(String str, Type type, Class cls, Type type2, Class cls2, int i, long j, String str2, Locale locale, Collection collection, Field field) {
        super(str, type, cls, type2, cls2, i, j, str2, locale, collection, null, field, null);
        this.z = opf.UNSAFE.objectFieldOffset(field);
    }

    @Override // tb.fa9, tb.g79
    public void h(Object obj, Object obj2) {
        opf.UNSAFE.putObject(obj, this.z, obj2);
    }
}
