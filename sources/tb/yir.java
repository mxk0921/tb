package tb;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.service.TppParamFeedInfo;
import com.taobao.taolive.sdk.controller.BaseListAdapter;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class yir {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092931);
    }

    public abstract void A(String str, long j, boolean z, long j2, String str2);

    public abstract void a(JSONObject jSONObject);

    public abstract RecModel b();

    public abstract RecModel c();

    public abstract void d(String str, String str2, Map<String, String> map, String str3);

    public abstract void e();

    public abstract RecModel f();

    public abstract Map<String, String> g();

    public abstract Map<String, String> h();

    public abstract int i();

    public abstract RecModel j();

    public abstract JSONArray k();

    public abstract ArrayList<TppParamFeedInfo> l();

    public abstract void m();

    public abstract void n(String str, String str2, String str3, HashMap<String, String> hashMap);

    public abstract void o(VideoInfo videoInfo);

    public abstract void p(RecModel recModel);

    public abstract void q(int i);

    public abstract void r();

    public abstract void s();

    public abstract void t(Context context);

    public abstract void u(int i);

    public abstract void v(BaseListAdapter baseListAdapter);

    public abstract void w(String str);

    public abstract void x(int i);

    public abstract void y(RecyclerView recyclerView);

    public abstract void z();
}
