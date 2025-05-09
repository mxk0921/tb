package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.TimeZone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class fkk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final fkk f19363a = new fkk();

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
        } else {
            jSONWriter.k2(((TimeZone) obj).getID());
        }
    }
}
