package com.taobao.unit.center.sync;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import org.json.JSONObject;
import tb.ckf;
import tb.dun;
import tb.u1a;
import tb.xhv;
import tb.xyf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\u0015\u0010\u0004\u001a\u00110\u0000¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u00032\u0015\u0010\u0007\u001a\u00110\u0005¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lkotlin/ParameterName;", "name", "templateId", p1.d, "Lorg/json/JSONObject;", "jsonObject", "p2", "Ltb/xhv;", "invoke", "(ILorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final /* synthetic */ class TemplateSyncManager$checkDoSingleMakeup$1$execute$1 extends FunctionReference implements u1a<Integer, JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public TemplateSyncManager$checkDoSingleMakeup$1$execute$1(TemplateSyncManager templateSyncManager) {
        super(2, templateSyncManager);
    }

    public static /* synthetic */ Object ipc$super(TemplateSyncManager$checkDoSingleMakeup$1$execute$1 templateSyncManager$checkDoSingleMakeup$1$execute$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/sync/TemplateSyncManager$checkDoSingleMakeup$1$execute$1");
    }

    @Override // kotlin.jvm.internal.CallableReference, tb.vyf
    public final String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "remoteSingleSyncFunc";
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
        return "remoteSingleSyncFunc(ILorg/json/JSONObject;)V";
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, JSONObject jSONObject) {
        invoke(num.intValue(), jSONObject);
        return xhv.INSTANCE;
    }

    public final void invoke(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb1425a", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        ckf.h(jSONObject, "p2");
        TemplateSyncManager.access$remoteSingleSyncFunc((TemplateSyncManager) this.receiver, i, jSONObject);
    }
}
