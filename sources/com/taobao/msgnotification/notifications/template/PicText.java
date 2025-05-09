package com.taobao.msgnotification.notifications.template;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.y22;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PicText {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bigIcon;
    public String subTitle;
    public String subTitleColor;
    public String title;
    public String titleColor;
    public String widePic;

    static {
        t2o.a(588251181);
    }

    public CharSequence getSubTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a3b46d25", new Object[]{this});
        }
        return y22.a(this.subTitle, this.subTitleColor);
    }

    public CharSequence getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this});
        }
        return y22.a(this.title, this.titleColor);
    }
}
