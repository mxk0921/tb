package tb;

import android.app.ActivityManager;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pp0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f26220a = 0.0f;
    public int b;

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8294abed", new Object[]{this, context});
        } else if (this.f26220a == 0.0f && context != null) {
            float f = 2.0f;
            try {
                String glEsVersion = ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().getGlEsVersion();
                if (glEsVersion != null) {
                    f = Float.parseFloat(glEsVersion);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.f26220a = f;
            this.b = b(f);
        }
    }

    @Deprecated
    public int b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49d338b0", new Object[]{this, new Float(f)})).intValue();
        }
        double d = f;
        int i = (d > 4.0d ? 1 : (d == 4.0d ? 0 : -1));
        if (i > 0) {
            return 10;
        }
        if (i >= 0) {
            return 9;
        }
        if (d >= 3.2d) {
            return 8;
        }
        if (d >= 3.1d) {
            return 7;
        }
        if (d >= 3.0d) {
            return 6;
        }
        if (d >= 2.0d) {
            return 3;
        }
        return 8;
    }
}
