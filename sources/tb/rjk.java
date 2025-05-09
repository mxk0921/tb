package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class rjk extends jkk {
    public static final rjk b = new rjk(null);
    public static final byte[] c = yqf.a("[I");
    public static final long d = ls9.a("[I");

    /* renamed from: a  reason: collision with root package name */
    public final k2a<Object, int[]> f27423a;

    public rjk(k2a<Object, int[]> k2aVar) {
        this.f27423a = k2aVar;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        int[] iArr;
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        if (jSONWriter.Q0(obj, type)) {
            jSONWriter.t2(c, d);
        }
        k2a<Object, int[]> k2aVar = this.f27423a;
        if (k2aVar != null) {
            iArr = k2aVar.apply(obj);
        } else {
            iArr = (int[]) obj;
        }
        jSONWriter.N1(iArr);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        int[] iArr;
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        k2a<Object, int[]> k2aVar = this.f27423a;
        if (k2aVar != null) {
            iArr = k2aVar.apply(obj);
        } else {
            iArr = (int[]) obj;
        }
        jSONWriter.N1(iArr);
    }
}
