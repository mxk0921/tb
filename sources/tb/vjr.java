package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.xhr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vjr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f30048a;
    public final JSONObject b;
    public FrameLayout c;
    public FrameLayout d;
    public FrameLayout e;
    public ImageView f;
    public TextView g;
    public final Context h;
    public final TBLiveOpenCardView j;
    public boolean k;
    public final f l;
    public Application.ActivityLifecycleCallbacks n;
    public final String m = vjr.class.getSimpleName();
    public final xhr i = new xhr();
    public boolean o = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f30049a;

        public a(JSONObject jSONObject) {
            this.f30049a = jSONObject;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            JSONObject jSONObject = this.f30049a;
            if (jSONObject != null) {
                String string = jSONObject.getString(rg0.JUMP_URL);
                if (!TextUtils.isEmpty(string) && vjr.a(vjr.this) != null) {
                    Nav.from(vjr.a(vjr.this)).toUri(string);
                }
                Map<String, String> a2 = pg6.a(vjr.b(vjr.this));
                a2.put("click_class", "clickvideo");
                gbu.a("Page_TaobaoLiveWatch", "focus_livecard_click", a2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (vjr.g(vjr.this) != null) {
                vjr vjrVar = vjr.this;
                vjr.i(vjrVar, !vjr.h(vjrVar));
                if (vjr.h(vjr.this)) {
                    vjr.g(vjr.this).a(true);
                    vjr.j(vjr.this).setMuted(true);
                    vjr.k(vjr.this).setBackgroundResource(R.drawable.tblive_follow_voice_close);
                    return;
                }
                vjr.g(vjr.this).a(false);
                vjr.j(vjr.this).setMuted(false);
                vjr.k(vjr.this).setBackgroundResource(R.drawable.tblive_follow_voice_enable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements xhr.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.xhr.c
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                vjr.o(vjr.this);
            }
        }

        @Override // tb.xhr.c
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            if (!(netResponse == null || netResponse.getDataJsonObject() == null)) {
                DXTemplateItem m = vjr.m(vjr.this, netResponse.getDataJsonObject().toString());
                if (!(vjr.b(vjr.this) == null || vjr.n(vjr.this) == null || vjr.a(vjr.this) == null || m == null)) {
                    whr.e().f(m, vjr.b(vjr.this), vjr.a(vjr.this), vjr.n(vjr.this));
                    return;
                }
            }
            vjr.o(vjr.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
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
                return;
            }
            vjr vjrVar = vjr.this;
            if (vjr.c(vjrVar, vjr.a(vjrVar), activity)) {
                vjr.d(vjr.this);
                new StringBuilder("onActivityDestroyed: ").append(hashCode());
                vjr.this.y();
                if (vjr.a(vjr.this) != null) {
                    ((Application) vjr.a(vjr.this).getApplicationContext()).unregisterActivityLifecycleCallbacks(vjr.this.n);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            vjr vjrVar = vjr.this;
            if (vjr.c(vjrVar, vjr.a(vjrVar), activity)) {
                vjr.d(vjr.this);
                new StringBuilder("onActivityDestroyed: ").append(hashCode());
                if (vjr.j(vjr.this) != null && vjr.j(vjr.this).isPlaying()) {
                    vjr.this.y();
                    vjr.f(vjr.this, true);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            vjr vjrVar = vjr.this;
            if (vjr.c(vjrVar, vjr.a(vjrVar), activity)) {
                vjr.d(vjr.this);
                if (vjr.j(vjr.this) != null && !vjr.j(vjr.this).isPlaying() && vjr.e(vjr.this)) {
                    vjr.this.x(null);
                    vjr.f(vjr.this, false);
                }
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
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface f {
        void a(boolean z);
    }

    static {
        t2o.a(779092473);
    }

    public vjr(Context context, View view, JSONObject jSONObject, String str, f fVar) {
        this.b = jSONObject;
        this.h = context;
        this.l = fVar;
        this.j = new TBLiveOpenCardView(context);
        this.k = arq.c(str);
        this.f30048a = view;
        t(view);
        v();
    }

    public static /* synthetic */ Context a(vjr vjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a2aee574", new Object[]{vjrVar});
        }
        return vjrVar.h;
    }

    public static /* synthetic */ JSONObject b(vjr vjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b5d03a5d", new Object[]{vjrVar});
        }
        return vjrVar.b;
    }

    public static /* synthetic */ boolean c(vjr vjrVar, Context context, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fa1ab93", new Object[]{vjrVar, context, activity})).booleanValue();
        }
        return vjrVar.p(context, activity);
    }

    public static /* synthetic */ String d(vjr vjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b815f34", new Object[]{vjrVar});
        }
        return vjrVar.m;
    }

    public static /* synthetic */ boolean e(vjr vjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83fcd3b1", new Object[]{vjrVar})).booleanValue();
        }
        return vjrVar.o;
    }

    public static /* synthetic */ boolean f(vjr vjrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b800b09", new Object[]{vjrVar, new Boolean(z)})).booleanValue();
        }
        vjrVar.o = z;
        return z;
    }

    public static /* synthetic */ f g(vjr vjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("e9b42d6d", new Object[]{vjrVar});
        }
        return vjrVar.l;
    }

    public static /* synthetic */ boolean h(vjr vjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4ad4c3", new Object[]{vjrVar})).booleanValue();
        }
        return vjrVar.k;
    }

    public static /* synthetic */ boolean i(vjr vjrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf22c37", new Object[]{vjrVar, new Boolean(z)})).booleanValue();
        }
        vjrVar.k = z;
        return z;
    }

    public static /* synthetic */ TBLiveOpenCardView j(vjr vjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveOpenCardView) ipChange.ipc$dispatch("6c221522", new Object[]{vjrVar});
        }
        return vjrVar.j;
    }

    public static /* synthetic */ ImageView k(vjr vjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("fec7746f", new Object[]{vjrVar});
        }
        return vjrVar.f;
    }

    public static /* synthetic */ TextView l(vjr vjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("5496b176", new Object[]{vjrVar});
        }
        return vjrVar.g;
    }

    public static /* synthetic */ DXTemplateItem m(vjr vjrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("6cb87a12", new Object[]{vjrVar, str});
        }
        return vjrVar.q(str);
    }

    public static /* synthetic */ FrameLayout n(vjr vjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("737055d5", new Object[]{vjrVar});
        }
        return vjrVar.d;
    }

    public static /* synthetic */ void o(vjr vjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24a0945", new Object[]{vjrVar});
        } else {
            vjrVar.w();
        }
    }

    public void A() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba0c9d6", new Object[]{this});
        } else if (this.h != null && v2s.o().E() != null) {
            v2s.o().E().pageAppear(this.h);
            HashMap hashMap = new HashMap();
            JSONObject jSONObject2 = this.b;
            if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("fields")) == null)) {
                hashMap.putAll(pg6.a(this.b));
                JSONObject jSONObject3 = jSONObject.getJSONObject("liveInfo");
                if (jSONObject3 != null) {
                    hashMap.put(z9u.KEY_LIVE_STATUS, jSONObject3.getString("roomStatus"));
                }
            }
            v2s.o().E().updatePageProperties(this.h, hashMap);
            v2s.o().E().updatePageName(this.h, "Page_TaobaoLiveWatch");
            v2s.o().E().pageDisAppear(this.h);
        }
    }

    public final boolean p(Context context, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eefd3837", new Object[]{this, context, activity})).booleanValue();
        }
        if (!(context == null || activity == null || activity.getComponentName() == null)) {
            Activity activity2 = (Activity) context;
            if (activity2.getComponentName() != null) {
                return activity.getComponentName().equals(activity2.getComponentName());
            }
        }
        return false;
    }

    public final DXTemplateItem q(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("3141341b", new Object[]{this, str});
        }
        try {
            jSONObject = (JSONObject) fkx.a(str);
        } catch (Throwable unused) {
        }
        if (jSONObject == null) {
            return null;
        }
        Iterator<Object> it = jSONObject.getJSONArray("result").iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String string = ((JSONObject) next).getString("name");
            if ("tbl_fllow_content_layer".equals(string)) {
                String string2 = ((JSONObject) next).getString("url4Android");
                long longValue = ((JSONObject) next).getLongValue("version4Android");
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.f7343a = string;
                dXTemplateItem.c = string2;
                dXTemplateItem.b = longValue;
                return dXTemplateItem;
            }
        }
        return null;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3953fafd", new Object[]{this});
            return;
        }
        xhr xhrVar = this.i;
        if (xhrVar != null) {
            xhrVar.a(new d());
        } else {
            w();
        }
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9559ca9", new Object[]{this, str});
            return;
        }
        xhr xhrVar = this.i;
        if (xhrVar != null) {
            xhrVar.b(str, new c());
        }
    }

    public final void t(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4614ed44", new Object[]{this, view});
            return;
        }
        this.d = (FrameLayout) view.findViewById(R.id.taolive_fllow_content_dx_frame);
        this.e = (FrameLayout) view.findViewById(R.id.taolive_fllow_content_player_frame);
        this.c = (FrameLayout) view.findViewById(R.id.tblive_uikit_follow_content_layout);
        this.f = (ImageView) view.findViewById(R.id.tbl_follow_content_voice_img);
        TextView textView = (TextView) view.findViewById(R.id.tbl_follow_content_error_tips);
        this.g = textView;
        textView.setVisibility(8);
        this.d.removeAllViews();
        this.e.removeAllViews();
        this.e.addView(this.j, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ccf080", new Object[]{this});
        } else if (this.d != null && this.e != null && this.c != null && this.f != null && this.j != null) {
            JSONObject jSONObject = this.b;
            if (jSONObject != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
                if (jSONObject2 != null) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("liveRoomInfo");
                    if (!(this.j == null || jSONObject3 == null)) {
                        String string = jSONObject3.getString(yj4.PARAM_COVER_IMG);
                        if (!TextUtils.isEmpty(string)) {
                            this.j.setImageUrl(string);
                            this.j.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        }
                    }
                }
                r();
                this.c.setOnClickListener(new a(jSONObject2));
            }
            this.f.setOnClickListener(new b());
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dbc2472", new Object[]{this});
            return;
        }
        try {
            if (this.n == null) {
                this.n = new e();
            }
            Context context = this.h;
            if (context != null) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.n);
            }
        } catch (Throwable unused) {
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e70cb60", new Object[]{this});
            return;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = "tbl_fllow_content_layer";
        dXTemplateItem.c = "https://dinamicx.alibabausercontent.com/pub/tbl_fllow_content_layer/1690774440223/tbl_fllow_content_layer.zip";
        dXTemplateItem.b = 3L;
        if (this.b != null && this.h != null && this.d != null) {
            whr.e().f(dXTemplateItem, this.b, this.h, this.d);
        }
    }

    public void x(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a535834", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.k = arq.c(str);
        }
        if (this.j != null && (jSONObject = this.b) != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("fields");
            if (!(jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("liveInfo")) == null)) {
                this.j.setPlayerData(jSONObject2);
                this.j.setPlayVideo(true);
                this.j.setCloseSkipPlaySwitch(true);
                this.j.playVideo(null, null);
                this.j.setMuted(this.k);
            }
            if (this.k) {
                this.f.setBackgroundResource(R.drawable.tblive_follow_voice_close);
            } else {
                this.f.setBackgroundResource(R.drawable.tblive_follow_voice_enable);
            }
            z();
            A();
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c1108a", new Object[]{this});
            return;
        }
        new StringBuilder("stopPlayer: ").append(hashCode());
        TBLiveOpenCardView tBLiveOpenCardView = this.j;
        if (tBLiveOpenCardView != null && tBLiveOpenCardView.isPlaying()) {
            this.j.stopVideo();
        }
    }

    public final void z() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e649a4a", new Object[]{this});
            return;
        }
        JSONObject jSONObject2 = this.b.getJSONObject("fields");
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("liveRoomInfo")) != null) {
            String string = jSONObject.getString("liveId");
            if (!TextUtils.isEmpty(string)) {
                s(string);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements xhr.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.xhr.c
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // tb.xhr.c
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            JSONObject d = fkx.d(netResponse.getDataJsonObject().toString());
            if (d != null && (jSONObject = d.getJSONObject("model")) != null) {
                Integer integer = jSONObject.getInteger("roomStatus");
                vjr.l(vjr.this).setVisibility(8);
                if (!(integer == null || integer.intValue() == 1)) {
                    vjr.l(vjr.this).setText("主播暂时不在，稍等一会儿回来哦～");
                    vjr.l(vjr.this).setVisibility(0);
                }
                Integer integer2 = jSONObject.getInteger("streamStatus");
                if (integer2 != null && integer2.intValue() != 1) {
                    vjr.l(vjr.this).setText("亲，直播间被挤爆了，请刷新再试");
                    vjr.l(vjr.this).setVisibility(0);
                }
            }
        }
    }
}
