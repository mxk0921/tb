package tb;

import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.network.http.HttpType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class i8b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final i8b INSTANCE = new i8b();

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f21153a;

    static {
        t2o.a(839909858);
        Pattern compile = Pattern.compile("charset=([a-z0-9-]+)");
        ckf.f(compile, "compile(\"charset=([a-z0-9-]+)\")");
        f21153a = compile;
    }

    public final String a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b30007b", new Object[]{this, map, str});
        }
        if (map == null || str == null) {
            return null;
        }
        if (map.containsKey(str)) {
            return map.get(str);
        }
        Locale locale = Locale.ROOT;
        ckf.f(locale, "ROOT");
        String lowerCase = str.toLowerCase(locale);
        ckf.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return map.get(lowerCase);
    }

    public final String d(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4df5ccb", new Object[]{this, inputStream});
        }
        ckf.g(inputStream, "inputStream");
        byte[] e = e(inputStream);
        if (e == null) {
            return null;
        }
        try {
            return Base64.encodeToString(e, 2);
        } catch (Exception e2) {
            TMSLogger.c("HttpUtils", e2.getMessage(), e2);
            return null;
        }
    }

    public final byte[] e(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("eac6335a", new Object[]{this, inputStream});
        }
        ckf.g(inputStream, "inputStream");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (UnsupportedEncodingException e) {
            TMSLogger.c("HttpUtils", e.getMessage(), e);
            return null;
        } catch (IOException e2) {
            TMSLogger.c("HttpUtils", e2.getMessage(), e2);
            return null;
        }
    }

    public final Map<String, String> b(hcn hcnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e1002ab0", new Object[]{this, hcnVar});
        }
        ckf.g(hcnVar, "response");
        HashMap hashMap = new HashMap();
        if (hcnVar.a() != null) {
            for (Map.Entry<String, List<String>> entry : hcnVar.a().entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (!value.isEmpty()) {
                    if (key == null) {
                        key = "_";
                    }
                    hashMap.put(key, value.get(0));
                }
            }
        }
        return hashMap;
    }

    public final Object c(String str, HttpType httpType) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("eea9aba1", new Object[]{this, str, httpType});
        }
        ckf.g(str, "data");
        if (httpType == HttpType.json) {
            return JSON.parse(str);
        }
        if (httpType != HttpType.jsonp) {
            return str;
        }
        if (str.length() == 0) {
            return new JSONObject();
        }
        int Y = wsq.Y(str, f7l.BRACKET_START_STR, 0, false, 6, null) + 1;
        int e0 = wsq.e0(str, f7l.BRACKET_END_STR, 0, false, 6, null);
        if (Y == 0 || Y >= e0 || e0 <= 0) {
            return new JSONObject();
        }
        String substring = str.substring(Y, e0);
        ckf.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return JSON.parse(substring);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:6|(2:8|(10:10|(1:13)|14|41|38|15|(2:16|(1:18)(1:43))|25|26|33))|11|(0)|14|41|38|15|(3:16|(0)(0)|18)|25|26|33) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:8|(10:10|(1:13)|14|41|38|15|(2:16|(1:18)(1:43))|25|26|33))|41|38|15|(3:16|(0)(0)|18)|25|26|33) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        com.taobao.themis.kernel.basic.TMSLogger.c("HttpUtils", "http channel readAsString error", r9);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
        com.taobao.themis.kernel.basic.TMSLogger.c("HttpUtils", r10.getMessage(), r10);
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        r9.close();
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        com.taobao.themis.kernel.basic.TMSLogger.c("HttpUtils", r0.getMessage(), r0);
        r0 = r10.toString();
        tb.ckf.f(r0, "{\n            TMSLogger.…sult.toString()\n        }");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r9.close();
        r0 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[Catch: all -> 0x0069, IOException -> 0x006b, UnsupportedEncodingException -> 0x006d, LOOP:0: B:16:0x005e->B:18:0x0065, LOOP_END, TryCatch #3 {IOException -> 0x006b, blocks: (B:15:0x005c, B:16:0x005e, B:18:0x0065, B:25:0x006f), top: B:38:0x005c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f A[EDGE_INSN: B:43:0x006f->B:25:0x006f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(java.io.InputStream r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "http channel readAsString error"
            java.lang.String r3 = "HttpUtils"
            com.android.alibaba.ip.runtime.IpChange r4 = tb.i8b.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001f
            java.lang.String r2 = "d6748f43"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r8
            r3[r0] = r9
            r9 = 2
            r3[r9] = r10
            java.lang.Object r9 = r4.ipc$dispatch(r2, r3)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L_0x001f:
            java.lang.String r4 = "inputStream"
            tb.ckf.g(r9, r4)
            java.lang.String r4 = "utf-8"
            if (r10 == 0) goto L_0x0050
            java.util.regex.Pattern r5 = tb.i8b.f21153a
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r7 = "ROOT"
            tb.ckf.f(r6, r7)
            java.lang.String r10 = r10.toLowerCase(r6)
            java.lang.String r6 = "this as java.lang.String).toLowerCase(locale)"
            tb.ckf.f(r10, r6)
            java.util.regex.Matcher r10 = r5.matcher(r10)
            java.lang.String r5 = "CHARSET_PATTERN.matcher(…toLowerCase(Locale.ROOT))"
            tb.ckf.f(r10, r5)
            boolean r5 = r10.find()
            if (r5 == 0) goto L_0x0050
            java.lang.String r10 = r10.group(r0)
            goto L_0x0051
        L_0x0050:
            r10 = r4
        L_0x0051:
            if (r10 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r4 = r10
        L_0x0055:
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r10.<init>()
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: all -> 0x0069, IOException -> 0x006b, UnsupportedEncodingException -> 0x006d
        L_0x005e:
            int r5 = r9.read(r0)     // Catch: all -> 0x0069, IOException -> 0x006b, UnsupportedEncodingException -> 0x006d
            r6 = -1
            if (r5 == r6) goto L_0x006f
            r10.write(r0, r1, r5)     // Catch: all -> 0x0069, IOException -> 0x006b, UnsupportedEncodingException -> 0x006d
            goto L_0x005e
        L_0x0069:
            r10 = move-exception
            goto L_0x00a4
        L_0x006b:
            r10 = move-exception
            goto L_0x0082
        L_0x006d:
            r0 = move-exception
            goto L_0x008f
        L_0x006f:
            java.lang.String r0 = r10.toString(r4)     // Catch: all -> 0x0069, IOException -> 0x006b, UnsupportedEncodingException -> 0x006d
            java.lang.String r1 = "{\n            val buffer…String(charset)\n        }"
            tb.ckf.f(r0, r1)     // Catch: all -> 0x0069, IOException -> 0x006b, UnsupportedEncodingException -> 0x006d
            r9.close()     // Catch: Exception -> 0x007d
            goto L_0x00a3
        L_0x007d:
            r9 = move-exception
            com.taobao.themis.kernel.basic.TMSLogger.c(r3, r2, r9)
            goto L_0x00a3
        L_0x0082:
            java.lang.String r0 = r10.getMessage()     // Catch: all -> 0x0069
            com.taobao.themis.kernel.basic.TMSLogger.c(r3, r0, r10)     // Catch: all -> 0x0069
            java.lang.String r0 = ""
            r9.close()     // Catch: Exception -> 0x007d
            goto L_0x00a3
        L_0x008f:
            java.lang.String r1 = r0.getMessage()     // Catch: all -> 0x0069
            com.taobao.themis.kernel.basic.TMSLogger.c(r3, r1, r0)     // Catch: all -> 0x0069
            java.lang.String r0 = r10.toString()     // Catch: all -> 0x0069
            java.lang.String r10 = "{\n            TMSLogger.…sult.toString()\n        }"
            tb.ckf.f(r0, r10)     // Catch: all -> 0x0069
            r9.close()     // Catch: Exception -> 0x007d
        L_0x00a3:
            return r0
        L_0x00a4:
            r9.close()     // Catch: Exception -> 0x00a8
            goto L_0x00ac
        L_0x00a8:
            r9 = move-exception
            com.taobao.themis.kernel.basic.TMSLogger.c(r3, r2, r9)
        L_0x00ac:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.i8b.f(java.io.InputStream, java.lang.String):java.lang.String");
    }
}
