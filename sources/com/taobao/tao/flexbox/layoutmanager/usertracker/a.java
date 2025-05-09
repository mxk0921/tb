package com.taobao.tao.flexbox.layoutmanager.usertracker;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import com.taobao.tao.flexbox.layoutmanager.usertracker.IPerformCollect;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.akt;
import tb.f21;
import tb.nwv;
import tb.t2o;
import tb.tfs;
import tb.wua;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CELL_RENDER_FINISH = "cellRenderFinish";
    public static final String FIRST_FRAME_RENDER_FINISH = "firstFrameRenderFinish";
    public static final String GG_PICK_NATIVE_TASKS = "gg_pick_native_tasks";
    public static final List<String> GLOBAL_TASK_NAMES = Arrays.asList("gg_videoTab_page_fever", "gg_TNodeDefaultPageName_page_create", "gg_TNodeDefaultPageName_page_appear");
    public static final Map<String, j> h = new HashMap();
    public static final Map<String, Integer> i = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public j f12355a;
    public String b;
    public final Set<String> c;
    public Handler d;
    public final Handler e;
    public IPerformCollect f;
    public String g;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.usertracker.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class RunnableC0702a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12356a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public RunnableC0702a(String str, String str2, long j) {
            this.f12356a = str;
            this.b = str2;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject i = a.i(a.this, this.f12356a, this.b);
            if (i != null) {
                i.put("start", (Object) Long.valueOf(this.c));
                tfs.e("SubTaskTracker", this.f12356a + ":" + this.b + " subTaskBegin");
                return;
            }
            tfs.e("SubTaskTracker", this.f12356a + ":" + this.b + " subTaskBegin error");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12357a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ JSONObject d;

        public b(String str, String str2, long j, JSONObject jSONObject) {
            this.f12357a = str;
            this.b = str2;
            this.c = j;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject i = a.i(a.this, this.f12357a, this.b);
            if (i == null || i.getLongValue("start") <= 0) {
                tfs.e("SubTaskTracker", this.f12357a + ":" + this.b + " subTaskSuccess error");
                return;
            }
            i.put("end", (Object) Long.valueOf(this.c));
            JSONObject jSONObject = this.d;
            if (jSONObject != null) {
                i.putAll(jSONObject);
            }
            tfs.e("SubTaskTracker", this.f12357a + ":" + this.b + " subTaskSuccess");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12358a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;
        public final /* synthetic */ JSONObject e;

        public c(String str, String str2, long j, String str3, JSONObject jSONObject) {
            this.f12358a = str;
            this.b = str2;
            this.c = j;
            this.d = str3;
            this.e = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject i = a.i(a.this, this.f12358a, this.b);
            if (i != null) {
                i.put("end", (Object) Long.valueOf(this.c));
                i.put("errorType", (Object) this.d);
                i.put("errorInfo", (Object) this.e);
                tfs.e("SubTaskTracker", this.f12358a + ":" + this.b + " subTaskFail");
                return;
            }
            tfs.e("SubTaskTracker", this.f12358a + ":" + this.b + " subTaskFail error");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12359a;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.usertracker.a$d$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class HandlerC0703a extends Handler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public HandlerC0703a(Looper looper) {
                super(looper);
            }

            public static /* synthetic */ Object ipc$super(HandlerC0703a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/usertracker/SubTaskTracker$5$1");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                d dVar = d.this;
                a.l(a.this, dVar.f12359a);
            }
        }

        public d(String str, String str2) {
            this.f12359a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (a.j(a.this) == null) {
                a.k(a.this, new HandlerC0703a(Looper.getMainLooper()));
            }
            a.a(a.this).add(this.b);
            if (a.a(a.this).size() < 2) {
                if (!a.j(a.this).hasMessages(1)) {
                    a.j(a.this).sendEmptyMessageDelayed(1, akt.N2());
                }
            } else if (a.j(a.this).hasMessages(1)) {
                a.j(a.this).removeMessages(1);
                a.l(a.this, this.f12359a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            a aVar = a.this;
            try {
                if (a.b(aVar) == null) {
                    a.c(aVar, (IPerformCollect) cls.newInstance());
                    a.b(aVar).onStart();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                tfs.e("SubTaskTracker", "FlexaClass load CollectorManager error:Throwable: " + th.toString());
                l.g(true, "type", "CollectorManager", "error", th.toString());
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            tfs.e("SubTaskTracker", "FlexaClass load CollectorManager error:onClassNotFound");
            l.g(true, "type", "CollectorManager", "error", "ClassNotFound");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12362a;
        public final /* synthetic */ Map b;

        public f(String str, Map map) {
            this.f12362a = str;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            j jVar = (j) a.d().get(this.f12362a);
            if (jVar != null) {
                j.h(jVar, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12363a;

        public g(String str) {
            this.f12363a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.this.n(this.f12363a, a.GG_PICK_NATIVE_TASKS);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12364a;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.usertracker.a$h$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0704a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ j f12365a;
            public final /* synthetic */ JSONObject b;

            public RunnableC0704a(j jVar, JSONObject jSONObject) {
                this.f12365a = jVar;
                this.b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pageName", (Object) "ShortVideoMonitor");
                jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
                jSONObject.put("arg1", (Object) h.this.f12364a);
                jSONObject.put("arg2", (Object) "page_enter");
                jSONObject.put("arg3", (Object) h.this.b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("subtasks", (Object) j.e(this.f12365a));
                jSONObject2.put(wua.KEY_PROPERTIES, (Object) j.g(this.f12365a));
                jSONObject2.put(MspGlobalDefine.SESSION, (Object) Long.valueOf(j.c(this.f12365a)));
                jSONObject2.put("index", (Object) Integer.valueOf(j.i(this.f12365a)));
                jSONObject2.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
                JSONObject jSONObject3 = this.b;
                if (jSONObject3 != null) {
                    jSONObject2.put("performance", (Object) jSONObject3);
                }
                jSONObject.put("args", (Object) jSONObject2);
                TrackerModule.commit(new d.j(null, jSONObject, null), false);
                tfs.e("SubTaskTracker", h.this.f12364a + " commitSubTaskInfos" + j.e(this.f12365a).toJSONString());
            }
        }

        public h(String str, String str2) {
            this.f12364a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            j jVar = (j) a.d().get(this.f12364a);
            if (jVar == null && a.e(a.this) != null) {
                jVar = a.e(a.this);
            }
            if (jVar != null && !j.e(jVar).isEmpty()) {
                if (a.b(a.this) != null) {
                    a.b(a.this).onEnd();
                }
                if (a.b(a.this) != null) {
                    jSONObject = a.b(a.this).getData();
                } else {
                    jSONObject = null;
                }
                a.f(a.this).postDelayed(new RunnableC0704a(jVar, jSONObject), 1000L);
                a.d().remove(this.f12364a);
                a.g(a.this, null);
                a.c(a.this, null);
                a.h(a.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final a f12366a = new a(null);

        static {
            t2o.a(503317400);
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b98959ab", new Object[0]);
            }
            return f12366a;
        }
    }

    static {
        t2o.a(503317388);
    }

    public /* synthetic */ a(RunnableC0702a aVar) {
        this();
    }

    public static /* synthetic */ Set a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8b2a274c", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ IPerformCollect b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPerformCollect) ipChange.ipc$dispatch("e3f60b24", new Object[]{aVar});
        }
        return aVar.f;
    }

    public static /* synthetic */ IPerformCollect c(a aVar, IPerformCollect iPerformCollect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPerformCollect) ipChange.ipc$dispatch("a64da45e", new Object[]{aVar, iPerformCollect});
        }
        aVar.f = iPerformCollect;
        return iPerformCollect;
    }

    public static /* synthetic */ Map d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b20cc25f", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ j e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("a2e28aa7", new Object[]{aVar});
        }
        return aVar.f12355a;
    }

    public static /* synthetic */ Handler f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4fa72a0f", new Object[]{aVar});
        }
        return aVar.e;
    }

    public static /* synthetic */ String g(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab904e22", new Object[]{aVar, str});
        }
        aVar.b = str;
        return str;
    }

    public static /* synthetic */ String h(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebbb34e3", new Object[]{aVar, str});
        }
        aVar.g = str;
        return str;
    }

    public static /* synthetic */ JSONObject i(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a52ca139", new Object[]{aVar, str, str2});
        }
        return aVar.q(str, str2);
    }

    public static /* synthetic */ Handler j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("9f1fb3e2", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ Handler k(a aVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("2707e5b4", new Object[]{aVar, handler});
        }
        aVar.d = handler;
        return handler;
    }

    public static /* synthetic */ void l(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a86ec4d", new Object[]{aVar, str});
        } else {
            aVar.x(str);
        }
    }

    public static a p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6655a005", new Object[0]);
        }
        return i.a();
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c2bac8", new Object[]{this, str});
        } else {
            nwv.z0(new g(str), true);
        }
    }

    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729c292", new Object[]{this, str, str2});
        } else {
            nwv.z0(new h(str, str2), true);
        }
    }

    public final j o(String str) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("6cf458bd", new Object[]{this, str});
        }
        this.b = str;
        HashMap hashMap = (HashMap) h;
        j jVar = (j) hashMap.get(str);
        if (jVar == null) {
            jVar = new j(null);
            j.d(jVar, j.c(this.f12355a));
            j.f(jVar, j.e(this.f12355a));
            j.h(jVar, j.g(this.f12355a));
            HashMap hashMap2 = (HashMap) i;
            Integer num = (Integer) hashMap2.get(str);
            if (num != null) {
                i2 = num.intValue();
            }
            j.j(jVar, i2);
            hashMap2.put(str, Integer.valueOf(i2 + 1));
            hashMap.put(str, jVar);
        } else {
            j jVar2 = this.f12355a;
            if (!(jVar2 == null || j.e(jVar2) == null || j.e(this.f12355a).size() <= 0)) {
                j.e(jVar).addAll(j.e(this.f12355a));
            }
        }
        this.f12355a = null;
        return jVar;
    }

    public final JSONObject q(String str, String str2) {
        j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e2c42dea", new Object[]{this, str, str2});
        }
        try {
            if (this.f == null && f21.TASK_FRAGMENT_CREATE.equals(str2) && !TextUtils.equals(this.g, str2)) {
                this.g = str2;
                s();
            }
            if (TextUtils.isEmpty(str)) {
                str = this.b;
            }
            if (TextUtils.isEmpty(str)) {
                if (this.f12355a == null) {
                    j jVar2 = new j(null);
                    this.f12355a = jVar2;
                    j.d(jVar2, System.currentTimeMillis());
                }
                return j.b(this.f12355a, str2);
            } else if (!TextUtils.isEmpty(str) && this.f12355a != null) {
                return j.b(o(str), str2);
            } else {
                Map<String, j> map = h;
                if (((HashMap) map).get(str) == null || (jVar = (j) ((HashMap) map).get(str)) == null) {
                    return null;
                }
                return j.b(jVar, str2);
            }
        } catch (Throwable th) {
            tfs.e("SubTaskTracker", "getSubTask error:Throwable: " + th.toString());
            return null;
        }
    }

    public JSONArray r(String str) {
        j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("6712dc37", new Object[]{this, str});
        }
        if (!nwv.X()) {
            tfs.e("SubTaskTracker", "getSubTaskInfos not at main thread");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.b;
        }
        if (TextUtils.isEmpty(str) && (jVar = this.f12355a) != null) {
            return j.e(jVar);
        }
        j jVar2 = (j) ((HashMap) h).get(str);
        if (jVar2 != null) {
            return j.e(jVar2);
        }
        j jVar3 = this.f12355a;
        if (jVar3 != null) {
            return j.e(jVar3);
        }
        return null;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5edab9", new Object[]{this});
        } else if (akt.z1()) {
            zk9.b("com.taobao.performance.CollectorManager", new e());
        }
    }

    public void t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8095df", new Object[]{this, str, str2});
        } else {
            nwv.z0(new RunnableC0702a(str, str2, System.currentTimeMillis()), true);
        }
    }

    public void u(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b03de9e8", new Object[]{this, str, str2, str3, jSONObject});
        } else {
            nwv.z0(new c(str, str2, System.currentTimeMillis(), str3, jSONObject), true);
        }
    }

    public void v(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140e0d97", new Object[]{this, str, str2, jSONObject});
        } else {
            nwv.z0(new b(str, str2, System.currentTimeMillis(), jSONObject), true);
        }
    }

    public void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecde9b4", new Object[]{this, str, str2});
        } else {
            nwv.z0(new d(str, str2), true);
        }
    }

    public void y(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa85560", new Object[]{this, str, map});
        } else {
            nwv.z0(new f(str, map), true);
        }
    }

    public a() {
        this.c = new HashSet();
        this.e = new Handler(Looper.getMainLooper());
    }

    public final void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b8d487", new Object[]{this, str});
            return;
        }
        j jVar = (j) ((HashMap) h).get(str);
        if (jVar != null) {
            j.a(jVar, true);
            IPerformCollect iPerformCollect = this.f;
            if (iPerformCollect != null) {
                iPerformCollect.doCollect(IPerformCollect.Scene.RENDER_END);
            }
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.d = null;
        }
        tfs.e("SubTaskTracker", str + " subTaskTrackFinish");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JSONArray f12367a;
        public Map<String, String> b;
        public long c;
        public int d;
        public boolean e;

        static {
            t2o.a(503317401);
        }

        public j() {
            this.f12367a = new JSONArray();
            this.b = new HashMap();
        }

        public static /* synthetic */ boolean a(j jVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2d15be6", new Object[]{jVar, new Boolean(z)})).booleanValue();
            }
            jVar.e = z;
            return z;
        }

        public static /* synthetic */ JSONObject b(j jVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("1182d5db", new Object[]{jVar, str});
            }
            return jVar.k(str);
        }

        public static /* synthetic */ long c(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6fe46db7", new Object[]{jVar})).longValue();
            }
            return jVar.c;
        }

        public static /* synthetic */ long d(j jVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1ca87e13", new Object[]{jVar, new Long(j)})).longValue();
            }
            jVar.c = j;
            return j;
        }

        public static /* synthetic */ JSONArray e(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("3223d67a", new Object[]{jVar});
            }
            return jVar.f12367a;
        }

        public static /* synthetic */ JSONArray f(j jVar, JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("d0b6cc90", new Object[]{jVar, jSONArray});
            }
            jVar.f12367a = jSONArray;
            return jSONArray;
        }

        public static /* synthetic */ Map g(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("626a1e3a", new Object[]{jVar});
            }
            return jVar.b;
        }

        public static /* synthetic */ Map h(j jVar, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("15c6fe13", new Object[]{jVar, map});
            }
            jVar.b = map;
            return map;
        }

        public static /* synthetic */ int i(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97a9b639", new Object[]{jVar})).intValue();
            }
            return jVar.d;
        }

        public static /* synthetic */ int j(j jVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ed8c422e", new Object[]{jVar, new Integer(i)})).intValue();
            }
            jVar.d = i;
            return i;
        }

        public final JSONObject k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("9feb302", new Object[]{this, str});
            }
            if (!(!this.e || a.GLOBAL_TASK_NAMES.contains(str) || akt.H2("GLOBAL_TASK_NAMES", "").contains(str))) {
                return null;
            }
            for (int i = 0; i < this.f12367a.size(); i++) {
                JSONObject jSONObject = this.f12367a.getJSONObject(i);
                if (jSONObject != null && TextUtils.equals(str, jSONObject.getString("name"))) {
                    return jSONObject;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", (Object) str);
            this.f12367a.add(jSONObject2);
            return jSONObject2;
        }

        public /* synthetic */ j(RunnableC0702a aVar) {
            this();
        }
    }
}
