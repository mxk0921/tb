package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.c7m;
import tb.g5h;
import tb.giv;
import tb.o3s;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.ux9;
import tb.uyg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ReplayPlayFrame extends BaseFrame implements View.OnClickListener, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String REPLAY_PLAY_STATUS_CHANGE = "replay_play_status_change";
    private static final String TAG = "ReplayPlayFrame";
    private TUrlImageView mPlayImageView;
    private c7m mVideoFrame;

    static {
        t2o.a(295698483);
        t2o.a(806355016);
    }

    public ReplayPlayFrame(Context context, ux9 ux9Var, c7m c7mVar) {
        super(context, ux9Var);
        this.mVideoFrame = c7mVar;
    }

    public static /* synthetic */ Object ipc$super(ReplayPlayFrame replayPlayFrame, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/ReplayPlayFrame");
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "ReplayPlayFrame";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-bottom-play";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottombar_play_layout_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_SHOW_PLAYER_STATE, REPLAY_PLAY_STATUS_CHANGE};
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
        sjr.g().b(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        sjr.g().a(this);
        if (this.mPlayImageView != null && this.mFrameContext.x() != null) {
            o3s.b("ReplayPlayFrame", "onDataReceived | isPlaying = " + this.mFrameContext.x().isPlaying());
            TUrlImageView tUrlImageView = this.mPlayImageView;
            if (this.mFrameContext.x().isPlaying()) {
                i = R.drawable.taolive_video_new_pause_flexalocal;
            } else {
                i = R.drawable.taolive_video_new_play_flexalocal;
            }
            tUrlImageView.setImageResource(i);
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (uyg.EVENT_SHOW_PLAYER_STATE.equals(str)) {
            if (obj instanceof HashMap) {
                try {
                    String str2 = (String) ((HashMap) obj).get("action");
                    o3s.b("ReplayPlayFrame", "onEvent | action = " + str2);
                    if (!"complete".equals(str2) && !"error".equals(str2) && !"prepared".equals(str2) && !"pause".equals(str2)) {
                        if (!"start".equals(str2)) {
                            if ("play".equals(str2)) {
                            }
                        }
                        this.mPlayImageView.setImageResource(R.drawable.taolive_video_new_pause_flexalocal);
                    }
                    this.mPlayImageView.setImageResource(R.drawable.taolive_video_new_play_flexalocal);
                } catch (Exception e) {
                    o3s.c("ReplayPlayFrame", "onEvent | parse exception", e);
                }
            }
        } else if (REPLAY_PLAY_STATUS_CHANGE.equals(str) && (obj instanceof String)) {
            TUrlImageView tUrlImageView = this.mPlayImageView;
            if ("play".equals(obj)) {
                i = R.drawable.taolive_video_new_pause_flexalocal;
            } else {
                i = R.drawable.taolive_video_new_play_flexalocal;
            }
            tUrlImageView.setImageResource(i);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.taolive_bottombar_play_image);
        this.mPlayImageView = tUrlImageView;
        tUrlImageView.setOnClickListener(this);
        o3s.b("ReplayPlayFrame", "onViewCreated");
    }

    public ReplayPlayFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null) {
            String str = "play";
            if (ux9Var.x().isPlaying()) {
                this.mFrameContext.x().k();
                this.mPlayImageView.setImageResource(R.drawable.taolive_video_new_play_flexalocal);
                c7m c7mVar = this.mVideoFrame;
                if (c7mVar != null) {
                    c7mVar.K(true);
                }
                sjr.g().e(REPLAY_PLAY_STATUS_CHANGE, "pause");
            } else {
                c7m c7mVar2 = this.mVideoFrame;
                if (c7mVar2 != null) {
                    c7mVar2.K(false);
                }
                this.mFrameContext.x().l();
                this.mPlayImageView.setImageResource(R.drawable.taolive_video_new_pause_flexalocal);
                sjr.g().e(REPLAY_PLAY_STATUS_CHANGE, str);
            }
            if (giv.f() != null) {
                g5h f = giv.f();
                ux9 ux9Var2 = this.mFrameContext;
                if (!ux9Var2.x().isPlaying()) {
                    str = "pause";
                }
                f.n(ux9Var2, str, new String[0]);
            }
        }
    }
}
