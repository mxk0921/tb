package com.uc.webview.internal.setup.verify;

import com.uc.webview.base.io.d;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import tb.tiv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
abstract class e {
    public static int a(ByteBuffer byteBuffer) {
        d(byteBuffer);
        int capacity = byteBuffer.capacity();
        if (capacity < 22) {
            System.out.println("File size smaller than EOCD min size");
            return -1;
        }
        int i = capacity - 22;
        int min = Math.min(i, 65535);
        for (int i2 = 0; i2 < min; i2++) {
            int i3 = i - i2;
            if (byteBuffer.getInt(i3) == 101010256 && b(byteBuffer, i3 + 20) == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static long b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        return c(byteBuffer, byteBuffer.position() + 16);
    }

    public static long c(ByteBuffer byteBuffer) {
        d(byteBuffer);
        return c(byteBuffer, byteBuffer.position() + 12);
    }

    public static void d(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static int b(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getShort(i) & 65535;
    }

    private static long c(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i) & tiv.INT_MASK;
    }

    public static final boolean a(ByteBuffer byteBuffer, int i) {
        d(byteBuffer);
        int i2 = i - 20;
        return i2 >= 0 && byteBuffer.getInt(i2) == 117853008;
    }

    public static boolean a(String str) throws Exception {
        int indexOf;
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        int i = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    i++;
                    if (i <= 1024) {
                        String name = nextEntry.getName();
                        if (name.contains("../")) {
                            throw new IOException("unsecurity zipfile!");
                        } else if (name.contains("META-INF") && name.endsWith(".SF")) {
                            byte[] bArr = new byte[16384];
                            StringBuilder sb = new StringBuilder();
                            int i2 = 0;
                            while (true) {
                                int read = zipInputStream.read(bArr, 0, 16384);
                                if (read != -1) {
                                    i2 += read;
                                    if (i2 <= 4194304) {
                                        sb.append(new String(bArr, 0, read));
                                    } else {
                                        throw new IOException("Zip contents is too big.");
                                    }
                                } else {
                                    String sb2 = sb.toString();
                                    int indexOf2 = sb2.indexOf("X-Android-APK-Signed");
                                    if (indexOf2 < 0 || (sb2.indexOf(Integer.toString(2), indexOf2 + 20) - indexOf2) - 20 < 0 || indexOf >= 5) {
                                        d.a(zipInputStream);
                                        return false;
                                    }
                                    d.a(zipInputStream);
                                    return true;
                                }
                            }
                        }
                    } else {
                        throw new IOException("Too many files in zip");
                    }
                } else {
                    d.a(zipInputStream);
                    return false;
                }
            } catch (Throwable th) {
                d.a(zipInputStream);
                throw th;
            }
        }
    }
}
