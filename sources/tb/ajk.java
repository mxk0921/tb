package tb;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ajk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final ajk f15776a = new ajk();

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q1();
        } else {
            jSONWriter.o1(((Boolean) obj).booleanValue());
        }
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q1();
        } else {
            jSONWriter.o1(((Boolean) obj).booleanValue());
        }
    }
}
