package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.List;
import java.util.ListIterator;
import kotlin.text.Regex;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ydv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767020);
    }

    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b8187ed", new Object[0])).booleanValue();
        }
        return f("check_entry_is_running_by_top_activity", true);
    }

    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff61e56", new Object[0])).booleanValue();
        }
        return f("degrade_draft", false);
    }

    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0730623", new Object[0])).booleanValue();
        }
        return krq.c(OrangeConfig.getInstance().getConfig("umipublish", "disable_image_browser_auto_scroll", "false"), false);
    }

    public static final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb49b7db", new Object[]{str})).booleanValue();
        }
        ckf.g(str, z9u.KEY_TAOKE_BIZSCENE);
        List<String> v = krq.v(OrangeConfig.getInstance().getConfig("umipublish", "image_music_enable_biz_scenes", ""), ",");
        ckf.f(v, "StringUtil.string2List(bizSceneArray, \",\")");
        return v.contains(str);
    }

    public static final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4205d4ef", new Object[0])).booleanValue();
        }
        return f("enable_lite_async_publish", true);
    }

    public static final boolean f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return krq.b(OrangeConfig.getInstance().getConfig("umipublish", str, ""), z);
    }

    public static final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74f4a9ae", new Object[0])).intValue();
        }
        return j("click_cooling_time", 1000);
    }

    public static final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42ec491", new Object[0]);
        }
        return m("downloader_domain_for_intercept", "gd1.alicdn.com");
    }

    public static final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480817cf", new Object[0])).intValue();
        }
        return j("draft_db_max_connections_count", 2);
    }

    public static final int j(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        return krq.i(OrangeConfig.getInstance().getConfig("umipublish", str, ""), i);
    }

    public static final int k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dea4cbec", new Object[]{str})).intValue();
        }
        ckf.g(str, "biz");
        return j(str.concat("_max_drafts_count"), 100);
    }

    public static final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71ef2a21", new Object[0])).intValue();
        }
        return j("preload_publish_params_day", 14);
    }

    public static final String m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("umipublish", str, str2);
        ckf.f(config, "OrangeConfig.getInstance…SPACE, key, defaultValue)");
        return config;
    }

    public static final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20908f07", new Object[0])).intValue();
        }
        return j("image_stroke_prefab_id", 5164046);
    }

    public static final long o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f649bb5d", new Object[0])).longValue();
        }
        return krq.k(m("image_browser_auto_scroll_time_interval", String.valueOf(3)), 3 * 1000) * 1000;
    }

    public static final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bbc064", new Object[0])).booleanValue();
        }
        return p(OrangeConfig.getInstance().getConfig("umipublish", "simple_publish_devices", "{}"));
    }

    public static final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("945be208", new Object[0])).booleanValue();
        }
        List<String> v = krq.v(OrangeConfig.getInstance().getConfig("umipublish", "recordBlackList", ""), ",");
        ckf.f(v, "StringUtil.string2List(modelStr, \",\")");
        if (v.isEmpty()) {
            return false;
        }
        return v.contains(Build.MODEL);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean u(java.lang.String r5, com.alibaba.fastjson.JSONObject r6, java.lang.String r7) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ydv.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "228a0c5"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r5 = 2
            r4[r5] = r7
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001f:
            boolean r2 = r6.containsKey(r7)
            if (r2 != 0) goto L_0x0026
            return r1
        L_0x0026:
            com.alibaba.fastjson.JSONArray r6 = r6.getJSONArray(r7)
            if (r6 == 0) goto L_0x0051
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x0033
            goto L_0x0051
        L_0x0033:
            java.util.Iterator r6 = r6.iterator()
        L_0x0037:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0051
            java.lang.Object r7 = r6.next()
            java.lang.String r2 = "*"
            boolean r2 = tb.ckf.b(r2, r7)
            if (r2 == 0) goto L_0x004a
            return r0
        L_0x004a:
            boolean r7 = tb.ckf.b(r5, r7)
            if (r7 == 0) goto L_0x0037
            return r0
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ydv.u(java.lang.String, com.alibaba.fastjson.JSONObject, java.lang.String):boolean");
    }

    public static final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b3aa5c", new Object[0])).booleanValue();
        }
        return !krq.c(OrangeConfig.getInstance().getConfig("umipublish", "video_draft_edit_degrade", "false"), false);
    }

    public static final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50a33990", new Object[0])).booleanValue();
        }
        return f("vpm_track_enable", true);
    }

    public static final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fee116c4", new Object[0])).booleanValue();
        }
        return f("preview_video_can_pause", true);
    }

    public static final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a07cd0ab", new Object[0])).booleanValue();
        }
        return f("use_short_urlparams", true);
    }

    public static final boolean t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4b13249", new Object[]{str})).booleanValue();
        }
        ckf.g(str, z9u.KEY_TAOKE_BIZSCENE);
        String config = OrangeConfig.getInstance().getConfig("umipublish", "open_record_directly_biz_scene_v2", "guangguang,x_ask_everyone");
        if (TextUtils.isEmpty(config)) {
            return false;
        }
        List<String> v = krq.v(config, ",");
        ckf.f(v, "StringUtil.string2List(bizSceneArray, \",\")");
        return v.contains(str);
    }

    public static final boolean p(String str) {
        JSONObject parseObject;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f938065a", new Object[]{str})).booleanValue();
        }
        try {
            parseObject = JSON.parseObject(str);
            str2 = Build.MODEL;
            ckf.f(str2, "Build.MODEL");
            ckf.f(parseObject, "capability");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (u(str2, parseObject, "wlst")) {
            return true;
        }
        return u(String.valueOf(Build.VERSION.SDK_INT), parseObject, "wlst-osv");
    }

    public static final boolean s(String str) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbc55db", new Object[]{str})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("umipublish", "need_degrade_warning_errors", "");
        ckf.f(config, "OrangeConfig.getInstance…rade_warning_errors\", \"\")");
        if (TextUtils.isEmpty(config)) {
            return false;
        }
        List<String> split = new Regex(",").split(config, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    list = i04.v0(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = yz3.i();
        Object[] array = list.toArray(new String[0]);
        if (array != null) {
            for (String str2 : (String[]) array) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
