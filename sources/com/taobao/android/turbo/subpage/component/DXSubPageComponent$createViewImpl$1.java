package com.taobao.android.turbo.subpage.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.turbo.subpage.component.dx.DxContainer;
import com.taobao.android.turbo.subpage.component.dx.DxVideoControlHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "Lcom/taobao/android/dinamicx/DXResult;", "Lcom/taobao/android/dinamicx/DXRootView;", "<anonymous parameter 1>", "<anonymous parameter 2>", "Ltb/xhv;", "invoke", "(ZLcom/taobao/android/dinamicx/DXResult;Lcom/taobao/android/dinamicx/DXResult;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DXSubPageComponent$createViewImpl$1 extends Lambda implements w1a<Boolean, DXResult<DXRootView>, DXResult<DXRootView>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ DXSubPageComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXSubPageComponent$createViewImpl$1(DXSubPageComponent dXSubPageComponent) {
        super(3);
        this.this$0 = dXSubPageComponent;
    }

    public static /* synthetic */ Object ipc$super(DXSubPageComponent$createViewImpl$1 dXSubPageComponent$createViewImpl$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/DXSubPageComponent$createViewImpl$1");
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool, DXResult<DXRootView> dXResult, DXResult<DXRootView> dXResult2) {
        invoke(bool.booleanValue(), dXResult, dXResult2);
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z, DXResult<DXRootView> dXResult, DXResult<DXRootView> dXResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1c068b", new Object[]{this, new Boolean(z), dXResult, dXResult2});
            return;
        }
        DxVideoControlHelper.c s = DxVideoControlHelper.s(DXSubPageComponent.access$getContainer$p(this.this$0));
        if (s != null) {
            s.appear();
        }
        DxContainer access$getDxContainer$p = DXSubPageComponent.access$getDxContainer$p(this.this$0);
        ckf.d(access$getDxContainer$p);
        DinamicXEngine s2 = access$getDxContainer$p.s();
        if (s2 != null && DXSubPageComponent.access$getPendingParams$p(this.this$0) != null) {
            DxContainer access$getDxContainer$p2 = DXSubPageComponent.access$getDxContainer$p(this.this$0);
            ckf.d(access$getDxContainer$p2);
            s2.r("refreshUrlParams", access$getDxContainer$p2.r(), DXSubPageComponent.access$getPendingParams$p(this.this$0), null, null);
            DXSubPageComponent.access$setPendingParams$p(this.this$0, null);
        }
    }
}
