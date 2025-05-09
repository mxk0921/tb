package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ujk extends jkk {
    public static final ujk b = new ujk(null);
    public static final byte[] c = yqf.a("[J");
    public static final long d = ls9.a("[J");

    /* renamed from: a  reason: collision with root package name */
    public final k2a<Object, long[]> f29416a;

    public ujk(k2a<Object, long[]> k2aVar) {
        this.f29416a = k2aVar;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        long[] jArr;
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        if (jSONWriter.Q0(obj, type)) {
            jSONWriter.t2(c, d);
        }
        k2a<Object, long[]> k2aVar = this.f29416a;
        if (k2aVar != null) {
            jArr = k2aVar.apply(obj);
        } else {
            jArr = (long[]) obj;
        }
        jSONWriter.P1(jArr);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        long[] jArr;
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        jSONWriter.f2458a.f2459a.getClass();
        k2a<Object, long[]> k2aVar = this.f29416a;
        if (k2aVar != null) {
            jArr = k2aVar.apply(obj);
        } else {
            jArr = (long[]) obj;
        }
        jSONWriter.P1(jArr);
    }
}
