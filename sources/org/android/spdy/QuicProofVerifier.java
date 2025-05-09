package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Set;
import tb.l0r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class QuicProofVerifier {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "tnetsdk.QuicProofVerifier";

    public static int VerifyProof(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9324716", new Object[]{str, strArr})).intValue();
        }
        if (AndroidTrustAnchors.inited) {
            try {
                CertificateFactory certificateFactory = AndroidTrustAnchors.getInstance().getCertificateFactory();
                if (certificateFactory == null) {
                    return 0;
                }
                ArrayList arrayList = new ArrayList();
                PKIXParameters pKIXParametersFromPresetCA = getPKIXParametersFromPresetCA();
                CertPathValidator certPathValidator = AndroidTrustAnchors.getInstance().getCertPathValidator();
                if (pKIXParametersFromPresetCA == null || certPathValidator == null) {
                    spduLog.Logd(TAG, "Initialize fail, params = " + pKIXParametersFromPresetCA + " validator = " + certPathValidator);
                    return 0;
                }
                for (String str2 : strArr) {
                    arrayList.add((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(str2.getBytes(StandardCharsets.ISO_8859_1))));
                }
                try {
                    certPathValidator.validate(certificateFactory.generateCertPath(arrayList), pKIXParametersFromPresetCA);
                } catch (CertPathValidatorException e) {
                    spduLog.Tloge(TAG, null, "validator excetion", "e", e);
                }
                return 1;
            } catch (Throwable th) {
                th.printStackTrace();
                return 0;
            }
        } else if (!l0r.m() || !SpdyAgent.isInAllowLaunchTimePass(3000L)) {
            return 0;
        } else {
            return 1;
        }
    }

    private static PKIXParameters getPKIXParametersFromPresetCA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PKIXParameters) ipChange.ipc$dispatch("e475b4cc", new Object[0]);
        }
        PKIXParameters pKIXParameters = AndroidTrustAnchors.getInstance().getPKIXParameters();
        if (pKIXParameters != null) {
            return pKIXParameters;
        }
        Set<TrustAnchor> trustAnchors = AndroidTrustAnchors.getInstance().getTrustAnchors();
        if (trustAnchors == null) {
            return null;
        }
        return AndroidTrustAnchors.getInstance().setmPkixParameters(trustAnchors);
    }
}
