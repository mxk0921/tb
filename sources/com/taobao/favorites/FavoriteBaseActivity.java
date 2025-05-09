package com.taobao.favorites;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FavoriteBaseActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "fav.FavoriteBaseActivity";
    private View mProgressLayout;

    static {
        t2o.a(707788802);
    }

    public static /* synthetic */ Object ipc$super(FavoriteBaseActivity favoriteBaseActivity, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/FavoriteBaseActivity");
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity
    public void hideloadingMaskLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49213b17", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.FavoriteBaseActivity", "public void hideloadingMaskLayout()", "20180112");
        if (this.mProgressLayout != null) {
            TLog.logd(TAG, "hideloadingMaskLayout");
            this.mProgressLayout.setVisibility(8);
        }
    }

    public void updatePageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.FavoriteBaseActivity", "public void updatePageProperties(Map<String, String> lp)", "20180112");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), map);
    }

    public void updateUTPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd59013", new Object[]{this, str});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.FavoriteBaseActivity", "public void updateUTPageName(String pageName)", "20180112");
        if (!TextUtils.isEmpty(str)) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, str);
            setUTPageName(str);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity
    public void showLoadingMaskLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d001c", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.FavoriteBaseActivity", "public void showLoadingMaskLayout()", "20180112");
        if (this.mProgressLayout != null) {
            TLog.logd(TAG, "showLoadingMaskLayout");
            this.mProgressLayout.setVisibility(0);
        }
    }
}
