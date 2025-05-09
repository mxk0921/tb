package com.taobao.message.notification.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;
import tb.qqt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ThreadPoolUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ExecutorService executor = VExecutors.newSingleThreadExecutor(new qqt() { // from class: com.taobao.message.notification.util.ThreadPoolUtil.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "MSG-Notification";
        }
    });

    static {
        t2o.a(610271346);
    }

    public static void doAsyncTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b364515b", new Object[]{runnable});
        } else {
            executor.submit(runnable);
        }
    }
}
