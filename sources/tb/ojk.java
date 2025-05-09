package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ojk extends jkk {
    public static final ojk b = new ojk(null);
    public static final byte[] c = yqf.a("[S");
    public static final long d = ls9.a("[S");

    /* renamed from: a  reason: collision with root package name */
    public final k2a<Object, short[]> f25433a;

    public ojk(k2a<Object, short[]> k2aVar) {
        this.f25433a = k2aVar;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        short[] sArr;
        if (jSONWriter.Q0(obj, type)) {
            jSONWriter.t2(c, d);
        }
        k2a<Object, short[]> k2aVar = this.f25433a;
        if (k2aVar == null || obj == null) {
            sArr = (short[]) obj;
        } else {
            sArr = k2aVar.apply(obj);
        }
        jSONWriter.d1(sArr.length);
        for (short s : sArr) {
            jSONWriter.L1(s);
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        short[] sArr;
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        k2a<Object, short[]> k2aVar = this.f25433a;
        if (k2aVar != null) {
            sArr = k2aVar.apply(obj);
        } else {
            sArr = (short[]) obj;
        }
        jSONWriter.c1();
        for (int i = 0; i < sArr.length; i++) {
            if (i != 0) {
                jSONWriter.t1();
            }
            jSONWriter.L1(sArr[i]);
        }
        jSONWriter.e();
    }
}
