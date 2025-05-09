package com.taobao.linkmanager.smartFlow;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;
import tb.vp9;
import tb.ypg;
import tb.zsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class Launcher_SmartFlow implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f10938a;
        public final /* synthetic */ HashMap b;

        public a(Application application, HashMap hashMap) {
            this.f10938a = application;
            this.b = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ypg.e().c(this.f10938a, this.b);
            } catch (Exception e) {
                vp9.b("linkx", "initChannelError" + e.getMessage());
            }
        }
    }

    static {
        t2o.a(744489118);
    }

    public final void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            zsa.b.a(new a(application, hashMap));
        }
    }
}
