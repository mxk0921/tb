package tb;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wp1 {
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
    public static final byte[] f30833a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 43, 47};
    public static final byte[] b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, c0z.MAP32, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    public static final byte[] c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 45, 95};
    public static final byte[] d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, c0z.MAP32, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    public static final byte[] e = {45, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    public static final byte[] f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    static {
        t2o.a(856686633);
    }

    public static /* synthetic */ byte[] a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("df7ff3f1", new Object[]{new Integer(i)});
        }
        return p(i);
    }

    public static /* synthetic */ int b(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("885f05d", new Object[]{bArr, new Integer(i), bArr2, new Integer(i2), new Integer(i3)})).intValue();
        }
        return h(bArr, i, bArr2, i2, i3);
    }

    public static /* synthetic */ byte[] c(byte[] bArr, byte[] bArr2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("784cef75", new Object[]{bArr, bArr2, new Integer(i), new Integer(i2)});
        }
        return j(bArr, bArr2, i, i2);
    }

    public static byte[] d(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("31493abe", new Object[]{str});
        }
        return e(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x007a -> B:64:0x007a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] e(java.lang.String r5, int r6) throws java.io.IOException {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.wp1.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r6)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r5
            r6[r0] = r3
            java.lang.String r5 = "f7ebf079"
            java.lang.Object r5 = r2.ipc$dispatch(r5, r6)
            byte[] r5 = (byte[]) r5
            return r5
        L_0x001d:
            if (r5 == 0) goto L_0x00a9
            java.lang.String r2 = "US-ASCII"
            byte[] r5 = r5.getBytes(r2)     // Catch: UnsupportedEncodingException -> 0x0026
            goto L_0x002a
        L_0x0026:
            byte[] r5 = r5.getBytes()
        L_0x002a:
            int r2 = r5.length
            byte[] r5 = g(r5, r1, r2, r6)
            r2 = 4
            r6 = r6 & r2
            if (r6 == 0) goto L_0x0035
            r6 = 1
            goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            if (r5 == 0) goto L_0x00a8
            int r3 = r5.length
            if (r3 < r2) goto L_0x00a8
            if (r6 != 0) goto L_0x00a8
            r6 = r5[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r0 = r5[r0]
            int r0 = r0 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            r6 = r6 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r6) goto L_0x00a8
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x008f, IOException -> 0x0093
            r2.<init>()     // Catch: all -> 0x008f, IOException -> 0x0093
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: all -> 0x0087, IOException -> 0x008b
            r3.<init>(r5)     // Catch: all -> 0x0087, IOException -> 0x008b
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch: all -> 0x0081, IOException -> 0x0084
            r4.<init>(r3)     // Catch: all -> 0x0081, IOException -> 0x0084
        L_0x0063:
            int r0 = r4.read(r6)     // Catch: all -> 0x006d, IOException -> 0x0070
            if (r0 < 0) goto L_0x0073
            r2.write(r6, r1, r0)     // Catch: all -> 0x006d, IOException -> 0x0070
            goto L_0x0063
        L_0x006d:
            r5 = move-exception
        L_0x006e:
            r0 = r2
            goto L_0x009e
        L_0x0070:
            r6 = move-exception
        L_0x0071:
            r0 = r2
            goto L_0x0096
        L_0x0073:
            byte[] r5 = r2.toByteArray()     // Catch: all -> 0x006d, IOException -> 0x0070
            r2.close()     // Catch: Exception -> 0x007a
        L_0x007a:
            r4.close()     // Catch: Exception -> 0x007d
        L_0x007d:
            r3.close()     // Catch: Exception -> 0x00a8
            goto L_0x00a8
        L_0x0081:
            r5 = move-exception
            r4 = r0
            goto L_0x006e
        L_0x0084:
            r6 = move-exception
            r4 = r0
            goto L_0x0071
        L_0x0087:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L_0x006e
        L_0x008b:
            r6 = move-exception
            r3 = r0
            r4 = r3
            goto L_0x0071
        L_0x008f:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L_0x009e
        L_0x0093:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L_0x0096:
            r6.printStackTrace()     // Catch: all -> 0x009d
            r0.close()     // Catch: Exception -> 0x007a
            goto L_0x007a
        L_0x009d:
            r5 = move-exception
        L_0x009e:
            r0.close()     // Catch: Exception -> 0x00a1
        L_0x00a1:
            r4.close()     // Catch: Exception -> 0x00a4
        L_0x00a4:
            r3.close()     // Catch: Exception -> 0x00a7
        L_0x00a7:
            throw r5
        L_0x00a8:
            return r5
        L_0x00a9:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Input string was null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wp1.e(java.lang.String, int):byte[]");
    }

    public static byte[] f(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("65e18561", new Object[]{bArr});
        }
        return g(bArr, 0, bArr.length, 0);
    }

    public static byte[] g(byte[] bArr, int i, int i2, int i3) throws IOException {
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
                byte[] p = p(i3);
                byte[] bArr2 = new byte[(i2 * 3) / 4];
                byte[] bArr3 = new byte[4];
                int i5 = 0;
                int i6 = 0;
                while (i < i4) {
                    byte b2 = bArr[i];
                    byte b3 = p[b2 & 255];
                    if (b3 >= -5) {
                        if (b3 >= -1) {
                            int i7 = i5 + 1;
                            bArr3[i5] = b2;
                            if (i7 > 3) {
                                i6 += h(bArr3, 0, bArr2, i6, i3);
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

    public static int h(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
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
            byte[] p = p(i3);
            byte b2 = bArr[i + 2];
            if (b2 == 61) {
                bArr2[i2] = (byte) ((((p[bArr[i + 1]] & 255) << 12) | ((p[bArr[i]] & 255) << 18)) >>> 16);
                return 1;
            }
            byte b3 = bArr[i4];
            if (b3 == 61) {
                int i6 = ((p[bArr[i + 1]] & 255) << 12) | ((p[bArr[i]] & 255) << 18) | ((p[b2] & 255) << 6);
                bArr2[i2] = (byte) (i6 >>> 16);
                bArr2[i2 + 1] = (byte) (i6 >>> 8);
                return 2;
            }
            int i7 = ((p[bArr[i + 1]] & 255) << 12) | ((p[bArr[i]] & 255) << 18) | ((p[b2] & 255) << 6) | (p[b3] & 255);
            bArr2[i2] = (byte) (i7 >> 16);
            bArr2[i2 + 1] = (byte) (i7 >> 8);
            bArr2[i5] = (byte) i7;
            return 3;
        }
    }

    public static byte[] i(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8575550c", new Object[]{bArr, new Integer(i), new Integer(i2), bArr2, new Integer(i3), new Integer(i4)});
        }
        byte[] o = o(i4);
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
            bArr2[i3] = o[i9 >>> 18];
            bArr2[1 + i3] = o[(i9 >>> 12) & 63];
            bArr2[2 + i3] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 == 2) {
            bArr2[i3] = o[i9 >>> 18];
            bArr2[1 + i3] = o[(i9 >>> 12) & 63];
            bArr2[2 + i3] = o[(i9 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 != 3) {
            return bArr2;
        } else {
            bArr2[i3] = o[i9 >>> 18];
            bArr2[1 + i3] = o[(i9 >>> 12) & 63];
            bArr2[2 + i3] = o[(i9 >>> 6) & 63];
            bArr2[i3 + 3] = o[i9 & 63];
            return bArr2;
        }
    }

    public static byte[] j(byte[] bArr, byte[] bArr2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("aa9a46ec", new Object[]{bArr, bArr2, new Integer(i), new Integer(i2)});
        }
        i(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    public static String k(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa73b69c", new Object[]{bArr});
        }
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        return l(bArr);
    }

    public static String l(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9a7bb3d", new Object[]{bArr});
        }
        try {
            return m(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String m(byte[] bArr, int i, int i2, int i3) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35a68a0", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        byte[] n = n(bArr, i, i2, i3);
        try {
            return new String(n, EncodingUtils.US_ASCII);
        } catch (UnsupportedEncodingException unused) {
            return new String(n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] n(byte[] bArr, int i, int i2, int i3) throws IOException {
        boolean z;
        int i4;
        GZIPOutputStream gZIPOutputStream;
        a aVar;
        IOException e2;
        ByteArrayOutputStream byteArrayOutputStream;
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
            GZIPOutputStream gZIPOutputStream2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    aVar = new a(byteArrayOutputStream, i3 | 1);
                } catch (IOException e3) {
                    e2 = e3;
                    aVar = null;
                    gZIPOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    aVar = null;
                }
                try {
                    gZIPOutputStream = new GZIPOutputStream(aVar);
                } catch (IOException e4) {
                    e2 = e4;
                    gZIPOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        gZIPOutputStream2.close();
                    } catch (Exception unused) {
                    }
                    try {
                        aVar.close();
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
                        aVar.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused6) {
                    }
                    return byteArrayOutputStream.toByteArray();
                } catch (IOException e5) {
                    e2 = e5;
                    gZIPOutputStream2 = byteArrayOutputStream;
                    try {
                        throw e2;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = gZIPOutputStream2;
                        gZIPOutputStream2 = gZIPOutputStream;
                        gZIPOutputStream2.close();
                        aVar.close();
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    gZIPOutputStream2 = gZIPOutputStream;
                    gZIPOutputStream2.close();
                    aVar.close();
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (IOException e6) {
                e2 = e6;
                aVar = null;
                gZIPOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = 0;
                aVar = null;
            }
        } else {
            if ((i3 & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            int i5 = (i2 / 3) * 4;
            if (i2 % 3 > 0) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            int i6 = i5 + i4;
            if (z) {
                i6 += i6 / 76;
            }
            int i7 = i6;
            byte[] bArr2 = new byte[i7];
            int i8 = i2 - 2;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i9 < i8) {
                i(bArr, i9 + i, 3, bArr2, i10, i3);
                int i12 = i11 + 4;
                if (!z || i12 < 76) {
                    i11 = i12;
                } else {
                    bArr2[i10 + 4] = 10;
                    i10++;
                    i11 = 0;
                }
                i9 += 3;
                i10 += 4;
                bArr2 = bArr2;
                i8 = i8;
                i7 = i7;
            }
            if (i9 < i2) {
                i(bArr, i9 + i, i2 - i9, bArr2, i10, i3);
                i10 += 4;
            }
            if (i10 > i7 - 1) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i10];
            System.arraycopy(bArr2, 0, bArr3, 0, i10);
            return bArr3;
        }
    }

    public static final byte[] o(int i) {
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
        return f30833a;
    }

    public static final byte[] p(int i) {
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends FilterOutputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f30834a;
        public int b;
        public byte[] c;
        public final int d;
        public int e;
        public final boolean f;
        public final byte[] g;
        public final int h;
        public final byte[] i;

        static {
            t2o.a(856686636);
        }

        public a(OutputStream outputStream, int i) {
            super(outputStream);
            boolean z;
            int i2;
            boolean z2 = true;
            if ((i & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f = z;
            z2 = (i & 1) == 0 ? false : z2;
            this.f30834a = z2;
            if (z2) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            this.d = i2;
            this.c = new byte[i2];
            this.b = 0;
            this.e = 0;
            this.g = new byte[4];
            this.h = i;
            this.i = wp1.a(i);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -483678593) {
                super.close();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tlog/protocol/utils/Base64$OutputStream");
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            e();
            super.close();
            this.c = null;
            ((FilterOutputStream) this).out = null;
        }

        public void e() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b87047a", new Object[]{this});
                return;
            }
            int i = this.b;
            if (i <= 0) {
                return;
            }
            if (this.f30834a) {
                ((FilterOutputStream) this).out.write(wp1.c(this.g, this.c, i, this.h));
                this.b = 0;
                return;
            }
            throw new IOException("Base64 input not properly padded.");
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
            } else if (this.f30834a) {
                byte[] bArr = this.c;
                int i2 = this.b;
                int i3 = 1 + i2;
                this.b = i3;
                bArr[i2] = (byte) i;
                int i4 = this.d;
                if (i3 >= i4) {
                    ((FilterOutputStream) this).out.write(wp1.c(this.g, bArr, i4, this.h));
                    int i5 = this.e + 4;
                    this.e = i5;
                    if (this.f && i5 >= 76) {
                        ((FilterOutputStream) this).out.write(10);
                        this.e = 0;
                    }
                    this.b = 0;
                }
            } else {
                byte b = this.i[i & 127];
                if (b > -5) {
                    byte[] bArr2 = this.c;
                    int i6 = this.b;
                    int i7 = 1 + i6;
                    this.b = i7;
                    bArr2[i6] = (byte) i;
                    if (i7 >= this.d) {
                        ((FilterOutputStream) this).out.write(this.g, 0, wp1.b(bArr2, 0, this.g, 0, this.h));
                        this.b = 0;
                    }
                } else if (b != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }
}
