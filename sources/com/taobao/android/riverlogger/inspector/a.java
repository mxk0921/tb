package com.taobao.android.riverlogger.inspector;

import android.os.AsyncTask;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.RVLRemoteConnectCallback;
import com.taobao.android.riverlogger.inspector.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dcf;
import tb.lan;
import tb.lcn;
import tb.qcn;
import tb.t2o;
import tb.ti3;
import tb.wi3;
import tb.x24;
import tb.zbf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEV_VERIFY = "Dev.verify";
    public static final String[] h = {"result", "error"};
    public String f;
    public final AtomicInteger b = new AtomicInteger(1);
    public final ConcurrentHashMap<String, ArrayList<dcf>> c = new ConcurrentHashMap<>();
    public final Set<String> d = new CopyOnWriteArraySet();
    public boolean e = false;
    public ConcurrentHashMap<Integer, x24> g = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final String f9306a = lcn.c("RVL_Channel");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x24 f9310a;
        public final /* synthetic */ JSONObject b;

        public c(x24 x24Var, JSONObject jSONObject) {
            this.f9310a = x24Var;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f9310a.a(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dcf f9311a;
        public final /* synthetic */ AtomicInteger b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ x24 e;

        public d(dcf dcfVar, AtomicInteger atomicInteger, String str, ArrayList arrayList, x24 x24Var) {
            this.f9311a = dcfVar;
            this.b = atomicInteger;
            this.c = str;
            this.d = arrayList;
            this.e = x24Var;
        }

        @Override // com.taobao.android.riverlogger.inspector.b.a
        public void a(int i, com.taobao.android.riverlogger.inspector.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6208b6a4", new Object[]{this, new Integer(i), bVar});
            } else if (i == 0) {
                this.f9311a.c = bVar.b();
                if (this.b.decrementAndGet() == 0) {
                    a.f(a.this).put(this.c, this.d);
                    ti3.f(this.c);
                    this.e.a(null);
                }
            } else {
                int intValue = this.b.intValue();
                if (intValue >= 0) {
                    while (!this.b.compareAndSet(intValue, -1)) {
                        intValue = this.b.intValue();
                        if (intValue < 0) {
                            return;
                        }
                    }
                    x24 x24Var = this.e;
                    String str = this.f9311a.b;
                    String str2 = bVar.g;
                    x24Var.a(wi3.a(1003, "download \"" + str + "\" failed: " + str2));
                }
            }
        }
    }

    public static /* synthetic */ boolean a(byte[] bArr, String str, String str2, Date date) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfbe9877", new Object[]{bArr, str, str2, date})).booleanValue();
        }
        return D(bArr, str, str2, date);
    }

    public static /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7de5ce7e", new Object[]{aVar});
        }
        return aVar.f9306a;
    }

    public static /* synthetic */ String c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9856c79d", new Object[]{aVar});
        }
        return aVar.f;
    }

    public static /* synthetic */ void d(a aVar, JSONObject jSONObject, x24 x24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e74137", new Object[]{aVar, jSONObject, x24Var});
        } else {
            aVar.j(jSONObject, x24Var);
        }
    }

    public static /* synthetic */ void e(a aVar, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8806930f", new Object[]{aVar, new Boolean(z), jSONObject});
        } else {
            aVar.y(z, jSONObject);
        }
    }

    public static /* synthetic */ ConcurrentHashMap f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("6efb0ec0", new Object[]{aVar});
        }
        return aVar.c;
    }

    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f2139b9", new Object[]{this});
        }
        return this.f9306a;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaf8ff53", new Object[]{this})).booleanValue();
        }
        if (this.f == null) {
            return true;
        }
        return false;
    }

    public void C(String str, RVLRemoteConnectCallback rVLRemoteConnectCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69333a70", new Object[]{this, str, rVLRemoteConnectCallback});
            return;
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append((char) (random.nextInt(95) + 32));
        }
        String sb2 = sb.toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientToken", sb2);
        } catch (JSONException unused) {
        }
        x(DEV_VERIFY, null, jSONObject, MessagePriority.Normal, new C0482a(sb2, str, new Date(), rVLRemoteConnectCallback));
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc2e587", new Object[]{this});
            return;
        }
        this.e = true;
        u();
        p();
    }

    public void h(int i, String str, JSONObject jSONObject, MessagePriority messagePriority) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7821ac40", new Object[]{this, new Integer(i), str, jSONObject, messagePriority});
            return;
        }
        try {
            if (jSONObject == null) {
                jSONObject2 = new JSONObject();
                jSONObject2.put("result", new JSONObject());
            } else {
                jSONObject2 = new JSONObject(jSONObject, h);
            }
            jSONObject2.put("id", i);
            if (str != null) {
                jSONObject2.put("sessionId", str);
            }
            v(jSONObject2.toString(), messagePriority);
        } catch (JSONException unused) {
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9419ce89", new Object[]{this, str});
            return;
        }
        lcn.a(RVLLevel.Info, qcn.RVLModuleName).k("close", this.f9306a).a("reason", str).f();
        ti3.g(this);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0b6fb8", new Object[]{this});
        } else {
            ti3.d();
        }
    }

    public Set<String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("99b3a281", new Object[]{this});
        }
        return this.d;
    }

    public ArrayList<dcf> m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e2c3fad5", new Object[]{this, str});
        }
        return this.c.get(str);
    }

    public void n(String str, int i, String str2, JSONObject jSONObject, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d942f68f", new Object[]{this, str, new Integer(i), str2, jSONObject, aVar});
        } else {
            zbf.c(str, i, str2, jSONObject);
        }
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f64f143", new Object[]{this})).intValue();
        }
        return this.b.getAndIncrement();
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39565850", new Object[]{this});
            return;
        }
        if (((CopyOnWriteArraySet) this.d).size() > 0) {
            ti3.d();
        }
        for (String str : this.c.keySet()) {
            ti3.f(str);
        }
    }

    public void q(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4f93a1", new Object[]{this, new Integer(i), str});
            return;
        }
        ConcurrentHashMap<Integer, x24> concurrentHashMap = this.g;
        this.g = new ConcurrentHashMap<>();
        JSONObject a2 = wi3.a(i, str);
        for (x24 x24Var : concurrentHashMap.values()) {
            x24Var.a(a2);
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2bd735", new Object[]{this, str});
            return;
        }
        try {
            s(new JSONObject(str));
        } catch (JSONException unused) {
        }
    }

    public void s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc120873", new Object[]{this, jSONObject});
            return;
        }
        int optInt = jSONObject.optInt("id", -1);
        String optString = jSONObject.optString("method");
        if (optInt >= 0) {
            if (optString.length() > 0) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new b(jSONObject, optString, optInt));
                return;
            }
            x24 x24Var = this.g.get(Integer.valueOf(optInt));
            if (x24Var != null) {
                this.g.remove(Integer.valueOf(optInt));
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new c(x24Var, jSONObject));
            }
        } else if (optString.contentEquals("Dev.closeDebug")) {
            i("server close");
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea66ce7", new Object[]{this});
            return;
        }
        this.e = false;
        p();
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe4e0cc8", new Object[]{this});
        } else {
            zbf.g(this);
        }
    }

    public abstract void v(String str, MessagePriority messagePriority);

    public void w(String str, String str2, String str3, MessagePriority messagePriority, x24 x24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633db103", new Object[]{this, str, str2, str3, messagePriority, x24Var});
        } else if (str != null) {
            String str4 = this.f;
            if (str4 == null || (str2 != null && str4.contentEquals(str2))) {
                if (str3 == null) {
                    str3 = "{}";
                }
                StringBuilder sb = new StringBuilder(str3.length() + 64);
                sb.append("{\"method\":\"");
                sb.append(str);
                sb.append('\"');
                if (x24Var != null) {
                    int o = o();
                    sb.append(",\"id\":");
                    sb.append(o);
                    this.g.put(Integer.valueOf(o), x24Var);
                }
                if (str2 != null) {
                    sb.append(",\"sessionId\":\"");
                    sb.append(str2);
                    sb.append('\"');
                }
                sb.append(",\"params\":");
                sb.append(str3);
                sb.append('}');
                v(sb.toString(), messagePriority);
            }
        }
    }

    public void x(String str, String str2, JSONObject jSONObject, MessagePriority messagePriority, x24 x24Var) {
        String jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c06c3", new Object[]{this, str, str2, jSONObject, messagePriority, x24Var});
            return;
        }
        if (jSONObject == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject.toString();
        }
        w(str, str2, jSONObject2, messagePriority, x24Var);
    }

    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bc2249", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.riverlogger.inspector.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0482a implements x24 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9307a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Date c;
        public final /* synthetic */ RVLRemoteConnectCallback d;

        public C0482a(String str, String str2, Date date, RVLRemoteConnectCallback rVLRemoteConnectCallback) {
            this.f9307a = str;
            this.b = str2;
            this.c = date;
            this.d = rVLRemoteConnectCallback;
        }

        @Override // tb.x24
        public void a(JSONObject jSONObject) {
            int i;
            String str;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81eeca1f", new Object[]{this, jSONObject});
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("error");
            if (optJSONObject == null) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("result");
                str = "Server connect failed, try again";
                i = 1001;
                if (optJSONObject2 != null && a.a(Base64.decode(optJSONObject2.optString("token").getBytes(), 0), this.f9307a, this.b, this.c)) {
                    str = null;
                    i = 0;
                }
            } else {
                i = optJSONObject.optInt("code", 0);
                str = optJSONObject.optString("message");
            }
            lcn.a(RVLLevel.Info, qcn.RVLModuleName).k("verify", a.b(a.this)).g(i, str).f();
            RVLRemoteConnectCallback rVLRemoteConnectCallback = this.d;
            if (i != 0) {
                z = false;
            }
            rVLRemoteConnectCallback.finish(z, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f9308a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.riverlogger.inspector.a$b$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0483a implements x24 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f9309a;

            public C0483a(String str) {
                this.f9309a = str;
            }

            @Override // tb.x24
            public void a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("81eeca1f", new Object[]{this, jSONObject});
                    return;
                }
                b bVar = b.this;
                a.this.h(bVar.c, this.f9309a, jSONObject, MessagePriority.Normal);
            }
        }

        public b(JSONObject jSONObject, String str, int i) {
            this.f9308a = jSONObject;
            this.b = str;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String optString = this.f9308a.optString("sessionId", null);
            JSONObject optJSONObject = this.f9308a.optJSONObject("params");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            if (a.c(a.this) == null || (optString != null && a.c(a.this).contentEquals(optString))) {
                if (this.b.startsWith("Dev.")) {
                    if (this.b.contentEquals("Dev.configPlugins")) {
                        a.d(a.this, optJSONObject, new C0483a(optString));
                        return;
                    } else if (this.b.contentEquals("Dev.enable")) {
                        a.e(a.this, true, optJSONObject);
                        a.this.h(this.c, optString, null, MessagePriority.Normal);
                        return;
                    } else if (this.b.contentEquals("Dev.disable")) {
                        a.e(a.this, false, optJSONObject);
                        a.this.h(this.c, optString, null, MessagePriority.Normal);
                        return;
                    }
                }
                a c = ti3.c();
                if (c != null) {
                    c.n(this.b, this.c, optString, optJSONObject, a.this);
                }
            }
        }
    }

    public static boolean D(byte[] bArr, String str, String str2, Date date) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18fd87dd", new Object[]{bArr, str, str2, date})).booleanValue();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.UK);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String str3 = " " + str + "-" + str2;
        String format = simpleDateFormat.format(date);
        if (lan.b((format + str3).getBytes(), bArr)) {
            return true;
        }
        String format2 = simpleDateFormat.format(new Date());
        if (format.contentEquals(format2)) {
            return false;
        }
        return lan.b((format2 + str3).getBytes(), bArr);
    }

    public final void j(JSONObject jSONObject, x24 x24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9977f6", new Object[]{this, jSONObject, x24Var});
            return;
        }
        String optString = jSONObject.optString("scene");
        if (optString.isEmpty()) {
            x24Var.a(wi3.a(1001, "scene is not a valid string"));
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("plugins");
        if (optJSONArray == null) {
            x24Var.a(null);
            return;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                x24Var.a(wi3.a(1002, "invalid plugin"));
                return;
            }
            String optString2 = optJSONObject.optString("id");
            String optString3 = optJSONObject.optString("url");
            if (optString2.isEmpty() || optString3.isEmpty()) {
                x24Var.a(wi3.a(1002, "invalid plugin"));
                return;
            } else {
                arrayList.add(new dcf(optString2, optString3));
            }
        }
        if (arrayList.size() == 0) {
            if (this.c.remove(optString) != null) {
                ti3.f(optString);
            }
            x24Var.a(null);
            return;
        }
        AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dcf dcfVar = (dcf) it.next();
            com.taobao.android.riverlogger.inspector.b.c(dcfVar.b, new d(dcfVar, atomicInteger, optString, arrayList, x24Var));
        }
    }

    public final void y(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3bb0470", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("targets");
        if (!(optJSONArray == null || optJSONArray.length() == 0)) {
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(optJSONArray.optString(i));
            }
            int size = ((CopyOnWriteArraySet) this.d).size();
            if (z) {
                ((CopyOnWriteArraySet) this.d).addAll(arrayList);
            } else {
                ((CopyOnWriteArraySet) this.d).removeAll(arrayList);
            }
            if (size != ((CopyOnWriteArraySet) this.d).size()) {
                k();
            }
        }
    }

    static {
        t2o.a(649068563);
    }
}
