package com.taobao.tao.flexbox.layoutmanager.uikit.view;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.feature.features.internal.pullrefresh.CustomProgressBar;
import com.taobao.uikit.feature.features.internal.pullrefresh.RefreshHeadView;
import tb.akt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TNodeRefreshHeader extends TBOldRefreshHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mRefreshTriggerPercent;
    private RefreshHeadView refreshHeadView;
    private CustomProgressBar refreshProgressView;

    static {
        t2o.a(503317385);
    }

    public TNodeRefreshHeader(Context context, float f, int i) {
        super(context);
        this.mRefreshTriggerPercent = f;
        if (getRefreshView() instanceof RefreshHeadView) {
            RefreshHeadView refreshHeadView = (RefreshHeadView) getRefreshView();
            this.refreshHeadView = refreshHeadView;
            this.refreshProgressView = refreshHeadView.getProgressbar();
            setRefreshTipSize(12);
        }
        setRefreshColor(i);
    }

    public static /* synthetic */ Object ipc$super(TNodeRefreshHeader tNodeRefreshHeader, String str, Object... objArr) {
        if (str.hashCode() == 2079336650) {
            super.setProgress(((Number) objArr[0]).floatValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/uikit/view/TNodeRefreshHeader");
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader, com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setProgress(float f) {
        CustomProgressBar customProgressBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        float f2 = this.mRefreshTriggerPercent;
        if (f2 > 0.0f) {
            if (f <= f2) {
                f = 0.0f;
            } else {
                f = (f - f2) * 2.0f;
            }
        }
        if (akt.j0()) {
            TBRefreshHeader.RefreshState refreshState = this.mState;
            if (refreshState == TBRefreshHeader.RefreshState.PULL_TO_REFRESH || refreshState == TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH) {
                if (!(getMeasuredHeight() == 0 || (customProgressBar = this.refreshProgressView) == null)) {
                    customProgressBar.changeProgressBarState((int) (getMeasuredHeight() * f));
                }
                changeHeaderAlpha(f);
                return;
            }
            return;
        }
        super.setProgress(f);
    }

    public void setRefreshColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476ee2d2", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.refreshHeadView;
        if (refreshHeadView != null) {
            refreshHeadView.setRefreshViewColor(i);
        }
    }
}
