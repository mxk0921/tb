package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kjk<E extends Enum<E>> extends jkk {

    /* renamed from: a  reason: collision with root package name */
    public final Member f22706a;
    public final Class b;
    public byte[] c;
    public long d;
    public final Enum[] e;
    public final String[] f;
    public final long[] g;
    public byte[][] h;
    public final String[] i;

    public kjk(Class cls, Class cls2, Member member, String[] strArr, long j) {
        this.b = cls2;
        this.f22706a = member;
        if (member instanceof AccessibleObject) {
            try {
                ((AccessibleObject) member).setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        Enum[] enumArr = (Enum[]) cls2.getEnumConstants();
        this.e = enumArr;
        this.f = new String[enumArr.length];
        this.g = new long[enumArr.length];
        int i = 0;
        while (true) {
            Enum[] enumArr2 = this.e;
            if (i < enumArr2.length) {
                String name = enumArr2[i].name();
                this.f[i] = name;
                this.g[i] = ls9.a(name);
                i++;
            } else {
                this.i = strArr;
                return;
            }
        }
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.R0(obj, type, j)) {
            if (this.c == null) {
                String n = TypeUtils.n(this.b);
                this.c = yqf.a(n);
                this.d = ls9.a(n);
            }
            jSONWriter.t2(this.c, this.d);
        }
        Enum r2 = (Enum) obj;
        if (jSONWriter.n0(JSONWriter.Feature.WriteEnumUsingToString)) {
            jSONWriter.k2(r2.toString());
            return;
        }
        byte[][] bArr = this.h;
        String[] strArr = this.f;
        if (bArr == null) {
            this.h = new byte[strArr.length];
        }
        int ordinal = r2.ordinal();
        byte[] bArr2 = this.h[ordinal];
        if (bArr2 == null) {
            bArr2 = yqf.a(strArr[ordinal]);
            this.h[ordinal] = bArr2;
        }
        jSONWriter.g2(bArr2);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Object obj3;
        String str;
        int ordinal;
        Enum r3 = (Enum) obj;
        if (r3 == null) {
            jSONWriter.b2();
            return;
        }
        Member member = this.f22706a;
        if (member != null) {
            try {
                if (member instanceof Field) {
                    obj3 = ((Field) member).get(obj);
                } else {
                    obj3 = ((Method) member).invoke(obj, new Object[0]);
                }
                if (obj3 != obj) {
                    jSONWriter.j1(obj3);
                    return;
                }
            } catch (Exception e) {
                throw new JSONException("getEnumValue error", e);
            }
        }
        if (jSONWriter.n0(JSONWriter.Feature.WriteEnumUsingToString)) {
            jSONWriter.k2(r3.toString());
            return;
        }
        String[] strArr = this.i;
        if (strArr == null || (ordinal = r3.ordinal()) >= strArr.length) {
            str = null;
        } else {
            str = strArr[ordinal];
        }
        if (str == null) {
            str = r3.name();
        }
        jSONWriter.k2(str);
    }
}
