package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.preload.LivePreloadData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q2h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public wlc f26461a;
    public LivePreloadData b;
    public o2h c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final q2h f26462a = new q2h();

        static {
            t2o.a(779092158);
        }

        public static /* synthetic */ q2h a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q2h) ipChange.ipc$dispatch("5f10d9bb", new Object[0]);
            }
            return f26462a;
        }
    }

    static {
        t2o.a(779092156);
    }

    public static q2h d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q2h) ipChange.ipc$dispatch("a53e6315", new Object[0]);
        }
        return b.a();
    }

    public void c(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4272508d", new Object[]{this, context, jSONObject});
        } else if (context != null) {
            if (!this.c.e()) {
                tfs.e("LivePreloadService", "直播预下载开关未打开，return");
                return;
            }
            wlc b2 = b(context, jSONObject);
            this.f26461a = b2;
            if (b2 != null) {
                b2.execute();
            }
        }
    }

    public o2h e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o2h) ipChange.ipc$dispatch("27d64c39", new Object[]{this});
        }
        return this.c;
    }

    public LivePreloadData f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LivePreloadData) ipChange.ipc$dispatch("b2da2270", new Object[]{this});
        }
        wlc wlcVar = this.f26461a;
        if (wlcVar != null) {
            this.b = wlcVar.a();
        }
        return this.b;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21f2b31", new Object[]{this});
            return;
        }
        tfs.e("LivePreloadService", "清除直播预加载数据，取消timer");
        wlc wlcVar = this.f26461a;
        if (wlcVar != null) {
            wlcVar.cancel();
        }
        this.b = null;
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8f3c8b", new Object[]{this, jSONObject});
        } else {
            this.c = new o2h(jSONObject);
        }
    }

    public q2h() {
        this.c = new o2h();
    }

    public final wlc a(Context context, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wlc) ipChange.ipc$dispatch("4eae516b", new Object[]{this, context, jSONObject, new Integer(i)});
        }
        if (sz3.b(jSONObject)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("extraParams");
        if (sz3.b(jSONObject2)) {
            return null;
        }
        boolean o = nwv.o(jSONObject2.get("live_tab_top_item_switch"), false);
        tfs.e("LivePreloadService", "buildIconStreamPreloadTask,小红点承接是否是开播导航承接的方式:" + o);
        if (o) {
            return new t2h(context, this.c, i);
        }
        return null;
    }

    public final wlc b(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wlc) ipChange.ipc$dispatch("547c8bb7", new Object[]{this, context, jSONObject});
        }
        int t = nwv.t(jSONObject.get("type"), 1);
        if (t == 1) {
            return new t2h(context, this.c, t);
        }
        if (t != 3) {
            return null;
        }
        return a(context, jSONObject, t);
    }
}
