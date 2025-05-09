package com.alipay.android.msp.configservice;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.security.realidentity.m;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Method f3532a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public String getBrandName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25d0b47d", new Object[]{this});
        }
        if (this.c == null) {
            try {
                this.c = Build.BRAND.toLowerCase();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(this.c)) {
                this.c = "unknown";
            }
        }
        return this.c;
    }

    public String getDeviceAlias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbaf4115", new Object[]{this});
        }
        if (this.b == null && !l() && !k() && !h() && !b() && !c() && !i() && !m() && !g() && !f() && !a() && !d() && !e() && !j()) {
            this.b = "unknown";
        }
        return this.b;
    }

    public String getDisplayID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccfec2b2", new Object[]{this});
        }
        if (this.f == null) {
            try {
                this.f = Build.DISPLAY.toLowerCase();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(this.f)) {
                this.f = "unknown";
            }
        }
        return this.f;
    }

    public String getManufacturer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77efb12", new Object[]{this});
        }
        if (this.d == null) {
            try {
                this.d = Build.MANUFACTURER.toLowerCase();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            if (TextUtils.isEmpty(this.d)) {
                this.d = "unknown";
            }
        }
        return this.d;
    }

    public String getRomVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cc8fcdb", new Object[]{this});
        }
        if (this.e == null) {
            if (l()) {
                this.e = getSystemProperty(m.x, "");
            } else if (k()) {
                this.e = getSystemProperty(m.w, "");
            } else if (h()) {
                this.e = getSystemProperty(m.y, "");
            } else if (b()) {
                this.e = getSystemProperty(m.v, "");
            } else if (c()) {
                this.e = getSystemProperty(m.z, "");
            } else if (i()) {
                this.e = getSystemProperty(m.A, "");
            } else if (m()) {
                this.e = getSystemProperty(m.B, "");
            } else if (g()) {
                this.e = getSystemProperty(m.C, "");
            } else if (f()) {
                this.e = getSystemProperty(m.D, "");
            } else if (!a() && !d() && !e()) {
                j();
            }
            if (TextUtils.isEmpty(this.e)) {
                String displayID = getDisplayID();
                this.e = displayID;
                if (TextUtils.isEmpty(displayID)) {
                    this.e = "unknown";
                }
            }
            this.e = this.e.toLowerCase();
        }
        return this.e;
    }

    public String getSystemProperty(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            return (String) n().invoke(null, str, str2);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return str2;
        }
    }

    public final Method n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("3aba06eb", new Object[]{this});
        }
        if (this.f3532a == null) {
            try {
                this.f3532a = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return this.f3532a;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e51ad421", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!DeviceProperty.ALIAS_COOLPAD.equals(getBrandName()) && !"yulong".equals(getManufacturer()))) {
            return DeviceProperty.ALIAS_COOLPAD.equals(this.b);
        }
        this.b = DeviceProperty.ALIAS_COOLPAD;
        return true;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9296ce72", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!"huawei".equals(getBrandName()) && !"huawei".equals(getManufacturer()))) {
            return "huawei".equals(this.b);
        }
        this.b = "huawei";
        return true;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab536acf", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!DeviceProperty.ALIAS_LEECO.equals(getBrandName()) && !"lemobile".equals(getManufacturer()))) {
            return DeviceProperty.ALIAS_LEECO.equals(this.b);
        }
        this.b = DeviceProperty.ALIAS_LEECO;
        return true;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7ad6be", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!"lenovo".equals(getBrandName()) && !"lenovo".equals(getManufacturer()))) {
            return "lenovo".equals(this.b);
        }
        this.b = "lenovo";
        return true;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdedcb43", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!"meizu".equals(getBrandName()) && !"meizu".equals(getManufacturer()))) {
            return "meizu".equals(this.b);
        }
        this.b = "meizu";
        return true;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b66af8a", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!DeviceProperty.ALIAS_NUBIA.equals(getBrandName()) && !DeviceProperty.ALIAS_NUBIA.equals(getManufacturer()))) {
            return DeviceProperty.ALIAS_NUBIA.equals(this.b);
        }
        this.b = DeviceProperty.ALIAS_NUBIA;
        return true;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2de67517", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!DeviceProperty.ALIAS_ONEPLUS.equals(getBrandName()) && !DeviceProperty.ALIAS_ONEPLUS.equals(getManufacturer()))) {
            return DeviceProperty.ALIAS_ONEPLUS.equals(this.b);
        }
        this.b = DeviceProperty.ALIAS_ONEPLUS;
        return true;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("815a0b6b", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!"oppo".equals(getBrandName()) && !"oppo".equals(getManufacturer()))) {
            return "oppo".equals(this.b);
        }
        this.b = "oppo";
        return true;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("166466cd", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!DeviceProperty.ALIAS_QIKU.equals(getBrandName()) && !DeviceProperty.ALIAS_QIKU.equals(getManufacturer()))) {
            return DeviceProperty.ALIAS_QIKU.equals(this.b);
        }
        this.b = DeviceProperty.ALIAS_QIKU;
        return true;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de5adf71", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!"samsung".equals(getBrandName()) && !"samsung".equals(getManufacturer()))) {
            return "samsung".equals(this.b);
        }
        this.b = "samsung";
        return true;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56ff4177", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!"vivo".equals(getBrandName()) && !"vivo".equals(getManufacturer()))) {
            return "vivo".equals(this.b);
        }
        this.b = "vivo";
        return true;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ee0a846", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!"xiaomi".equals(getBrandName()) && !"xiaomi".equals(getManufacturer()))) {
            return "xiaomi".equals(this.b);
        }
        this.b = "xiaomi";
        return true;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb949a2", new Object[]{this})).booleanValue();
        }
        if (this.b != null || (!DeviceProperty.ALIAS_ZTE.equals(getBrandName()) && !DeviceProperty.ALIAS_ZTE.equals(getManufacturer()))) {
            return DeviceProperty.ALIAS_ZTE.equals(this.b);
        }
        this.b = DeviceProperty.ALIAS_ZTE;
        return true;
    }
}
