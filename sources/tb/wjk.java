package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wjk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final wjk f30730a = new wjk();
    public static final byte[] b = yqf.a("[Byte");
    public static final long c = ls9.a("[Byte");

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        if (jSONWriter.Q0(obj, type)) {
            jSONWriter.t2(b, c);
        }
        Byte[] bArr = (Byte[]) obj;
        jSONWriter.d1(bArr.length);
        for (Byte b2 : bArr) {
            if (b2 == null) {
                jSONWriter.b2();
            } else {
                jSONWriter.L1(b2.byteValue());
            }
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        Byte[] bArr = (Byte[]) obj;
        jSONWriter.c1();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                jSONWriter.t1();
            }
            Byte b2 = bArr[i];
            if (b2 == null) {
                jSONWriter.b2();
            } else {
                jSONWriter.L1(b2.byteValue());
            }
        }
        jSONWriter.e();
    }
}
