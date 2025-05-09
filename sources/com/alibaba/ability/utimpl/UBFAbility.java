package com.alibaba.ability.utimpl;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsUBFAbility;
import com.taobao.android.abilityidl.ability.UBFResult;
import java.util.Map;
import tb.a07;
import tb.c21;
import tb.ckf;
import tb.gru;
import tb.hru;
import tb.i3e;
import tb.iru;
import tb.jru;
import tb.kdb;
import tb.kru;
import tb.lqv;
import tb.lru;
import tb.mru;
import tb.nru;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class UBFAbility extends AbsUBFAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(158334983);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(158334982);
    }

    public static /* synthetic */ Activity getActivity$default(UBFAbility uBFAbility, kdb kdbVar, Boolean bool, i3e i3eVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("8fcde0c8", new Object[]{uBFAbility, kdbVar, bool, i3eVar, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            i3eVar = null;
        }
        return uBFAbility.b(kdbVar, bool, i3eVar);
    }

    public static /* synthetic */ Object ipc$super(UBFAbility uBFAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/utimpl/UBFAbility");
    }

    public final void a(i3e i3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06a9a6f", new Object[]{this, i3eVar});
            return;
        }
        UBFResult uBFResult = new UBFResult();
        uBFResult.success = Boolean.TRUE;
        i3eVar.I0(uBFResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUBFAbility
    public void beginComponent(kdb kdbVar, gru gruVar, i3e i3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ffcf59", new Object[]{this, kdbVar, gruVar, i3eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(gruVar, "params");
        ckf.g(i3eVar, "callback");
        String str = gruVar.f20183a;
        String str2 = gruVar.b;
        String str3 = gruVar.c;
        if (str3 == null) {
            str3 = "";
        }
        if (str.length() == 0 || str2.length() == 0) {
            i3eVar.O(ErrorResult.a.Companion.g("参数错误"));
            return;
        }
        lqv.j().c(str, str2, str3);
        a(i3eVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUBFAbility
    public void beginPage(kdb kdbVar, hru hruVar, i3e i3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f78c1d", new Object[]{this, kdbVar, hruVar, i3eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(hruVar, "params");
        ckf.g(i3eVar, "callback");
        String str = hruVar.f20847a;
        String str2 = hruVar.b;
        if (str.length() == 0 || str2.length() == 0) {
            i3eVar.O(ErrorResult.a.Companion.g("参数错误"));
            return;
        }
        Activity b = b(kdbVar, hruVar.c, i3eVar);
        if (b != null) {
            lqv.j().d(str, str2, b);
            a(i3eVar);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUBFAbility
    public void beginUBF(kdb kdbVar, iru iruVar, i3e i3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6082d959", new Object[]{this, kdbVar, iruVar, i3eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(iruVar, "params");
        ckf.g(i3eVar, "callback");
        String str = iruVar.f21534a;
        String str2 = iruVar.b;
        if (str.length() == 0 || str2.length() == 0) {
            i3eVar.O(ErrorResult.a.Companion.g("参数错误"));
            return;
        }
        lqv.j().e(str, str2);
        a(i3eVar);
    }

    public final Map<String, String> c(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("32d8dae0", new Object[]{this, map});
        }
        if (map != 0) {
            return map;
        }
        return null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUBFAbility
    public void endComponent(kdb kdbVar, jru jruVar, i3e i3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee3a419", new Object[]{this, kdbVar, jruVar, i3eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jruVar, "params");
        ckf.g(i3eVar, "callback");
        String str = jruVar.f22177a;
        String str2 = jruVar.b;
        if (str.length() == 0 || str2.length() == 0) {
            i3eVar.O(ErrorResult.a.Companion.g("参数错误"));
            return;
        }
        lqv.j().g(str, str2);
        a(i3eVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUBFAbility
    public void endPage(kdb kdbVar, kru kruVar, i3e i3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390e1bc8", new Object[]{this, kdbVar, kruVar, i3eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(kruVar, "params");
        ckf.g(i3eVar, "callback");
        String str = kruVar.f22876a;
        if (str.length() == 0) {
            i3eVar.O(ErrorResult.a.Companion.g("参数错误"));
            return;
        }
        lqv.j().h(str);
        a(i3eVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUBFAbility
    public void endUBF(kdb kdbVar, kru kruVar, i3e i3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e8e2b4", new Object[]{this, kdbVar, kruVar, i3eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(kruVar, "params");
        ckf.g(i3eVar, "callback");
        String str = kruVar.f22876a;
        if (str.length() == 0) {
            i3eVar.O(ErrorResult.a.Companion.g("参数错误"));
            return;
        }
        lqv.j().i(str);
        a(i3eVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUBFAbility
    public void sendEvent(kdb kdbVar, lru lruVar, i3e i3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b2bd4e9", new Object[]{this, kdbVar, lruVar, i3eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(lruVar, "params");
        ckf.g(i3eVar, "callback");
        String str = lruVar.f23535a;
        String str2 = lruVar.b;
        String str3 = lruVar.c;
        String str4 = str3 != null ? str3 : "";
        String str5 = lruVar.d;
        String str6 = str5 != null ? str5 : "";
        Map<String, String> c = c(lruVar.e);
        if (str.length() == 0 || str2.length() == 0) {
            i3eVar.O(ErrorResult.a.Companion.g("参数错误"));
            return;
        }
        lqv.j().k(str, str2, str4, str6, c);
        a(i3eVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUBFAbility
    public void updateComponent(kdb kdbVar, mru mruVar, i3e i3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442e52e5", new Object[]{this, kdbVar, mruVar, i3eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(mruVar, "params");
        ckf.g(i3eVar, "callback");
        String str = mruVar.f24264a;
        String str2 = mruVar.b;
        Map<String, String> c = c(mruVar.c);
        if (str.length() == 0 || str2.length() == 0 || c == null) {
            i3eVar.O(ErrorResult.a.Companion.g("参数错误"));
            return;
        }
        lqv.j().l(str, str2, c);
        a(i3eVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUBFAbility
    public void updatePage(kdb kdbVar, nru nruVar, i3e i3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c53733e8", new Object[]{this, kdbVar, nruVar, i3eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(nruVar, "params");
        ckf.g(i3eVar, "callback");
        String str = nruVar.f24912a;
        Map<String, String> c = c(nruVar.b);
        if (str.length() == 0 || c == null) {
            i3eVar.O(ErrorResult.a.Companion.g("参数错误"));
            return;
        }
        lqv.j().m(str, c);
        a(i3eVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUBFAbility
    public void updateUBF(kdb kdbVar, nru nruVar, i3e i3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbe58e0", new Object[]{this, kdbVar, nruVar, i3eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(nruVar, "params");
        ckf.g(i3eVar, "callback");
        String str = nruVar.f24912a;
        Map<String, String> c = c(nruVar.b);
        if (str.length() == 0 || c == null) {
            i3eVar.O(ErrorResult.a.Companion.g("参数错误"));
            return;
        }
        lqv.j().n(str, c);
        a(i3eVar);
    }

    public final Activity b(kdb kdbVar, Boolean bool, i3e i3eVar) {
        Activity activity;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2adeb418", new Object[]{this, kdbVar, bool, i3eVar});
        }
        Object m = kdbVar.m("ut_page_object");
        if (m instanceof Activity) {
            return (Activity) m;
        }
        if (bool != null) {
            z = bool.booleanValue();
        }
        if (z) {
            activity = c21.i();
        } else {
            Context context = kdbVar.l().getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            activity = (Activity) context;
        }
        if (activity == null && i3eVar != null) {
            i3eVar.O(ErrorResult.a.Companion.g("没有获取到 activity"));
        }
        return activity;
    }
}
