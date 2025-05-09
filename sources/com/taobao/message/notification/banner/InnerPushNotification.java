package com.taobao.message.notification.banner;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.banner.InnerPushNotification;
import com.taobao.message.notification.banner.InnerPushVO;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.banner.view.NotificationBannerHelper;
import com.taobao.message.notification.constans.SettingContants;
import com.taobao.message.notification.openPushAbility.OpenPushService;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class InnerPushNotification {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InnerPushNotification";
    private static Set<String> defaultExcludeActivities;
    public InnerNotificationAdapter mAdapter;
    private static boolean sInnerPushSwitch = true;
    private static Set<String> sExcludeActivities = new HashSet();
    private static Set<String> sExcludeFragments = new HashSet();
    private static List<NotificationPopProcessor> processors = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface NotificationPopProcessor {
        boolean unNeedPop();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static abstract class OnDismissListenerWithType implements PopupWindow.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(610271245);
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            } else {
                onDismiss(false);
            }
        }

        public abstract void onDismiss(boolean z);

        public final void onDismissActive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a5d4698", new Object[]{this});
            } else {
                onDismiss(true);
            }
        }
    }

    static {
        t2o.a(610271239);
        HashSet hashSet = new HashSet();
        defaultExcludeActivities = hashSet;
        hashSet.add("com.taobao.android.litecreator.modules.record.LCRecordActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.record.LCRecordActivityDirect");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.record.albumfilm.FilmDetailActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.record.ablum.preview.image.LCImageGalleryActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.edit.video.LCVideoEditActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.edit.image.LCImageEditActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.edit.image.crop.activity.LCCropActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.edit.video.cutter.LcVideoCutActivity");
        defaultExcludeActivities.add("com.taobao.taopai.business.music.main.MusicSelectActivity");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.coverpick.marvel.LCVideoCoverPickActivityNew");
        defaultExcludeActivities.add("com.taobao.android.litecreator.modules.record.ablum.LcAlbumActivity");
        defaultExcludeActivities.add("com.taobao.umipublish.tnode.LiteCreatorPublishActivity");
        defaultExcludeActivities.add("com.taobao.umipublish.extension.preview.video.UmiVideoPreviewActivity");
        defaultExcludeActivities.add("com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity");
    }

    private InnerPushNotification(InnerNotificationAdapter innerNotificationAdapter) {
        this.mAdapter = innerNotificationAdapter;
    }

    public static void enable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a800938a", new Object[]{new Boolean(z)});
        } else {
            sInnerPushSwitch = z;
        }
    }

    public static void excludeActivityClassNames(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b9b21f", new Object[]{set});
        } else if (set != null) {
            sExcludeActivities.addAll(set);
        }
    }

    public static void excludeFragmentClassNames(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf34b67e", new Object[]{set});
        } else if (set != null) {
            sExcludeFragments.addAll(set);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1984c94d", new Object[]{this});
            return;
        }
        InnerNotificationAdapter innerNotificationAdapter = this.mAdapter;
        if (!(innerNotificationAdapter instanceof MarketingInnerNotificationAdapter) || ((MarketingInnerNotificationAdapter) innerNotificationAdapter).getcheckBizCode() == null) {
            z = NotificationBannerHelper.instance().showNotification(this.mAdapter.getView(), new View.OnClickListener() { // from class: com.taobao.message.notification.banner.InnerPushNotification.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        InnerPushNotification.this.mAdapter.onClick(view);
                    }
                }
            }, new OnDismissListenerWithType() { // from class: com.taobao.message.notification.banner.InnerPushNotification.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/notification/banner/InnerPushNotification$4");
                }

                @Override // com.taobao.message.notification.banner.InnerPushNotification.OnDismissListenerWithType
                public void onDismiss(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8c369e62", new Object[]{this, new Boolean(z2)});
                    } else {
                        InnerPushNotification.this.dismiss();
                    }
                }
            }, null);
        } else {
            z = NotificationBannerHelper.instance().showNotification(this.mAdapter.getView(), new View.OnClickListener() { // from class: com.taobao.message.notification.banner.InnerPushNotification.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    InnerPushNotification.this.mAdapter.onClick(view);
                    InnerPushNotification.this.dismiss();
                }
            }, new OnDismissListenerWithType() { // from class: com.taobao.message.notification.banner.InnerPushNotification.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/notification/banner/InnerPushNotification$2");
                }

                @Override // com.taobao.message.notification.banner.InnerPushNotification.OnDismissListenerWithType
                public void onDismiss(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8c369e62", new Object[]{this, new Boolean(z2)});
                    } else {
                        InnerPushNotification.this.dismiss();
                    }
                }
            }, this.mAdapter);
        }
        if (z) {
            this.mAdapter.onShow();
        }
    }

    public static InnerPushNotification obtain(InnerNotificationAdapter innerNotificationAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerPushNotification) ipChange.ipc$dispatch("e8df35f7", new Object[]{innerNotificationAdapter});
        }
        if (innerNotificationAdapter == null) {
            return null;
        }
        return new InnerPushNotification(innerNotificationAdapter);
    }

    public static void registerNotificationPopProcessor(NotificationPopProcessor notificationPopProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658463bc", new Object[]{notificationPopProcessor});
        } else {
            processors.add(notificationPopProcessor);
        }
    }

    public static void unregisterNotificationPopProcessor(NotificationPopProcessor notificationPopProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66566983", new Object[]{notificationPopProcessor});
        } else {
            processors.remove(notificationPopProcessor);
        }
    }

    public void dismiss() {
        InnerNotificationAdapter innerNotificationAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (OpenPushService.getInstance().getOpenPushServiceIsOpen() && (innerNotificationAdapter = this.mAdapter) != null && (innerNotificationAdapter instanceof MarketingInnerNotificationAdapter)) {
            MarketingInnerNotificationAdapter marketingInnerNotificationAdapter = (MarketingInnerNotificationAdapter) innerNotificationAdapter;
            if (marketingInnerNotificationAdapter.getcheckBizCode() != null) {
                marketingInnerNotificationAdapter.checkByBusiness("viewWillDisappear");
            }
        }
    }

    public InnerNotificationAdapter getInnerNotificationAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerNotificationAdapter) ipChange.ipc$dispatch("a5c58cf4", new Object[]{this});
        }
        return this.mAdapter;
    }

    public InnerPushVO getVO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerPushVO) ipChange.ipc$dispatch("67cd4a40", new Object[]{this});
        }
        return this.mAdapter.getVO();
    }

    public void updateVO(InnerPushVO innerPushVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5bf649", new Object[]{this, innerPushVO});
        } else {
            this.mAdapter.updateVO(innerPushVO);
        }
    }

    private boolean notificationHiddenByOrange(Activity activity, Fragment fragment) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35aba00f", new Object[]{this, activity, fragment})).booleanValue();
        }
        String str2 = "_sync";
        String concat = "ExcludePushActivity".concat(this.mAdapter instanceof MarketingInnerNotificationAdapter ? "" : str2);
        if (this.mAdapter instanceof MarketingInnerNotificationAdapter) {
            str = defaultExcludeActivities.toString();
        } else {
            str = "";
        }
        if (this.mAdapter instanceof MarketingInnerNotificationAdapter) {
            str2 = "";
        }
        String concat2 = "ExcludePushFragment".concat(str2);
        String config = OrangeConfig.getInstance().getConfig("mpm_business_switch", concat, str);
        if (TextUtils.isEmpty(config) || activity == null || !config.contains(activity.getClass().getName())) {
            String config2 = OrangeConfig.getInstance().getConfig("mpm_business_switch", concat2, "");
            if (TextUtils.isEmpty(config2) || fragment == null || !config2.contains(fragment.getClass().getName())) {
                return false;
            }
            TLog.loge(TAG, concat2 + " orange fragment exclude is return ");
            this.mAdapter.onError(-2);
            return true;
        }
        TLog.loge(TAG, concat + " orange activity exclude is return ");
        this.mAdapter.onError(-2);
        return true;
    }

    public void show() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (!sInnerPushSwitch) {
            TLog.loge(TAG, "total switch close");
            this.mAdapter.onError(-3);
        } else if (!this.mAdapter.needShow()) {
            TLog.loge(TAG, "performNotifyBefore return false, abort follow steps!");
            this.mAdapter.onError(0);
        } else {
            if (!processors.isEmpty()) {
                try {
                    for (NotificationPopProcessor notificationPopProcessor : processors) {
                        if (notificationPopProcessor.unNeedPop()) {
                            this.mAdapter.onError(-4);
                            TLog.loge(TAG, "show processors onError return");
                            return;
                        }
                    }
                } catch (Exception e) {
                    TLog.loge(TAG, "show processors error, " + Log.getStackTraceString(e));
                }
            }
            if (!PreferenceManager.getDefaultSharedPreferences(this.mAdapter.getView().getContext().getApplicationContext()).getBoolean(SettingContants.SETTINGS_APP_BANNER, true)) {
                TLog.loge(TAG, "settingTrigger is return ");
                this.mAdapter.onError(-1);
                return;
            }
            InnerPushVO.Options options = this.mAdapter.mVO.options;
            if (options != null && options.allPage) {
                z = true;
            }
            Activity topActivity = EnvUtil.getTopActivity();
            if (z || topActivity == null || !sExcludeActivities.contains(topActivity.getClass().getName())) {
                Fragment topFragment = EnvUtil.getTopFragment();
                if (!z && topFragment != null && sExcludeFragments.contains(topFragment.getClass().getName())) {
                    TLog.loge(TAG, "fragment exclude is return ");
                    this.mAdapter.onError(-2);
                } else if (notificationHiddenByOrange(topActivity, topFragment)) {
                    TLog.loge(TAG, "notificationHiddenByOrange true, return");
                } else {
                    Runnable k9fVar = new Runnable() { // from class: tb.k9f
                        @Override // java.lang.Runnable
                        public final void run() {
                            InnerPushNotification.this.lambda$show$0();
                        }
                    };
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        k9fVar.run();
                    } else {
                        new Handler(Looper.getMainLooper()).post(k9fVar);
                    }
                }
            } else {
                TLog.loge(TAG, "activity exclude is return ");
                this.mAdapter.onError(-2);
            }
        }
    }
}
