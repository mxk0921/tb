package com.ut.share.utils;

import android.util.Log;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShareLinkWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SEP = ".";
    private static final String SHARE_KEY = "ut_sk";
    private static final String SHORT_URL_SERVICE_ADDR = "http://adash.m.taobao.com/rest/shorturl";
    private static final String SHORT_URL_SERVICE_PWD = "clark_123ok";
    private static final int VERSION = 1;
    private static Method encodeShortUrlMtd;
    private static Method getItemUrlMtd;
    private static final Pattern URL_PATTERN = Pattern.compile("[.]*(http[s]{0,1}://[\\p{Alnum}|.]+[:\\d]?[\\p{Graph}]*)[.]*");
    public static char[] hexChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        t2o.a(662700085);
        try {
            encodeShortUrlMtd = Class.forName("com.taobao.wireless.tbShortUrl.util.ShortUrlUtil").getMethod("encodeShortUrlByTimeOut", String.class, Long.class, Integer.class);
            getItemUrlMtd = Class.forName("com.taobao.wireless.tbShortUrl.entity.CodeResult").getMethod("getItemUrl", new Class[0]);
        } catch (Exception e) {
            Log.e("[shortUrl]get encode method reflect error", e.getMessage(), e);
        }
    }

    public static String cutWeiboString(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cb590c5", new Object[]{str, new Integer(i)});
        }
        if (str == null) {
            return str;
        }
        try {
            if (str.length() == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (isChineseCh(charAt)) {
                    i2 += 2;
                } else {
                    i2++;
                }
                if (i2 > i) {
                    return sb.toString();
                }
                sb.append(charAt);
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    private static String genShare(String str, String str2, String str3, String str4) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccf522c2", new Object[]{str, str2, str3, str4});
        }
        return str + "ut_sk=" + URLEncoder.encode("1." + str4 + "." + str3 + "." + str2, "UTF-8");
    }

    public static String getMd5(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c653e78a", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                sb.append(hexChar[(b & 240) >>> 4]);
                sb.append(hexChar[b & 15]);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.OutputStream, java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String httpPost(java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.ut.share.utils.ShareLinkWrapper.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "9ed9db9d"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            java.lang.Object r7 = r2.ipc$dispatch(r3, r4)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x0018:
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch: all -> 0x008f, Exception -> 0x0092
            r3.<init>(r7)     // Catch: all -> 0x008f, Exception -> 0x0092
            java.net.URLConnection r7 = r3.openConnection()     // Catch: all -> 0x008f, Exception -> 0x0092
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch: all -> 0x008f, Exception -> 0x0092
            r7.setDoOutput(r0)     // Catch: all -> 0x008f, Exception -> 0x0092
            r7.setDoInput(r0)     // Catch: all -> 0x008f, Exception -> 0x0092
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)     // Catch: all -> 0x008f, Exception -> 0x0092
            r7.setUseCaches(r1)     // Catch: all -> 0x008f, Exception -> 0x0092
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.setConnectTimeout(r0)     // Catch: all -> 0x008f, Exception -> 0x0092
            r7.setReadTimeout(r0)     // Catch: all -> 0x008f, Exception -> 0x0092
            java.lang.String r0 = "Content-Type"
            java.lang.String r3 = "application/x-www-form-urlencoded"
            r7.setRequestProperty(r0, r3)     // Catch: all -> 0x008f, Exception -> 0x0092
            r7.connect()     // Catch: all -> 0x008f, Exception -> 0x0092
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch: all -> 0x008f, Exception -> 0x0092
            java.io.OutputStream r3 = r7.getOutputStream()     // Catch: all -> 0x008f, Exception -> 0x0092
            r0.<init>(r3)     // Catch: all -> 0x008f, Exception -> 0x0092
            java.lang.String r3 = "UTF-8"
            byte[] r8 = r8.getBytes(r3)     // Catch: all -> 0x0089, Exception -> 0x008c
            r0.write(r8)     // Catch: all -> 0x0089, Exception -> 0x008c
            r0.flush()     // Catch: all -> 0x0089, Exception -> 0x008c
            java.io.InputStream r8 = r7.getInputStream()     // Catch: all -> 0x0089, Exception -> 0x008c
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0071, Exception -> 0x0074
            r3.<init>()     // Catch: all -> 0x0071, Exception -> 0x0074
            r4 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r4]     // Catch: all -> 0x0071, Exception -> 0x0074
        L_0x0066:
            int r5 = r8.read(r4)     // Catch: all -> 0x0071, Exception -> 0x0074
            r6 = -1
            if (r5 == r6) goto L_0x0076
            r3.write(r4, r1, r5)     // Catch: all -> 0x0071, Exception -> 0x0074
            goto L_0x0066
        L_0x0071:
            r7 = move-exception
        L_0x0072:
            r2 = r0
            goto L_0x00a5
        L_0x0074:
            r7 = move-exception
            goto L_0x0095
        L_0x0076:
            r7.disconnect()     // Catch: all -> 0x0071, Exception -> 0x0074
            java.lang.String r7 = new java.lang.String     // Catch: all -> 0x0071, Exception -> 0x0074
            byte[] r1 = r3.toByteArray()     // Catch: all -> 0x0071, Exception -> 0x0074
            r7.<init>(r1)     // Catch: all -> 0x0071, Exception -> 0x0074
            r0.close()     // Catch: Exception -> 0x0085
        L_0x0085:
            r8.close()     // Catch: Exception -> 0x0088
        L_0x0088:
            return r7
        L_0x0089:
            r7 = move-exception
            r8 = r2
            goto L_0x0072
        L_0x008c:
            r7 = move-exception
            r8 = r2
            goto L_0x0095
        L_0x008f:
            r7 = move-exception
            r8 = r2
            goto L_0x00a5
        L_0x0092:
            r7 = move-exception
            r8 = r2
            r0 = r8
        L_0x0095:
            r7.printStackTrace()     // Catch: all -> 0x0071
            if (r0 == 0) goto L_0x009f
            r0.close()     // Catch: Exception -> 0x009e
            goto L_0x009f
        L_0x009e:
        L_0x009f:
            if (r8 == 0) goto L_0x00a4
            r8.close()     // Catch: Exception -> 0x00a4
        L_0x00a4:
            return r2
        L_0x00a5:
            if (r2 == 0) goto L_0x00ac
            r2.close()     // Catch: Exception -> 0x00ab
            goto L_0x00ac
        L_0x00ab:
        L_0x00ac:
            if (r8 == 0) goto L_0x00b1
            r8.close()     // Catch: Exception -> 0x00b1
        L_0x00b1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.share.utils.ShareLinkWrapper.httpPost(java.lang.String, java.lang.String):java.lang.String");
    }

    public static boolean isChineseCh(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8aafe5b2", new Object[]{new Character(c)})).booleanValue();
        }
        try {
            if (String.valueOf(c).getBytes("UTF-8").length > 1) {
                return true;
            }
            return false;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static String shortenURLOLd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4a4dab2", new Object[]{str});
        }
        try {
            String valueOf = String.valueOf(System.currentTimeMillis());
            String md5 = getMd5((SHORT_URL_SERVICE_PWD + valueOf).getBytes("UTF-8"));
            String httpPost = httpPost(SHORT_URL_SERVICE_ADDR, "s=" + md5 + "&t=" + valueOf + "&requrl=" + URLEncoder.encode(str, "UTF-8"));
            if (!httpPost.equals("E0001") && !httpPost.equals("E0101")) {
                if (!httpPost.equals("E0102")) {
                    return httpPost;
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static int weiboStringLen(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebdb61c0", new Object[]{str})).intValue();
        }
        if (str != null) {
            try {
                if (str.length() != 0) {
                    int i = 0;
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        if (isChineseCh(str.charAt(i2))) {
                            i += 2;
                        } else {
                            i++;
                        }
                    }
                    return i;
                }
            } catch (Exception unused) {
                return str.length();
            }
        }
        return 0;
    }

    public static String wrapShareLink(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f938f96c", new Object[]{str, str2, str3});
        }
        try {
            String utsid = TBS.Adv.getUtsid();
            StringBuilder sb = new StringBuilder(str3);
            String str4 = "";
            int indexOf = str3.indexOf(63);
            int indexOf2 = str3.indexOf(35);
            String str5 = "?";
            if (indexOf >= 0 && !str3.endsWith(str5)) {
                str4 = "&";
            }
            if (indexOf >= 0) {
                str5 = str4;
            }
            String genShare = genShare(str5, str, str2, utsid);
            if (indexOf2 < 0 || indexOf >= indexOf2) {
                sb.append(genShare);
            } else {
                sb.insert(indexOf2, genShare);
            }
            return sb.toString();
        } catch (Exception unused) {
            return str3;
        }
    }

    public static String wrapShareTextWithLink(String str, String str2, String str3, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("638665b3", new Object[]{str, str2, str3, new Boolean(z)});
        }
        try {
            StringBuilder sb = new StringBuilder();
            Matcher matcher = URL_PATTERN.matcher(str3);
            while (matcher != null && matcher.find()) {
                sb.append(str3.substring(i, matcher.start()));
                String wrapShareLink = wrapShareLink(str, str2, matcher.group());
                if (z) {
                    wrapShareLink = shortenURL(wrapShareLink);
                }
                sb.append(wrapShareLink);
                i = matcher.end();
            }
            sb.append(str3.substring(i));
            return sb.toString();
        } catch (Exception unused) {
            return str3;
        }
    }

    public static String shortenURL(String str) {
        String str2;
        if (str != null && !str.equalsIgnoreCase("")) {
            try {
                Log.e("[shorturl]", "run shortutl action");
                Properties properties = new Properties();
                properties.put("url", str);
                TBS.Ext.commitEvent("TB_WIRELESS_SHORT_URL", properties);
                Method method = encodeShortUrlMtd;
                if (method != null) {
                    Object invoke = method.invoke(null, str, 2L, 0);
                    return (invoke == null || (str2 = (String) getItemUrlMtd.invoke(invoke, new Object[0])) == null || str2.equalsIgnoreCase("")) ? str : str2;
                }
                Log.e("[shorturl]", "encodeShortUrlMtd is null! return input param!");
                return str;
            } catch (Exception unused) {
                Log.e("create short url exception", Localization.q(R.string.taobao_app_1010_1_18104));
            }
        }
        return str;
    }
}
