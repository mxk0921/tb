package com.taobao.message.sp.chat.transformer;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Transformer;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleConversationBaseInfoTransformer implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(551551003);
        t2o.a(537919673);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        String str;
        SimpleConversation simpleConversation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        SimpleProfile simpleProfile = (SimpleProfile) sharedState.getProp("targetProfile", SimpleProfile.class, null);
        if (simpleProfile != null) {
            str = simpleProfile.getDisplayName();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && (simpleConversation = (SimpleConversation) sharedState.getProp("conversation", SimpleConversation.class, null)) != null) {
            str = simpleConversation.getConversationContent().getConversationName();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SimpleProfile.KEY_DISPLAYNAME, (Object) str);
        HashMap hashMap = new HashMap();
        hashMap.put("conversationDisplayInfo", jSONObject);
        return sharedState.updateRuntimeData(hashMap);
    }
}
