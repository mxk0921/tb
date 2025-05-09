package com.taobao.android;

import android.app.Activity;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface AliUserTrackerInterface {
    void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr);

    void d(Object obj, String str);

    void e(String str, AliUserTrackerCT aliUserTrackerCT, String str2, String... strArr);

    Map<String, String> getPageAllProperties(Activity activity);

    void pageDisAppear(Object obj);

    void updatePageName(Object obj, String str);

    void updatePageProperties(Object obj, Map<String, String> map);
}
