package com.taobao.share.wvapi.servicebrige;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.share.aidl.IShareGenerateShortUrl;
import com.taobao.share.aidl.IShareGenerateShortUrlCallBack;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.TBShareMediaInfo;
import com.ut.share.business.TBShareMediaPublisher;
import com.ut.share.business.WWMessageType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareGenerateShortUrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f11786a;
    public final IShareGenerateShortUrlCallBack b = new IShareGenerateShortUrlCallBack.Stub() { // from class: com.taobao.share.wvapi.servicebrige.ShareGenerateShortUrl.2
        @Override // com.taobao.share.aidl.IShareGenerateShortUrlCallBack
        public void callBack(String str) throws RemoteException {
            b bVar = ShareGenerateShortUrl.this.f11786a;
            if (bVar != null) {
                bVar.result(str);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends AsyncTask<Void, Void, IShareGenerateShortUrl> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11787a;
        public final /* synthetic */ ShareContent b;

        public a(Context context, ShareContent shareContent) {
            this.f11787a = context;
            this.b = shareContent;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/wvapi/servicebrige/ShareGenerateShortUrl$1");
        }

        /* renamed from: a */
        public IShareGenerateShortUrl doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IShareGenerateShortUrl) ipChange.ipc$dispatch("941333d4", new Object[]{this, voidArr});
            }
            try {
                Context context = this.f11787a;
                if (context instanceof Activity) {
                    return (IShareGenerateShortUrl) Services.get(context, IShareGenerateShortUrl.class);
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(IShareGenerateShortUrl iShareGenerateShortUrl) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("375270f2", new Object[]{this, iShareGenerateShortUrl});
            } else if (iShareGenerateShortUrl != null) {
                try {
                    iShareGenerateShortUrl.generateShorUrl(JSON.toJSONString(ShareGenerateShortUrl.this.c(this.b)), ShareGenerateShortUrl.a(ShareGenerateShortUrl.this));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void result(String str);
    }

    static {
        t2o.a(663748634);
    }

    public static /* synthetic */ IShareGenerateShortUrlCallBack a(ShareGenerateShortUrl shareGenerateShortUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IShareGenerateShortUrlCallBack) ipChange.ipc$dispatch("f389540d", new Object[]{shareGenerateShortUrl});
        }
        return shareGenerateShortUrl.b;
    }

    public void b(Context context, ShareContent shareContent, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e506f9", new Object[]{this, context, shareContent, bVar});
            return;
        }
        this.f11786a = bVar;
        new a(context, shareContent).execute(new Void[0]);
    }

    public Map<String, String> c(ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b6acde2", new Object[]{this, shareContent});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_BUSINESS_ID, shareContent.businessId);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_BUSINESS_ID, shareContent.businessId);
        if (TextUtils.isEmpty(shareContent.contentType)) {
            shareContent.contentType = shareContent.shareScene;
        }
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_CONTENTTYPE, shareContent.contentType);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_TITLE, shareContent.title);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_DESP, shareContent.description);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_IMAGE_URL, shareContent.imageUrl);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_URL, shareContent.url);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_TEMPLATE_ID, shareContent.templateId);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_WEIXINTYPE, shareContent.weixinMsgType);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_ISACTIVITY, shareContent.isActivity);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_SAVECONTENT, shareContent.needSaveContent);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_WEIXIN_APPID, shareContent.weixinAppId);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_DISABLE_CLIENT, Boolean.toString(shareContent.disableBackToClient));
        List<String> list = shareContent.snapshotImages;
        if (list != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_SNAPSHOT_IMAGES, JSON.toJSONString(list));
        }
        String str = shareContent.headUrl;
        if (str != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_HEAD_URL, str);
        }
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_DISABLE_QRCODE, Boolean.toString(shareContent.disableQrcode));
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_DISABLE_TEXTINFO, Boolean.toString(shareContent.disableTextInfo));
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_DISABLE_HEAD_IMG, Boolean.toString(shareContent.disableHeadUrl));
        JSONObject jSONObject = shareContent.qrConfig;
        if (jSONObject != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_QR_CONFIG, JSON.toJSONString(jSONObject));
        }
        WWMessageType wWMessageType = shareContent.wwMsgType;
        if (wWMessageType != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_WWMSGTYPE, wWMessageType.getValue());
        } else {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_WWMSGTYPE, WWMessageType.WWMessageTypeDefault.getValue());
        }
        Map<String, String> map = shareContent.activityParams;
        if (map != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_ACTIVITY_PARAMS, JSON.toJSONString(map));
        }
        Map<String, Object> map2 = shareContent.templateParams;
        if (map2 != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_TEMPLATE_PARAMS, JSON.toJSONString(map2));
        }
        if (shareContent.extendParams == null) {
            shareContent.extendParams = shareContent.extraParams;
        }
        Map<String, String> map3 = shareContent.extendParams;
        if (map3 != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_PARAMS, JSON.toJSONString(map3));
        }
        Map<String, String> map4 = shareContent.businessInfo;
        if (map4 != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_BUSINESS_INFO, JSON.toJSONString(map4));
        }
        if (!TextUtils.isEmpty(shareContent.maskAlpha)) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_MASK_ALPHA, shareContent.maskAlpha);
        }
        if (shareContent.popType != ShareContent.TaoPasswordPopType.NONE && !TextUtils.isEmpty(shareContent.popUrl)) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_POPTYPE, shareContent.popType.getName());
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_POPURL, shareContent.popUrl);
        }
        List<String> list2 = shareContent.phoneNumberList;
        if (list2 != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_PHONE_NUMBER, JSON.toJSONString(list2));
        }
        Map<String, String> map5 = shareContent.markMap;
        if (map5 != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_MARK_MAP, JSON.toJSONString(map5));
        }
        if (!TextUtils.isEmpty(shareContent.smsTemplate)) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_SMS_TEMPLATE, shareContent.smsTemplate);
        }
        if (!TextUtils.isEmpty(shareContent.qrTipsText)) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_QR_TIPS_TXT, shareContent.qrTipsText);
        }
        TBShareMediaInfo tBShareMediaInfo = shareContent.mediaInfo;
        if (tBShareMediaInfo != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_MEDIAINFO, JSON.toJSONString(tBShareMediaInfo));
        }
        TBShareMediaPublisher tBShareMediaPublisher = shareContent.mediaPublisher;
        if (tBShareMediaPublisher != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_MEDIAPUBLISHER, JSON.toJSONString(tBShareMediaPublisher));
        }
        return hashMap;
    }
}
