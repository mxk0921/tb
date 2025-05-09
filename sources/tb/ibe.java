package tb;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.bridge.EventResult;
import com.taobao.weex.bridge.INativeInvoker;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.ui.component.NestedContainer;
import com.taobao.weex.ui.component.WXComponent;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ibe extends yae {
    void OnVSync();

    WXSDKInstance createNestedInstance(NestedContainer nestedContainer);

    void destroy();

    void fireEvent(String str, String str2, Map<String, Object> map, Map<String, Object> map2, List<Object> list, EventResult eventResult);

    void fireModuleEvent(String str, WXModule wXModule, Map<String, Object> map);

    String getBundleUrl();

    View getContainerView();

    Context getContext();

    INativeInvoker getNativeInvokeHelper();

    int getRenderContainerPaddingLeft();

    int getRenderContainerPaddingTop();

    WXComponent getRootComponent();

    View getRootView();

    int getWeexHeight();

    int getWeexWidth();

    void init(Context context);

    void moveFixedView(View view);

    void onActivityResult(int i, int i2, Intent intent);

    boolean onBackPressed();

    void onCreateFinish();

    boolean onCreateOptionsMenu(Menu menu);

    void onInstanceReady();

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void onRootCreated(WXComponent wXComponent);

    void onViewAppear();

    void onViewDisappear();

    void refreshInstance(String str);

    void registerRenderListener(gbe gbeVar);

    void reloadPage(boolean z);

    void removeFixedView(View view);

    void renderByUrlInternal(String str, String str2, Map<String, Object> map, String str3, WXRenderStrategy wXRenderStrategy);

    void renderInternal(String str, String str2, Map<String, Object> map, String str3, WXRenderStrategy wXRenderStrategy);

    void renderInternal(String str, nxo nxoVar, Map<String, Object> map, String str2, WXRenderStrategy wXRenderStrategy);

    void setContext(Context context);

    void setRenderContainer(RenderContainer renderContainer);

    void setSize(int i, int i2);

    void setUseSandBox(boolean z);
}
