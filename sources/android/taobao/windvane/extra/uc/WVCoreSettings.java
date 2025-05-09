package android.taobao.windvane.extra.uc;

import android.taobao.windvane.extra.core.WVCore;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.au4;
import tb.t2o;
import tb.vpw;
import tb.xsw;
import tb.yt4;
import tb.zt4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVCoreSettings {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DOWNLOAD = 1;
    public static final int INNER = 0;
    public static final int U420 = 2;
    public static final int U430 = 3;
    private static WVCoreSettings instance;
    public List<zt4> coreEventCallbacks;
    public List<yt4> coreEventCallbacks2;

    static {
        t2o.a(989856090);
    }

    public static WVCoreSettings getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCoreSettings) ipChange.ipc$dispatch("b02c5aa4", new Object[0]);
        }
        if (instance == null) {
            synchronized (WVCoreSettings.class) {
                try {
                    if (instance == null) {
                        instance = new WVCoreSettings();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public static void setCorePolicy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb550389", new Object[]{new Integer(i)});
        } else {
            vpw.commonConfig.r = i;
        }
    }

    public static void setDownloadCore(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345bbf33", new Object[]{new Integer(i)});
        } else {
            vpw.commonConfig.y = i;
        }
    }

    public static void setGpuMultiPolicy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9414677b", new Object[]{new Integer(i)});
        } else {
            xsw.configData.b = i;
        }
    }

    public static void setInputSupportedDomains(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe5c21a", new Object[]{str});
        } else {
            vpw.commonConfig.i.f26278a = str;
        }
    }

    public static void setWebMultiPolicy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffda5223", new Object[]{new Integer(i)});
        } else {
            xsw.configData.f32336a = i;
        }
    }

    public void notifyCoreEventCallback2Fail(yt4 yt4Var, au4 au4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("294201fb", new Object[]{this, yt4Var, au4Var});
        } else if (yt4Var != null) {
            yt4Var.onUCCoreInitFailed(au4Var);
            List<yt4> list = this.coreEventCallbacks2;
            if (list != null) {
                list.remove(yt4Var);
            }
        }
    }

    public void notifyCoreEventCallback2Success() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d159904f", new Object[]{this});
            return;
        }
        List<yt4> list = this.coreEventCallbacks2;
        if (list != null) {
            for (yt4 yt4Var : list) {
                yt4Var.onUCCorePrepared();
            }
            this.coreEventCallbacks2.clear();
        }
    }

    public void notifyCoreEventCallbackSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba52b33", new Object[]{this});
            return;
        }
        List<yt4> list = this.coreEventCallbacks2;
        if (list != null) {
            for (yt4 yt4Var : list) {
                yt4Var.onUCCorePrepared();
            }
            this.coreEventCallbacks2.clear();
        }
    }

    public void removeEventCallback2(yt4 yt4Var) {
        List<yt4> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae980f21", new Object[]{this, yt4Var});
        } else if (yt4Var != null && (list = this.coreEventCallbacks2) != null) {
            list.remove(yt4Var);
        }
    }

    public void setCoreEventCallback(zt4 zt4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d36116", new Object[]{this, zt4Var});
        } else if (zt4Var != null) {
            if (WVCore.getInstance().isUCSupport()) {
                zt4Var.onUCCorePrepared();
                return;
            }
            if (this.coreEventCallbacks == null) {
                if (vpw.commonConfig.Q) {
                    this.coreEventCallbacks = new CopyOnWriteArrayList();
                } else {
                    this.coreEventCallbacks = new ArrayList();
                }
            }
            if (!this.coreEventCallbacks.contains(zt4Var)) {
                this.coreEventCallbacks.add(zt4Var);
            }
            try {
                IpChange ipChange2 = WVUCWebView.$ipChange;
            } catch (Throwable unused) {
            }
        }
    }

    public void setCoreEventCallback2(yt4 yt4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ae63fe", new Object[]{this, yt4Var});
        } else if (yt4Var != null) {
            if (WVCore.getInstance().isUCSupport()) {
                yt4Var.onUCCorePrepared();
                return;
            }
            if (this.coreEventCallbacks2 == null) {
                this.coreEventCallbacks2 = new CopyOnWriteArrayList();
            }
            if (!this.coreEventCallbacks2.contains(yt4Var)) {
                this.coreEventCallbacks2.add(yt4Var);
            }
            try {
                IpChange ipChange2 = WVUCWebView.$ipChange;
            } catch (Throwable unused) {
            }
        }
    }

    public void notifyCoreEventCallback2Fail(au4 au4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bba60fe", new Object[]{this, au4Var});
            return;
        }
        List<yt4> list = this.coreEventCallbacks2;
        if (list != null) {
            for (yt4 yt4Var : list) {
                yt4Var.onUCCoreInitFailed(au4Var);
            }
            this.coreEventCallbacks2.clear();
        }
    }
}
