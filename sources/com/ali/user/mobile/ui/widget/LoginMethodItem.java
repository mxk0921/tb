package com.ali.user.mobile.ui.widget;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginMethodItem extends MenuItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int image;
    private String textBelowIcon;

    static {
        t2o.a(70254886);
    }

    public static /* synthetic */ Object ipc$super(LoginMethodItem loginMethodItem, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ui/widget/LoginMethodItem");
    }

    public int getImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb03799f", new Object[]{this})).intValue();
        }
        return this.image;
    }

    public String getTextBelowIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("257df72", new Object[]{this});
        }
        return this.textBelowIcon;
    }

    public void setImage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3907ce3", new Object[]{this, new Integer(i)});
        } else {
            this.image = i;
        }
    }

    public void setTextBelowIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d43f0ac", new Object[]{this, str});
        } else {
            this.textBelowIcon = str;
        }
    }
}
