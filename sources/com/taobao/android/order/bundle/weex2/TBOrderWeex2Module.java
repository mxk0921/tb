package com.taobao.android.order.bundle.weex2;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.List;
import tb.juk;
import tb.t2o;
import tb.vvo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBOrderWeex2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031948);
    }

    public TBOrderWeex2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(TBOrderWeex2Module tBOrderWeex2Module, String str, Object... objArr) {
        if (str.hashCode() == 110991797) {
            super.onModuleDestroy((MUSModule) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/weex2/TBOrderWeex2Module");
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onModuleDestroy(MUSModule mUSModule) {
        ContentObserver l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d99b5", new Object[]{this, mUSModule});
            return;
        }
        super.onModuleDestroy(mUSModule);
        vvo.k().s(vvo.PAGE_NAME_ORDER_DETAIL3);
        Context uIContext = getInstance().getUIContext();
        if (uIContext != null) {
            String j = vvo.k().j();
            if (!TextUtils.isEmpty(j) && vvo.PAGE_NAME_ORDER_DETAIL3.equals(j) && (l = vvo.k().l(uIContext)) != null) {
                uIContext.getContentResolver().unregisterContentObserver(l);
                vvo.k().t(null);
                vvo.k().q(null);
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void registerScreenShotNotification() {
        ContentObserver l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b09069b", new Object[]{this});
            return;
        }
        vvo.k().q(vvo.PAGE_NAME_ORDER_DETAIL3);
        vvo.k().p(vvo.PAGE_NAME_ORDER_DETAIL3, new a());
        Context uIContext = getInstance().getUIContext();
        if (uIContext != null && (l = vvo.k().l(uIContext)) != null) {
            ContentResolver contentResolver = uIContext.getContentResolver();
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, l);
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, l);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements juk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.juk
        public void a() {
            ComponentName componentName;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f638eac", new Object[]{this});
            } else if (TBOrderWeex2Module.this.getInstance().getUIContext() instanceof Activity) {
                Activity activity = (Activity) TBOrderWeex2Module.this.getInstance().getUIContext();
                List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) activity.getSystemService("activity")).getRunningTasks(1);
                if (!runningTasks.isEmpty()) {
                    componentName = runningTasks.get(0).topActivity;
                    String packageName = componentName.getPackageName();
                    String className = componentName.getClassName();
                    if (packageName.equals(activity.getPackageName()) && className.equals(activity.getClass().getName())) {
                        TBOrderWeex2Module.this.getInstance().dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "screenshot", null);
                    }
                }
            }
        }
    }
}
