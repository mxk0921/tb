package com.taobao.android.detail.provider;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBTrackProvider implements ITrackAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String[] EMPTY_TRACK_ARGS = new String[0];

    static {
        t2o.a(698351633);
    }

    @SafeVarargs
    private final String[] getTrackArgs(Pair<String, String>... pairArr) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ebb02f8d", new Object[]{this, pairArr});
        }
        if (pairArr != null) {
            i = pairArr.length;
        } else {
            i = 0;
        }
        if (i == 0) {
            return EMPTY_TRACK_ARGS;
        }
        String[] strArr = new String[i];
        int length = pairArr.length;
        int i3 = 0;
        while (i2 < length) {
            Pair<String, String> pair = pairArr[i2];
            strArr[i3] = ((String) pair.first) + "=" + ((String) pair.second);
            i2++;
            i3++;
        }
        return strArr;
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void ctrlClickedOnPage(Context context, String str, String str2, Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de98c30", new Object[]{this, context, str, str2, pairArr});
            return;
        }
        String[] trackArgs = getTrackArgs(pairArr);
        if (TextUtils.isEmpty(str)) {
            TBS.Adv.ctrlClicked("Page_Detail", CT.Button, str2, trackArgs);
        } else {
            TBS.Adv.ctrlClickedOnPage(str, CT.Button, str2, trackArgs);
        }
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void pageEnter(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e187d40", new Object[]{this, activity, str, str2, str3});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(activity, str2);
        }
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void pageLeave(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497aa095", new Object[]{this, activity, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
        }
    }
}
