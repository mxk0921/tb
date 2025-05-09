package com.taobao.tao.flexbox.layoutmanager.actionservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.flexbox.layoutmanager.actionservice.a;
import com.taobao.tao.flexbox.layoutmanager.actionservice.b;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import mtopsdk.mtop.util.ErrorConstant;
import tb.g1v;
import tb.iqf;
import tb.iqx;
import tb.t2o;
import tb.wvj;
import tb.zca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ActionService implements b.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROADCAST_ACTION = "TAOBAO.OCEAN.ActionServiceBC";
    public static final String ERR_FAIL = "AC_ERR_FAILED";
    public static final String ERR_NO_METHOD = "AC_ERR_NO_METHOD";
    public static final String ERR_NO_MODULE = "AC_ERR_NO_MODULE";
    public static final String ERR_PARAM = "AC_ERR_PARAM";
    public static final String ERR_TIMEOUT = "AC_ERR_TIMEOUT";
    public static final HashMap<Context, ActionService> o = new HashMap<>();
    public iqf b;
    public final com.taobao.tao.flexbox.layoutmanager.actionservice.b i;
    public final Context j;
    public HashMap<String, String> m;

    /* renamed from: a  reason: collision with root package name */
    public volatile int f11977a = 0;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final ArrayList<k> d = new ArrayList<>();
    public final HashMap<Integer, j> e = new HashMap<>();
    public int f = 1;
    public boolean g = false;
    public String h = "https://h5.m.taobao.com/app/actionservice/2.0/webview.js";
    public boolean k = false;
    public final HashMap<String, j> l = new HashMap<>();
    public final BroadcastReceiver n = new BroadcastReceiver() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/actionservice/ActionService$4");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            JSONObject parseObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                String action = intent.getAction();
                if (ActionService.BROADCAST_ACTION.equalsIgnoreCase(action)) {
                    String stringExtra = intent.getStringExtra("result");
                    if (!TextUtils.isEmpty(stringExtra) && (parseObject = JSON.parseObject(stringExtra)) != null) {
                        String string = parseObject.getString("seqId");
                        if (!TextUtils.isEmpty(string)) {
                            String string2 = parseObject.getString("data");
                            j jVar2 = ActionService.this.l.get(string);
                            if (jVar2 != null) {
                                ActionService.this.l.remove(string);
                                if (!TextUtils.isEmpty(string2)) {
                                    jVar2.b.a(jVar2.f11987a, JSON.parse(string2));
                                } else {
                                    jVar2.b.a(jVar2.f11987a, null);
                                }
                            }
                        }
                    }
                } else if (ActionService.e(ActionService.this) != null && ActionService.e(ActionService.this).containsKey(action)) {
                    String str = (String) ActionService.e(ActionService.this).get(action);
                    if (!(TextUtils.isEmpty(str) || (jVar = ActionService.this.l.get(str)) == null)) {
                        ActionService.this.l.remove(str);
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            Set<String> keySet = extras.keySet();
                            JSONObject jSONObject = new JSONObject();
                            for (String str2 : keySet) {
                                jSONObject.put(str2, (Object) extras.getString(str2));
                            }
                            jVar.b.a(jVar.f11987a, jSONObject);
                            return;
                        }
                        jVar.b.a(jVar.f11987a, null);
                    }
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11979a;
        public final /* synthetic */ String b;
        public final /* synthetic */ h c;
        public final /* synthetic */ JSON d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ g f;
        public final /* synthetic */ l g;

        public a(String str, String str2, h hVar, JSON json, boolean z, g gVar, l lVar) {
            this.f11979a = str;
            this.b = str2;
            this.c = hVar;
            this.d = json;
            this.e = z;
            this.f = gVar;
            this.g = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ActionService.a(ActionService.this, this.f11979a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11980a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSON c;
        public final /* synthetic */ h d;
        public final /* synthetic */ g e;
        public final /* synthetic */ l f;
        public final /* synthetic */ boolean g;

        public b(String str, String str2, JSON json, h hVar, g gVar, l lVar, boolean z) {
            this.f11980a = str;
            this.b = str2;
            this.c = json;
            this.d = hVar;
            this.e = gVar;
            this.f = lVar;
            this.g = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            k kVar = new k();
            kVar.f11988a = this.f11980a;
            kVar.b = this.b;
            kVar.c = this.c;
            kVar.d = this.d;
            kVar.e = this.e;
            kVar.f = this.f;
            kVar.g = this.g;
            ActionService.b(ActionService.this).add(kVar);
            ActionService.c(ActionService.this).j(ActionService.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f11981a;

        public c(l lVar) {
            this.f11981a = lVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.a.b
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
                return;
            }
            ActionService.this.f11977a = -1;
            Iterator it = ActionService.b(ActionService.this).iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                if (kVar.e != null) {
                    ActionService actionService = ActionService.this;
                    l lVar = this.f11981a;
                    ActionService.d(actionService, lVar.f11989a, lVar.b, System.nanoTime() - this.f11981a.c, false, Boolean.FALSE);
                    kVar.e.b(kVar.d, new i("AC_ERR_FAILED", "fail to init webview", null));
                }
            }
            ActionService.b(ActionService.this).clear();
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.a.b
        public void onFinish(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99807463", new Object[]{this, str});
            } else if (ActionService.this.b.b()) {
                ActionService.this.f11977a = -1;
                Iterator it = ActionService.b(ActionService.this).iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar.e != null) {
                        ActionService actionService = ActionService.this;
                        l lVar = this.f11981a;
                        ActionService.d(actionService, lVar.f11989a, lVar.b, System.nanoTime() - this.f11981a.c, false, Boolean.FALSE);
                        kVar.e.b(kVar.d, new i("AC_ERR_FAILED", "fail to init webview", null));
                    }
                }
                ActionService.b(ActionService.this).clear();
            } else {
                ActionService.this.f11977a = 2;
                ActionService.this.b.c("http://localhost/", str, "text/html", "UTF-8", null);
                ActionService.this.z(ActionService.BROADCAST_ACTION, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!ActionService.b(ActionService.this).isEmpty()) {
                Iterator it = ActionService.b(ActionService.this).iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar != null) {
                        ActionService.f(ActionService.this, kVar.f11988a, kVar.b, kVar.d, kVar.c, kVar.g, kVar.e, kVar.f);
                    }
                }
                ActionService.b(ActionService.this).clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements b.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11983a;
        public final /* synthetic */ String b;
        public final /* synthetic */ h c;
        public final /* synthetic */ JSON d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ g f;
        public final /* synthetic */ l g;

        public e(String str, String str2, h hVar, JSON json, boolean z, g gVar, l lVar) {
            this.f11983a = str;
            this.b = str2;
            this.c = hVar;
            this.d = json;
            this.e = z;
            this.f = gVar;
            this.g = lVar;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
            } else if (this.f != null) {
                ActionService actionService = ActionService.this;
                l lVar = this.g;
                ActionService.d(actionService, lVar.f11989a, lVar.b, System.nanoTime() - this.g.c, false, Boolean.FALSE);
                this.f.b(this.c, new i("AC_ERR_NO_MODULE", str, null));
            }
        }

        public void b(b.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fab8780", new Object[]{this, dVar});
                return;
            }
            ActionService.this.A(this.f11983a, dVar);
            ActionService.this.i(this.f11983a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends AsyncTask<Void, Void, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11984a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ long d;
        public final /* synthetic */ Boolean e;

        public f(ActionService actionService, String str, String str2, boolean z, long j, Boolean bool) {
            this.f11984a = str;
            this.b = str2;
            this.c = z;
            this.d = j;
            this.e = bool;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/actionservice/ActionService$7");
        }

        /* renamed from: a */
        public Object doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c7a0ec9b", new Object[]{this, voidArr});
            }
            Properties properties = new Properties();
            properties.put(g1v.FIELD_PAGE, "Page_ActionService");
            properties.put(g1v.FIELD_EVENT_ID, "19999");
            properties.put("actionName", this.f11984a + "." + this.b);
            properties.put("success", Boolean.valueOf(this.c));
            properties.put("time", Long.valueOf(this.d / 1000000));
            properties.put("os", TimeCalculator.PLATFORM_ANDROID);
            Boolean bool = this.e;
            if (bool != null) {
                properties.put("native", bool);
            }
            try {
                TBS.Ext.commitEvent("Page_ActionService", properties);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface g {
        void a(h hVar, Object obj);

        void b(h hVar, i iVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public String f11986a;
        public String b = ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG;
        public Object c;

        static {
            t2o.a(347078668);
        }

        public i(String str, String str2, Object obj) {
            this.f11986a = str;
            this.c = obj;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public final h f11987a;
        public final g b;
        public final l c;

        static {
            t2o.a(347078669);
        }

        public j(h hVar, g gVar, l lVar) {
            this.f11987a = hVar;
            this.b = gVar;
            this.c = lVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public String f11988a;
        public String b;
        public JSON c;
        public h d;
        public g e;
        public l f;
        public boolean g;

        static {
            t2o.a(347078671);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public String f11989a;
        public String b;
        public long c;

        static {
            t2o.a(347078672);
        }
    }

    static {
        t2o.a(347078658);
        t2o.a(347078686);
    }

    public ActionService(Context context) {
        if (context != null) {
            zca.b(context);
        }
        context = context == null ? zca.a() : context;
        com.taobao.tao.flexbox.layoutmanager.actionservice.b bVar = new com.taobao.tao.flexbox.layoutmanager.actionservice.b();
        this.i = bVar;
        this.j = context;
        if (n() == 1) {
            bVar.q();
        }
        w();
    }

    public static /* synthetic */ void a(ActionService actionService, String str, String str2, h hVar, JSON json, boolean z, g gVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4e7094", new Object[]{actionService, str, str2, hVar, json, new Boolean(z), gVar, lVar});
        } else {
            actionService.t(str, str2, hVar, json, z, gVar, lVar);
        }
    }

    public static /* synthetic */ ArrayList b(ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("fc36eafb", new Object[]{actionService});
        }
        return actionService.d;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.actionservice.b c(ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.actionservice.b) ipChange.ipc$dispatch("f240855b", new Object[]{actionService});
        }
        return actionService.i;
    }

    public static /* synthetic */ void d(ActionService actionService, String str, String str2, long j2, boolean z, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36bf9e6", new Object[]{actionService, str, str2, new Long(j2), new Boolean(z), bool});
        } else {
            actionService.C(str, str2, j2, z, bool);
        }
    }

    public static /* synthetic */ HashMap e(ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("66502b07", new Object[]{actionService});
        }
        return actionService.m;
    }

    public static /* synthetic */ void f(ActionService actionService, String str, String str2, h hVar, JSON json, boolean z, g gVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7309baf", new Object[]{actionService, str, str2, hVar, json, new Boolean(z), gVar, lVar});
        } else {
            actionService.j(str, str2, hVar, json, z, gVar, lVar);
        }
    }

    public static ActionService l(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionService) ipChange.ipc$dispatch("5ead738e", new Object[]{iWVWebView});
        }
        return o.get(iWVWebView.getContext());
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98d4c6c2", new Object[0])).intValue();
        }
        if (zca.a() == null) {
            return 0;
        }
        return PreferenceManager.getDefaultSharedPreferences(zca.a()).getInt(EnvironmentSwitcher.SPKEY_ENV, 0);
    }

    public static synchronized ActionService o() {
        synchronized (ActionService.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActionService) ipChange.ipc$dispatch("87265aad", new Object[0]);
            }
            Context a2 = zca.a();
            HashMap<Context, ActionService> hashMap = o;
            ActionService actionService = hashMap.get(a2);
            if (actionService == null) {
                actionService = new ActionService(a2);
                hashMap.put(a2, actionService);
            }
            return actionService;
        }
    }

    public void A(String str, b.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3fc282", new Object[]{this, str, dVar});
        } else if (!dVar.e) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(str);
            jSONArray.add(dVar.b);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("actionName", (Object) "$.register");
            jSONObject.put("args", (Object) jSONArray);
            WVStandardEventCenter.postNotificationToJS(this.b.a(), "ActionServiceEvent", jSONObject.toJSONString());
            dVar.e = true;
        }
    }

    public void B(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737f2dfd", new Object[]{this, intent});
        } else {
            LocalBroadcastManager.getInstance(zca.a()).sendBroadcast(intent);
        }
    }

    public final void C(String str, String str2, long j2, boolean z, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a5dbd", new Object[]{this, str, str2, new Long(j2), new Boolean(z), bool});
        } else {
            new f(this, str, str2, z, j2, bool).execute(new Void[0]);
        }
    }

    public void g(int i2, boolean z, h hVar, JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd4afb6", new Object[]{this, new Integer(i2), new Boolean(z), hVar, jSONObject, obj});
        } else {
            h(i2, z, hVar, jSONObject, obj, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r9, boolean r10, com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService.h r11, com.alibaba.fastjson.JSONObject r12, java.lang.Object r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService.h(int, boolean, com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService$h, com.alibaba.fastjson.JSONObject, java.lang.Object, boolean):void");
    }

    public void i(String str, String str2, h hVar, JSON json, boolean z, g gVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b3394b", new Object[]{this, str, str2, hVar, json, new Boolean(z), gVar, lVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("actionName", (Object) (str + "." + str2));
        jSONObject.put("methodId", (Object) Integer.valueOf(this.f));
        jSONObject.put("args", (Object) json);
        jSONObject.put("jsonpatch", (Object) Boolean.valueOf(z));
        if (gVar != null) {
            this.e.put(Integer.valueOf(this.f), new j(hVar, gVar, lVar));
        }
        this.f++;
        WVStandardEventCenter.postNotificationToJS(this.b.a(), "ActionServiceEvent", JSON.toJSONString(jSONObject, SerializerFeature.DisableCircularReferenceDetect));
    }

    public final void j(String str, String str2, h hVar, JSON json, boolean z, g gVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c389a3", new Object[]{this, str, str2, hVar, json, new Boolean(z), gVar, lVar});
        } else {
            this.i.f(str, new e(str, str2, hVar, json, z, gVar, lVar));
        }
    }

    public void k(String str, String str2, h hVar, JSON json, g gVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae68e03f", new Object[]{this, str, str2, hVar, json, gVar, lVar});
            return;
        }
        b.d h2 = this.i.h(str);
        if (!TextUtils.isEmpty(h2.c)) {
            v(h2.c, str2, getClass().getClassLoader(), hVar, json, gVar, lVar);
            return;
        }
        Class cls = h2.d;
        if (cls != null) {
            v(cls.getName(), str2, h2.d.getClassLoader(), hVar, json, gVar, lVar);
        } else if (gVar != null) {
            C(lVar.f11989a, lVar.b, System.nanoTime() - lVar.c, false, Boolean.TRUE);
            gVar.b(hVar, new i("AC_ERR_NO_MODULE", "AC_ERR_NO_MODULE", null));
        }
    }

    public Context m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.j;
    }

    public com.taobao.tao.flexbox.layoutmanager.actionservice.b p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.actionservice.b) ipChange.ipc$dispatch("9434d50b", new Object[]{this});
        }
        return this.i;
    }

    public void q(String str, h hVar, JSON json, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b8a754", new Object[]{this, str, hVar, json, gVar});
        } else {
            r(str, hVar, json, false, gVar);
        }
    }

    public void r(String str, h hVar, JSON json, boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f52b2", new Object[]{this, str, hVar, json, new Boolean(z), gVar});
            return;
        }
        int indexOf = str.indexOf(".");
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        l lVar = new l();
        lVar.c = System.nanoTime();
        lVar.f11989a = substring;
        lVar.b = substring2;
        if (this.j != zca.a() || this.i.l()) {
            s(substring, substring2, hVar, json, z, gVar, lVar);
        } else {
            this.c.post(new b(substring, substring2, json, hVar, gVar, lVar, z));
        }
    }

    public final void s(String str, String str2, h hVar, JSON json, boolean z, g gVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e2cd707", new Object[]{this, str, str2, hVar, json, new Boolean(z), gVar, lVar});
        } else {
            this.c.post(new a(str, str2, hVar, json, z, gVar, lVar));
        }
    }

    public final void t(String str, String str2, h hVar, JSON json, boolean z, g gVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd69c12", new Object[]{this, str, str2, hVar, json, new Boolean(z), gVar, lVar});
        } else if (this.i.m(str)) {
            k(str, str2, hVar, json, gVar, lVar);
        } else if (this.i.k(str)) {
            u(hVar, gVar, lVar);
            if (this.g) {
                j(str, str2, hVar, json, z, gVar, lVar);
                return;
            }
            k kVar = new k();
            kVar.f11988a = str;
            kVar.b = str2;
            kVar.d = hVar;
            kVar.c = json;
            kVar.e = gVar;
            kVar.f = lVar;
            kVar.g = z;
            this.d.add(kVar);
        } else if (gVar != null) {
            C(lVar.f11989a, lVar.b, System.nanoTime() - lVar.c, false, null);
            gVar.b(hVar, new i("AC_ERR_NO_MODULE", str + " not exist", null));
        }
    }

    public void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7c1e3a", new Object[]{this, new Boolean(z)});
        } else if (z) {
            Iterator<k> it = this.d.iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next != null) {
                    s(next.f11988a, next.b, next.d, next.c, next.g, next.e, next.f);
                }
            }
            this.d.clear();
        } else {
            Iterator<k> it2 = this.d.iterator();
            while (it2.hasNext()) {
                k next2 = it2.next();
                if (next2.e != null) {
                    C(next2.f11988a, next2.b, System.nanoTime() - next2.f.c, false, null);
                    next2.e.b(next2.d, new i("AC_ERR_FAILED", "fail to download module mapping", null));
                }
            }
            this.d.clear();
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3584c827", new Object[]{this});
            return;
        }
        this.g = true;
        this.c.post(new d());
    }

    public void z(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d538a0", new Object[]{this, str, str2});
            return;
        }
        IntentFilter intentFilter = new IntentFilter(str);
        if (this.m == null) {
            this.m = new HashMap<>();
        }
        if (!TextUtils.isEmpty(str2)) {
            this.m.put(str, str2);
        }
        if (!this.k) {
            LocalBroadcastManager.getInstance(zca.a()).registerReceiver(this.n, intentFilter);
            zca.a().registerReceiver(this.n, intentFilter);
            this.k = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f11985a;
        public Object b;

        static {
            t2o.a(347078667);
        }

        public h(Context context, String str) {
            this.f11985a = context;
        }

        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e11aa67b", new Object[]{this, obj});
            } else {
                this.b = obj;
            }
        }

        public h(Context context, String str, Object obj) {
            this.f11985a = context;
            this.b = obj;
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccf62db", new Object[]{this});
        } else if (n() == 1) {
            this.h = this.h.replace("h5", "wapp");
        }
    }

    public void u(h hVar, g gVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d23050c", new Object[]{this, hVar, gVar, lVar});
        } else if ((this.f11977a == -1 || this.f11977a == 0) && wvj.b(zca.a())) {
            if (this.b == null) {
                Context context = this.j;
                if (context == null) {
                    context = zca.a();
                }
                this.b = new iqf(context);
            }
            String streamByUrl = iqx.getStreamByUrl(this.h);
            if (streamByUrl != null) {
                this.f11977a = 2;
                this.b.c("http://localhost/", streamByUrl, "text/html", "UTF-8", null);
                z(BROADCAST_ACTION, null);
                return;
            }
            this.f11977a = 1;
            com.taobao.tao.flexbox.layoutmanager.actionservice.a.c().b(this.h, new c(lVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0039, ClassNotFoundException -> 0x003c, NoSuchMethodException -> 0x0099, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NoSuchMethodException -> 0x0099, blocks: (B:3:0x001f, B:17:0x0072, B:22:0x00ac, B:24:0x00b0, B:25:0x00bf, B:27:0x00c3, B:28:0x00d2), top: B:41:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006f -> B:46:0x0070). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.String r21, java.lang.String r22, java.lang.ClassLoader r23, com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService.h r24, com.alibaba.fastjson.JSON r25, com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService.g r26, com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService.l r27) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService.v(java.lang.String, java.lang.String, java.lang.ClassLoader, com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService$h, com.alibaba.fastjson.JSON, com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService$g, com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService$l):void");
    }
}
