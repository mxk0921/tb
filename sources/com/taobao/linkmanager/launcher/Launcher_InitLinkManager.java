package com.taobao.linkmanager.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;
import tb.zsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class Launcher_InitLinkManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f10933a;
        public final /* synthetic */ HashMap b;

        public a(Application application, HashMap hashMap) {
            this.f10933a = application;
            this.b = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TbFcLinkInit.instance().init(this.f10933a, this.b);
            }
        }
    }

    static {
        t2o.a(744489109);
    }

    public final void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        TFCCommonUtils.g(application);
        if (TbFcLinkInit.instance().linkAhead) {
            zsa.b.a(new a(application, hashMap));
        } else {
            TbFcLinkInit.instance().init(application, hashMap);
        }
    }
}
