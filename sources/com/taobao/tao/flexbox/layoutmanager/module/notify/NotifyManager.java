package com.taobao.tao.flexbox.layoutmanager.module.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.navigation.Interface.TabHostStatusListener;
import com.tmall.android.dai.DAI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.akt;
import tb.cak;
import tb.od0;
import tb.rkd;
import tb.t2o;
import tb.te8;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NotifyManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<String, b> i = new HashMap<>();
    public static final HashMap<String, Class<? extends cak>> j = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public NormalNotifyImpl f12336a = new NormalNotifyImpl(this);
    public f b = new f(this);
    public a c = new a(this);
    public DAINotifyImpl d = new DAINotifyImpl(this);
    public i e = new i(this);
    public d f = new d(this);
    public e g = new e(this);
    public final Map<String, cak> h = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class DAINotifyImpl extends cak {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final HashMap<String, DAIBroadcastReceiver> b = new HashMap<>();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class DAIBroadcastReceiver extends BroadcastReceiver {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final List<d.j> f12337a = new ArrayList();

            static {
                t2o.a(503317328);
            }

            public DAIBroadcastReceiver(DAINotifyImpl dAINotifyImpl) {
            }

            public static /* synthetic */ Object ipc$super(DAIBroadcastReceiver dAIBroadcastReceiver, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/module/notify/NotifyManager$DAINotifyImpl$DAIBroadcastReceiver");
            }

            public void a(d.j jVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("644a4746", new Object[]{this, jVar});
                } else {
                    ((ArrayList) this.f12337a).add(jVar);
                }
            }

            public void b(d.j jVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("66d527c3", new Object[]{this, jVar});
                } else {
                    ((ArrayList) this.f12337a).remove(jVar);
                }
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null) {
                    Serializable serializableExtra = intent.getSerializableExtra("com.tmall.android.dai.intent.extra.OUTPUT_DATA");
                    Iterator it = ((ArrayList) this.f12337a).iterator();
                    while (it.hasNext()) {
                        d.j jVar = (d.j) it.next();
                        jVar.c.a(jVar, serializableExtra);
                    }
                }
            }
        }

        static {
            t2o.a(503317327);
        }

        public DAINotifyImpl(NotifyManager notifyManager) {
        }

        public static /* synthetic */ Object ipc$super(DAINotifyImpl dAINotifyImpl, String str, Object... objArr) {
            if (str.hashCode() == -1960096308) {
                super.f();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/module/notify/NotifyManager$DAINotifyImpl");
        }

        @Override // tb.cak
        public void d(String str, d.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c565d63f", new Object[]{this, str, jVar});
                return;
            }
            DAIBroadcastReceiver dAIBroadcastReceiver = this.b.get(str);
            if (dAIBroadcastReceiver == null) {
                dAIBroadcastReceiver = new DAIBroadcastReceiver(this);
                this.b.put(str, dAIBroadcastReceiver);
                IntentFilter intentFilter = new IntentFilter(DAI.ACTION_COMPUTE_COMPLETE);
                intentFilter.addDataSchemeSpecificPart("com.tmall.android.dai", 1);
                intentFilter.addDataScheme(str);
                o.J().registerReceiver(dAIBroadcastReceiver, intentFilter);
            }
            dAIBroadcastReceiver.a(jVar);
        }

        @Override // tb.cak
        public void e(String str, d.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e819306", new Object[]{this, str, jVar});
                return;
            }
            DAIBroadcastReceiver dAIBroadcastReceiver = this.b.get(str);
            if (dAIBroadcastReceiver != null) {
                dAIBroadcastReceiver.b(jVar);
            }
        }

        @Override // tb.cak
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b2b4dcc", new Object[]{this});
                return;
            }
            super.f();
            Collection<DAIBroadcastReceiver> values = this.b.values();
            if (values != null) {
                for (DAIBroadcastReceiver dAIBroadcastReceiver : values) {
                    try {
                        o.J().unregisterReceiver(dAIBroadcastReceiver);
                    } catch (Throwable unused) {
                    }
                }
            }
            this.b.clear();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class NormalNotifyImpl extends cak {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final HashMap<String, NormalBroadcastReceiver> b = new HashMap<>();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class NormalBroadcastReceiver extends BroadcastReceiver {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final List<d.j> f12338a = new ArrayList();

            static {
                t2o.a(503317330);
            }

            public NormalBroadcastReceiver(NormalNotifyImpl normalNotifyImpl) {
            }

            public static /* synthetic */ Object ipc$super(NormalBroadcastReceiver normalBroadcastReceiver, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/module/notify/NotifyManager$NormalNotifyImpl$NormalBroadcastReceiver");
            }

            public void a(d.j jVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("644a4746", new Object[]{this, jVar});
                } else {
                    ((ArrayList) this.f12338a).add(jVar);
                }
            }

            public void b(d.j jVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("66d527c3", new Object[]{this, jVar});
                    return;
                }
                Iterator it = ((ArrayList) this.f12338a).iterator();
                while (it.hasNext()) {
                    if (cak.c(jVar, (d.j) it.next())) {
                        it.remove();
                    }
                }
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                c cVar;
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null) {
                    Bundle extras = intent.getExtras();
                    JSONObject jSONObject = null;
                    if (extras != null) {
                        Set<String> keySet = extras.keySet();
                        JSONObject jSONObject2 = new JSONObject();
                        boolean f0 = akt.f0();
                        for (String str2 : keySet) {
                            Object obj = extras.get(str2);
                            if (f0) {
                                jSONObject2.put(str2, obj);
                            } else {
                                if (obj == null) {
                                    str = null;
                                } else {
                                    str = obj.toString();
                                }
                                jSONObject2.put(str2, (Object) str);
                            }
                        }
                        jSONObject = jSONObject2;
                    }
                    String action = intent.getAction();
                    for (b bVar : NotifyManager.a().values()) {
                        if (TextUtils.equals(bVar.f12340a, action) && (cVar = bVar.b) != null) {
                            jSONObject = cVar.a(jSONObject);
                        }
                    }
                    Iterator it = ((ArrayList) this.f12338a).iterator();
                    while (it.hasNext()) {
                        d.j jVar = (d.j) it.next();
                        jVar.c.a(jVar, jSONObject);
                    }
                }
            }
        }

        static {
            t2o.a(503317329);
        }

        public NormalNotifyImpl(NotifyManager notifyManager) {
        }

        public static /* synthetic */ Object ipc$super(NormalNotifyImpl normalNotifyImpl, String str, Object... objArr) {
            if (str.hashCode() == -1960096308) {
                super.f();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/module/notify/NotifyManager$NormalNotifyImpl");
        }

        @Override // tb.cak
        public void d(String str, d.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c565d63f", new Object[]{this, str, jVar});
                return;
            }
            NormalBroadcastReceiver normalBroadcastReceiver = this.b.get(str);
            if (normalBroadcastReceiver == null) {
                normalBroadcastReceiver = new NormalBroadcastReceiver(this);
                this.b.put(str, normalBroadcastReceiver);
                IntentFilter intentFilter = new IntentFilter(str);
                o.J().registerReceiver(normalBroadcastReceiver, intentFilter);
                LocalBroadcastManager.getInstance(o.J()).registerReceiver(normalBroadcastReceiver, intentFilter);
            }
            normalBroadcastReceiver.a(jVar);
        }

        @Override // tb.cak
        public void e(String str, d.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e819306", new Object[]{this, str, jVar});
                return;
            }
            NormalBroadcastReceiver normalBroadcastReceiver = this.b.get(str);
            if (normalBroadcastReceiver != null) {
                normalBroadcastReceiver.b(jVar);
            }
        }

        @Override // tb.cak
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b2b4dcc", new Object[]{this});
                return;
            }
            super.f();
            Collection<NormalBroadcastReceiver> values = this.b.values();
            if (values != null) {
                for (NormalBroadcastReceiver normalBroadcastReceiver : values) {
                    try {
                        o.J().unregisterReceiver(normalBroadcastReceiver);
                        LocalBroadcastManager.getInstance(o.J()).unregisterReceiver(normalBroadcastReceiver);
                    } catch (Throwable th) {
                        tfs.d("normal notify unregisterAll exception," + th.getMessage());
                    }
                }
            }
            this.b.clear();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends cak {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public te8.a b;
        public boolean c = true;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0700a implements te8.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0700a() {
            }

            @Override // tb.te8.a
            public void x() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b5cab48b", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("state", (Object) "background");
                for (String str : a.this.b()) {
                    a.this.a(str, jSONObject);
                }
            }

            @Override // tb.te8.a
            public void B() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3e78b620", new Object[]{this});
                } else if (a.g(a.this)) {
                    a.h(a.this, false);
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("state", (Object) "active");
                    for (String str : a.this.b()) {
                        a.this.a(str, jSONObject);
                    }
                }
            }
        }

        static {
            t2o.a(503317325);
        }

        public a(NotifyManager notifyManager) {
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6dad49fc", new Object[]{aVar})).booleanValue();
            }
            return aVar.c;
        }

        public static /* synthetic */ boolean h(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4649c69e", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.c = z;
            return z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1960096308) {
                super.f();
                return null;
            } else if (hashCode == -983181761) {
                super.d((String) objArr[0], (d.j) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/module/notify/NotifyManager$AppStatusNotifyImpl");
            }
        }

        @Override // tb.cak
        public void d(String str, d.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c565d63f", new Object[]{this, str, jVar});
                return;
            }
            super.d(str, jVar);
            if (this.b == null) {
                this.b = new C0700a();
                if (od0.D().j() != null) {
                    od0.D().j().g(this.b);
                }
            }
        }

        @Override // tb.cak
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b2b4dcc", new Object[]{this});
                return;
            }
            super.f();
            if (od0.D().j() != null) {
                od0.D().j().d(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f12340a;
        public c b;

        static {
            t2o.a(503317331);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        JSONObject a(JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d extends cak {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public rkd.a b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements rkd.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.rkd.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7cc306c", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                for (String str : d.this.b()) {
                    d.this.a(str, jSONObject);
                }
            }
        }

        static {
            t2o.a(503317333);
        }

        public d(NotifyManager notifyManager) {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1960096308) {
                super.f();
                return null;
            } else if (hashCode == -983181761) {
                super.d((String) objArr[0], (d.j) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/module/notify/NotifyManager$RevisionSwitchNotifyImpl");
            }
        }

        @Override // tb.cak
        public void d(String str, d.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c565d63f", new Object[]{this, str, jVar});
                return;
            }
            super.d(str, jVar);
            if (this.b == null) {
                this.b = new a();
                od0.D().x().a(this.b);
            }
        }

        @Override // tb.cak
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b2b4dcc", new Object[]{this});
                return;
            }
            super.f();
            if (akt.p2("fixRevisitionMemLeak", true)) {
                od0.D().x().a(null);
            }
            this.b = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e extends cak {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public TabHostStatusListener b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements TabHostStatusListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.taobao.tao.navigation.Interface.TabHostStatusListener
            public int listenEventType() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("ec7280e7", new Object[]{this})).intValue();
                }
                return 1;
            }

            @Override // com.taobao.tao.navigation.Interface.TabHostStatusListener
            public void onTabHostStatusChanged(TabHostStatusListener.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("45bff8f3", new Object[]{this, aVar});
                } else if (aVar != null && aVar.b == 1) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str : e.this.b()) {
                        e.this.a(str, jSONObject);
                    }
                }
            }
        }

        static {
            t2o.a(503317335);
        }

        public e(NotifyManager notifyManager) {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1960096308) {
                super.f();
                return null;
            } else if (hashCode == -983181761) {
                super.d((String) objArr[0], (d.j) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/module/notify/NotifyManager$TabHostSwitchNotifyImpl");
            }
        }

        @Override // tb.cak
        public void d(String str, d.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c565d63f", new Object[]{this, str, jVar});
                return;
            }
            super.d(str, jVar);
            if (akt.p2("weitao_switch.watchTabHostChange", true)) {
                if (this.b == null) {
                    this.b = new a();
                }
                com.taobao.tao.navigation.a.J("tab2", this.b);
            }
        }

        @Override // tb.cak
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b2b4dcc", new Object[]{this});
                return;
            }
            super.f();
            if (akt.p2("weitao_switch.watchTabHostChange", true)) {
                com.taobao.tao.navigation.a.c0("tab2");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends cak {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ILogin.LoginCallback b;
        public boolean c;
        public ILogin.a d;

        static {
            t2o.a(503317337);
        }

        public f(NotifyManager notifyManager) {
        }

        public static /* synthetic */ boolean g(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c265a270", new Object[]{fVar})).booleanValue();
            }
            return fVar.i();
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1960096308) {
                super.f();
                return null;
            } else if (hashCode == -983181761) {
                super.d((String) objArr[0], (d.j) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/module/notify/NotifyManager$UserLoginNotifyImpl");
            }
        }

        @Override // tb.cak
        public void d(String str, d.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c565d63f", new Object[]{this, str, jVar});
                return;
            }
            super.d(str, jVar);
            ILogin q = od0.D().q();
            if (this.b == null) {
                h();
                a aVar = new a(q);
                this.b = aVar;
                q.c(aVar);
            }
        }

        @Override // tb.cak
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b2b4dcc", new Object[]{this});
                return;
            }
            super.f();
            if (this.b != null) {
                od0.D().q().d(this.b);
                this.b = null;
            }
        }

        public final void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0330568", new Object[]{this});
                return;
            }
            ILogin q = od0.D().q();
            this.c = q.b();
            this.d = q.a();
        }

        public final boolean i() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("543bbd77", new Object[]{this})).booleanValue();
            }
            boolean b = od0.D().q().b();
            ILogin.a a2 = od0.D().q().a();
            if (this.c != b || !ILogin.a.a(this.d, a2) || akt.p2("disableFilterDupLoginState", false)) {
                z = true;
            }
            if (z) {
                this.c = b;
                this.d = a2;
            }
            return z;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements ILogin.LoginCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ILogin f12343a;

            public a(ILogin iLogin) {
                this.f12343a = iLogin;
            }

            public void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c1d28d2", new Object[]{this, new Integer(i)});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                Set<String> b = f.this.b();
                if (i == 1) {
                    ILogin.a a2 = this.f12343a.a();
                    if (f.g(f.this)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("uId", (Object) a2.f12001a);
                        jSONObject2.put("nick", (Object) a2.b);
                        jSONObject2.put("userLogo", (Object) a2.c);
                        jSONObject.put("user", (Object) jSONObject2);
                        jSONObject.put("isLogin", (Object) Boolean.TRUE);
                        for (String str : b) {
                            f.this.a(str, jSONObject);
                        }
                    }
                } else if ((i == 2 || i == 3) && f.g(f.this)) {
                    jSONObject.put("isLogin", (Object) Boolean.FALSE);
                    for (String str2 : b) {
                        f.this.a(str2, jSONObject);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface g {
        void unregister();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface h {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i extends cak {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public HashMap<String, List<d.i>> b;
        public g c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements h {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public void a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2bc05ded", new Object[]{this, jSONObject});
                    return;
                }
                List<d.i> list = (List) i.g(i.this).get(jSONObject.getString("event"));
                if (list != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("param");
                    for (d.i iVar : list) {
                        d.j jVar = iVar.f11975a;
                        jVar.c.a(jVar, jSONObject2);
                    }
                }
            }
        }

        static {
            t2o.a(503317341);
        }

        public i(NotifyManager notifyManager) {
        }

        public static /* synthetic */ HashMap g(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("f07c554b", new Object[]{iVar});
            }
            return iVar.b;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            if (str.hashCode() == -1960096308) {
                super.f();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/module/notify/NotifyManager$WindvaneNotifyImpl");
        }

        @Override // tb.cak
        public void d(String str, d.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c565d63f", new Object[]{this, str, jVar});
                return;
            }
            if (this.b == null) {
                this.b = new HashMap<>();
                this.c = od0.D().b(new a());
            }
            List<d.i> list = this.b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.b.put(str, list);
            }
            list.add(new d.i(jVar));
        }

        @Override // tb.cak
        public void e(String str, d.j jVar) {
            Iterator<d.i> it;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e819306", new Object[]{this, str, jVar});
                return;
            }
            List<d.i> list = this.b.get(str);
            if (list != null && (it = list.iterator()) != null) {
                while (it.hasNext()) {
                    if (cak.c(it.next().f11975a, jVar)) {
                        it.remove();
                    }
                }
            }
        }

        @Override // tb.cak
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b2b4dcc", new Object[]{this});
                return;
            }
            super.f();
            g gVar = this.c;
            if (gVar != null) {
                gVar.unregister();
            }
            HashMap<String, List<d.i>> hashMap = this.b;
            if (hashMap != null) {
                hashMap.clear();
            }
        }
    }

    static {
        t2o.a(503317324);
    }

    public static /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3d0ed1a", new Object[0]);
        }
        return i;
    }

    public static void e(String str, Class<? extends cak> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb424dc", new Object[]{str, cls});
        } else {
            j.put(str, cls);
        }
    }

    public static void f(String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e441da04", new Object[]{str, str2, cVar});
            return;
        }
        b bVar = new b();
        bVar.f12340a = str2;
        bVar.b = cVar;
        i.put(str, bVar);
    }

    public final cak b(String str, boolean z) {
        Class<? extends cak> cls;
        IllegalAccessException e2;
        InstantiationException e3;
        cak cakVar;
        Map<String, cak> map = this.h;
        cak cakVar2 = (cak) ((HashMap) map).get(str);
        if (cakVar2 != null || (cls = j.get(str)) == null || !z) {
            return cakVar2;
        }
        try {
            cakVar = (cak) cls.newInstance();
        } catch (IllegalAccessException e4) {
            e2 = e4;
        } catch (InstantiationException e5) {
            e3 = e5;
        }
        try {
            ((HashMap) map).put(str, cakVar);
            return cakVar;
        } catch (IllegalAccessException e6) {
            e2 = e6;
            cakVar2 = cakVar;
            e2.printStackTrace();
            return cakVar2;
        } catch (InstantiationException e7) {
            e3 = e7;
            cakVar2 = cakVar;
            e3.printStackTrace();
            return cakVar2;
        }
    }

    public void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab5f1b2e", new Object[]{this, intent});
        } else {
            LocalBroadcastManager.getInstance(o.J()).sendBroadcast(intent);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r7.equals("TBTabbarStyleChangeNotification") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.lang.String r7, com.taobao.tao.flexbox.layoutmanager.ac.d.j r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 0
            r2 = 3
            r3 = 1
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "c565d63f"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r3] = r7
            r2[r0] = r8
            r4.ipc$dispatch(r5, r2)
            return
        L_0x0018:
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1297386850: goto L_0x0044;
                case 94195219: goto L_0x0039;
                case 301118016: goto L_0x0030;
                case 729296864: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x004e
        L_0x0025:
            java.lang.String r0 = "TNodeApplicationStateNotify"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x002e
            goto L_0x0023
        L_0x002e:
            r0 = 3
            goto L_0x004e
        L_0x0030:
            java.lang.String r1 = "TBTabbarStyleChangeNotification"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x004e
            goto L_0x0023
        L_0x0039:
            java.lang.String r0 = "TNodeUserChanged"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x0023
        L_0x0042:
            r0 = 1
            goto L_0x004e
        L_0x0044:
            java.lang.String r0 = "TBTabHostStatusChangedNotification"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x0023
        L_0x004d:
            r0 = 0
        L_0x004e:
            switch(r0) {
                case 0: goto L_0x0094;
                case 1: goto L_0x008e;
                case 2: goto L_0x0088;
                case 3: goto L_0x0082;
                default: goto L_0x0051;
            }
        L_0x0051:
            tb.cak r0 = r6.b(r7, r3)
            if (r0 == 0) goto L_0x005b
            r0.d(r7, r8)
            goto L_0x0099
        L_0x005b:
            java.lang.String r0 = "DAI_"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x0069
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$DAINotifyImpl r0 = r6.d
            r0.d(r7, r8)
            goto L_0x0099
        L_0x0069:
            java.util.HashMap<java.lang.String, com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$b> r0 = com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.i
            java.lang.Object r0 = r0.get(r7)
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$b r0 = (com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.b) r0
            if (r0 != 0) goto L_0x0075
            r0 = r7
            goto L_0x0077
        L_0x0075:
            java.lang.String r0 = r0.f12340a
        L_0x0077:
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$NormalNotifyImpl r1 = r6.f12336a
            r1.d(r0, r8)
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$i r0 = r6.e
            r0.d(r7, r8)
            goto L_0x0099
        L_0x0082:
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$a r0 = r6.c
            r0.d(r7, r8)
            goto L_0x0099
        L_0x0088:
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$d r0 = r6.f
            r0.d(r7, r8)
            goto L_0x0099
        L_0x008e:
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$f r0 = r6.b
            r0.d(r7, r8)
            goto L_0x0099
        L_0x0094:
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$e r0 = r6.g
            r0.d(r7, r8)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.d(java.lang.String, com.taobao.tao.flexbox.layoutmanager.ac.d$j):void");
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            return;
        }
        this.b.f();
        this.f12336a.f();
        this.c.f();
        this.d.f();
        this.e.f();
        this.f.f();
        this.g.f();
        i();
        this.f12336a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r7.equals("TBTabbarStyleChangeNotification") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(java.lang.String r7, com.taobao.tao.flexbox.layoutmanager.ac.d.j r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 3
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "8e819306"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r6
            r2[r1] = r7
            r2[r0] = r8
            r4.ipc$dispatch(r5, r2)
            return
        L_0x0018:
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1297386850: goto L_0x0044;
                case 94195219: goto L_0x0039;
                case 301118016: goto L_0x0030;
                case 729296864: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x004e
        L_0x0025:
            java.lang.String r0 = "TNodeApplicationStateNotify"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x002e
            goto L_0x0023
        L_0x002e:
            r0 = 3
            goto L_0x004e
        L_0x0030:
            java.lang.String r1 = "TBTabbarStyleChangeNotification"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x004e
            goto L_0x0023
        L_0x0039:
            java.lang.String r0 = "TNodeUserChanged"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x0023
        L_0x0042:
            r0 = 1
            goto L_0x004e
        L_0x0044:
            java.lang.String r0 = "TBTabHostStatusChangedNotification"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x0023
        L_0x004d:
            r0 = 0
        L_0x004e:
            switch(r0) {
                case 0: goto L_0x00a0;
                case 1: goto L_0x0098;
                case 2: goto L_0x0090;
                case 3: goto L_0x0088;
                default: goto L_0x0051;
            }
        L_0x0051:
            tb.cak r0 = r6.b(r7, r3)
            if (r0 == 0) goto L_0x005b
            r0.e(r7, r8)
            goto L_0x00a7
        L_0x005b:
            java.lang.String r0 = "DAI_"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x006b
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$DAINotifyImpl r0 = r6.d
            if (r0 == 0) goto L_0x00a7
            r0.e(r7, r8)
            goto L_0x00a7
        L_0x006b:
            java.util.HashMap<java.lang.String, com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$b> r0 = com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.i
            java.lang.Object r0 = r0.get(r7)
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$b r0 = (com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.b) r0
            if (r0 != 0) goto L_0x0077
            r0 = r7
            goto L_0x0079
        L_0x0077:
            java.lang.String r0 = r0.f12340a
        L_0x0079:
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$NormalNotifyImpl r1 = r6.f12336a
            if (r1 == 0) goto L_0x0080
            r1.e(r0, r8)
        L_0x0080:
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$i r0 = r6.e
            if (r0 == 0) goto L_0x00a7
            r0.e(r7, r8)
            goto L_0x00a7
        L_0x0088:
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$a r0 = r6.c
            if (r0 == 0) goto L_0x00a7
            r0.e(r7, r8)
            goto L_0x00a7
        L_0x0090:
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$d r0 = r6.f
            if (r0 == 0) goto L_0x00a7
            r0.e(r7, r8)
            goto L_0x00a7
        L_0x0098:
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$f r0 = r6.b
            if (r0 == 0) goto L_0x00a7
            r0.e(r7, r8)
            goto L_0x00a7
        L_0x00a0:
            com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager$e r0 = r6.g
            if (r0 == 0) goto L_0x00a7
            r0.e(r7, r8)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.h(java.lang.String, com.taobao.tao.flexbox.layoutmanager.ac.d$j):void");
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58690e7", new Object[]{this});
            return;
        }
        Collection<cak> values = ((HashMap) this.h).values();
        for (cak cakVar : values) {
            cakVar.f();
        }
        values.clear();
    }
}
