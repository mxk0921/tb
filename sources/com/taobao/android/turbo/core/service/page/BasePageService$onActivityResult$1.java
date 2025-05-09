package com.taobao.android.turbo.core.service.page;

import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.ieb;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/ieb;", "observer", "Ltb/xhv;", "invoke", "(Ltb/ieb;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class BasePageService$onActivityResult$1 extends Lambda implements g1a<ieb, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Intent $data;
    public final /* synthetic */ int $requestCode;
    public final /* synthetic */ int $resultCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePageService$onActivityResult$1(int i, int i2, Intent intent) {
        super(1);
        this.$requestCode = i;
        this.$resultCode = i2;
        this.$data = intent;
    }

    public static /* synthetic */ Object ipc$super(BasePageService$onActivityResult$1 basePageService$onActivityResult$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/service/page/BasePageService$onActivityResult$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(ieb iebVar) {
        invoke2(iebVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ieb iebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5184cc73", new Object[]{this, iebVar});
            return;
        }
        ckf.g(iebVar, "observer");
        iebVar.onActivityResult(this.$requestCode, this.$resultCode, this.$data);
    }
}
