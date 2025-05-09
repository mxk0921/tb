package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface brb {
    void a(View view, int i, String str);

    void c(View view, boolean z);

    void d(View view, int i, String str);

    ViewGroup f(View view);

    LinearLayout g(View view);

    ViewGroup h(View view);

    RecyclerView i(View view);

    View j(Context context);

    LinearLayout k(View view);

    void l(JSONObject jSONObject);

    void onPageScrollStateChanged(int i);
}
