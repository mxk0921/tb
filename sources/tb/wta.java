package tb;

import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f30912a = 48;
    public int b = 48;

    public int a(HardWareInfo hardWareInfo) {
        int i;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fbc5", new Object[]{this, hardWareInfo})).intValue();
        }
        if (this.f30912a <= 0) {
            this.f30912a = 48;
        }
        if (this.b <= 0) {
            this.b = 24;
        }
        int i3 = this.f30912a;
        if (i3 >= 220) {
            i = 10;
        } else if (i3 >= 100) {
            i = 9;
        } else {
            if (i3 < 80) {
                if (i3 >= 48) {
                    i = 6;
                } else if (i3 >= 24) {
                    i = 5;
                } else if (i3 >= 10) {
                    i = 2;
                } else if (i3 >= 5) {
                    i = 1;
                }
            }
            i = 8;
        }
        int i4 = (this.b * 100) / i3;
        if (i4 >= 80) {
            i2 = 10;
        } else if (i4 >= 70) {
            i2 = 9;
        } else if (i4 >= 60) {
            i2 = 8;
        } else if (i4 >= 50) {
            i2 = 7;
        } else if (i4 >= 40) {
            i2 = 6;
        } else if (i4 >= 30) {
            i2 = 5;
        } else if (i4 >= 20) {
            i2 = 4;
        } else if (i4 >= 10) {
            i2 = 3;
        } else if (i4 >= 5) {
            i2 = 2;
        } else if (i4 < 1) {
            i2 = 0;
        }
        return (i + i2) / 2;
    }
}
