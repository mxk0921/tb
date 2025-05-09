package tb;

import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f31596a = 0;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fbc5", new Object[]{this, hardWareInfo})).intValue();
        }
        long j = this.f31596a;
        if (j >= 6144) {
            return 10;
        }
        if (j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            return 9;
        }
        if (j >= 3072) {
            return 7;
        }
        if (j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
            return 5;
        }
        if (j >= 1024) {
            return 3;
        }
        if (j >= 512) {
            return 1;
        }
        return 8;
    }
}
