package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.setting.item.PaySettingItemViewHolder;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cv9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FontSizeAdapter";

    /* renamed from: a  reason: collision with root package name */
    public static cv9 f17347a;

    public static cv9 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cv9) ipChange.ipc$dispatch("e5da1cc7", new Object[0]);
        }
        if (f17347a == null) {
            synchronized (cv9.class) {
                try {
                    if (f17347a == null) {
                        f17347a = new cv9();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17347a;
    }

    public void b(w7c w7cVar, Context context) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0adb74", new Object[]{this, w7cVar, context});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("fontSizeSetting", "open", "true");
        if (!(yu9.a() || TextUtils.equals(config, "true"))) {
            return;
        }
        if (w7cVar == null || context == null) {
            Log.e(TAG, "updateFontSize: params is null!");
            return;
        }
        PaySettingItemViewHolder paySettingItemViewHolder = (PaySettingItemViewHolder) w7cVar;
        List<TextView> z2 = paySettingItemViewHolder.z2();
        if (z2 == null) {
            Log.e(TAG, "updateFontSize: There is no TextView that needs to change font size!");
            return;
        }
        int a2 = wu9.a(context);
        int a3 = paySettingItemViewHolder.a3();
        if (a2 != a3) {
            float[] fArr = wu9.fontSizeFactors;
            float f = fArr[a2] / fArr[a3];
            for (TextView textView : z2) {
                if (textView != null) {
                    textView.setTextSize(2, (textView.getTextSize() / context.getResources().getDisplayMetrics().scaledDensity) * f);
                }
            }
            paySettingItemViewHolder.w1(a2);
            List<ViewGroup> Z0 = paySettingItemViewHolder.Z0();
            if (Z0 != null) {
                for (ViewGroup viewGroup : Z0) {
                    if (!(viewGroup == null || (layoutParams = viewGroup.getLayoutParams()) == null)) {
                        layoutParams.height = (int) (layoutParams.height * f);
                        viewGroup.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }
}
