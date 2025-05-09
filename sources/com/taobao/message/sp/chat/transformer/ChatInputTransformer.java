package com.taobao.message.sp.chat.transformer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.message.chat.input.data.ChatInputVO;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.ext.ActionExtKt;
import com.taobao.message.lab.comfrm.inner2.DeltaItem;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.inner2.DiffResult;
import com.taobao.message.lab.comfrm.inner2.DiffTransfomer;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import kotlin.Metadata;
import kotlin.collections.a;
import tb.ckf;
import tb.jpu;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\"\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¨\u0006\u001a"}, d2 = {"Lcom/taobao/message/sp/chat/transformer/ChatInputTransformer;", "Lcom/taobao/message/lab/comfrm/inner2/DiffTransfomer;", "()V", "generateNewStateByAction", "Lcom/taobao/message/chat/input/data/ChatInputVO;", "action", "Lcom/taobao/message/lab/comfrm/core/Action;", "chatInputVO", "state", "Lcom/taobao/message/lab/comfrm/inner2/SharedState;", "getDraft", "", "processActionBarExpressionClick", "processActionBarGoodsClick", "processActionBarKeyboardClick", "processChangeInputMode", "processCollapsePanel", "processOnKeyboardHide", "processOnKeyboardShow", "processPanelEntryClick", "processScrollBegin", "processTxtChange", "transform", "Lcom/taobao/message/lab/comfrm/inner2/DiffResult;", "diff", "Lcom/taobao/message/lab/comfrm/inner2/Diff;", "message_sp_chat_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ChatInputTransformer implements DiffTransfomer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(551551002);
        t2o.a(537919597);
    }

    private final ChatInputVO generateNewStateByAction(Action action, ChatInputVO chatInputVO, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatInputVO) ipChange.ipc$dispatch("2c0e683f", new Object[]{this, action, chatInputVO, sharedState});
        }
        String name = action.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -2054849820:
                    if (name.equals(ChatInputConstant.ACTION_KEYBOARD_ENTRY_CLICK)) {
                        return processActionBarKeyboardClick(chatInputVO);
                    }
                    break;
                case -1295041547:
                    if (name.equals(ChatInputConstant.ACTION_PANEL_ENTRY_CLICK)) {
                        return processPanelEntryClick(chatInputVO);
                    }
                    break;
                case -1110756415:
                    if (name.equals(ChatInputConstant.ACTION_COLLAPSE_PANEL)) {
                        return processCollapsePanel(action, chatInputVO);
                    }
                    break;
                case -334853582:
                    if (name.equals(ChatInputConstant.ACTION_ON_KEYBOARD_HIDE)) {
                        return processOnKeyboardHide(action, chatInputVO);
                    }
                    break;
                case 1203104087:
                    if (name.equals(ChatInputConstant.ACTION_ON_KEYBOARD_SHOW)) {
                        return processOnKeyboardShow(action, chatInputVO);
                    }
                    break;
                case 1382215485:
                    if (name.equals(ChatInputConstant.ACTION_TEXT_CHANGE)) {
                        return processTxtChange(action, chatInputVO);
                    }
                    break;
                case 1444496061:
                    if (name.equals(ChatInputConstant.ACTION_CHANGE_INPUT_MODE)) {
                        return processChangeInputMode(action, chatInputVO, sharedState);
                    }
                    break;
                case 1595549375:
                    if (name.equals(ChatInputConstant.ACTION_EXPRESSION_ENTRY_CLICK)) {
                        return processActionBarExpressionClick(chatInputVO);
                    }
                    break;
                case 1857004761:
                    if (name.equals(ChatInputConstant.ACTION_GOODS_ENTRY_CLICK)) {
                        return processActionBarGoodsClick(chatInputVO);
                    }
                    break;
                case 2038225372:
                    if (name.equals("scrollBegin")) {
                        return processScrollBegin(action, chatInputVO);
                    }
                    break;
            }
        }
        return null;
    }

    private final String getDraft(SharedState sharedState) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee2f1e0a", new Object[]{this, sharedState});
        }
        Object prop = sharedState.getProp("conversation", Object.class, null);
        if (prop == null) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(JSON.toJSONString(prop));
            if (parseObject == null || (jSONObject = parseObject.getJSONObject("conversationContent")) == null) {
                return null;
            }
            return jSONObject.getString("draft");
        } catch (Exception unused) {
            return null;
        }
    }

    private final ChatInputVO processActionBarExpressionClick(ChatInputVO chatInputVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatInputVO) ipChange.ipc$dispatch("fae5c1cd", new Object[]{this, chatInputVO});
        }
        chatInputVO.setPanelStatus(1);
        chatInputVO.setSelectedActionBarId(ChatInputConstant.PANEL_ID_EMOJI);
        chatInputVO.setInputMode(0);
        return chatInputVO;
    }

    private final ChatInputVO processActionBarGoodsClick(ChatInputVO chatInputVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatInputVO) ipChange.ipc$dispatch("1545e9ef", new Object[]{this, chatInputVO});
        }
        chatInputVO.setPanelStatus(1);
        chatInputVO.setSelectedActionBarId("goods");
        chatInputVO.setInputMode(0);
        return chatInputVO;
    }

    private final ChatInputVO processActionBarKeyboardClick(ChatInputVO chatInputVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatInputVO) ipChange.ipc$dispatch("b925539c", new Object[]{this, chatInputVO});
        }
        chatInputVO.setPanelStatus(1);
        chatInputVO.setSelectedActionBarId("keyboard");
        chatInputVO.setInputMode(0);
        return chatInputVO;
    }

    private final ChatInputVO processCollapsePanel(Action action, ChatInputVO chatInputVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatInputVO) ipChange.ipc$dispatch("d9ab1358", new Object[]{this, action, chatInputVO});
        }
        chatInputVO.setPanelStatus(0);
        return chatInputVO;
    }

    private final ChatInputVO processOnKeyboardHide(Action action, ChatInputVO chatInputVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatInputVO) ipChange.ipc$dispatch("32507e87", new Object[]{this, action, chatInputVO});
        }
        if (chatInputVO.getPanelStatus() == 1 && ckf.b(chatInputVO.getSelectedActionBarId(), "keyboard")) {
            chatInputVO.setPanelStatus(0);
        }
        chatInputVO.setForceRefreshSign(System.currentTimeMillis());
        return chatInputVO;
    }

    private final ChatInputVO processOnKeyboardShow(Action action, ChatInputVO chatInputVO) {
        boolean z;
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatInputVO) ipChange.ipc$dispatch("9bbaa902", new Object[]{this, action, chatInputVO});
        }
        if (chatInputVO.getInputMode() == 0) {
            z = true;
        } else {
            z = false;
        }
        CharSequence text = chatInputVO.getText();
        if (text == null || text.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        chatInputVO.setShowSendBtn(z3);
        chatInputVO.setPanelStatus(1);
        chatInputVO.setInputMode(0);
        chatInputVO.setSelectedActionBarId("keyboard");
        chatInputVO.setForceRefreshSign(System.currentTimeMillis());
        return chatInputVO;
    }

    private final ChatInputVO processPanelEntryClick(ChatInputVO chatInputVO) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatInputVO) ipChange.ipc$dispatch("40530de4", new Object[]{this, chatInputVO});
        }
        if (chatInputVO.getPanelStatus() != 2) {
            i = 2;
        }
        chatInputVO.setPanelStatus(i);
        chatInputVO.setSelectedActionBarId("keyboard");
        chatInputVO.setInputMode(0);
        return chatInputVO;
    }

    private final ChatInputVO processScrollBegin(Action action, ChatInputVO chatInputVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatInputVO) ipChange.ipc$dispatch("618a265d", new Object[]{this, action, chatInputVO});
        }
        if (chatInputVO.getPanelStatus() == 0) {
            return null;
        }
        chatInputVO.setInputMode(chatInputVO.getInputMode());
        chatInputVO.setPanelStatus(0);
        chatInputVO.setSelectedActionBarId(chatInputVO.getSelectedActionBarId());
        chatInputVO.setShowSendBtn(chatInputVO.getShowSendBtn());
        return chatInputVO;
    }

    private final ChatInputVO processChangeInputMode(Action action, ChatInputVO chatInputVO, SharedState sharedState) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatInputVO) ipChange.ipc$dispatch("728b159a", new Object[]{this, action, chatInputVO, sharedState});
        }
        String str2 = (String) sharedState.getProp("recordStyle", String.class, "0");
        int i = (chatInputVO.getInputMode() != 0 || !ckf.b("0", str2)) ? 0 : 1;
        boolean b = ckf.b("1", str2);
        CharSequence text = chatInputVO.getText();
        boolean z2 = text == null || text.length() == 0;
        chatInputVO.setInputMode(i);
        chatInputVO.setPanelStatus(b ? 1 : 0);
        if (ckf.b("1", str2)) {
            str = "record";
        } else {
            str = "keyboard";
        }
        chatInputVO.setSelectedActionBarId(str);
        if (i != 0 || z2 || ckf.b(chatInputVO.getSelectedActionBarId(), "record")) {
            z = false;
        }
        chatInputVO.setShowSendBtn(z);
        return chatInputVO;
    }

    private final ChatInputVO processTxtChange(Action action, ChatInputVO chatInputVO) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatInputVO) ipChange.ipc$dispatch("21089c01", new Object[]{this, action, chatInputVO});
        }
        String stringFromData = ActionExtKt.getStringFromData(action, "text");
        boolean z2 = chatInputVO.getInputMode() == 0;
        boolean z3 = stringFromData == null || stringFromData.length() == 0;
        boolean b = ckf.b("record", chatInputVO.getSelectedActionBarId());
        chatInputVO.setText(stringFromData);
        if (!z2 || z3 || b) {
            z = false;
        }
        chatInputVO.setShowSendBtn(z);
        return chatInputVO;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.DiffTransfomer
    public DiffResult transform(Action action, SharedState sharedState, Diff diff) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiffResult) ipChange.ipc$dispatch("8370bb6b", new Object[]{this, action, sharedState, diff});
        }
        ckf.h(action, "action");
        ckf.h(sharedState, "state");
        ckf.h(diff, "diff");
        ChatInputVO chatInputVO = (ChatInputVO) sharedState.getRuntimeData("inputViewObjects", ChatInputVO.class, null);
        if (chatInputVO == null) {
            ChatInputVO chatInputVO2 = new ChatInputVO();
            chatInputVO2.setSelectedActionBarId("keyboard");
            chatInputVO2.setInitText(getDraft(sharedState));
            return new DiffResult(sharedState.updateRuntimeData(a.k(jpu.a("inputViewObjects", chatInputVO2))), diff.updateRuntimeDiff(a.k(jpu.a("inputViewObjects", new DeltaItem(102, Boolean.FALSE)))));
        }
        ChatInputVO generateNewStateByAction = generateNewStateByAction(action, chatInputVO.copy(), sharedState);
        if (generateNewStateByAction == null) {
            return null;
        }
        return new DiffResult(sharedState.updateRuntimeData(a.k(jpu.a("inputViewObjects", generateNewStateByAction))), diff.updateRuntimeDiff(a.k(jpu.a("inputViewObjects", new DeltaItem(102, Boolean.valueOf(chatInputVO.isOnlyTextChanged(generateNewStateByAction)))))));
    }
}
