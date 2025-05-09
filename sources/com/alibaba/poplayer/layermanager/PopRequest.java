package com.alibaba.poplayer.layermanager;

import android.app.Activity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import tb.dcm;
import tb.fig;
import tb.lyv;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class PopRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b;
    public View c;
    public a d;
    public final b e;
    public WeakReference<Activity> f;
    public String g;
    public Map<String, Object> h;
    public final String j;
    public String l;
    public JSONObject m;
    public int k = 0;

    /* renamed from: a  reason: collision with root package name */
    public Status f2527a = Status.WAITING;
    public OnePopModule i = new OnePopModule();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum Status {
        WAITING,
        READY,
        ENQUEUED,
        REMOVED,
        FORCE_REMOVED,
        SUSPENDED,
        SHOWING;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Status status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/poplayer/layermanager/PopRequest$Status");
        }

        public static Status valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Status) ipChange.ipc$dispatch("ee60e877", new Object[]{str});
            }
            return (Status) Enum.valueOf(Status.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void onForceRemoved(PopRequest popRequest);

        void onReady(PopRequest popRequest);

        void onRecovered(PopRequest popRequest);

        void onSuspended(PopRequest popRequest);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c extends b {
        void onEnqueue(PopRequest popRequest);

        void onRemoved(PopRequest popRequest);
    }

    static {
        t2o.a(625999953);
    }

    public PopRequest(String str, Activity activity, String str2, b bVar, int i, boolean z, boolean z2, boolean z3) {
        this.b = str;
        this.e = bVar;
        this.g = str2;
        try {
            this.j = UUID.randomUUID().toString().replace("-", "");
        } catch (Throwable th) {
            wdm.h("PopRequest.init popTraceId.error.", th);
        }
        C(activity);
        G(new a(i, z, z2, z3));
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3bda74", new Object[]{this});
        } else if (lyv.j(this.f.get()) && a()) {
            this.k = lyv.g(PopLayer.getReference().getApp());
        }
    }

    public void B(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d951d1a1", new Object[]{this, activity, str});
            return;
        }
        this.g = str;
        C(activity);
        A();
        View view = this.c;
        if (view instanceof PopLayerBaseView) {
            try {
                ((PopLayerBaseView) view).resetContext(activity);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void C(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a83aa8f", new Object[]{this, activity});
        } else {
            this.f = new WeakReference<>(activity);
        }
    }

    public void D(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2862c704", new Object[]{this, jSONObject});
        } else {
            this.m = jSONObject;
        }
    }

    public void E(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8dc9fc", new Object[]{this, view});
        } else {
            this.c = view;
        }
    }

    public void F(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ff62c4", new Object[]{this, map});
        } else {
            this.h = map;
        }
    }

    public void G(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abbe2a9f", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public void H(Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19853973", new Object[]{this, status});
        } else {
            this.f2527a = status;
        }
    }

    public abstract boolean I();

    public abstract boolean a();

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7649f645", new Object[]{this});
            return;
        }
        try {
            this.i.a0 = "true";
            dcm.f().b(com.alibaba.poplayer.trigger.a.R(this));
        } catch (Throwable th) {
            wdm.h("PopRequest.finishPop.error.", th);
        }
    }

    public Activity c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("15ac4e57", new Object[]{this});
        }
        return (Activity) lyv.c(this.f);
    }

    public abstract String d();

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e0571018", new Object[]{this});
        }
        return this.m;
    }

    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("872c46b", new Object[]{this});
        }
        return null;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d40d14ee", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12aba803", new Object[]{this});
        }
        return this.g;
    }

    public View i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("563bae64", new Object[]{this});
        }
        return this.c;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afbee0a4", new Object[]{this});
        }
        return this.b;
    }

    public OnePopModule k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnePopModule) ipChange.ipc$dispatch("c7454189", new Object[]{this});
        }
        if (this.i == null) {
            this.i = new OnePopModule();
        }
        return this.i;
    }

    public Map<String, Object> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cbc93d0a", new Object[]{this});
        }
        return this.h;
    }

    public a m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d0fef76d", new Object[]{this});
        }
        return this.d;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f534a74", new Object[]{this});
        }
        return this.j;
    }

    public Status o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Status) ipChange.ipc$dispatch("22296d2d", new Object[]{this});
        }
        return this.f2527a;
    }

    public b p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d2f539a8", new Object[]{this});
        }
        return this.e;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return fig.c().b();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194904ab", new Object[]{this});
            return;
        }
        try {
            if (dcm.f().c(com.alibaba.poplayer.trigger.a.R(this), 0) < 0) {
                wdm.d("increaseReadTimes.alreadyFinished.notToIncrease", "");
                return;
            }
            OnePopModule onePopModule = this.i;
            onePopModule.X = (Integer.parseInt(this.i.X) + 1) + "";
            dcm.f().e(com.alibaba.poplayer.trigger.a.R(this));
            com.alibaba.poplayer.info.frequency.a.t().w(com.alibaba.poplayer.trigger.a.J(this));
        } catch (Throwable th) {
            wdm.h("PopRequest.increaseTimes.error.", th);
        }
    }

    public abstract boolean s();

    public abstract boolean t();

    public abstract boolean u();

    public abstract boolean v();

    public abstract boolean w();

    public abstract boolean x();

    public abstract boolean y();

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32f8258f", new Object[]{this})).booleanValue();
        }
        Status status = this.f2527a;
        if (status == Status.REMOVED || status == Status.FORCE_REMOVED) {
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2528a;
        public boolean b;
        public boolean c;

        static {
            t2o.a(625999954);
        }

        public a(int i, boolean z, boolean z2, boolean z3) {
            this.f2528a = i;
            this.b = z;
            this.c = z2;
        }

        public a() {
        }
    }
}
