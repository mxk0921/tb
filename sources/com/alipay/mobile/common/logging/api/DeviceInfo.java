package com.alipay.mobile.common.logging.api;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import tb.pg1;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static DeviceInfo e;

    /* renamed from: a  reason: collision with root package name */
    public int f3944a;
    public int b;
    public final Context c;
    public boolean d = false;

    public DeviceInfo(Context context) {
        this.c = context;
    }

    public static DeviceInfo getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceInfo) ipChange.ipc$dispatch("f86be4f0", new Object[]{context});
        }
        if (e == null) {
            synchronized (DeviceInfo.class) {
                try {
                    if (e == null) {
                        DeviceInfo deviceInfo = new DeviceInfo(context);
                        e = deviceInfo;
                        Display defaultDisplay = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getRealMetrics(displayMetrics);
                        deviceInfo.f3944a = displayMetrics.widthPixels;
                        deviceInfo.b = displayMetrics.heightPixels;
                        deviceInfo.updateAccessibilityState();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public boolean getIsAccessibilityEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6d9105e", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public String getResolution() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd471797", new Object[]{this});
        }
        return this.b + "x" + this.f3944a;
    }

    public int getScreenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int getScreenWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[]{this})).intValue();
        }
        return this.f3944a;
    }

    public void updateAccessibilityState() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f089c713", new Object[]{this});
            return;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.c.getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (isEnabled && isTouchExplorationEnabled) {
                z = true;
            }
            this.d = z;
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("DeviceInfo_log", th);
        }
    }
}
