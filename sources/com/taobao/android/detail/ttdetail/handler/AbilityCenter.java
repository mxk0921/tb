package com.taobao.android.detail.ttdetail.handler;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.UpdateItemImplementor;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bw7;
import tb.e28;
import tb.ir;
import tb.jwj;
import tb.nx6;
import tb.qdb;
import tb.sv1;
import tb.t2o;
import tb.tgh;
import tb.yc4;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AbilityCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public qdb f6793a;
    public final Context b;
    public final ze7 c;
    public final Map<String, zre> d = new ConcurrentHashMap();

    static {
        t2o.a(912261823);
    }

    public AbilityCenter(Context context, ze7 ze7Var) {
        this.b = context;
        this.c = ze7Var;
        f();
    }

    public static /* synthetic */ ze7 a(AbilityCenter abilityCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("8b00605b", new Object[]{abilityCenter});
        }
        return abilityCenter.c;
    }

    public static /* synthetic */ Context b(AbilityCenter abilityCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("67bac878", new Object[]{abilityCenter});
        }
        return abilityCenter.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((ConcurrentHashMap) this.d).clear();
        }
    }

    public <F extends qdb> F d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (F) ((qdb) ipChange.ipc$dispatch("e8547d73", new Object[]{this}));
        }
        return (F) this.f6793a;
    }

    public final Map<String, String> e(zre zreVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f3a3267e", new Object[]{this, zreVar});
        }
        if (zreVar instanceof sv1) {
            return ((sv1) zreVar).b();
        }
        return null;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.f6793a = new nx6();
        }
    }

    public void g(List<ir> list, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe7c8bb", new Object[]{this, list, runtimeAbilityParamArr});
        } else if (list != null) {
            for (ir irVar : list) {
                if (irVar != null) {
                    h(irVar, runtimeAbilityParamArr);
                }
            }
        }
    }

    public void i(String str, zre zreVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef058f5", new Object[]{this, str, zreVar});
        } else if (str != null && zreVar != null) {
            ((ConcurrentHashMap) this.d).put(str, zreVar);
        }
    }

    public void h(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caca842f", new Object[]{this, irVar, runtimeAbilityParamArr});
        } else if (irVar != null && (b = irVar.b()) != null) {
            zre zreVar = (zre) ((ConcurrentHashMap) this.d).get(b);
            if (zreVar != null) {
                zreVar.a(irVar, runtimeAbilityParamArr);
                if (!TextUtils.equals(UpdateItemImplementor.EVENT_TYPE, b)) {
                    String c = RuntimeUtils.c(yc4.i(runtimeAbilityParamArr));
                    if (TextUtils.isEmpty(c)) {
                        c = e28.a(runtimeAbilityParamArr);
                    }
                    UserBehaviorTracker.l(this.b, c, b, e(zreVar));
                    return;
                }
                return;
            }
            String concat = "not found handler: ".concat(b);
            if (Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sAbilityNotFoundHandlerToast))) {
                Toast.makeText(this.b, concat, 0).show();
            }
            bw7.b(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.handler.AbilityCenter.1
                {
                    put("traceId", AbilityCenter.a(AbilityCenter.this).i().c("traceId"));
                    put("itemId", AbilityCenter.a(AbilityCenter.this).i().c("requestItemId"));
                    put("isTTDetail", String.valueOf((AbilityCenter.b(AbilityCenter.this) instanceof jwj) && ((jwj) AbilityCenter.b(AbilityCenter.this)).g2()));
                }
            }, -500007, concat);
            tgh.b("AbilityCenter", concat);
        }
    }
}
