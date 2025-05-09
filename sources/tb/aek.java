package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class aek extends pu6 implements jdk {
    public static final aek l = new aek(null, null);

    public aek(String str, Locale locale) {
        super(str, locale);
    }

    public static aek J(String str, Locale locale) {
        if (str == null) {
            return l;
        }
        return new aek(str, locale);
    }

    @Override // tb.jdk
    public /* synthetic */ Object D(long j) {
        cdk.d(this, j);
        throw null;
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
    public Class b() {
        return Calendar.class;
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
        long j2;
        xqx xqxVar;
        long j3;
        int i;
        q7h q7hVar;
        boolean z;
        long j4;
        boolean z2 = this.g;
        String str = this.f26308a;
        if (z2) {
            String Q2 = jSONReader.Q2();
            try {
                return new SimpleDateFormat(str).parse(Q2);
            } catch (ParseException e) {
                throw new JSONException(jSONReader.a1("parse error : " + Q2), e);
            }
        } else if (jSONReader.D1()) {
            return null;
        } else {
            boolean z3 = this.b;
            if (z3 || this.c) {
                long r2 = jSONReader.r2();
                j2 = z3 ? r2 * 1000 : r2;
            } else if (str != null) {
                boolean z4 = this.i;
                JSONReader.c cVar = jSONReader.f2453a;
                if (z4) {
                    if (jSONReader.p1()) {
                        j4 = jSONReader.H2();
                    } else {
                        j4 = jSONReader.G2();
                    }
                    if (j4 != 0 || !jSONReader.o3()) {
                        Calendar instance = Calendar.getInstance(cVar.l());
                        instance.setTimeInMillis(j4);
                        return instance;
                    }
                    xqxVar = jSONReader.W2();
                } else {
                    jSONReader.O0();
                    DateTimeFormatter I = I(null);
                    if (I == null) {
                        xqxVar = jSONReader.W2();
                    } else if (jSONReader.w && !jSONReader.l1()) {
                        return jSONReader.b2();
                    } else {
                        String Q22 = jSONReader.Q2();
                        if (Q22.isEmpty() || "null".equals(Q22)) {
                            return null;
                        }
                        int i2 = 19;
                        if (!this.f) {
                            if (!this.e) {
                                return I.g(Q22, jSONReader.X0());
                            }
                            if (Q22.length() == 19 && jSONReader.d1(JSONReader.Feature.SupportSmartMatch)) {
                                q7hVar = DateUtils.D(Q22, 0, Q22.length());
                            } else if (str.indexOf(45) == -1 || Q22.indexOf(45) != -1 || !TypeUtils.q(Q22)) {
                                Date g = I.g(Q22, jSONReader.X0());
                                Calendar instance2 = Calendar.getInstance(cVar.l());
                                instance2.setTime(g);
                                return instance2;
                            } else {
                                long parseLong = Long.parseLong(Q22);
                                Calendar instance3 = Calendar.getInstance(cVar.l());
                                instance3.setTimeInMillis(parseLong);
                                return instance3;
                            }
                        } else if (Q22.length() != 19 || (!(z = this.j) && !jSONReader.d1(JSONReader.Feature.SupportSmartMatch))) {
                            try {
                                Date parse = new SimpleDateFormat(str).parse(Q22);
                                Calendar instance4 = Calendar.getInstance(cVar.l());
                                instance4.setTime(parse);
                                return instance4;
                            } catch (ParseException e2) {
                                throw new JSONException("parse format '" + str + "'", e2);
                            }
                        } else {
                            if (z) {
                                i2 = 16;
                            }
                            q7hVar = DateUtils.D(Q22, 0, i2);
                        }
                        xqxVar = xqx.c(q7hVar, cVar.m());
                    }
                }
                if (xqxVar == null) {
                    return null;
                }
                long g2 = xqxVar.g();
                int i3 = xqxVar.f31549a.b.d;
                if (g2 >= 0 || i3 <= 0) {
                    j3 = g2 * 1000;
                    i = i3 / 1000000;
                } else {
                    j3 = (g2 + 1) * 1000;
                    i = (i3 / 1000000) - 1000;
                }
                j2 = j3 + i;
            } else if (!jSONReader.r1() || !jSONReader.A1('\"', 'v', 'a', 'l', '\"')) {
                return jSONReader.b2();
            } else {
                jSONReader.z1(f7l.CONDITION_IF_MIDDLE);
                long r22 = jSONReader.r2();
                jSONReader.E1();
                jSONReader.Z2(false);
                if (r22 == 0 && jSONReader.o3()) {
                    return null;
                }
                j2 = r22;
            }
            Calendar instance5 = Calendar.getInstance();
            instance5.setTimeInMillis(j2);
            return instance5;
        }
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        boolean h1 = jSONReader.h1();
        boolean z = this.b;
        if (h1) {
            long r2 = jSONReader.r2();
            if (z) {
                r2 *= 1000;
            }
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(r2);
            return instance;
        } else if (jSONReader.n2()) {
            return null;
        } else {
            long H2 = jSONReader.H2();
            if (z) {
                H2 *= 1000;
            }
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(H2);
            return instance2;
        }
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
