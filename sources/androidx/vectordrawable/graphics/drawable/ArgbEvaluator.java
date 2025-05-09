package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ArgbEvaluator implements TypeEvaluator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ArgbEvaluator sInstance = new ArgbEvaluator();

    public static ArgbEvaluator getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArgbEvaluator) ipChange.ipc$dispatch("ffe2fe55", new Object[0]);
        }
        return sInstance;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6810f25a", new Object[]{this, new Float(f), obj, obj2});
        }
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        return Integer.valueOf((Math.round(((float) Math.pow(pow + ((((float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d)) - pow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f2 + (((((intValue2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow2 + ((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow3 + (f * (((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3)), 0.45454545454545453d)) * 255.0f));
    }
}
