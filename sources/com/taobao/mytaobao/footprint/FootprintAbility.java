package com.taobao.mytaobao.footprint;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsFootprintAbility;
import com.taobao.android.abilityidl.ability.FootprintRecord;
import com.taobao.android.abilityidl.ability.FootprintResult;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.iv9;
import tb.jv9;
import tb.kdb;
import tb.t2o;
import tb.z7c;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/taobao/mytaobao/footprint/FootprintAbility;", "Lcom/taobao/android/abilityidl/ability/AbsFootprintAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/iv9;", "params", "Ltb/z7c;", "callback", "Ltb/xhv;", "requestFootprintList", "(Ltb/kdb;Ltb/iv9;Ltb/z7c;)V", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class FootprintAbility extends AbsFootprintAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537708);
    }

    public static /* synthetic */ Object ipc$super(FootprintAbility footprintAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/footprint/FootprintAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFootprintAbility
    public void requestFootprintList(kdb kdbVar, iv9 iv9Var, z7c z7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884cef6a", new Object[]{this, kdbVar, iv9Var, z7cVar});
            return;
        }
        ckf.h(kdbVar, "context");
        ckf.h(iv9Var, "params");
        ckf.h(z7cVar, "callback");
        if (ckf.b(iv9Var.f21598a, "SHOP")) {
            LinkedHashMap<String, Long> l = jv9.INSTANCE.l();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Long> entry : l.entrySet()) {
                FootprintRecord footprintRecord = new FootprintRecord();
                footprintRecord.id = entry.getKey();
                footprintRecord.timestamp = entry.getValue().longValue();
                arrayList.add(footprintRecord);
            }
            FootprintResult footprintResult = new FootprintResult();
            footprintResult.records = arrayList;
            z7cVar.s(footprintResult);
            TLog.loge("FootprintAbility", "get shop footprint list: " + arrayList.size());
        } else if (ckf.b(iv9Var.f21598a, "GOODS")) {
            LinkedHashMap<String, Long> k = jv9.INSTANCE.k();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, Long> entry2 : k.entrySet()) {
                FootprintRecord footprintRecord2 = new FootprintRecord();
                footprintRecord2.id = entry2.getKey();
                footprintRecord2.timestamp = entry2.getValue().longValue();
                arrayList2.add(footprintRecord2);
            }
            FootprintResult footprintResult2 = new FootprintResult();
            footprintResult2.records = arrayList2;
            z7cVar.s(footprintResult2);
            TLog.loge("FootprintAbility", "get goods footprint list: " + arrayList2.size());
        }
    }
}
