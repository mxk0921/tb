package com.taobao.wangxin.app;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import com.taobao.login4android.api.Login;
import com.taobao.message.conversation.MessageTabClickListener;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.message.notification.badge.MsgShortcutBadger;
import com.taobao.message.unread.RemoteGlobalUnread;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.Interface.TabHostStatusListener;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import com.taobao.tao.navigation.a;
import java.util.Arrays;
import java.util.HashMap;
import tb.g1a;
import tb.t2o;
import tb.xhv;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LauncherMessagePreload {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_NUMBER = "mpMessageBoxGlobalsTipNumber";
    private static final String KEY_TYPE = "mpMessageBoxGlobalsTipType";
    private static final String MODULE = "MPMSGS";
    private static final String TAG = "LauncherMessagePreload";
    public static long sFirstDispatchTime;
    public static int sFirstTipNumber;
    public static int sFirstTipType;
    public static long sFirstUpdateNavigationTime;
    public static boolean sHasUpdateNavigationError;
    public static boolean sTabbarBtnAnimShow = false;
    public static int sUseSnapshot;

    static {
        t2o.a(530579529);
    }

    public static /* synthetic */ void access$000(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678c1348", new Object[]{application});
        } else {
            requestRemote(application);
        }
    }

    public static /* synthetic */ void access$100(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6430e470", new Object[]{context, new Integer(i), new Integer(i2)});
        } else {
            updateUnreadNumUI(context, i, i2);
        }
    }

    private static void requestRemote(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13bb0a3", new Object[]{application});
        } else {
            RemoteGlobalUnread.request(Arrays.asList("bc", "cc", "notice", "subscribe"), new g1a<Integer, xhv>() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public xhv invoke(Integer num) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (xhv) ipChange2.ipc$dispatch("3a517297", new Object[]{this, num});
                    }
                    if (num != null && num.intValue() > 0) {
                        LauncherMessagePreload.access$100(application, num.intValue(), 0);
                    }
                    return xhv.INSTANCE;
                }
            }, new g1a<String, xhv>() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public xhv invoke(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (xhv) ipChange2.ipc$dispatch("32558f08", new Object[]{this, str});
                    }
                    TLog.loge(LauncherMessagePreload.TAG, str);
                    return xhv.INSTANCE;
                }
            });
        }
    }

    private static void updateUnreadNumUI(Context context, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f2ff5f", new Object[]{context, new Integer(i), new Integer(i2)});
        } else if (sTabbarBtnAnimShow) {
            TLog.loge(TAG, " updateUnreadNumUI return sTabbarBtnAnimShow true ");
        } else {
            sFirstTipType = i2;
            sFirstTipNumber = i;
            try {
            } catch (Throwable th) {
                TLog.loge(TAG, Log.getStackTraceString(th));
            }
            if (i > 0) {
                if (i2 == 0) {
                    MsgShortcutBadger.applyCount(context, i);
                }
                TBS.Ext.commitEvent("Page_Extend", 2201, "User_TBMSGMessage_Unread", null, null, "tipNumber=" + i, "tipType=" + i2, "reportType=snapshot");
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int i3 = i;
                        if (i3 <= 0) {
                            TLog.loge(LauncherMessagePreload.TAG, "updateUnreadNumUI clear");
                            a.i0("message", NavigationTabMsgMode.NONE, null);
                        } else if (i2 == 0) {
                            boolean i0 = a.i0("message", NavigationTabMsgMode.DEFAULT, String.valueOf(i3));
                            if (!i0) {
                                LauncherMessagePreload.sHasUpdateNavigationError = true;
                            }
                            TLog.loge(LauncherMessagePreload.TAG, "updateUnreadNumUI num = " + i + ", result =" + i0);
                        } else {
                            boolean i02 = a.i0("message", NavigationTabMsgMode.RED_POINT_INDICATOR, " ");
                            if (!i02) {
                                LauncherMessagePreload.sHasUpdateNavigationError = true;
                            }
                            TLog.loge(LauncherMessagePreload.TAG, "updateUnreadNumUI redDot, result =" + i02);
                        }
                        LauncherMessagePreload.sFirstUpdateNavigationTime = SystemClock.uptimeMillis();
                    }
                });
            }
            MsgShortcutBadger.removeCount(context);
            TBS.Ext.commitEvent("Page_Extend", 2201, "User_TBMSGMessage_Unread", null, null, "tipNumber=" + i, "tipType=" + i2, "reportType=snapshot");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int i3 = i;
                    if (i3 <= 0) {
                        TLog.loge(LauncherMessagePreload.TAG, "updateUnreadNumUI clear");
                        a.i0("message", NavigationTabMsgMode.NONE, null);
                    } else if (i2 == 0) {
                        boolean i0 = a.i0("message", NavigationTabMsgMode.DEFAULT, String.valueOf(i3));
                        if (!i0) {
                            LauncherMessagePreload.sHasUpdateNavigationError = true;
                        }
                        TLog.loge(LauncherMessagePreload.TAG, "updateUnreadNumUI num = " + i + ", result =" + i0);
                    } else {
                        boolean i02 = a.i0("message", NavigationTabMsgMode.RED_POINT_INDICATOR, " ");
                        if (!i02) {
                            LauncherMessagePreload.sHasUpdateNavigationError = true;
                        }
                        TLog.loge(LauncherMessagePreload.TAG, "updateUnreadNumUI redDot, result =" + i02);
                    }
                    LauncherMessagePreload.sFirstUpdateNavigationTime = SystemClock.uptimeMillis();
                }
            });
        }
    }

    public static void init(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        MessageTabClickListener.registerTabChangeListener();
        sFirstDispatchTime = SystemClock.uptimeMillis();
        TLog.loge(MODULE, TAG, "init");
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(application);
        sUseSnapshot = defaultSharedPreferences.getInt("mpMessageBoxGlobalsUseSnapshot", 0);
        if (BundleSplitUtil.INSTANCE.isMsgBundleReady(false) || !"1".equals(OrangeConfig.getInstance().getConfig("mpm_data_switch", "remoteUnread", "1"))) {
            if (sUseSnapshot != 0) {
                updateUnreadNumUI(application, defaultSharedPreferences.getInt(KEY_NUMBER, 0), defaultSharedPreferences.getInt(KEY_TYPE, 0));
            }
        } else if (defaultSharedPreferences.contains(KEY_NUMBER)) {
            if (sUseSnapshot != 0) {
                updateUnreadNumUI(application, defaultSharedPreferences.getInt(KEY_NUMBER, 0), defaultSharedPreferences.getInt(KEY_TYPE, 0));
            }
        } else if (Login.checkSessionValid()) {
            UIHandler.postDelayed(new Runnable() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!BundleSplitUtil.INSTANCE.isMsgBundleReady(false)) {
                        LauncherMessagePreload.access$000(application);
                    }
                }
            }, ((int) (Math.random() * 5000.0d)) + 1);
        } else {
            new Intent();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS);
            Globals.getApplication().registerReceiver(new BroadcastReceiver() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wangxin/app/LauncherMessagePreload$2");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    try {
                        Globals.getApplication().unregisterReceiver(this);
                    } catch (Throwable th) {
                        TLog.loge(LauncherMessagePreload.TAG, Log.getStackTraceString(th));
                    }
                    if (TextUtils.equals(intent.getAction(), LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS) && !BundleSplitUtil.INSTANCE.isMsgBundleReady(false)) {
                        LauncherMessagePreload.access$000(application);
                    }
                }
            }, intentFilter);
        }
        if (!FeatureInitHelper.isInit(Login.getUserId())) {
            Schedules.getLowBackground().execute(new Runnable() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TLog.loge(LauncherMessagePreload.TAG, " isMsgBundleReady ");
                    BundleSplitUtil.INSTANCE.isMsgBundleReady(true);
                    TLog.loge(LauncherMessagePreload.TAG, " end isMsgBundleReady ");
                }
            });
            zk9.c("com.taobao.message.conversation.DefaultMessageTabHost", new zk9.i() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.zk9.i
                public void onClassLoaded(Class<?> cls) {
                    TLog.loge(LauncherMessagePreload.TAG, " FlexaClass onClassLoaded ");
                    try {
                        Class.forName("com.taobao.message.preload.PreLoadClassHelper").getMethod("init", new Class[0]).invoke(null, new Object[0]);
                    } catch (Throwable th) {
                        TLog.loge(LauncherMessagePreload.TAG, Log.getStackTraceString(th));
                    }
                    TLog.loge(LauncherMessagePreload.TAG, " end  FlexaClass ");
                }

                @Override // tb.zk9.i
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    } else {
                        TLog.loge(LauncherMessagePreload.TAG, " FlexaClass onClassNotFound ");
                    }
                }
            }, Schedules.getLowBackground());
        }
        a.J("message", new TabHostStatusListener() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.navigation.Interface.TabHostStatusListener
            public int listenEventType() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("ec7280e7", new Object[]{this})).intValue();
                }
                return 1;
            }

            @Override // com.taobao.tao.navigation.Interface.TabHostStatusListener
            public void onTabHostStatusChanged(TabHostStatusListener.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("45bff8f3", new Object[]{this, aVar});
                    return;
                }
                TLog.loge(LauncherMessagePreload.TAG, "onTabHostStatusChanged refresh unreadInfo");
                LauncherMessagePreload.access$100(application, defaultSharedPreferences.getInt(LauncherMessagePreload.KEY_NUMBER, 0), defaultSharedPreferences.getInt(LauncherMessagePreload.KEY_TYPE, 0));
            }
        });
    }
}
