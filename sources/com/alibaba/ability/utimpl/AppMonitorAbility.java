package com.alibaba.ability.utimpl;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAppMonitorAbility;
import java.util.Map;
import tb.ckf;
import tb.e71;
import tb.g71;
import tb.i71;
import tb.jdb;
import tb.kdb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AppMonitorAbility extends AbsAppMonitorAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g71 f2079a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public a(g71 g71Var, String str, String str2, String str3) {
            this.f2079a = g71Var;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            g71 g71Var = this.f2079a;
            AppMonitor.Alarm.commitFail(this.b, this.c, this.d, g71Var.c, g71Var.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2080a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(String str, String str2, String str3) {
            this.f2080a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AppMonitor.Alarm.commitSuccess(this.f2080a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e71 f2081a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public c(e71 e71Var, String str, String str2, String str3) {
            this.f2081a = e71Var;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AppMonitor.Counter.commit(this.b, this.c, this.d, this.f2081a.c);
            }
        }
    }

    static {
        t2o.a(158334977);
    }

    public static /* synthetic */ Object ipc$super(AppMonitorAbility appMonitorAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/utimpl/AppMonitorAbility");
    }

    public final String a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8be815", new Object[]{this, map});
        }
        if (map == null) {
            return "";
        }
        Object obj = map.get("_dx_arg_");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        String jSONString = new JSONObject(map).toJSONString();
        ckf.f(jSONString, "JSONObject(argMap).toJSONString()");
        return jSONString;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppMonitorAbility
    public void alarmFail(kdb kdbVar, g71 g71Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e9fa0c", new Object[]{this, kdbVar, g71Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(g71Var, "params");
        ckf.g(jdbVar, "callback");
        String str = g71Var.f19766a;
        String str2 = g71Var.b;
        if (str.length() == 0 || str2.length() == 0) {
            jdbVar.O(ErrorResult.a.Companion.g("参数不正确"));
        } else {
            MegaUtils.C(new a(g71Var, str, str2, a(g71Var.e)));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppMonitorAbility
    public void alarmSuccess(kdb kdbVar, i71 i71Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48d6180", new Object[]{this, kdbVar, i71Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(i71Var, "params");
        ckf.g(jdbVar, "callback");
        String str = i71Var.f21134a;
        String str2 = i71Var.b;
        if (str.length() == 0 || str2.length() == 0) {
            jdbVar.O(ErrorResult.a.Companion.g("参数不正确"));
        } else {
            MegaUtils.C(new b(str, str2, a(i71Var.c)));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppMonitorAbility
    public void counter(kdb kdbVar, e71 e71Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918aa556", new Object[]{this, kdbVar, e71Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(e71Var, "params");
        ckf.g(jdbVar, "callback");
        String str = e71Var.f18336a;
        String str2 = e71Var.b;
        if (str.length() == 0 || str2.length() == 0) {
            jdbVar.O(ErrorResult.a.Companion.g("参数不正确"));
        } else {
            MegaUtils.C(new c(e71Var, str, str2, a(e71Var.d)));
        }
    }
}
