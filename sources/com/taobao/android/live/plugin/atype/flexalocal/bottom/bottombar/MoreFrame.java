package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.utils.AccessibilityUtils;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.cwd;
import tb.fkx;
import tb.giv;
import tb.m7n;
import tb.s3c;
import tb.t2o;
import tb.ux9;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MoreFrame extends BaseFrame implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_MEDIAPLATFORM_ADD_PANEL_ICON = "com.taolive.taolive.room.mediaplatform_addPanelIcon";
    public static final String EVENT_MEDIAPLATFORM_REMOVE_PANEL_ICON = "com.taolive.taolive.room.mediaplatform_removePanelIcon";
    private static final String EVENT_SHOW_SCREEN_RECORD_BTN_FRAME = "com.taobao.taolive.room.show_screen_record_btns_frame";
    private static final String TAG = "MoreFrame";
    private AliUrlImageView mAliUrlImageView;
    private View mDefaultIconView;
    private boolean mIsShowGameIcon;
    private View mRootView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                MoreFrame.access$000(MoreFrame.this);
            }
        }
    }

    static {
        t2o.a(295698472);
        t2o.a(806355016);
    }

    public MoreFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ void access$000(MoreFrame moreFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a5e30d", new Object[]{moreFrame});
        } else {
            moreFrame.showInteractPanel();
        }
    }

    public static /* synthetic */ Object ipc$super(MoreFrame moreFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/MoreFrame");
        }
    }

    private void showInteractPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95943178", new Object[]{this});
            return;
        }
        this.mFrameContext.h().c("com.taobao.taolive.room.show_screen_record_btns_frame", null, this.mFrameContext.C());
        if (this.mIsShowGameIcon && giv.f() != null) {
            giv.f().n(this.mFrameContext, "gameicon_CLK", new String[0]);
        }
    }

    private void updatePanelBtnIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56db1ccb", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.mAliUrlImageView.setVisibility(0);
            this.mDefaultIconView.setVisibility(8);
            this.mAliUrlImageView.setSkipAutoSize(true);
            this.mAliUrlImageView.setImageUrl(str);
        } else {
            this.mAliUrlImageView.setVisibility(8);
            this.mDefaultIconView.setVisibility(0);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "MoreFrame";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "more";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottombar_more_layout_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{EVENT_MEDIAPLATFORM_ADD_PANEL_ICON, "com.taolive.taolive.room.mediaplatform_removePanelIcon", m7n.EVENT_QUALITY_SWITCH_TIPS};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mFrameContext.h().b(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        updatePanelBtnIcon(null);
        this.mFrameContext.h().a(this);
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (EVENT_MEDIAPLATFORM_ADD_PANEL_ICON.equals(str)) {
            setPanelBtnIcon((HashMap) obj);
        } else if ("com.taolive.taolive.room.mediaplatform_removePanelIcon".equals(str)) {
            HashMap<String, String> hashMap = (HashMap) obj;
            hashMap.remove("panelIconUrl");
            setPanelBtnIcon(hashMap);
        } else if (m7n.EVENT_QUALITY_SWITCH_TIPS.equals(str)) {
            new m7n(this.mContext).c(this.mRootView);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        this.mRootView = view;
        super.onViewCreated(view);
        this.mAliUrlImageView = (AliUrlImageView) view.findViewById(R.id.taolive_bottombar_icon);
        this.mDefaultIconView = view.findViewById(R.id.taolive_bottombar_default);
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.taolive_bottombar_more_image);
        tUrlImageView.setImageResource(R.drawable.taolive_icon_new_style_more_flexalocal);
        NewStyleUtils.e(this.mContext, tUrlImageView);
        NewStyleUtils.b(this.mContext, this.mDefaultIconView, NewStyleUtils.NewStyleType.LARGE);
        view.setContentDescription("主播互动");
        AccessibilityUtils.a(view);
        ViewProxy.setOnClickListener(view, new a());
    }

    private void setPanelBtnIcon(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d14c99", new Object[]{this, hashMap});
        } else if (hashMap != null) {
            String str = hashMap.get("componentName");
            String str2 = hashMap.get("panelIconUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                updatePanelBtnIcon(null);
                this.mIsShowGameIcon = false;
            } else {
                updatePanelBtnIcon(str2);
                if ("@ali/alivemodx-live-game-entrance".equals(str)) {
                    if (giv.f() != null) {
                        giv.f().p(this.mFrameContext, "Show-gameicon_EXP", null);
                    }
                    this.mIsShowGameIcon = true;
                }
            }
            String i = fkx.i(hashMap);
            cwd A = v2s.o().A();
            A.c("MoreFrame", "setPanelBtnIcon:" + i);
            if (giv.f() != null) {
                giv.f().p(this.mFrameContext, "setPanelBtnIcon", hashMap);
            }
        }
    }
}
