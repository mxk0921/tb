package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.tao.Globals;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class m1q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final m1q INSTANCE = new m1q();

    static {
        t2o.a(745538214);
    }

    @JvmStatic
    public static final int a(String str, String str2, int i) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("729a4fac", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        Integer num2 = null;
        if (str != null) {
            num = ssq.m(str);
        } else {
            num = null;
        }
        if (str2 != null) {
            num2 = ssq.m(str2);
        }
        return b(num, num2, i);
    }

    @JvmStatic
    public static final int b(Integer num, Integer num2, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88be88c4", new Object[]{num, num2, new Integer(i)})).intValue();
        }
        if (MtbGlobalEnv.A()) {
            if (MtbGlobalEnv.u() && num2 != null) {
                return num2.intValue();
            }
            if (num != null) {
                i = num.intValue();
            }
        } else if (MtbGlobalEnv.s()) {
            if (num2 != null) {
                i2 = num2.intValue() + 55;
            } else if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = i;
            }
            if (num != null) {
                i = num.intValue() + 200;
            }
            Application application = Globals.getApplication();
            if (TBDeviceUtils.a(application) == 0) {
                if (pb6.s(application) > pb6.r(application)) {
                    return i2 + 20;
                }
                return i2;
            }
        } else if (num != null) {
            i = num.intValue();
        }
        return i;
    }
}
