package com.alipay.mobile.common.logging;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.security.realidentity.m;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DevicePropertyImpl implements DeviceProperty {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f3935a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public DevicePropertyImpl(Context context) {
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public String getBrandName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25d0b47d", new Object[]{this});
        }
        if (this.d == null) {
            try {
                this.d = Build.BRAND.toLowerCase();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(this.d)) {
                this.d = "unknown";
            }
        }
        return this.d;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public String getDeviceAlias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbaf4115", new Object[]{this});
        }
        if (this.f3935a == null && !isXiaomiDevice() && !isVivoDevice() && !isOppoDevice() && !isHuaweiDevice() && !isLeEcoDevice() && !isQikuDevice() && !isZteDevice() && !isOnePlusDevice() && !isNubiaDevice() && !isCoolpadDevice() && !isLenovoDevice() && !isMeizuDevice() && !isSamsungDevice()) {
            this.f3935a = "unknown";
        }
        return this.f3935a;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public String getDisplayID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccfec2b2", new Object[]{this});
        }
        if (this.e == null) {
            try {
                this.e = Build.DISPLAY.toLowerCase();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(this.e)) {
                this.e = "unknown";
            }
        }
        return this.e;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public String getFingerPrint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2255d42b", new Object[]{this});
        }
        if (this.f == null) {
            try {
                this.f = Build.FINGERPRINT.toLowerCase();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(this.f)) {
                this.f = "unknown";
            }
        }
        return this.f;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public String getManufacturer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77efb12", new Object[]{this});
        }
        if (this.c == null) {
            try {
                this.c = Build.MANUFACTURER.toLowerCase();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(this.c)) {
                this.c = "unknown";
            }
        }
        return this.c;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public String getRomVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cc8fcdb", new Object[]{this});
        }
        if (this.b == null) {
            if (isXiaomiDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.x, "");
            } else if (isVivoDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.w, "");
            } else if (isOppoDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.y, "");
            } else if (isHuaweiDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.v, "");
            } else if (isLeEcoDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.z, "");
            } else if (isQikuDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.A, "");
            } else if (isZteDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.B, "");
            } else if (isOnePlusDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.C, "");
            } else if (isNubiaDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.D, "");
            } else if (!isCoolpadDevice() && !isLenovoDevice() && !isMeizuDevice()) {
                isSamsungDevice();
            }
            if (TextUtils.isEmpty(this.b)) {
                String displayID = getDisplayID();
                this.b = displayID;
                if (TextUtils.isEmpty(displayID)) {
                    this.b = "unknown";
                }
            }
            this.b = this.b.toLowerCase();
        }
        return this.b;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isCoolpadDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e51ad421", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!DeviceProperty.ALIAS_COOLPAD.equals(getBrandName()) && !"yulong".equals(getManufacturer()))) {
            return DeviceProperty.ALIAS_COOLPAD.equals(this.f3935a);
        }
        this.f3935a = DeviceProperty.ALIAS_COOLPAD;
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isHuaweiDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9296ce72", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!"huawei".equals(getBrandName()) && !"huawei".equals(getManufacturer()))) {
            return "huawei".equals(this.f3935a);
        }
        this.f3935a = "huawei";
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isLeEcoDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab536acf", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!DeviceProperty.ALIAS_LEECO.equals(getBrandName()) && !"lemobile".equals(getManufacturer()))) {
            return DeviceProperty.ALIAS_LEECO.equals(this.f3935a);
        }
        this.f3935a = DeviceProperty.ALIAS_LEECO;
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isLenovoDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7ad6be", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!"lenovo".equals(getBrandName()) && !"lenovo".equals(getManufacturer()))) {
            return "lenovo".equals(this.f3935a);
        }
        this.f3935a = "lenovo";
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isMeizuDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdedcb43", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!"meizu".equals(getBrandName()) && !"meizu".equals(getManufacturer()))) {
            return "meizu".equals(this.f3935a);
        }
        this.f3935a = "meizu";
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isNubiaDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b66af8a", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!DeviceProperty.ALIAS_NUBIA.equals(getBrandName()) && !DeviceProperty.ALIAS_NUBIA.equals(getManufacturer()))) {
            return DeviceProperty.ALIAS_NUBIA.equals(this.f3935a);
        }
        this.f3935a = DeviceProperty.ALIAS_NUBIA;
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isOnePlusDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2de67517", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!DeviceProperty.ALIAS_ONEPLUS.equals(getBrandName()) && !DeviceProperty.ALIAS_ONEPLUS.equals(getManufacturer()))) {
            return DeviceProperty.ALIAS_ONEPLUS.equals(this.f3935a);
        }
        this.f3935a = DeviceProperty.ALIAS_ONEPLUS;
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isOppoDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("815a0b6b", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!"oppo".equals(getBrandName()) && !"oppo".equals(getManufacturer()))) {
            return "oppo".equals(this.f3935a);
        }
        this.f3935a = "oppo";
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isQikuDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("166466cd", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!DeviceProperty.ALIAS_QIKU.equals(getBrandName()) && !DeviceProperty.ALIAS_QIKU.equals(getManufacturer()))) {
            return DeviceProperty.ALIAS_QIKU.equals(this.f3935a);
        }
        this.f3935a = DeviceProperty.ALIAS_QIKU;
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isSamsungDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de5adf71", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!"samsung".equals(getBrandName()) && !"samsung".equals(getManufacturer()))) {
            return "samsung".equals(this.f3935a);
        }
        this.f3935a = "samsung";
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isVivoDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56ff4177", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!"vivo".equals(getBrandName()) && !"vivo".equals(getManufacturer()))) {
            return "vivo".equals(this.f3935a);
        }
        this.f3935a = "vivo";
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isXiaomiDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ee0a846", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!"xiaomi".equals(getBrandName()) && !"xiaomi".equals(getManufacturer()))) {
            return "xiaomi".equals(this.f3935a);
        }
        this.f3935a = "xiaomi";
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isZteDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb949a2", new Object[]{this})).booleanValue();
        }
        if (this.f3935a != null || (!DeviceProperty.ALIAS_ZTE.equals(getBrandName()) && !DeviceProperty.ALIAS_ZTE.equals(getManufacturer()))) {
            return DeviceProperty.ALIAS_ZTE.equals(this.f3935a);
        }
        this.f3935a = DeviceProperty.ALIAS_ZTE;
        return true;
    }
}
