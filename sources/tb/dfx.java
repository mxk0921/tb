package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.pop.PopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dfx implements xq1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f17779a;
    public final IPopAnchorViewInfo b = e(0);

    public dfx(View view) {
        this.f17779a = view;
    }

    @Override // tb.xq1
    public View a(thm thmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9eead15c", new Object[]{this, thmVar});
        }
        return this.f17779a;
    }

    @Override // tb.xq1
    public int b(IPopData iPopData, IPopAnchorViewInfo iPopAnchorViewInfo, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cba034ae", new Object[]{this, iPopData, iPopAnchorViewInfo, view})).intValue();
        }
        return this.b.getHeight();
    }

    @Override // tb.xq1
    public IPopAnchorViewInfo c(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("677c86c4", new Object[]{this, view, new Integer(i)});
        }
        return this.b;
    }

    @Override // tb.xq1
    public IPopAnchorViewInfo d(IPopData iPopData, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("9e7ea61a", new Object[]{this, iPopData, new Integer(i)});
        }
        return this.b;
    }

    public final IPopAnchorViewInfo e(int i) {
        Context context;
        int width;
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("95ef2e75", new Object[]{this, new Integer(i)});
        }
        View view = this.f17779a;
        if (view == null || (context = view.getContext()) == null) {
            return null;
        }
        View view2 = this.f17779a;
        if (view2 == null) {
            width = pb6.s(context);
        } else {
            width = view2.getWidth();
        }
        View view3 = this.f17779a;
        if (view3 == null) {
            height = pb6.r(context);
        } else {
            height = view3.getHeight();
        }
        return new PopAnchorViewInfo(0, 0, width, height, i, 0);
    }
}
