package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qik extends jik<Exception> {
    public qik(Class cls, long j, List<FieldWriter> list) {
        super(cls, null, null, j, list);
    }

    @Override // tb.jik, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        o(jSONWriter);
        List<FieldWriter> list = this.g;
        int size = list.size();
        jSONWriter.e1();
        for (int i = 0; i < size; i++) {
            list.get(i).o(jSONWriter, obj);
        }
        jSONWriter.g();
    }

    @Override // tb.jik, tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.d) {
            e(jSONWriter, obj, obj2, type, j);
        } else if (n(jSONWriter)) {
            r(jSONWriter, obj);
        } else {
            jSONWriter.e1();
            if ((jSONWriter.C(j) & (JSONWriter.Feature.WriteClassName.mask | JSONWriter.Feature.WriteThrowableClassName.mask)) != 0) {
                q(jSONWriter);
            }
            List<FieldWriter> list = this.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).o(jSONWriter, obj);
            }
            jSONWriter.g();
        }
    }
}
