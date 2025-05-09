package com.taobao.avplayer.playercontrol;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaSystemUtils;
import com.taobao.media.MediaTimeUtils;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.util.HashMap;
import tb.c95;
import tb.ctb;
import tb.g95;
import tb.ltb;
import tb.mtb;
import tb.nr4;
import tb.nsb;
import tb.ntb;
import tb.otb;
import tb.t2o;
import tb.t85;
import tb.tfb;
import tb.w95;
import tb.ysb;
import tb.ytb;
import tb.z75;
import tb.zsb;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWPlayerController implements ytb, SeekBar.OnSeekBarChangeListener, Handler.Callback, ctb, ntb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int HIDE_DELAY_TIME = 4000;
    private static final int MSG_HIDE_CONTROLLER = 0;
    private static final String TAG = DWPlayerController.class.getSimpleName();
    public int duration;
    public nr4 mControllerHolder;
    private DWContext mDWContext;
    private t85 mDWNavController;
    private c95 mDWPlayRateController;
    private w95 mDWTopBarController;
    private FrameLayout mHost;
    private mtb mNormalControllerListener;
    private otb mPlayerControlListener;
    private int mPositionBFStart;
    private boolean mRequested;
    private boolean mShowItemIcon;
    private int mTotalTime;
    private boolean mUseHiv;
    public boolean startTracking;
    private boolean mHideControllerView = false;
    private DWLifecycleType mDWLifecycleType = DWLifecycleType.BEFORE;
    private int newPosition = 0;
    private Handler mHandler = new Handler(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ltb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(DWPlayerController dWPlayerController) {
        }

        @Override // tb.ltb
        public void onError(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
            }
        }

        @Override // tb.ltb
        public void onSuccess(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
            } else if (g95.a(dWResponse) == null) {
                onError(dWResponse);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ltb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ltb
        public void onError(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
            }
        }

        @Override // tb.ltb
        public void onSuccess(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
                return;
            }
            try {
                DWInteractiveVideoObject dWInteractiveVideoObject = new DWInteractiveVideoObject(dWResponse.data);
                if (!(DWPlayerController.access$000(DWPlayerController.this) == null || DWPlayerController.access$000(DWPlayerController.this).getIctTmpCallback() == null)) {
                    HashMap hashMap = new HashMap();
                    String shareData = dWInteractiveVideoObject.getShareData();
                    String str = "";
                    if (shareData == null) {
                        shareData = str;
                    }
                    hashMap.put("shareData", shareData);
                    String taowaData = dWInteractiveVideoObject.getTaowaData();
                    if (taowaData == null) {
                        taowaData = str;
                    }
                    hashMap.put("taowaData", taowaData);
                    String favorData = dWInteractiveVideoObject.getFavorData();
                    if (favorData != null) {
                        str = favorData;
                    }
                    hashMap.put("favorData", str);
                    DWPlayerController.access$000(DWPlayerController.this).getIctTmpCallback().c(hashMap);
                }
                DWPlayerController.access$102(DWPlayerController.this, true);
                if (DWPlayerController.access$200(DWPlayerController.this) != null) {
                    DWPlayerController.access$200(DWPlayerController.this).e(dWInteractiveVideoObject);
                }
                if (DWPlayerController.access$300(DWPlayerController.this) != null) {
                    DWPlayerController.access$300(DWPlayerController.this).n(dWInteractiveVideoObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (DWPlayerController.access$400(DWPlayerController.this) != null) {
                DWPlayerController.access$400(DWPlayerController.this).a();
            }
        }
    }

    static {
        t2o.a(452985154);
        t2o.a(452985011);
        t2o.a(452985037);
        t2o.a(452985171);
    }

    public DWPlayerController(DWContext dWContext) {
        this.mDWContext = dWContext;
        initView();
        boolean isEmpty = TextUtils.isEmpty(dWContext.mCid);
        this.mUseHiv = !isEmpty;
        if (isEmpty) {
            this.mDWTopBarController = new w95(this.mDWContext);
        }
        this.mDWNavController = new t85(this.mDWContext, this.mControllerHolder.e);
        this.mDWPlayRateController = new c95(this.mDWContext, this.mHost);
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWPlayerController);
    }

    public static /* synthetic */ DWContext access$000(DWPlayerController dWPlayerController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWContext) ipChange.ipc$dispatch("316158b8", new Object[]{dWPlayerController});
        }
        return dWPlayerController.mDWContext;
    }

    public static /* synthetic */ boolean access$102(DWPlayerController dWPlayerController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed271238", new Object[]{dWPlayerController, new Boolean(z)})).booleanValue();
        }
        dWPlayerController.mShowItemIcon = z;
        return z;
    }

    public static /* synthetic */ t85 access$200(DWPlayerController dWPlayerController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t85) ipChange.ipc$dispatch("681d755c", new Object[]{dWPlayerController});
        }
        return dWPlayerController.mDWNavController;
    }

    public static /* synthetic */ w95 access$300(DWPlayerController dWPlayerController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w95) ipChange.ipc$dispatch("5f8cb6df", new Object[]{dWPlayerController});
        }
        return dWPlayerController.mDWTopBarController;
    }

    public static /* synthetic */ otb access$400(DWPlayerController dWPlayerController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (otb) ipChange.ipc$dispatch("4cae7e77", new Object[]{dWPlayerController});
        }
        return dWPlayerController.mPlayerControlListener;
    }

    private void getInteractiveData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0419cfd", new Object[]{this});
            return;
        }
        this.mRequested = true;
        this.mDWContext.queryInteractiveData(new b(), false);
    }

    private void getInteractiveDataFromHiv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29ef13c", new Object[]{this});
            return;
        }
        this.mRequested = true;
        this.mDWContext.queryInteractiveDataFromHiv(new a(this), false);
    }

    private void initView() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mHost = (FrameLayout) LayoutInflater.from(this.mDWContext.getActivity()).inflate(R.layout.tbavsdk_video_bottom_controller, (ViewGroup) null, false);
        nr4 nr4Var = new nr4();
        this.mControllerHolder = nr4Var;
        FrameLayout frameLayout = this.mHost;
        nr4Var.f24898a = frameLayout;
        nr4Var.b = frameLayout.findViewById(R.id.video_controller_layout);
        this.mControllerHolder.d = (TextView) this.mHost.findViewById(R.id.video_controller_current_time);
        this.mControllerHolder.c = (TextView) this.mHost.findViewById(R.id.video_controller_total_time);
        this.mControllerHolder.e = (SeekBar) this.mHost.findViewById(R.id.video_controller_seekBar);
        this.mControllerHolder.e.setEnabled(false);
        this.mControllerHolder.f = (FrameLayout) this.mHost.findViewById(R.id.video_controller_fullscreen);
        this.mControllerHolder.g = new ImageView(this.mDWContext.getActivity());
        int dip2px = DWViewUtil.dip2px(this.mDWContext.getActivity(), 2.0f);
        this.mControllerHolder.g.setPadding(dip2px, dip2px, dip2px, dip2px);
        nr4 nr4Var2 = this.mControllerHolder;
        nr4Var2.f.addView(nr4Var2.g, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = this.mControllerHolder.f;
        if (!this.mDWContext.mNeedScreenButton) {
            i = 4;
        }
        frameLayout2.setVisibility(i);
        if (!this.mDWContext.mNeedScreenButton) {
            this.mControllerHolder.f.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getActivity(), 12.0f);
        }
        nr4 nr4Var3 = this.mControllerHolder;
        int i2 = R.drawable.tbavsdk_video_fullscreen;
        nr4Var3.h = i2;
        nr4Var3.i = R.drawable.tbavsdk_video_unfullscreen;
        zsb zsbVar = this.mDWContext.mDWImageAdapter;
        if (zsbVar != null) {
            ((z75) zsbVar).e(i2, nr4Var3.g);
        } else {
            nr4Var3.g.setImageResource(i2);
        }
        ImageView imageView = this.mControllerHolder.g;
        if (imageView != null) {
            imageView.setOnClickListener(new c());
        }
        SeekBar seekBar = this.mControllerHolder.e;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this);
            this.mControllerHolder.e.setMax(1000);
        }
    }

    private void onVideoFullScreen(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f57cdb", new Object[]{this, dWVideoScreenType});
            return;
        }
        if (DWVideoScreenType.LANDSCAPE_FULL_SCREEN == dWVideoScreenType) {
            updatePlayerController(true);
        }
        nr4 nr4Var = this.mControllerHolder;
        ImageView imageView = nr4Var.g;
        if (imageView != null) {
            zsb zsbVar = this.mDWContext.mDWImageAdapter;
            if (zsbVar != null) {
                ((z75) zsbVar).e(nr4Var.i, imageView);
            } else {
                imageView.setImageResource(nr4Var.i);
            }
        }
        w95 w95Var = this.mDWTopBarController;
        if (w95Var != null) {
            w95Var.s(true);
        }
        hideCloseView(false);
        w95 w95Var2 = this.mDWTopBarController;
        if (w95Var2 != null) {
            w95Var2.p(20);
        }
    }

    private void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            return;
        }
        updatePlayerController(false);
        nr4 nr4Var = this.mControllerHolder;
        ImageView imageView = nr4Var.g;
        if (imageView != null) {
            zsb zsbVar = this.mDWContext.mDWImageAdapter;
            if (zsbVar != null) {
                ((z75) zsbVar).e(nr4Var.h, imageView);
            } else {
                imageView.setImageResource(nr4Var.h);
            }
        }
        w95 w95Var = this.mDWTopBarController;
        if (w95Var != null) {
            w95Var.s(false);
        }
        if (!this.mDWContext.isMute()) {
            showCloseView(false);
        }
        w95 w95Var2 = this.mDWTopBarController;
        if (w95Var2 != null) {
            w95Var2.p(12);
        }
    }

    private void resetViewState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd1264", new Object[]{this});
            return;
        }
        this.newPosition = 0;
        this.mControllerHolder.d.setText(MediaTimeUtils.msStringForTime(0));
        this.mControllerHolder.e.setProgress(0);
        this.mControllerHolder.e.setSecondaryProgress(0);
        this.mControllerHolder.e.setEnabled(false);
    }

    private void updatePlayerController(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404bbaa7", new Object[]{this, new Boolean(z)});
            return;
        }
        nr4 nr4Var = this.mControllerHolder;
        if (nr4Var != null) {
            if (z) {
                nr4Var.b.getLayoutParams().height = DWViewUtil.dip2px(this.mDWContext.getActivity(), 68.0f);
                this.mControllerHolder.d.setTextSize(2, 14.0f);
                this.mControllerHolder.c.setTextSize(2, 14.0f);
                if (this.mDWContext.mNeedScreenButton) {
                    this.mControllerHolder.f.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getActivity(), 40.0f);
                } else {
                    this.mControllerHolder.f.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getActivity(), 14.0f);
                }
                this.mControllerHolder.f.getLayoutParams().height = DWViewUtil.dip2px(this.mDWContext.getActivity(), 40.0f);
                this.mControllerHolder.f24898a.requestLayout();
                return;
            }
            nr4Var.b.getLayoutParams().height = DWViewUtil.dip2px(this.mDWContext.getActivity(), 48.0f);
            this.mControllerHolder.d.setTextSize(2, 10.0f);
            this.mControllerHolder.c.setTextSize(2, 10.0f);
            if (this.mDWContext.mNeedScreenButton) {
                this.mControllerHolder.f.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getActivity(), 30.0f);
            } else {
                this.mControllerHolder.f.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getActivity(), 12.0f);
            }
            this.mControllerHolder.f.getLayoutParams().height = -1;
            this.mControllerHolder.f24898a.requestLayout();
        }
    }

    public void addFullScreenCustomView(View view) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46dce79", new Object[]{this, view});
        } else if (view != null && (frameLayout = this.mControllerHolder.f) != null) {
            frameLayout.removeAllViews();
            this.mControllerHolder.f.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void commitSeekData() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c22ca0", new Object[]{this});
            return;
        }
        DWContext dWContext = this.mDWContext;
        if (dWContext != null && dWContext.mUTAdapter != null && dWContext.getVideo() != null) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("type", str2);
            int i = this.mPositionBFStart;
            int i2 = this.newPosition;
            if (i <= i2) {
                if (i == i2) {
                    str2 = "2";
                } else {
                    str2 = "0";
                }
            }
            hashMap.put("progress", str2);
            if (this.mDWContext.isMute()) {
                str = "true";
            } else {
                str = "false";
            }
            hashMap.put("mute", str);
            DWContext dWContext2 = this.mDWContext;
            dWContext2.mUTAdapter.a("DWVideo", "Button", "videoProgress", dWContext2.getUTParams(), hashMap);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
    }

    public View getGoodsListView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cdacfeec", new Object[]{this});
        }
        return null;
    }

    public int getNormalControllerHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcda1a5a", new Object[]{this})).intValue();
        }
        if (DWVideoScreenType.LANDSCAPE_FULL_SCREEN == this.mDWContext.screenType()) {
            return DWViewUtil.dip2px(this.mDWContext.getActivity(), 68.0f);
        }
        return DWViewUtil.dip2px(this.mDWContext.getActivity(), 48.0f);
    }

    public View getRightView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1701daf4", new Object[]{this});
        }
        return new View(this.mDWContext.getActivity());
    }

    public View getTopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("22e0bf6d", new Object[]{this});
        }
        w95 w95Var = this.mDWTopBarController;
        if (w95Var != null) {
            return w95Var.g();
        }
        return new View(this.mDWContext.getActivity());
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.mHost;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (MediaSystemUtils.isApkDebuggable()) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "handleMessage >>> what:" + String.valueOf(message.what) + "," + message.toString());
        }
        if (message.what == 0) {
            hideControllerInner();
        }
        return false;
    }

    public void hideCloseView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee652a72", new Object[]{this, new Boolean(z)});
            return;
        }
        w95 w95Var = this.mDWTopBarController;
        if (w95Var != null) {
            w95Var.i(z);
        }
    }

    public void hideControllerInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d76d2ff", new Object[]{this});
        } else if (showing()) {
            DWContext dWContext = this.mDWContext;
            if (!(dWContext == null || dWContext.getVideo() == null || this.mDWContext.getVideo().getVideoState() == 3)) {
                hideCloseView(false);
            }
            w95 w95Var = this.mDWTopBarController;
            if (w95Var != null) {
                w95Var.u(false);
                this.mDWTopBarController.s(false);
            }
            this.mControllerHolder.b.setVisibility(4);
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeMessages(0);
            }
            mtb mtbVar = this.mNormalControllerListener;
            if (mtbVar != null) {
                mtbVar.hide();
            }
        }
    }

    public void hideControllerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f2dd4a", new Object[]{this});
            return;
        }
        this.mHideControllerView = true;
        hideControllerInner();
        w95 w95Var = this.mDWTopBarController;
        if (w95Var != null) {
            w95Var.h();
        }
    }

    public void hideGoodsListView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183864be", new Object[]{this});
        }
    }

    public void hideTopEventView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b7df73", new Object[]{this});
            return;
        }
        w95 w95Var = this.mDWTopBarController;
        if (w95Var != null) {
            w95Var.j();
        }
    }

    @Override // tb.ctb
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        w95 w95Var;
        w95 w95Var2;
        w95 w95Var3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.mDWLifecycleType = dWLifecycleType;
        if (dWLifecycleType == DWLifecycleType.BEFORE) {
            this.mHost.setVisibility(8);
            w95 w95Var4 = this.mDWTopBarController;
            if (w95Var4 != null) {
                w95Var4.h();
            }
            showOrHideInteractive(this.mDWContext.isShowInteractive());
        } else if (dWLifecycleType == DWLifecycleType.MID || dWLifecycleType == DWLifecycleType.AFTER) {
            this.mHost.setVisibility(0);
            if (!this.mHideControllerView && (w95Var2 = this.mDWTopBarController) != null) {
                w95Var2.q();
            }
            showOrHideInteractive(this.mDWContext.isShowInteractive());
            if (this.mDWLifecycleType != DWLifecycleType.AFTER) {
                return;
            }
            if ((this.mDWContext.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.mDWContext.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) && (w95Var = this.mDWTopBarController) != null) {
                w95Var.s(true);
            }
        } else if (dWLifecycleType == DWLifecycleType.MID_BEGIN || dWLifecycleType == DWLifecycleType.MID_END) {
            this.mHost.setVisibility(8);
            if (!this.mHideControllerView && (w95Var3 = this.mDWTopBarController) != null) {
                w95Var3.q();
            }
            showOrHideInteractive(false);
        }
    }

    @Override // tb.ntb
    public boolean onPlayRateChanged(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1876bc", new Object[]{this, new Float(f)})).booleanValue();
        }
        if (this.mPlayerControlListener == null) {
            return false;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(0);
            this.mHandler.sendEmptyMessageDelayed(0, Constants.STARTUP_TIME_LEVEL_1);
        }
        return this.mPlayerControlListener.onPlayRateChanged(f);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        otb otbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.mTotalTime;
        if (i2 >= 0 && z) {
            this.newPosition = (int) (i2 * (i / 1000.0f));
            if (MediaSystemUtils.isApkDebuggable()) {
                AVSDKLog.d(tfb.MODULE_SDK_PAGE, "onProgressChanged >>> progress:" + i + ", newPosition:" + this.newPosition);
            }
            nr4 nr4Var = this.mControllerHolder;
            if (nr4Var != null) {
                nr4Var.d.setText(MediaTimeUtils.msStringForTime(this.newPosition));
            }
            if (this.mDWContext.isInstantSeekingEnable() && (otbVar = this.mPlayerControlListener) != null) {
                otbVar.b(this.newPosition);
            }
        }
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        } else {
            this.newPosition = 0;
        }
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        } else {
            this.mControllerHolder.e.setEnabled(false);
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        resetViewState();
        if (this.mDWContext.screenType() == DWVideoScreenType.NORMAL && !this.mDWContext.isMute()) {
            showCloseView(false);
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.mDWContext.getVideoToken()) && this.duration == 0) {
            int duration = this.mDWContext.getVideo().getDuration();
            this.duration = duration;
            this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(duration));
        }
        this.mControllerHolder.e.setEnabled(true);
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        this.mControllerHolder.e.setEnabled(true);
        int i = this.duration;
        if (i == 0) {
            i = (int) ((AbstractMediaPlayer) obj).getDuration();
        }
        this.duration = i;
        if (i >= 0) {
            this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(i));
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!this.startTracking) {
            this.mTotalTime = i3;
            if (i > i3) {
                i = i3;
            }
            this.mControllerHolder.d.setText(MediaTimeUtils.msStringForTime(i));
            this.mControllerHolder.e.setProgress((int) Math.ceil(((i * 1.0f) / i3) * 1000.0f));
            this.mControllerHolder.e.setSecondaryProgress(i2 * 10);
            this.newPosition = i;
        }
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        } else if (dWVideoScreenType == DWVideoScreenType.NORMAL) {
            onVideoNormalScreen();
        } else {
            onVideoFullScreen(dWVideoScreenType);
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.mDWContext.getVideoToken()) && this.duration == 0) {
            int duration = this.mDWContext.getVideo().getDuration();
            this.duration = duration;
            this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(duration));
        }
        this.mControllerHolder.e.setEnabled(true);
        hideControllerInner();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(0, Constants.STARTUP_TIME_LEVEL_1);
        }
    }

    public void removeFullScreenCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc677c9c", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.mControllerHolder.f;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            nr4 nr4Var = this.mControllerHolder;
            nr4Var.f.addView(nr4Var.g);
        }
    }

    public void requestInteractiveAndRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca7a73e", new Object[]{this});
        } else {
            showOrHideInteractive(this.mDWContext.isShowInteractive());
        }
    }

    public void setCloseViewClickListener(nsb nsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84ff1fa", new Object[]{this, nsbVar});
            return;
        }
        w95 w95Var = this.mDWTopBarController;
        if (w95Var != null) {
            w95Var.m(nsbVar);
        }
    }

    public void setIDWHookVideoBackButtonListener(ysb ysbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d89afcc8", new Object[]{this, ysbVar});
            return;
        }
        w95 w95Var = this.mDWTopBarController;
        if (w95Var != null) {
            w95Var.o(ysbVar);
        }
    }

    public void setIDWPlayerControlListener(otb otbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6acdbdf", new Object[]{this, otbVar});
            return;
        }
        this.mPlayerControlListener = otbVar;
        c95 c95Var = this.mDWPlayRateController;
        if (c95Var != null) {
            c95Var.b(this);
        }
    }

    public void setNormalControllerListener(mtb mtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100d063a", new Object[]{this, mtbVar});
        } else {
            this.mNormalControllerListener = mtbVar;
        }
    }

    public void showCloseView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b204ed", new Object[]{this, new Boolean(z)});
            return;
        }
        w95 w95Var = this.mDWTopBarController;
        if (w95Var != null) {
            w95Var.r(z);
        }
    }

    public void showControllerInner() {
        nr4 nr4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb064d64", new Object[]{this});
        } else if (!this.mHideControllerView && !showing() && (nr4Var = this.mControllerHolder) != null) {
            nr4Var.b.setVisibility(0);
            w95 w95Var = this.mDWTopBarController;
            if (w95Var != null) {
                w95Var.u(true);
            }
            if (this.mDWContext.screenType() != DWVideoScreenType.NORMAL || this.mDWContext.isMute()) {
                w95 w95Var2 = this.mDWTopBarController;
                if (w95Var2 != null) {
                    w95Var2.s(true);
                }
            } else {
                showCloseView(false);
            }
            mtb mtbVar = this.mNormalControllerListener;
            if (mtbVar != null) {
                mtbVar.show();
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeMessages(0);
                this.mHandler.sendEmptyMessageDelayed(0, Constants.STARTUP_TIME_LEVEL_1);
            }
        }
    }

    public void showControllerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67080245", new Object[]{this});
            return;
        }
        this.mHideControllerView = false;
        showControllerInner();
        w95 w95Var = this.mDWTopBarController;
        if (w95Var != null) {
            w95Var.q();
        }
    }

    public void showGoodsListView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bd3463", new Object[]{this});
        }
    }

    public void showOrHideInteractive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127138cd", new Object[]{this, new Boolean(z)});
        } else if (this.mDWLifecycleType == DWLifecycleType.MID || !z) {
            if (z) {
                if (!this.mRequested) {
                    if (this.mUseHiv) {
                        getInteractiveDataFromHiv();
                    } else {
                        getInteractiveData();
                    }
                }
                t85 t85Var = this.mDWNavController;
                if (t85Var != null) {
                    t85Var.f();
                }
            } else {
                t85 t85Var2 = this.mDWNavController;
                if (t85Var2 != null) {
                    t85Var2.a();
                }
            }
            w95 w95Var = this.mDWTopBarController;
            if (w95Var != null) {
                w95Var.t(z);
            }
        }
    }

    public void showTopEventView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2538072e", new Object[]{this});
            return;
        }
        w95 w95Var = this.mDWTopBarController;
        if (w95Var != null) {
            w95Var.v();
        }
    }

    public boolean showing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27ce99d0", new Object[]{this})).booleanValue();
        }
        if (this.mControllerHolder.b.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
            return;
        }
        this.startTracking = true;
        if (MediaSystemUtils.isApkDebuggable()) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "onProgressChanged --- onStartTrackingTouch ");
        }
        DWContext dWContext = this.mDWContext;
        if (dWContext != null && dWContext.getVideo() != null) {
            this.mPositionBFStart = this.mDWContext.getVideo().getCurrentPosition();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        this.startTracking = false;
        if (this.mPlayerControlListener != null) {
            if (this.mDWContext.isInstantSeekingEnable()) {
                commitSeekData();
            }
            this.mPlayerControlListener.seekTo(this.newPosition);
            if (MediaSystemUtils.isApkDebuggable()) {
                AVSDKLog.d(tfb.MODULE_SDK_PAGE, "onProgressChanged --- onStopTrackingTouch ");
            }
        }
        showControllerInner();
    }
}
