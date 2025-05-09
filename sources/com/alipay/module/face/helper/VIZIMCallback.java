package com.alipay.module.face.helper;

import android.text.TextUtils;
import com.alipay.mobile.security.zim.api.ZIMCallback;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.module.common.FaceDetectUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VIZIMCallback implements ZIMCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FaceCertHelper f4500a;

    public VIZIMCallback(FaceCertHelper faceCertHelper) {
        this.f4500a = faceCertHelper;
    }

    public boolean response(ZIMResponse zIMResponse) {
        int i;
        HashMap hashMap;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60fd2bfb", new Object[]{this, zIMResponse})).booleanValue();
        }
        FaceCertHelper faceCertHelper = this.f4500a;
        if (faceCertHelper.f.getAndSet(true)) {
            VerifyLogCat.w("FaceCertHelper", "Bio has already callback and do nothing");
        } else {
            if (zIMResponse == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                hashMap.put("code", String.valueOf(zIMResponse.code));
                hashMap.put("reason", zIMResponse.reason);
                hashMap.put("subCode", zIMResponse.subCode);
                hashMap.put("msg", zIMResponse.msg);
                Map map = zIMResponse.extInfo;
                if (map != null) {
                    hashMap.put("bioFaceRes", (String) map.get("zimAction"));
                }
            }
            faceCertHelper.a("UC-MobileIC-160316-2", "mdsdswkjhd", hashMap);
            VerifyLogCat.d("FaceCertHelper", "faceResult: " + zIMResponse + ", token:" + faceCertHelper.b);
            String str = "1006";
            if (zIMResponse == null || faceCertHelper.b == null) {
                VerifyLogCat.w("FaceCertHelper", "ZIMResponse or token is null");
                MicroModuleContext.getInstance().notifyAndFinishModule(faceCertHelper.f4489a, faceCertHelper.b, faceCertHelper.d.getModuleName(), new DefaultModuleResult(str));
            } else if (1000 != zIMResponse.code) {
                try {
                    String str2 = (String) zIMResponse.extInfo.get("zimAction");
                    VerifyLogCat.i("FaceCertHelper", "ZIM 回调数据：" + str2);
                    i2 = Integer.valueOf(str2).intValue();
                } catch (Throwable th) {
                    VerifyLogCat.e("FaceCertHelper", th);
                    i2 = 0;
                }
                if (303 == i2) {
                    faceCertHelper.b();
                } else {
                    int i3 = zIMResponse.code;
                    if (2006 == i3) {
                        faceCertHelper.a(zIMResponse);
                    } else if (1003 == i3 && 100 == i2) {
                        try {
                            faceCertHelper.e.putString(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, "1003");
                            faceCertHelper.e.putString("zimAction", "100");
                        } catch (Throwable th2) {
                            VerifyLogCat.e("FaceCertHelper", th2);
                        }
                        faceCertHelper.a(zIMResponse);
                    } else {
                        if (1001 != i3) {
                            str = "1003";
                        }
                        DefaultModuleResult defaultModuleResult = new DefaultModuleResult(str);
                        HashMap<String, Object> hashMap2 = new HashMap<>();
                        hashMap2.put("faceResult", Integer.valueOf(i2));
                        hashMap2.put("faceMemo", FaceDetectUtils.a(i2));
                        if (!TextUtils.isEmpty(faceCertHelper.g)) {
                            hashMap2.put("desensName", faceCertHelper.g);
                        }
                        Map<? extends String, ? extends Object> map2 = zIMResponse.extInfo;
                        if (map2 != null) {
                            hashMap2.putAll(map2);
                        }
                        defaultModuleResult.setExtInfo(hashMap2);
                        VerifyLogCat.i("FaceCertHelper", "ZIMResponse success = false");
                        MicroModuleContext.getInstance().notifyAndFinishModule(faceCertHelper.f4489a, faceCertHelper.b, faceCertHelper.d.getModuleName(), defaultModuleResult);
                    }
                }
            } else {
                faceCertHelper.a(zIMResponse);
            }
        }
        if (zIMResponse == null || !(1000 == (i = zIMResponse.code) || 2006 == i)) {
            VerifyLogCat.i("VIZIMCallback", "人脸可以主动销毁");
            return true;
        }
        VerifyLogCat.i("VIZIMCallback", "response() 核身返回false，告之人脸不主动销毁");
        return false;
    }
}
