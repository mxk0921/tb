package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class igk implements jdk {

    /* renamed from: a  reason: collision with root package name */
    public final g3i f21301a;

    public igk(g3i g3iVar) {
        this.f21301a = g3iVar;
        g3iVar.getClass();
        throw null;
    }

    @Override // tb.jdk
    public Object D(long j) {
        return new HashMap();
    }

    @Override // tb.jdk
    public /* synthetic */ Object F(JSONReader jSONReader) {
        return cdk.l(this, jSONReader);
    }

    @Override // tb.jdk
    public /* synthetic */ String G() {
        return JSON.DEFAULT_TYPE_KEY;
    }

    @Override // tb.jdk
    public /* synthetic */ Object a() {
        return cdk.c(this);
    }

    @Override // tb.jdk
    public /* synthetic */ Class b() {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ k2a d() {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ g79 h(long j) {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ Object i(Collection collection) {
        cdk.e(this, collection);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ g79 j(String str) {
        return cdk.h(this, str);
    }

    @Override // tb.jdk
    public /* synthetic */ long m() {
        return jdk.HASH_TYPE;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.F1()) {
            long j2 = j | jSONReader.E0().c;
            Map map = (Map) D(j2);
            while (!jSONReader.E1() && !jSONReader.e1()) {
                if (!jSONReader.C1()) {
                    this.f21301a.a(jSONReader.g2());
                    throw null;
                } else if (jSONReader.z1(f7l.CONDITION_IF_MIDDLE)) {
                    Object T1 = jSONReader.T1();
                    if (T1 != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & j2) == 0) {
                        Object put = map.put(null, T1);
                        if (!(put == null || (JSONReader.Feature.DuplicateKeyValueAsArray.mask & j2) == 0)) {
                            if (put instanceof Collection) {
                                ((Collection) put).add(T1);
                                map.put(null, put);
                            } else {
                                map.put(null, JSONArray.of(put, T1));
                            }
                        }
                    }
                } else {
                    throw new JSONException(jSONReader.a1("illegal json"));
                }
            }
            jSONReader.w1();
            return map;
        } else if (jSONReader.D1()) {
            return null;
        } else {
            throw new JSONException(jSONReader.a1("expect '{', but '" + jSONReader.f0() + "'"));
        }
    }

    @Override // tb.jdk
    public /* synthetic */ Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        return cdk.k(this, jSONReader, type, obj, j);
    }

    @Override // tb.jdk
    public /* synthetic */ Object r(JSONReader jSONReader, Type type, Object obj, long j) {
        cdk.i(this, jSONReader, type, obj, j);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ Object t(Map map, JSONReader.Feature... featureArr) {
        return cdk.g(this, map, featureArr);
    }

    @Override // tb.jdk
    public /* synthetic */ g79 u(long j) {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ long v() {
        return 0L;
    }

    @Override // tb.jdk
    public /* synthetic */ jdk w(ObjectReaderProvider objectReaderProvider, long j) {
        return cdk.b(this, objectReaderProvider, j);
    }

    @Override // tb.jdk
    public /* synthetic */ Object x(Map map, long j) {
        return cdk.f(this, map, j);
    }

    @Override // tb.jdk
    public /* synthetic */ jdk z(JSONReader.c cVar, long j) {
        return cdk.a(this, cVar, j);
    }

    @Override // tb.jdk
    public /* synthetic */ void s(Object obj, String str, Object obj2, long j) {
    }
}
