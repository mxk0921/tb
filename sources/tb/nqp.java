package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nqp implements p9e<FrameLayout, mqp> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f24893a;

    static {
        t2o.a(815793299);
        t2o.a(993002004);
    }

    /* renamed from: a */
    public void d(mqp mqpVar, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f40c5499", new Object[]{this, mqpVar, ykoVar});
        }
    }

    @Override // tb.p9e
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    /* renamed from: g */
    public FrameLayout t(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("59aa5e3a", new Object[]{this, context, viewGroup});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24893a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f24893a.setBackgroundColor(context.getResources().getColor(R.color.tbsearch_shop_search_bg));
        return this.f24893a;
    }

    @Override // tb.p9e
    public void init(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1470fda9", new Object[]{this, activity});
        }
    }

    /* renamed from: u */
    public FrameLayout getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d5c6a177", new Object[]{this});
        }
        return this.f24893a;
    }
}
