package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb/sfr;", "Ltb/qjc;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "tbi_uniContainer_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class sfr implements qjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f28020a;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f28021a;

        public a(List list) {
            this.f28021a = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (na4 na4Var : this.f28021a) {
                na4Var.a();
            }
        }
    }

    static {
        t2o.a(804257804);
        t2o.a(803209234);
    }

    public sfr(Context context) {
        ckf.g(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28020a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // tb.qjc
    public void a(List<? extends na4<?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b7e5a2", new Object[]{this, list});
            return;
        }
        ckf.g(list, "components");
        this.f28020a.removeAllViews();
        Iterator<? extends na4<?>> it = list.iterator();
        while (it.hasNext()) {
            this.f28020a.addView(((na4) it.next()).d(), new FrameLayout.LayoutParams(-1, -1));
        }
        this.f28020a.post(new a(list));
    }

    @Override // tb.qjc
    public ViewGroup getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        return this.f28020a;
    }
}
