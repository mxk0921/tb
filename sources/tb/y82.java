package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y82 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static y82 f31902a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w82 f31903a;

        public a(w82 w82Var) {
            this.f31903a = w82Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f31903a.a();
            } catch (Exception e) {
                q82.f(this.f31903a.f30511a.taskName, null, null, e);
            }
        }
    }

    static {
        t2o.a(404750636);
    }

    public static y82 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y82) ipChange.ipc$dispatch("10a325c3", new Object[0]);
        }
        if (f31902a == null) {
            synchronized (y82.class) {
                try {
                    if (f31902a == null) {
                        f31902a = new y82();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f31902a;
    }

    public final void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (!TextUtils.isEmpty(str)) {
            d(tlj.a(str, map));
        }
    }

    public final void c(f6i f6iVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a104c9ad", new Object[]{this, f6iVar, map});
        } else {
            a(gg4.l().j(f6iVar), map);
        }
    }

    public void d(w82 w82Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451c01bb", new Object[]{this, w82Var});
        } else if (w82Var != null) {
            cet.d().f(new a(w82Var));
        }
    }

    public void f(String str, String str2, String str3, Map<String, Object> map) {
        ly1 ly1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de9cf03", new Object[]{this, str, str2, str3, map});
            return;
        }
        f6i f6iVar = new f6i();
        f6iVar.f19049a = str;
        f6iVar.c = str3;
        f6iVar.b = str2;
        if (!(map == null || (ly1Var = (ly1) map.get("baseNode")) == null)) {
            f6iVar.g = ly1Var.u;
        }
        c(f6iVar, map);
    }

    public final void a(JSONArray jSONArray, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10163f5", new Object[]{this, jSONArray, map});
        } else if (jSONArray != null && jSONArray.size() != 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("taskType");
                map.put("taskConfig", jSONObject);
                b(string, map);
            }
        }
    }
}
