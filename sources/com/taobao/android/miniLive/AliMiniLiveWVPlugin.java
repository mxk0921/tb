package com.taobao.android.miniLive;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.efs;
import tb.gsq;
import tb.knr;
import tb.kpw;
import tb.mmr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliMiniLiveWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LIVEID = "liveId";
    private static final String TAG = AliMiniLiveWVPlugin.class.getSimpleName();

    static {
        t2o.a(779091972);
    }

    public static /* synthetic */ Object ipc$super(AliMiniLiveWVPlugin aliMiniLiveWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/AliMiniLiveWVPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        knr knrVar = new knr(str, str2, wVCallBackContext);
        if ("getLiveRoomMiniWindowStatus".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playing", (Object) Boolean.valueOf(mmr.p().w()));
            jSONObject.put("existing", (Object) Boolean.valueOf(mmr.p().v()));
            jSONObject.put("source", (Object) mmr.p().o());
            knrVar.a(jSONObject.toJSONString());
            return true;
        } else if ("startMiniLive".equals(str)) {
            Map<String, String> a2 = gsq.a(str2);
            mmr.p().J(this.mContext, a2.get("liveId"), a2);
            String str3 = TAG;
            efs.a(str3, str + " startMiniLive ");
            return true;
        } else if ("hideMiniLive".equals(str)) {
            mmr.p().s();
            String str4 = TAG;
            efs.a(str4, str + " hideMiniLive ");
            return true;
        } else if (!TextUtils.equals(str, "hideAllMiniLive")) {
            return false;
        } else {
            mmr.p().r();
            String str5 = TAG;
            efs.a(str5, str + " hideAllMiniLive ");
            return true;
        }
    }
}
