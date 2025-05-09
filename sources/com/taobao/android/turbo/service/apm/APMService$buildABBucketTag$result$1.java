package com.taobao.android.turbo.service.apm;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.qau;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltb/qau$b;", "kotlin.jvm.PlatformType", AdvanceSetting.NETWORK_TYPE, "", "invoke", "(Ltb/qau$b;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class APMService$buildABBucketTag$result$1 extends Lambda implements g1a<qau.b, CharSequence> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final APMService$buildABBucketTag$result$1 INSTANCE = new APMService$buildABBucketTag$result$1();

    public APMService$buildABBucketTag$result$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(APMService$buildABBucketTag$result$1 aPMService$buildABBucketTag$result$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/apm/APMService$buildABBucketTag$result$1");
    }

    public final CharSequence invoke(qau.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("f78b3644", new Object[]{this, bVar});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.f26640a);
        sb.append('#');
        sb.append(bVar.c);
        return sb.toString();
    }
}
