package tb;

import android.content.pm.ActivityInfo;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class a9 extends h9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String l;
    public final String m;
    public final boolean n;
    public ActivityInfo o;
    public final boolean p;
    public final boolean q;

    static {
        t2o.a(336592991);
    }

    public a9(JSONObject jSONObject) {
        super(jSONObject);
        this.q = true;
        JSONObject jSONObject2 = this.h;
        if (jSONObject2 != null) {
            this.l = vwf.g(jSONObject2, "fragmentClass", null);
            this.m = vwf.g(this.h, "droidFragmentTag", null);
            vwf.d(this.h, "showNativeWithCode", -1);
            this.p = vwf.b(this.h, "recreateOnSysChanged", false);
            this.n = vwf.b(this.h, "recoverWindow", false);
            this.q = vwf.b(this.h, "enablePadActTransition", true);
        }
        if (this.g == null) {
            this.g = new JSONObject(0);
        }
    }

    public static /* synthetic */ Object ipc$super(a9 a9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/model/AKNativeParams");
    }

    @Override // tb.h9
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51290782", new Object[]{this});
        }
        String str = this.e;
        ckf.f(str, "url");
        if (wsq.a0(str)) {
            return "stdpop://native/" + this.l;
        }
        String str2 = this.e;
        ckf.f(str2, "url");
        return str2;
    }

    public final ActivityInfo f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityInfo) ipChange.ipc$dispatch("7b39eb12", new Object[]{this});
        }
        return this.o;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2bf3eaf5", new Object[]{this});
        }
        return this.m;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56e00a58", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("637590e7", new Object[]{this});
        }
        return this.l;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19810c49", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a8cc076", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public final void l(ActivityInfo activityInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdc58e2", new Object[]{this, activityInfo});
        } else {
            this.o = activityInfo;
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdc6dd7", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }
}
