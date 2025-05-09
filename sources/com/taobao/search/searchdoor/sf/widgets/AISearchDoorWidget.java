package com.taobao.search.searchdoor.sf.widgets;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.AISearchDoorWidget;
import com.taobao.search.sf.uikit.SearchInsetFrameLayout;
import com.taobao.taobao.R;
import tb.ckf;
import tb.d1a;
import tb.njg;
import tb.o2p;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class AISearchDoorWidget extends o2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final njg z;

    static {
        t2o.a(815793098);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AISearchDoorWidget(final Activity activity, ude udeVar) {
        super(activity, udeVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        R2();
        this.z = kotlin.a.b(new d1a() { // from class: tb.h25
            @Override // tb.d1a
            public final Object invoke() {
                FrameLayout b;
                b = AISearchDoorWidget.b(activity);
                return b;
            }
        });
    }

    public static final FrameLayout b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f4abdc1", new Object[]{activity});
        }
        ckf.g(activity, "$activity");
        return (FrameLayout) activity.findViewById(R.id.fl_atmosphere);
    }

    public static /* synthetic */ Object ipc$super(AISearchDoorWidget aISearchDoorWidget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/AISearchDoorWidget");
    }

    public final FrameLayout D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("fad55150", new Object[]{this});
        }
        return (FrameLayout) this.z.getValue();
    }

    @Override // tb.o2p
    public boolean e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c2d38c9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.o2p
    public void l3() {
        SearchInsetFrameLayout searchInsetFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59531c77", new Object[]{this});
            return;
        }
        ROOT_VIEW view = this.e.getView();
        if (view instanceof SearchInsetFrameLayout) {
            searchInsetFrameLayout = (SearchInsetFrameLayout) view;
        } else {
            searchInsetFrameLayout = null;
        }
        if (searchInsetFrameLayout != null) {
            searchInsetFrameLayout.clearPaddingTop();
        }
        this.e.hideBackButton();
    }

    @Override // tb.o2p
    public void I2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8498bc9b", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        D3().addView(view, 0);
    }
}
