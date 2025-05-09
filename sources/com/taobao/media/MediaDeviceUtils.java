package com.taobao.media;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import tb.ew0;
import tb.t2o;
import tb.tfb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaDeviceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile int mCoreNums = 0;
    private static volatile float mMaxCpuFreq = 0.0f;

    static {
        t2o.a(774897681);
    }

    private static boolean isCoreNumOrCpuMaxFreqEnough(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8559646c", new Object[]{new Integer(i), new Float(f)})).booleanValue();
        }
        try {
            if (mCoreNums == 0) {
                mCoreNums = ew0.h();
            }
            if (mCoreNums >= i) {
                return true;
            }
            if (Math.abs(mMaxCpuFreq) < 1.0E-6d) {
                int i2 = 0;
                while (true) {
                    if (i2 >= mCoreNums) {
                        break;
                    }
                    float t = ew0.t(ew0.g(i2)) / 1000000.0f;
                    if (t > f) {
                        mMaxCpuFreq = t;
                        break;
                    }
                    float f2 = 0.0f;
                    if (0.0f <= mMaxCpuFreq) {
                        f2 = mMaxCpuFreq;
                    }
                    mMaxCpuFreq = f2;
                    i2++;
                }
            }
            if (mCoreNums < 4) {
                return false;
            }
            if (mMaxCpuFreq <= f) {
                if (Math.abs(mMaxCpuFreq - f) >= 1.0E-6d) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "judge isCoreNumOrCpuMaxFreqEnough failed.");
            return false;
        }
    }

    public static boolean isSupportH265(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2050e03", new Object[]{str})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            float parseFloat = Float.parseFloat(str);
            if (parseFloat < 1.2f) {
                parseFloat = 1.8f;
            }
            return isCoreNumOrCpuMaxFreqEnough(6, parseFloat);
        } catch (Throwable unused) {
            return false;
        }
    }
}
