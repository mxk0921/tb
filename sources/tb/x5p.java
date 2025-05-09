package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.tbtheme.kit.ThemeData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class x5p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final x5p INSTANCE = new x5p();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31163a;

    static {
        t2o.a(815792139);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0b9892d", new Object[]{this});
        }
        return "search_local_theme";
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!f31163a) {
            f31163a = true;
            JSONObject parseObject = JSON.parseObject(o4p.p());
            String string = parseObject.getString("skinPic");
            ThemeData themeData = new ThemeData();
            themeData.skinPic = string;
            themeData.actionbarTextColor = parseObject.getString("actionBarTextColor");
            themeData.actionBarBackgroundColor = parseObject.getString(FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG);
            themeData.statusBarStyle = parseObject.getString("statusBarStyle");
            themeData.naviStyle = parseObject.getString(slo.KEY_NAVI_STYLE);
            themeData.themeLevel = "0";
            cpt.c().k("search_local_theme", themeData);
        }
    }
}
