package tb;

import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f28261a = 0;
    public int b;

    public int a(HardWareInfo hardWareInfo) {
        int i;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fbc5", new Object[]{this, hardWareInfo})).intValue();
        }
        int i3 = this.f28261a;
        if (i3 > 256) {
            i = 10;
        } else if (i3 >= 256) {
            i = 8;
        } else if (i3 >= 192) {
            i = 7;
        } else if (i3 >= 128) {
            i = 5;
        } else if (i3 >= 96) {
            i = 3;
        } else {
            i = 4;
        }
        int i4 = this.b;
        if (i4 >= 512) {
            i2 = 10;
        } else if (i4 >= 256) {
            i2 = 8;
        } else if (i4 >= 128) {
            i2 = 6;
        }
        return (i2 + i) / 2;
    }
}
