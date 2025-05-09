package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;
import tb.nwa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gbt implements nwa.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19875a;

    static {
        t2o.a(779092911);
        t2o.a(779092495);
    }

    @Override // tb.nwa.a
    public void a(cba cbaVar, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c9883b", new Object[]{this, cbaVar, obj, str});
        } else {
            rbu.m0(cbaVar, obj, str);
        }
    }

    @Override // tb.nwa.a
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66e7cce1", new Object[]{this});
        }
        return this.f19875a;
    }

    @Override // tb.nwa.a
    public void c(cba cbaVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04202f1", new Object[]{this, cbaVar, obj});
        } else {
            rbu.C(cbaVar, obj);
        }
    }

    @Override // tb.nwa.a
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc8fe1d", new Object[]{this, str});
        } else {
            this.f19875a = str;
        }
    }

    @Override // tb.nwa.a
    public void e(cba cbaVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8936f40", new Object[]{this, cbaVar, obj});
        } else {
            rbu.E(cbaVar, obj);
        }
    }

    @Override // tb.nwa.a
    public boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fef7dd75", new Object[]{this, context})).booleanValue();
        }
        return hw0.r(context);
    }

    @Override // tb.nwa.a
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cef552e6", new Object[]{this})).booleanValue();
        }
        return rbu.l();
    }

    @Override // tb.nwa.a
    public String getLiveAndHomeMixSpm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3bdf591", new Object[]{this});
        }
        return rbu.p();
    }

    @Override // tb.nwa.a
    public void h(ux9 ux9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759f4dc5", new Object[]{this, ux9Var, obj});
        } else {
            rbu.y(ux9Var, obj, nwa.a(ux9Var).f24989a);
        }
    }

    @Override // tb.nwa.a
    public void i(ux9 ux9Var, Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a0dcf9", new Object[]{this, ux9Var, activity, liveItem, str, hashMap});
        } else {
            u90.j(activity, liveItem, str, hashMap);
        }
    }

    @Override // tb.nwa.a
    public void j(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c28c4fa", new Object[]{this, cbaVar});
        } else {
            rbu.h0(cbaVar);
        }
    }

    @Override // tb.nwa.a
    public void showShare(Activity activity, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e315412c", new Object[]{this, activity, new Boolean(z), map});
        } else {
            u90.p(activity, z, map);
        }
    }
}
