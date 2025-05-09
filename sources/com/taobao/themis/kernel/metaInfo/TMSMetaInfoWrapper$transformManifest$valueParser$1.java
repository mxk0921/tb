package com.taobao.themis.kernel.metaInfo;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.ges;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSMetaInfoWrapper$transformManifest$valueParser$1 extends Lambda implements g1a<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ges.a $baseInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSMetaInfoWrapper$transformManifest$valueParser$1(ges.a aVar) {
        super(1);
        this.$baseInfo = aVar;
    }

    public static /* synthetic */ Object ipc$super(TMSMetaInfoWrapper$transformManifest$valueParser$1 tMSMetaInfoWrapper$transformManifest$valueParser$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/metaInfo/TMSMetaInfoWrapper$transformManifest$valueParser$1");
    }

    public final String invoke(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bed32b7", new Object[]{this, str});
        }
        ckf.g(str, "valueTemplateExpr");
        if (ckf.b(str, "${navigationUrl}")) {
            return this.$baseInfo.d();
        }
        if (ckf.b(str, "${appId}")) {
            return this.$baseInfo.j();
        }
        return null;
    }
}
