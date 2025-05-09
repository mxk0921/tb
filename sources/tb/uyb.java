package tb;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface uyb {
    View createView(Context context);

    JSONObject getSubTabSearchBoxData();

    String getUpdatePageName();

    Map<String, String> getUpdatePageProperties();

    String getUpdatePageUtParam();

    boolean isEnablePullReFresh();

    boolean isOnRocketState();

    void notifyOutLinkParams(Intent intent, String str);

    void onClickRocket();

    void onDestroy();

    void onPageSelected();

    void onPullRefresh();

    void onResume();
}
