package com.alipay.ma.statistics.classification;

import android.text.TextUtils;
import com.alipay.ma.MaLogger;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BlurSVM {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BLUR_SVM_PARAMS = "key_blur_svm_params";
    public static final String KEY_ENABLE_BLUR_SVM = "key_enable_blur_svm";
    public static final String TAG = "BlurSVM";
    public static float i = 0.3f;
    public static boolean j = true;
    public static float k = 5.426211f;
    public static float l = 3.4279332f;
    public static float m = 7.310401f;
    public static float n = 6.2331066f;
    public static float o = 1.6728085f;
    public static float p = -5.1614676f;
    public static float q = 8.0f;
    public static float r;

    /* renamed from: a  reason: collision with root package name */
    public float f3862a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public long d = 0;
    public float e = 0.0f;
    public long f = 0;
    public boolean g = false;
    public int h = 0;

    public static boolean getEnableBlur() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e66e4d0b", new Object[0])).booleanValue();
        }
        return j;
    }

    public static void setEnableBlur(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e32a021", new Object[]{new Boolean(z)});
            return;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("setEnableBlur: ");
        sb.append(z);
        MaLogger.d(TAG, sb.toString());
        j = z;
    }

    public final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda03bf2", new Object[]{this, new Float(f)});
            return;
        }
        float f2 = this.e;
        long j2 = this.d;
        this.e = ((f2 * ((float) j2)) + f) / ((float) (j2 + 1));
        this.d = j2 + 1;
    }

    public boolean checkBlur(float f, float f2, float f3, float f4, long j2) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5357c9f2", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Long(j2)})).booleanValue();
        }
        MaLogger.d(TAG, "checkBlur: laplaceMean:" + f + ", laplaceStd:" + f2 + ", laplaceDuration:" + f3 + ", maxGrayRatio:" + f4 + ", mNoNeedCheckBlurDuration:" + this.f);
        if (f > 0.0f && f2 > 0.0f && f3 > 0.0f) {
            if (this.f3862a == 0.0f) {
                this.f3862a = f;
            }
            if (this.b == 0.0f) {
                this.b = f2;
            }
            if (Math.abs(this.f3862a - f) <= 1.0E-5f && Math.abs(this.b - f2) <= 1.0E-5f) {
                int i2 = this.h + 1;
                this.h = i2;
                if (i2 > 1) {
                    this.f += j2;
                    this.g = true;
                    MaLogger.d(TAG, "checkBlur: false return. with same laplace mean & std.");
                } else {
                    MaLogger.d(TAG, "checkBlur: false return. first no care.");
                }
                return false;
            } else if (f2 > q) {
                this.c = Math.abs(this.f3862a - f) / this.f3862a;
                this.f3862a = f;
                this.b = f2;
                MaLogger.d(TAG, "checkBlur: false return. > sClearThresholdStd:" + q);
                return false;
            } else {
                a(f3);
                float abs = Math.abs(this.f3862a - f) / this.f3862a;
                this.f3862a = f;
                this.b = f2;
                MaLogger.d(TAG, "checkBlur: laplaceMeanDiffRatio:" + abs + ", lastLaplaceMeanDiffRatio:" + this.c);
                if (f < 2.0f || f4 >= i) {
                    this.c = abs;
                    this.f += j2;
                    MaLogger.d(TAG, "checkBlur: singleColor return. laplaceMean:" + f + ", maxGrayRatio:" + f4);
                } else {
                    if (abs > 0.1f || this.c > 0.1f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.c = abs;
                    if (z) {
                        this.f += j2;
                        MaLogger.d(TAG, "checkBlur: false return. isMoving");
                        return false;
                    }
                    float f5 = (((f - k) / l) * o) + (((f2 - m) / n) * p) + r;
                    StringBuilder sb = new StringBuilder("checkBlur: result:");
                    int i3 = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
                    if (i3 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sb.append(z2);
                    MaLogger.d(TAG, sb.toString());
                    if (i3 > 0) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public float getAvgLaplaceDetectDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d99a6264", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public long getBlurCheckFrameCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cf8fa28", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public long getNoNeedCheckBlurDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d66f5451", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public int getTheSameLaplaceValueCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce120f29", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public boolean isWhetherGetTheSameLaplaceValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("968daef6", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public static void setBlurParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53b59820", new Object[]{str});
            return;
        }
        if (!TextUtils.isEmpty(str) && str.indexOf("#") >= 0) {
            try {
                String[] split = str.split("#");
                if (split != null && split.length >= 9) {
                    k = Float.valueOf(split[0]).floatValue();
                    l = Float.valueOf(split[1]).floatValue();
                    m = Float.valueOf(split[2]).floatValue();
                    n = Float.valueOf(split[3]).floatValue();
                    o = Float.valueOf(split[4]).floatValue();
                    p = Float.valueOf(split[5]).floatValue();
                    q = Float.valueOf(split[6]).floatValue();
                    r = Float.valueOf(split[7]).floatValue();
                    i = Float.valueOf(split[8]).floatValue();
                    StringBuilder sb = new StringBuilder(256);
                    sb.append("setBlurParams: sNormalMean_1=");
                    sb.append(k);
                    sb.append(",sNormalStd_1:");
                    sb.append(l);
                    sb.append(",sNormalMean_2:");
                    sb.append(m);
                    sb.append(",sNormalStd_2:");
                    sb.append(n);
                    sb.append(",sCoef1:");
                    sb.append(o);
                    sb.append(",sCoef2:");
                    sb.append(p);
                    sb.append(",sClearThresholdStd:");
                    sb.append(q);
                    sb.append(",sMargin:");
                    sb.append(r);
                    sb.append(",sSingleColorThresholdMaxGray:");
                    sb.append(i);
                    MaLogger.d(TAG, sb.toString());
                }
            } catch (Throwable unused) {
            }
        }
    }
}
