package com.taobao.android.live.plugin.atype.flexalocal.replayshifttext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.giv;
import tb.iw0;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ReplayShiftTextFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView mShiftTextView;
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    private final Runnable showTimeShiftTask = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ReplayShiftTextFrame.access$000(ReplayShiftTextFrame.this) != null) {
                ReplayShiftTextFrame.access$000(ReplayShiftTextFrame.this).setVisibility(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (giv.a() != null) {
                giv.a().a(ReplayShiftTextFrame.this.mLiveDataModel.mVideoInfo);
            }
        }
    }

    static {
        t2o.a(295699700);
    }

    public ReplayShiftTextFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ TextView access$000(ReplayShiftTextFrame replayShiftTextFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("39a5e7a2", new Object[]{replayShiftTextFrame});
        }
        return replayShiftTextFrame.mShiftTextView;
    }

    public static /* synthetic */ Object ipc$super(ReplayShiftTextFrame replayShiftTextFrame, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/replayshifttext/ReplayShiftTextFrame");
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean asyncRenderComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3514e8f6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-live-replay-shift-text";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_replay_shift_text_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mMainHandler.removeCallbacks(this.showTimeShiftTask);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        handleReplayShiftShow();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mShiftTextView = (TextView) this.mContainer.findViewById(R.id.enter_room_show_replay_tip);
    }

    private void handleReplayShiftShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6717b7", new Object[]{this});
            return;
        }
        if (giv.c().b()) {
            this.mShiftTextView.setText("切换到宝贝讲解");
        } else {
            this.mShiftTextView.setText("切换商品讲解");
        }
        Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.taolive_icon_right_black2_flexalocal);
        int a2 = iw0.a(this.mContext, 15.0f);
        drawable.setBounds(0, 0, a2, a2);
        this.mShiftTextView.setCompoundDrawables(null, null, drawable, null);
        this.mShiftTextView.setTextColor(-16777216);
        this.mShiftTextView.setBackgroundResource(R.drawable.taolive_show_timeshift_list_new_shape_flexalocal);
        this.mShiftTextView.setOnClickListener(new b());
        this.mShiftTextView.setVisibility(0);
    }
}
