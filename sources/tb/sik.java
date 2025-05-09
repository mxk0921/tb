package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sik extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final sik f28075a = new sik();

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q1();
        } else {
            jSONWriter.o1(((AtomicBoolean) obj).get());
        }
    }
}
