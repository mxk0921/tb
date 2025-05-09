package com.taobao.message.sp.chat.transformer;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.inner2.DiffResult;
import com.taobao.message.lab.comfrm.inner2.DiffTransfomer;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.observable.RuntimeIncUpdateMap;
import com.taobao.message.sp.framework.model.SimpleMessage;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleMessageSenderViewDataTransformer implements DiffTransfomer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LEFT = 1;
    public static final int NONE = 0;
    public static final int RIGHT = 2;

    static {
        t2o.a(551551010);
        t2o.a(537919597);
    }

    public static int getHeadType(String str, String str2, String str3, String str4) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3547dc52", new Object[]{str, str2, str3, str4})).intValue();
        }
        if (TextUtils.isEmpty(str) ? !TextUtils.equals(str3, str2) : TextUtils.equals(str, str2)) {
            i = 1;
        }
        if (TextUtils.equals("imba", str4)) {
            return 0;
        }
        return i;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.DiffTransfomer
    public DiffResult transform(Action action, SharedState sharedState, Diff diff) {
        SimpleMessageListData simpleMessageListData;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiffResult) ipChange.ipc$dispatch("8370bb6b", new Object[]{this, action, sharedState, diff});
        }
        if (!StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName()) || (simpleMessageListData = (SimpleMessageListData) sharedState.getOriginData(SimpleMessageListData.SOURCE_NAME_MESSAGE, SimpleMessageListData.class, null)) == null || simpleMessageListData.list == null) {
            return null;
        }
        String str3 = (String) sharedState.getProp("entityType", String.class, null);
        String str4 = (String) sharedState.getProp("accountId", String.class, null);
        SimpleProfile simpleProfile = (SimpleProfile) sharedState.getProp("selfProfile", SimpleProfile.class, null);
        SimpleProfile simpleProfile2 = (SimpleProfile) sharedState.getProp("targetProfile", SimpleProfile.class, null);
        String str5 = (String) sharedState.getProp("targetNick", String.class, null);
        RuntimeIncUpdateMap copy = RuntimeIncUpdateMap.copy((RuntimeIncUpdateMap) sharedState.getRuntimeData("messageSenderViewDataMap", RuntimeIncUpdateMap.class, new RuntimeIncUpdateMap(16)));
        for (ResultData<SimpleMessage> resultData : simpleMessageListData.list) {
            JSONObject jSONObject = new JSONObject();
            int headType = getHeadType(str5, resultData.getMainData().getSender().getTargetId(), str4, str3);
            jSONObject.put("headType", (Object) Integer.valueOf(headType));
            if (!(headType == 0 || simpleProfile == null || simpleProfile2 == null)) {
                if (headType == 1) {
                    str = simpleProfile2.getAvatarURL();
                } else {
                    str = simpleProfile.getAvatarURL();
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("headIcon", (Object) str);
                }
                if (headType == 1) {
                    str2 = simpleProfile2.getDisplayName();
                } else {
                    str2 = simpleProfile.getDisplayName();
                }
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put(SimpleProfile.KEY_DISPLAYNAME, (Object) str2);
                }
            }
            copy.put(resultData.getMainData().getCode().getClientId(), (String) jSONObject);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("messageSenderViewDataMap", copy);
        return new DiffResult(sharedState.updateRuntimeData(hashMap), null);
    }
}
