package tb;

import android.content.Context;
import android.graphics.Rect;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffFloatModel;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f24181a;
    public String b;
    public Rect c;
    public String d;
    public List<LightOffItemModel> e;
    public int f;
    public List<LightOffFloatModel> g;
    public boolean h;

    static {
        t2o.a(438304840);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("from:" + this.b);
        sb.append(",transImageUrl:" + this.d);
        sb.append(",initialIndexId:" + this.f);
        if (this.c != null) {
            sb.append(",transOriginViewRect:" + this.c.toShortString());
        }
        if (this.e != null) {
            sb.append("itemModels:" + JSON.toJSONString(this.e));
        }
        return sb.toString();
    }
}
