package com.alibaba.ability.middleware;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ProfileExtractorMiddleware$Companion$isGrayVersion$2 extends Lambda implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ProfileExtractorMiddleware$Companion$isGrayVersion$2 INSTANCE = new ProfileExtractorMiddleware$Companion$isGrayVersion$2();

    public ProfileExtractorMiddleware$Companion$isGrayVersion$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(ProfileExtractorMiddleware$Companion$isGrayVersion$2 profileExtractorMiddleware$Companion$isGrayVersion$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/middleware/ProfileExtractorMiddleware$Companion$isGrayVersion$2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (tb.wsq.z0(r3, new java.lang.String[]{"."}, false, 0, 6, null).size() > 3) goto L_0x0033;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke2() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.ability.middleware.ProfileExtractorMiddleware$Companion$isGrayVersion$2.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "7560cd03"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            android.content.Context r2 = com.alibaba.ability.MegaUtils.f()
            if (r2 == 0) goto L_0x0066
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch: NameNotFoundException -> 0x0053
            java.lang.String r2 = r2.getPackageName()     // Catch: NameNotFoundException -> 0x0053
            android.content.pm.PackageInfo r2 = r3.getPackageInfo(r2, r0)     // Catch: NameNotFoundException -> 0x0053
            java.lang.String r3 = r2.versionName     // Catch: NameNotFoundException -> 0x0053
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: NameNotFoundException -> 0x0053
            if (r2 == 0) goto L_0x0035
        L_0x0033:
            r0 = 1
            goto L_0x0051
        L_0x0035:
            java.lang.String r2 = "version"
            tb.ckf.f(r3, r2)     // Catch: NameNotFoundException -> 0x0053
            java.lang.String r2 = "."
            java.lang.String[] r4 = new java.lang.String[]{r2}     // Catch: NameNotFoundException -> 0x0053
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            java.util.List r2 = tb.wsq.z0(r3, r4, r5, r6, r7, r8)     // Catch: NameNotFoundException -> 0x0053
            int r2 = r2.size()     // Catch: NameNotFoundException -> 0x0053
            r3 = 3
            if (r2 <= r3) goto L_0x0051
            goto L_0x0033
        L_0x0051:
            r1 = r0
            goto L_0x0066
        L_0x0053:
            r0 = move-exception
            tb.iih r2 = tb.iih.INSTANCE
            java.lang.String r0 = tb.sm8.b(r0)
            java.lang.String r3 = "获取版本信息失败，错误原因："
            java.lang.String r0 = r3.concat(r0)
            java.lang.String r3 = "Megability"
            r2.a(r3, r0)
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.middleware.ProfileExtractorMiddleware$Companion$isGrayVersion$2.invoke2():boolean");
    }
}
