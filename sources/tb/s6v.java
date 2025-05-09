package tb;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.g5e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class s6v implements g5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(153092136);
        t2o.a(153092122);
    }

    @Override // tb.g5e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7032815b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.g5e
    public void b(Context context, JSONObject jSONObject, JSONObject jSONObject2, g5e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f6af9", new Object[]{this, context, jSONObject, jSONObject2, aVar});
        } else {
            aVar.a("-1", "unknow error", null);
        }
    }

    @Override // tb.g5e
    public void c(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44db4871", new Object[]{this, jSONArray});
        }
    }

    @Override // tb.g5e
    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c47bf40a", new Object[]{this});
        }
        return null;
    }

    @Override // tb.g5e
    public void e(h5e h5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6151a2f", new Object[]{this, h5eVar});
        }
    }

    @Override // tb.g5e
    public void f(Context context, String str, String str2, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271120ba", new Object[]{this, context, str, str2, jSONObject, map});
        }
    }

    @Override // tb.g5e
    public void g(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656015b", new Object[]{this, linearLayout, recyclerView, linearLayout2});
        }
    }

    @Override // tb.g5e
    public void loadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
        }
    }

    @Override // tb.g5e
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }
}
