package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zik extends jkk {
    public static final zik b = new zik(null);
    public static final byte[] c = yqf.a("[Z");
    public static final long d = ls9.a("[Z");

    /* renamed from: a  reason: collision with root package name */
    public final k2a<Object, boolean[]> f32794a;

    public zik(k2a<Object, boolean[]> k2aVar) {
        this.f32794a = k2aVar;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        boolean[] zArr;
        if (jSONWriter.R0(obj, type, j)) {
            jSONWriter.t2(c, d);
        }
        k2a<Object, boolean[]> k2aVar = this.f32794a;
        if (k2aVar == null || obj == null) {
            zArr = (boolean[]) obj;
        } else {
            zArr = k2aVar.apply(obj);
        }
        jSONWriter.p1(zArr);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        boolean[] zArr;
        k2a<Object, boolean[]> k2aVar = this.f32794a;
        if (k2aVar == null || obj == null) {
            zArr = (boolean[]) obj;
        } else {
            zArr = k2aVar.apply(obj);
        }
        jSONWriter.p1(zArr);
    }
}
