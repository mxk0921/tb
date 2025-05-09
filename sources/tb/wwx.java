package tb;

import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wwx {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f30977a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    public static final String[] b;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", ErrorType.NETWORK, "net", "or", "org"};
        b = strArr;
        Arrays.sort(strArr);
    }

    public static final void a(String str, X509Certificate x509Certificate, boolean z) throws SSLException {
        String[] d = d(x509Certificate);
        String[] f = f(x509Certificate);
        Arrays.toString(d);
        Arrays.toString(f);
        b(str, d, f, z);
    }

    public static final void b(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        String str2;
        LinkedList linkedList = new LinkedList();
        if (!(strArr == null || strArr.length <= 0 || (str2 = strArr[0]) == null)) {
            linkedList.add(str2);
        }
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str3 != null) {
                    linkedList.add(str3);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
            Iterator it = linkedList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
                stringBuffer.append(" <");
                stringBuffer.append(lowerCase2);
                stringBuffer.append('>');
                if (it.hasNext()) {
                    stringBuffer.append(" OR");
                }
                if (!lowerCase2.startsWith("*.") || lowerCase2.indexOf(46, 2) == -1 || !c(lowerCase2) || g(str)) {
                    z2 = lowerCase.equals(lowerCase2);
                    continue;
                } else {
                    boolean endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                    if (!endsWith || !z) {
                        z2 = endsWith;
                        continue;
                    } else if (e(lowerCase) == e(lowerCase2)) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                }
                if (z2) {
                    break;
                }
            }
            if (!z2) {
                throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
            }
            return;
        }
        throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
    }

    public static boolean c(String str) {
        int length = str.length();
        if (length < 7 || length > 9) {
            return true;
        }
        int i = length - 3;
        if (str.charAt(i) != '.') {
            return true;
        }
        if (Arrays.binarySearch(b, str.substring(2, i)) < 0) {
            return true;
        }
        return false;
    }

    public static String[] d(X509Certificate x509Certificate) {
        List<String> d = new ctx(x509Certificate.getSubjectX500Principal()).d(AdvanceSetting.CLEAR_NOTIFICATION);
        if (d.isEmpty()) {
            return null;
        }
        String[] strArr = new String[d.size()];
        d.toArray(strArr);
        return strArr;
    }

    public static int e(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    public static String[] f(X509Certificate x509Certificate) {
        Collection<List<?>> collection;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            x5y.b("", "Error parsing certificate.", e);
            collection = null;
        }
        if (collection != null) {
            for (List<?> list : collection) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    public static boolean g(String str) {
        return f30977a.matcher(str).matches();
    }
}
