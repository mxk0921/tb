package com.taobao.android.fluid.framework.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DataVersionManager$Companion$sShareSameVersionTypeList$2 extends Lambda implements d1a<List<? extends String>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DataVersionManager$Companion$sShareSameVersionTypeList$2 INSTANCE = new DataVersionManager$Companion$sShareSameVersionTypeList$2();

    public DataVersionManager$Companion$sShareSameVersionTypeList$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(DataVersionManager$Companion$sShareSameVersionTypeList$2 dataVersionManager$Companion$sShareSameVersionTypeList$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/data/DataVersionManager$Companion$sShareSameVersionTypeList$2");
    }

    @Override // tb.d1a
    public final List<? extends String> invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4c3f8768", new Object[]{this});
        }
        String orangeStringConfig = FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("shareSameVersionTypeWhiteList", "guangguang_pick,guangguang_follow_v2");
        ckf.f(orangeStringConfig, "whileList");
        return wsq.z0(orangeStringConfig, new String[]{","}, false, 0, 6, null);
    }
}
