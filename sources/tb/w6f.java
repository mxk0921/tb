package tb;

import android.app.Application;
import android.content.IntentFilter;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.a;
import com.taobao.android.miniLive.AliMiniLiveWVPlugin;
import com.taobao.android.miniLive.services.TBMiniLiveReceiver;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w6f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_LIVE_ROOM_START = "action.com.taobao.taolive.room.start";
    public static final String ACTION_NOTIFY_DETAIL_SHOW = "ACTION_NOTIFY_DETAIL_SHOW";
    public static final String ACTION_NOTIFY_DETAIL_SLIDE_INTO_INFO = "ACTION_NOTIFY_DETAIL_SLIDE_INTO_INFO";
    public static final String ACTION_NOTIFY_DETAIL_SLIDE_OUT_INFO = "ACTION_NOTIFY_DETAIL_SLIDE_OUT_INFO";
    public static final String PAGE_DETAIL_UPP_SHOWFLOATVIEWNOTIFICATION = "Page_Detail_UPP_ShowFloatViewNotification";
    public static final String PAGE_PAUSE_ACTION = "TAOLIVE_ACTION_NOTIFY_VIEWDISAPPEAR";
    public static final String PAGE_RESUME_ACTION = "TAOLIVE_ACTION_NOTIFY_VIEWAPPEAR";
    public static final String PAGE_SHOP_PAUSE_ACTION = "com.taobao.shop.TB_SHOP_AC_PAUSE";
    public static final String PAGE_SHOP_RESUME_ACTION = "com.taobao.shop.TB_SHOP_AC_RESUME";
    public static final String TAG = "InitTaoMiniLiveSDK";
    public static final String TAOLIVE_SHOW_MINILIVE_ACTION = "com.taobao.taolive.miniLiveRoom.action";

    static {
        t2o.a(779092014);
        a.a("com.taobao.taolive", null);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PAGE_RESUME_ACTION);
        intentFilter.addAction(PAGE_PAUSE_ACTION);
        intentFilter.addAction(PAGE_SHOP_PAUSE_ACTION);
        intentFilter.addAction(PAGE_SHOP_RESUME_ACTION);
        intentFilter.addAction(TAOLIVE_SHOW_MINILIVE_ACTION);
        intentFilter.addAction(ACTION_NOTIFY_DETAIL_SHOW);
        intentFilter.addAction(ACTION_NOTIFY_DETAIL_SLIDE_INTO_INFO);
        intentFilter.addAction(ACTION_NOTIFY_DETAIL_SLIDE_OUT_INFO);
        intentFilter.addAction("action.com.taobao.taolive.room.start");
        intentFilter.addAction(PAGE_DETAIL_UPP_SHOWFLOATVIEWNOTIFICATION);
        LocalBroadcastManager.getInstance(application.getApplicationContext()).registerReceiver(new TBMiniLiveReceiver(), intentFilter);
        Log.e(TAG, "init");
        fsw.i("AliMiniLiveWVPlugin", AliMiniLiveWVPlugin.class, true);
    }
}
