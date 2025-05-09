package com.taobao.tao.content.modules;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.content.business.ContentBusinessModel;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.gat;
import tb.jh4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CBModudle extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(701497366);
    }

    public static /* synthetic */ Object ipc$super(CBModudle cBModudle, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/content/modules/CBModudle");
    }

    @JSMethod
    public void requestWithParams(HashMap<String, String> hashMap, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6cdd57", new Object[]{this, hashMap, jSCallback});
        } else if (hashMap != null && hashMap.size() > 0) {
            ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
            contentBusinessModel.itemId = hashMap.get("itemId");
            contentBusinessModel.adUserId = hashMap.get(gat.ACCOUNT_ID);
            contentBusinessModel.scenceId = hashMap.get(gat.BIZ_TYPE);
            contentBusinessModel.contentId = hashMap.get("contentId");
            contentBusinessModel.pageName = hashMap.get("pageName");
            contentBusinessModel.source = "1";
            contentBusinessModel.tcpBid = hashMap.get(gat.TCP_BID);
            String str = hashMap.get("sourceType");
            if (!TextUtils.isEmpty(str)) {
                contentBusinessModel.sourceType = str;
            }
            try {
                contentBusinessModel.context = new JSONObject(hashMap.get("context"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (!TextUtils.isEmpty(contentBusinessModel.tcpBid)) {
                String str2 = hashMap.get(gat.CT);
                contentBusinessModel.ct = str2;
                if (str2.equals("1")) {
                    contentBusinessModel.itemId = hashMap.get("itemId");
                } else if (contentBusinessModel.ct.equals("2")) {
                    contentBusinessModel.sId = hashMap.get(gat.SID);
                }
            }
            if (jh4.a()) {
                String str3 = hashMap.get("actionSource");
                if (!TextUtils.isEmpty(str3)) {
                    contentBusinessModel.actionSource = str3;
                }
                String str4 = hashMap.get("trackSource");
                if (!TextUtils.isEmpty(str4)) {
                    contentBusinessModel.trackSource = str4;
                }
                String str5 = hashMap.get("trackSubSource");
                if (!TextUtils.isEmpty(str5)) {
                    contentBusinessModel.trackSubSource = str5;
                }
            }
            new gat().e(contentBusinessModel, null);
        }
    }

    @JSMethod
    public void addCartWithParams(HashMap<String, String> hashMap, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da9d129", new Object[]{this, hashMap, jSCallback});
        } else if (hashMap != null && this.mWXSDKInstance != null && hashMap.size() > 0) {
            ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
            contentBusinessModel.itemId = hashMap.get("itemId");
            contentBusinessModel.adUserId = hashMap.get(gat.ACCOUNT_ID);
            contentBusinessModel.scenceId = hashMap.get(gat.BIZ_TYPE);
            contentBusinessModel.contentId = hashMap.get("contentId");
            contentBusinessModel.pageName = hashMap.get("pageName");
            contentBusinessModel.source = "3";
            String str = hashMap.get("sourceType");
            if (!TextUtils.isEmpty(str)) {
                contentBusinessModel.sourceType = str;
            }
            try {
                contentBusinessModel.context = new JSONObject(hashMap.get("context"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String str2 = hashMap.get(gat.TCP_BID);
            contentBusinessModel.tcpBid = str2;
            if (!TextUtils.isEmpty(str2)) {
                String str3 = hashMap.get(gat.CT);
                contentBusinessModel.ct = str3;
                if (str3.equals("1")) {
                    contentBusinessModel.itemId = hashMap.get("itemId");
                } else if (contentBusinessModel.ct.equals("2")) {
                    contentBusinessModel.sId = hashMap.get(gat.SID);
                }
            }
            try {
                String str4 = hashMap.get("hideSKULayer");
                if (!TextUtils.isEmpty(str4) && "true".equals(str4)) {
                    contentBusinessModel.source = "2";
                }
            } catch (Exception unused) {
            }
            if (jh4.a()) {
                String str5 = hashMap.get("actionSource");
                if (!TextUtils.isEmpty(str5)) {
                    contentBusinessModel.actionSource = str5;
                }
                String str6 = hashMap.get("trackSource");
                if (!TextUtils.isEmpty(str6)) {
                    contentBusinessModel.trackSource = str6;
                }
                String str7 = hashMap.get("trackSubSource");
                if (!TextUtils.isEmpty(str7)) {
                    contentBusinessModel.trackSubSource = str7;
                }
            }
            if ("3".equals(contentBusinessModel.source)) {
                new gat().b(this.mWXSDKInstance.getContext(), contentBusinessModel, 0);
            } else {
                new gat().a(contentBusinessModel, jSCallback);
            }
        }
    }
}
