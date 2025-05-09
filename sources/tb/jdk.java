package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface jdk<T> {
    public static final long HASH_TYPE = 435678704704L;

    T D(long j);

    T F(JSONReader jSONReader);

    String G();

    T a();

    Class<T> b();

    k2a d();

    g79 h(long j);

    T i(Collection collection);

    g79 j(String str);

    long m();

    T o(JSONReader jSONReader, Type type, Object obj, long j);

    T q(JSONReader jSONReader, Type type, Object obj, long j);

    T r(JSONReader jSONReader, Type type, Object obj, long j);

    void s(Object obj, String str, Object obj2, long j);

    T t(Map map, JSONReader.Feature... featureArr);

    g79 u(long j);

    long v();

    jdk w(ObjectReaderProvider objectReaderProvider, long j);

    T x(Map map, long j);

    jdk z(JSONReader.c cVar, long j);
}
