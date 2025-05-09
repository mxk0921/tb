package tb;

import android.app.Activity;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface h2e {
    void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr);

    void b(String str, String str2, String... strArr);

    Map<String, String> c(Object obj);

    void d(Object obj, String str);

    String e(Object obj);

    void f(Object obj, String str, int i, Object obj2, Object obj3, Object obj4, String... strArr);

    void g(Object obj, Map<String, String> map);

    Map<String, String> getPageAllProperties(Activity activity);

    void h(Object obj, String str);

    String[] i(Object obj);

    void j(Map<String, String> map);

    String k(Object obj);

    void pageDisAppear(Object obj);

    void updateNextPageProperties(Map<String, String> map);

    void updatePageName(Object obj, String str);

    void updatePageProperties(Object obj, Map<String, String> map);

    void updatePageUrl(Object obj, String str);
}
