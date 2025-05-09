package com.alibaba.android.split.core.internal;

import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.man;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ApkSignatureSchemeGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int APK_SIGNATURE_SCHEME_V2_BLOCK_ID = 1896449818;
    private static final long APK_SIG_BLOCK_MAGIC_HI = 3617552046287187010L;
    private static final long APK_SIG_BLOCK_MAGIC_LO = 2334950737559900225L;
    private static final int APK_SIG_BLOCK_MIN_SIZE = 32;
    private static final int CHUNK_SIZE_BYTES = 1048576;
    private static final int CONTENT_DIGEST_CHUNKED_SHA256 = 1;
    private static final int CONTENT_DIGEST_CHUNKED_SHA512 = 2;
    public static final int SF_ATTRIBUTE_ANDROID_APK_SIGNED_ID = 2;
    public static final String SF_ATTRIBUTE_ANDROID_APK_SIGNED_NAME = "X-Android-APK-Signed";
    private static final int SIGNATURE_DSA_WITH_SHA256 = 769;
    private static final int SIGNATURE_ECDSA_WITH_SHA256 = 513;
    private static final int SIGNATURE_ECDSA_WITH_SHA512 = 514;
    private static final int SIGNATURE_RSA_PKCS1_V1_5_WITH_SHA256 = 259;
    private static final int SIGNATURE_RSA_PKCS1_V1_5_WITH_SHA512 = 260;
    private static final int SIGNATURE_RSA_PSS_WITH_SHA256 = 257;
    private static final int SIGNATURE_RSA_PSS_WITH_SHA512 = 258;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface DataSource {
        void feedIntoMessageDigests(MessageDigest[] messageDigestArr, long j, int i) throws IOException;

        long size();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SignatureInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final long apkSigningBlockOffset;
        private final long centralDirOffset;
        private final ByteBuffer eocd;
        private final long eocdOffset;
        private final ByteBuffer signatureBlock;

        static {
            t2o.a(677380126);
        }

        public static /* synthetic */ ByteBuffer access$100(SignatureInfo signatureInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteBuffer) ipChange.ipc$dispatch("a13464e2", new Object[]{signatureInfo});
            }
            return signatureInfo.signatureBlock;
        }

        private SignatureInfo(ByteBuffer byteBuffer, long j, long j2, long j3, ByteBuffer byteBuffer2) {
            this.signatureBlock = byteBuffer;
            this.apkSigningBlockOffset = j;
            this.centralDirOffset = j2;
            this.eocdOffset = j3;
            this.eocd = byteBuffer2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SignatureNotFoundException extends Exception {
        private static final long serialVersionUID = 1;

        static {
            t2o.a(677380127);
        }

        public SignatureNotFoundException(String str) {
            super(str);
        }

        public SignatureNotFoundException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class VerbatimX509Certificate extends WrappedX509Certificate {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private byte[] encodedVerbatim;

        static {
            t2o.a(677380128);
        }

        public VerbatimX509Certificate(X509Certificate x509Certificate, byte[] bArr) {
            super(x509Certificate);
            this.encodedVerbatim = bArr;
        }

        public static /* synthetic */ Object ipc$super(VerbatimX509Certificate verbatimX509Certificate, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/internal/ApkSignatureSchemeGetter$VerbatimX509Certificate");
        }

        @Override // com.alibaba.android.split.core.internal.ApkSignatureSchemeGetter.WrappedX509Certificate, java.security.cert.Certificate
        public byte[] getEncoded() throws CertificateEncodingException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("466b135e", new Object[]{this});
            }
            return this.encodedVerbatim;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class WrappedX509Certificate extends X509Certificate {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final X509Certificate wrapped;

        static {
            t2o.a(677380129);
        }

        public WrappedX509Certificate(X509Certificate x509Certificate) {
            this.wrapped = x509Certificate;
        }

        public static /* synthetic */ Object ipc$super(WrappedX509Certificate wrappedX509Certificate, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/internal/ApkSignatureSchemeGetter$WrappedX509Certificate");
        }

        @Override // java.security.cert.X509Certificate
        public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4483bfe1", new Object[]{this});
            } else {
                this.wrapped.checkValidity();
            }
        }

        @Override // java.security.cert.X509Certificate
        public int getBasicConstraints() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("db861e18", new Object[]{this})).intValue();
            }
            return this.wrapped.getBasicConstraints();
        }

        @Override // java.security.cert.X509Extension
        public Set<String> getCriticalExtensionOIDs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("cbd68f29", new Object[]{this});
            }
            return this.wrapped.getCriticalExtensionOIDs();
        }

        @Override // java.security.cert.Certificate
        public byte[] getEncoded() throws CertificateEncodingException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("466b135e", new Object[]{this});
            }
            return this.wrapped.getEncoded();
        }

        @Override // java.security.cert.X509Extension
        public byte[] getExtensionValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("1561e204", new Object[]{this, str});
            }
            return this.wrapped.getExtensionValue(str);
        }

        @Override // java.security.cert.X509Certificate
        public Principal getIssuerDN() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Principal) ipChange.ipc$dispatch("27657125", new Object[]{this});
            }
            return this.wrapped.getIssuerDN();
        }

        @Override // java.security.cert.X509Certificate
        public boolean[] getIssuerUniqueID() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (boolean[]) ipChange.ipc$dispatch("e5fc2b3", new Object[]{this});
            }
            return this.wrapped.getIssuerUniqueID();
        }

        @Override // java.security.cert.X509Certificate
        public boolean[] getKeyUsage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (boolean[]) ipChange.ipc$dispatch("e25af856", new Object[]{this});
            }
            return this.wrapped.getKeyUsage();
        }

        @Override // java.security.cert.X509Extension
        public Set<String> getNonCriticalExtensionOIDs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("861c6bc8", new Object[]{this});
            }
            return this.wrapped.getNonCriticalExtensionOIDs();
        }

        @Override // java.security.cert.X509Certificate
        public Date getNotAfter() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Date) ipChange.ipc$dispatch("17613f31", new Object[]{this});
            }
            return this.wrapped.getNotAfter();
        }

        @Override // java.security.cert.X509Certificate
        public Date getNotBefore() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Date) ipChange.ipc$dispatch("77c28ad4", new Object[]{this});
            }
            return this.wrapped.getNotBefore();
        }

        @Override // java.security.cert.Certificate
        public PublicKey getPublicKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PublicKey) ipChange.ipc$dispatch("73b184a4", new Object[]{this});
            }
            return this.wrapped.getPublicKey();
        }

        @Override // java.security.cert.X509Certificate
        public BigInteger getSerialNumber() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BigInteger) ipChange.ipc$dispatch("bcc235b3", new Object[]{this});
            }
            return this.wrapped.getSerialNumber();
        }

        @Override // java.security.cert.X509Certificate
        public String getSigAlgName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d763524d", new Object[]{this});
            }
            return this.wrapped.getSigAlgName();
        }

        @Override // java.security.cert.X509Certificate
        public String getSigAlgOID() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c84ec290", new Object[]{this});
            }
            return this.wrapped.getSigAlgOID();
        }

        @Override // java.security.cert.X509Certificate
        public byte[] getSigAlgParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("13a63aaf", new Object[]{this});
            }
            return this.wrapped.getSigAlgParams();
        }

        @Override // java.security.cert.X509Certificate
        public byte[] getSignature() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("c1eff474", new Object[]{this});
            }
            return this.wrapped.getSignature();
        }

        @Override // java.security.cert.X509Certificate
        public Principal getSubjectDN() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Principal) ipChange.ipc$dispatch("9f4b62c", new Object[]{this});
            }
            return this.wrapped.getSubjectDN();
        }

        @Override // java.security.cert.X509Certificate
        public boolean[] getSubjectUniqueID() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (boolean[]) ipChange.ipc$dispatch("28e992cc", new Object[]{this});
            }
            return this.wrapped.getSubjectUniqueID();
        }

        @Override // java.security.cert.X509Certificate
        public byte[] getTBSCertificate() throws CertificateEncodingException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("8a1fe4ae", new Object[]{this});
            }
            return this.wrapped.getTBSCertificate();
        }

        @Override // java.security.cert.X509Certificate
        public int getVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
            }
            return this.wrapped.getVersion();
        }

        public X509Certificate getWrapped() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (X509Certificate) ipChange.ipc$dispatch("304c4607", new Object[]{this});
            }
            return this.wrapped;
        }

        @Override // java.security.cert.X509Extension
        public boolean hasUnsupportedCriticalExtension() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("10e67b70", new Object[]{this})).booleanValue();
            }
            return this.wrapped.hasUnsupportedCriticalExtension();
        }

        @Override // java.security.cert.Certificate
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.wrapped.toString();
        }

        @Override // java.security.cert.Certificate
        public void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f2c83ad", new Object[]{this, publicKey});
            } else {
                this.wrapped.verify(publicKey);
            }
        }

        @Override // java.security.cert.X509Certificate
        public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("768f11c2", new Object[]{this, date});
            } else {
                this.wrapped.checkValidity(date);
            }
        }

        @Override // java.security.cert.Certificate
        public void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb1afc37", new Object[]{this, publicKey, str});
            } else {
                this.wrapped.verify(publicKey, str);
            }
        }
    }

    static {
        t2o.a(677380123);
    }

    private static void checkByteOrderLittleEndian(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4606b1bb", new Object[]{byteBuffer});
        } else if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static int compareContentDigestAlgorithm(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ac2671", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown digestAlgorithm1: " + i);
            } else if (i2 == 1) {
                return 1;
            } else {
                if (i2 == 2) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown digestAlgorithm2: " + i2);
            }
        } else if (i2 == 1) {
            return 0;
        } else {
            if (i2 == 2) {
                return -1;
            }
            throw new IllegalArgumentException("Unknown digestAlgorithm2: " + i2);
        }
    }

    private static int compareSignatureAlgorithm(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88021e76", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return compareContentDigestAlgorithm(getSignatureAlgorithmContentDigestAlgorithm(i), getSignatureAlgorithmContentDigestAlgorithm(i2));
    }

    private static ByteBuffer findApkSignatureSchemeV2Block(ByteBuffer byteBuffer) throws SignatureNotFoundException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("88a6b314", new Object[]{byteBuffer});
        }
        checkByteOrderLittleEndian(byteBuffer);
        ByteBuffer sliceFromTo = sliceFromTo(byteBuffer, 8, byteBuffer.capacity() - 24);
        while (sliceFromTo.hasRemaining()) {
            i++;
            if (sliceFromTo.remaining() >= 8) {
                long j = sliceFromTo.getLong();
                if (j < 4 || j > 2147483647L) {
                    throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + j);
                }
                int i2 = (int) j;
                int position = sliceFromTo.position() + i2;
                if (i2 > sliceFromTo.remaining()) {
                    throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + sliceFromTo.remaining());
                } else if (sliceFromTo.getInt() == APK_SIGNATURE_SCHEME_V2_BLOCK_ID) {
                    return getByteBuffer(sliceFromTo, i2 - 4);
                } else {
                    sliceFromTo.position(position);
                }
            } else {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i);
            }
        }
        throw new SignatureNotFoundException("No APK Signature Scheme v2 block in APK Signing Block");
    }

    private static Pair<ByteBuffer, Long> findApkSigningBlock(RandomAccessFile randomAccessFile, long j) throws IOException, SignatureNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("53d60d8c", new Object[]{randomAccessFile, new Long(j)});
        }
        if (j >= 32) {
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) == APK_SIG_BLOCK_MAGIC_LO && allocate.getLong(16) == APK_SIG_BLOCK_MAGIC_HI) {
                long j2 = allocate.getLong(0);
                if (j2 < allocate.capacity() || j2 > 2147483639) {
                    throw new SignatureNotFoundException("APK Signing Block size out of range: " + j2);
                }
                int i = (int) (8 + j2);
                long j3 = j - i;
                if (j3 >= 0) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(i);
                    allocate2.order(byteOrder);
                    randomAccessFile.seek(j3);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j4 = allocate2.getLong(0);
                    if (j4 == j2) {
                        return Pair.create(allocate2, Long.valueOf(j3));
                    }
                    throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                }
                throw new SignatureNotFoundException("APK Signing Block offset out of range: " + j3);
            }
            throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
        }
        throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j);
    }

    private static SignatureInfo findSignature(RandomAccessFile randomAccessFile) throws IOException, SignatureNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SignatureInfo) ipChange.ipc$dispatch("7ebf4089", new Object[]{randomAccessFile});
        }
        Pair<ByteBuffer, Long> eocd = getEocd(randomAccessFile);
        ByteBuffer byteBuffer = (ByteBuffer) eocd.first;
        long longValue = ((Long) eocd.second).longValue();
        if (!ZipUtils.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile, longValue)) {
            long centralDirOffset = getCentralDirOffset(byteBuffer, longValue);
            Pair<ByteBuffer, Long> findApkSigningBlock = findApkSigningBlock(randomAccessFile, centralDirOffset);
            return new SignatureInfo(findApkSignatureSchemeV2Block((ByteBuffer) findApkSigningBlock.first), ((Long) findApkSigningBlock.second).longValue(), centralDirOffset, longValue, byteBuffer);
        }
        throw new SignatureNotFoundException("ZIP64 APK not supported");
    }

    private static ByteBuffer getByteBuffer(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("c08f72b8", new Object[]{byteBuffer, new Integer(i)});
        }
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
            throw new IllegalArgumentException("size: " + i);
        }
    }

    private static long getCentralDirOffset(ByteBuffer byteBuffer, long j) throws SignatureNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2152c68f", new Object[]{byteBuffer, new Long(j)})).longValue();
        }
        long zipEocdCentralDirectoryOffset = ZipUtils.getZipEocdCentralDirectoryOffset(byteBuffer);
        if (zipEocdCentralDirectoryOffset > j) {
            throw new SignatureNotFoundException("ZIP Central Directory offset out of range: " + zipEocdCentralDirectoryOffset + ". ZIP End of Central Directory offset: " + j);
        } else if (ZipUtils.getZipEocdCentralDirectorySizeBytes(byteBuffer) + zipEocdCentralDirectoryOffset == j) {
            return zipEocdCentralDirectoryOffset;
        } else {
            throw new SignatureNotFoundException("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
    }

    public static X509Certificate[][] getCertificates(String str) throws SignatureNotFoundException, SecurityException, IOException {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509Certificate[][]) ipChange.ipc$dispatch("14e8999a", new Object[]{str});
        }
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
            try {
                X509Certificate[][] verify = verify(randomAccessFile2);
                randomAccessFile2.close();
                return verify;
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

    private static final long getChunkCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("286cef79", new Object[]{new Long(j)})).longValue();
        }
        return (j + 1048575) / 1048576;
    }

    private static String getContentDigestAlgorithmJcaDigestAlgorithm(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("380d6c8f", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
    }

    private static int getContentDigestAlgorithmOutputSizeBytes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15af546e", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
    }

    private static Pair<ByteBuffer, Long> getEocd(RandomAccessFile randomAccessFile) throws IOException, SignatureNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1056d042", new Object[]{randomAccessFile});
        }
        Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord = ZipUtils.findZipEndOfCentralDirectoryRecord(randomAccessFile);
        if (findZipEndOfCentralDirectoryRecord != null) {
            return findZipEndOfCentralDirectoryRecord;
        }
        throw new SignatureNotFoundException("Not an APK file: ZIP End of Central Directory record not found");
    }

    private static ByteBuffer getLengthPrefixedSlice(ByteBuffer byteBuffer) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("47c586a6", new Object[]{byteBuffer});
        }
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return getByteBuffer(byteBuffer, i);
            } else {
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
            }
        } else {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
    }

    private static int getSignatureAlgorithmContentDigestAlgorithm(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3eb3870", new Object[]{new Integer(i)})).intValue();
        }
        if (i != 513) {
            if (i == SIGNATURE_ECDSA_WITH_SHA512) {
                return 2;
            }
            if (i != SIGNATURE_DSA_WITH_SHA256) {
                switch (i) {
                    case 257:
                    case 259:
                        break;
                    case 258:
                    case 260:
                        return 2;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
                }
            }
        }
        return 1;
    }

    private static String getSignatureAlgorithmJcaKeyAlgorithm(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b1f96f", new Object[]{new Integer(i)});
        }
        if (i == 513 || i == SIGNATURE_ECDSA_WITH_SHA512) {
            return "EC";
        }
        if (i == SIGNATURE_DSA_WITH_SHA256) {
            return "DSA";
        }
        switch (i) {
            case 257:
            case 258:
            case 259:
            case 260:
                return man.KEY_ALGORITHM;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
        }
    }

    private static Pair<String, ? extends AlgorithmParameterSpec> getSignatureAlgorithmJcaSignatureAlgorithm(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f18065f4", new Object[]{new Integer(i)});
        }
        if (i == 513) {
            return Pair.create("SHA256withECDSA", null);
        }
        if (i == SIGNATURE_ECDSA_WITH_SHA512) {
            return Pair.create("SHA512withECDSA", null);
        }
        if (i == SIGNATURE_DSA_WITH_SHA256) {
            return Pair.create("SHA256withDSA", null);
        }
        switch (i) {
            case 257:
                return Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
            case 258:
                return Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
            case 259:
                return Pair.create("SHA256withRSA", null);
            case 260:
                return Pair.create("SHA512withRSA", null);
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
        }
    }

    private static boolean isSupportedSignatureAlgorithm(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a5883e5", new Object[]{new Integer(i)})).booleanValue();
        }
        if (!(i == 513 || i == SIGNATURE_ECDSA_WITH_SHA512 || i == SIGNATURE_DSA_WITH_SHA256)) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private static byte[] readLengthPrefixedByteArray(ByteBuffer byteBuffer) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9fc6ebb7", new Object[]{byteBuffer});
        }
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

    private static void setUnsignedInt32LittleEndian(int i, byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4214a168", new Object[]{new Integer(i), bArr, new Integer(i2)});
            return;
        }
        bArr[i2] = (byte) (i & 255);
        bArr[1 + i2] = (byte) ((i >>> 8) & 255);
        bArr[2 + i2] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >>> 24) & 255);
    }

    private static X509Certificate[][] verify(RandomAccessFile randomAccessFile) throws SignatureNotFoundException, SecurityException, IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (X509Certificate[][]) ipChange.ipc$dispatch("9a8fb8d", new Object[]{randomAccessFile}) : verify(randomAccessFile.getFD(), findSignature(randomAccessFile));
    }

    private static X509Certificate[] verifySigner(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws SecurityException, IOException {
        Throwable e;
        int signatureAlgorithmContentDigestAlgorithm;
        Throwable e2;
        Throwable e3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509Certificate[]) ipChange.ipc$dispatch("85eb4bd3", new Object[]{byteBuffer, map, certificateFactory});
        }
        ByteBuffer lengthPrefixedSlice = getLengthPrefixedSlice(byteBuffer);
        ByteBuffer lengthPrefixedSlice2 = getLengthPrefixedSlice(byteBuffer);
        byte[] readLengthPrefixedByteArray = readLengthPrefixedByteArray(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i2 = 0;
        while (lengthPrefixedSlice2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer lengthPrefixedSlice3 = getLengthPrefixedSlice(lengthPrefixedSlice2);
                if (lengthPrefixedSlice3.remaining() >= 8) {
                    int i3 = lengthPrefixedSlice3.getInt();
                    arrayList.add(Integer.valueOf(i3));
                    if (isSupportedSignatureAlgorithm(i3)) {
                        if (i != -1 && compareSignatureAlgorithm(i3, i) <= 0) {
                        }
                        bArr2 = readLengthPrefixedByteArray(lengthPrefixedSlice3);
                        i = i3;
                    }
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException e4) {
                e3 = e4;
                throw new SecurityException("Failed to parse signature record #" + i2, e3);
            } catch (BufferUnderflowException e5) {
                e3 = e5;
                throw new SecurityException("Failed to parse signature record #" + i2, e3);
            }
        }
        if (i != -1) {
            String signatureAlgorithmJcaKeyAlgorithm = getSignatureAlgorithmJcaKeyAlgorithm(i);
            Pair<String, ? extends AlgorithmParameterSpec> signatureAlgorithmJcaSignatureAlgorithm = getSignatureAlgorithmJcaSignatureAlgorithm(i);
            String str = (String) signatureAlgorithmJcaSignatureAlgorithm.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) signatureAlgorithmJcaSignatureAlgorithm.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(signatureAlgorithmJcaKeyAlgorithm).generatePublic(new X509EncodedKeySpec(readLengthPrefixedByteArray));
                Signature instance = Signature.getInstance(str);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(lengthPrefixedSlice);
                if (instance.verify(bArr2)) {
                    lengthPrefixedSlice.clear();
                    ByteBuffer lengthPrefixedSlice4 = getLengthPrefixedSlice(lengthPrefixedSlice);
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (lengthPrefixedSlice4.hasRemaining()) {
                        i4++;
                        try {
                            ByteBuffer lengthPrefixedSlice5 = getLengthPrefixedSlice(lengthPrefixedSlice4);
                            if (lengthPrefixedSlice5.remaining() >= 8) {
                                int i5 = lengthPrefixedSlice5.getInt();
                                arrayList2.add(Integer.valueOf(i5));
                                if (i5 == i) {
                                    bArr = readLengthPrefixedByteArray(lengthPrefixedSlice5);
                                }
                            } else {
                                throw new IOException("Record too short");
                            }
                        } catch (IOException e6) {
                            e2 = e6;
                            throw new IOException("Failed to parse digest record #" + i4, e2);
                        } catch (BufferUnderflowException e7) {
                            e2 = e7;
                            throw new IOException("Failed to parse digest record #" + i4, e2);
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        byte[] put = map.put(Integer.valueOf(getSignatureAlgorithmContentDigestAlgorithm(i)), bArr);
                        if (put == null || MessageDigest.isEqual(put, bArr)) {
                            ByteBuffer lengthPrefixedSlice6 = getLengthPrefixedSlice(lengthPrefixedSlice);
                            ArrayList arrayList3 = new ArrayList();
                            int i6 = 0;
                            while (lengthPrefixedSlice6.hasRemaining()) {
                                i6++;
                                byte[] readLengthPrefixedByteArray2 = readLengthPrefixedByteArray(lengthPrefixedSlice6);
                                try {
                                    arrayList3.add(new VerbatimX509Certificate((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(readLengthPrefixedByteArray2)), readLengthPrefixedByteArray2));
                                } catch (CertificateException e8) {
                                    throw new SecurityException("Failed to decode certificate #" + i6, e8);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(readLengthPrefixedByteArray, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        } else {
                            throw new SecurityException(getContentDigestAlgorithmJcaDigestAlgorithm(signatureAlgorithmContentDigestAlgorithm) + " contents digest does not match the digest specified by a preceding signer");
                        }
                    } else {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                } else {
                    throw new SecurityException(str + " signature did not verify");
                }
            } catch (InvalidAlgorithmParameterException e9) {
                e = e9;
                throw new SecurityException("Failed to verify " + str + " signature", e);
            } catch (InvalidKeyException e10) {
                e = e10;
                throw new SecurityException("Failed to verify " + str + " signature", e);
            } catch (NoSuchAlgorithmException e11) {
                e = e11;
                throw new SecurityException("Failed to verify " + str + " signature", e);
            } catch (SignatureException e12) {
                e = e12;
                throw new SecurityException("Failed to verify " + str + " signature", e);
            } catch (InvalidKeySpecException e13) {
                e = e13;
                throw new SecurityException("Failed to verify " + str + " signature", e);
            }
        } else if (i2 == 0) {
            throw new SecurityException("No signatures found");
        } else {
            throw new SecurityException("No supported signatures found");
        }
    }

    private static ByteBuffer sliceFromTo(ByteBuffer byteBuffer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("e7514874", new Object[]{byteBuffer, new Integer(i), new Integer(i2)});
        }
        if (i < 0) {
            throw new IllegalArgumentException("start: " + i);
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

    private static X509Certificate[][] verify(FileDescriptor fileDescriptor, SignatureInfo signatureInfo) throws SecurityException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509Certificate[][]) ipChange.ipc$dispatch("4833aeec", new Object[]{fileDescriptor, signatureInfo});
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer lengthPrefixedSlice = getLengthPrefixedSlice(SignatureInfo.access$100(signatureInfo));
                while (lengthPrefixedSlice.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(verifySigner(getLengthPrefixedSlice(lengthPrefixedSlice), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
                    }
                }
                if (i < 1) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
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
}
