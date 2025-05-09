package com.taobao.themis.open.packages;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.acs;
import tb.n5d;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "errorCode", "", "errorMsg", "Ltb/xhv;", "invoke", "(ILjava/lang/String;)V", "<no name provided>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PackageManager$starLoadAppPackage$failedCallback$1 extends Lambda implements u1a<Integer, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$BooleanRef $alreadyFailed;
    public final /* synthetic */ n5d.a $appPackageDownloadCallback;
    public final /* synthetic */ PackageManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageManager$starLoadAppPackage$failedCallback$1(PackageManager packageManager, Ref$BooleanRef ref$BooleanRef, n5d.a aVar) {
        super(2);
        this.this$0 = packageManager;
        this.$alreadyFailed = ref$BooleanRef;
        this.$appPackageDownloadCallback = aVar;
    }

    public static /* synthetic */ Object ipc$super(PackageManager$starLoadAppPackage$failedCallback$1 packageManager$starLoadAppPackage$failedCallback$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/packages/PackageManager$starLoadAppPackage$failedCallback$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
        invoke(num.intValue(), str);
        return xhv.INSTANCE;
    }

    public final void invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5563eae", new Object[]{this, new Integer(i), str});
            return;
        }
        String y = PackageManager.y(this.this$0);
        TMSLogger.b(y, "loadPackage error : " + i + ", " + ((Object) str));
        PackageManager packageManager = this.this$0;
        Ref$BooleanRef ref$BooleanRef = this.$alreadyFailed;
        n5d.a aVar = this.$appPackageDownloadCallback;
        synchronized (packageManager) {
            if (!ref$BooleanRef.element) {
                ref$BooleanRef.element = true;
                if (aVar != null) {
                    ((acs.a) aVar).g(i, str);
                    xhv xhvVar = xhv.INSTANCE;
                }
            }
        }
    }
}
