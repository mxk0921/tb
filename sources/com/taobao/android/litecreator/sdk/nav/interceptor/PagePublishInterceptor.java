package com.taobao.android.litecreator.sdk.nav.interceptor;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCMedia;
import com.taobao.android.litecreator.base.workflow.IWorkflowData;
import com.taobao.android.litecreator.sdk.nav.LCNavInterceptor;
import com.taobao.android.nav.Nav;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import org.json.JSONObject;
import tb.ckf;
import tb.knv;
import tb.kuu;
import tb.l4n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class PagePublishInterceptor extends LCNavInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705555);
    }

    public static /* synthetic */ Object ipc$super(PagePublishInterceptor pagePublishInterceptor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/nav/interceptor/PagePublishInterceptor");
    }

    @Override // com.taobao.android.litecreator.sdk.nav.LCNavInterceptor
    public void d(JSONObject jSONObject, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74a5aa9", new Object[]{this, jSONObject, context});
            return;
        }
        ckf.g(jSONObject, "publishConfig");
        ckf.g(context, "context");
        PagePublishInterceptor$doNav$doNavAction$1 pagePublishInterceptor$doNav$doNavAction$1 = new PagePublishInterceptor$doNav$doNavAction$1(this, context, jSONObject);
        if (jSONObject.has(UmiWvPlugin.KEY_IMPORT_PICS)) {
            JSONArray parseArray = JSON.parseArray(jSONObject.getString(UmiWvPlugin.KEY_IMPORT_PICS));
            ckf.f(parseArray, "importPicArray");
            UGCMedia l = l(parseArray);
            if (l != null) {
                l.setPublishSessionId(c(jSONObject));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(l4n.f23108a, l.getPublishSessionId());
                Uri e = knv.e(UmiWvPlugin.NEW_PUBLISH_PATH, jSONObject2);
                ckf.f(e, "UriUtil.buildUriWithUrlA…try/publish.html\", query)");
                Bundle bundle = new Bundle();
                bundle.putSerializable(IWorkflowData.KEY, l);
                Nav.from(context).withExtras(bundle).toUri(e);
                return;
            }
            pagePublishInterceptor$doNav$doNavAction$1.invoke();
            return;
        }
        pagePublishInterceptor$doNav$doNavAction$1.invoke();
    }

    @Override // com.taobao.android.litecreator.sdk.nav.LCNavInterceptor
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1bf6a92", new Object[]{this});
        }
        return "litecreator/publish";
    }

    public final UGCImage k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCImage) ipChange.ipc$dispatch("464c1d13", new Object[]{this, str});
        }
        ImageBean k = kuu.k(str);
        if (k == null) {
            return null;
        }
        UGCImage uGCImage = new UGCImage();
        uGCImage.origin = k;
        uGCImage.compress = k;
        return uGCImage;
    }

    public final UGCMedia l(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCMedia) ipChange.ipc$dispatch("7952dfc8", new Object[]{this, jSONArray});
        }
        if (jSONArray.size() == 0) {
            return null;
        }
        UGCMedia uGCMedia = new UGCMedia();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            UGCImage k = k(jSONArray.getString(i));
            if (k != null) {
                uGCMedia.appendImage(k);
            }
        }
        return uGCMedia;
    }
}
