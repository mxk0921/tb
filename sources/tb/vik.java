package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class vik extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final vik f30035a = new vik(null);
    public static final byte[] b = yqf.a("AtomicLong");

    public vik(Class cls) {
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.c2();
            return;
        }
        AtomicLong atomicLong = (AtomicLong) obj;
        if (jSONWriter.Q0(atomicLong, type)) {
            jSONWriter.t2(b, -1591858996898070466L);
        }
        jSONWriter.O1(atomicLong.longValue());
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.c2();
        } else {
            jSONWriter.O1(((Number) obj).longValue());
        }
    }
}
