package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class tik extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final tik f28734a = new tik(null);
    public static final byte[] b = yqf.a("AtomicInteger");

    public tik(Class cls) {
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.c2();
            return;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj;
        if (jSONWriter.Q0(atomicInteger, type)) {
            jSONWriter.t2(b, 7576651708426282938L);
        }
        jSONWriter.L1(atomicInteger.intValue());
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.c2();
        } else {
            jSONWriter.L1(((AtomicInteger) obj).intValue());
        }
    }
}
