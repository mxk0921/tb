package tb;

import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static d8s e;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f17652a;
    public long b;
    public long c;
    public long d;

    static {
        t2o.a(619708623);
    }

    public d8s() {
        JSONObject jSONObject = new JSONObject();
        this.f17652a = jSONObject;
        try {
            jSONObject.put("type", "H5");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static d8s a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d8s) ipChange.ipc$dispatch("f966c0c", new Object[0]);
        }
        if (e == null) {
            synchronized (d8s.class) {
                try {
                    if (e == null) {
                        e = new d8s();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f71663c", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3fbfc5", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a2184e", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
            return;
        }
        try {
            this.f17652a.put("pageName", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631eff40", new Object[]{this, jSONObject});
            return;
        }
        JSONArray optJSONArray = this.f17652a.optJSONArray(v4s.PARAM_UPLOAD_STAGE);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
            try {
                this.f17652a.put(v4s.PARAM_UPLOAD_STAGE, optJSONArray);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        optJSONArray.put(jSONObject);
    }

    public void b() {
        Throwable th;
        IOException e2;
        BufferedWriter bufferedWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b9e7ce", new Object[]{this});
        } else if (new File("/data/local/tmp/.apm_online").exists()) {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), yaa.n.getPackageName());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("stageName", "visible");
                jSONObject.put("beginTime", this.c);
                jSONObject.put("endTime", this.d);
                jSONObject.put("thread", Thread.currentThread().getName());
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            g(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("stageName", "finishLoad");
                jSONObject2.put("beginTime", this.b);
                jSONObject2.put("endTime", this.c);
                jSONObject2.put("thread", Thread.currentThread().getName());
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            g(jSONObject2);
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    try {
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(file.getAbsolutePath(), "APM_ONLINE");
                        if (!file2.exists()) {
                            file2.createNewFile();
                        }
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true)));
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e5) {
                    e2 = e5;
                }
            } catch (Throwable unused) {
            }
            try {
                try {
                    bufferedWriter.write("\n");
                    bufferedWriter.write(this.f17652a.toString());
                    bufferedWriter.write("\n");
                    v7t.i("TMQ", "write tmq data = [" + this.f17652a.toString() + "]");
                    bufferedWriter.close();
                } catch (IOException e6) {
                    e2 = e6;
                    bufferedWriter2 = bufferedWriter;
                    e2.printStackTrace();
                    v7t.d("TMQ", "write tmq data error, msg = [" + e2.getMessage() + "]");
                    if (bufferedWriter2 != null) {
                        bufferedWriter2.close();
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    this.f17652a = jSONObject3;
                    jSONObject3.put("type", "H5");
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter2 = bufferedWriter;
                    if (bufferedWriter2 != null) {
                        try {
                            bufferedWriter2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th;
                }
                jSONObject3.put("type", "H5");
                return;
            } catch (JSONException e7) {
                e7.printStackTrace();
                return;
            }
            JSONObject jSONObject32 = new JSONObject();
            this.f17652a = jSONObject32;
        }
    }
}
