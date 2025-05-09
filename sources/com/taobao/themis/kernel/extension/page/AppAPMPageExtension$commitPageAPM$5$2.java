package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.f8d;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class AppAPMPageExtension$commitPageAPM$5$2 extends Lambda implements u1a<String, Object, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ f8d $this_apply;
    public final /* synthetic */ AppAPMPageExtension this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppAPMPageExtension$commitPageAPM$5$2(f8d f8dVar, AppAPMPageExtension appAPMPageExtension) {
        super(2);
        this.$this_apply = f8dVar;
        this.this$0 = appAPMPageExtension;
    }

    public static /* synthetic */ Object ipc$super(AppAPMPageExtension$commitPageAPM$5$2 appAPMPageExtension$commitPageAPM$5$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/AppAPMPageExtension$commitPageAPM$5$2");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(String str, Object obj) {
        invoke2(str, obj);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f874a5", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "key");
        ckf.g(obj, "value");
        try {
            AppAPMPageExtension.a(this.this$0, str, obj.toString());
        } catch (Exception e) {
            TMSLogger.d("APMPageExtension", e);
        }
    }
}
