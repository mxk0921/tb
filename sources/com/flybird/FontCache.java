package com.flybird;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FontCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Typeface> f4980a = new HashMap<>();

    public static Typeface getTypeface(Context context, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("38734174", new Object[]{context, str});
        }
        Typeface typeface = f4980a.get(str);
        if (typeface == null) {
            if (context != null) {
                try {
                    context.getResources();
                } catch (Throwable th) {
                    FBLogger.e("FontCache", "TypeFace: " + str + " can't be found, extra exception message: " + th.getMessage());
                }
            }
            if ("RareWordsFont".equals(str)) {
                IpChange ipChange2 = Platform.$ipChange;
                typeface = null;
            }
            if (typeface == null) {
                if ("DINPro".equalsIgnoreCase(str)) {
                    str2 = "AlipayNumber";
                } else {
                    str2 = str;
                }
                AssetManager assets = context.getAssets();
                typeface = Typeface.createFromAsset(assets, str2 + ".ttf");
            }
            if (typeface != null) {
                f4980a.put(str, typeface);
            }
        }
        return typeface;
    }
}
