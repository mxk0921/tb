package com.taobao.search.common.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.h2p;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SuggestPageBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_ACTIVATE = "getActivateData";
    public static final String ACTION_BG_WORDS = "getBGWordsData";
    public static final String ACTION_SUGGEST = "getSuggestData";
    public static final String API_NAME = "TBSearchSuggestBridge";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792183);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792182);
    }

    public static /* synthetic */ Object ipc$super(SuggestPageBridge suggestPageBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/common/jsbridge/SuggestPageBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (!(parseObject == null || str == null)) {
            int hashCode = str.hashCode();
            if (hashCode != 431298995) {
                if (hashCode != 1195718168) {
                    if (hashCode == 2128263192 && str.equals(ACTION_SUGGEST)) {
                        try {
                            int intValue = parseObject.getIntValue("searchSuggestPageId");
                            if (intValue <= 0) {
                                return false;
                            }
                            nsw nswVar = new nsw();
                            nswVar.d("data", h2p.c().d(Integer.valueOf(intValue)));
                            if (wVCallBackContext != null) {
                                wVCallBackContext.success(nswVar);
                            }
                            return true;
                        } catch (Exception unused) {
                            return false;
                        }
                    }
                } else if (str.equals(ACTION_BG_WORDS)) {
                    try {
                        int intValue2 = parseObject.getIntValue("searchDoorPageId");
                        if (intValue2 <= 0) {
                            return false;
                        }
                        nsw nswVar2 = new nsw();
                        nswVar2.d("data", h2p.c().b(Integer.valueOf(intValue2)));
                        if (wVCallBackContext != null) {
                            wVCallBackContext.success(nswVar2);
                        }
                        return true;
                    } catch (Exception unused2) {
                        return false;
                    }
                }
            } else if (str.equals(ACTION_ACTIVATE)) {
                try {
                    int intValue3 = parseObject.getIntValue("searchDoorPageId");
                    if (intValue3 <= 0) {
                        return false;
                    }
                    nsw nswVar3 = new nsw();
                    nswVar3.d("data", h2p.c().a(Integer.valueOf(intValue3)));
                    if (wVCallBackContext != null) {
                        wVCallBackContext.success(nswVar3);
                    }
                    return true;
                } catch (Exception unused3) {
                }
            }
        }
        return false;
    }
}
