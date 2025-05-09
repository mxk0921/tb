package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w0i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MainRequestParams f30383a;
    public final List<wrm> b;

    static {
        t2o.a(912262196);
    }

    public w0i(String str, List<wrm> list) {
        this.b = list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(""));
        intent.putExtra("itemId", list.get(0).b);
        intent.putExtra(PreloadTaskEntity.SOURCE_FROM, list.get(0).d);
        intent.putExtra("isInside", list.get(0).e);
        for (Map.Entry<String, Object> entry : list.get(0).f30875a.entrySet()) {
            intent.putExtra(entry.getKey().toString(), entry.getValue().toString());
        }
        this.f30383a = new MainRequestParams(intent);
    }

    public List<wrm> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c2c777b9", new Object[]{this});
        }
        return this.b;
    }

    public MainRequestParams b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainRequestParams) ipChange.ipc$dispatch("3d16e918", new Object[]{this});
        }
        return this.f30383a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc9b48bb", new Object[]{this})).booleanValue();
        }
        for (wrm wrmVar : this.b) {
            if (wrmVar != null) {
                return TextUtils.equals(TBBuyPreloadScene.NAV, wrmVar.c);
            }
        }
        return true;
    }
}
