package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sz4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHECK_BACKGROUND_NOT_INTERRUPT = "backgroundNotInterrupt";
    public static final String CHECK_FLOAT_PERMISSION = "checkFloatPermission";
    public static final String CHECK_GP_MARKET = "checkGPMarket";
    public static final String GLOBAL_POP_INTERVAL_DAY = "globalPopIntervalDay";
    public static final String GREY_DOWNLOAD_ENABLE = "isGrayDownloadEnable";
    public static final String NEW_STRATEGY_ENABLE = "isNewUpdateStrategyEnable";
    public static final String NEW_STRATEGY_FORBID_MTL_POP_ENABLE = "isNewUpdateForbidMTLPopEnable";
    public static final String PRE_DOWNLOAD_WINDOW_DAY = "preDownloadWindowDay";
    public static final String UPDATE_DATA_VALID_INTERVAL = "promoteUpdateValidInterval";
    public static final String USE_ARCH = "useArch";
    public static final String USE_MD5 = "downloadUseMD5";
    public static final String WIFI_PRE_DOWNLOAD = "isWifiPreDownloadEnable";

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f28367a = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final sz4 f28368a = new sz4();

        static {
            t2o.a(790626320);
        }

        public static /* synthetic */ sz4 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sz4) ipChange.ipc$dispatch("27a835d1", new Object[0]);
            }
            return f28368a;
        }
    }

    static {
        t2o.a(790626319);
    }

    public static sz4 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sz4) ipChange.ipc$dispatch("47032bf6", new Object[0]);
        }
        return a.a();
    }

    public final void e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d43064", new Object[]{this, str, new Boolean(z)});
            return;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("update_manager", str, "");
            if (!TextUtils.isEmpty(config)) {
                lz4.i().m(str, Boolean.parseBoolean(config));
            } else {
                lz4.i().m(str, z);
            }
        } catch (Throwable th) {
            wdm.h("UpdaterOrangeListener.updateBoolean.error.orangeKey=" + str, th);
        }
    }

    public final void f(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46f5b5ce", new Object[]{this, str, new Long(j)});
            return;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("update_manager", str, "");
            if (!TextUtils.isEmpty(config)) {
                lz4.i().n(str, Long.parseLong(config));
            } else {
                lz4.i().n(str, j);
            }
        } catch (Throwable th) {
            wdm.h("UpdaterOrangeListener.updateLong.error.orangeKey=" + str, th);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c111c8c", new Object[]{this});
        } else if (!this.f28367a.getAndSet(true)) {
            OrangeConfig.getInstance().registerListener(new String[]{"update_manager"}, new obk() { // from class: tb.rz4
                @Override // tb.obk
                public final void onConfigUpdate(String str, Map map) {
                    sz4.this.c(str, map);
                }
            }, true);
        }
    }

    public final /* synthetic */ void c(String str, Map map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22038ddf", new Object[]{this, str, map});
            return;
        }
        try {
            e(WIFI_PRE_DOWNLOAD, true);
            e(USE_MD5, false);
            e(NEW_STRATEGY_ENABLE, true);
            e(NEW_STRATEGY_FORBID_MTL_POP_ENABLE, true);
            f(GLOBAL_POP_INTERVAL_DAY, 3L);
            f(PRE_DOWNLOAD_WINDOW_DAY, 3L);
            e(USE_ARCH, true);
            f(UPDATE_DATA_VALID_INTERVAL, 86400L);
            e(CHECK_FLOAT_PERMISSION, true);
            e(CHECK_GP_MARKET, true);
            e(CHECK_BACKGROUND_NOT_INTERRUPT, true);
            e(GREY_DOWNLOAD_ENABLE, false);
            if (map != null && map.containsKey("configVersion")) {
                str2 = (String) map.get("configVersion");
                if (!TextUtils.isEmpty(str2)) {
                    wdm.f(wdm.CATEGORY_CONFIG_UPDATE, "", "configGroup=update_managerconfigVersion=" + str2);
                }
            }
            str2 = "";
            wdm.f(wdm.CATEGORY_CONFIG_UPDATE, "", "configGroup=update_managerconfigVersion=" + str2);
        } catch (Throwable th) {
            wdm.h("UpdaterOrangeListener.onConfigUpdate error", th);
        }
    }
}
