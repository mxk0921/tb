package com.zoloz.android.phone.zdoc.bean;

import com.alipay.biometrics.common.proguard.INotProguard;
import com.alipay.mobile.security.bio.config.BisSdkModuleEnum;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioMetaInfo;
import com.alipay.mobile.security.bio.service.BioServiceDescription;
import com.zoloz.android.phone.zdoc.activities.FalconCardNativeActivityNew;
import tb.t2o;
import tb.upx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ZdocMetaInfo extends BioMetaInfo implements INotProguard {
    static {
        t2o.a(245366893);
    }

    public ZdocMetaInfo() {
        BioAppDescription bioAppDescription = new BioAppDescription();
        bioAppDescription.setBioType(110);
        bioAppDescription.setBioAction(0);
        bioAppDescription.setAppName(FalconCardNativeActivityNew.class.getName());
        bioAppDescription.setAppInterfaceName(FalconCardNativeActivityNew.class.getName());
        addApplication(bioAppDescription);
        BioServiceDescription bioServiceDescription = new BioServiceDescription();
        bioServiceDescription.setClazz(upx.class);
        bioServiceDescription.setInterfaceName(upx.class.getName());
        addExtService(bioServiceDescription);
        addProductID(new Long[]{Long.valueOf(BisSdkModuleEnum.SME_UDOC.getProductID())});
    }
}
