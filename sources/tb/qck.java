package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qck extends xgk {
    public static final qck INSTANCE = new qck();
    public static final long TYPE_HASH_CODE = 20315;

    public qck() {
        super(Object[].class);
    }

    /* renamed from: c */
    public Object[] i(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            objArr[i] = obj;
            i++;
        }
        return objArr;
    }

    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        Object obj2;
        if (jSONReader.D1()) {
            return null;
        }
        if (jSONReader.v1()) {
            Object[] objArr = new Object[16];
            int i = 0;
            while (!jSONReader.u1()) {
                int i2 = i + 1;
                if (i2 - objArr.length > 0) {
                    int length = objArr.length;
                    int i3 = length + (length >> 1);
                    if (i3 - i2 < 0) {
                        i3 = i2;
                    }
                    objArr = Arrays.copyOf(objArr, i3);
                }
                char f0 = jSONReader.f0();
                if (f0 != '\"') {
                    if (f0 != '+') {
                        if (f0 != '[') {
                            if (f0 != 'f') {
                                if (f0 == 'n') {
                                    jSONReader.I2();
                                    obj2 = null;
                                } else if (f0 != 't') {
                                    if (f0 == '{') {
                                        obj2 = jSONReader.M2();
                                    } else if (!(f0 == '-' || f0 == '.')) {
                                        switch (f0) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                throw new JSONException(jSONReader.Z0());
                                        }
                                    }
                                }
                            }
                            obj2 = Boolean.valueOf(jSONReader.a2());
                        } else {
                            obj2 = jSONReader.U1();
                        }
                    }
                    obj2 = jSONReader.K2();
                } else {
                    obj2 = jSONReader.Q2();
                }
                objArr[i] = obj2;
                i = i2;
            }
            jSONReader.w1();
            return Arrays.copyOf(objArr, i);
        }
        throw new JSONException(jSONReader.a1("TODO"));
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        Object obj2;
        jdk c0;
        if (jSONReader.W0() == -110 && (c0 = jSONReader.c0(Object[].class, TYPE_HASH_CODE, j)) != this) {
            return c0.q(jSONReader, type, obj, j);
        }
        int c3 = jSONReader.c3();
        if (c3 == -1) {
            return null;
        }
        Object[] objArr = new Object[c3];
        for (int i = 0; i < c3; i++) {
            byte W0 = jSONReader.W0();
            if (W0 >= 73 && W0 <= 125) {
                obj2 = jSONReader.Q2();
            } else if (W0 == -110) {
                jdk c02 = jSONReader.c0(Object.class, 0L, j);
                if (c02 != null) {
                    obj2 = c02.q(jSONReader, null, null, j);
                } else {
                    obj2 = jSONReader.T1();
                }
            } else if (W0 == -81) {
                jSONReader.t1();
                obj2 = null;
            } else if (W0 == -79) {
                jSONReader.t1();
                obj2 = Boolean.TRUE;
            } else if (W0 == -80) {
                jSONReader.t1();
                obj2 = Boolean.FALSE;
            } else if (W0 == -66) {
                obj2 = Long.valueOf(jSONReader.r2());
            } else {
                obj2 = jSONReader.T1();
            }
            objArr[i] = obj2;
        }
        return objArr;
    }
}
