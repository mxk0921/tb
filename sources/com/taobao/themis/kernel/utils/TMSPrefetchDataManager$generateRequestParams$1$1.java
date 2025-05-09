package com.taobao.themis.kernel.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.ds6;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "originData", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSPrefetchDataManager$generateRequestParams$1$1 extends Lambda implements g1a<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ds6 $dataProvider;
    public final /* synthetic */ TMSPrefetchDataManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSPrefetchDataManager$generateRequestParams$1$1(TMSPrefetchDataManager tMSPrefetchDataManager, ds6 ds6Var) {
        super(1);
        this.this$0 = tMSPrefetchDataManager;
        this.$dataProvider = ds6Var;
    }

    public static /* synthetic */ Object ipc$super(TMSPrefetchDataManager$generateRequestParams$1$1 tMSPrefetchDataManager$generateRequestParams$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/utils/TMSPrefetchDataManager$generateRequestParams$1$1");
    }

    public final String invoke(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bed32b7", new Object[]{this, str});
        }
        ckf.g(str, "originData");
        return TMSPrefetchDataManager.a(this.this$0, str, this.$dataProvider);
    }
}
