package com.taobao.android.dinamicx.widget.refresh.layout.constant;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum DXRefreshState {
    None(0, false, false, false, false, false),
    PullDownToRefresh(1, true, false, false, false, false),
    PullUpToLoad(2, true, false, false, false, false),
    PullDownCanceled(1, false, false, false, false, false),
    PullUpCanceled(2, false, false, false, false, false),
    ReleaseToRefresh(1, true, false, false, false, true),
    ReleaseToLoad(2, true, false, false, false, true),
    ReleaseToTwoLevel(1, true, false, false, true, true),
    TwoLevelReleased(1, false, false, false, true, false),
    RefreshReleased(1, false, false, false, false, false),
    LoadReleased(2, false, false, false, false, false),
    Refreshing(1, false, true, false, false, false),
    Loading(2, false, true, false, false, false),
    TwoLevel(1, false, true, false, true, false),
    RefreshFinish(1, false, false, true, false, false),
    LoadFinish(2, false, false, true, false, false),
    TwoLevelFinish(1, false, false, true, true, false),
    PullDownLoading(1, false, true, false, false, false),
    PullDownLoadFail(1, false, true, false, false, false),
    PullDownLoadNoData(1, false, true, false, false, false);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean isDragging;
    public final boolean isFinishing;
    public final boolean isFooter;
    public final boolean isHeader;
    public final boolean isOpening;
    public final boolean isReleaseToOpening;
    public final boolean isTwoLevel;

    DXRefreshState(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7 = false;
        if (i == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.isHeader = z6;
        this.isFooter = i == 2 ? true : z7;
        this.isDragging = z;
        this.isOpening = z2;
        this.isFinishing = z3;
        this.isTwoLevel = z4;
        this.isReleaseToOpening = z5;
    }

    public static /* synthetic */ Object ipc$super(DXRefreshState dXRefreshState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/refresh/layout/constant/DXRefreshState");
    }

    public static DXRefreshState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshState) ipChange.ipc$dispatch("2e070aae", new Object[]{str});
        }
        return (DXRefreshState) Enum.valueOf(DXRefreshState.class, str);
    }

    public boolean isPullDownLoadState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f947e05", new Object[]{this})).booleanValue();
        }
        if (this == PullDownLoading || this == PullDownLoadFail || this == PullDownLoadNoData) {
            return true;
        }
        return false;
    }

    public DXRefreshState toFooter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshState) ipChange.ipc$dispatch("ec85d772", new Object[]{this});
        }
        if (!this.isHeader || this.isTwoLevel) {
            return this;
        }
        return values()[ordinal() + 1];
    }

    public DXRefreshState toHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshState) ipChange.ipc$dispatch("5c64e4e4", new Object[]{this});
        }
        if (!this.isFooter || this.isTwoLevel) {
            return this;
        }
        return values()[ordinal() - 1];
    }
}
