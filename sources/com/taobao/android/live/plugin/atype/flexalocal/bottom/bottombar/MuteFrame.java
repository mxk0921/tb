package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.utils.AccessibilityUtils;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.bte;
import tb.ccc;
import tb.jyw;
import tb.lvs;
import tb.t2o;
import tb.ux9;
import tb.wxc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MuteFrame extends BaseFrame implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mRootView;
    private View segmentView;
    private TextView textView;
    private final jyw weakHandler = new jyw(this);

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
                return;
            }
            ux9 ux9Var = MuteFrame.this.mFrameContext;
            if (ux9Var != null && ux9Var.h() != null) {
                wxc u = MuteFrame.this.mFrameContext.u();
                if (u != null) {
                    u.i(false);
                }
                MuteFrame.access$000(MuteFrame.this).setVisibility(8);
                MuteFrame.this.mFrameContext.h().c("com.taobao.taolive.mute_notify_showcase", Boolean.TRUE, MuteFrame.this.mFrameContext.C());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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
                } else {
                    MuteFrame.access$100(MuteFrame.this, false);
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (MuteFrame.access$000(MuteFrame.this) != null) {
                MuteFrame.access$000(MuteFrame.this).setVisibility(0);
                if (bte.e()) {
                    MuteFrame.access$100(MuteFrame.this, true);
                    bte.g();
                    MuteFrame.access$200(MuteFrame.this).postDelayed(new a(), lvs.q().longValue() * 1000);
                } else {
                    MuteFrame.access$100(MuteFrame.this, false);
                }
                ux9 ux9Var = MuteFrame.this.mFrameContext;
                if (ux9Var != null && ux9Var.h() != null) {
                    MuteFrame.this.mFrameContext.h().c("com.taobao.taolive.mute_notify_showcase", Boolean.FALSE, MuteFrame.this.mFrameContext.C());
                }
            }
        }
    }

    static {
        t2o.a(295698476);
        t2o.a(806356161);
    }

    public MuteFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ View access$000(MuteFrame muteFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1cba1bd3", new Object[]{muteFrame});
        }
        return muteFrame.mRootView;
    }

    public static /* synthetic */ void access$100(MuteFrame muteFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4109d582", new Object[]{muteFrame, new Boolean(z)});
        } else {
            muteFrame.handleRemindView(z);
        }
    }

    public static /* synthetic */ jyw access$200(MuteFrame muteFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyw) ipChange.ipc$dispatch("15226f", new Object[]{muteFrame});
        }
        return muteFrame.weakHandler;
    }

    private void handleMuteVisiable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6386b2b", new Object[]{this});
        } else if (bte.b(this.mFrameContext)) {
            inflateViewOnNeed();
            this.weakHandler.post(new b());
        } else {
            View view = this.mRootView;
            if (view != null) {
                view.setVisibility(8);
                ux9 ux9Var = this.mFrameContext;
                if (ux9Var != null && ux9Var.h() != null) {
                    this.mFrameContext.h().c("com.taobao.taolive.mute_notify_showcase", Boolean.TRUE, this.mFrameContext.C());
                }
            }
        }
    }

    private void handleRemindView(boolean z) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("291d2cdb", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.textView;
        if (textView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
        View view = this.segmentView;
        if (view != null) {
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public static /* synthetic */ Object ipc$super(MuteFrame muteFrame, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/MuteFrame");
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottombar_mute_layout_flexalocal;
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
        NewStyleUtils.d(this.mContext, this.mRootView, NewStyleUtils.NewStyleType.LARGE);
        this.textView = (TextView) view.findViewById(R.id.taolive_bottombar_mute_text);
        this.segmentView = view.findViewById(R.id.taolive_bottombar_mute_segment);
        ((TUrlImageView) view.findViewById(R.id.taolive_bottombar_mute_img_icon)).setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01WCTQSN1mVjRSBzmbz_!!6000000004960-2-tps-108-108.png");
        view.setContentDescription("取消静音");
        AccessibilityUtils.a(view);
        ViewProxy.setOnClickListener(this.mRootView, new a());
    }
}
