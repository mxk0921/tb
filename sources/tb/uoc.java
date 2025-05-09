package tb;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface uoc {
    DXWidgetNode b(String str);

    JSONObject d(String str);

    void e(String str, JSONObject jSONObject);

    Pair<Rect, Boolean> f();

    View getRootView();
}
