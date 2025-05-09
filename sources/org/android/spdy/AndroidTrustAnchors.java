package org.android.spdy;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertPathValidator;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import tb.l0r;
import tb.txn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AndroidTrustAnchors {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "tnetsdk.AndroidTrustAnchors";
    private Set<TrustAnchor> trustAnchors;
    private static final String[] GLOBAL_SIGN_ROOT_CA = {"-----BEGIN CERTIFICATE-----\nMIIDdTCCAl2gAwIBAgILBAAAAAABFUtaw5QwDQYJKoZIhvcNAQEFBQAwVzELMAkG\nA1UEBhMCQkUxGTAXBgNVBAoTEEdsb2JhbFNpZ24gbnYtc2ExEDAOBgNVBAsTB1Jv\nb3QgQ0ExGzAZBgNVBAMTEkdsb2JhbFNpZ24gUm9vdCBDQTAeFw05ODA5MDExMjAw\nMDBaFw0yODAxMjgxMjAwMDBaMFcxCzAJBgNVBAYTAkJFMRkwFwYDVQQKExBHbG9i\nYWxTaWduIG52LXNhMRAwDgYDVQQLEwdSb290IENBMRswGQYDVQQDExJHbG9iYWxT\naWduIFJvb3QgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDaDuaZ\njc6j40+Kfvvxi4Mla+pIH/EqsLmVEQS98GPR4mdmzxzdzxtIK+6NiY6arymAZavp\nxy0Sy6scTHAHoT0KMM0VjU/43dSMUBUc71DuxC73/OlS8pF94G3VNTCOXkNz8kHp\n1Wrjsok6Vjk4bwY8iGlbKk3Fp1S4bInMm/k8yuX9ifUSPJJ4ltbcdG6TRGHRjcdG\nsnUOhugZitVtbNV4FpWi6cgKOOvyJBNPc1STE4U6G7weNLWLBYy5d4ux2x8gkasJ\nU26Qzns3dLlwR5EiUWMWea6xrkEmCMgZK9FGqkjWZCrXgzT/LCrBbBlDSgeF59N8\n9iFo7+ryUp9/k5DPAgMBAAGjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNVHRMBAf8E\nBTADAQH/MB0GA1UdDgQWBBRge2YaRQ2XyolQL30EzTSo//z9SzANBgkqhkiG9w0B\nAQUFAAOCAQEA1nPnfE920I2/7LqivjTFKDK1fPxsnCwrvQmeU79rXqoRSLblCKOz\nyj1hTdNGCbM+w6DjY1Ub8rrvrTnhQ7k4o+YviiY776BQVvnGCv04zcQLcFGUl5gE\n38NflNUVyRRBnMRddWQVDf9VMOyGj/8N7yy5Y0b2qvzfvGn9LhJIZJrglfCm7ymP\nAbEVtQwdpf5pLGkkeB6zpxxxYu7KyJesF12KwvhHhm4qxFYxldBniYUr+WymXUad\nDKqC5JlR3XC321Y9YeRq4VzW9v493kHMB65jUr9TU/Qr6cf9tveCX4XSQRjbgbME\nHMUfpIBvFSDJ3gyICh3WZlXi/EjJKSZp4A==\n-----END CERTIFICATE-----\n", "-----BEGIN CERTIFICATE-----\nMIIDXzCCAkegAwIBAgILBAAAAAABIVhTCKIwDQYJKoZIhvcNAQELBQAwTDEgMB4G\nA1UECxMXR2xvYmFsU2lnbiBSb290IENBIC0gUjMxEzARBgNVBAoTCkdsb2JhbFNp\nZ24xEzARBgNVBAMTCkdsb2JhbFNpZ24wHhcNMDkwMzE4MTAwMDAwWhcNMjkwMzE4\nMTAwMDAwWjBMMSAwHgYDVQQLExdHbG9iYWxTaWduIFJvb3QgQ0EgLSBSMzETMBEG\nA1UEChMKR2xvYmFsU2lnbjETMBEGA1UEAxMKR2xvYmFsU2lnbjCCASIwDQYJKoZI\nhvcNAQEBBQADggEPADCCAQoCggEBAMwldpB5BngiFvXAg7aEyiie/QV2EcWtiHL8\nRgJDx7KKnQRfJMsuS+FggkbhUqsMgUdwbN1k0ev1LKMPgj0MK66X17YUhhB5uzsT\ngHeMCOFJ0mpiLx9e+pZo34knlTifBtc+ycsmWQ1z3rDI6SYOgxXG71uL0gRgykmm\nKPZpO/bLyCiR5Z2KYVc3rHQU3HTgOu5yLy6c+9C7v/U9AOEGM+iCK65TpjoWc4zd\nQQ4gOsC0p6Hpsk+QLjJg6VfLuQSSaGjlOCZgdbKfd/+RFO+uIEn8rUAVSNECMWEZ\nXriX7613t2Saer9fwRPvm2L7DWzgVGkWqQPabumDk3F2xmmFghcCAwEAAaNCMEAw\nDgYDVR0PAQH/BAQDAgEGMA8GA1UdEwEB/wQFMAMBAf8wHQYDVR0OBBYEFI/wS3+o\nLkUkrk1Q+mOai97i3Ru8MA0GCSqGSIb3DQEBCwUAA4IBAQBLQNvAUKr+yAzv95ZU\nRUm7lgAJQayzE4aGKAczymvmdLm6AC2upArT9fHxD4q/c2dKg8dEe3jgr25sbwMp\njjM5RcOO5LlXbKr8EpbsU8Yt5CRsuZRj+9xTaGdWPoO4zzUhw8lo/s7awlOqzJCK\n6fBdRoyV3XpYKBovHd7NADdBj+1EbddTKJd+82cEHhXXipa0095MJ6RMG3NzdvQX\nmcIfeg7jLQitChws/zyrVQ4PkX4268NXSb7hLi18YIvDQVETI53O9zJrlAGomecs\nMx86OyXShkDOOyyGeMlhLxS67ttVb9+E7gUJTb0o2HLO02JQZR7rkpeDMdmztcpH\nWD9f\n-----END CERTIFICATE-----", "-----BEGIN CERTIFICATE-----\nMIIFgzCCA2ugAwIBAgIORea7A4Mzw4VlSOb/RVEwDQYJKoZIhvcNAQEMBQAwTDEg\nMB4GA1UECxMXR2xvYmFsU2lnbiBSb290IENBIC0gUjYxEzARBgNVBAoTCkdsb2Jh\nbFNpZ24xEzARBgNVBAMTCkdsb2JhbFNpZ24wHhcNMTQxMjEwMDAwMDAwWhcNMzQx\nMjEwMDAwMDAwWjBMMSAwHgYDVQQLExdHbG9iYWxTaWduIFJvb3QgQ0EgLSBSNjET\nMBEGA1UEChMKR2xvYmFsU2lnbjETMBEGA1UEAxMKR2xvYmFsU2lnbjCCAiIwDQYJ\nKoZIhvcNAQEBBQADggIPADCCAgoCggIBAJUH6HPKZvnsFMp7PPcNCPG0RQssgrRI\nxutbPK6DuEGSMxSkb3/pKszGsIhrxbaJ0cay/xTOURQh7ErdG1rG1ofuTToVBu1k\nZguSgMpE3nOUTvOniX9PeGMIyBJQbUJmL025eShNUhqKGoC3GYEOfsSKvGRMIRxD\naNc9PIrFsmbVkJq3MQbFvuJtMgamHvm566qjuL++gmNQ0PAYid/kD3n16qIfKtJw\nLnvnvJO7bVPiSHyMEAc4/2ayd2F+4OqMPKq0pPbzlUoSB239jLKJz9CgYXfIWHSw\n1CM69106yqLbnQneXUQtkPGBzVeS+n68UARjNN9rkxi+azayOeSsJDa38O+2HBNX\nk7besvjihbdzorg1qkXy4J02oW9UivFyVm4uiMVRQkQVlO6jxTiWm05OWgtH8wY2\nSXcwvHE35absIQh1/OZhFj931dmRl4QKbNQCTXTAFO39OfuD8l4UoQSwC+n+7o/h\nbguyCLNhZglqsQY6ZZZZwPA1/cnaKI0aEYdwgQqomnUdnjqGBQCe24DWJfncBZ4n\nWUx2OVvq+aWh2IMP0f/fMBH5hc8zSPXKbWQULHpYT9NLCEnFlWQaYw55PfWzjMpY\nrZxCRXluDocZXFSxZba/jJvcE+kNb7gu3GduyYsRtYQUigAZcIN5kZeR1Bonvzce\nMgfYFGM8KEyvAgMBAAGjYzBhMA4GA1UdDwEB/wQEAwIBBjAPBgNVHRMBAf8EBTAD\nAQH/MB0GA1UdDgQWBBSubAWjkxPioufi1xzWx/B/yGdToDAfBgNVHSMEGDAWgBSu\nbAWjkxPioufi1xzWx/B/yGdToDANBgkqhkiG9w0BAQwFAAOCAgEAgyXt6NH9lVLN\nnsAEoJFp5lzQhN7craJP6Ed41mWYqVuoPId8AorRbrcWc+ZfwFSY1XS+wc3iEZGt\nIxg93eFyRJa0lV7Ae46ZeBZDE1ZXs6KzO7V33EByrKPrmzU+sQghoefEQzd5Mr61\n55wsTLxDKZmOMNOsIeDjHfrYBzN2VAAiKrlNIC5waNrlU/yDXNOd8v9EDERm8tLj\nvUYAGm0CuiVdjaExUd1URhxN25mW7xocBFymFe944Hn+Xds+qkxV/ZoVqW/hpvvf\ncDDpw+5CRu3CkwWJ+n1jez/QcYF8AOiYrg54NMMl+68KnyBr3TsTjxKM4kEaSHpz\noHdpx7Zcf4LIHv5YGygrqGytXm3ABdJ7t+uA/iU3/gKbaKxCXcPu9czc8FB10jZp\nnOZ7BN9uBmm23goJSFmH63sUYHpkqmlD75HHTOwY3WzvUy2MmeFe8nI+z1TIvWfs\npA9MRf/TuTAjB0yPEL+GltmZWrSZVxykzLsViVO6LAUP5MSeGbEYNNVMnbrt9x+v\nJJUEeKgDu+6B5dpffItKoZB0JaezPkvILFa9x8jvOOJckvB595yEunQtYQEgfn7R\n8k8HWV+LLUNS60YMlOH1Zkd5d9VUWx+tJDfLRVpOoERIyNiwmcUVhAn21klJwGW4\n5hpxbqCo8YLoRT5s1gLXCmeDBVrJpBA=\n-----END CERTIFICATE-----"};
    public static volatile boolean inited = false;
    private static final Object lock = new Object();
    private static final AndroidTrustAnchors singleton = new AndroidTrustAnchors();
    private volatile PKIXParameters mPkixParameters = null;
    private volatile CertPathValidator mCertPathValidator = null;
    private volatile CertificateFactory mCertificateFactory = null;

    private AndroidTrustAnchors() {
        this.trustAnchors = null;
        this.trustAnchors = new HashSet();
    }

    public static AndroidTrustAnchors getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidTrustAnchors) ipChange.ipc$dispatch("b5c4ba30", new Object[0]);
        }
        return singleton;
    }

    public CertPathValidator getCertPathValidator() {
        CertPathValidator certPathValidator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CertPathValidator) ipChange.ipc$dispatch("182401ab", new Object[]{this});
        }
        synchronized (lock) {
            certPathValidator = this.mCertPathValidator;
        }
        return certPathValidator;
    }

    public CertificateFactory getCertificateFactory() {
        CertificateFactory certificateFactory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CertificateFactory) ipChange.ipc$dispatch("2214e6c5", new Object[]{this});
        }
        synchronized (lock) {
            if (this.mCertificateFactory == null) {
                try {
                    this.mCertificateFactory = CertificateFactory.getInstance("X.509");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            certificateFactory = this.mCertificateFactory;
        }
        return certificateFactory;
    }

    public PKIXParameters getPKIXParameters() {
        PKIXParameters pKIXParameters;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PKIXParameters) ipChange.ipc$dispatch("939a63a5", new Object[]{this});
        }
        synchronized (lock) {
            pKIXParameters = this.mPkixParameters;
        }
        return pKIXParameters;
    }

    public Set<TrustAnchor> getTrustAnchors() {
        Set<TrustAnchor> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("fce07692", new Object[]{this});
        }
        synchronized (lock) {
            set = this.trustAnchors;
        }
        return set;
    }

    public PKIXParameters setmPkixParameters(Set<TrustAnchor> set) {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PKIXParameters) ipChange.ipc$dispatch("8167192d", new Object[]{this, set});
        }
        PKIXParameters pKIXParameters = null;
        if (set == null) {
            return null;
        }
        try {
            if (set.isEmpty()) {
                return null;
            }
            PKIXParameters pKIXParameters2 = new PKIXParameters(set);
            try {
                pKIXParameters2.setRevocationEnabled(false);
                this.mPkixParameters = pKIXParameters2;
                return pKIXParameters2;
            } catch (Exception e2) {
                e = e2;
                pKIXParameters = pKIXParameters2;
                e.printStackTrace();
                return pKIXParameters;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public synchronized void InitializeFromPresetCertificat() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2055a96e", new Object[]{this});
        } else if (!inited) {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            CertPathValidator instance2 = CertPathValidator.getInstance("PKIX");
            synchronized (lock) {
                this.mCertificateFactory = instance;
                this.mCertPathValidator = instance2;
                for (String str : GLOBAL_SIGN_ROOT_CA) {
                    this.trustAnchors.add(new TrustAnchor((X509Certificate) instance.generateCertificate(new ByteArrayInputStream(str.getBytes(StandardCharsets.ISO_8859_1))), null));
                }
                Context context = SpdyAgent.getContext();
                if (!(!l0r.V() || context == null || (sharedPreferences = context.getSharedPreferences(txn.SP_NAME, 0)) == null)) {
                    String string = sharedPreferences.getString(txn.TNET_TRUSTED_ROOT_CERT, "");
                    if (!TextUtils.isEmpty(string)) {
                        spduLog.Tloge(TAG, null, "root cert", string);
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            String string2 = jSONArray.getString(i);
                            if (!TextUtils.isEmpty(string2)) {
                                this.trustAnchors.add(new TrustAnchor((X509Certificate) instance.generateCertificate(new ByteArrayInputStream(string2.getBytes(StandardCharsets.ISO_8859_1))), null));
                            }
                        }
                    }
                }
                setmPkixParameters(this.trustAnchors);
                inited = true;
            }
        }
    }
}
