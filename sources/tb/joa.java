package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.uc.webview.export.extension.UCExtension;
import java.util.HashMap;
import java.util.Map;
import tb.qoa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class joa extends qoa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String z = joa.class.getSimpleName();

    static {
        t2o.a(295699870);
    }

    public joa(Context context, ukr ukrVar, ViewGroup viewGroup, bce bceVar, String str, khf khfVar, boolean z2) {
        super(context, ukrVar, viewGroup, bceVar, str, khfVar, z2);
    }

    public static /* synthetic */ Object ipc$super(joa joaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1081866480) {
            super.W();
            return null;
        } else if (hashCode == 1899293727) {
            super.S((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 2020098384) {
            super.T((String) objArr[0], (Map) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/container/h5/H5AliveContainer");
        }
    }

    @Override // tb.qoa
    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9177a561", new Object[]{this});
            return;
        }
        T("TBLiveWVPlugin.Event.Alive.WillDeAlloc", new JSONObject());
        d0("globalH5Container-H5AliveContainer-destroyH5Container postNotificationToJS --- ");
        TBLiveH5Container tBLiveH5Container = this.o;
        if (tBLiveH5Container != null && (tBLiveH5Container.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.o.getParent()).removeView(this.o);
        }
        zmr zmrVar = this.p;
        if (!(zmrVar == null || zmrVar.a() == null || !(this.p.a().getParent() instanceof ViewGroup))) {
            ((ViewGroup) this.p.a().getParent()).removeView(this.p.a());
        }
        cv1 f = vx9.f(this.m.R());
        if (f != null) {
            nkr nkrVar = f.w;
            if (nkrVar != null) {
                nkrVar.a();
                d0("globalH5Container-H5AliveContainer-destroyH5Container globalContext destroy --- ");
            }
            f.w = this.n;
            this.n = null;
            this.o = null;
            this.p = null;
        }
    }

    @Override // tb.qoa
    public void S(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
            return;
        }
        JSONObject d = fkx.d(str2);
        if (d == null) {
            d = new JSONObject();
        }
        if (tws.R(str)) {
            d.put("liveToken", (Object) this.m.c0());
            d.put("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        }
        super.S(str, d.toJSONString());
    }

    @Override // tb.qoa
    public void T(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (tws.R(str)) {
            map.put("liveToken", this.m.c0());
            map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        }
        super.T(str, map);
    }

    public void c0() {
        nkr nkrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be36f3c8", new Object[]{this});
            return;
        }
        cv1 f = vx9.f(this.m.R());
        if (f == null || (nkrVar = f.w) == null) {
            super.W();
            d0("globalH5Container-initWebView: new --- ");
            return;
        }
        this.t = false;
        this.n = nkrVar;
        khf khfVar = this.r;
        if (khfVar != null) {
            khfVar.c();
        }
        f.w = null;
        this.n.u(this);
        zmr g = this.n.g();
        this.p = g;
        if (g == null || g.a() == null) {
            super.W();
            d0("globalH5Container-initWebView: mTBLiveH5Container null recreate --- ");
            return;
        }
        d0("globalH5Container-H5AliveContainer-initWebView: reused --- ");
        this.p.f(this.x);
        this.p.a().setVisibility(8);
        this.p.a().setFocusable(false);
        this.p.a().setImportantForAccessibility(2);
        this.p.a().setContentDescription("");
        if (this.p.a().getParent() instanceof ViewGroup) {
            ((ViewGroup) this.p.a().getParent()).removeView(this.p.a());
        }
        e(this.p.a());
        d0("globalH5Container-initWebView: globalContext get --- ");
    }

    public final void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9056fce1", new Object[]{this, str});
            return;
        }
        Integer num = null;
        if (tws.z()) {
            String str2 = z;
            StringBuilder sb = new StringBuilder("[");
            sb.append(hashCode());
            sb.append(",");
            zmr zmrVar = this.p;
            if (zmrVar != null) {
                num = Integer.valueOf(zmrVar.hashCode());
            }
            sb.append(num);
            sb.append("] ");
            sb.append(str);
            jbu.a(str2, sb.toString());
            return;
        }
        String str3 = z;
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(hashCode());
        sb2.append(",");
        TBLiveH5Container tBLiveH5Container = this.o;
        if (tBLiveH5Container != null) {
            num = Integer.valueOf(tBLiveH5Container.hashCode());
        }
        sb2.append(num);
        sb2.append("] ");
        sb2.append(str);
        jbu.a(str3, sb2.toString());
    }

    @Override // tb.qoa, tb.pu
    public void p(String str) {
        zmr zmrVar;
        TBLiveH5Container tBLiveH5Container;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75501eb3", new Object[]{this, str});
            return;
        }
        khf khfVar = this.r;
        if (khfVar != null) {
            khfVar.g();
        }
        if (!(this.n == null || (tBLiveH5Container = this.o) == null)) {
            if (!TextUtils.equals(tBLiveH5Container.getUrl(), str)) {
                this.n.k(this.k ? h5m.b(str, qoa.CODE_LAUNCH_OPTIMIZATION, "true") : str);
                d0("globalH5Container-renderByUrl: postNotificationToJS render--- " + str);
            } else {
                T("TBLiveWVPlugin.Event.Alive.DidAttached", new JSONObject());
                d0("globalH5Container-renderByUrl: postNotificationToJS --- ");
                TBLiveH5Container tBLiveH5Container2 = this.o;
                if (!(tBLiveH5Container2 == null || tBLiveH5Container2.getWebViewClient() == null)) {
                    this.o.getWebViewClient().onPageFinished(this.o, str);
                }
            }
        }
        if (this.n != null && (zmrVar = this.p) != null) {
            if (!TextUtils.equals(zmrVar.b(), str)) {
                this.n.l(this.k ? h5m.b(str, qoa.CODE_LAUNCH_OPTIMIZATION, "true") : str);
                d0("globalH5Container-renderByUrl: postNotificationToJS render--- " + str);
                return;
            }
            T("TBLiveWVPlugin.Event.Alive.DidAttached", new JSONObject());
            d0("globalH5Container-renderByUrl: postNotificationToJS --- ");
            this.x.d();
        }
    }

    @Override // tb.qoa
    public void W() {
        nkr nkrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407bf8f0", new Object[]{this});
        } else if (tws.z()) {
            c0();
        } else {
            cv1 f = vx9.f(this.m.R());
            if (f == null || (nkrVar = f.w) == null) {
                super.W();
                d0("globalH5Container-initWebView: new --- ");
                return;
            }
            this.t = false;
            this.n = nkrVar;
            khf khfVar = this.r;
            if (khfVar != null) {
                khfVar.c();
            }
            f.w = null;
            this.n.u(this);
            TBLiveH5Container f2 = this.n.f();
            this.o = f2;
            UCExtension uCExtension = f2.getUCExtension();
            if (uCExtension != null) {
                uCExtension.setIsPreRender(true);
            }
            if (this.o != null) {
                d0("globalH5Container-H5AliveContainer-initWebView: reused --- ");
                this.o.setWebViewClient(new qoa.i(this.e));
                this.o.setVisibility(8);
                this.o.setFocusable(false);
                this.o.setImportantForAccessibility(2);
                this.o.setContentDescription("");
                if (this.o.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.o.getParent()).removeView(this.o);
                }
                e(this.o);
                d0("globalH5Container-initWebView: globalContext get --- ");
                if (iw0.i()) {
                    b1u.b(this.e, "直播间Themis命中");
                    return;
                }
                return;
            }
            super.W();
            d0("globalH5Container-initWebView: mTBLiveH5Container null recreate --- ");
        }
    }
}
