package com.taobao.themis.uniapp.solution.extension.instance;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.uniapp.solution.extension.instance.MTOPPrefetchExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "originData", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class MTOPPrefetchExtension$generateRequestParams$2$1$1 extends Lambda implements g1a<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MTOPPrefetchExtension.b $dataProvider;
    public final /* synthetic */ MTOPPrefetchExtension this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTOPPrefetchExtension$generateRequestParams$2$1$1(MTOPPrefetchExtension mTOPPrefetchExtension, MTOPPrefetchExtension.b bVar) {
        super(1);
        this.this$0 = mTOPPrefetchExtension;
        this.$dataProvider = bVar;
    }

    public static /* synthetic */ Object ipc$super(MTOPPrefetchExtension$generateRequestParams$2$1$1 mTOPPrefetchExtension$generateRequestParams$2$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/solution/extension/instance/MTOPPrefetchExtension$generateRequestParams$2$1$1");
    }

    public final String invoke(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bed32b7", new Object[]{this, str});
        }
        ckf.g(str, "originData");
        return MTOPPrefetchExtension.y(this.this$0, str, this.$dataProvider);
    }
}
