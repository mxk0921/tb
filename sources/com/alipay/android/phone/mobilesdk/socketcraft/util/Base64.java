package com.alipay.android.phone.mobilesdk.socketcraft.util;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPOutputStream;
import tb.c0z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Base64 {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DECODE = 0;
    public static final int DONT_GUNZIP = 4;
    public static final int DO_BREAK_LINES = 8;
    public static final int ENCODE = 1;
    public static final int GZIP = 2;
    public static final int NO_OPTIONS = 0;
    public static final int ORDERED = 32;
    public static final int URL_SAFE = 16;

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f3765a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 43, 47};
    public static final byte[] b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, c0z.MAP32, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    public static final byte[] c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 45, 95};
    public static final byte[] d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, c0z.MAP32, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    public static final byte[] e = {45, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    public static final byte[] f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class InputStream extends FilterInputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3766a;
        public int b;
        public final byte[] c;
        public final int d;
        public int e;
        public int f;
        public final boolean g;
        public final int h;
        public final byte[] i;

        public InputStream(java.io.InputStream inputStream) {
            this(inputStream, 0);
        }

        public static /* synthetic */ Object ipc$super(InputStream inputStream, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/util/Base64$InputStream");
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
            }
            if (this.b < 0) {
                if (this.f3766a) {
                    byte[] bArr = new byte[3];
                    int i = 0;
                    for (int i2 = 0; i2 < 3; i2++) {
                        int read2 = ((FilterInputStream) this).in.read();
                        if (read2 < 0) {
                            break;
                        }
                        bArr[i2] = (byte) read2;
                        i++;
                    }
                    if (i <= 0) {
                        return -1;
                    }
                    Base64.access$100(bArr, 0, i, this.c, 0, this.h);
                    this.b = 0;
                    this.e = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i3 = 0;
                    while (i3 < 4) {
                        do {
                            read = ((FilterInputStream) this).in.read();
                            if (read < 0) {
                                break;
                            }
                        } while (this.i[read & 127] <= -5);
                        if (read < 0) {
                            break;
                        }
                        bArr2[i3] = (byte) read;
                        i3++;
                    }
                    if (i3 == 4) {
                        this.e = Base64.access$200(bArr2, 0, this.c, 0, this.h);
                        this.b = 0;
                    } else if (i3 == 0) {
                        return -1;
                    } else {
                        throw new IOException("Improperly padded Base64 input.");
                    }
                }
            }
            int i4 = this.b;
            if (i4 < 0) {
                throw new IOException("Error in Base64 code reading stream.");
            } else if (i4 >= this.e) {
                return -1;
            } else {
                if (!this.f3766a || !this.g || this.f < 76) {
                    this.f++;
                    byte[] bArr3 = this.c;
                    int i5 = 1 + i4;
                    this.b = i5;
                    byte b = bArr3[i4];
                    if (i5 >= this.d) {
                        this.b = -1;
                    }
                    return b & 255;
                }
                this.f = 0;
                return 10;
            }
        }

        public InputStream(java.io.InputStream inputStream, int i) {
            super(inputStream);
            this.h = i;
            boolean z = true;
            this.g = (i & 8) > 0;
            z = (i & 1) <= 0 ? false : z;
            this.f3766a = z;
            int i2 = z ? 4 : 3;
            this.d = i2;
            this.c = new byte[i2];
            this.b = -1;
            this.f = 0;
            this.i = Base64.access$000(i);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
            }
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int read = read();
                if (read >= 0) {
                    bArr[i + i3] = (byte) read;
                    i3++;
                } else if (i3 == 0) {
                    return -1;
                }
            }
            return i3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class OutputStream extends FilterOutputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3767a;
        public int b;
        public byte[] c;
        public final int d;
        public int e;
        public final boolean f;
        public final byte[] g;
        public boolean h;
        public final int i;
        public final byte[] j;

        public OutputStream(java.io.OutputStream outputStream) {
            this(outputStream, 1);
        }

        public static /* synthetic */ Object ipc$super(OutputStream outputStream, String str, Object... objArr) {
            if (str.hashCode() == -483678593) {
                super.close();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/util/Base64$OutputStream");
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            flushBase64();
            super.close();
            this.c = null;
            ((FilterOutputStream) this).out = null;
        }

        public void flushBase64() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b87047a", new Object[]{this});
                return;
            }
            int i = this.b;
            if (i <= 0) {
                return;
            }
            if (this.f3767a) {
                ((FilterOutputStream) this).out.write(Base64.access$300(this.g, this.c, i, this.i));
                this.b = 0;
                return;
            }
            throw new IOException("Base64 input not properly padded.");
        }

        public void resumeEncoding() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddfd1127", new Object[]{this});
            } else {
                this.h = false;
            }
        }

        public void suspendEncoding() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9754ab6", new Object[]{this});
                return;
            }
            flushBase64();
            this.h = true;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
            } else if (this.h) {
                ((FilterOutputStream) this).out.write(i);
            } else if (this.f3767a) {
                byte[] bArr = this.c;
                int i2 = this.b;
                int i3 = 1 + i2;
                this.b = i3;
                bArr[i2] = (byte) i;
                int i4 = this.d;
                if (i3 >= i4) {
                    ((FilterOutputStream) this).out.write(Base64.access$300(this.g, bArr, i4, this.i));
                    int i5 = this.e + 4;
                    this.e = i5;
                    if (this.f && i5 >= 76) {
                        ((FilterOutputStream) this).out.write(10);
                        this.e = 0;
                    }
                    this.b = 0;
                }
            } else {
                byte b = this.j[i & 127];
                if (b > -5) {
                    byte[] bArr2 = this.c;
                    int i6 = this.b;
                    int i7 = 1 + i6;
                    this.b = i7;
                    bArr2[i6] = (byte) i;
                    if (i7 >= this.d) {
                        ((FilterOutputStream) this).out.write(this.g, 0, Base64.access$200(bArr2, 0, this.g, 0, this.i));
                        this.b = 0;
                    }
                } else if (b != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
            }
        }

        public OutputStream(java.io.OutputStream outputStream, int i) {
            super(outputStream);
            boolean z = true;
            this.f = (i & 8) != 0;
            z = (i & 1) == 0 ? false : z;
            this.f3767a = z;
            int i2 = z ? 3 : 4;
            this.d = i2;
            this.c = new byte[i2];
            this.b = 0;
            this.e = 0;
            this.h = false;
            this.g = new byte[4];
            this.i = i;
            this.j = Base64.access$000(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            } else if (this.h) {
                ((FilterOutputStream) this).out.write(bArr, i, i2);
            } else {
                for (int i3 = 0; i3 < i2; i3++) {
                    write(bArr[i + i3]);
                }
            }
        }
    }

    public static int a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d91577d", new Object[]{bArr, new Integer(i), bArr2, new Integer(i2), new Integer(i3)})).intValue();
        }
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        } else if (bArr2 == null) {
            throw new NullPointerException("Destination array was null.");
        } else if (i < 0 || (i4 = i + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i)));
        } else if (i2 < 0 || (i5 = i2 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i2)));
        } else {
            byte[] e2 = e(i3);
            byte b2 = bArr[i + 2];
            if (b2 == 61) {
                bArr2[i2] = (byte) ((((e2[bArr[i + 1]] & 255) << 12) | ((e2[bArr[i]] & 255) << 18)) >>> 16);
                return 1;
            }
            byte b3 = bArr[i4];
            if (b3 == 61) {
                int i6 = ((e2[bArr[i + 1]] & 255) << 12) | ((e2[bArr[i]] & 255) << 18) | ((e2[b2] & 255) << 6);
                bArr2[i2] = (byte) (i6 >>> 16);
                bArr2[i2 + 1] = (byte) (i6 >>> 8);
                return 2;
            }
            int i7 = ((e2[bArr[i + 1]] & 255) << 12) | ((e2[bArr[i]] & 255) << 18) | ((e2[b2] & 255) << 6) | (e2[b3] & 255);
            bArr2[i2] = (byte) (i7 >> 16);
            bArr2[i2 + 1] = (byte) (i7 >> 8);
            bArr2[i5] = (byte) i7;
            return 3;
        }
    }

    public static /* synthetic */ byte[] access$000(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("df7ff3f1", new Object[]{new Integer(i)});
        }
        return e(i);
    }

    public static /* synthetic */ byte[] access$100(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("edfc4397", new Object[]{bArr, new Integer(i), new Integer(i2), bArr2, new Integer(i3), new Integer(i4)});
        }
        return b(bArr, i, i2, bArr2, i3, i4);
    }

    public static /* synthetic */ int access$200(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("885f05d", new Object[]{bArr, new Integer(i), bArr2, new Integer(i2), new Integer(i3)})).intValue();
        }
        return a(bArr, i, bArr2, i2, i3);
    }

    public static /* synthetic */ byte[] access$300(byte[] bArr, byte[] bArr2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("784cef75", new Object[]{bArr, bArr2, new Integer(i), new Integer(i2)});
        }
        return c(bArr, bArr2, i, i2);
    }

    public static byte[] b(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8575550c", new Object[]{bArr, new Integer(i), new Integer(i2), bArr2, new Integer(i3), new Integer(i4)});
        }
        byte[] d2 = d(i4);
        if (i2 > 0) {
            i5 = (bArr[i] << 24) >>> 8;
        } else {
            i5 = 0;
        }
        if (i2 > 1) {
            i6 = (bArr[i + 1] << 24) >>> 16;
        } else {
            i6 = 0;
        }
        int i8 = i5 | i6;
        if (i2 > 2) {
            i7 = (bArr[i + 2] << 24) >>> 24;
        }
        int i9 = i8 | i7;
        if (i2 == 1) {
            bArr2[i3] = d2[i9 >>> 18];
            bArr2[1 + i3] = d2[(i9 >>> 12) & 63];
            bArr2[2 + i3] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 == 2) {
            bArr2[i3] = d2[i9 >>> 18];
            bArr2[1 + i3] = d2[(i9 >>> 12) & 63];
            bArr2[2 + i3] = d2[(i9 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 != 3) {
            return bArr2;
        } else {
            bArr2[i3] = d2[i9 >>> 18];
            bArr2[1 + i3] = d2[(i9 >>> 12) & 63];
            bArr2[2 + i3] = d2[(i9 >>> 6) & 63];
            bArr2[i3 + 3] = d2[i9 & 63];
            return bArr2;
        }
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("aa9a46ec", new Object[]{bArr, bArr2, new Integer(i), new Integer(i2)});
        }
        b(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    public static final byte[] d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("948d3e2a", new Object[]{new Integer(i)});
        }
        if ((i & 16) == 16) {
            return c;
        }
        if ((i & 32) == 32) {
            return e;
        }
        return f3765a;
    }

    public static byte[] decode(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("65e18561", new Object[]{bArr}) : decode(bArr, 0, bArr.length, 0);
    }

    public static void decodeFileToFile(String str, String str2) {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af67a0dc", new Object[]{str, str2});
            return;
        }
        byte[] decodeFromFile = decodeFromFile(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                bufferedOutputStream.write(decodeFromFile);
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e2) {
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream2 = bufferedOutputStream;
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e3) {
            throw e3;
        }
    }

    public static byte[] decodeFromFile(String str) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cf6db598", new Object[]{str});
        }
        InputStream inputStream = null;
        try {
            try {
                File file = new File(str);
                if (file.length() <= 2147483647L) {
                    byte[] bArr = new byte[(int) file.length()];
                    InputStream inputStream2 = new InputStream(new BufferedInputStream(new FileInputStream(file)), 0);
                    int i = 0;
                    while (true) {
                        try {
                            int read = inputStream2.read(bArr, i, 4096);
                            if (read < 0) {
                                break;
                            }
                            i += read;
                        } catch (IOException e2) {
                            throw e2;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStream2;
                            try {
                                inputStream.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    }
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    try {
                        inputStream2.close();
                    } catch (Exception unused2) {
                    }
                    return bArr2;
                }
                throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
            } catch (IOException e3) {
                throw e3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void decodeToFile(String str, String str2) {
        Throwable th;
        OutputStream outputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f10f40", new Object[]{str, str2});
            return;
        }
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = new OutputStream(new FileOutputStream(str2), 0);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                outputStream.write(str.getBytes(EncodingUtils.US_ASCII));
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e2) {
            } catch (Throwable th3) {
                th = th3;
                outputStream2 = outputStream;
                try {
                    outputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e3) {
            throw e3;
        }
    }

    public static Object decodeToObject(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dcd6e619", new Object[]{str}) : decodeToObject(str, 0, null);
    }

    public static final byte[] e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6da43ff2", new Object[]{new Integer(i)});
        }
        if ((i & 16) == 16) {
            return d;
        }
        if ((i & 32) == 32) {
            return f;
        }
        return b;
    }

    public static void encode(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552c1ffd", new Object[]{byteBuffer, byteBuffer2});
            return;
        }
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            c(bArr2, bArr, min, 0);
            byteBuffer2.put(bArr2);
        }
    }

    public static String encodeBytes(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9a7bb3d", new Object[]{bArr});
        }
        try {
            return encodeBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static byte[] encodeBytesToBytes(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("241f2db4", new Object[]{bArr});
        }
        try {
            return encodeBytesToBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static void encodeFileToFile(String str, String str2) {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2494f304", new Object[]{str, str2});
            return;
        }
        String encodeFromFile = encodeFromFile(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedOutputStream.write(encodeFromFile.getBytes(EncodingUtils.US_ASCII));
            try {
                bufferedOutputStream.close();
            } catch (Exception unused) {
            }
        } catch (IOException e3) {
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream2 = bufferedOutputStream;
            try {
                bufferedOutputStream2.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }

    public static String encodeFromFile(String str) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24acf233", new Object[]{str});
        }
        InputStream inputStream = null;
        try {
            try {
                File file = new File(str);
                byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
                InputStream inputStream2 = new InputStream(new BufferedInputStream(new FileInputStream(file)), 1);
                int i = 0;
                while (true) {
                    try {
                        int read = inputStream2.read(bArr, i, 4096);
                        if (read < 0) {
                            break;
                        }
                        i += read;
                    } catch (IOException e2) {
                        throw e2;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                String str2 = new String(bArr, 0, i, EncodingUtils.US_ASCII);
                try {
                    inputStream2.close();
                } catch (Exception unused2) {
                }
                return str2;
            } catch (IOException e3) {
                throw e3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String encodeObject(Serializable serializable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("855a1c90", new Object[]{serializable}) : encodeObject(serializable, 0);
    }

    public static void encodeToFile(byte[] bArr, String str) {
        Throwable th;
        OutputStream outputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f64325", new Object[]{bArr, str});
        } else if (bArr != null) {
            OutputStream outputStream2 = null;
            try {
                try {
                    outputStream = new OutputStream(new FileOutputStream(str), 1);
                } catch (IOException e2) {
                    throw e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                outputStream.write(bArr);
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e3) {
            } catch (Throwable th3) {
                th = th3;
                outputStream2 = outputStream;
                try {
                    outputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } else {
            throw new NullPointerException("Data to encode was null.");
        }
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("34c1b396", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        } else if (i < 0 || (i4 = i + i2) > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        } else if (i2 == 0) {
            return new byte[0];
        } else {
            if (i2 >= 4) {
                byte[] e2 = e(i3);
                byte[] bArr2 = new byte[(i2 * 3) / 4];
                byte[] bArr3 = new byte[4];
                int i5 = 0;
                int i6 = 0;
                while (i < i4) {
                    byte b2 = bArr[i];
                    byte b3 = e2[b2 & 255];
                    if (b3 >= -5) {
                        if (b3 >= -1) {
                            int i7 = i5 + 1;
                            bArr3[i5] = b2;
                            if (i7 > 3) {
                                i6 += a(bArr3, 0, bArr2, i6, i3);
                                if (bArr[i] == 61) {
                                    break;
                                }
                                i5 = 0;
                            } else {
                                i5 = i7;
                            }
                        }
                        i++;
                    } else {
                        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i] & 255), Integer.valueOf(i)));
                    }
                }
                byte[] bArr4 = new byte[i6];
                System.arraycopy(bArr2, 0, bArr4, 0, i6);
                return bArr4;
            }
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static Object decodeToObject(String str, int i, final ClassLoader classLoader) {
        ObjectInputStream objectInputStream;
        Throwable th;
        IOException e2;
        ClassNotFoundException e3;
        ByteArrayInputStream byteArrayInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f230b7f2", new Object[]{str, new Integer(i), classLoader});
        }
        byte[] decode = decode(str, i);
        ByteArrayInputStream byteArrayInputStream2 = null;
        r4 = null;
        r4 = null;
        ObjectInputStream objectInputStream2 = null;
        byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(decode);
            } catch (Throwable th2) {
                th = th2;
                objectInputStream = classLoader;
            }
            try {
                if (classLoader == null) {
                    objectInputStream2 = new ObjectInputStream(byteArrayInputStream);
                } else {
                    objectInputStream2 = new ObjectInputStream(byteArrayInputStream) { // from class: com.alipay.android.phone.mobilesdk.socketcraft.util.Base64.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                            if (str2.hashCode() == 1072899230) {
                                return super.resolveClass((ObjectStreamClass) objArr[0]);
                            }
                            int hashCode = str2.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/util/Base64$1");
                        }

                        @Override // java.io.ObjectInputStream
                        public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Class) ipChange2.ipc$dispatch("3ff3249e", new Object[]{this, objectStreamClass});
                            }
                            Class<?> cls = Class.forName(objectStreamClass.getName(), false, classLoader);
                            if (cls == null) {
                                return super.resolveClass(objectStreamClass);
                            }
                            return cls;
                        }
                    };
                }
                Object readObject = objectInputStream2.readObject();
                try {
                    byteArrayInputStream.close();
                } catch (Exception unused) {
                }
                try {
                    objectInputStream2.close();
                } catch (Exception unused2) {
                }
                return readObject;
            } catch (IOException e4) {
                e2 = e4;
                throw e2;
            } catch (ClassNotFoundException e5) {
                e3 = e5;
                throw e3;
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream2 = byteArrayInputStream;
                objectInputStream = objectInputStream2;
                try {
                    byteArrayInputStream2.close();
                } catch (Exception unused3) {
                }
                try {
                    objectInputStream.close();
                } catch (Exception unused4) {
                }
                throw th;
            }
        } catch (IOException e6) {
            e2 = e6;
        } catch (ClassNotFoundException e7) {
            e3 = e7;
        } catch (Throwable th4) {
            th = th4;
            objectInputStream = 0;
        }
    }

    public static String encodeBytes(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ccce9500", new Object[]{bArr, new Integer(i)}) : encodeBytes(bArr, 0, bArr.length, i);
    }

    public static byte[] encodeBytesToBytes(byte[] bArr, int i, int i2, int i3) {
        OutputStream outputStream;
        IOException e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bde8c663", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        } else if (i < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i);
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i2);
        } else if (i + i2 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
        } else if ((i3 & 2) != 0) {
            ByteArrayOutputStream byteArrayOutputStream = null;
            r1 = null;
            r1 = null;
            GZIPOutputStream gZIPOutputStream = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    outputStream = new OutputStream(byteArrayOutputStream, i3 | 1);
                } catch (IOException e3) {
                    e2 = e3;
                    outputStream = null;
                    gZIPOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    outputStream = null;
                }
                try {
                    gZIPOutputStream = new GZIPOutputStream(outputStream);
                } catch (IOException e4) {
                    e2 = e4;
                    gZIPOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception unused) {
                    }
                    try {
                        outputStream.close();
                    } catch (Exception unused2) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused3) {
                    }
                    throw th;
                }
                try {
                    gZIPOutputStream.write(bArr, i, i2);
                    gZIPOutputStream.close();
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception unused4) {
                    }
                    try {
                        outputStream.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused6) {
                    }
                    return byteArrayOutputStream.toByteArray();
                } catch (IOException e5) {
                    e2 = e5;
                    byteArrayOutputStream = byteArrayOutputStream;
                    try {
                        throw e2;
                    } catch (Throwable th3) {
                        th = th3;
                        gZIPOutputStream.close();
                        outputStream.close();
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    gZIPOutputStream.close();
                    outputStream.close();
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (IOException e6) {
                e2 = e6;
                outputStream = null;
                gZIPOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
                outputStream = null;
            }
        } else {
            boolean z = (i3 & 8) != 0;
            int i4 = ((i2 / 3) * 4) + (i2 % 3 > 0 ? 4 : 0);
            if (z) {
                i4 += i4 / 76;
            }
            byte[] bArr2 = new byte[i4];
            int i5 = i2 - 2;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < i5) {
                b(bArr, i6 + i, 3, bArr2, i7, i3);
                int i9 = i8 + 4;
                if (!z || i9 < 76) {
                    i8 = i9;
                } else {
                    bArr2[i7 + 4] = 10;
                    i7++;
                    i8 = 0;
                }
                i6 += 3;
                i7 += 4;
                bArr2 = bArr2;
                i5 = i5;
                i4 = i4;
            }
            if (i6 < i2) {
                b(bArr, i6 + i, i2 - i6, bArr2, i7, i3);
                i7 += 4;
            }
            if (i7 > i4 - 1) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i7];
            System.arraycopy(bArr2, 0, bArr3, 0, i7);
            return bArr3;
        }
    }

    public static String encodeObject(Serializable serializable, int i) {
        ObjectOutputStream objectOutputStream;
        IOException e2;
        OutputStream outputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67685e0d", new Object[]{serializable, new Integer(i)});
        }
        if (serializable != null) {
            ByteArrayOutputStream byteArrayOutputStream = null;
            r2 = null;
            r2 = null;
            r2 = null;
            r2 = null;
            r2 = null;
            ObjectOutputStream objectOutputStream2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    outputStream = new OutputStream(byteArrayOutputStream, 1 | i);
                    try {
                        if ((i & 2) != 0) {
                            objectOutputStream = new GZIPOutputStream(outputStream);
                            try {
                                objectOutputStream2 = new ObjectOutputStream(objectOutputStream);
                                objectOutputStream = objectOutputStream;
                            } catch (IOException e3) {
                                e2 = e3;
                                objectOutputStream = objectOutputStream;
                                byteArrayOutputStream = byteArrayOutputStream;
                                try {
                                    throw e2;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        objectOutputStream2.close();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        objectOutputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        outputStream.close();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused4) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                objectOutputStream2.close();
                                objectOutputStream.close();
                                outputStream.close();
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } else {
                            objectOutputStream2 = new ObjectOutputStream(outputStream);
                            objectOutputStream = null;
                        }
                        objectOutputStream2.writeObject(serializable);
                        try {
                            objectOutputStream2.close();
                        } catch (Exception unused5) {
                        }
                        try {
                            objectOutputStream.close();
                        } catch (Exception unused6) {
                        }
                        try {
                            outputStream.close();
                        } catch (Exception unused7) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused8) {
                        }
                        try {
                            return new String(byteArrayOutputStream.toByteArray(), EncodingUtils.US_ASCII);
                        } catch (UnsupportedEncodingException unused9) {
                            return new String(byteArrayOutputStream.toByteArray());
                        }
                    } catch (IOException e4) {
                        e2 = e4;
                        objectOutputStream2 = objectOutputStream2;
                        objectOutputStream = objectOutputStream2;
                    } catch (Throwable th3) {
                        th = th3;
                        objectOutputStream = objectOutputStream2;
                    }
                } catch (IOException e5) {
                    e2 = e5;
                    objectOutputStream = null;
                    objectOutputStream2 = null;
                    outputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    objectOutputStream = null;
                    outputStream = null;
                }
            } catch (IOException e6) {
                e2 = e6;
                objectOutputStream = null;
                objectOutputStream2 = null;
                outputStream = null;
            } catch (Throwable th5) {
                th = th5;
                objectOutputStream = null;
                byteArrayOutputStream = null;
                outputStream = null;
            }
        } else {
            throw new NullPointerException("Cannot serialize a null object.");
        }
    }

    public static String encodeBytes(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e82f39d", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        try {
            return encodeBytes(bArr, i, i2, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String encodeBytes(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35a68a0", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        byte[] encodeBytesToBytes = encodeBytesToBytes(bArr, i, i2, i3);
        try {
            return new String(encodeBytesToBytes, EncodingUtils.US_ASCII);
        } catch (UnsupportedEncodingException unused) {
            return new String(encodeBytesToBytes);
        }
    }

    public static void encode(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba4a56f", new Object[]{byteBuffer, charBuffer});
            return;
        }
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            c(bArr2, bArr, min, 0);
            for (int i = 0; i < 4; i++) {
                charBuffer.put((char) (bArr2[i] & 255));
            }
        }
    }

    public static byte[] decode(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("31493abe", new Object[]{str}) : decode(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x007a -> B:70:0x007a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] decode(java.lang.String r5, int r6) {
        /*
            Method dump skipped, instructions count: 181
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mobilesdk.socketcraft.util.Base64.decode(java.lang.String, int):byte[]");
    }
}
