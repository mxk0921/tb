package com.taobao.android.fcanvas.integration;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvasInstance;
import com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge;
import com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider;
import java.io.Serializable;
import org.json.JSONArray;
import tb.hih;
import tb.oxk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FCanvas implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FCanvas";
    private final ExternalAdapterImageProvider mImageProvider;
    private final boolean mIsTinyAppInsideMode;
    private final hih mLoggingAdapter;
    private final oxk mOnlineConfigAdapter;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements oxk.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(FCanvas fCanvas) {
        }

        @Override // tb.oxk.a
        public void onConfigUpdate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
            } else if (!TextUtils.isEmpty(str)) {
                FCanvasJNIBridge.nNotifyOnOnlineConfigChanged(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public hih f7645a;
        public ExternalAdapterImageProvider b;
        public oxk c;

        static {
            t2o.a(945815557);
        }

        public static /* synthetic */ hih a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hih) ipChange.ipc$dispatch("aefedf32", new Object[]{bVar});
            }
            return bVar.f7645a;
        }

        public static /* synthetic */ oxk b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oxk) ipChange.ipc$dispatch("f1aef1f9", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("38868216", new Object[]{bVar})).booleanValue();
            }
            bVar.getClass();
            return false;
        }

        public static /* synthetic */ ExternalAdapterImageProvider d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExternalAdapterImageProvider) ipChange.ipc$dispatch("a459ae9", new Object[]{bVar});
            }
            return bVar.b;
        }

        public FCanvas e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FCanvas) ipChange.ipc$dispatch("c348d1d1", new Object[]{this});
            }
            return new FCanvas(this, null);
        }

        public b f(ExternalAdapterImageProvider externalAdapterImageProvider) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ad53dd8b", new Object[]{this, externalAdapterImageProvider});
            }
            this.b = externalAdapterImageProvider;
            return this;
        }

        public b g(hih hihVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3bae1c9a", new Object[]{this, hihVar});
            }
            this.f7645a = hihVar;
            return this;
        }

        public b h(oxk oxkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7da42340", new Object[]{this, oxkVar});
            }
            this.c = oxkVar;
            return this;
        }
    }

    static {
        t2o.a(945815555);
    }

    public /* synthetic */ FCanvas(b bVar, a aVar) {
        this(bVar);
    }

    public static JSONArray dumpProfileInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("902e7806", new Object[0]);
        }
        String dumpProfileInfo = FCanvasJNIBridge.dumpProfileInfo();
        if (!TextUtils.isEmpty(dumpProfileInfo)) {
            try {
                return new JSONArray(dumpProfileInfo);
            } catch (Throwable th) {
                Log.e(TAG, "unhandled err : ", th);
            }
        }
        return new JSONArray();
    }

    public static void installImageProviderOnce(ExternalAdapterImageProvider externalAdapterImageProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fee950d", new Object[]{externalAdapterImageProvider});
        } else {
            FCanvasJNIBridge.installExternalAdapterImageProvider(externalAdapterImageProvider);
        }
    }

    private void installOnlineConfigAdapter(oxk oxkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b9b95a", new Object[]{this, oxkVar});
        } else if (oxkVar != null) {
            oxkVar.a(new a(this));
        }
    }

    private void loadFCanvasCoreLibrary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae1d5eb", new Object[]{this});
            return;
        }
        try {
            System.loadLibrary("fcanvas_core");
            printLog(0, "[FCanvasJNIBridge] load library success", null);
        } catch (Throwable th) {
            printLog(3, "[FCanvasJNIBridge] load library failed", th);
        }
    }

    private void loadUnicornLibrary(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94aa38", new Object[]{this, context});
            return;
        }
        try {
            com.taobao.android.weex.b.d().c((Application) context.getApplicationContext());
            printLog(0, "[FCanvasJNIBridge] load library success", null);
        } catch (Throwable th) {
            printLog(3, "[FCanvasJNIBridge] load library failed because of " + th.getMessage(), th);
        }
    }

    public FCanvasInstance createInstance(Context context, String str, String str2, FCanvasInstance.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FCanvasInstance) ipChange.ipc$dispatch("896a48c4", new Object[]{this, context, str, str2, cVar});
        }
        if (context == null || str == null || cVar == null) {
            return null;
        }
        if (this.mIsTinyAppInsideMode) {
            loadFCanvasCoreLibrary();
        } else {
            loadUnicornLibrary(context);
        }
        installImageProviderOnce(this.mImageProvider);
        installOnlineConfigAdapter(this.mOnlineConfigAdapter);
        return new FCanvasInstance(context, str, str2, cVar, this);
    }

    public void updateOnlineConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1c22ef", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            FCanvasJNIBridge.nNotifyOnOnlineConfigChanged(str);
        }
    }

    private FCanvas(b bVar) {
        this.mLoggingAdapter = b.a(bVar);
        this.mOnlineConfigAdapter = b.b(bVar);
        this.mIsTinyAppInsideMode = b.c(bVar);
        this.mImageProvider = b.d(bVar);
    }

    public void printLog(int i, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d875466", new Object[]{this, new Integer(i), str, th});
            return;
        }
        hih hihVar = this.mLoggingAdapter;
        if (hihVar != null) {
            try {
                hihVar.a(3, TAG, str, th);
            } catch (Throwable th2) {
                Log.e(TAG, "unhandled err : ", th2);
            }
        }
    }
}
