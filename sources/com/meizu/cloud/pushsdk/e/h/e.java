package com.meizu.cloud.pushsdk.e.h;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e implements Serializable, Comparable<e> {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f5841a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final e b = a(new byte[0]);
    private static final long serialVersionUID = 1;
    final byte[] c;
    transient int d;
    transient String e;

    public e(byte[] bArr) {
        this.c = bArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        e a2 = a(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = e.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            declaredField.set(this, a2.c);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }

    public byte a(int i) {
        return this.c[i];
    }

    public e b() {
        return a("MD5");
    }

    public int c() {
        return this.c.length;
    }

    public String d() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.c, o.f5852a);
        this.e = str2;
        return str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            int c = eVar.c();
            byte[] bArr = this.c;
            if (c == bArr.length && eVar.a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }

    public String toString() {
        String a2;
        StringBuilder sb;
        String str;
        byte[] bArr = this.c;
        if (bArr.length == 0) {
            return "ByteString[size=0]";
        }
        int length = bArr.length;
        int length2 = bArr.length;
        if (length <= 16) {
            a2 = a();
            sb = new StringBuilder("ByteString[size=");
            sb.append(length2);
            str = " data=";
        } else {
            a2 = b().a();
            sb = new StringBuilder("ByteString[size=");
            sb.append(length2);
            str = " md5=";
        }
        sb.append(str);
        sb.append(a2);
        sb.append("]");
        return sb.toString();
    }

    public static e b(String str) {
        if (str != null) {
            e eVar = new e(str.getBytes(o.f5852a));
            eVar.e = str;
            return eVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: a */
    public int compareTo(e eVar) {
        int c = c();
        int c2 = eVar.c();
        int min = Math.min(c, c2);
        for (int i = 0; i < min; i++) {
            int a2 = a(i) & 255;
            int a3 = eVar.a(i) & 255;
            if (a2 != a3) {
                return a2 < a3 ? -1 : 1;
            }
        }
        if (c == c2) {
            return 0;
        }
        return c < c2 ? -1 : 1;
    }

    public static e a(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i >= 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new e(bArr);
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + i);
        }
    }

    private e a(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static e a(byte... bArr) {
        if (bArr != null) {
            return new e((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        byte[] bArr = this.c;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f5841a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public void a(b bVar) {
        byte[] bArr = this.c;
        bVar.a(bArr, 0, bArr.length);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.c;
        return i <= bArr2.length - i3 && i2 <= bArr.length - i3 && o.a(bArr2, i, bArr, i2, i3);
    }
}
