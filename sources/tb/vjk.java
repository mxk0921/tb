package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class vjk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final vjk f30044a = new vjk();

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.c2();
        } else {
            jSONWriter.R1(((Byte) obj).byteValue());
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.c2();
            return;
        }
        jSONWriter.L1(((Number) obj).intValue());
        if (((jSONWriter.A() | j) & JSONWriter.Feature.WriteClassName.mask) != 0 && type != Byte.class && type != Byte.TYPE) {
            jSONWriter.e2('B');
        }
    }
}
