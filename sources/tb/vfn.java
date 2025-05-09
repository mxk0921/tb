package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.annotations.MemCheck;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.rank_module.MtopMediaplatformLivedetailEntryResponse;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
@MemCheck(field = "mContext")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vfn implements b0d, s3c, ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29985a;
    public final Context b;
    public final ukr c;
    public final sgf d;
    public View e;
    public boolean f;
    public final VideoInfo g;
    public FrameLayout h;
    public DXRootView i;
    public qfn j;
    public JSONObject k;
    public boolean l = false;
    public jyw m;
    public final ux9 n;
    public khf o;
    public Application.ActivityLifecycleCallbacks p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else if (activity == vfn.a(vfn.this)) {
                vfn.b(vfn.this);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else if (activity == vfn.a(vfn.this) && vfn.c(vfn.this) != null) {
                vfn.c(vfn.this).removeCallbacksAndMessages(null);
            }
        }
    }

    static {
        t2o.a(295700003);
        t2o.a(806355932);
        t2o.a(806355016);
        t2o.a(806356161);
    }

    public vfn(String str, Context context, ux9 ux9Var, VideoInfo videoInfo, ukr ukrVar, sgf sgfVar, khf khfVar) {
        this.f29985a = str;
        this.b = context;
        this.n = ux9Var;
        this.c = ukrVar;
        this.d = sgfVar;
        this.g = videoInfo;
        this.o = khfVar;
    }

    public static /* synthetic */ Context a(vfn vfnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("450514df", new Object[]{vfnVar});
        }
        return vfnVar.b;
    }

    public static /* synthetic */ void b(vfn vfnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9f6468", new Object[]{vfnVar});
        } else {
            vfnVar.l();
        }
    }

    public static /* synthetic */ jyw c(vfn vfnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyw) ipChange.ipc$dispatch("70f1de99", new Object[]{vfnVar});
        }
        return vfnVar.m;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return ukr.EVENTCENTER_BIZCODE;
    }

    public void d() {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        qfn qfnVar = this.j;
        if (qfnVar != null) {
            qfnVar.destroy();
            this.j = null;
        }
        sjr.g().b(this);
        JSONObject jSONObject = this.k;
        if (jSONObject != null) {
            jSONObject.clear();
            this.k = null;
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        jyw jywVar = this.m;
        if (jywVar != null) {
            jywVar.removeCallbacksAndMessages(null);
            this.m = null;
        }
        r96 j = this.n.j().j();
        if (this.i != null && w9l.b()) {
            this.h.removeView(this.i);
            j.c(new xm6(this.i));
        }
        this.o = null;
        if (e() && (activityLifecycleCallbacks = this.p) != null) {
            Context context = this.b;
            if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 30) {
                ((Activity) context).unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f8926df", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(v2s.o().p().b("tblive", "enableActivityLifecycleUnRegister", "true"));
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("825bf553", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(v2s.o().p().b("tblive", "enableEnergyOpt", "true"));
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.g;
        if (videoInfo != null && videoInfo.broadCaster != null) {
            this.m = new jyw(this);
            l();
            sjr.g().a(this);
            if (f()) {
                m();
            }
        }
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("982b80cc", new Object[]{this})).booleanValue();
        }
        VideoInfo videoInfo = this.g;
        if (videoInfo == null || !videoInfo.isOfficialLive()) {
            return false;
        }
        return true;
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 1) {
            l();
        }
    }

    public void i(ViewStub viewStub, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8e5f97", new Object[]{this, viewStub, new Boolean(z)});
            return;
        }
        this.f = z;
        if (viewStub != null && !this.n.c()) {
            viewStub.setLayoutResource(R.layout.taolive_room_interactive_system_component_flexalocal);
            View inflate = viewStub.inflate();
            this.e = inflate;
            FrameLayout frameLayout = (FrameLayout) inflate;
            this.h = frameLayout;
            frameLayout.setVisibility(8);
            xm6 a2 = this.n.j().j().a(-1383922967);
            if (a2 == null || !w9l.b()) {
                this.i = ll6.b(this.c, this.b, "taolive_rankmodule");
            } else {
                this.i = a2.a();
            }
            DXRootView dXRootView = this.i;
            if (dXRootView != null) {
                this.h.addView(dXRootView);
            }
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d8eae", new Object[]{this});
            return;
        }
        qfn qfnVar = this.j;
        if (qfnVar != null) {
            qfnVar.destroy();
        }
        qfn qfnVar2 = new qfn(this);
        this.j = qfnVar2;
        qfnVar2.K(this.g, 2);
        jyw jywVar = this.m;
        if (jywVar != null) {
            jywVar.removeCallbacksAndMessages(null);
            this.m.sendEmptyMessageDelayed(1, 60000L);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0518f8", new Object[]{this});
            return;
        }
        Context context = this.b;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= 30) {
                a aVar = new a();
                this.p = aVar;
                activity.registerActivityLifecycleCallbacks(aVar);
            }
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.dxmanager.event"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return this.f29985a;
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        this.k = null;
        k();
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo instanceof MtopMediaplatformLivedetailEntryResponse) {
            this.k = fkx.d(((MtopMediaplatformLivedetailEntryResponse) netBaseOutDo).getData());
            ukr ukrVar = this.c;
            if (!(ukrVar == null || ukrVar.getActionAdapter() == null)) {
                this.c.getActionAdapter().w(this.k);
            }
            k();
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    public final void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d453359", new Object[]{this, str, str2});
        } else if (this.k != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("isLandscape", Boolean.valueOf(this.f));
            hashMap.put("status", 2);
            this.k.put("action", (Object) str);
            hashMap.put("data", this.k);
            sgf sgfVar = this.d;
            if (sgfVar != null) {
                sgfVar.a(str2, hashMap);
            }
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ada8d89", new Object[]{this});
        } else if (!h()) {
            try {
                if (!this.n.c() && this.i != null) {
                    if (this.k == null) {
                        this.k = new JSONObject();
                    }
                    JSONArray jSONArray = new JSONArray();
                    sgf sgfVar = this.d;
                    if (sgfVar == null || sgfVar.c(tws.Y()) == null || ((!this.k.containsKey("hasHourRankingListEntry") || !this.k.getBooleanValue("hasHourRankingListEntry")) && (!this.k.containsKey("hasRankingListEntry") || !this.k.getBooleanValue("hasRankingListEntry")))) {
                        FrameLayout frameLayout = this.h;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObject = this.k.getJSONObject("hourRankingListData");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("track");
                    if (jSONObject2 != null) {
                        jSONObject2.getString("id");
                    }
                    jSONObject.getJSONObject("bizData").getDoubleValue("displayTotalAmount");
                    jSONObject.getLongValue("cycleTimeLeft");
                    JSONObject jSONObject3 = (JSONObject) this.k.clone();
                    jSONObject3.put("show_action", (Object) "show_action_rank_normal");
                    jSONArray.add(jSONObject3);
                    if (!this.l) {
                        this.l = true;
                        HashMap hashMap = new HashMap();
                        hashMap.put("dataRank", this.k.toJSONString());
                        hashMap.put("name", "rankModuleNative");
                        JSONObject jSONObject4 = this.k.getJSONObject("logParams");
                        if (jSONObject4 != null) {
                            for (String str : jSONObject4.keySet()) {
                                hashMap.put(str, jSONObject4.getString(str));
                            }
                        }
                        jbu.g(this.c, "Show-rank", hashMap);
                        sjr.g().c("com.taobao.taolive.room.interactive_component_entrance_render_finished", hashMap, this.f29985a);
                        khf khfVar = this.o;
                        if (khfVar != null) {
                            khfVar.a(null, hashMap);
                        }
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("bannerList", (Object) jSONArray);
                    jSONObject5.put("enableNewMixLiveTopUI", (Object) Boolean.TRUE);
                    jSONObject5.put("nativeParams", NewStyleUtils.a(this.b, NewStyleUtils.NewStyleType.SMALL));
                    ll6.e(this.c, this.i, jSONObject5, this.f29985a);
                    FrameLayout frameLayout2 = this.h;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(0);
                        int b = hw0.b(this.b, 3.0f);
                        this.h.setPadding(b, 0, b, 0);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        uv5 uv5Var;
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        str.hashCode();
        if (str.equals("com.taobao.taolive.room.dxmanager.event") && (obj instanceof uv5) && (objArr = (uv5Var = (uv5) obj).f29630a) != null && objArr.length >= 2 && "rank_entry_click".equals(objArr[1]) && this.k != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("data=" + this.k.toJSONString());
            JSONObject jSONObject = this.k.getJSONObject("logParams");
            if (jSONObject != null) {
                for (String str2 : jSONObject.keySet()) {
                    arrayList.add(str2 + "=" + jSONObject.getString(str2));
                }
            }
            if ("show_action_rank_normal".equals(uv5Var.f29630a[2]) || "show_action_rank_countdown".equals(uv5Var.f29630a[2])) {
                j("HOUR_RANK_LIST", tws.X());
                jbu.d(this.c, "rank", (String[]) arrayList.toArray(new String[arrayList.size()]));
            } else if ("show_action_rank_red".equals(uv5Var.f29630a[2])) {
                j("FANS_RANK_LIST", tws.X());
                jbu.d(this.c, "rank", (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        }
    }
}
