package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PackageInfoCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static Signature[] getApkContentsSigners(SigningInfo signingInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Signature[]) ipChange.ipc$dispatch("ae08e940", new Object[]{signingInfo});
            }
            return signingInfo.getApkContentsSigners();
        }

        public static long getLongVersionCode(PackageInfo packageInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8f823265", new Object[]{packageInfo})).longValue();
            }
            return packageInfo.getLongVersionCode();
        }

        public static Signature[] getSigningCertificateHistory(SigningInfo signingInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Signature[]) ipChange.ipc$dispatch("fc447863", new Object[]{signingInfo});
            }
            return signingInfo.getSigningCertificateHistory();
        }

        public static boolean hasMultipleSigners(SigningInfo signingInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("787b1aa2", new Object[]{signingInfo})).booleanValue();
            }
            return signingInfo.hasMultipleSigners();
        }

        public static boolean hasSigningCertificate(PackageManager packageManager, String str, byte[] bArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5446018b", new Object[]{packageManager, str, bArr, new Integer(i)})).booleanValue();
            }
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    private PackageInfoCompat() {
    }

    private static byte[] computeSHA256Digest(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("60e9d82d", new Object[]{bArr});
        }
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e);
        }
    }

    public static long getLongVersionCode(PackageInfo packageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f823265", new Object[]{packageInfo})).longValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getLongVersionCode(packageInfo);
        }
        return packageInfo.versionCode;
    }

    public static List<Signature> getSignatures(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5f9c7257", new Object[]{packageManager, str});
        }
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            if (Api28Impl.hasMultipleSigners(signingInfo)) {
                signatureArr = Api28Impl.getApkContentsSigners(signingInfo);
            } else {
                signatureArr = Api28Impl.getSigningCertificateHistory(signingInfo);
            }
        } else {
            signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        }
        if (signatureArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(signatureArr);
    }

    public static boolean hasSignatures(PackageManager packageManager, String str, Map<byte[], Integer> map, boolean z) throws PackageManager.NameNotFoundException {
        byte[][] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b397d81f", new Object[]{packageManager, str, map, new Boolean(z)})).booleanValue();
        }
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> keySet = map.keySet();
        for (byte[] bArr2 : keySet) {
            if (bArr2 != null) {
                Integer num = map.get(bArr2);
                if (num != null) {
                    int intValue = num.intValue();
                    if (!(intValue == 0 || intValue == 1)) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
                    }
                } else {
                    throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
                }
            } else {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
        }
        List<Signature> signatures = getSignatures(packageManager, str);
        if (z || Build.VERSION.SDK_INT < 28) {
            if (signatures.size() != 0 && map.size() <= signatures.size() && (!z || map.size() == signatures.size())) {
                if (map.containsValue(1)) {
                    bArr = new byte[signatures.size()];
                    for (int i = 0; i < signatures.size(); i++) {
                        bArr[i] = computeSHA256Digest(signatures.get(i).toByteArray());
                    }
                } else {
                    bArr = null;
                }
                Iterator<byte[]> it = keySet.iterator();
                if (it.hasNext()) {
                    byte[] next = it.next();
                    Integer num2 = map.get(next);
                    int intValue2 = num2.intValue();
                    if (intValue2 != 0) {
                        if (intValue2 != 1) {
                            throw new IllegalArgumentException("Unsupported certificate type " + num2);
                        } else if (!byteArrayContains(bArr, next)) {
                            return false;
                        }
                    } else if (!signatures.contains(new Signature(next))) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        for (byte[] bArr3 : keySet) {
            if (!Api28Impl.hasSigningCertificate(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                return false;
            }
        }
        return true;
    }

    private static boolean byteArrayContains(byte[][] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d19a2e50", new Object[]{bArr, bArr2})).booleanValue();
        }
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }
}
