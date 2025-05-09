package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ejk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final ejk f18622a = new ejk();

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        if (jSONWriter.R0(obj, type, j)) {
            jSONWriter.s2("java.lang.Class");
        }
        jSONWriter.k2(((Class) obj).getName());
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
        } else {
            jSONWriter.k2(((Class) obj).getName());
        }
    }
}
