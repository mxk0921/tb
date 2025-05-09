package com.taobao.android.detail.ttdetail.dinamicx.event;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.TitleLongClickImplementor;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import tb.e28;
import tb.ir;
import tb.ob5;
import tb.t2o;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailDinamicCopyEventHandlerV3 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Long DX_EVENT_ID = 20175625671960L;
    public static final String EVENT_TAG = "xCopy";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f6770a;

    static {
        t2o.a(912261755);
    }

    public DetailDinamicCopyEventHandlerV3(Context context, ze7 ze7Var) {
        this.f6770a = ze7Var;
    }

    public static /* synthetic */ Object ipc$super(DetailDinamicCopyEventHandlerV3 detailDinamicCopyEventHandlerV3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/dinamicx/event/DetailDinamicCopyEventHandlerV3");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext != null && dXRuntimeContext.h() != null && objArr != null && objArr.length != 0 && (i = dXRuntimeContext.i()) != null && i.getJSONObject("fields") != null) {
            this.f6770a.b().h(new ir(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.dinamicx.event.DetailDinamicCopyEventHandlerV3.1
                {
                    put("type", TitleLongClickImplementor.EVENT_TYPE);
                }
            }), e28.b(objArr, dXRuntimeContext, this.f6770a));
        }
    }
}
