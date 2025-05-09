package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class akk extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public static final akk f15790a = new akk();

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Class<List> cls;
        if (obj == null) {
            jSONWriter.k1();
            return;
        }
        if (type == TypeUtils.PARAM_TYPE_LIST_STR) {
            cls = List.class;
        } else if (type instanceof Class) {
            cls = (Class) type;
        } else {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    cls = (Class) rawType;
                }
            }
            cls = null;
        }
        Class<?> cls2 = obj.getClass();
        if (cls2 != ArrayList.class && jSONWriter.P0(obj, cls, j)) {
            if (cls2 == yjk.j) {
                cls2 = ArrayList.class;
            }
            jSONWriter.s2(TypeUtils.n(cls2));
        }
        jSONWriter.l2((List) obj);
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
