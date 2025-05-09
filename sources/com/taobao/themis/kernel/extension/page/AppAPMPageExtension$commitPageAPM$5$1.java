package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.u1a;
import tb.v4s;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class AppAPMPageExtension$commitPageAPM$5$1 extends Lambda implements u1a<String, Long, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ AppAPMPageExtension this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppAPMPageExtension$commitPageAPM$5$1(AppAPMPageExtension appAPMPageExtension) {
        super(2);
        this.this$0 = appAPMPageExtension;
    }

    public static /* synthetic */ Object ipc$super(AppAPMPageExtension$commitPageAPM$5$1 appAPMPageExtension$commitPageAPM$5$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/AppAPMPageExtension$commitPageAPM$5$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(String str, Long l) {
        invoke(str, l.longValue());
        return xhv.INSTANCE;
    }

    public final void invoke(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5588c2db", new Object[]{this, str, new Long(j)});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        AppAPMPageExtension.f(this.this$0, str, j);
    }
}
