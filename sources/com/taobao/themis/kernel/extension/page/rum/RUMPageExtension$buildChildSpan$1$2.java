package com.taobao.themis.kernel.extension.page.rum;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.f8d;
import tb.u1a;
import tb.uy8;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "key", "", "value", "Ltb/xhv;", "invoke", "(Ljava/lang/String;Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class RUMPageExtension$buildChildSpan$1$2 extends Lambda implements u1a<String, Object, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ uy8 $startLoadActionSpan;
    public final /* synthetic */ f8d $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RUMPageExtension$buildChildSpan$1$2(f8d f8dVar, uy8 uy8Var) {
        super(2);
        this.$this_apply = f8dVar;
        this.$startLoadActionSpan = uy8Var;
    }

    public static /* synthetic */ Object ipc$super(RUMPageExtension$buildChildSpan$1$2 rUMPageExtension$buildChildSpan$1$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/rum/RUMPageExtension$buildChildSpan$1$2");
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
        this.$startLoadActionSpan.X(str, obj.toString());
    }
}
