package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z7h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32588a;
    public final String b;
    public final JSONObject c;
    public JSONObject d;

    static {
        t2o.a(435159093);
    }

    public z7h(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("desktop");
        sb.append(str);
        String sb2 = sb.toString();
        String str2 = sb2 + "configs";
        this.f32588a = str2;
        String str3 = sb2 + "record";
        this.b = str3;
        this.d = o(str2);
        this.c = o(str3);
    }

    public Pair<String, JSONObject> d(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bb146d75", new Object[]{this, str});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject.getBooleanValue("ignoreIndexId") || (jSONObject = this.d) == null || jSONObject.isEmpty() || parseObject.getLongValue("indexId") > this.d.getLongValue("indexId")) {
                return new Pair<>("", parseObject);
            }
            return new Pair<>("indexIdIsOld", parseObject);
        } catch (Throwable unused) {
            return new Pair<>("newConfigInvalid", null);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc361f83", new Object[]{this});
        } else {
            lst.a(new Runnable() { // from class: tb.y7h
                @Override // java.lang.Runnable
                public final void run() {
                    z7h.this.l();
                }
            });
        }
    }

    public JSONObject f() {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3a1ac713", new Object[]{this});
        }
        synchronized (z7h.class) {
            parseObject = JSON.parseObject(this.d.toJSONString());
        }
        return parseObject;
    }

    public JSONObject g() {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("59a73522", new Object[]{this});
        }
        synchronized (z7h.class) {
            parseObject = JSON.parseObject(this.c.toJSONString());
        }
        return parseObject;
    }

    public final String h(String str) {
        Throwable th;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3589122", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (!file.exists()) {
            return "";
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                return new String(bArr);
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    return "";
                } finally {
                    i(fileInputStream);
                }
            }
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    public final void i(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274b86d2", new Object[]{this, closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final boolean j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6cf772a", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (j > 0 && (System.currentTimeMillis() / 1000) - j > vyl.MAX_COMMIT_TIME_INTERVAL) {
            return true;
        }
        return false;
    }

    public boolean k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eca6414a", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (j <= 0) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(System.currentTimeMillis()));
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date(j));
        if (instance2.get(1) == instance.get(1) && instance2.get(6) == instance.get(6)) {
            return true;
        }
        return false;
    }

    public final JSONObject o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8be09f54", new Object[]{this, str});
        }
        try {
            String h = h(str);
            if (!TextUtils.isEmpty(h)) {
                return JSON.parseObject(h);
            }
            return new JSONObject();
        } catch (Throwable th) {
            th.printStackTrace();
            return new JSONObject();
        }
    }

    public final void p(String str, String str2) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44016eb1", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Closeable closeable = null;
            try {
                File file = new File(str);
                if (file.exists() && file.isDirectory()) {
                    file.delete();
                }
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                if (!file.exists()) {
                    file.createNewFile();
                }
                closeable = new FileOutputStream(file, false);
                try {
                    closeable.write(str2.getBytes());
                    closeable.flush();
                } catch (Throwable th2) {
                    closeable = closeable;
                    th = th2;
                    try {
                        th.printStackTrace();
                    } finally {
                        i(closeable);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public void q(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d58c7b", new Object[]{this, str});
        } else {
            lst.a(new Runnable() { // from class: tb.x7h
                @Override // java.lang.Runnable
                public final void run() {
                    z7h.this.m(str);
                }
            });
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7a8806", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (z7h.class) {
                try {
                    this.d = JSON.parseObject(str);
                    p(this.f32588a, str);
                }
            }
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb66216", new Object[]{this});
        } else {
            lst.a(new Runnable() { // from class: tb.w7h
                @Override // java.lang.Runnable
                public final void run() {
                    z7h.this.n();
                }
            });
        }
    }

    public final /* synthetic */ void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b3c6ded", new Object[]{this});
            return;
        }
        synchronized (z7h.class) {
            try {
                JSONObject jSONObject = this.c.getJSONObject("displayFatigue");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    jSONObject.put("biz", (Object) new JSONObject());
                    this.c.put("displayFatigue", (Object) jSONObject);
                }
                long longValue = jSONObject.getLongValue("lastTime");
                if (longValue > 0 && !k(longValue * 1000)) {
                    jSONObject.put(Constants.KEY_TIMES, (Object) 0);
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("biz");
                Iterator<Map.Entry<String, Object>> it = jSONObject2.entrySet().iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(it.next().getKey());
                    if (jSONObject3 != null) {
                        long longValue2 = jSONObject3.getLongValue("lastTime");
                        int i = (longValue2 > 0L ? 1 : (longValue2 == 0L ? 0 : -1));
                        if (i > 0 && j(longValue2 * 1000)) {
                            it.remove();
                        }
                        if (i > 0 && !k(longValue2 * 1000)) {
                            jSONObject3.put(Constants.KEY_TIMES, (Object) 0);
                        }
                    }
                }
                p(this.b, JSON.toJSONString(this.c));
            }
        }
    }

    public final /* synthetic */ void n() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43a0f7b", new Object[]{this});
            return;
        }
        synchronized (z7h.class) {
            try {
                JSONObject jSONObject = this.c.getJSONObject("requestFatigue");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    this.c.put("requestFatigue", (Object) jSONObject);
                }
                long longValue = jSONObject.getLongValue("lastTime");
                int intValue = jSONObject.getIntValue(Constants.KEY_TIMES);
                if (longValue <= 0 || k(longValue * 1000)) {
                    i = intValue;
                }
                jSONObject.put(Constants.KEY_TIMES, (Object) Integer.valueOf(i + 1));
                jSONObject.put("lastTime", (Object) Long.valueOf(System.currentTimeMillis() / 1000));
                p(this.b, JSON.toJSONString(this.c));
            }
        }
    }

    public final /* synthetic */ void m(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cffb1c4b", new Object[]{this, str});
            return;
        }
        synchronized (z7h.class) {
            try {
                JSONObject jSONObject = this.c.getJSONObject("displayFatigue");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    jSONObject.put("biz", (Object) new JSONObject());
                    this.c.put("displayFatigue", (Object) jSONObject);
                }
                long longValue = jSONObject.getLongValue("lastTime");
                int intValue = jSONObject.getIntValue(Constants.KEY_TIMES);
                long j = 0;
                if (longValue <= 0 || k(longValue * 1000)) {
                    i = intValue;
                }
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                jSONObject.put(Constants.KEY_TIMES, (Object) Integer.valueOf(i + 1));
                jSONObject.put("lastTime", (Object) Long.valueOf(currentTimeMillis));
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("biz");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                    if (jSONObject3 == null) {
                        jSONObject3 = new JSONObject();
                        jSONObject2.put(str, (Object) jSONObject3);
                    }
                    long longValue2 = jSONObject3.getLongValue("lastTime");
                    long longValue3 = jSONObject3.getLongValue(Constants.KEY_TIMES);
                    if (longValue2 <= 0 || k(longValue2 * 1000)) {
                        j = longValue3;
                    }
                    jSONObject3.put(Constants.KEY_TIMES, (Object) Long.valueOf(j + 1));
                    jSONObject3.put("lastTime", (Object) Long.valueOf(currentTimeMillis));
                }
                p(this.b, JSON.toJSONString(this.c));
            }
        }
    }
}
