package com.taobao.android.change.app.icon.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ChangeAppIconJSModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String changeType;
    public String crash;
    public String iconName;

    static {
        t2o.a(284164115);
    }

    public boolean isBackgroud() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbaef6d", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(this.changeType, "BG");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ChangeAppIconJSModel{iconName='" + this.iconName + "', crash='" + this.crash + "', changeType='" + this.changeType + "'}";
    }
}
