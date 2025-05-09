package com.alipay.android.msp.framework.helper;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VibrateHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile VibrateHelper b;

    /* renamed from: a  reason: collision with root package name */
    public Vibrator f3626a;

    public static VibrateHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VibrateHelper) ipChange.ipc$dispatch("f3dae91a", new Object[0]);
        }
        if (b == null) {
            synchronized (GlobalHelper.class) {
                try {
                    if (b == null) {
                        b = new VibrateHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (!checkoutInvalid()) {
            this.f3626a.cancel();
        }
    }

    public boolean checkoutInvalid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("995d15dc", new Object[]{this})).booleanValue();
        }
        Vibrator vibrator = this.f3626a;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return true;
        }
        return false;
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        try {
            this.f3626a = (Vibrator) context.getApplicationContext().getSystemService("vibrator");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        if (checkoutInvalid()) {
            throw new IllegalStateException("System does not have a Vibrator, or the permission is disabled.");
        }
    }

    public void vibrate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed5aa76", new Object[]{this});
        } else {
            vibrate(500L);
        }
    }

    public void vibrate(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be01b0e", new Object[]{this, new Long(j)});
        } else {
            vibrate(j, -1);
        }
    }

    public void vibrate(long j, int i) {
        boolean hasAmplitudeControl;
        VibrationEffect createOneShot;
        VibrationEffect createOneShot2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5023b9b5", new Object[]{this, new Long(j), new Integer(i)});
        } else if (!checkoutInvalid()) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (i == -1) {
                    i = -1;
                }
                hasAmplitudeControl = this.f3626a.hasAmplitudeControl();
                if (hasAmplitudeControl) {
                    Vibrator vibrator = this.f3626a;
                    createOneShot2 = VibrationEffect.createOneShot(j, i);
                    vibrator.vibrate(createOneShot2);
                    return;
                }
                Vibrator vibrator2 = this.f3626a;
                createOneShot = VibrationEffect.createOneShot(j, -1);
                vibrator2.vibrate(createOneShot);
                return;
            }
            this.f3626a.vibrate(j);
        }
    }

    public void vibrate(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502b77c5", new Object[]{this, jArr});
        } else {
            vibrate(jArr, (int[]) null);
        }
    }

    public void vibrate(long[] jArr, int[] iArr) {
        VibrationEffect createWaveform;
        VibrationEffect createWaveform2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3432993", new Object[]{this, jArr, iArr});
        } else if (!checkoutInvalid()) {
            if (Build.VERSION.SDK_INT < 26) {
                this.f3626a.vibrate(jArr, -1);
            } else if (iArr != null) {
                Vibrator vibrator = this.f3626a;
                createWaveform2 = VibrationEffect.createWaveform(jArr, iArr, -1);
                vibrator.vibrate(createWaveform2);
            } else {
                Vibrator vibrator2 = this.f3626a;
                createWaveform = VibrationEffect.createWaveform(jArr, -1);
                vibrator2.vibrate(createWaveform);
            }
        }
    }
}
