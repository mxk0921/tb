package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h5o {

    /* renamed from: a  reason: collision with root package name */
    public final DetailDataManager.f f20425a;
    public final DetailDataManager.f b;
    public JSONObject h;
    public String j;
    public RecRequestParamsV2 k;
    public final DetailDataManager.LimitedQueue<String> c = new DetailDataManager.LimitedQueue<>(100);
    public final DetailDataManager.LimitedQueue<String> d = new DetailDataManager.LimitedQueue<>(50);
    public final DetailDataManager.LimitedQueue<String> e = new DetailDataManager.LimitedQueue<>(100);
    public final DetailDataManager.LimitedQueue<mp8> f = new DetailDataManager.LimitedQueue<>(100);
    public int g = 1;
    public final JSONObject i = new JSONObject();

    static {
        t2o.a(352322202);
    }

    public h5o() {
        DetailDataManager.f fVar = new DetailDataManager.f();
        this.f20425a = fVar;
        DetailDataManager.f fVar2 = new DetailDataManager.f();
        this.b = fVar2;
        fVar.f7119a = -1;
        fVar2.f7119a = -1;
    }
}
