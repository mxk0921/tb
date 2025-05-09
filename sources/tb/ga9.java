package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.util.Date;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class ga9<T> extends fa9<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ga9(java.lang.String r15, java.lang.reflect.Type r16, java.lang.Class r17, int r18, long r19, java.lang.String r21, java.lang.Object r22, java.lang.reflect.Field r23) {
        /*
            r14 = this;
            if (r16 != 0) goto L_0x0008
            java.lang.Class r0 = r23.getType()
            r3 = r0
            goto L_0x000a
        L_0x0008:
            r3 = r16
        L_0x000a:
            r11 = 0
            r13 = 0
            r9 = 0
            r1 = r14
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r8 = r21
            r10 = r22
            r12 = r23
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ga9.<init>(java.lang.String, java.lang.reflect.Type, java.lang.Class, int, long, java.lang.String, java.lang.Object, java.lang.reflect.Field):void");
    }

    public final void O(T t, Object obj) {
        Class cls = this.c;
        if (cls == Integer.TYPE) {
            if (obj instanceof Number) {
                f(t, ((Number) obj).intValue());
                return;
            }
        } else if (cls == Long.TYPE) {
            if (obj instanceof Number) {
                g(t, ((Number) obj).longValue());
                return;
            }
        } else if (cls == Float.TYPE) {
            if (obj instanceof Number) {
                e(t, ((Number) obj).floatValue());
                return;
            }
        } else if (cls == Double.TYPE) {
            if (obj instanceof Number) {
                d(t, ((Number) obj).doubleValue());
                return;
            }
        } else if (cls == Short.TYPE) {
            if (obj instanceof Number) {
                i(t, ((Number) obj).shortValue());
                return;
            }
        } else if (cls == Byte.TYPE) {
            if (obj instanceof Number) {
                a(t, ((Number) obj).byteValue());
                return;
            }
        } else if (cls == Character.TYPE) {
            if (obj instanceof Character) {
                b(t, ((Character) obj).charValue());
                return;
            }
        } else if (cls == Boolean.TYPE && (obj instanceof Boolean)) {
            j(t, ((Boolean) obj).booleanValue());
            return;
        }
        throw new JSONException("set " + this.b + " error, type not support " + obj.getClass());
    }

    @Override // tb.fa9, tb.g79
    public void a(T t, byte b) {
        long j = this.i;
        if (j == -1 || this.c != Byte.TYPE) {
            try {
                this.h.setByte(t, b);
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        } else {
            opf.UNSAFE.putByte(t, j, b);
        }
    }

    @Override // tb.fa9, tb.g79
    public void b(T t, char c) {
        long j = this.i;
        if (j == -1 || this.c != Character.TYPE) {
            try {
                this.h.setChar(t, c);
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        } else {
            opf.UNSAFE.putChar(t, j, c);
        }
    }

    @Override // tb.fa9, tb.g79
    public void d(T t, double d) {
        long j = this.i;
        if (j == -1 || this.c != Double.TYPE) {
            try {
                this.h.setDouble(t, d);
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        } else {
            opf.UNSAFE.putDouble(t, j, d);
        }
    }

    @Override // tb.fa9, tb.g79
    public void e(T t, float f) {
        long j = this.i;
        if (j == -1 || this.c != Float.TYPE) {
            try {
                this.h.setFloat(t, f);
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        } else {
            opf.UNSAFE.putFloat(t, j, f);
        }
    }

    @Override // tb.fa9, tb.g79
    public void f(T t, int i) {
        long j = this.i;
        if (j == -1 || this.c != Integer.TYPE) {
            try {
                this.h.setInt(t, i);
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        } else {
            opf.UNSAFE.putInt(t, j, i);
        }
    }

    @Override // tb.fa9, tb.g79
    public void g(T t, long j) {
        long j2 = this.i;
        if (j2 == -1 || this.c != Long.TYPE) {
            try {
                this.h.setLong(t, j);
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        } else {
            opf.UNSAFE.putLong(t, j2, j);
        }
    }

    @Override // tb.fa9, tb.g79
    public void i(T t, short s) {
        long j = this.i;
        if (j == -1 || this.c != Short.TYPE) {
            try {
                this.h.setShort(t, s);
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        } else {
            opf.UNSAFE.putShort(t, j, s);
        }
    }

    @Override // tb.fa9, tb.g79
    public void j(T t, boolean z) {
        long j = this.i;
        if (j == -1 || this.c != Boolean.TYPE) {
            try {
                this.h.setBoolean(t, z);
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        } else {
            opf.UNSAFE.putBoolean(t, j, z);
        }
    }

    @Override // tb.fa9, tb.g79
    public void h(T t, Object obj) {
        if (obj != null) {
            Class<?> cls = this.c;
            if (cls.isPrimitive()) {
                O(t, obj);
                return;
            } else if (this.d != cls && Map.class.isAssignableFrom(cls) && (obj instanceof Map) && cls != Map.class) {
                obj = y(JSONFactory.b()).t((Map) obj, new JSONReader.Feature[0]);
            } else if (cls != obj.getClass() && !cls.isInstance(obj)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (cls == Date.class) {
                        String str2 = this.f;
                        if (str2 != null) {
                            obj = DateUtils.u(str, str2, wqx.d);
                        } else {
                            long f0 = DateUtils.f0(str, wqx.d);
                            obj = f0 == 0 ? null : new Date(f0);
                        }
                    }
                }
                if (!cls.isInstance(obj)) {
                    obj = TypeUtils.b(obj, this.d);
                }
            }
        } else if ((this.e & JSONReader.Feature.IgnoreSetNullValue.mask) != 0) {
            return;
        }
        long j = this.i;
        if (j != -1) {
            opf.UNSAFE.putObject(t, j, obj);
            return;
        }
        try {
            this.h.set(t, obj);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }
}
