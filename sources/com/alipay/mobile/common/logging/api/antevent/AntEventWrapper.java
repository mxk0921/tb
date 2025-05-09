package com.alipay.mobile.common.logging.api.antevent;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AntEventWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AntEvent f3949a;

    public AntEventWrapper(AntEvent antEvent) {
        this.f3949a = antEvent;
    }

    public void addExtParams5(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e2d4aa", new Object[]{this, str, str2});
            return;
        }
        AntEvent antEvent = this.f3949a;
        if (antEvent != null) {
            antEvent.addExtParam5(str, str2);
        }
    }

    public AntEvent getAntEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AntEvent) ipChange.ipc$dispatch("a95adc39", new Object[]{this});
        }
        return this.f3949a;
    }

    public void setAbtestId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddbd75c1", new Object[]{this, str});
            return;
        }
        AntEvent antEvent = this.f3949a;
        if (antEvent != null) {
            antEvent.setAbtestId(str);
        }
    }

    public void setNeedAbtest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f818ffa2", new Object[]{this, new Boolean(z)});
            return;
        }
        AntEvent antEvent = this.f3949a;
        if (antEvent != null) {
            antEvent.setNeedAbtest(z);
        }
    }

    public void setPageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1a849d", new Object[]{this, str});
            return;
        }
        AntEvent antEvent = this.f3949a;
        if (antEvent != null) {
            antEvent.setPageId(str);
        }
    }

    public void setParam1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a067257", new Object[]{this, str});
            return;
        }
        AntEvent antEvent = this.f3949a;
        if (antEvent != null) {
            antEvent.setParam1(str);
        }
    }

    public void setParam2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4380b98", new Object[]{this, str});
            return;
        }
        AntEvent antEvent = this.f3949a;
        if (antEvent != null) {
            antEvent.setParam1(str);
        }
    }

    public void setParam3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e69a4d9", new Object[]{this, str});
            return;
        }
        AntEvent antEvent = this.f3949a;
        if (antEvent != null) {
            antEvent.setParam1(str);
        }
    }

    public void setRenderBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376b1806", new Object[]{this, str});
            return;
        }
        AntEvent antEvent = this.f3949a;
        if (antEvent != null) {
            antEvent.setRenderBizType(str);
        }
    }
}
