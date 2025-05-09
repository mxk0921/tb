package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class xik extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final xik f31411a = new xik(null);

    public xik(Class cls) {
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        Object obj3 = ((AtomicReference) obj).get();
        if (obj3 == null) {
            jSONWriter.b2();
        }
        jSONWriter.j1(obj3);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        Object obj3 = ((AtomicReference) obj).get();
        if (obj3 == null) {
            jSONWriter.b2();
        }
        jSONWriter.j1(obj3);
    }
}
