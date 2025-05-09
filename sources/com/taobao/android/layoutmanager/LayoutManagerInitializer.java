package com.taobao.android.layoutmanager;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.NotifyRegister;
import com.taobao.tao.flexbox.layoutmanager.core.d;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore;
import tb.it8;
import tb.iyi;
import tb.nyi;
import tb.ray;
import tb.say;
import tb.t2o;
import tb.tc4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LayoutManagerInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TNodeJSCore.o();
            }
        }
    }

    static {
        t2o.a(502267907);
    }

    private static void autoComponentFactoryRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("824b9ce6", new Object[0]);
        } else {
            d.b(new ray());
        }
    }

    private static void autoModuleFactoryRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b842b6d9", new Object[0]);
        } else {
            iyi.a(new say());
        }
    }

    public static void setup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[0]);
            return;
        }
        autoComponentFactoryRegister();
        autoModuleFactoryRegister();
        tc4.a();
        nyi.a();
        NotifyRegister.a();
        it8.a();
        o.m1(new a());
    }
}
