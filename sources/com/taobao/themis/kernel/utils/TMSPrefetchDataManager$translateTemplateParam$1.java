package com.taobao.themis.kernel.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.ds6;
import tb.g1a;
import tb.g6i;
import tb.pg1;
import tb.tsq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/g6i;", pg1.ATOM_EXT_match, "", "invoke", "(Ltb/g6i;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSPrefetchDataManager$translateTemplateParam$1 extends Lambda implements g1a<g6i, CharSequence> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ds6 $dataProvider;
    public final /* synthetic */ String $param;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSPrefetchDataManager$translateTemplateParam$1(ds6 ds6Var, String str) {
        super(1);
        this.$dataProvider = ds6Var;
        this.$param = str;
    }

    public static /* synthetic */ Object ipc$super(TMSPrefetchDataManager$translateTemplateParam$1 tMSPrefetchDataManager$translateTemplateParam$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/utils/TMSPrefetchDataManager$translateTemplateParam$1");
    }

    public final CharSequence invoke(g6i g6iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("31725ae6", new Object[]{this, g6iVar});
        }
        ckf.g(g6iVar, pg1.ATOM_EXT_match);
        if (g6iVar.b().size() < 2) {
            return "";
        }
        String str = g6iVar.b().get(1);
        if (tsq.I(str, "queryParams", false, 2, null) || ckf.b(str, "url")) {
            return this.$dataProvider.a(str);
        }
        throw new UnsupportedOperationException("unsupported parameter: " + str + ", originParam: " + this.$param);
    }
}
