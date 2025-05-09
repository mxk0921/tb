package tb;

import android.app.Application;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.Constants;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k5f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public k5f(String str) {
        super(str);
        i(true);
    }

    public static /* synthetic */ Object ipc$super(k5f k5fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitScreenConfig");
    }

    @Override // tb.mss
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        new z5f().b(application, hashMap);
        Resources resources = application.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Build.DEVICE.equalsIgnoreCase("mx2")) {
            Constants.SCREEN_HEIGHT_OFFSET = 96;
        }
        if (resources.getConfiguration().orientation == 2) {
            int i = displayMetrics.heightPixels;
            Constants.half_screen_width = i / 2;
            Constants.screen_density = displayMetrics.density;
            Constants.screen_width = i;
            Constants.screen_height = displayMetrics.widthPixels - Constants.SCREEN_HEIGHT_OFFSET;
            Constants.screen_widthmul2 = Constants.screen_width * 2;
            return;
        }
        int i2 = displayMetrics.widthPixels;
        Constants.half_screen_width = i2 / 2;
        Constants.screen_density = displayMetrics.density;
        Constants.screen_width = i2;
        Constants.screen_height = displayMetrics.heightPixels - Constants.SCREEN_HEIGHT_OFFSET;
        Constants.screen_widthmul2 = Constants.screen_width * 2;
    }
}
