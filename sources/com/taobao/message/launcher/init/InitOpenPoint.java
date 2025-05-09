package com.taobao.message.launcher.init;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class InitOpenPoint {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, InitOpenPointProcessor> sProcessor = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface InitOpenPointProcessor {
        void after();

        void before();

        String getName();
    }

    static {
        t2o.a(529531029);
    }

    public static void after() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cae3c63", new Object[0]);
        } else if (sProcessor.values() != null && sProcessor.values().size() > 0) {
            for (InitOpenPointProcessor initOpenPointProcessor : sProcessor.values()) {
                initOpenPointProcessor.after();
            }
        }
    }

    public static void before() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed5ec86", new Object[0]);
        } else if (sProcessor.values() != null && sProcessor.values().size() > 0) {
            for (InitOpenPointProcessor initOpenPointProcessor : sProcessor.values()) {
                initOpenPointProcessor.before();
            }
        }
    }

    public static void registerProcessor(InitOpenPointProcessor initOpenPointProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ade316", new Object[]{initOpenPointProcessor});
        } else {
            sProcessor.put(initOpenPointProcessor.getName(), initOpenPointProcessor);
        }
    }
}
