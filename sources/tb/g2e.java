package tb;

import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface g2e {
    public static final String BIZ_LIVE = "live";
    public static final String BIZ_TAB2 = "tab2";
    public static final String MODULE_COMMUNITY = "community";
    public static final String MODULE_FULL_PAGE = "fullpage";
    public static final String MODULE_LIVE = "innerlive";

    void a(String str);

    void b(String str, String str2, Map<String, Object> map, Map<String, Object> map2);

    void c(String str, String str2);

    void commitSuccess(String str, String str2, Map map);

    void d(String str, String str2);

    Map<String, String> e();

    void f(String[] strArr);

    void g(String str, String str2, String str3, Map map);

    void h(String str, List list);
}
