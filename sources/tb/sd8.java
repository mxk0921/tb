package tb;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sd8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UTF_8 = "UTF-8";

    static {
        t2o.a(1034944556);
    }

    public static byte[] a(String str) {
        Throwable th;
        GZIPOutputStream gZIPOutputStream;
        StringBuilder sb;
        ByteArrayOutputStream byteArrayOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3e427504", new Object[]{str});
        }
        byte[] bArr = new byte[0];
        if (TextUtils.isEmpty(str)) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(str.getBytes("UTF-8"));
                    gZIPOutputStream.finish();
                    bArr = byteArrayOutputStream.toByteArray();
                    try {
                        gZIPOutputStream.close();
                    } catch (IOException e) {
                        Log.e("compressStringToGzip", "compress close gzip err " + e.getMessage());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    try {
                        Log.e("compressStringToGzip", "compress err " + th.getMessage());
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e2) {
                                Log.e("compressStringToGzip", "compress close gzip err " + e2.getMessage());
                            }
                        }
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException e3) {
                                e = e3;
                                sb = new StringBuilder("compress close outputStream err ");
                                sb.append(e.getMessage());
                                Log.e("compressStringToGzip", sb.toString());
                                return bArr;
                            }
                        }
                        return bArr;
                    } catch (Throwable th3) {
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e4) {
                                Log.e("compressStringToGzip", "compress close gzip err " + e4.getMessage());
                            }
                        }
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException e5) {
                                Log.e("compressStringToGzip", "compress close outputStream err " + e5.getMessage());
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            gZIPOutputStream = null;
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e6) {
            e = e6;
            sb = new StringBuilder("compress close outputStream err ");
            sb.append(e.getMessage());
            Log.e("compressStringToGzip", sb.toString());
            return bArr;
        }
        return bArr;
    }

    public static JSONObject b(String str) {
        String c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("acf6c562", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            c = c(Base64.decode(str, 0));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (TextUtils.isEmpty(c)) {
            return jSONObject;
        }
        String[] split = c.split("\n");
        if (split != null && split.length > 0) {
            for (String str2 : split) {
                String[] split2 = str2.split("=", 2);
                if (split2 != null && split2.length == 2) {
                    jSONObject.put(split2[0], new JSONObject(split2[1]));
                }
            }
        }
        return jSONObject;
    }

    public static String c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea1f8449", new Object[]{bArr});
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 32);
            StringBuilder sb = new StringBuilder();
            byte[] bArr2 = new byte[32];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read != -1) {
                    sb.append(new String(bArr2, 0, read));
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
            }
        } catch (Throwable th) {
            Log.e("EncodeUTF8", "encode err " + th.getMessage());
            return "";
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f52dc359", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Exception e) {
            Log.e("EncodeUTF8", "encode err " + e.getMessage());
            return "";
        }
    }

    public static String e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f39297ca", new Object[]{bArr});
        }
        if (bArr == null || bArr.length < 1) {
            return "";
        }
        try {
            return new String(Base64.encode(bArr, 11), "UTF-8");
        } catch (Throwable th) {
            Log.e("encodeByteToBase64", "encode bytes to base64 err " + th.getMessage());
            return "";
        }
    }
}
