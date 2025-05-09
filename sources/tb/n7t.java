package tb;

import android.text.TextUtils;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.TaoLiveVideoActivity;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class n7t implements ISmallWindowStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public n7t(TaoLiveVideoActivity taoLiveVideoActivity) {
    }

    @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
    public void onSmallWindowClick(View view, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265e0e99", new Object[]{this, view, str, str2, str3});
            return;
        }
        if (!TextUtils.isEmpty(str) && pvs.D1()) {
            str = str.replace(kmr.TAOLIVE_ONLINE_LIVE_ID, "id=" + pvs.A2());
        }
        if (TextUtils.isEmpty(str)) {
            str = u90.e(str2);
        }
        String replace = str.replace("forceRefresh=true", "forceRefresh=false");
        if (pvs.X2()) {
            replace = replace.replace("needRecommend=true", "id=" + str2);
        }
        voj.b(view.getContext(), replace, null, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, false);
    }
}
