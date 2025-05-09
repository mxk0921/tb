package com.zoloz.android.phone.zdoc.upload;

import com.alibaba.fastjson.JSON;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavLog;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadItem;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.zoloz.toyger.upload.UploadContent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UploadChannelByJson extends UploadChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BioUploadService mBioUploadService;

    static {
        t2o.a(245366984);
    }

    public UploadChannelByJson(BioServiceManager bioServiceManager) {
        if (bioServiceManager != null) {
            this.mBioUploadService = (BioUploadService) bioServiceManager.getBioService(BioUploadService.class);
            return;
        }
        throw new BioIllegalArgumentException("BioServiceManager is null...");
    }

    public static /* synthetic */ Object ipc$super(UploadChannelByJson uploadChannelByJson, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/upload/UploadChannelByJson");
    }

    @Override // com.zoloz.android.phone.zdoc.upload.UploadChannel
    public void uploadNineShoot(UploadContent uploadContent, BisBehavLog bisBehavLog, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3df76db", new Object[]{this, uploadContent, bisBehavLog, str, str2});
        } else if (uploadContent == null || uploadContent.content == null) {
            BioLog.w(new IllegalArgumentException("content is empty"));
        } else {
            BioUploadItem bioUploadItem = new BioUploadItem();
            bioUploadItem.publicKey = str2;
            bioUploadItem.content = uploadContent.content;
            bioUploadItem.log = JSON.toJSONString(bisBehavLog).getBytes();
            bioUploadItem.bisToken = str;
            bioUploadItem.isNeedSendResponse = false;
            bioUploadItem.contentSig = uploadContent.contentSig;
            this.mBioUploadService.upload(bioUploadItem);
        }
    }

    @Override // com.zoloz.android.phone.zdoc.upload.UploadChannel
    public void uploadPaperInfo(UploadContent uploadContent, BisBehavLog bisBehavLog, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c945dca8", new Object[]{this, uploadContent, bisBehavLog, str, str2});
        } else if (uploadContent != null) {
            BioUploadItem bioUploadItem = new BioUploadItem();
            bioUploadItem.publicKey = str2;
            bioUploadItem.content = uploadContent.content;
            bioUploadItem.contentSig = uploadContent.contentSig;
            bioUploadItem.log = JSON.toJSONString(bisBehavLog).getBytes();
            bioUploadItem.bisToken = str;
            bioUploadItem.isNeedSendResponse = true;
            this.mBioUploadService.upload(bioUploadItem);
        }
    }
}
