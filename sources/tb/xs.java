package tb;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class xs implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public qh f31569a;
    public AURAGlobalData b;

    static {
        t2o.a(301989952);
        t2o.a(144703491);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e4e639", new Object[]{this});
        } else if (this.f31569a == null) {
            throw new IllegalArgumentException("AURADXUserContext can not null!!");
        }
    }

    public lo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("5d10ae7d", new Object[]{this});
        }
        a();
        return this.f31569a.l();
    }

    public Object[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("60d4303b", new Object[]{this});
        }
        a();
        return this.f31569a.f();
    }

    public AURAGlobalData d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("3078f400", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.b;
        if (aURAGlobalData != null) {
            return aURAGlobalData;
        }
        a();
        AURAGlobalData aURAGlobalData2 = (AURAGlobalData) fk.b(this.f31569a.h(), "adamAuraGlobalData", AURAGlobalData.class, null);
        this.b = aURAGlobalData2;
        return aURAGlobalData2;
    }

    public AURARenderComponent e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("659b1b43", new Object[]{this});
        }
        a();
        return this.f31569a.k();
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ?> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        Object userContext = kdbVar.getUserContext();
        if (!(userContext instanceof tk6)) {
            return new ErrorResult("AliBuy_00001", "userContextObj is not DXUIAbilityRuntimeContext type");
        }
        DXRuntimeContext p = ((tk6) userContext).p();
        if (p == null) {
            return new ErrorResult("AliBuy_00002", "dxRuntimeContext is null");
        }
        Object q = p.q();
        if (!(q instanceof qh)) {
            return new ErrorResult("AliBuy_00003", "contextObj is not AURADXUserContext type");
        }
        this.f31569a = (qh) q;
        return f((JSONObject) map, vqVar);
    }

    public abstract ExecuteResult f(JSONObject jSONObject, vq vqVar);
}
