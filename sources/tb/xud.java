package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface xud {
    void destroy();

    nkr getBuilder();

    View getContainerView();

    Context getContext();

    ViewParent getParent();

    Object getTag(int i);

    boolean isAttachedToWindow();

    boolean isDestroied();

    void onResume();

    void pageAppear();

    void renderSuccess(JSONObject jSONObject);
}
