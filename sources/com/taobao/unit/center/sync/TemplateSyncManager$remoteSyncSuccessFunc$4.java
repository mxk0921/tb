package com.taobao.unit.center.sync;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import org.json.JSONObject;
import tb.ckf;
import tb.dun;
import tb.g1a;
import tb.xhv;
import tb.xyf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0015\u0010\u0004\u001a\u00110\u0000¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "jsonObject", p1.d, "Ltb/xhv;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final /* synthetic */ class TemplateSyncManager$remoteSyncSuccessFunc$4 extends FunctionReference implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public TemplateSyncManager$remoteSyncSuccessFunc$4(TemplateSyncManager templateSyncManager) {
        super(1, templateSyncManager);
    }

    public static /* synthetic */ Object ipc$super(TemplateSyncManager$remoteSyncSuccessFunc$4 templateSyncManager$remoteSyncSuccessFunc$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/sync/TemplateSyncManager$remoteSyncSuccessFunc$4");
    }

    @Override // kotlin.jvm.internal.CallableReference, tb.vyf
    public final String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "remoteSyncSuccessFunc";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final xyf getOwner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xyf) ipChange.ipc$dispatch("71b3b10f", new Object[]{this});
        }
        return dun.b(TemplateSyncManager.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f15da37", new Object[]{this});
        }
        return "remoteSyncSuccessFunc(Lorg/json/JSONObject;)V";
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81eeca1f", new Object[]{this, jSONObject});
            return;
        }
        ckf.h(jSONObject, p1.d);
        TemplateSyncManager.access$remoteSyncSuccessFunc((TemplateSyncManager) this.receiver, jSONObject);
    }
}
