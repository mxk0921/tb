package com.taobao.message.notify;

import android.content.Intent;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/taobao/message/notify/MessageNotifyService;", "", "<init>", "()V", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "", "invokeTag", "Ltb/xhv;", "doAgooNotify", "(Landroid/content/Intent;Ljava/lang/String;)V", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "message_base_tb_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MessageNotifyService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final MessageNotifyService INSTANCE = new MessageNotifyService();
    private static final String TAG = "MessageNotifyService";

    static {
        t2o.a(530579466);
    }

    private MessageNotifyService() {
    }

    @JvmStatic
    public static final void doAgooNotify(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4720e8", new Object[]{intent, str});
            return;
        }
        BundleSplitUtil bundleSplitUtil = BundleSplitUtil.INSTANCE;
        if (bundleSplitUtil.isMsgBundleReady()) {
            bundleSplitUtil.checkClazzReady("com.taobao.message.agoo.AgooNotifyUtil", true, new MessageNotifyService$doAgooNotify$1(intent, str), MessageNotifyService$doAgooNotify$2.INSTANCE);
        } else {
            TLog.loge(TAG, "msg bundle is not ready");
        }
    }
}
