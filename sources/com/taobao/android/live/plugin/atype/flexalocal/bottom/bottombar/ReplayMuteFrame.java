package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.content.Context;
import android.os.Message;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.utils.AccessibilityUtils;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.bte;
import tb.ccc;
import tb.jyw;
import tb.o3s;
import tb.t2o;
import tb.ux9;
import tb.wxc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ReplayMuteFrame extends BaseFrame implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MUTE_ICON = "https://gw.alicdn.com/imgextra/i4/O1CN01h932Oi1ZZlzRgx1j1_!!6000000003209-2-tps-80-80.png";
    private static final String TAG = "ReplayMuteFrame";
    private static final String UN_MUTE_ICON = "https://gw.alicdn.com/imgextra/i3/O1CN011uhbJi1L5AuNTd1yl_!!6000000001247-2-tps-80-80.png";
    private View mRootView;
    private TUrlImageView muteImg;
    private final jyw weakHandler = new jyw(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            wxc u;
            String str;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ux9 ux9Var = ReplayMuteFrame.this.mFrameContext;
            if (ux9Var != null && ux9Var.h() != null && (u = ReplayMuteFrame.this.mFrameContext.u()) != null) {
                u.i(true ^ u.j());
                if (ReplayMuteFrame.access$000(ReplayMuteFrame.this) != null && ReplayMuteFrame.access$100(ReplayMuteFrame.this) != null) {
                    TUrlImageView access$100 = ReplayMuteFrame.access$100(ReplayMuteFrame.this);
                    if (u.j()) {
                        str = ReplayMuteFrame.MUTE_ICON;
                    } else {
                        str = ReplayMuteFrame.UN_MUTE_ICON;
                    }
                    access$100.setImageUrl(str);
                    View access$000 = ReplayMuteFrame.access$000(ReplayMuteFrame.this);
                    if (u.j()) {
                        i = R.drawable.taolive_bottombar_bg2_white_flexalocal;
                    } else {
                        i = R.drawable.taolive_bottombar_bg2_flexalocal;
                    }
                    access$000.setBackgroundResource(i);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ReplayMuteFrame.access$000(ReplayMuteFrame.this) != null && ReplayMuteFrame.access$100(ReplayMuteFrame.this) != null) {
                o3s.b(ReplayMuteFrame.TAG, "show mute view");
                ReplayMuteFrame.access$000(ReplayMuteFrame.this).setVisibility(0);
                ReplayMuteFrame.access$100(ReplayMuteFrame.this).setImageUrl(ReplayMuteFrame.MUTE_ICON);
                ReplayMuteFrame.access$000(ReplayMuteFrame.this).setBackgroundResource(R.drawable.taolive_bottombar_bg2_white_flexalocal);
            }
        }
    }

    static {
        t2o.a(295698480);
        t2o.a(806356161);
    }

    public ReplayMuteFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ View access$000(ReplayMuteFrame replayMuteFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("781457da", new Object[]{replayMuteFrame});
        }
        return replayMuteFrame.mRootView;
    }

    public static /* synthetic */ TUrlImageView access$100(ReplayMuteFrame replayMuteFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("7180cc3", new Object[]{replayMuteFrame});
        }
        return replayMuteFrame.muteImg;
    }

    public static /* synthetic */ Object ipc$super(ReplayMuteFrame replayMuteFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/ReplayMuteFrame");
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottombar_replay_mute_layout_flexalocal;
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.weakHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        handleMuteVisiable();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        handleMuteVisiable();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mRootView = view;
        view.setVisibility(8);
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.taolive_bottombar_replay_mute_img_icon);
        this.muteImg = tUrlImageView;
        tUrlImageView.setImageUrl(MUTE_ICON);
        this.mRootView.setBackgroundResource(R.drawable.taolive_bottombar_bg2_white_flexalocal);
        AccessibilityUtils.a(view);
        ViewProxy.setOnClickListener(this.mRootView, new a());
        o3s.b(TAG, "onViewCreated");
    }

    private void handleMuteVisiable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6386b2b", new Object[]{this});
        } else if (bte.b(this.mFrameContext)) {
            inflateViewOnNeed();
            this.weakHandler.post(new b());
        } else if (this.mRootView != null && this.muteImg != null) {
            o3s.b(TAG, "show unmute view");
            this.mRootView.setVisibility(0);
            this.mRootView.setBackgroundResource(R.drawable.taolive_bottombar_bg2_flexalocal);
            this.muteImg.setImageUrl(UN_MUTE_ICON);
        }
    }
}
