package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class p4a {
    public static float a(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int c(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float a2 = a(((i >> 16) & 255) / 255.0f);
        float a3 = a(((i >> 8) & 255) / 255.0f);
        float a4 = a((i & 255) / 255.0f);
        float a5 = a(((i2 >> 16) & 255) / 255.0f);
        float a6 = a(((i2 >> 8) & 255) / 255.0f);
        float a7 = a4 + (f * (a((i2 & 255) / 255.0f) - a4));
        return (Math.round(b(a2 + ((a5 - a2) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(b(a3 + ((a6 - a3) * f)) * 255.0f) << 8) | Math.round(b(a7) * 255.0f);
    }
}
