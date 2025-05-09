package com.taobao.message.conversation;

import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.a;
import tb.hvd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MessageTabClickListener implements hvd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MessageTabClickListener";
    private static boolean isRegister = false;

    static {
        t2o.a(530579458);
    }

    public static void registerTabChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90bd849d", new Object[0]);
        } else if (!ABGlobal.isFeatureOpened(Globals.getApplication(), "msgCloseTabChangeListener") && !isRegister) {
            a.h(new MessageTabClickListener());
            isRegister = true;
        }
    }

    @Override // tb.hvd
    public void onTabChanged(int i, String str) {
        TBFragmentTabHost o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
        } else if (TextUtils.equals(str, "message") && (o = a.o()) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Fragment currentFragment = o.getCurrentFragment();
            if (currentFragment instanceof MessageTabFragment) {
                try {
                    MessageTabFragment messageTabFragment = (MessageTabFragment) currentFragment;
                    messageTabFragment.setTabClickTime(currentTimeMillis);
                    messageTabFragment.init();
                } catch (Throwable th) {
                    TLog.loge(TAG, Log.getStackTraceString(th));
                }
            }
        }
    }
}
