package tb;

import android.content.Intent;
import android.view.Menu;
import android.view.ViewGroup;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.component.NestedContainer;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface e2i {
    boolean a();

    void b(String str, Map<String, Object> map);

    void c(Map<String, Object> map, String str, String str2, String str3);

    void d(String str, String str2, Map<String, Object> map, String str3);

    String e();

    WXSDKInstance f();

    void g(String str, String str2);

    NestedContainer getNestedContainer(WXSDKInstance wXSDKInstance);

    String getOriginalUrl();

    String getUrl();

    void h(ViewGroup viewGroup, Map<String, Object> map, String str, String str2, String str3, String str4, String str5);

    void i(String str, String str2);

    void j();

    String k();

    void onActivityDestroy();

    void onActivityPause();

    void onActivityResult(int i, int i2, Intent intent);

    void onActivityResume();

    void onActivityStart();

    void onActivityStop();

    boolean onBackPressed();

    void onCreateOptionsMenu(Menu menu);

    void reload();

    void setRenderContainer(RenderContainer renderContainer);
}
