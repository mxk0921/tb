package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gkk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20060a;
    public static final gkk INSTANCE = new gkk(false);
    public static final gkk DIRECT = new gkk(true);

    public gkk() {
        this(false);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        String obj3 = obj.toString();
        if (this.f20060a) {
            jSONWriter.f2(obj3);
        } else {
            jSONWriter.k2(obj3);
        }
    }

    public gkk(boolean z) {
        this.f20060a = z;
    }
}
