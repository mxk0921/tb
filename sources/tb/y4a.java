package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31845a;
    public final String b;
    public final String c;
    public JSONObject d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            y4a y4aVar = y4a.this;
            y4a.a(y4aVar, y4a.b(y4aVar));
        }
    }

    static {
        t2o.a(475004950);
    }

    public y4a(String str, String str2, String str3, boolean z) {
        this.f31845a = str;
        this.b = str2;
        this.c = str3;
        if (z) {
            this.d = h();
        } else if (t5a.a()) {
            Coordinator.execute(new a());
        } else {
            this.d = h();
        }
    }

    public static /* synthetic */ JSONObject a(y4a y4aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf277f4", new Object[]{y4aVar, jSONObject});
        }
        y4aVar.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ JSONObject b(y4a y4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c13fa09d", new Object[]{y4aVar});
        }
        return y4aVar.h();
    }

    public final List<u4a> c(b5a b5aVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b0d1bd8c", new Object[]{this, b5aVar, jSONArray});
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                arrayList.add(new u4a(b5aVar, (JSONObject) next));
            }
        }
        return arrayList;
    }

    public List<u4a> d(b5a b5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6d6aed2c", new Object[]{this, b5aVar});
        }
        ArrayList arrayList = new ArrayList();
        List<u4a> f = f(b5aVar);
        if (f != null) {
            arrayList.addAll(f);
        }
        return arrayList;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("245927d1", new Object[]{this});
        }
        return this.d;
    }

    public List<u4a> f(b5a b5aVar) {
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("12b52842", new Object[]{this, b5aVar});
        }
        if (b5aVar == null) {
            return null;
        }
        if (b5aVar.f() != null) {
            return c(b5aVar, b5aVar.f());
        }
        if (b5aVar.e() == null) {
            str = null;
        } else {
            str = b5aVar.e().c();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(b5aVar.b()) || (jSONObject = this.d.getJSONObject(str)) == null || jSONObject.isEmpty()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(b5aVar);
        for (b5a d = b5aVar.d(); d != null; d = d.d()) {
            linkedList.add(0, d);
        }
        Iterator it = linkedList.iterator();
        JSONArray jSONArray = null;
        while (it.hasNext()) {
            String b = ((b5a) it.next()).b();
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            if (jSONArray != null && !jSONArray.isEmpty()) {
                Iterator<Object> it2 = jSONArray.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        jSONObject = null;
                        break;
                    }
                    Object next = it2.next();
                    if ((next instanceof JSONObject) && (jSONObject2 = ((JSONObject) next).getJSONObject("callback")) != null && jSONObject2.containsKey(b)) {
                        jSONObject = jSONObject2;
                        break;
                    }
                }
            }
            if (jSONObject == null) {
                return null;
            }
            jSONArray = jSONObject.getJSONArray(b);
        }
        return c(b5aVar, jSONArray);
    }

    public final JSONObject g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("755e93db", new Object[]{this, str});
        }
        Context context = q4a.b;
        if (context == null) {
            return null;
        }
        try {
            byte[] a2 = ae9.a(str, context);
            if (a2 != null && a2.length > 0) {
                return JSON.parseObject(new String(a2, "UTF-8"));
            }
        } catch (Throwable th) {
            s3a.c(th, "loadAsset error, assetPath=", str);
        }
        return null;
    }

    public final JSONObject h() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f2e77f6f", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.f31845a)) {
            jSONObject = i(this.f31845a);
        } else {
            jSONObject = null;
        }
        if (jSONObject == null && !TextUtils.isEmpty(this.b)) {
            jSONObject = g(this.b);
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return jSONObject;
        }
        try {
            AppMonitor.Counter.commit("Gateway2", "loadConfigFailed", 1.0d);
        } catch (Throwable th) {
            s3a.b("App Monitor Exception.", th);
        }
        return j();
    }

    public final JSONObject i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c06bb7b3", new Object[]{this, str});
        }
        Context context = q4a.b;
        if (context == null) {
            return null;
        }
        File file = new File(ud9.a(context).b(), str);
        if (file.exists()) {
            try {
                byte[] c = ae9.c(file);
                if (c != null && c.length > 0) {
                    return JSON.parseObject(new String(c, "UTF-8"));
                }
            } catch (Throwable th) {
                s3a.c(th, "loadFile error, filePath=", str);
            }
        }
        return null;
    }

    public final JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9826148c", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.c)) {
            return null;
        }
        try {
            return JSON.parseObject(this.c);
        } catch (Throwable th) {
            s3a.c(th, "loadPreset error");
            return null;
        }
    }

    public y4a(String str, JSONObject jSONObject) {
        this.f31845a = str;
        this.d = jSONObject;
    }
}
