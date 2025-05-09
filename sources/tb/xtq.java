package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.pop.PopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.pop.IPopPoint;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xtq implements xq1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e3b f31601a;

    public xtq(e3b e3bVar) {
        this.f31601a = e3bVar;
    }

    @Override // tb.xq1
    public View a(thm thmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9eead15c", new Object[]{this, thmVar});
        }
        if (thmVar == null || this.f31601a.h().isRefreshing()) {
            return null;
        }
        int b = thmVar.b();
        if (thmVar.b() >= 0 || (b = f(thmVar.a())) >= 0) {
            return e(b, thmVar.a());
        }
        return null;
    }

    @Override // tb.xq1
    public int b(IPopData iPopData, IPopAnchorViewInfo iPopAnchorViewInfo, View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cba034ae", new Object[]{this, iPopData, iPopAnchorViewInfo, view})).intValue();
        }
        int i2 = -1;
        if (iPopData == null || iPopAnchorViewInfo == null) {
            vfm.f("PopAnchorManager ", "isValidAnchor error, pointView is null or popData is null");
            return -1;
        }
        if (!(view == null || view.getLayoutParams() == null)) {
            i2 = view.getLayoutParams().height;
        }
        if (iPopData.getPopConfig().getPointY() != 0) {
            i = iPopAnchorViewInfo.getScreenY() + iPopAnchorViewInfo.getHeight();
        } else {
            i = iPopAnchorViewInfo.getScreenY() - i2;
        }
        return i - g();
    }

    @Override // tb.xq1
    public IPopAnchorViewInfo c(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("677c86c4", new Object[]{this, view, new Integer(i)});
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        PopAnchorViewInfo popAnchorViewInfo = new PopAnchorViewInfo(iArr[0], iArr[1], view.getWidth(), view.getHeight(), i, -1);
        vfm.c("PopAnchorManager ", "getAnchorViewInfo, " + popAnchorViewInfo);
        return popAnchorViewInfo;
    }

    @Override // tb.xq1
    public IPopAnchorViewInfo d(IPopData iPopData, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("9e7ea61a", new Object[]{this, iPopData, new Integer(i)});
        }
        return c(a(new thm(iPopData)), i);
    }

    public final View e(int i, IPopData iPopData) {
        e3b e3bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c0071c9b", new Object[]{this, new Integer(i), iPopData});
        }
        IPopPoint point = iPopData.getPopConfig().getPoint();
        if (point == null || (e3bVar = this.f31601a) == null || i < 0) {
            vfm.f("PopAnchorManager ", "popConfig or service or pos is null");
            return null;
        }
        View findItemViewByPosition = e3bVar.k().findItemViewByPosition(i);
        if (findItemViewByPosition != null) {
            return TextUtils.isEmpty(point.getItemBizCode()) ? findItemViewByPosition : tcm.d(findItemViewByPosition, point.getItemBizCode());
        }
        vfm.f("PopAnchorManager ", "cardView is null");
        return null;
    }

    public final int f(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36b0f06", new Object[]{this, iPopData})).intValue();
        }
        if (iPopData == null || iPopData.getPopConfig() == null) {
            vfm.f("PopAnchorManager ", "popConfig is null");
            return -1;
        }
        IPopPoint point = iPopData.getPopConfig().getPoint();
        if (point == null) {
            vfm.f("PopAnchorManager ", "popPoint is null");
            return -1;
        }
        e3b e3bVar = this.f31601a;
        if (e3bVar != null) {
            return e3bVar.k().a(point.getSectionBizCode());
        }
        vfm.f("PopAnchorManager ", "HomePopEngine is null");
        return -1;
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5411de96", new Object[]{this})).intValue();
        }
        e3b e3bVar = this.f31601a;
        if (e3bVar == null) {
            return -1;
        }
        return e3bVar.h().c();
    }
}
