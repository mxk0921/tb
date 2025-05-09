package com.taobao.tab2interact.plugin.jsbridge;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.a07;
import tb.ckf;
import tb.ihc;
import tb.kpw;
import tb.t2o;
import tb.vgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class H5InteractLayerJsBridgeService extends Service implements ihc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963238);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963237);
        t2o.a(989856204);
    }

    public static /* synthetic */ Object ipc$super(H5InteractLayerJsBridgeService h5InteractLayerJsBridgeService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/plugin/jsbridge/H5InteractLayerJsBridgeService");
    }

    @Override // tb.ihc
    public Class<? extends kpw> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        Application application = Globals.getApplication();
        if (str != null && application != null && ckf.b(str, "GGInteractModule")) {
            return H5InteractLayerJsBridge.class;
        }
        vgh.c(this, "H5InteractLayerJsBridgeService", "application为空或name无效");
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }
}
