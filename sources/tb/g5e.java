package tb;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface g5e {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(String str, String str2, w6v w6vVar);

        void b(r6v r6vVar);
    }

    boolean a();

    void b(Context context, JSONObject jSONObject, JSONObject jSONObject2, a aVar);

    void c(JSONArray jSONArray);

    JSONObject d();

    void e(h5e h5eVar);

    void f(Context context, String str, String str2, JSONObject jSONObject, Map<String, String> map);

    void g(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2);

    void loadMore();

    void onDestroy();
}
