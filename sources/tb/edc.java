package tb;

import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final /* synthetic */ class edc {
    public static String a(TBRefreshHeader.RefreshState refreshState) {
        switch (IHomeSubTabController.a.$SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[refreshState.ordinal()]) {
            case 1:
                return "NONE";
            case 2:
                return "PULL_TO_REFRESH";
            case 3:
                return "RELEASE_TO_REFRESH";
            case 4:
                return "REFRESHING";
            case 5:
            case 6:
                return "SECOND_FLOOR_START";
            case 7:
                return "SECOND_FLOOR_END";
            default:
                return "unknown";
        }
    }
}
