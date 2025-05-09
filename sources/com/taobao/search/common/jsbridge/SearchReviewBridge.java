package com.taobao.search.common.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.kpw;
import tb.nsw;
import tb.r5p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchReviewBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NAME = "GetSrpResult";
    public static final String API_NAME = "TBSearchReview";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792180);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792179);
    }

    public static /* synthetic */ Object ipc$super(SearchReviewBridge searchReviewBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/common/jsbridge/SearchReviewBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        ckf.g(str, "action");
        ckf.g(str2, "params");
        ckf.g(wVCallBackContext, "callback");
        if (!TextUtils.equals(str, ACTION_NAME)) {
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str2);
            if (parseObject == null) {
                return false;
            }
            String string = parseObject.getString("srpKey");
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            nsw nswVar = new nsw();
            r5p r5pVar = r5p.INSTANCE;
            ckf.d(string);
            nswVar.a("data", r5pVar.b(string));
            wVCallBackContext.success(nswVar);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
