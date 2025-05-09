package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.zip.GZIPInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bfk extends xgk {
    public static final bfk c = new bfk(null);
    public static final long d = ls9.a("[Byte");
    public final String b;

    public bfk(String str) {
        super(Byte[].class);
        this.b = str;
    }

    @Override // tb.xgk, tb.jdk
    public Object i(Collection collection) {
        Byte b;
        Byte[] bArr = new Byte[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                b = null;
            } else if (obj instanceof Number) {
                b = Byte.valueOf(((Number) obj).byteValue());
            } else {
                k2a M = JSONFactory.defaultObjectReaderProvider.M(obj.getClass(), Byte.class);
                if (M != null) {
                    b = (Byte) M.apply(obj);
                } else {
                    throw new JSONException("can not cast to Byte " + obj.getClass());
                }
            }
            bArr[i] = b;
            i++;
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r3v4, types: [byte[], java.lang.Object] */
    @Override // tb.jdk
    public Object o(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.n2()) {
            return null;
        }
        int i = 0;
        if (jSONReader.v1()) {
            Byte[] bArr = new Byte[16];
            while (!jSONReader.u1()) {
                if (!jSONReader.e1()) {
                    int i2 = i + 1;
                    if (i2 - bArr.length > 0) {
                        int length = bArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        bArr = (Byte[]) Arrays.copyOf(bArr, i3);
                    }
                    Integer o2 = jSONReader.o2();
                    bArr[i] = o2 == null ? null : Byte.valueOf(o2.byteValue());
                    i = i2;
                } else {
                    throw new JSONException(jSONReader.a1("input end"));
                }
            }
            jSONReader.w1();
            return Arrays.copyOf(bArr, i);
        } else if (jSONReader.f0() == 'x') {
            return jSONReader.Y1();
        } else {
            if (jSONReader.l1()) {
                String str = this.b;
                if ("hex".equals(str)) {
                    return jSONReader.m2();
                }
                String Q2 = jSONReader.Q2();
                if (Q2.isEmpty()) {
                    return null;
                }
                if ("base64".equals(str)) {
                    return b2d.c(Q2);
                }
                if ("gzip,base64".equals(str) || "gzip".equals(str)) {
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(b2d.c(Q2)));
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            byte[] bArr2 = new byte[1024];
                            int read = gZIPInputStream.read(bArr2);
                            if (read == -1) {
                                jSONReader = byteArrayOutputStream.toByteArray();
                                return jSONReader;
                            } else if (read > 0) {
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                        }
                    } catch (IOException e) {
                        throw new JSONException(jSONReader.a1("unzip bytes error."), e);
                    }
                }
            }
            throw new JSONException(jSONReader.a1("TODO"));
        }
    }

    @Override // tb.jdk
    public Object q(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.y1((byte) -110) && jSONReader.T2() != d) {
            throw new JSONException("not support autoType : " + jSONReader.U0());
        } else if (jSONReader.l1() && "hex".equals(this.b)) {
            return jSONReader.m2();
        } else {
            int c3 = jSONReader.c3();
            if (c3 == -1) {
                return null;
            }
            Byte[] bArr = new Byte[c3];
            for (int i = 0; i < c3; i++) {
                Integer o2 = jSONReader.o2();
                bArr[i] = o2 == null ? null : Byte.valueOf(o2.byteValue());
            }
            return bArr;
        }
    }
}
