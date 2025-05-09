package com.taobao.share.ui.engine.weex;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WebMaskView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WebMaskView";
    private RelativeLayout mRlErrView;
    private RelativeLayout mRlLoading;
    private TextView mTextViewRefresh;
    private VesselView mVesselView;
    private String mWebUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (WebMaskView.access$000(WebMaskView.this) != null) {
                WebMaskView.access$000(WebMaskView.this).loadUrl(WebMaskView.access$100(WebMaskView.this));
            }
        }
    }

    static {
        t2o.a(667942975);
    }

    public WebMaskView(VesselView vesselView, String str) {
        super(vesselView.getContext());
        init();
        this.mWebUrl = str;
        this.mVesselView = vesselView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 80));
        setTag("WebMaskView");
        this.mVesselView.addView(this);
    }

    public static /* synthetic */ VesselView access$000(WebMaskView webMaskView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselView) ipChange.ipc$dispatch("9508b486", new Object[]{webMaskView});
        }
        return webMaskView.mVesselView;
    }

    public static /* synthetic */ String access$100(WebMaskView webMaskView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47fe4543", new Object[]{webMaskView});
        }
        return webMaskView.mWebUrl;
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            loadView();
        }
    }

    public static /* synthetic */ Object ipc$super(WebMaskView webMaskView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/ui/engine/weex/WebMaskView");
    }

    private void loadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b9c7b2", new Object[]{this});
            return;
        }
        View inflate = View.inflate(getContext(), R.layout.share_mask_view_state, this);
        if (inflate != null) {
            this.mRlLoading = (RelativeLayout) inflate.findViewById(R.id.rl_loading);
            this.mRlErrView = (RelativeLayout) inflate.findViewById(R.id.rl_err);
            TextView textView = (TextView) inflate.findViewById(R.id.mask_view_refresh);
            this.mTextViewRefresh = textView;
            textView.setOnClickListener(new a());
        }
    }

    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        setProgressBarVisible(true);
        setErrorTextVisible(false);
        setVisibility(8);
    }

    public VesselView getVesselView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselView) ipChange.ipc$dispatch("f7a8d76c", new Object[]{this});
        }
        return this.mVesselView;
    }

    public boolean isRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a275529", new Object[]{this})).booleanValue();
        }
        if (this.mRlErrView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void setErrorTextVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a850eae", new Object[]{this, new Boolean(z)});
            return;
        }
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        if (z) {
            setProgressBarVisible(false);
            this.mRlErrView.setVisibility(0);
            return;
        }
        this.mRlErrView.setVisibility(8);
    }

    public void setProgressBarVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eea94ff", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.mRlLoading.setVisibility(0);
        } else {
            this.mRlLoading.setVisibility(8);
        }
    }

    public void startLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9591a01", new Object[]{this});
            return;
        }
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        RelativeLayout relativeLayout = this.mRlLoading;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        setErrorTextVisible(false);
    }
}
