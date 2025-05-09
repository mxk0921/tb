package com.taobao.tao.flexbox.layoutmanager.container.dx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.ArrayList;
import tb.iwb;
import tb.k66;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class DxPreloadExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final DxPreloadExecutor INSTANCE = new DxPreloadExecutor();
    public static final String TAG = "DxOrangeConfigsExecutor";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f12178a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DinamicXEngine f12179a;

        public a(DinamicXEngine dinamicXEngine) {
            this.f12179a = dinamicXEngine;
        }

        @Override // tb.iwb
        public final void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            } else if (k66Var != null) {
                this.f12179a.q0();
            }
        }
    }

    static {
        t2o.a(502268263);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32ec880", new Object[]{this});
        } else if (!f12178a) {
            f12178a = true;
            tfs.e(TAG, "startPrefetch");
            DxTemplateVersionManager dxTemplateVersionManager = DxTemplateVersionManager.INSTANCE;
            dxTemplateVersionManager.j();
            ArrayList arrayList = new ArrayList();
            dxTemplateVersionManager.g(new DxPreloadExecutor$startPrefetch$1(arrayList));
            if (!arrayList.isEmpty()) {
                tfs.e(TAG, "startPrefetch: 启动引擎预下载");
                DinamicXEngine dinamicXEngine = new DinamicXEngine(new DXEngineConfig("preload"));
                dinamicXEngine.a1(new a(dinamicXEngine));
                dinamicXEngine.p(arrayList);
            }
        }
    }
}
