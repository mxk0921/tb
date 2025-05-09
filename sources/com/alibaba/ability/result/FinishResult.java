package com.alibaba.ability.result;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.a;
import tb.a07;
import tb.ckf;
import tb.jpu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FinishResult extends ExecuteResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Object> data;
    private final String type;

    static {
        t2o.a(144703596);
    }

    public FinishResult() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Object ipc$super(FinishResult finishResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/result/FinishResult");
    }

    @Override // com.alibaba.ability.result.ExecuteResult
    public Map<String, Object> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.data;
    }

    @Override // com.alibaba.ability.result.ExecuteResult
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }

    public FinishResult(Map<String, ? extends Object> map) {
        this(map, null, 2, null);
    }

    public /* synthetic */ FinishResult(Map map, String str, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? "result" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishResult(Map<String, ? extends Object> map, String str) {
        super(map, str, null);
        ckf.g(str, "type");
        this.data = map;
        this.type = str;
    }

    public FinishResult(boolean z) {
        this(a.k(jpu.a("result", Boolean.valueOf(z))), null, 2, null);
    }
}
