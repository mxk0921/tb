package com.taobao.themis.open.packages;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import tb.acs;
import tb.d1a;
import tb.n5d;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PackageManager$starLoadAppPackage$checkCountFunction$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ n5d.a $appPackageDownloadCallback;
    public final /* synthetic */ Ref$IntRef $finishCount;
    public final /* synthetic */ int $size;
    public final /* synthetic */ PackageManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageManager$starLoadAppPackage$checkCountFunction$1(Ref$IntRef ref$IntRef, int i, PackageManager packageManager, n5d.a aVar) {
        super(0);
        this.$finishCount = ref$IntRef;
        this.$size = i;
        this.this$0 = packageManager;
        this.$appPackageDownloadCallback = aVar;
    }

    public static /* synthetic */ Object ipc$super(PackageManager$starLoadAppPackage$checkCountFunction$1 packageManager$starLoadAppPackage$checkCountFunction$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/packages/PackageManager$starLoadAppPackage$checkCountFunction$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (this.$finishCount.element >= this.$size) {
            TMSLogger.b(PackageManager.y(this.this$0), "load all package finish");
            n5d.a aVar = this.$appPackageDownloadCallback;
            if (aVar != null) {
                ((acs.a) aVar).h();
            }
        }
    }
}
