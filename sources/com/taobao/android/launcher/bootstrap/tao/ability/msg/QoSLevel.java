package com.taobao.android.launcher.bootstrap.tao.ability.msg;

import android.os.Handler;
import android.os.Message;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.hbp;
import tb.u7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class QoSLevel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH = 2;
    public static final int LOW = 0;
    public static final int NORMAL = 1;
    public static final int URGENT = 3;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Level {
    }

    public static int a(u7l u7lVar, Message message) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60da6066", new Object[]{u7lVar, message})).intValue();
        }
        if (u7lVar.e && (message.getCallback() instanceof hbp)) {
            return 2;
        }
        Handler target = message.getTarget();
        if (target == null || !target.getClass().getName().startsWith(ProcessUtils.ACTIVITY_THREAD)) {
            return 1;
        }
        if ((u7lVar.d && message.what == 113) || (i = message.what) == 121 || i == 114 || i == 115) {
            return 3;
        }
        return 1;
    }
}
