package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DisplayManagerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private final Context mContext;

    private DisplayManagerCompat(Context context) {
        this.mContext = context;
    }

    public static DisplayManagerCompat getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayManagerCompat) ipChange.ipc$dispatch("8d754690", new Object[]{context});
        }
        return new DisplayManagerCompat(context);
    }

    public Display getDisplay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Display) ipChange.ipc$dispatch("626ba5dd", new Object[]{this, new Integer(i)});
        }
        return ((DisplayManager) this.mContext.getSystemService("display")).getDisplay(i);
    }

    public Display[] getDisplays() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Display[]) ipChange.ipc$dispatch("a696f5ca", new Object[]{this}) : ((DisplayManager) this.mContext.getSystemService("display")).getDisplays();
    }

    public Display[] getDisplays(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Display[]) ipChange.ipc$dispatch("32eb6c94", new Object[]{this, str}) : ((DisplayManager) this.mContext.getSystemService("display")).getDisplays();
    }
}
