package com.alibaba.triver.cannal_engine.scene;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.flat.widget.Widget;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TRWidgetJsPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TRWidgetJsPlugin";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements ITriverRemoteProxy.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f2937a;
        public final /* synthetic */ WVCallBackContext b;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.triver.cannal_engine.scene.TRWidgetJsPlugin$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class C0097a implements TRWidgetInfoGetter.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0097a() {
            }

            @Override // com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter.a
            public void a(String str, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3987b210", new Object[]{this, str, str2, str3});
                } else {
                    a.this.b.error(str2);
                }
            }

            @Override // com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter.a
            public void onSuccess(JSONArray jSONArray) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("aa3000d3", new Object[]{this, jSONArray});
                    return;
                }
                nsw nswVar = new nsw();
                nswVar.a("result", jSONArray);
                a.this.b.success(nswVar);
            }
        }

        public a(TRWidgetJsPlugin tRWidgetJsPlugin, JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
            this.f2937a = jSONObject;
            this.b = wVCallBackContext;
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
            } else {
                this.b.error("Invalid implementation");
            }
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                ((TRWidgetInfoGetter) RVProxy.get(TRWidgetInfoGetter.class)).request(this.f2937a, Boolean.TRUE, new C0097a());
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TRWidgetJsPlugin tRWidgetJsPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/scene/TRWidgetJsPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null || wVCallBackContext.getWebview() == null) {
            RVLogger.e(TAG, "execute: wvCallBackContext is null");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error("invalid action");
            RVLogger.e(TAG, "execute: action is null");
            return false;
        } else {
            try {
                jSONObject = JSON.parseObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
            str.hashCode();
            if (!str.equals("requestWidgetInfos")) {
                return false;
            }
            try {
                com.alibaba.android.triver.base.api.a.b(Widget.TAG, "", ITriverRemoteProxy.DependenceMode.TRIVER_ONLY, wVCallBackContext.getWebview().getContext(), new a(this, jSONObject, wVCallBackContext));
            } catch (Throwable th) {
                RVLogger.e(TAG, th);
                wVCallBackContext.error("Invalid implementation");
            }
            return true;
        }
    }
}
