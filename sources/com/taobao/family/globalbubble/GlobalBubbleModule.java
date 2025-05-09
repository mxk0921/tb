package com.taobao.family.globalbubble;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.Globals;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.jr7;
import tb.yca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class GlobalBubbleModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FAMILY_TAG = "FamilyBubble";
    private String extendStatus = "";

    public static /* synthetic */ Object ipc$super(GlobalBubbleModule globalBubbleModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/family/globalbubble/GlobalBubbleModule");
    }

    @JSMethod(uiThread = true)
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            yca.p().m();
        }
    }

    @JSMethod(uiThread = false)
    public void fetchCurrentVC(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e990d5", new Object[]{this, jSCallback});
        } else if (jSCallback != null) {
            jSCallback.invoke(new JSONObject() { // from class: com.taobao.family.globalbubble.GlobalBubbleModule.1
                {
                    put("activity", (Object) yca.p().d);
                }
            });
        }
    }

    @JSMethod(uiThread = false)
    public void fetchExtraData(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb32e461", new Object[]{this, jSCallback});
        } else if (jSCallback != null) {
            HashMap<String, String> o = yca.p().o();
            if (o != null) {
                jSCallback.invoke(o);
            } else {
                jSCallback.invoke(null);
            }
        }
    }

    @JSMethod(uiThread = true)
    public void open() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d975d1", new Object[]{this});
        } else {
            yca.p().z();
        }
    }

    @JSMethod(uiThread = false)
    public void openToIM(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f198381a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("familyDetailUrl", str);
            Nav.from(Globals.getApplication()).withExtras(bundle).toUri(str);
        }
    }

    @JSMethod(uiThread = true)
    public void remove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41689b0b", new Object[]{this});
        } else {
            yca.p().r(GlobalWindowFactory.WINDOW_SHAREBACK);
        }
    }

    @JSMethod(uiThread = false)
    public void syncExtendStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cc6138", new Object[]{this, str});
        } else {
            this.extendStatus = str;
        }
    }

    @JSMethod(uiThread = false)
    public void syncRect(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2118ac70", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            List<RectBean> parseArray = JSON.parseArray(str, RectBean.class);
            ArrayList arrayList = new ArrayList();
            if (parseArray == null || parseArray.size() <= 0) {
                yca.p().f = null;
                return;
            }
            for (RectBean rectBean : parseArray) {
                RectBean rectBean2 = new RectBean();
                rectBean2.top = jr7.j(rectBean.top);
                rectBean2.left = jr7.j(rectBean.left);
                rectBean2.width = jr7.j(rectBean.width);
                rectBean2.height = jr7.j(rectBean.height);
                arrayList.add(rectBean2);
            }
            yca.p().f = arrayList;
        }
    }
}
