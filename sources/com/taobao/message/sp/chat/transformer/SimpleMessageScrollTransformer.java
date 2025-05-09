package com.taobao.message.sp.chat.transformer;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.message.chatv2.aura.messageflow.transformer.ListOperator;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.inner2.DiffResult;
import com.taobao.message.lab.comfrm.inner2.DiffTransfomer;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.sp.chat.transformer.SimpleMessageListDataStatusTransformer;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleMessageScrollTransformer implements DiffTransfomer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(551551009);
        t2o.a(537919597);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.DiffTransfomer
    public DiffResult transform(Action action, SharedState sharedState, Diff diff) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiffResult) ipChange.ipc$dispatch("8370bb6b", new Object[]{this, action, sharedState, diff});
        }
        if (StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
            SimpleMessageListDataStatusTransformer.SimpleListInfo simpleListInfo = (SimpleMessageListDataStatusTransformer.SimpleListInfo) sharedState.getRuntimeData("listStatus", SimpleMessageListDataStatusTransformer.SimpleListInfo.class, null);
            int intValue = ((Integer) sharedState.getRuntimeData("firstLoadScroll", Integer.class, 0)).intValue();
            int intValue2 = ((Integer) sharedState.getRuntimeData("scrollBottomOut", Integer.class, 1)).intValue();
            JSONArray jSONArray = new JSONArray();
            SimpleMessageListDataStatusTransformer.SimpleListInfo simpleListInfo2 = new SimpleMessageListDataStatusTransformer.SimpleListInfo();
            if (simpleListInfo != null) {
                simpleListInfo2.status = simpleListInfo.status;
                if (simpleListInfo.cmd != null) {
                    simpleListInfo2.cmd = new JSONArray(simpleListInfo.cmd);
                }
            }
            String str = (String) sharedState.getProp("mainList", String.class, "");
            SimpleMessageListData simpleMessageListData = (SimpleMessageListData) sharedState.getOriginData(SimpleMessageListData.SOURCE_NAME_MESSAGE, SimpleMessageListData.class, null);
            if (intValue != 0 || simpleMessageListData == null || simpleMessageListData.list == null) {
                i = intValue;
            } else {
                boolean equals = "0".equals(sharedState.getProp("oldToNew", String.class, null));
                if (!TextUtils.isEmpty(str) && !equals) {
                    jSONArray.add(ListOperator.scrollBottom(str));
                }
            }
            if (simpleMessageListData != null && !TextUtils.isEmpty(simpleMessageListData.reason) && (TextUtils.equals(simpleMessageListData.reason, SimpleMessageListData.REASON_SEND) || (TextUtils.equals(simpleMessageListData.reason, SimpleMessageListData.REASON_ARRIVE) && intValue2 > 0))) {
                jSONArray.add(ListOperator.scrollBottom(str));
            }
            if (!jSONArray.isEmpty()) {
                sharedState = sharedState.addInstantOperation(jSONArray);
                if (simpleListInfo2.cmd == null) {
                    simpleListInfo2.cmd = new JSONArray();
                }
                simpleListInfo2.cmd.addAll(jSONArray);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("listStatus", simpleListInfo2);
            if (i > 0) {
                hashMap.put("firstLoadScroll", Integer.valueOf(i));
            }
            return new DiffResult(sharedState.updateRuntimeData(hashMap), null);
        }
        String str2 = (String) sharedState.getProp("recordStyle", String.class, "0");
        if (!ChatInputConstant.ACTION_PANEL_ENTRY_CLICK.equals(action.getName()) && !ChatInputConstant.ACTION_GOODS_ENTRY_CLICK.equals(action.getName()) && !ChatInputConstant.ACTION_EXPRESSION_ENTRY_CLICK.equals(action.getName()) && !ChatInputConstant.ACTION_ON_KEYBOARD_SHOW.equals(action.getName()) && (!"1".equals(str2) || !ChatInputConstant.ACTION_CHANGE_INPUT_MODE.equals(action.getName()))) {
            return null;
        }
        SimpleMessageListDataStatusTransformer.SimpleListInfo copyWithState = SimpleMessageListDataStatusTransformer.SimpleListInfo.copyWithState(sharedState);
        JSONArray jSONArray2 = new JSONArray();
        String str3 = (String) sharedState.getProp("mainList", String.class, "");
        if (!TextUtils.isEmpty(str3)) {
            jSONArray2.add(ListOperator.scrollBottom(str3));
            copyWithState.cmd.addAll(jSONArray2);
        }
        if (!jSONArray2.isEmpty()) {
            sharedState = sharedState.addInstantOperation(jSONArray2);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("listStatus", copyWithState);
        return new DiffResult(sharedState.updateRuntimeData(hashMap2), null);
    }
}
