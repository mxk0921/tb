package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zjk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public final Class f32804a;
    public final Class b;
    public final long c;

    public zjk(Class cls, Class cls2, long j) {
        this.f32804a = cls;
        this.b = cls2;
        this.c = j;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String str;
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        Class<?> cls = obj.getClass();
        if (jSONWriter.M0(obj) && this.f32804a != cls) {
            jSONWriter.s2(TypeUtils.n(cls));
        }
        List list = (List) obj;
        int size = list.size();
        jSONWriter.d1(size);
        boolean n0 = jSONWriter.n0(JSONWriter.Feature.WriteEnumUsingToString);
        for (int i = 0; i < size; i++) {
            Enum r4 = (Enum) list.get(i);
            Class<?> cls2 = r4.getClass();
            if (cls2 != this.b) {
                jSONWriter.F(cls2).e(jSONWriter, r4, null, this.b, this.c | j);
            } else {
                if (n0) {
                    str = r4.toString();
                } else {
                    str = r4.name();
                }
                jSONWriter.k2(str);
            }
        }
        jSONWriter.e();
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        List list = (List) obj;
        jSONWriter.c1();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                jSONWriter.t1();
            }
            String str = (String) list.get(i);
            if (str == null) {
                jSONWriter.b2();
            } else {
                jSONWriter.k2(str);
            }
        }
        jSONWriter.e();
    }
}
