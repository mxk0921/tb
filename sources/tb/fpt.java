package tb;

import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.GloblaNavUIConfig;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fpt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f19458a = -1;
    public static int b;

    static {
        t2o.a(464519270);
    }

    public static ThemeData a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("6fa7bdbd", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        ThemeData themeData = new ThemeData();
        themeData.actionbarTextColor = jSONObject.getString(GloblaNavUIConfig.KEY_GLOBAL_ACTIONBAR_TEXT_COLOR);
        themeData.actionBarBackgroundImage = jSONObject.getString(FestivalMgr.KEY_GLOBAL_ACTIONBAR_IMG);
        themeData.actionBarBackgroundColor = jSONObject.getString(FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG);
        themeData.skinPic = jSONObject.getString("skinPic");
        themeData.skinColor = jSONObject.getString("skinColor");
        themeData.skinPendant = jSONObject.getString("skinPendant");
        themeData.statusBarStyle = jSONObject.getString("statusBarStyle");
        themeData.naviStyle = jSONObject.getString(slo.KEY_NAVI_STYLE);
        themeData.isComplexTexture = jSONObject.getString(q92.IS_COMPLEX_TEXTURE);
        themeData.themeLevel = jSONObject.getString("themeLevel");
        return themeData;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        if (f19458a < 0) {
            c();
        }
        return f19458a;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9aa2585", new Object[0]);
            return;
        }
        DisplayMetrics displayMetrics = Globals.getApplication().getResources().getDisplayMetrics();
        String str = Build.DEVICE;
        if (str.equalsIgnoreCase("mx2")) {
            b = 96;
        }
        Configuration configuration = Globals.getApplication().getResources().getConfiguration();
        if (str.equalsIgnoreCase("mx2")) {
            b = 96;
        }
        if (configuration.orientation == 2) {
            f19458a = displayMetrics.widthPixels - b;
        } else {
            f19458a = displayMetrics.heightPixels - b;
        }
    }
}
