package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.ShowcaseType;
import com.taobao.taolive.sdk.model.common.LiveItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gwp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f20272a;
    public final ShowcaseType b;
    public final LiveItem c;

    static {
        t2o.a(295699113);
    }

    public gwp(LiveItem liveItem, long j, ShowcaseType showcaseType) {
        this.c = liveItem;
        this.f20272a = j;
        this.b = showcaseType;
    }

    public LiveItem a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem) ipChange.ipc$dispatch("d7d22e95", new Object[]{this});
        }
        return this.c;
    }

    public gwp(LiveItem liveItem) {
        this.c = liveItem;
        this.f20272a = liveItem.itemId;
        if (y6p.b(liveItem)) {
            this.b = ShowcaseType.TYPE_SECKILL;
        } else {
            this.b = ShowcaseType.TYPE_NORMAL;
        }
    }
}
