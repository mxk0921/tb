package com.taobao.android.live.plugin.atype.flexalocal.traffic.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.i1e;
import tb.iw0;
import tb.o3s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveCustomToast extends PopupWindow implements i1e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT = 0;
    private static final String TAG = "TrafficCardPopupWindow";
    private static final int TIME_LONG = 3500;
    private static final int TIME_SHORT = 2000;
    private final Context mContext;
    private TUrlImageView mImageView1;
    private TUrlImageView mImageView2;
    private LinearLayout mLinearLayout1;
    private LinearLayout mLinearLayout2;
    private View mRootView;
    private TextView mTv1;
    private TextView mTv2;
    private int mToastHideDuration = 2000;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Duration {
    }

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
            } else if (!((Activity) LiveCustomToast.access$000(LiveCustomToast.this)).isDestroyed()) {
                try {
                    LiveCustomToast.this.dismiss();
                    o3s.b(LiveCustomToast.TAG, "dismiss showAtTopCenter");
                } catch (Exception e) {
                    o3s.b(LiveCustomToast.TAG, "catch exception:" + e.getCause());
                }
            }
        }
    }

    static {
        t2o.a(295700074);
        t2o.a(295700073);
    }

    public LiveCustomToast(Context context) {
        super(context);
        this.mContext = context;
        setupConfig();
    }

    public static /* synthetic */ Context access$000(LiveCustomToast liveCustomToast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9a3567f1", new Object[]{liveCustomToast});
        }
        return liveCustomToast.mContext;
    }

    public static /* synthetic */ Object ipc$super(LiveCustomToast liveCustomToast, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/traffic/ui/LiveCustomToast");
    }

    private void setupConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfe7526", new Object[]{this});
            return;
        }
        setClippingEnabled(true);
        setOutsideTouchable(false);
        this.mRootView = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_toast_traffic_card_flexalocal, (ViewGroup) null);
        setupData();
        setContentView(this.mRootView);
    }

    private void setupData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977f60ce", new Object[]{this});
            return;
        }
        this.mTv1 = (TextView) this.mRootView.findViewById(R.id.taolive_toast_tv1);
        this.mTv2 = (TextView) this.mRootView.findViewById(R.id.taolive_toast_tv2);
        this.mImageView1 = (TUrlImageView) this.mRootView.findViewById(R.id.taolive_toast_image1);
        this.mImageView2 = (TUrlImageView) this.mRootView.findViewById(R.id.taolive_toast_image2);
        this.mLinearLayout1 = (LinearLayout) this.mRootView.findViewById(R.id.taolive_toast_ll1);
        this.mLinearLayout2 = (LinearLayout) this.mRootView.findViewById(R.id.taolive_toast_ll2);
        this.mRootView.setBackground(this.mContext.getResources().getDrawable(R.drawable.taolive_toast_bg_flexalocal));
    }

    public i1e setBottomClickCallback(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i1e) ipChange.ipc$dispatch("ecbd87a8", new Object[]{this, onClickListener});
        }
        TextView textView = this.mTv2;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        return this;
    }

    public i1e setBottomIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i1e) ipChange.ipc$dispatch("99c77b2d", new Object[]{this, str});
        }
        TUrlImageView tUrlImageView = this.mImageView2;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(str);
            this.mImageView2.setVisibility(0);
        }
        return this;
    }

    public i1e setBottomText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i1e) ipChange.ipc$dispatch("89c81f7b", new Object[]{this, charSequence});
        }
        TextView textView = this.mTv2;
        if (textView != null) {
            textView.setText(charSequence);
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.mLinearLayout2.setVisibility(8);
            LinearLayout linearLayout = this.mLinearLayout1;
            if (linearLayout != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.bottomMargin = iw0.a(this.mContext, 18.0f);
                this.mLinearLayout1.setLayoutParams(layoutParams);
            }
        }
        return this;
    }

    public i1e setDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i1e) ipChange.ipc$dispatch("7aa1df1c", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            this.mToastHideDuration = TIME_LONG;
        } else if (i == 0) {
            this.mToastHideDuration = 2000;
        } else {
            this.mToastHideDuration = i;
        }
        return this;
    }

    public i1e setGravity(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i1e) ipChange.ipc$dispatch("7d3a8346", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        return this;
    }

    public i1e setTopClickCallback(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i1e) ipChange.ipc$dispatch("f7fff78e", new Object[]{this, onClickListener});
        }
        TextView textView = this.mTv1;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        return this;
    }

    public i1e setTopIconRes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i1e) ipChange.ipc$dispatch("85d2f11e", new Object[]{this, new Integer(i)});
        }
        TUrlImageView tUrlImageView = this.mImageView1;
        if (tUrlImageView != null) {
            tUrlImageView.setBackgroundResource(i);
            this.mImageView1.setVisibility(0);
        }
        return this;
    }

    public i1e setTopText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i1e) ipChange.ipc$dispatch("76b8fe61", new Object[]{this, charSequence});
        }
        TextView textView = this.mTv1;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return this;
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            showAtTopCenter();
        }
    }

    private void showAtTopCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58d8761", new Object[]{this});
            return;
        }
        try {
            o3s.b(TAG, "start showAtTopCenter:" + this.mContext);
            Context context = this.mContext;
            if (!(context instanceof Activity)) {
                o3s.b(TAG, "showAtTopCenter mContext not Activity");
                return;
            }
            if (!((Activity) context).isDestroyed() && !((Activity) this.mContext).isFinishing()) {
                setFocusable(true);
                setBackgroundDrawable(new BitmapDrawable(this.mContext.getResources(), Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888)));
                setOutsideTouchable(true);
                this.mRootView.measure(0, 0);
                showAtLocation(((Activity) this.mContext).getWindow().getDecorView(), 17, 0, 0);
                this.mMainHandler.postDelayed(new a(), this.mToastHideDuration);
                o3s.b(TAG, "real showAtTopCenter");
                return;
            }
            o3s.b(TAG, "showAtTopCenter mContext Activity Destroyed");
        } catch (Exception e) {
            o3s.b(TAG, "catch exception:" + e.getMessage());
        }
    }

    public i1e setTopIconRes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i1e) ipChange.ipc$dispatch("7919263b", new Object[]{this, str});
        }
        TUrlImageView tUrlImageView = this.mImageView1;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(str);
            this.mImageView1.setVisibility(0);
        }
        return this;
    }
}
