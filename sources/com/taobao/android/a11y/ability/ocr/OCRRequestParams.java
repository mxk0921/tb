package com.taobao.android.a11y.ability.ocr;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OCRRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String imgList;

    static {
        t2o.a(335544346);
    }

    public String getImgList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2b18d0e", new Object[]{this});
        }
        return this.imgList;
    }

    public void setImgList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a839d90", new Object[]{this, str});
        } else {
            this.imgList = str;
        }
    }
}
