package tb;

import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final /* synthetic */ class gz7 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        t2o.a(918552813);
        int[] iArr = new int[TBRefreshHeader.RefreshState.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[TBRefreshHeader.RefreshState.NONE.ordinal()] = 1;
        iArr[TBRefreshHeader.RefreshState.PULL_TO_REFRESH.ordinal()] = 2;
        iArr[TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH.ordinal()] = 3;
        iArr[TBRefreshHeader.RefreshState.REFRESHING.ordinal()] = 4;
        iArr[TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR.ordinal()] = 5;
        iArr[TBRefreshHeader.RefreshState.SECOND_FLOOR_START.ordinal()] = 6;
        iArr[TBRefreshHeader.RefreshState.SECOND_FLOOR_END.ordinal()] = 7;
    }
}
