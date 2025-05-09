package com.taobao.taolive.dinamicext.taolivedinamic;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.nav.Nav;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.ob5;
import tb.qzb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DXTBLDinamicClickHandler extends ob5 implements IMTOPDataObject {
    public static final long DX_EVENT_TBLTAP = 10220236261038765L;

    static {
        t2o.a(779092450);
        t2o.a(589299906);
    }

    private qzb getClickCallback(View view) {
        if (view instanceof qzb) {
            return (qzb) view;
        }
        if (view != null) {
            return getClickCallback((ViewGroup) view.getParent());
        }
        return null;
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        if (objArr != null && objArr.length > 0 && dXRuntimeContext != null) {
            Context h = dXRuntimeContext.h();
            JSONObject jSONObject = (JSONObject) objArr[0];
            if (jSONObject != null && h != null) {
                if (jSONObject.get("nativeFeedDetailUrl") != null) {
                    String string = jSONObject.getString("nativeFeedDetailUrl");
                    if (!TextUtils.isEmpty(string)) {
                        Nav.from(h).toUri(string);
                    }
                }
                qzb clickCallback = getClickCallback(dXRuntimeContext.D());
                if (clickCallback != null) {
                    clickCallback.a();
                }
            }
        }
    }
}
