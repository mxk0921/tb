package com.taobao.tao.homepage.revision;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.revision.ChangeContainerProcess;
import tb.cpt;
import tb.kbq;
import tb.o78;
import tb.os6;
import tb.sfh;
import tb.t2o;
import tb.vqa;
import tb.vxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Revision {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MINI_APP_RELATION = "miniAppRelation";
    public static final String NEW_2021_UI_KEY = "new2021UIEnable";

    /* renamed from: a  reason: collision with root package name */
    public final BroadcastReceiver f12426a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final Revision f12427a = new Revision();

        static {
            t2o.a(729809354);
        }

        public static /* synthetic */ Revision a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Revision) ipChange.ipc$dispatch("1e5efddb", new Object[0]);
            }
            return f12427a;
        }
    }

    static {
        t2o.a(729809352);
    }

    public static Revision b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Revision) ipChange.ipc$dispatch("e31083b5", new Object[0]);
        }
        return a.a();
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b708a7c", new Object[0])).booleanValue();
        }
        return kbq.e(Globals.getApplication());
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd181c5", new Object[]{this});
        } else if (kbq.i(Globals.getApplication())) {
            o78.H(Globals.getApplication(), o78.CHINA_MAINLAND);
        }
    }

    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31c4a85e", new Object[]{this, str, str2});
        }
        return os6.b(str, str2);
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            LocalBroadcastManager.getInstance(context).registerReceiver(this.f12426a, new IntentFilter("taobao.action.ACTION_REVISION_SWITCH_CHANGE"));
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed2bc19", new Object[]{this})).booleanValue();
        }
        return o78.CHINA_MAINLAND.equalsIgnoreCase(kbq.c(Globals.getApplication()).editionCode);
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c395f", new Object[]{this})).booleanValue();
        }
        return cpt.a();
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd87f205", new Object[]{this, jSONObject});
            return;
        }
        vqa e = vqa.k().i("Revision").j("updateRevision").e("Revision.updateRevision").e("更新改版开关和桶号信息（目前全局开关由 dosa 下发");
        if (e() || f() || kbq.i(Globals.getApplication())) {
            String jSONString = jSONObject != null ? jSONObject.toJSONString() : null;
            e.g("switchInfo", jSONString).a();
            TBRevisionSwitchManager.c().j(jSONString);
            return;
        }
        e.e("非大陆版且非海外且非OLD版, 不设置revision 信息，直接return").a();
    }

    public Revision() {
        this.f12426a = new BroadcastReceiver(this) { // from class: com.taobao.tao.homepage.revision.Revision.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/revision/Revision$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (!vxl.b().v()) {
                    sfh.d("Revision", "收到广播:" + intent.getAction());
                    if ("taobao.action.ACTION_REVISION_SWITCH_CHANGE".equals(intent.getAction())) {
                        ChangeContainerProcess.d().e(ChangeContainerProcess.ChangeContainerType.revision);
                    }
                }
            }
        };
        a();
    }
}
