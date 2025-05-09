package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.zip.GZIPOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class xjk extends jkk {
    public static final xjk b = new xjk(null);
    public static final byte[] c = yqf.a("[B");
    public static final long d = ls9.a("[B");

    /* renamed from: a  reason: collision with root package name */
    public final k2a<Object, byte[]> f31428a;

    public xjk(k2a<Object, byte[]> k2aVar) {
        this.f31428a = k2aVar;
    }

    @Override // tb.jkk, tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        byte[] bArr;
        if (jSONWriter.Q0(obj, type)) {
            if (obj == byte[].class) {
                jSONWriter.t2(c, d);
            } else {
                jSONWriter.s2(obj.getClass().getName());
            }
        }
        k2a<Object, byte[]> k2aVar = this.f31428a;
        if (k2aVar == null || obj == null) {
            bArr = (byte[]) obj;
        } else {
            bArr = k2aVar.apply(obj);
        }
        jSONWriter.n1(bArr);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        byte[] bArr;
        if (obj == null) {
            jSONWriter.k1();
            return;
        }
        k2a<Object, byte[]> k2aVar = this.f31428a;
        if (k2aVar != null) {
            bArr = k2aVar.apply(obj);
        } else {
            bArr = (byte[]) obj;
        }
        String b2 = jSONWriter.f2458a.b();
        GZIPOutputStream gZIPOutputStream = null;
        if ("millis".equals(b2)) {
            b2 = null;
        }
        if ("gzip".equals(b2) || "gzip,base64".equals(b2)) {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (bArr.length < 512) {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream, bArr.length);
                    } else {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    }
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    bArr = byteArrayOutputStream.toByteArray();
                    b2d.b(gZIPOutputStream);
                } catch (IOException e) {
                    throw new JSONException("write gzipBytes error", e);
                }
            } catch (Throwable th) {
                b2d.b(gZIPOutputStream);
                throw th;
            }
        }
        if ("base64".equals(b2) || "gzip,base64".equals(b2) || (jSONWriter.C(j) & JSONWriter.Feature.WriteByteArrayAsBase64.mask) != 0) {
            jSONWriter.l1(bArr);
            return;
        }
        jSONWriter.c1();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                jSONWriter.t1();
            }
            jSONWriter.L1(bArr[i]);
        }
        jSONWriter.e();
    }
}
