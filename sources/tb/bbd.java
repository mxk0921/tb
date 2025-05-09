package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface bbd extends pad {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    int a(String str);

    void b(String str, JSONObject jSONObject);

    boolean d(String str, String str2, Object obj);

    void f(List<JSONObject> list, a aVar);

    View findItemViewByPosition(int i);

    String g(int i);

    String getContainerId();

    int[] getVisiblePositionRange();

    boolean h(int i);

    void i(String str);

    View k(ViewGroup viewGroup, JSONObject jSONObject, Object obj);

    void scrollToPositionWithOffset(int i, int i2);
}
