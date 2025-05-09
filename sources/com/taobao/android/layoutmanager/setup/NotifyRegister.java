package com.taobao.android.layoutmanager.setup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import anet.channel.status.NetworkStatusHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager;
import java.util.Map;
import tb.a3w;
import tb.akt;
import tb.cak;
import tb.n78;
import tb.od0;
import tb.s1c;
import tb.t1c;
import tb.t2o;
import tb.tfs;
import tb.uot;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class NotifyRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_GG_TNODE_POPLAYER_CHANGED = "com.taobao.android.action.GG_TNode_PopLayerChanged";
    public static final String ACTION_GG_TNODE_TAB_LIVE_CHANGED = "com.taobao.live.timemove.homepage.tab";
    public static final String ACTION_GG_TNODE_TAB_SELECT_CHANGED = "com.taobao.android.action.GG_TNode_TabSelectChanged";

    /* renamed from: a  reason: collision with root package name */
    public static final NotifyManager.c f8228a = new a();
    public static final NotifyManager.c b = new b();
    public static final NotifyManager.c c = new c();
    public static final NotifyManager.c d = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class NetworkConnectChangedReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(502268172);
        }

        public static /* synthetic */ Object ipc$super(NetworkConnectChangedReceiver networkConnectChangedReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/setup/NotifyRegister$NetworkConnectChangedReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    Intent intent2 = new Intent("TNodeNetworkConnectChanged");
                    intent2.putExtra("connect", true);
                    LocalBroadcastManager.getInstance(context).sendBroadcast(intent2);
                }
            } catch (Throwable th) {
                tfs.d(th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements NotifyManager.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.c
        public JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("d4cf4ef0", new Object[]{this, jSONObject});
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            IFestival k = od0.D().k();
            if (k != null) {
                jSONObject.putAll(k.t().toMap());
            }
            return jSONObject;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements NotifyManager.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.c
        public JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("d4cf4ef0", new Object[]{this, jSONObject});
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject.getJSONObject("config");
            String string = jSONObject.getString(wdm.CATEGORY_TRIGGER_EVENT);
            String string2 = jSONObject.getString("nativeUri");
            String string3 = jSONObject.getString("nativeUrl");
            String string4 = jSONObject.getString("config");
            String string5 = jSONObject.getString("eventType");
            String string6 = jSONObject.getString("indexId");
            if (!TextUtils.isEmpty(string5)) {
                jSONObject2.put("eventType", (Object) string5);
            }
            JSONObject jSONObject4 = new JSONObject();
            if (jSONObject3 != null) {
                if (!TextUtils.isEmpty(string4)) {
                    jSONObject4.put("config", (Object) string4);
                }
                if (!TextUtils.isEmpty(string)) {
                    jSONObject4.put("event", (Object) string);
                }
                if (!TextUtils.isEmpty(string6)) {
                    jSONObject4.put("indexId", (Object) string6);
                }
                if (!TextUtils.isEmpty(string3)) {
                    jSONObject4.put("nativeUrl", (Object) string3);
                }
                if (!TextUtils.isEmpty(string2)) {
                    jSONObject4.put("nativeUri", (Object) string2);
                }
                jSONObject2.put("pop", (Object) jSONObject4);
                if (!TextUtils.isEmpty(jSONObject3.getString("type"))) {
                    jSONObject2.put("type", (Object) jSONObject3.getString("type"));
                }
                if (!TextUtils.isEmpty(jSONObject3.getString("url"))) {
                    jSONObject2.put("url", (Object) jSONObject3.getString("url"));
                }
                if (!TextUtils.isEmpty(jSONObject3.getString(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI))) {
                    jSONObject2.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, (Object) jSONObject3.getString(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI));
                }
                if (!TextUtils.isEmpty(jSONObject3.getString("layerType"))) {
                    jSONObject2.put("layerType", (Object) jSONObject3.getString("layerType"));
                }
            }
            return jSONObject2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements NotifyManager.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.c
        public JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("d4cf4ef0", new Object[]{this, jSONObject});
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("livetab", (Object) Boolean.valueOf(TextUtils.equals(jSONObject.getString("selectStatus"), "onPageSelected")));
            return jSONObject2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements NotifyManager.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.c
        public JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("d4cf4ef0", new Object[]{this, jSONObject});
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            int intValue = jSONObject.getIntValue("selectedTabIndex");
            boolean booleanValue = jSONObject.getBooleanValue("clickTabChange");
            jSONObject2.put("selectedTabIndex", (Object) Integer.valueOf(intValue));
            jSONObject2.put("clickTabChange", (Object) Boolean.valueOf(booleanValue));
            return jSONObject2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e implements NetworkStatusHelper.INetworkStatusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
            } else if (NetworkStatusHelper.isConnected()) {
                Intent intent = new Intent("TNodeNetworkConnectChanged");
                intent.putExtra("connect", true);
                LocalBroadcastManager.getInstance(o.J()).sendBroadcast(intent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f implements s1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public cak f8229a;

        static {
            t2o.a(502268170);
            t2o.a(456130607);
        }

        public f() {
        }

        public void a(cak cakVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87436f94", new Object[]{this, cakVar});
            } else {
                this.f8229a = cakVar;
            }
        }

        @Override // tb.s1c
        public void onSuccess(a3w a3wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a126ba", new Object[]{this, a3wVar});
            } else if (this.f8229a != null) {
                Map c = uot.c(a3wVar);
                for (String str : this.f8229a.b()) {
                    this.f8229a.a(str, c);
                }
            }
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class g extends cak {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public f b;

        static {
            t2o.a(502268171);
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1960096308) {
                super.f();
                return null;
            } else if (hashCode == -983181761) {
                super.d((String) objArr[0], (d.j) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/layoutmanager/setup/NotifyRegister$EditionSwitchNotifyPlugin");
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
                f fVar = new f(null);
                this.b = fVar;
                fVar.a(this);
                ((t1c) n78.a(t1c.class)).addChangeVersionListener(this.b);
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
            f fVar = this.b;
            if (fVar != null) {
                fVar.a(null);
                this.b = null;
            }
        }
    }

    static {
        t2o.a(502268164);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        NotifyManager.f("TNodeAddFollowNotify", "TAOBAO.WEITAO.AddFollowNotify", null);
        NotifyManager.f("TNodeFestivalChanged", FestivalMgr.ACTION_FESTIVAL_CHANGE, f8228a);
        NotifyManager.f("TNodeMainTabPopLayerChanged", ACTION_GG_TNODE_POPLAYER_CHANGED, b);
        NotifyManager.f("TNodeHomeLiveTabChanged", ACTION_GG_TNODE_TAB_LIVE_CHANGED, c);
        NotifyManager.f("TNodeMainTabSelectChanged", ACTION_GG_TNODE_TAB_SELECT_CHANGED, d);
        NotifyManager.e("TNodeTbVersionChanged", g.class);
        b();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e94431", new Object[0]);
        } else if (akt.p1()) {
            NetworkStatusHelper.addStatusChangeListener(new e());
        } else {
            try {
                o.J().registerReceiver(new NetworkConnectChangedReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Throwable th) {
                tfs.d(th.getMessage());
            }
        }
    }
}
