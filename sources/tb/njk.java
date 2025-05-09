package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class njk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final njk f24776a = new njk();

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.c2();
        } else {
            jSONWriter.J1(((Short) obj).shortValue());
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.c2();
            return;
        }
        jSONWriter.L1(((Short) obj).shortValue());
        if (((jSONWriter.A() | j) & JSONWriter.Feature.WriteClassName.mask) != 0 && type != Short.class && type != Short.TYPE) {
            jSONWriter.e2('S');
        }
    }
}
