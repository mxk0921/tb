package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xm6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_VIEW_TYPE = -1;

    /* renamed from: a  reason: collision with root package name */
    public final DXRootView f31470a;

    static {
        t2o.a(806355053);
    }

    public xm6(DXRootView dXRootView) {
        this.f31470a = dXRootView;
    }

    public DXRootView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("1b4f6ce2", new Object[]{this});
        }
        return this.f31470a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26e3a2ef", new Object[]{this})).intValue();
        }
        DXRootView dXRootView = this.f31470a;
        if (dXRootView == null || dXRootView.getDxTemplateItem() == null || TextUtils.isEmpty(this.f31470a.getDxTemplateItem().f7343a)) {
            return -1;
        }
        return this.f31470a.getDxTemplateItem().f7343a.hashCode();
    }
}
