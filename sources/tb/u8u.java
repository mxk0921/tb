package tb;

import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u8u implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int e = 15360;

    /* renamed from: a  reason: collision with root package name */
    private String f29233a;
    private String b;
    private String c;
    private JSONObject d;

    public u8u(String str, String str2, String str3, JSONObject jSONObject) {
        this.f29233a = str;
        this.d = jSONObject;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            String json = this.d.toString();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(json.getBytes("UTF-8"));
            gZIPOutputStream.close();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            int length = encodeToString.length();
            if (length > 15360) {
                int i2 = 0;
                while (i < length) {
                    int i3 = i + 15360;
                    a(i2, encodeToString.substring(i, Math.min(i3, length)));
                    i2++;
                    i = i3;
                }
                return;
            }
            a(-1, encodeToString);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6303d8a4", new Object[]{this, new Integer(i), str});
            return;
        }
        String format = String.format("%s_%d", this.f29233a, Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("index", format);
        hashMap.put("response", str);
        hdv.a().commitFailure("response", this.f29233a, "", this.b, this.c, hashMap, "UmbrellaTrace", "场景诊断");
    }
}
