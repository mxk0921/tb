package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface iik<T> {
    void A(e1n e1nVar);

    void B(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j);

    void C(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j);

    FieldWriter E(long j);

    void c(h1n h1nVar);

    void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j);

    void f(qij qijVar);

    void g(y1w y1wVar);

    void k(JSONWriter jSONWriter, Object obj);

    void l(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j);

    boolean n(JSONWriter jSONWriter);

    List<FieldWriter> p();

    void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j);
}
