package com.taobao.tao.flexbox.layoutmanager.ac;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.tao.flexbox.layoutmanager.ac.b;
import com.taobao.tao.flexbox.layoutmanager.ac.c;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.Priority;
import com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.util.ErrorConstant;
import org.android.agoo.common.AgooConstants;
import tb.akt;
import tb.cxm;
import tb.dk8;
import tb.hk8;
import tb.igs;
import tb.iyi;
import tb.l0u;
import tb.nvf;
import tb.nwv;
import tb.od0;
import tb.t2o;
import tb.tfs;
import tb.xwd;
import tb.ytn;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERR_FAIL = "AC_ERR_FAILED";
    public static final String ERR_NO_METHOD = "AC_ERR_NO_METHOD";
    public static final String ERR_NO_MODULE = "AC_ERR_NO_MODULE";
    public static final String ERR_PARAM = "AC_ERR_PARAM";
    public static final String PRIORITY_HIGH = "high";
    public static final String PRIORITY_LOW = "low";
    public static final List<String> i;

    /* renamed from: a  reason: collision with root package name */
    public xwd f11969a;
    public nvf b;
    public final o g;
    public final cxm c = new cxm();
    public final HashMap<Integer, i> d = new HashMap<>();
    public int e = 1;
    public final NotifyManager h = new NotifyManager();
    public final com.taobao.tao.flexbox.layoutmanager.ac.b f = new com.taobao.tao.flexbox.layoutmanager.ac.b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f11970a;

        public a(j jVar) {
            this.f11970a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((dk8) this.f11970a.d).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11971a;
        public final /* synthetic */ CountDownLatch b;

        public b(Context context, CountDownLatch countDownLatch) {
            this.f11971a = context;
            this.b = countDownLatch;
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            try {
                d.a(d.this, (xwd) cls.getConstructor(Context.class).newInstance(this.f11971a));
            } catch (Throwable th) {
                th.printStackTrace();
                tfs.e(l.TAG, "FlexaClass load Debugger error:Throwable: " + th.toString());
            }
            this.b.countDown();
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            tfs.e(l.TAG, "FlexaClass load Debugger error:onClassNotFound");
            this.b.countDown();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends cxm.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;

        public c(String str) {
            this.d = str;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/ac/TNodeActionService$3");
        }

        @Override // tb.cxm.c, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.this.l(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.ac.d$d  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0676d implements k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11972a;

        public C0676d(int i) {
            this.f11972a = i;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.ac.d.k
        public void a(j jVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("869ae5c4", new Object[]{this, jVar, obj});
            } else if (this.f11972a > 0) {
                JSONObject jSONObject = new JSONObject();
                if (obj != null) {
                    jSONObject.put("data", obj);
                }
                jSONObject.put("methodId", (Object) Integer.valueOf(this.f11972a));
                d.this.i(jSONObject);
                d.b(d.this).h0().appendModuleExecuteCallback(jVar, obj, true);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.ac.d.k
        public void b(j jVar, h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95924ef2", new Object[]{this, jVar, hVar});
            } else if (this.f11972a > 0) {
                JSONObject jSONObject = new JSONObject();
                if (hVar != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", hVar.f11974a);
                    hashMap.put("message", hVar.b);
                    hashMap.put(Constants.KEY_USER_ID, hVar.c);
                    jSONObject.put("error", (Object) hashMap);
                }
                jSONObject.put("methodId", (Object) Integer.valueOf(this.f11972a));
                d.this.i(jSONObject);
                d.b(d.this).h0().appendModuleExecuteCallback(jVar, null, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e extends cxm.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ c.a d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ j h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, c.a aVar, boolean z, String str2, String str3, j jVar) {
            super(str);
            this.d = aVar;
            this.e = z;
            this.f = str2;
            this.g = str3;
            this.h = jVar;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 1548812690) {
                super.run();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/ac/TNodeActionService$5");
        }

        @Override // tb.cxm.c, java.lang.Runnable
        public void run() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            d dVar = d.this;
            if (this.d != null) {
                z = true;
            } else {
                z = false;
            }
            d.c(dVar, z, this.e, this.f, this.g, this.h);
            super.run();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends cxm.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/ac/TNodeActionService$6");
        }

        @Override // tb.cxm.c, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            d.d(d.this).g();
            nvf nvfVar = d.this.b;
            if (nvfVar != null) {
                nvfVar.destroy();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11973a;
        public final /* synthetic */ String b;
        public final /* synthetic */ j c;

        public g(String str, String str2, j jVar) {
            this.f11973a = str;
            this.b = str2;
            this.c = jVar;
        }

        public void a(String str) {
            k kVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            j jVar = this.c;
            if (jVar != null && (kVar = jVar.c) != null) {
                kVar.b(jVar, new h("AC_ERR_NO_MODULE", str, null));
            }
        }

        public void b(c.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4b4102b", new Object[]{this, aVar});
                return;
            }
            d.this.E(this.f11973a, aVar);
            d.this.m(this.f11973a, this.b, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public String f11974a;
        public String b;
        public Object c;

        static {
            t2o.a(503316557);
        }

        public h(String str, String str2, Object obj) {
            this.f11974a = str;
            this.b = str2 == null ? ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG : str2;
            this.c = obj;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public final j f11975a;

        static {
            t2o.a(503316558);
        }

        public i(j jVar) {
            this.f11975a = jVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final o f11976a;
        public final JSON b;
        public k c;
        public hk8 d;
        public boolean e = false;
        public long f;
        public String g;
        public Handler h;

        static {
            t2o.a(503316560);
        }

        public j(o oVar, JSON json, k kVar) {
            this.f11976a = oVar;
            this.b = json;
            this.c = kVar;
        }

        public String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f33ee4c5", new Object[]{this, str, str2});
            }
            JSON json = this.b;
            if (json instanceof Map) {
                return nwv.I(((Map) json).get(str), str2);
            }
            return str2;
        }

        public Map b(String str, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("eb85906d", new Object[]{this, str, map});
            }
            JSON json = this.b;
            if (json instanceof Map) {
                return nwv.z(((Map) json).get(str), map);
            }
            return map;
        }

        public Context c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
            }
            o oVar = this.f11976a;
            if (oVar != null) {
                return oVar.M();
            }
            return null;
        }

        public void d(int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6230665a", new Object[]{this, new Integer(i)});
                return;
            }
            if (i <= 0) {
                z = false;
            }
            this.e = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface k {
        void a(j jVar, Object obj);

        void b(j jVar, h hVar);
    }

    public d(o oVar) {
        this.g = oVar;
    }

    public static /* synthetic */ xwd a(d dVar, xwd xwdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xwd) ipChange.ipc$dispatch("16dc8333", new Object[]{dVar, xwdVar});
        }
        dVar.f11969a = xwdVar;
        return xwdVar;
    }

    public static /* synthetic */ o b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("d7f160ba", new Object[]{dVar});
        }
        return dVar.g;
    }

    public static /* synthetic */ void c(d dVar, boolean z, boolean z2, String str, String str2, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6e164", new Object[]{dVar, new Boolean(z), new Boolean(z2), str, str2, jVar});
        } else {
            dVar.v(z, z2, str, str2, jVar);
        }
    }

    public static /* synthetic */ NotifyManager d(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotifyManager) ipChange.ipc$dispatch("e5275fd1", new Object[]{dVar});
        }
        return dVar.h;
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e113f0ec", new Object[]{str});
        }
        return "(function () { let module={};" + str + "return module.exports;})()";
    }

    public static String g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bacd92e4", new Object[]{str, str2});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(str);
        jSONArray.add(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "$.register");
        jSONObject.put("args", (Object) jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add(jSONObject);
        return JSON.toJSONString(jSONArray2, SerializerFeature.DisableCircularReferenceDetect);
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eb9635", new Object[]{this})).booleanValue();
        }
        if (this.f11969a != null) {
            return true;
        }
        return false;
    }

    public final boolean B(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db1d26db", new Object[]{this, str, str2})).booleanValue();
        }
        List<String> list = i;
        return ((ArrayList) list).contains(str + "." + str2);
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31c94045", new Object[]{this, str});
        } else {
            this.c.c(new c(str));
        }
    }

    public void D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5adefbe0", new Object[]{this, str, str2});
            return;
        }
        this.f.e(str, str2);
        E(str, this.f.b(str));
    }

    public void F(String str, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19911fd0", new Object[]{this, str, jVar});
        } else {
            this.h.d(str, jVar);
        }
    }

    public void G(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737f2dfd", new Object[]{this, intent});
        } else {
            this.h.c(intent);
        }
    }

    public void H(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9b3dbe", new Object[]{this, str, str2});
            return;
        }
        String[] split = str2.split(":");
        String str3 = split[0];
        String str4 = split[1];
        z(r());
        try {
            this.f11969a.start(this, str, str3, Integer.parseInt(str4));
        } catch (Exception e2) {
            l0u.c(o.J(), e2.getMessage());
            xwd xwdVar = this.f11969a;
            if (xwdVar != null) {
                xwdVar.stop();
            }
            this.f11969a = null;
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2ee94a", new Object[]{this});
            return;
        }
        xwd xwdVar = this.f11969a;
        if (xwdVar != null) {
            xwdVar.stop();
        }
    }

    public void J(String str, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a632597", new Object[]{this, str, jVar});
        } else {
            this.h.h(str, jVar);
        }
    }

    public final nvf e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nvf) ipChange.ipc$dispatch("8cf3a061", new Object[]{this});
        }
        return od0.D().o().a();
    }

    public void h(int i2, boolean z, Object obj, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be7d3db", new Object[]{this, new Integer(i2), new Boolean(z), obj, new Boolean(z2)});
            return;
        }
        i iVar = this.d.get(Integer.valueOf(i2));
        if (iVar != null) {
            if (z) {
                j jVar = iVar.f11975a;
                k kVar = jVar.c;
                if (kVar != null) {
                    kVar.a(jVar, obj);
                }
            } else {
                h hVar = new h("AC_ERR_FAILED", "module execute failed", obj);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!TextUtils.isEmpty(jSONObject.getString("errorCode"))) {
                        hVar.f11974a = jSONObject.getString("errorCode");
                    }
                    if (!TextUtils.isEmpty(jSONObject.getString("errorMsg"))) {
                        hVar.b = jSONObject.getString("errorMsg");
                    }
                    if (jSONObject.containsKey("result")) {
                        hVar.c = jSONObject.get("result");
                    }
                }
                j jVar2 = iVar.f11975a;
                k kVar2 = jVar2.c;
                if (kVar2 != null) {
                    kVar2.b(jVar2, hVar);
                }
            }
            if (!z2) {
                this.d.remove(Integer.valueOf(i2));
            }
        }
    }

    public void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762a200", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", (Object) "$.cb");
        jSONObject2.put("args", (Object) jSONObject);
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject2);
        String jSONString = JSON.toJSONString(jSONArray, SerializerFeature.DisableCircularReferenceDetect);
        xwd xwdVar = this.f11969a;
        if (xwdVar != null) {
            xwdVar.sendData(jSONString);
        } else {
            this.b.b("$.cb", jSONString, null);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.c.d(new f(), 300);
        }
    }

    public final void k(JSONObject jSONObject) {
        JSON json;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb9830f", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            Object obj = jSONObject.get("args");
            if (jSONObject.containsKey("cid")) {
                i2 = jSONObject.getInteger("cid").intValue();
            }
            if (obj instanceof JSON) {
                json = (JSON) obj;
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.add(obj);
                json = jSONArray;
            }
            C0676d dVar = new C0676d(i2);
            String string = jSONObject.getString("name");
            j jVar = new j(this.g, json, dVar);
            jVar.f = System.currentTimeMillis();
            jVar.g = string;
            jVar.d(i2);
            u(string, null, jVar);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6070ed5", new Object[]{this, str});
            return;
        }
        try {
            JSONArray parseArray = JSON.parseArray(str);
            for (int i2 = 0; i2 < parseArray.size(); i2++) {
                k(parseArray.getJSONObject(i2));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void m(String str, String str2, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95df4fb6", new Object[]{this, str, str2, jVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str3 = str + "." + str2;
        igs.a("executeCode:" + igs.d(str3));
        jSONObject.put("name", (Object) str3);
        jSONObject.put("cid", (Object) Integer.valueOf(this.e));
        jSONObject.put("args", (Object) jVar.b);
        jSONObject.put(AgooConstants.MESSAGE_FLAG, (Object) "jsonpatchex|newEvent");
        if (jVar.c != null) {
            this.d.put(Integer.valueOf(this.e), new i(jVar));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject);
        this.e++;
        String jSONString = JSON.toJSONString(jSONArray, SerializerFeature.DisableCircularReferenceDetect);
        xwd xwdVar = this.f11969a;
        if (xwdVar != null) {
            xwdVar.sendData(jSONString);
            if (jVar.d instanceof dk8) {
                nwv.z0(new a(jVar), true);
            }
        } else {
            this.b.b(str3, jSONString, jVar.d);
        }
        igs.c();
    }

    public final void n(String str, String str2, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec1cc0e", new Object[]{this, str, str2, jVar});
        } else {
            this.f.a(str, new g(str, str2, jVar));
        }
    }

    public void o(String str, String str2, j jVar) {
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1f1100", new Object[]{this, str, str2, jVar});
            return;
        }
        Class<Object> cls = this.f.c(str).b;
        if (cls != null) {
            p(cls, str2, jVar);
        } else if (!TextUtils.isEmpty(null)) {
            q(null, str2, d.class.getClassLoader(), jVar);
        } else if (jVar != null && (kVar = jVar.c) != null) {
            kVar.b(jVar, new h("AC_ERR_NO_MODULE", "AC_ERR_NO_MODULE", null));
        }
    }

    public final void q(String str, String str2, ClassLoader classLoader, j jVar) {
        k kVar;
        k kVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6f8709", new Object[]{this, str, str2, classLoader, jVar});
            return;
        }
        try {
            if (!iyi.c(str, str2, jVar)) {
                p(Class.forName(str, true, classLoader), str2, jVar);
            }
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            if (jVar != null && (kVar = jVar.c) != null) {
                kVar.b(jVar, new h("AC_ERR_NO_MODULE", "className: " + str + " not found", null));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            if (jVar != null && (kVar2 = jVar.c) != null) {
                kVar2.b(jVar, new h("AC_ERR_FAILED", "fail to execute className:" + str + "  methodName:" + str2 + "  exception:" + e3.getMessage(), null));
            }
        }
    }

    public Context r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.g.M();
    }

    public o s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("49f66b1f", new Object[]{this});
        }
        return this.g;
    }

    public void u(String str, n nVar, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54765f0", new Object[]{this, str, nVar, jVar});
            return;
        }
        int indexOf = str.indexOf(".");
        w(str.substring(0, indexOf), str.substring(indexOf + 1), jVar);
    }

    public final void v(boolean z, boolean z2, String str, String str2, j jVar) {
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fb4bfd", new Object[]{this, new Boolean(z), new Boolean(z2), str, str2, jVar});
            return;
        }
        String d = igs.d(str + str2);
        if (igs.f()) {
            d = d + jVar.a("pluginName", "") + jVar.a(FluidException.METHOD_NAME, "");
        }
        if (z) {
            o oVar = this.g;
            if (oVar == null || ((!oVar.q0() && !this.g.r0()) || !akt.k2())) {
                igs.a(" native module " + d);
                o(str, str2, jVar);
                if (!jVar.e) {
                    this.g.h0().appendModuleExecuteInfo(jVar);
                }
                igs.c();
            }
        } else if (z2) {
            igs.a("js module " + d);
            x();
            n(str, str2, jVar);
            igs.c();
        } else if (jVar != null && (kVar = jVar.c) != null) {
            kVar.b(jVar, new h("AC_ERR_NO_MODULE", str + " not exist", null));
        }
    }

    public final void w(String str, String str2, j jVar) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17cf6dae", new Object[]{this, str, str2, jVar});
            return;
        }
        c.a c2 = this.f.c(str);
        boolean d = this.f.d(str);
        if ((c2 != null && c2.d) || d || B(str, str2)) {
            if (c2 != null) {
                z = true;
            } else {
                z = false;
            }
            v(z, d, str, str2, jVar);
        } else if (nwv.X()) {
            if (c2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            v(z2, d, str, str2, jVar);
        } else {
            e eVar = new e(str + str2, c2, d, str, str2, jVar);
            eVar.d(t(jVar, c2, str2));
            this.c.c(eVar);
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            y();
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75210e7c", new Object[]{this});
        } else if (this.f11969a == null && this.b == null) {
            nvf e2 = e();
            this.b = e2;
            e2.a(r(), this);
        }
    }

    public final void z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85602da", new Object[]{this, context});
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        zk9.c("com.taobao.tao.flexbox.layoutmanager.tool.Debugger", new b(context, countDownLatch), AsyncTask.THREAD_POOL_EXECUTOR);
        try {
            countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    public void E(String str, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8983c5ad", new Object[]{this, str, aVar});
            return;
        }
        igs.a("registerJSMode");
        if (!aVar.c) {
            xwd xwdVar = this.f11969a;
            if (xwdVar != null) {
                xwdVar.sendData(g(str, aVar.f11968a));
            } else {
                nvf nvfVar = this.b;
                if (nvfVar != null) {
                    nvfVar.c(str, aVar.f11968a);
                }
            }
            aVar.c = true;
        }
        igs.c();
    }

    public final void p(Class<Object> cls, String str, j jVar) {
        k kVar;
        k kVar2;
        k kVar3;
        k kVar4;
        try {
            if (!iyi.c(cls.getName(), str, jVar)) {
                cls.getDeclaredMethod(str, j.class).invoke(null, jVar);
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            if (jVar != null && (kVar3 = jVar.c) != null) {
                kVar3.b(jVar, new h("AC_ERR_PARAM", "illegalAccess", null));
            }
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            if (jVar != null && (kVar = jVar.c) != null) {
                kVar.b(jVar, new h("AC_ERR_NO_METHOD", "method: " + str + " not exist", null));
            }
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            if (jVar != null && (kVar2 = jVar.c) != null) {
                kVar2.b(jVar, new h("AC_ERR_PARAM", "params invalid", null));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if (jVar != null && (kVar4 = jVar.c) != null) {
                kVar4.b(jVar, new h("AC_ERR_FAILED", "fail to execute className:" + cls.getName() + "  methodName:" + str + "  exception:" + th.getMessage(), null));
            }
        }
    }

    static {
        t2o.a(503316549);
        t2o.a(503316541);
        ArrayList arrayList = new ArrayList();
        i = arrayList;
        if (akt.W1()) {
            arrayList.add("$app.commit");
        }
        if (akt.M2("orange")) {
            arrayList.add("$orange.getConfigs");
            arrayList.add("$orange.getConfig");
        }
        if (akt.M2("ab")) {
            arrayList.add("$ab.get");
        }
        arrayList.add("$app.keypathForTarget");
        arrayList.add("$tab.getIconInfo");
    }

    public final int t(j jVar, c.a aVar, String str) {
        Class cls;
        Method c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6919081", new Object[]{this, jVar, aVar, str})).intValue();
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            String string = ((JSONObject) json).getString("priority");
            Priority priority = (aVar == null || (cls = aVar.b) == null || (c2 = ytn.c(str, cls, j.class)) == null) ? null : (Priority) c2.getAnnotation(Priority.class);
            if ("low".equals(string)) {
                return 2;
            }
            if (priority != null && "low".equals(priority.name())) {
                return 2;
            }
            if ("high".equals(string) || (priority != null && "high".equals(priority.name()))) {
                return 1;
            }
        }
        return 0;
    }
}
