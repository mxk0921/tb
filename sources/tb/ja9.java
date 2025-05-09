package tb;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ja9 extends fa9 {
    public ja9(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, Method method, Field field, z92 z92Var) {
        super(str, type, cls, i, j, str2, locale, obj, method, field, z92Var);
    }

    @Override // tb.fa9, tb.g79
    public void h(Object obj, Object obj2) {
        if (obj2 != null || (this.e & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            if (obj2 instanceof Collection) {
                Collection<Object> collection = (Collection) obj2;
                int i = 0;
                for (Object obj3 : collection) {
                    if (obj3 == null) {
                        i++;
                    }
                }
                if (i == collection.size()) {
                    obj2 = new StackTraceElement[0];
                } else {
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[collection.size()];
                    collection.toArray(stackTraceElementArr);
                    obj2 = stackTraceElementArr;
                }
            }
            ((pdk) this.w).a(obj, obj2);
        }
    }
}
