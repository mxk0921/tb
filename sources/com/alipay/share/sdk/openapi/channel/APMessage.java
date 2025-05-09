package com.alipay.share.sdk.openapi.channel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alipay.share.sdk.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface CallBack {
        void handleMessage(Intent intent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Receiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Map<String, CallBack> callbacks = new HashMap();

        /* renamed from: a  reason: collision with root package name */
        public final CallBack f4544a;

        public Receiver() {
            this(null);
        }

        public static /* synthetic */ Object ipc$super(Receiver receiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/share/sdk/openapi/channel/APMessage$Receiver");
        }

        public static void registerCallBack(String str, CallBack callBack) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a66c7db0", new Object[]{str, callBack});
            } else {
                callbacks.put(str, callBack);
            }
        }

        public static void unregisterCallBack(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a865492", new Object[]{str});
            } else {
                callbacks.remove(str);
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            new StringBuilder("receive intent=").append(intent);
            CallBack callBack = this.f4544a;
            if (callBack != null) {
                callBack.handleMessage(intent);
                return;
            }
            CallBack callBack2 = callbacks.get(intent.getAction());
            if (callBack2 != null) {
                callBack2.handleMessage(intent);
            }
        }

        public Receiver(CallBack callBack) {
            this.f4544a = callBack;
        }
    }

    public static boolean send(Context context, String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3daf3c1", new Object[]{context, str, str2, str3, bundle})).booleanValue();
        }
        String str4 = str + ".permission.MM_MESSAGE";
        Intent intent = new Intent(str2);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        String packageName = context.getPackageName();
        intent.putExtra(Constant.EXTRA_MESSAGE_SDK_VERSION, Constant.SDK_VERSION);
        intent.putExtra(Constant.EXTRA_MESSAGE_APP_PACKAGE_NAME, packageName);
        intent.putExtra(Constant.EXTRA_MESSAGE_CONTENT, str3);
        intent.putExtra(Constant.EXTRA_MESSAGE_CHECK_SUM, MMessageUtil.checkSum(str3, packageName));
        context.sendBroadcast(intent, str4);
        StringBuilder sb = new StringBuilder("send ap message, intent=");
        sb.append(intent);
        sb.append(", perm=");
        sb.append(str4);
        return true;
    }

    public static void send(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c47b72d", new Object[]{context, str, str2});
        } else {
            send(context, str, ShareConstant.ACTION_MESSAGE, str2);
        }
    }

    public static void send(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e204fb7", new Object[]{context, str, str2, str3});
        } else {
            send(context, str, str2, str3, null);
        }
    }
}
