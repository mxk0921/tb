package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Currency;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class gjk extends jkk {
    public static final gjk b = new gjk(null);
    public static final gjk c = new gjk(null);
    public static final byte[] d = yqf.a(TypeUtils.n(Currency.class));
    public static final long e = ls9.a(TypeUtils.n(Currency.class));

    /* renamed from: a  reason: collision with root package name */
    public final Class f20043a;

    public gjk(Class cls) {
        this.f20043a = cls;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        Currency currency = (Currency) obj;
        if (jSONWriter.M0(currency) && this.f20043a == null) {
            jSONWriter.t2(d, e);
        }
        jSONWriter.k2(currency.getCurrencyCode());
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.d) {
            e(jSONWriter, obj, obj2, type, j);
        } else if (obj == null) {
            jSONWriter.b2();
        } else {
            jSONWriter.k2(((Currency) obj).getCurrencyCode());
        }
    }
}
