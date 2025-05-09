package tb;

import android.content.Context;
import android.graphics.Paint;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int SCREEN_WIDTH = ((WindowManager) Globals.getApplication().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth();
    public static final int SCREEN_HEIGHT = ((WindowManager) Globals.getApplication().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getHeight();

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * Globals.getApplication().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97ddce7a", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        if (str.length() > 1) {
            try {
            } catch (Exception unused) {
                return 0;
            }
        }
        return (-16777216) | Integer.parseInt(str.substring(1), 16);
    }

    public static String c(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2fdcb6f", new Object[]{context, new Integer(i)});
        }
        if (i < 0 || context == null) {
            return "";
        }
        return context.getResources().getString(i);
    }

    public static final void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b2e41", new Object[]{context, str});
            return;
        }
        TBToast makeText = TBToast.makeText(Globals.getApplication(), "", 3000L);
        makeText.setText(str);
        makeText.show();
    }

    public static final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{str});
        } else {
            d(null, str);
        }
    }

    static {
        t2o.a(759169070);
        ImageStrategyConfig.v(ImageStrategyConfig.WEITAO, 86).a();
        new Paint();
    }
}
