package com.alipay.mobile.verifyidentity.adapter.image;

import android.content.Context;
import com.alipay.mobile.verifyidentity.image.ImageUtil;
import com.alipay.mobile.verifyidentity.image.ImageUtilImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ImageUtilFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ImageUtilImpl f4279a;

    public static ImageUtil getImageUtil(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageUtil) ipChange.ipc$dispatch("534e5ac4", new Object[]{context});
        }
        if (f4279a == null) {
            synchronized (ImageUtilFactory.class) {
                try {
                    if (f4279a == null) {
                        f4279a = new ImageUtilImpl(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4279a;
    }
}
