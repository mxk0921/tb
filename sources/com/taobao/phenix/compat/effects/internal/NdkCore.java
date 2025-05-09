package com.taobao.phenix.compat.effects.internal;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import tb.xv8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class NdkCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f11468a;

    private static native int nativeBlurBitmap(Bitmap bitmap, int i, int i2, int i3);

    static {
        try {
            System.loadLibrary("EffectsCore");
            f11468a = true;
            xv8.f("Effects4Phenix", "system load lib%s.so success", "EffectsCore");
        } catch (UnsatisfiedLinkError e) {
            xv8.c("Effects4Phenix", "system load lib%s.so error=%s", "EffectsCore", e);
        }
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7f202330", new Object[]{bitmap, new Integer(i)});
        }
        if (f11468a && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            try {
                if (nativeBlurBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), i) == 0) {
                    return bitmap;
                }
            } catch (UnsatisfiedLinkError e) {
                xv8.f("Effects4Phenix", "native blur bitmap error=%s", e);
            }
        }
        return null;
    }
}
