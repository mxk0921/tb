package tb;

import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.y1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ykk {

    /* renamed from: a  reason: collision with root package name */
    public static final y1 f32149a = y1.INSTANCE;

    public static <T, V> FieldWriter a(String str, Class<V> cls, k2a<T, V> k2aVar) {
        return f32149a.h(str, cls, k2aVar);
    }

    public static <T> FieldWriter b(String str, c0u<T> c0uVar) {
        return f32149a.i(str, c0uVar);
    }

    public static iik c(Class cls, FieldWriter... fieldWriterArr) {
        return f32149a.l(cls, fieldWriterArr);
    }
}
