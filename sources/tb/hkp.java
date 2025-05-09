package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import com.ut.share.business.WWMessageType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hkp extends m6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_IMAGES = "images";
    public static final String FIELD_KEY_BUSSINESS_ID = "businessId";
    public static final String FIELD_KEY_DESCRIPTION = "description";
    public static final String FIELD_KEY_PRICE = "price";
    public static final String FIELD_KEY_TEMPLATE_ID = "templateId";
    public static final String FIELD_KEY_TITLE = "title";
    public static final String FIELD_KEY_URL = "url";
    public static final String NEXT_TAG_ON_SHARE = "onShare";
    public static final String NEXT_TAG_SHARE_FINISH = "onFinish";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements ShareBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f20707a;

        public a(b8v b8vVar) {
            this.f20707a = b8vVar;
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onFinished(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff43b50d", new Object[]{this, map});
            } else {
                hkp.this.B(this.f20707a, "onFinish");
            }
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
            } else {
                hkp.this.B(this.f20707a, hkp.NEXT_TAG_ON_SHARE);
            }
        }
    }

    static {
        t2o.a(156237845);
    }

    public static /* synthetic */ Object ipc$super(hkp hkpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/ShareSubscriberV2");
    }

    @Override // tb.m6v
    public void F(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        JSONObject D = D(b8vVar);
        if (D == null) {
            tj8.a(hkp.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "获取fields失败");
            return;
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = "1";
        if (D.containsKey("businessId")) {
            shareContent.businessId = D.getString("businessId");
        }
        shareContent.templateId = "detail";
        if (D.containsKey("templateId")) {
            shareContent.templateId = D.getString("templateId");
        }
        shareContent.description = D.getString("description");
        List parseArray = JSON.parseArray(D.getJSONArray("images").toJSONString(), String.class);
        HashMap hashMap = new HashMap();
        String[] strArr = (String[]) parseArray.toArray(new String[parseArray.size()]);
        if (strArr != null && strArr.length > 0) {
            hashMap.put("images", strArr);
            shareContent.imageUrl = strArr[0];
        }
        hashMap.put("price", D.getString("price"));
        hashMap.put("title", D.getString("title"));
        shareContent.templateParams = hashMap;
        shareContent.url = D.getString("url");
        shareContent.title = D.getString("title");
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
        ShareBusiness.getInstance();
        ShareBusiness.share((Activity) b8vVar.e(), shareContent, new a(b8vVar));
    }
}
