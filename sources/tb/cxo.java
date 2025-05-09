package tb;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context == null) {
            TLog.loge("AliNewDetailExtend", "ScreenUtils", "getScreenHeight context is null!");
            return 0;
        }
        Point point = new Point();
        ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        if (context == null) {
            TLog.loge("AliNewDetailExtend", "ScreenUtils", "getScreenWidth context is null!");
            return 0;
        }
        Point point = new Point();
        ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        if (context == null) {
            TLog.loge("AliNewDetailExtend", "ScreenUtils", "getStatusBarHeight context is null!");
            return 0;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        TLog.loge("AliNewDetailExtend", "ScreenUtils", "getStatusBarHeight resourceId is null!");
        return context.getResources().getDimensionPixelSize(identifier);
    }
}
