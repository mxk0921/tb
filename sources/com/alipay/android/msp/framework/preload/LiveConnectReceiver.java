package com.alipay.android.msp.framework.preload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LiveConnectReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class MspPreLoadTask extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f3655a;

        public MspPreLoadTask(Context context) {
            this.f3655a = context;
        }

        public static /* synthetic */ Object ipc$super(MspPreLoadTask mspPreLoadTask, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/preload/LiveConnectReceiver$MspPreLoadTask");
        }

        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            LiveConnectReceiver.access$000(LiveConnectReceiver.this, this.f3655a);
            return null;
        }
    }

    public static /* synthetic */ void access$000(LiveConnectReceiver liveConnectReceiver, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41fac7c", new Object[]{liveConnectReceiver, context});
            return;
        }
        PhoneCashierMspEngine.getMspBase().loadProperties(context);
        MspConfig.getInstance();
    }

    public static /* synthetic */ Object ipc$super(LiveConnectReceiver liveConnectReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/preload/LiveConnectReceiver");
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2296a1a", new Object[]{this, context});
        } else {
            new MspPreLoadTask(context).execute(new Void[0]);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "LiveConnectReceiver.onReceive", "传入LiveConnectReceiver的intent为空，退出");
        } else {
            String action = intent.getAction();
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, action, "");
            String str = intent.getPackage();
            if (TextUtils.equals("com.taobao.taobao", str) || TextUtils.equals("com.taobao.litetao", str) || TextUtils.equals("com.taobao.mobile.dipei", str)) {
                GlobalHelper.getInstance().init(context);
                LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "LiveConnectReceiver.onReceive", "广播预连接传入ip地址：".concat(String.valueOf(intent.getStringExtra("dns_ip"))));
                if (intent.getBooleanExtra("msp_pre_load", false)) {
                    a(context);
                }
                if (TextUtils.equals(action, "com.alipay.phonecashier.prepay")) {
                    try {
                        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, action, "");
                        a(context);
                        PreloadManager.startPreLoad(context);
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            } else {
                LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "LiveConnectReceiver.onReceive", "调起LiveConnectReceiver的packageName[" + str + "]不正确(当前只支持手淘)");
            }
        }
    }
}
