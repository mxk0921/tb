package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.BufferedSource;
import okio.ByteString;
import tb.a8l;
import tb.qwf;
import tb.zhh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class JsonReader implements Closeable {
    public static final String[] e = new String[128];

    /* renamed from: a  reason: collision with root package name */
    public int f1858a;
    public int[] b = new int[32];
    public String[] c = new String[32];
    public int[] d = new int[32];

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f1859a;
        public final a8l b;

        public a(String[] strArr, a8l a8lVar) {
            this.f1859a = strArr;
            this.b = a8lVar;
        }

        public static a a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                okio.a aVar = new okio.a();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.L0(aVar, strArr[i]);
                    aVar.readByte();
                    byteStringArr[i] = aVar.L();
                }
                return new a((String[]) strArr.clone(), a8l.d(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void L0(tb.ym2 r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.e
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        L_0x000d:
            if (r3 >= r2) goto L_0x0036
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L_0x001c
            r5 = r0[r5]
            if (r5 != 0) goto L_0x0029
            goto L_0x0033
        L_0x001c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L_0x0023
            java.lang.String r5 = "\\u2028"
            goto L_0x0029
        L_0x0023:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L_0x0033
            java.lang.String r5 = "\\u2029"
        L_0x0029:
            if (r4 >= r3) goto L_0x002e
            r7.l(r8, r4, r3)
        L_0x002e:
            r7.writeUtf8(r5)
            int r4 = r3 + 1
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0036:
            if (r4 >= r2) goto L_0x003b
            r7.l(r8, r4, r2)
        L_0x003b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.L0(tb.ym2, java.lang.String):void");
    }

    public static JsonReader n0(BufferedSource bufferedSource) {
        return new com.airbnb.lottie.parser.moshi.a(bufferedSource);
    }

    public abstract void A() throws IOException;

    public final void B0(int i) {
        int i2 = this.f1858a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                zhh.b("Nesting too deep at " + C());
                return;
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i3 = this.f1858a;
        this.f1858a = i3 + 1;
        iArr3[i3] = i;
    }

    public final String C() {
        return qwf.a(this.f1858a, this.b, this.c, this.d);
    }

    public abstract int C0(a aVar) throws IOException;

    public abstract void D0() throws IOException;

    public abstract void E0() throws IOException;

    public abstract boolean F() throws IOException;

    public abstract boolean L() throws IOException;

    public final JsonEncodingException M0(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + C());
    }

    public abstract double Z() throws IOException;

    public abstract int c0() throws IOException;

    public abstract void e() throws IOException;

    public abstract String f0() throws IOException;

    public abstract void g() throws IOException;

    public abstract String i0() throws IOException;

    public abstract Token u0() throws IOException;

    public abstract void w() throws IOException;
}
