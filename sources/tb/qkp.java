package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qkp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321713);
    }

    public static ShareContent b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("d36d2b87", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("simpleShareItemModel");
        return new oip().b(jSONObject2.getString("businessId")).f(jSONObject2.getString("title")).c(jSONObject2.getString("desc")).d(jSONObject2.getString("imageUrl")).e(jSONObject2.getString("shareUrl")).a();
    }

    public static ShareContent a(JSONObject jSONObject) {
        boolean z;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("469965db", new Object[]{jSONObject});
        }
        try {
            JSONArray jSONArray2 = jSONObject.getJSONArray("rightBtnList");
            int size = jSONArray2.size() - 1;
            while (true) {
                if (size < 0) {
                    z = false;
                    break;
                }
                JSONObject jSONObject3 = (JSONObject) jSONArray2.get(size);
                if (TextUtils.equals("more", jSONObject3.getString(MspWebActivity.BTN_TYPE))) {
                    z = jSONObject3.getJSONObject("fields").getBooleanValue("showShare");
                    break;
                }
                size--;
            }
            if (!z || (jSONArray = jSONObject.getJSONArray("shareAction")) == null || jSONArray.size() == 0 || (jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("fields")) == null) {
                return null;
            }
            if (jSONObject2.containsKey("simpleShareItemModel")) {
                return b(jSONObject2);
            }
            JSONObject jSONObject4 = jSONObject2.getJSONObject("shareItemModel");
            JSONArray jSONArray3 = jSONObject4.getJSONArray("images");
            ShareContent shareContent = new ShareContent();
            shareContent.businessId = "1";
            shareContent.description = jSONObject4.getString("itemTitle");
            shareContent.snapshotImages = new ArrayList();
            Iterator<Object> it = jSONArray3.iterator();
            while (it.hasNext()) {
                shareContent.snapshotImages.add(it.next().toString());
            }
            Uri.Builder buildUpon = Uri.parse(bwr.NAV_URL_DETAIL_BASE + jSONObject4.getString("itemId") + ".htm").buildUpon();
            buildUpon.appendQueryParameter("price", jSONObject4.getString("price"));
            buildUpon.appendQueryParameter("original_price", jSONObject4.getString("originalPrice"));
            buildUpon.appendQueryParameter("sourceType", "item");
            shareContent.url = buildUpon.toString();
            shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
            shareContent.templateId = "detail";
            HashMap hashMap = new HashMap();
            hashMap.put("price", jSONObject4.getString("price"));
            shareContent.extendParams = hashMap;
            shareContent.imageUrl = jSONArray3.get(0).toString();
            return shareContent;
        } catch (Throwable unused) {
        }
        return null;
    }
}
