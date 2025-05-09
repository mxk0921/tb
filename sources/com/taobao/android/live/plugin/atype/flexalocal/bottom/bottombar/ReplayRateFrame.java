package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import java.util.Map;
import tb.giv;
import tb.nh4;
import tb.o3s;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.ux9;
import tb.uyg;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ReplayRateFrame extends BaseFrame implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = ReplayRateFrame.class.getSimpleName();
    private int currentRateIndex = 0;
    private TextView rateView;
    private final float[] rates;

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
            ReplayRateFrame replayRateFrame = ReplayRateFrame.this;
            ReplayRateFrame.access$200(replayRateFrame, (ReplayRateFrame.access$000(replayRateFrame) + 1) % ReplayRateFrame.access$100(ReplayRateFrame.this).length, false);
            ReplayRateFrame.access$300(ReplayRateFrame.this);
            if (giv.f() != null) {
                giv.f().n(ReplayRateFrame.this.mFrameContext, "fastspeed", new String[0]);
            }
            String access$400 = ReplayRateFrame.access$400();
            o3s.b(access$400, " onClick | currentRate=" + ReplayRateFrame.access$100(ReplayRateFrame.this)[ReplayRateFrame.access$000(ReplayRateFrame.this)]);
        }
    }

    static {
        t2o.a(295698484);
        t2o.a(806355016);
    }

    public ReplayRateFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
        if (nh4.B0()) {
            this.rates = new float[]{1.0f, 1.5f, 2.0f};
        } else {
            this.rates = new float[]{1.0f, 1.5f, 2.0f, 3.0f};
        }
    }

    public static /* synthetic */ int access$000(ReplayRateFrame replayRateFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2f93952", new Object[]{replayRateFrame})).intValue();
        }
        return replayRateFrame.currentRateIndex;
    }

    public static /* synthetic */ float[] access$100(ReplayRateFrame replayRateFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("d41ece81", new Object[]{replayRateFrame});
        }
        return replayRateFrame.rates;
    }

    public static /* synthetic */ void access$200(ReplayRateFrame replayRateFrame, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f40f52", new Object[]{replayRateFrame, new Integer(i), new Boolean(z)});
        } else {
            replayRateFrame.changeRate(i, z);
        }
    }

    public static /* synthetic */ void access$300(ReplayRateFrame replayRateFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e108862", new Object[]{replayRateFrame});
        } else {
            replayRateFrame.postChangeRateEvent();
        }
    }

    public static /* synthetic */ String access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60292585", new Object[0]);
        }
        return TAG;
    }

    private void changeRate(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53bd57a8", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.currentRateIndex = i;
        if (!z || i != 0) {
            this.rateView.setText(this.mContext.getString(R.string.taolive_replay_x_rate_flexalocal, Float.valueOf(this.rates[i])));
        } else {
            this.rateView.setText(R.string.taolive_replay_rate_flexalocal);
        }
    }

    private int findRateIndex(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21d5993", new Object[]{this, new Float(f)})).intValue();
        }
        int i = 0;
        while (true) {
            float[] fArr = this.rates;
            if (i >= fArr.length) {
                String str = TAG;
                o3s.b(str, " findRateIndex | rate=" + f);
                return 0;
            } else if (fArr[i] == f) {
                return i;
            } else {
                i++;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(ReplayRateFrame replayRateFrame, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/ReplayRateFrame");
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return IBottomProxy.KEY_FRAME_CLASS_REPLAY_RATE_FRAME;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-replay-rate";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottombar_replay_rate_layout_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_PLAY_RATE_CHANGED};
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
        this.currentRateIndex = 0;
        this.rateView.setText(R.string.taolive_replay_rate_flexalocal);
        sjr.g().b(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        sjr.g().a(this);
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.x() != null) {
            changeRate(findRateIndex(this.mFrameContext.x().t()), true);
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
        this.rateView = (TextView) view.findViewById(R.id.rate);
        ViewProxy.setOnClickListener(view, new a());
    }

    private void postChangeRateEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798a2e91", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", String.valueOf(this.rates[this.currentRateIndex]));
        hashMap.put("needRecord", String.valueOf(true));
        sjr.g().c(uyg.EVENT_PLAY_RATE_CHANGED, hashMap, observeUniqueIdentification());
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (TextUtils.equals(str, uyg.EVENT_PLAY_RATE_CHANGED) && (obj instanceof Map)) {
            changeRate(findRateIndex(zqq.e((String) ((Map) obj).get("type"))), false);
            String str2 = TAG;
            o3s.b(str2, " onEvent | currentRate=" + this.rates[this.currentRateIndex]);
        }
    }
}
