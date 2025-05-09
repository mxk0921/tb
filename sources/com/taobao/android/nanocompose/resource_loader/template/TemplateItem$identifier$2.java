package com.taobao.android.nanocompose.resource_loader.template;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TemplateItem$identifier$2 extends Lambda implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TemplateItem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateItem$identifier$2(TemplateItem templateItem) {
        super(0);
        this.this$0 = templateItem;
    }

    public static /* synthetic */ Object ipc$super(TemplateItem$identifier$2 templateItem$identifier$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/resource_loader/template/TemplateItem$identifier$2");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
        }
        return this.this$0.c() + '_' + this.this$0.e();
    }
}
