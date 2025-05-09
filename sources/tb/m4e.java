package tb;

import android.app.Activity;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface m4e {
    void a(Object obj);

    Map<String, String> c(Object obj);

    Map<String, String> getPageAllProperties(Activity activity);

    void pageAppear(Object obj);

    void pageDisAppear(Object obj);

    void skipPage(Object obj);

    void track4Click(String str, String str2, Map<String, String> map);

    void track4Click(String str, String str2, String... strArr);

    void track4Show(String str, String str2, Map<String, String> map);

    void trackCustom(String str, int i, String str2, String str3, String str4, Map<String, String> map);

    void trackCustom(String str, String str2, Map<String, String> map);

    void updateNextPageProperties(Map<String, String> map);

    void updateNextPageUtParam(Map<String, String> map);

    void updatePageName(Object obj, String str);

    void updatePageProperties(Object obj, Map<String, String> map);

    void updatePageUtparam(Object obj, String str);
}
