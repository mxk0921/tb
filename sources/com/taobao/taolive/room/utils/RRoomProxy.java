package com.taobao.taolive.room.utils;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.mediaplatform.MediaPlatformFrame;
import com.taobao.taolive.room.mediaplatform.MediaPlatformFrame2;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import java.util.HashMap;
import java.util.Map;
import tb.cdr;
import tb.d9m;
import tb.iod;
import tb.j5m;
import tb.jlc;
import tb.pap;
import tb.ppv;
import tb.pvs;
import tb.rbu;
import tb.t2o;
import tb.tfo;
import tb.u90;
import tb.up6;
import tb.ux9;
import tb.vkr;
import tb.vx9;
import tb.yj4;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RRoomProxy implements IRRoomProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final RRoomProxy f13266a = new RRoomProxy();

        static {
            t2o.a(779093360);
        }

        public static /* synthetic */ RRoomProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RRoomProxy) ipChange.ipc$dispatch("1737af6f", new Object[0]);
            }
            return f13266a;
        }
    }

    static {
        t2o.a(779093359);
        t2o.a(806355167);
    }

    public static RRoomProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RRoomProxy) ipChange.ipc$dispatch("db7ba834", new Object[0]);
        }
        return a.a();
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public BaseFrame createH5DynamicSDKFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("124c4837", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        return d9m.p().createH5DynamicSDKFrame(context, z, tBLiveDataModel, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public BaseFrame createMediaPlatformFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("f0b97a00", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        return new MediaPlatformFrame(context, z, tBLiveDataModel, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public BaseFrame createMediaPlatformFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("c29e2fce", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        return new MediaPlatformFrame2(context, z, tBLiveDataModel, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public iod createSendMessageListener(Context context, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iod) ipChange.ipc$dispatch("50c7dc79", new Object[]{this, context, ux9Var});
        }
        return new pap(context, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public boolean enableNewSpm4Shop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2c996e2", new Object[]{this})).booleanValue();
        }
        if (!pvs.M0()) {
            return false;
        }
        if (up6.r0(vx9.d()) || up6.q0(vx9.d())) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public HashMap<String, String> getConstantsValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9c67ca82", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(IRRoomProxy.PARAM_CHAT_RENDERS_ENHANCE, yj4.PARAM_CHAT_RENDERS_ENHANCE);
        hashMap.put(IRRoomProxy.KEY_CHAT_WISH_LIST, yj4.KEY_CHAT_WISH_LIST);
        hashMap.put(IRRoomProxy.OPEN_COMMENT, z9u.OPEN_COMMENT);
        hashMap.put(IRRoomProxy.CLICK_COMMENT_SEND, z9u.CLICK_COMMENT_SEND);
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public String getLiveAndHomeMixSpm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3bdf591", new Object[]{this});
        }
        return rbu.p();
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public jlc getLiveDetailMessInfo(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jlc) ipChange.ipc$dispatch("ab38eb85", new Object[]{this, ux9Var});
        }
        if (ux9Var == null || ux9Var.q() == null) {
            return null;
        }
        return ux9Var.q();
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public Map<String, Integer> getRoomRIdMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2128181c", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_VIDEO_HOLE_IMAGE, Integer.valueOf(R.id.taolive_video_hole_image));
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_CHATROOM_BCLINK_CONTAINER, Integer.valueOf(R.id.taolive_chatroom_bclink_container));
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_BTN_HOME, Integer.valueOf(R.id.taolive_btn_home));
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_OPEN_INTERACT_PANEL_FRAME, Integer.valueOf(R.id.taolive_open_interact_panel_frame));
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_CLOSE_BTN, Integer.valueOf(R.id.taolive_close_btn));
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_OPEN_H_5_ROOT_VIEW_FRAME, Integer.valueOf(R.id.taolive_open_h5_root_view_frame));
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_OPEN_GOODS_FRAME, Integer.valueOf(R.id.taolive_open_goods_frame));
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public iod getSendMessageListener(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iod) ipChange.ipc$dispatch("10ac502b", new Object[]{this, context});
        }
        return new pap(context, vx9.d());
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public ATaoLiveOpenEntity getTaoliveOpenLiveRoomEntity(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ATaoLiveOpenEntity) ipChange.ipc$dispatch("7a315436", new Object[]{this, ux9Var});
        }
        if (ux9Var instanceof cdr) {
            return ((cdr) ux9Var).A();
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public boolean instanceofTBLiveBizDataModel(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6830b8b9", new Object[]{this, obj})).booleanValue();
        }
        return obj instanceof TBLiveBizDataModel;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public String liveDetailMessInfoGetSNSNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce7a7891", new Object[]{this});
        }
        if (vx9.d() == null || vx9.d().q() == null) {
            return null;
        }
        return vx9.d().q().c();
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public boolean liveDetailMessInfoIsLegal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("896e1677", new Object[]{this})).booleanValue();
        }
        if (vx9.d() == null || vx9.d().q() == null) {
            return false;
        }
        return vx9.d().q().a();
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public boolean liveInteractiveManagerNotNull(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("804162ea", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof TBLiveBizDataModel) || ((TBLiveBizDataModel) obj).liveInteractiveManager == null) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public boolean platformUtilsShouldOpenOnce(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e7f507b", new Object[]{this, str, str2})).booleanValue();
        }
        return j5m.l(str, str2);
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public AccountInfo roomDataAdapterGetBroadCaster() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccountInfo) ipChange.ipc$dispatch("5f173ef4", new Object[]{this});
        }
        return tfo.a();
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public String roomDataAdapterGetTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("167378d6", new Object[]{this});
        }
        return tfo.b();
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public void showShare(Activity activity, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e315412c", new Object[]{this, activity, new Boolean(z), map});
        } else {
            u90.p(activity, z, map);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public void tbLiveContainerManagerNotifyMsg(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de99682", new Object[]{this, str, map});
        } else {
            vkr.c(vx9.d(), str, map);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public void trackUtilsCommitTap(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5aede48", new Object[]{this, str, strArr});
        } else {
            rbu.i(vx9.d(), str, strArr);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public void updateNextPageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3f1125", new Object[]{this});
        } else {
            rbu.f0(vx9.d());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public void userActionManagerAddUserAction(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a9ae3f", new Object[]{this, context, str, str2});
        } else {
            ppv.c(context).a(str, str2);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public boolean userActionManagerHasUserAction(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50a316aa", new Object[]{this, context, str, str2})).booleanValue();
        }
        return ppv.c(context).d(str, str2);
    }
}
