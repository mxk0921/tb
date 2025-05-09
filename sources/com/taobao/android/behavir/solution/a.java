package com.taobao.android.behavir.solution;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.event.BHRScrollEvent;
import com.taobao.android.behavir.solution.BHRSolution;
import java.util.HashMap;
import java.util.Map;
import tb.em1;
import tb.kq4;
import tb.kxw;
import tb.oh8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class a implements BHRSolution<HashMap<String, Object>, Map<String, Object>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "rerank";

    /* renamed from: a  reason: collision with root package name */
    public long f6440a = 0;

    static {
        t2o.a(404750392);
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ddd22b82", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5bbce6f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean g(em1 em1Var) {
        BHREvent bHREvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37d14aff", new Object[]{this, em1Var})).booleanValue();
        }
        if (em1Var instanceof kq4) {
            bHREvent = ((kq4) em1Var).d();
        } else {
            bHREvent = null;
        }
        if (bHREvent == null) {
            return false;
        }
        if (!o(em1Var)) {
            BHRSolution.Status status = BHRSolution.Status.DEVICE_NOT_SUPPORT;
            u(em1Var, status.getCode(), status.getMsg());
            return false;
        } else if (!n(em1Var)) {
            BHRSolution.Status status2 = BHRSolution.Status.BUSINESS_DEGRADE;
            u(em1Var, status2.getCode(), status2.getMsg());
            return false;
        } else if (!p(em1Var, this.f6440a)) {
            BHRSolution.Status status3 = BHRSolution.Status.CHECK_FATIGUE_FAILED;
            u(em1Var, status3.getCode(), status3.getMsg());
            return false;
        } else {
            if (bHREvent instanceof BHRScrollEvent) {
                JSONObject jSONObject = bHREvent.actionArgsJSON;
                if (!q(em1Var, j(jSONObject))) {
                    BHRSolution.Status status4 = BHRSolution.Status.SCROLL_DURATION_NOT_ENOUGH;
                    u(em1Var, status4.getCode(), status4.getMsg());
                    return false;
                }
                int[] l = l(jSONObject);
                if (!r(em1Var, l[0], l[1])) {
                    BHRSolution.Status status5 = BHRSolution.Status.SCROLL_INSTANCE_NOT_ENOUGH;
                    u(em1Var, status5.getCode(), status5.getMsg());
                    return false;
                }
            }
            if (!m(em1Var, bHREvent.toJsonObject())) {
                BHRSolution.Status status6 = BHRSolution.Status.CUSTOM_LOGIC_FAILED;
                u(em1Var, status6.getCode(), status6.getMsg());
                return false;
            }
            k();
            return true;
        }
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public Map<String, String> i(em1 em1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a0c2649", new Object[]{this, em1Var});
        }
        return null;
    }

    public final long j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7c", new Object[]{this, jSONObject})).longValue();
        }
        if (jSONObject == null) {
            return 0L;
        }
        return jSONObject.getLongValue("scrollDuration");
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f6440a = System.currentTimeMillis();
        }
    }

    public abstract boolean m(em1 em1Var, JSONObject jSONObject);

    public abstract boolean n(em1 em1Var);

    public abstract boolean o(em1 em1Var);

    public abstract boolean p(em1 em1Var, long j);

    public abstract boolean q(em1 em1Var, long j);

    public abstract boolean r(em1 em1Var, int i, int i2);

    public abstract void s(em1 em1Var, oh8 oh8Var);

    /* renamed from: t */
    public final void h(em1 em1Var, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63410a1f", new Object[]{this, em1Var, map});
            return;
        }
        if (!kxw.d(map) || !(map.get("result") instanceof Map)) {
            oh8 oh8Var = new oh8();
            oh8Var.a(String.valueOf(kxw.b(map)));
            s(em1Var, oh8Var);
        } else {
            v(em1Var, (Map) map.get("result"));
        }
        k();
    }

    public void u(em1 em1Var, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101ed99a", new Object[]{this, em1Var, new Integer(i), str});
        }
    }

    public abstract void v(em1 em1Var, Map<String, Object> map);

    public final int[] l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("13796d9d", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return new int[]{0, 0};
        }
        return new int[]{jSONObject.getIntValue("scrollEndOffsetX") - jSONObject.getIntValue("scrollStartOffsetX"), jSONObject.getIntValue("scrollEndOffsetY") - jSONObject.getIntValue("scrollStartOffsetY")};
    }
}
