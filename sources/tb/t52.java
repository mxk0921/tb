package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t52 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313321);
    }

    public static float b(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb1b8b1", new Object[]{intent, new Integer(i)})).floatValue();
        }
        return intent == null ? i : intent.getIntExtra("temperature", i * 10) / 10.0f;
    }

    public static float a(Intent intent, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e7fee98", new Object[]{intent, new Float(f)})).floatValue();
        }
        if (intent == null) {
            return f;
        }
        int intExtra = intent.getIntExtra(m09.TASK_TYPE_LEVEL, 0);
        int intExtra2 = intent.getIntExtra("scale", 0);
        return intExtra2 > 0 ? (intExtra * 100.0f) / intExtra2 : f;
    }
}
