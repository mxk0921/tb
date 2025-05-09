package com.uc.webview.internal.setup.verify;

import com.ali.user.mobile.ui.WebConstant;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.gyb;
import tb.tiv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.internal.setup.verify.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0845a extends Exception {
        public C0845a(String str) {
            super(str);
        }

        public C0845a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private byte[] f14496a;

        public b(X509Certificate x509Certificate, byte[] bArr) {
            super(x509Certificate);
            this.f14496a = bArr;
        }

        @Override // com.uc.webview.internal.setup.verify.a.c, java.security.cert.Certificate
        public final byte[] getEncoded() throws CertificateEncodingException {
            return this.f14496a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c extends X509Certificate {

        /* renamed from: a  reason: collision with root package name */
        private final X509Certificate f14497a;

        public c(X509Certificate x509Certificate) {
            this.f14497a = x509Certificate;
        }

        @Override // java.security.cert.X509Certificate
        public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
            this.f14497a.checkValidity();
        }

        @Override // java.security.cert.X509Certificate
        public int getBasicConstraints() {
            return this.f14497a.getBasicConstraints();
        }

        @Override // java.security.cert.X509Extension
        public Set<String> getCriticalExtensionOIDs() {
            return this.f14497a.getCriticalExtensionOIDs();
        }

        @Override // java.security.cert.Certificate
        public byte[] getEncoded() throws CertificateEncodingException {
            return this.f14497a.getEncoded();
        }

        @Override // java.security.cert.X509Extension
        public byte[] getExtensionValue(String str) {
            return this.f14497a.getExtensionValue(str);
        }

        @Override // java.security.cert.X509Certificate
        public Principal getIssuerDN() {
            return this.f14497a.getIssuerDN();
        }

        @Override // java.security.cert.X509Certificate
        public boolean[] getIssuerUniqueID() {
            return this.f14497a.getIssuerUniqueID();
        }

        @Override // java.security.cert.X509Certificate
        public boolean[] getKeyUsage() {
            return this.f14497a.getKeyUsage();
        }

        @Override // java.security.cert.X509Extension
        public Set<String> getNonCriticalExtensionOIDs() {
            return this.f14497a.getNonCriticalExtensionOIDs();
        }

        @Override // java.security.cert.X509Certificate
        public Date getNotAfter() {
            return this.f14497a.getNotAfter();
        }

        @Override // java.security.cert.X509Certificate
        public Date getNotBefore() {
            return this.f14497a.getNotBefore();
        }

        @Override // java.security.cert.Certificate
        public PublicKey getPublicKey() {
            return this.f14497a.getPublicKey();
        }

        @Override // java.security.cert.X509Certificate
        public BigInteger getSerialNumber() {
            return this.f14497a.getSerialNumber();
        }

        @Override // java.security.cert.X509Certificate
        public String getSigAlgName() {
            return this.f14497a.getSigAlgName();
        }

        @Override // java.security.cert.X509Certificate
        public String getSigAlgOID() {
            return this.f14497a.getSigAlgOID();
        }

        @Override // java.security.cert.X509Certificate
        public byte[] getSigAlgParams() {
            return this.f14497a.getSigAlgParams();
        }

        @Override // java.security.cert.X509Certificate
        public byte[] getSignature() {
            return this.f14497a.getSignature();
        }

        @Override // java.security.cert.X509Certificate
        public Principal getSubjectDN() {
            return this.f14497a.getSubjectDN();
        }

        @Override // java.security.cert.X509Certificate
        public boolean[] getSubjectUniqueID() {
            return this.f14497a.getSubjectUniqueID();
        }

        @Override // java.security.cert.X509Certificate
        public byte[] getTBSCertificate() throws CertificateEncodingException {
            return this.f14497a.getTBSCertificate();
        }

        @Override // java.security.cert.X509Certificate
        public int getVersion() {
            return this.f14497a.getVersion();
        }

        @Override // java.security.cert.X509Extension
        public boolean hasUnsupportedCriticalExtension() {
            return this.f14497a.hasUnsupportedCriticalExtension();
        }

        @Override // java.security.cert.Certificate
        public String toString() {
            return this.f14497a.toString();
        }

        @Override // java.security.cert.Certificate
        public void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
            this.f14497a.verify(publicKey);
        }

        @Override // java.security.cert.X509Certificate
        public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
            this.f14497a.checkValidity(date);
        }

        @Override // java.security.cert.Certificate
        public void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
            this.f14497a.verify(publicKey, str);
        }
    }

    public static boolean a(String str) throws IOException {
        Throwable th;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(str, "r");
        } catch (C0845a unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            long length = randomAccessFile.length();
            if (length > 2147483647L) {
                randomAccessFile.close();
                return false;
            }
            try {
                MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, length);
                map.order(ByteOrder.LITTLE_ENDIAN);
                int a2 = (int) a(map, b(map));
                e(a(map, c(map, a2), a2));
                randomAccessFile.close();
                return true;
            } catch (IOException e) {
                if (e.getCause() instanceof OutOfMemoryError) {
                    randomAccessFile.close();
                    return false;
                }
                throw new IOException("Failed to memory-map APK", e);
            }
        } catch (C0845a unused2) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    public static X509Certificate[][] b(String str) throws C0845a, SecurityException, IOException {
        Throwable th;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
            try {
                X509Certificate[][] a2 = a(randomAccessFile2);
                randomAccessFile2.close();
                return a2;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static int c(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: ".concat(String.valueOf(i)));
    }

    private static byte[] d(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
        }
    }

    private static ByteBuffer e(ByteBuffer byteBuffer) throws C0845a {
        f(byteBuffer);
        ByteBuffer a2 = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i = 0;
        while (a2.hasRemaining()) {
            i++;
            if (a2.remaining() >= 8) {
                long j = a2.getLong();
                if (j < 4 || j > 2147483647L) {
                    throw new C0845a("APK Signing Block entry #" + i + " size out of range: " + j);
                }
                int i2 = (int) j;
                int position = a2.position() + i2;
                if (i2 > a2.remaining()) {
                    throw new C0845a("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + a2.remaining());
                } else if (a2.getInt() == 1896449818) {
                    return b(a2, i2 - 4);
                } else {
                    a2.position(position);
                }
            } else {
                throw new C0845a("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i)));
            }
        }
        throw new C0845a("No APK Signature Scheme v2 block in APK Signing Block");
    }

    private static void f(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static ByteBuffer c(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return b(byteBuffer, i);
            } else {
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
            }
        } else {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
    }

    private static int b(ByteBuffer byteBuffer) throws C0845a {
        int a2 = e.a(byteBuffer);
        if (a2 != -1) {
            return a2;
        }
        throw new C0845a("Not an APK file: ZIP End of Central Directory record not found");
    }

    private static String b(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: ".concat(String.valueOf(i)));
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            throw new IllegalArgumentException("size: ".concat(String.valueOf(i)));
        }
    }

    private static int c(ByteBuffer byteBuffer, int i) throws C0845a {
        f(byteBuffer);
        if (i < 32) {
            throw new C0845a("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(i)));
        } else if (byteBuffer.getLong(i - 16) == 2334950737559900225L && byteBuffer.getLong(i - 8) == 3617552046287187010L) {
            long j = byteBuffer.getLong(i - 24);
            if (j < 24 || j > 2147483639) {
                throw new C0845a("APK Signing Block size out of range: ".concat(String.valueOf(j)));
            }
            int i2 = (int) j;
            int i3 = i - (i2 + 8);
            if (i3 >= 0) {
                long j2 = byteBuffer.getLong(i3);
                if (j2 == i2) {
                    return i3;
                }
                throw new C0845a("APK Signing Block sizes in header and footer do not match: " + j2 + " vs " + i2);
            }
            throw new C0845a("APK Signing Block offset out of range: ".concat(String.valueOf(i3)));
        } else {
            throw new C0845a("No APK Signing Block before ZIP Central Directory");
        }
    }

    private static X509Certificate[][] a(RandomAccessFile randomAccessFile) throws C0845a, SecurityException, IOException {
        long length = randomAccessFile.length();
        if (length <= 2147483647L) {
            try {
                MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, length);
                map.load();
                return a(map);
            } catch (IOException e) {
                if (e.getCause() instanceof OutOfMemoryError) {
                    throw new C0845a("Failed to memory-map APK", e);
                }
                throw new IOException("Failed to memory-map APK", e);
            }
        } else {
            throw new IOException("File too large: " + randomAccessFile.length() + " bytes");
        }
    }

    public static X509Certificate[][] a(ByteBuffer byteBuffer) throws C0845a, SecurityException {
        ByteBuffer slice = byteBuffer.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        int b2 = b(slice);
        int a2 = (int) a(slice, b2);
        int c2 = c(slice, a2);
        return a(slice, e(a(slice, c2, a2)), c2, a2, b2);
    }

    private static X509Certificate[][] a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer c2 = c(byteBuffer2);
                int i4 = 0;
                while (c2.hasRemaining()) {
                    i4++;
                    try {
                        arrayList.add(a(c(c2), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException("Failed to parse/verify signer #" + i4 + " block", e);
                    }
                }
                if (i4 <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    a(hashMap, byteBuffer, i, i2, i3);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0015, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        r11 = a(r6);
        r12 = a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r11 == 1) goto L_0x0081;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r11 != 2) goto L_0x0071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r12 == 1) goto L_0x0094;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r12 != 2) goto L_0x005f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        throw new java.lang.IllegalArgumentException("Unknown digestAlgorithm2: ".concat(java.lang.String.valueOf(r12)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        throw new java.lang.IllegalArgumentException("Unknown digestAlgorithm1: ".concat(java.lang.String.valueOf(r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
        if (r12 == 1) goto L_0x0015;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
        if (r12 != 2) goto L_0x0086;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
        throw new java.lang.IllegalArgumentException("Unknown digestAlgorithm2: ".concat(java.lang.String.valueOf(r12)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] a(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.verify.a.a(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static void a(Map<Integer, byte[]> map, ByteBuffer byteBuffer, int i, int i2, int i3) throws SecurityException {
        if (!map.isEmpty()) {
            ByteBuffer a2 = a(byteBuffer, 0, i);
            ByteBuffer a3 = a(byteBuffer, i2, i3);
            byte[] bArr = new byte[byteBuffer.capacity() - i3];
            byteBuffer.position(i3);
            byteBuffer.get(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(byteBuffer.order());
            long j = i;
            e.d(wrap);
            int position = wrap.position() + 16;
            if (j < 0 || j > tiv.INT_MASK) {
                throw new IllegalArgumentException("uint32 value of out range: ".concat(String.valueOf(j)));
            }
            wrap.putInt(wrap.position() + position, (int) j);
            int[] iArr = new int[map.size()];
            int i4 = 0;
            for (Integer num : map.keySet()) {
                iArr[i4] = num.intValue();
                i4++;
            }
            try {
                Map<Integer, byte[]> a4 = a(iArr, new ByteBuffer[]{a2, a3, wrap});
                for (Map.Entry<Integer, byte[]> entry : map.entrySet()) {
                    Integer key = entry.getKey();
                    int intValue = key.intValue();
                    if (!MessageDigest.isEqual(entry.getValue(), a4.get(key))) {
                        throw new SecurityException(b(intValue) + " digest of contents did not verify");
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    private static Map<Integer, byte[]> a(int[] iArr, ByteBuffer[] byteBufferArr) throws DigestException {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 1048576;
            if (i2 >= 3) {
                break;
            }
            i3 += (byteBufferArr[i2].remaining() + 1048575) / 1048576;
            i2++;
        }
        HashMap hashMap = new HashMap(i3);
        for (int i4 : iArr) {
            byte[] bArr = new byte[(c(i4) * i3) + 5];
            bArr[0] = 90;
            a(i3, bArr);
            hashMap.put(Integer.valueOf(i4), bArr);
        }
        byte[] bArr2 = new byte[5];
        bArr2[0] = -91;
        int i5 = 0;
        int i6 = 0;
        while (i5 < 3) {
            ByteBuffer byteBuffer = byteBufferArr[i5];
            while (byteBuffer.hasRemaining()) {
                ByteBuffer b2 = b(byteBuffer, Math.min(byteBuffer.remaining(), i));
                for (int i7 : iArr) {
                    String b3 = b(i7);
                    try {
                        MessageDigest instance = MessageDigest.getInstance(b3);
                        b2.clear();
                        a(b2.remaining(), bArr2);
                        instance.update(bArr2);
                        instance.update(b2);
                        int c2 = c(i7);
                        int digest = instance.digest((byte[]) hashMap.get(Integer.valueOf(i7)), (i6 * c2) + 5, c2);
                        if (digest != c2) {
                            throw new RuntimeException("Unexpected output size of " + instance.getAlgorithm() + " digest: " + digest);
                        }
                    } catch (NoSuchAlgorithmException e) {
                        throw new RuntimeException(b3 + " digest not supported", e);
                    }
                }
                i6++;
                i = 1048576;
            }
            i5++;
            i = 1048576;
        }
        HashMap hashMap2 = new HashMap(iArr.length);
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int intValue = num.intValue();
            byte[] bArr3 = (byte[]) entry.getValue();
            String b4 = b(intValue);
            try {
                hashMap2.put(num, MessageDigest.getInstance(b4).digest(bArr3));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(b4 + " digest not supported", e2);
            }
        }
        return hashMap2;
    }

    private static long a(ByteBuffer byteBuffer, int i) throws C0845a {
        if (!e.a(byteBuffer, i)) {
            ByteBuffer a2 = a(byteBuffer, i, byteBuffer.capacity());
            long b2 = e.b(a2);
            long j = i;
            if (b2 >= j) {
                throw new C0845a("ZIP Central Directory offset out of range: " + b2 + ". ZIP End of Central Directory offset: " + i);
            } else if (e.c(a2) + b2 == j) {
                return b2;
            } else {
                throw new C0845a("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
        } else {
            throw new C0845a("ZIP64 APK not supported");
        }
    }

    private static int a(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        if (i == 770) {
            return 2;
        }
        switch (i) {
            case 257:
            case gyb.ERROR_MTOP_SERVICE_EXCEPTION /* 259 */:
                return 1;
            case WebConstant.OPEN_WEB_RESCODE /* 258 */:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("start: ".concat(String.valueOf(i)));
        } else if (i2 >= i) {
            int capacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(i);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    return slice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                }
            } else {
                throw new IllegalArgumentException("end > capacity: " + i2 + " > " + capacity);
            }
        } else {
            throw new IllegalArgumentException("end < start: " + i2 + " < " + i);
        }
    }

    private static void a(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) ((i >>> 24) & 255);
    }
}
