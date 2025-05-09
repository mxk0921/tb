package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class cjk extends jkk {
    public static final cjk b = new cjk(null);
    public static final byte[] c = yqf.a("[C");
    public static final long d = ls9.a("[C");

    /* renamed from: a  reason: collision with root package name */
    public final k2a<Object, char[]> f17099a;

    public cjk(k2a<Object, char[]> k2aVar) {
        this.f17099a = k2aVar;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        char[] cArr;
        if (jSONWriter.R0(obj, type, j)) {
            jSONWriter.t2(c, d);
        }
        k2a<Object, char[]> k2aVar = this.f17099a;
        if (k2aVar == null || obj == null) {
            cArr = (char[]) obj;
        } else {
            cArr = k2aVar.apply(obj);
        }
        jSONWriter.m2(cArr, 0, cArr.length);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        char[] cArr;
        k2a<Object, char[]> k2aVar = this.f17099a;
        if (k2aVar == null || obj == null) {
            cArr = (char[]) obj;
        } else {
            cArr = k2aVar.apply(obj);
        }
        if (jSONWriter.c) {
            jSONWriter.m2(cArr, 0, cArr.length);
        } else {
            jSONWriter.k2(new String(cArr));
        }
    }
}
