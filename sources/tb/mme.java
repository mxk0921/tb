package tb;

import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class mme extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297361);
    }

    public static /* synthetic */ Object ipc$super(mme mmeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageMockNode");
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return "ImageMockResponse";
    }

    @Override // tb.yy1
    public x7m k(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("826f33b6", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        Map<String, String> l = w7mVar.l();
        if (l != null && !l.isEmpty()) {
            hashMap.putAll(u7j.c(w7mVar.k(), w7mVar.l()));
        }
        hashMap.put("appId", "21834");
        hashMap.put("apiVersion", "1.0");
        JSONObject o = o();
        pmf.D0(Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        nmf b = nmf.Companion.b(o);
        b.b0(hashMap);
        return f(b);
    }

    public final JSONObject o() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c9677579", new Object[]{this});
        }
        File file = new File(ckf.p(Environment.getExternalStorageDirectory().getAbsolutePath(), "/pltTask/mock.txt"));
        if (!file.exists() || !file.isFile()) {
            return new JSONObject();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        StringBuilder sb = new StringBuilder();
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!TextUtils.isEmpty(readLine)) {
                        sb.append(readLine);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (sb.length() == 0) {
                return new JSONObject();
            }
            try {
                jSONObject = JSON.parseObject(sb.toString());
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            ckf.f(jSONObject, "resultObject");
            return jSONObject;
        } finally {
            fileInputStream.close();
        }
    }
}
