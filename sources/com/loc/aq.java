package com.loc;

import android.os.Build;
import com.alipay.mobile.common.logging.api.DeviceProperty;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum aq {
    MIUI("xiaomi"),
    Flyme("meizu"),
    EMUI("huawei"),
    ColorOS("oppo"),
    FuntouchOS("vivo"),
    SmartisanOS("smartisan"),
    AmigoOS("amigo"),
    EUI("letv"),
    Sense("htc"),
    LG("lge"),
    Google("google"),
    NubiaUI(DeviceProperty.ALIAS_NUBIA),
    Other("");
    
    private String n;
    private int o;
    private String p;
    private String q;
    private String r = Build.MANUFACTURER;

    aq(String str) {
        this.n = str;
    }

    public final String a() {
        return this.n;
    }

    public final String b() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "ROM{name='" + name() + "',versionCode=" + this.o + ", versionName='" + this.q + "',ma=" + this.n + "',manufacturer=" + this.r + "'}";
    }

    public final void a(int i) {
        this.o = i;
    }

    public final void b(String str) {
        this.q = str;
    }

    public final void a(String str) {
        this.p = str;
    }
}
