package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class bkk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final bkk f16448a = new bkk();

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
        } else {
            jSONWriter.k2(((Locale) obj).toString());
        }
    }
}
