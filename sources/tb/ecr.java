package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ecr implements IFestival {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502267946);
        t2o.a(503316584);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c976c", new Object[0]);
        }
        try {
            String str = cpt.d().actionBarBackgroundColor;
            if (TextUtils.isEmpty(str)) {
                str = cpt.d().skinColor;
            }
            if (str != null && str.length() > 0 && str.charAt(0) == '#') {
                return str;
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            int parseColor = Color.parseColor(str);
            String str2 = "#" + Integer.toHexString(parseColor);
            int length = str2.length();
            if (length <= 7) {
                return str2;
            }
            StringBuilder sb = new StringBuilder("#");
            int i = length - 6;
            sb.append(str2.substring(i));
            sb.append(str2.substring(1, i));
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4c13f5ea", new Object[0]);
        }
        return d().toMap();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f671d7de", new Object[0]);
        }
        return s69.e().g("global", "festivalCode");
    }

    public static IFestival.FestivalInfo d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFestival.FestivalInfo) ipChange.ipc$dispatch("b27f085e", new Object[0]);
        }
        IFestival.FestivalInfo festivalInfo = new IFestival.FestivalInfo();
        ThemeData d = cpt.d();
        boolean i = i();
        festivalInfo.isFestivalOn = i;
        if (i) {
            festivalInfo.mode = e();
            festivalInfo.color = a();
            festivalInfo.url = g();
            festivalInfo.navigationColor = d.actionBarBackgroundColor;
            festivalInfo.navigationImage = d.actionBarBackgroundImage;
            festivalInfo.statusBarStyle = d.statusBarStyle;
            festivalInfo.textColor = d.actionbarTextColor;
            festivalInfo.textColorStyle = d.naviStyle;
            festivalInfo.festivalCode = c();
        }
        festivalInfo.hasTabbarFestival = h();
        festivalInfo.naviStyle = f();
        festivalInfo.isTabbarTitleSplit = FestivalMgr.i().z();
        return festivalInfo;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a59c1ab", new Object[0])).intValue();
        }
        if (cpt.g()) {
            return 1;
        }
        if (cpt.h()) {
            return 2;
        }
        return 0;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7db8f24", new Object[0]);
        }
        return FestivalMgr.i().l("global", slo.KEY_NAVI_STYLE);
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e95e40c2", new Object[0]);
        }
        return cpt.d().skinPic;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d2e7c3e", new Object[0])).booleanValue();
        }
        return FestivalMgr.i().q();
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f39be4c", new Object[0])).booleanValue();
        }
        if (e() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival
    public IFestival.FestivalInfo t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFestival.FestivalInfo) ipChange.ipc$dispatch("56700bcd", new Object[]{this});
        }
        return d();
    }
}
