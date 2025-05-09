package com.zoloz.android.phone.zdoc.upload;

import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavLog;
import com.alipay.zoloz.toyger.upload.UploadContent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class UploadChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(245366983);
    }

    public abstract void uploadNineShoot(UploadContent uploadContent, BisBehavLog bisBehavLog, String str, String str2);

    public abstract void uploadPaperInfo(UploadContent uploadContent, BisBehavLog bisBehavLog, String str, String str2);
}
