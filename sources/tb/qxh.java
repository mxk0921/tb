package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.innercall.InnerOpenPublishAbility;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qxh implements lpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ShareBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f26982a;

        public a(qxh qxhVar, pvh pvhVar) {
            this.f26982a = pvhVar;
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onFinished(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff43b50d", new Object[]{this, map});
                return;
            }
            dwh.b("MUShareModule", "into--[onFinished]");
            if (map != null && map.containsKey("result")) {
                if (TextUtils.equals("no target", map.get("result"))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", (Object) "failure");
                    this.f26982a.b(jSONObject);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", (Object) "success");
                this.f26982a.b(jSONObject2);
            }
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
                return;
            }
            dwh.b("MUShareModule", "into--[onShare]");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", (Object) "click");
            if (shareTargetType != null) {
                jSONObject.put("target", (Object) shareTargetType.getValue());
            }
            this.f26982a.b(jSONObject);
        }
    }

    @Override // tb.lpd
    public void a(Context context, String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9030840", new Object[]{this, context, str, pvhVar});
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            ShareContent shareContent = new ShareContent();
            String str2 = "";
            shareContent.businessId = jSONObject.has("businessId") ? jSONObject.getString("businessId") : str2;
            shareContent.disableHeadUrl = jSONObject.has("disableHeadUrl") ? jSONObject.getBoolean("disableHeadUrl") : false;
            shareContent.disableQrcode = jSONObject.has("disableQrcode") ? jSONObject.getBoolean("disableQrcode") : false;
            shareContent.disableTextInfo = jSONObject.has("disableTextInfo") ? jSONObject.getBoolean("disableTextInfo") : false;
            shareContent.title = jSONObject.has("title") ? jSONObject.getString("title") : str2;
            String string = jSONObject.has("text") ? jSONObject.getString("text") : str2;
            if (TextUtils.isEmpty(string)) {
                string = "我分享给你了一个淘宝页面，快来看看吧";
            }
            shareContent.description = string;
            shareContent.imageUrl = jSONObject.has("image") ? jSONObject.getString("image") : str2;
            Map<String, Object> map = null;
            shareContent.snapshotImages = jSONObject.has("images") ? JSON.parseArray(jSONObject.getString("images"), String.class) : null;
            shareContent.url = jSONObject.has("url") ? jSONObject.getString("url") : str2;
            shareContent.contentType = jSONObject.has("contentType") ? jSONObject.getString("contentType") : str2;
            shareContent.extendParams = jSONObject.has("extendParams") ? (Map) JSON.parseObject(jSONObject.getString("extendParams"), Map.class) : null;
            shareContent.businessInfo = jSONObject.has("businessInfo") ? (Map) JSON.parseObject(jSONObject.getString("businessInfo"), Map.class) : null;
            String str3 = "false";
            shareContent.isActivity = jSONObject.has("isActivity") ? jSONObject.getString("isActivity") : str3;
            shareContent.activityParams = jSONObject.has(InnerOpenPublishAbility.PARAMS_URL_PARAMS) ? (Map) JSON.parseObject(jSONObject.getString(InnerOpenPublishAbility.PARAMS_URL_PARAMS), Map.class) : null;
            if (jSONObject.has("needSaveContent")) {
                str3 = jSONObject.getString("needSaveContent");
            }
            shareContent.needSaveContent = str3;
            shareContent.disableBackToClient = jSONObject.has("disableBackToClient") ? jSONObject.getBoolean("disableBackToClient") : false;
            shareContent.weixinAppId = jSONObject.has("weixinAppId") ? jSONObject.getString("weixinAppId") : str2;
            shareContent.weixinMsgType = jSONObject.has("weixinMsgType") ? jSONObject.getString("weixinMsgType") : str2;
            shareContent.qrTipsText = jSONObject.has("qrTipsText") ? jSONObject.getString("qrTipsText") : str2;
            shareContent.templateId = jSONObject.has("templateId") ? jSONObject.getString("templateId") : str2;
            shareContent.shareId = jSONObject.has("shareId") ? jSONObject.getString("shareId") : str2;
            shareContent.shareScene = jSONObject.has("scene") ? jSONObject.getString("scene") : str2;
            if (jSONObject.has("targets")) {
                str2 = jSONObject.getString("targets");
            }
            if (jSONObject.has("templateParams")) {
                map = (Map) JSON.parseObject(jSONObject.getString("templateParams"), Map.class);
            }
            shareContent.templateParams = map;
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.equals("all", str2)) {
                if (!TextUtils.isEmpty(str2)) {
                    for (String str4 : str2.split(",")) {
                        arrayList.add(str4);
                    }
                } else {
                    arrayList.add("3");
                    arrayList.add("13");
                    arrayList.add("0");
                }
            }
            if (context instanceof Activity) {
                ShareBusiness.share((Activity) context, arrayList, shareContent, new a(this, pvhVar));
            }
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", (Object) "failure");
            pvhVar.b(jSONObject2);
            Toast.makeText(context, "分享失败", 0).show();
        }
    }
}
