package com.taobao.browser.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.ipb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BrowserConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIGNAME_LOADING = "loading";
    public static final String KEY_DATA = "-wv-data";
    public static final String SPNAME_CONFIG = "browser_config_";
    public static volatile BrowserConfigManager b = null;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, ipb> f10256a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum WVConfigUpdateFromType {
        WVConfigUpdateFromTypeCustom,
        WVConfigUpdateFromTypeActive,
        WVConfigUpdateFromTypeFinish,
        WVConfigUpdateFromTypePush,
        WVConfigUpdateFromTypeLaunch,
        WVConfigUpdateFromTypeAppActive,
        WVConfigUpdateFromTypeLocaleChange,
        WVConfigUpdateFromZCache3_0;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(WVConfigUpdateFromType wVConfigUpdateFromType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/config/BrowserConfigManager$WVConfigUpdateFromType");
        }

        public static WVConfigUpdateFromType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WVConfigUpdateFromType) ipChange.ipc$dispatch("417eaf8e", new Object[]{str});
            }
            return (WVConfigUpdateFromType) Enum.valueOf(WVConfigUpdateFromType.class, str);
        }
    }

    static {
        t2o.a(619708483);
    }

    public static BrowserConfigManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserConfigManager) ipChange.ipc$dispatch("e81219dd", new Object[0]);
        }
        if (b == null) {
            synchronized (BrowserConfigManager.class) {
                try {
                    if (b == null) {
                        b = new BrowserConfigManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void b(String str, ipb ipbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c06ae3", new Object[]{this, str, ipbVar});
        } else {
            this.f10256a.put(str, ipbVar);
        }
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76314f8", new Object[]{this, str, str2});
            return;
        }
        ipb ipbVar = this.f10256a.get(str);
        if (ipbVar != null) {
            ipbVar.a(str2);
        }
    }
}
