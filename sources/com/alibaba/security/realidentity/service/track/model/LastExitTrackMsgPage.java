package com.alibaba.security.realidentity.service.track.model;

import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum LastExitTrackMsgPage {
    H5("h5"),
    BIO(ALBiometricsActivityParentView.p),
    TAKE_PHOTO(ChatInputConstant.PANEL_ID_TAKE_PHOTO);
    
    public String msg;

    LastExitTrackMsgPage(String str) {
        this.msg = str;
    }

    public String getMsg() {
        return this.msg;
    }
}
