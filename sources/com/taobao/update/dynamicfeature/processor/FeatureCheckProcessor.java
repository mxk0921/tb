package com.taobao.update.dynamicfeature.processor;

import android.content.pm.PackageManager;
import android.util.Log;
import android.util.Pair;
import com.ali.user.mobile.ui.WebConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.utils.Constants;
import java.io.ByteArrayInputStream;
import java.io.File;
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
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.czm;
import tb.fih;
import tb.gdh;
import tb.gyb;
import tb.kjv;
import tb.man;
import tb.q49;
import tb.qqx;
import tb.t2o;
import tb.wnc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FeatureCheckProcessor implements czm<q49> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gdh f14086a = fih.getLog(FeatureCheckProcessor.class, (gdh) null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ApkSignatureSchemeV2Verifier {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int SF_ATTRIBUTE_ANDROID_APK_SIGNED_ID = 2;
        public static final String SF_ATTRIBUTE_ANDROID_APK_SIGNED_NAME = "X-Android-APK-Signed";

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class SignatureNotFoundException extends Exception {
            private static final long serialVersionUID = 1;

            static {
                t2o.a(951058451);
            }

            public SignatureNotFoundException(String str) {
                super(str);
            }

            public SignatureNotFoundException(String str, Throwable th) {
                super(str, th);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class VerbatimX509Certificate extends WrappedX509Certificate {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private byte[] encodedVerbatim;

            static {
                t2o.a(951058452);
            }

            public VerbatimX509Certificate(X509Certificate x509Certificate, byte[] bArr) {
                super(x509Certificate);
                this.encodedVerbatim = bArr;
            }

            public static /* synthetic */ Object ipc$super(VerbatimX509Certificate verbatimX509Certificate, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/dynamicfeature/processor/FeatureCheckProcessor$ApkSignatureSchemeV2Verifier$VerbatimX509Certificate");
            }

            @Override // com.taobao.update.dynamicfeature.processor.FeatureCheckProcessor.ApkSignatureSchemeV2Verifier.WrappedX509Certificate, java.security.cert.Certificate
            public byte[] getEncoded() throws CertificateEncodingException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (byte[]) ipChange.ipc$dispatch("466b135e", new Object[]{this});
                }
                return this.encodedVerbatim;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class WrappedX509Certificate extends X509Certificate {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final X509Certificate wrapped;

            static {
                t2o.a(951058453);
            }

            public WrappedX509Certificate(X509Certificate x509Certificate) {
                this.wrapped = x509Certificate;
            }

            public static /* synthetic */ Object ipc$super(WrappedX509Certificate wrappedX509Certificate, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/dynamicfeature/processor/FeatureCheckProcessor$ApkSignatureSchemeV2Verifier$WrappedX509Certificate");
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

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final ByteBuffer f14087a;

            static {
                t2o.a(951058450);
            }

            public static /* synthetic */ ByteBuffer access$100(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ByteBuffer) ipChange.ipc$dispatch("1c62456f", new Object[]{aVar});
                }
                return aVar.f14087a;
            }

            public a(ByteBuffer byteBuffer, long j, long j2, long j3, ByteBuffer byteBuffer2) {
                this.f14087a = byteBuffer;
            }
        }

        static {
            t2o.a(951058448);
        }

        public static void a(ByteBuffer byteBuffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4606b1bb", new Object[]{byteBuffer});
            } else if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
        }

        public static int b(int i, int i2) {
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

        public static int c(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("88021e76", new Object[]{new Integer(i), new Integer(i2)})).intValue();
            }
            return b(l(i), l(i2));
        }

        public static ByteBuffer d(ByteBuffer byteBuffer) throws SignatureNotFoundException {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteBuffer) ipChange.ipc$dispatch("88a6b314", new Object[]{byteBuffer});
            }
            a(byteBuffer);
            ByteBuffer q = q(byteBuffer, 8, byteBuffer.capacity() - 24);
            while (q.hasRemaining()) {
                i++;
                if (q.remaining() >= 8) {
                    long j = q.getLong();
                    if (j < 4 || j > 2147483647L) {
                        throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + j);
                    }
                    int i2 = (int) j;
                    int position = q.position() + i2;
                    if (i2 > q.remaining()) {
                        throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + q.remaining());
                    } else if (q.getInt() == 1896449818) {
                        return g(q, i2 - 4);
                    } else {
                        q.position(position);
                    }
                } else {
                    throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i);
                }
            }
            throw new SignatureNotFoundException("No APK Signature Scheme v2 block in APK Signing Block");
        }

        public static Pair<ByteBuffer, Long> e(RandomAccessFile randomAccessFile, long j) throws IOException, SignatureNotFoundException {
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
                if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
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

        public static a f(RandomAccessFile randomAccessFile) throws IOException, SignatureNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a0ed838c", new Object[]{randomAccessFile});
            }
            Pair<ByteBuffer, Long> j = j(randomAccessFile);
            ByteBuffer byteBuffer = (ByteBuffer) j.first;
            long longValue = ((Long) j.second).longValue();
            if (!qqx.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile, longValue)) {
                long h = h(byteBuffer, longValue);
                Pair<ByteBuffer, Long> e = e(randomAccessFile, h);
                return new a(d((ByteBuffer) e.first), ((Long) e.second).longValue(), h, longValue, byteBuffer);
            }
            throw new SignatureNotFoundException("ZIP64 APK not supported");
        }

        public static ByteBuffer g(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
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

        public static long h(ByteBuffer byteBuffer, long j) throws SignatureNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2152c68f", new Object[]{byteBuffer, new Long(j)})).longValue();
            }
            long zipEocdCentralDirectoryOffset = qqx.getZipEocdCentralDirectoryOffset(byteBuffer);
            if (zipEocdCentralDirectoryOffset > j) {
                throw new SignatureNotFoundException("ZIP Central Directory offset out of range: " + zipEocdCentralDirectoryOffset + ". ZIP End of Central Directory offset: " + j);
            } else if (qqx.getZipEocdCentralDirectorySizeBytes(byteBuffer) + zipEocdCentralDirectoryOffset == j) {
                return zipEocdCentralDirectoryOffset;
            } else {
                throw new SignatureNotFoundException("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
        }

        public static String i(int i) {
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

        public static Pair<ByteBuffer, Long> j(RandomAccessFile randomAccessFile) throws IOException, SignatureNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("1056d042", new Object[]{randomAccessFile});
            }
            Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord = qqx.findZipEndOfCentralDirectoryRecord(randomAccessFile);
            if (findZipEndOfCentralDirectoryRecord != null) {
                return findZipEndOfCentralDirectoryRecord;
            }
            throw new SignatureNotFoundException("Not an APK file: ZIP End of Central Directory record not found");
        }

        public static ByteBuffer k(ByteBuffer byteBuffer) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteBuffer) ipChange.ipc$dispatch("47c586a6", new Object[]{byteBuffer});
            }
            if (byteBuffer.remaining() >= 4) {
                int i = byteBuffer.getInt();
                if (i < 0) {
                    throw new IllegalArgumentException("Negative length");
                } else if (i <= byteBuffer.remaining()) {
                    return g(byteBuffer, i);
                } else {
                    throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
                }
            } else {
                throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
            }
        }

        public static int l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b3eb3870", new Object[]{new Integer(i)})).intValue();
            }
            if (i != 513) {
                if (i == 514) {
                    return 2;
                }
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case gyb.ERROR_MTOP_SERVICE_EXCEPTION /* 259 */:
                            break;
                        case WebConstant.OPEN_WEB_RESCODE /* 258 */:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
                    }
                }
            }
            return 1;
        }

        public static String m(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("22b1f96f", new Object[]{new Integer(i)});
            }
            if (i == 513 || i == 514) {
                return "EC";
            }
            if (i == 769) {
                return "DSA";
            }
            switch (i) {
                case 257:
                case WebConstant.OPEN_WEB_RESCODE /* 258 */:
                case gyb.ERROR_MTOP_SERVICE_EXCEPTION /* 259 */:
                case 260:
                    return man.KEY_ALGORITHM;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
            }
        }

        public static Pair<String, ? extends AlgorithmParameterSpec> n(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("f18065f4", new Object[]{new Integer(i)});
            }
            if (i == 513) {
                return Pair.create("SHA256withECDSA", null);
            }
            if (i == 514) {
                return Pair.create("SHA512withECDSA", null);
            }
            if (i == 769) {
                return Pair.create("SHA256withDSA", null);
            }
            switch (i) {
                case 257:
                    return Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                case WebConstant.OPEN_WEB_RESCODE /* 258 */:
                    return Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                case gyb.ERROR_MTOP_SERVICE_EXCEPTION /* 259 */:
                    return Pair.create("SHA256withRSA", null);
                case 260:
                    return Pair.create("SHA512withRSA", null);
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
            }
        }

        public static boolean o(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2a5883e5", new Object[]{new Integer(i)})).booleanValue();
            }
            if (!(i == 513 || i == 514 || i == 769)) {
                switch (i) {
                    case 257:
                    case WebConstant.OPEN_WEB_RESCODE /* 258 */:
                    case gyb.ERROR_MTOP_SERVICE_EXCEPTION /* 259 */:
                    case 260:
                        break;
                    default:
                        return false;
                }
            }
            return true;
        }

        public static byte[] p(ByteBuffer byteBuffer) throws IOException {
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

        public static X509Certificate[][] r(FileDescriptor fileDescriptor, a aVar) throws SecurityException {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (X509Certificate[][]) ipChange.ipc$dispatch("b440011f", new Object[]{fileDescriptor, aVar});
            }
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                try {
                    ByteBuffer k = k(a.access$100(aVar));
                    while (k.hasRemaining()) {
                        i++;
                        try {
                            arrayList.add(t(k(k), hashMap, instance));
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

        public static X509Certificate[][] s(RandomAccessFile randomAccessFile) throws SignatureNotFoundException, SecurityException, IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (X509Certificate[][]) ipChange.ipc$dispatch("9a8fb8d", new Object[]{randomAccessFile});
            }
            return r(randomAccessFile.getFD(), f(randomAccessFile));
        }

        public static X509Certificate[] t(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws SecurityException, IOException {
            Throwable e;
            int l;
            Throwable e2;
            Throwable e3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (X509Certificate[]) ipChange.ipc$dispatch("85eb4bd3", new Object[]{byteBuffer, map, certificateFactory});
            }
            ByteBuffer k = k(byteBuffer);
            ByteBuffer k2 = k(byteBuffer);
            byte[] p = p(byteBuffer);
            ArrayList arrayList = new ArrayList();
            byte[] bArr = null;
            byte[] bArr2 = null;
            int i = -1;
            int i2 = 0;
            while (k2.hasRemaining()) {
                i2++;
                try {
                    ByteBuffer k3 = k(k2);
                    if (k3.remaining() >= 8) {
                        int i3 = k3.getInt();
                        arrayList.add(Integer.valueOf(i3));
                        if (o(i3)) {
                            if (i != -1 && c(i3, i) <= 0) {
                            }
                            bArr2 = p(k3);
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
                String m = m(i);
                Pair<String, ? extends AlgorithmParameterSpec> n = n(i);
                String str = (String) n.first;
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) n.second;
                try {
                    PublicKey generatePublic = KeyFactory.getInstance(m).generatePublic(new X509EncodedKeySpec(p));
                    Signature instance = Signature.getInstance(str);
                    instance.initVerify(generatePublic);
                    if (algorithmParameterSpec != null) {
                        instance.setParameter(algorithmParameterSpec);
                    }
                    instance.update(k);
                    if (instance.verify(bArr2)) {
                        k.clear();
                        ByteBuffer k4 = k(k);
                        ArrayList arrayList2 = new ArrayList();
                        int i4 = 0;
                        while (k4.hasRemaining()) {
                            i4++;
                            try {
                                ByteBuffer k5 = k(k4);
                                if (k5.remaining() >= 8) {
                                    int i5 = k5.getInt();
                                    arrayList2.add(Integer.valueOf(i5));
                                    if (i5 == i) {
                                        bArr = p(k5);
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
                            byte[] put = map.put(Integer.valueOf(l(i)), bArr);
                            if (put == null || MessageDigest.isEqual(put, bArr)) {
                                ByteBuffer k6 = k(k);
                                ArrayList arrayList3 = new ArrayList();
                                int i6 = 0;
                                while (k6.hasRemaining()) {
                                    i6++;
                                    byte[] p2 = p(k6);
                                    try {
                                        arrayList3.add(new VerbatimX509Certificate((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(p2)), p2));
                                    } catch (CertificateException e8) {
                                        throw new SecurityException("Failed to decode certificate #" + i6, e8);
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    throw new SecurityException("No certificates listed");
                                } else if (Arrays.equals(p, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                    return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                                } else {
                                    throw new SecurityException("Public key mismatch between certificate and signature record");
                                }
                            } else {
                                throw new SecurityException(i(l) + " contents digest does not match the digest specified by a preceding signer");
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

        public static X509Certificate[][] verify(String str) throws SignatureNotFoundException, SecurityException, IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (X509Certificate[][]) ipChange.ipc$dispatch("cd5e7cf3", new Object[]{str});
            }
            return s(new RandomAccessFile(str, "r"));
        }

        public static ByteBuffer q(ByteBuffer byteBuffer, int i, int i2) {
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
    }

    static {
        t2o.a(951058446);
        t2o.a(947912754);
    }

    public static X509Certificate a(android.content.pm.Signature signature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509Certificate) ipChange.ipc$dispatch("987df462", new Object[]{signature});
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            Log.e(wnc.MODULE, "Cannot decode certificate.", e);
            return null;
        }
    }

    public final android.content.pm.Signature[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (android.content.pm.Signature[]) ipChange.ipc$dispatch("29ea9070", new Object[]{this});
        }
        try {
            return kjv.sContext.getPackageManager().getPackageInfo(kjv.sContext.getPackageName(), 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final boolean c(X509Certificate[][] x509CertificateArr, ArrayList<X509Certificate> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e977166a", new Object[]{this, x509CertificateArr, arrayList})).booleanValue();
        }
        if (x509CertificateArr == null || x509CertificateArr.length == 0 || x509CertificateArr[0].length == 0) {
            return false;
        }
        if (arrayList.isEmpty()) {
            this.f14086a.w("No certificates found for app.");
            return false;
        }
        Iterator<X509Certificate> it = arrayList.iterator();
        while (it.hasNext()) {
            X509Certificate next = it.next();
            boolean z = false;
            for (X509Certificate[] x509CertificateArr2 : x509CertificateArr) {
                if (((ApkSignatureSchemeV2Verifier.VerbatimX509Certificate) x509CertificateArr2[0]).getWrapped().equals(next)) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public void execute(q49 q49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211c1f10", new Object[]{this, q49Var});
            return;
        }
        q49Var.stage = "verify";
        File file = new File(q49Var.downloadPath);
        ArrayList<X509Certificate> arrayList = new ArrayList<>();
        android.content.pm.Signature[] b = b();
        if (b != null) {
            for (android.content.pm.Signature signature : b) {
                X509Certificate a2 = a(signature);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            try {
                if (!c(ApkSignatureSchemeV2Verifier.verify(file.getAbsolutePath()), arrayList)) {
                    q49Var.success = false;
                    q49Var.errorCode = -4;
                    q49Var.errorMsg = Constants.getMsg(-4);
                    return;
                }
                this.f14086a.w("feature verify success");
                return;
            } catch (Exception e) {
                e.printStackTrace();
                this.f14086a.w("feature verify failed");
            }
        }
        q49Var.success = false;
        q49Var.errorCode = -4;
        q49Var.errorMsg = Constants.getMsg(-4);
    }
}
