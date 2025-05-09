package com.alipay.android.msp.framework.drm;

import android.content.Context;
import androidx.core.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ConfigChangeMonitor extends ChangeMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ConfigChangeMonitor f3598a;

    public static ConfigChangeMonitor getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigChangeMonitor) ipChange.ipc$dispatch("69c4cbe8", new Object[0]);
        }
        if (f3598a == null) {
            synchronized (ConfigChangeMonitor.class) {
                try {
                    if (f3598a == null) {
                        f3598a = new ConfigChangeMonitor();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3598a;
    }

    public static /* synthetic */ Object ipc$super(ConfigChangeMonitor configChangeMonitor, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -411774471:
                super.hitKey((String) objArr[0], objArr[1]);
                return null;
            case -125293543:
                return super.exit();
            case 119939067:
                super.hitKey((String) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 1465898632:
                super.newContext((String) objArr[0], (Context) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/drm/ConfigChangeMonitor");
        }
    }

    @Override // com.alipay.android.msp.framework.drm.ChangeMonitor
    public /* bridge */ /* synthetic */ Pair exit() {
        return super.exit();
    }

    @Override // com.alipay.android.msp.framework.drm.ChangeMonitor
    public /* bridge */ /* synthetic */ void hitKey(String str, Object obj) {
        super.hitKey(str, obj);
    }

    @Override // com.alipay.android.msp.framework.drm.ChangeMonitor
    public /* bridge */ /* synthetic */ void newContext(String str, Context context) {
        super.newContext(str, context);
    }

    @Override // com.alipay.android.msp.framework.drm.ChangeMonitor
    public /* bridge */ /* synthetic */ void hitKey(String str, Object obj, boolean z) {
        super.hitKey(str, obj, z);
    }

    public void newContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6808e792", new Object[]{this, context});
        } else if (context != null && FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_UPLOAD_RECENTLY_CHANGE)) {
            super.newContext("cashier_config_hit", context);
        }
    }
}
