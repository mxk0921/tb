package com.taobao.share.core.services;

import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.service.AidlService;
import com.taobao.share.aidl.IShareGenerateShortUrl;
import com.taobao.share.aidl.IShareGenerateShortUrlCallBack;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.constants.TPAction;
import com.taobao.tao.TaobaoApplication;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareTargetType;
import java.util.Map;
import tb.akp;
import tb.ehs;
import tb.eis;
import tb.fis;
import tb.gis;
import tb.hjp;
import tb.kwr;
import tb.t2o;
import tb.vhs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareGenerateShortUrlService extends AidlService<IShareGenerateShortUrl, ShareGenerateShortUrlBinder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ShareGenerateShortUrl";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class ShareGenerateShortUrlBinder extends IShareGenerateShortUrl.Stub {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements gis {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f11749a;
            public final /* synthetic */ IShareGenerateShortUrlCallBack b;

            public a(ShareGenerateShortUrlBinder shareGenerateShortUrlBinder, String str, IShareGenerateShortUrlCallBack iShareGenerateShortUrlCallBack) {
                this.f11749a = str;
                this.b = iShareGenerateShortUrlCallBack;
            }

            @Override // tb.gis
            public void a(fis fisVar, vhs vhsVar) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("663f302b", new Object[]{this, fisVar, vhsVar});
                    return;
                }
                if (vhsVar == null || TextUtils.isEmpty(vhsVar.c)) {
                    str = akp.b(this.f11749a);
                } else {
                    str = akp.b(vhsVar.c);
                }
                if (!TextUtils.isEmpty(str)) {
                    kwr.g(hjp.a(), kwr.TAO_PASSWORD_FROM_PIC_SAVE_KEY, str);
                }
                IShareGenerateShortUrlCallBack iShareGenerateShortUrlCallBack = this.b;
                if (iShareGenerateShortUrlCallBack != null) {
                    try {
                        iShareGenerateShortUrlCallBack.callBack(str);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        static {
            t2o.a(664797255);
        }

        public ShareGenerateShortUrlBinder() {
        }

        @Override // com.taobao.share.aidl.IShareGenerateShortUrl
        public void generateShorUrl(String str, IShareGenerateShortUrlCallBack iShareGenerateShortUrlCallBack) throws RemoteException {
            eis a2 = ShareGenerateShortUrlService.a(ShareGenerateShortUrlService.this, str);
            if (a2 != null) {
                String str2 = a2.c;
                String urlBackFlow = ShareServiceApi.urlBackFlow(a2.f18604a, "QRCode", str2);
                if (!TextUtils.isEmpty(urlBackFlow)) {
                    akp.h(ShareTargetType.Share2QRCode.getValue());
                    if (!TextUtils.isEmpty(urlBackFlow) && !str2.equals(urlBackFlow)) {
                        str2 = urlBackFlow;
                    }
                }
                a2.c = str2;
                a2.k = "qrcode";
                try {
                    ehs.j().i(hjp.a().getApplicationContext(), a2, TPAction.COPY, new a(this, str2, iShareGenerateShortUrlCallBack), ShareBizAdapter.getInstance().getAppEnv().getTTID());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (iShareGenerateShortUrlCallBack != null) {
                iShareGenerateShortUrlCallBack.callBack(null);
            }
        }
    }

    static {
        t2o.a(664797254);
    }

    public ShareGenerateShortUrlService() {
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ eis a(ShareGenerateShortUrlService shareGenerateShortUrlService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eis) ipChange.ipc$dispatch("75c3c1de", new Object[]{shareGenerateShortUrlService, str});
        }
        return shareGenerateShortUrlService.b(str);
    }

    public static /* synthetic */ Object ipc$super(ShareGenerateShortUrlService shareGenerateShortUrlService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/core/services/ShareGenerateShortUrlService");
    }

    public final eis b(String str) {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eis) ipChange.ipc$dispatch("e32a8fc2", new Object[]{this, str});
        }
        eis eisVar = null;
        try {
            Map map = (Map) JSON.parse(str);
            eis eisVar2 = new eis();
            try {
                eisVar2.f18604a = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_BUSINESS_ID);
                eisVar2.b = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_DESP);
                eisVar2.c = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_URL);
                eisVar2.d = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_IMAGE_URL);
                eisVar2.e = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_CONTENTTYPE);
                String str2 = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_PARAMS);
                if (!TextUtils.isEmpty(str2)) {
                    eisVar2.h = (Map) JSON.parse(str2);
                }
                String str3 = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_TITLE);
                if (Boolean.parseBoolean(((String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_DISABLE_CLIENT)).toString())) {
                    eisVar2.l = 0;
                }
                eisVar2.f = "copy";
                Object obj = map.get(ShareBusiness.SHARE_INTENT_EXTAR_POPTYPE);
                if (obj != null) {
                    eisVar2.i = TBShareContent.TaoPasswordPopType.findType(obj.toString()).name;
                    eisVar2.j = (String) map.get(ShareBusiness.SHARE_INTENT_EXTAR_POPURL);
                }
                return eisVar2;
            } catch (Exception e2) {
                e = e2;
                eisVar = eisVar2;
                e.printStackTrace();
                return eisVar;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
