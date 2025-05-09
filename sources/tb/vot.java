package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ThemeInfoResult;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.GloblaNavUIConfig;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vot {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, ThemeData> f30147a = new HashMap<>();
    public final ThemeData b;

    static {
        t2o.a(464519258);
    }

    public vot() {
        ThemeData themeData = new ThemeData();
        this.b = themeData;
        themeData.skinPic = "";
        themeData.skinColor = "#FFFFFF";
        themeData.skinPendant = null;
        themeData.actionbarTextColor = "#11192D";
        themeData.actionBarBackgroundColor = "#FFFFFF";
        themeData.actionBarBackgroundImage = "";
        themeData.statusBarStyle = "0";
        themeData.naviStyle = "1";
        themeData.isComplexTexture = "false";
    }

    public static String d(FestivalMgr festivalMgr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c38528c", new Object[]{festivalMgr, str, str2});
        }
        if (!TextUtils.isEmpty(str)) {
            String l = festivalMgr.l(str, str2);
            if (!TextUtils.isEmpty(l)) {
                return l;
            }
        }
        return festivalMgr.l("mytaobao", str2);
    }

    public static ThemeData h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("eead93c", new Object[]{str});
        }
        FestivalMgr i = FestivalMgr.i();
        ThemeData themeData = new ThemeData();
        themeData.skinPic = d(i, str, "skinPic");
        themeData.skinColor = d(i, str, "skinColor");
        themeData.skinPendant = i.l(str, "skinPendant");
        themeData.actionbarTextColor = i.l("global", GloblaNavUIConfig.KEY_GLOBAL_ACTIONBAR_TEXT_COLOR);
        themeData.actionBarBackgroundColor = i.l("global", FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG);
        themeData.actionBarBackgroundImage = i.l("global", FestivalMgr.KEY_GLOBAL_ACTIONBAR_IMG);
        themeData.statusBarStyle = i.l("global", "statusBarStyle");
        themeData.naviStyle = i.l("global", slo.KEY_NAVI_STYLE);
        themeData.isComplexTexture = "true";
        return themeData;
    }

    public final ThemeData a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("58aa0a07", new Object[]{this});
        }
        ThemeData themeData = new ThemeData();
        themeData.actionbarTextColor = "#EEEEEE";
        themeData.actionBarBackgroundColor = "#111111";
        themeData.actionBarBackgroundImage = "";
        themeData.skinPic = "";
        themeData.skinColor = "#111111";
        themeData.statusBarStyle = "1";
        themeData.naviStyle = "0";
        themeData.isComplexTexture = "false";
        return themeData;
    }

    public ThemeData b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("2c3f0f63", new Object[]{this});
        }
        return this.b.clone();
    }

    public final ThemeData c(String str) {
        ThemeData themeData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("67745c8b", new Object[]{this, str});
        }
        FestivalMgr i = FestivalMgr.i();
        if (i.s()) {
            themeData = a();
            k(themeData, "3");
        } else if (i.v("global")) {
            ThemeData h = h(str);
            if (i.t()) {
                k(h, "1");
            } else {
                k(h, "2");
            }
            themeData = h;
        } else {
            themeData = null;
        }
        if (themeData == null || (TextUtils.isEmpty(themeData.skinPic) && TextUtils.isEmpty(themeData.skinColor))) {
            themeData = b();
            k(themeData, "0");
        }
        if (themeData == null) {
            themeData = new ThemeData();
        }
        TLog.loge("ThemeDataProvider", "getSkinTheme", str + themeData.skinPic);
        return themeData;
    }

    public ThemeData e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("657b58e4", new Object[]{this, str});
        }
        ThemeData c = c(str);
        if (!TextUtils.isEmpty(str) && this.f30147a.containsKey(str)) {
            c.mergeData(this.f30147a.get(str));
        }
        return c;
    }

    public ThemeInfoResult f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeInfoResult) ipChange.ipc$dispatch("619b8e26", new Object[]{this, str});
        }
        ThemeData e = e(str);
        ThemeInfoResult themeInfoResult = new ThemeInfoResult();
        themeInfoResult.actionBarBackgroundColor = e.actionBarBackgroundColor;
        themeInfoResult.actionBarBackgroundImage = e.actionBarBackgroundImage;
        themeInfoResult.actionbarTextColor = e.actionbarTextColor;
        themeInfoResult.isComplexTexture = e.isComplexTexture;
        themeInfoResult.naviStyle = e.naviStyle;
        themeInfoResult.skinColor = e.skinColor;
        themeInfoResult.skinPic = e.skinPic;
        themeInfoResult.statusBarStyle = e.statusBarStyle;
        return themeInfoResult;
    }

    public String g(String str, String str2) {
        ThemeData e;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2cd966d5", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2) || (e = e(str)) == null) {
            return null;
        }
        if ("skinPic".equalsIgnoreCase(str2)) {
            return e.skinPic;
        }
        if ("skinColor".equalsIgnoreCase(str2)) {
            return e.skinColor;
        }
        if (FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG.equalsIgnoreCase(str2)) {
            return e.actionBarBackgroundColor;
        }
        if (FestivalMgr.KEY_GLOBAL_ACTIONBAR_IMG.equalsIgnoreCase(str2)) {
            return e.actionBarBackgroundImage;
        }
        if (GloblaNavUIConfig.KEY_GLOBAL_ACTIONBAR_TEXT_COLOR.equalsIgnoreCase(str2)) {
            return e.actionbarTextColor;
        }
        if ("statusBarStyle".equalsIgnoreCase(str2)) {
            return e.statusBarStyle;
        }
        if (slo.KEY_NAVI_STYLE.equalsIgnoreCase(str2)) {
            return e.naviStyle;
        }
        if ("isDarkText".equals(str2)) {
            if ("0".equalsIgnoreCase(e.naviStyle)) {
                str3 = "false";
            } else {
                str3 = "true";
            }
            return str3;
        } else if (q92.IS_COMPLEX_TEXTURE.equalsIgnoreCase(str2)) {
            return e.isComplexTexture;
        } else {
            return null;
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc6d1b8", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f30147a.remove(str);
        }
    }

    public void j(String str, ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf6ec96", new Object[]{this, str, themeData});
        } else if (!TextUtils.isEmpty(str) && themeData != null) {
            this.f30147a.put(str, themeData);
        }
    }

    public final void k(ThemeData themeData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c985b00a", new Object[]{this, themeData, str});
        } else if (themeData != null) {
            themeData.themeLevel = str;
        }
    }
}
