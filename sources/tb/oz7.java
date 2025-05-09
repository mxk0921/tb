package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import tb.qle;
import tb.tpu;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb/oz7;", "Ltb/mmc;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class oz7 implements mmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f25761a;

    static {
        t2o.a(918552833);
    }

    public oz7(Context context) {
        ckf.g(context, "context");
        this.f25761a = context;
    }

    @Override // tb.mmc
    public void a(PreloadTaskEntity preloadTaskEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759e161d", new Object[]{this, preloadTaskEntity});
            return;
        }
        ckf.g(preloadTaskEntity, "entity");
        cec c = ud0.Companion.c();
        ArrayList<PreloadTaskEntity.a> arrayList = preloadTaskEntity.items;
        if (arrayList != null) {
            for (PreloadTaskEntity.a aVar : arrayList) {
                Map<String, String> map = aVar.c;
                if (map != null) {
                    String str = map.get("prePicUrl");
                    String str2 = map.get("picQuality");
                    if (str2 == null) {
                        str2 = 90;
                    }
                    float f = 0.75f;
                    float c2 = mqu.Companion.c(map.get("prePicRatio"), 0.75f);
                    if (Float.compare(c2, 0.0f) != 0) {
                        f = c2;
                    }
                    if (str != null && str.length() > 0) {
                        int h = r6o.Companion.h(this.f25761a);
                        qle.b bVar = new qle.b(this.f25761a, str);
                        c.a(bVar.m("q" + str2).n(h).l((int) (h / f)).a(), null);
                        tpu.a.b(tpu.Companion, "DressUpLoadHandler", "preload image: ".concat(str), null, 4, null);
                    }
                }
            }
        }
    }
}
