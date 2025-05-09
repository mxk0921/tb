package com.taobao.wireless.link.assistant.display;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.esg;
import tb.jsg;
import tb.md1;
import tb.pg1;
import tb.t2o;
import tb.vt3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AssistantView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TUrlImageView mIvCat;
    private static TextView mTvBubbleText;
    public static int viewHeight;
    public static int viewWidth;
    public long downTime = 0;
    private Context mContext;
    private WindowManager.LayoutParams mParams;
    private final int mScreenWidth;
    private final int mStatusBarHeight;
    private WindowManager windowManager;
    private float xDownInScreen;
    private float xInScreen;
    private float xInView;
    private float yDownInScreen;
    private float yInScreen;
    private float yInView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f14167a;

        public a(AssistantView assistantView, Context context) {
            this.f14167a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            md1.h().l(this.f14167a, false);
            esg.b(esg.ARG1_ASSISTANT_USER_CLOSE, "", "", null);
        }
    }

    static {
        t2o.a(1030750239);
    }

    public AssistantView(Context context) {
        super(context);
        this.mContext = context;
        this.windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        LayoutInflater.from(context).inflate(R.layout.float_window_assistant, this);
        View findViewById = findViewById(R.id.small_window_layout);
        mTvBubbleText = (TextView) findViewById(R.id.tv_bubble);
        mIvCat = (TUrlImageView) findViewById(R.id.iv_cat);
        viewWidth = findViewById.getLayoutParams().width;
        viewHeight = findViewById.getLayoutParams().height;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.mScreenWidth = displayMetrics.widthPixels;
        this.mStatusBarHeight = jsg.j(this.mContext);
        ((TUrlImageView) findViewById(R.id.iv_delete_assistant)).setOnClickListener(new a(this, context));
    }

    public static /* synthetic */ Object ipc$super(AssistantView assistantView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/assistant/display/AssistantView");
    }

    public static void updateAssistantView(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2221b56", new Object[]{new Integer(i), str, str2});
        } else if (i == 0) {
            if (!TextUtils.isEmpty(str)) {
                mTvBubbleText.setVisibility(0);
                mTvBubbleText.setText(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                mIvCat.setStrategyConfig(ImageStrategyConfig.w("1111", "1111").a());
                TUrlImageView tUrlImageView = mIvCat;
                tUrlImageView.setImageUrl(str2 + "?getAvatar=1");
            }
        } else {
            mTvBubbleText.setVisibility(8);
            mIvCat.setStrategyConfig(ImageStrategyConfig.w("1111", "1111").a());
            mIvCat.setImageUrl(str2);
        }
    }

    private void updateViewPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f517eb5e", new Object[]{this});
            return;
        }
        WindowManager.LayoutParams layoutParams = this.mParams;
        layoutParams.x = (int) (this.xInScreen - this.xInView);
        layoutParams.y = (int) (this.yInScreen - this.yInView);
        this.windowManager.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.xInView = motionEvent.getX();
            this.yInView = motionEvent.getY();
            this.xDownInScreen = motionEvent.getRawX();
            this.yDownInScreen = motionEvent.getRawY() - this.mStatusBarHeight;
            this.xInScreen = motionEvent.getRawX();
            this.yInScreen = motionEvent.getRawY() - this.mStatusBarHeight;
            this.downTime = motionEvent.getDownTime();
        } else if (action == 1) {
            if (motionEvent.getEventTime() - this.downTime > 1000) {
                this.downTime = 0L;
                vt3.b(this.mContext);
            } else if (Math.abs(this.xDownInScreen - this.xInScreen) < 5.0f || Math.abs(this.yDownInScreen - this.yInScreen) < 5.0f) {
                vt3.c(this.mContext);
            }
            this.xInScreen += this.mScreenWidth;
            updateViewPosition();
        } else if (action == 2) {
            this.xInScreen = motionEvent.getRawX();
            this.yInScreen = motionEvent.getRawY() - this.mStatusBarHeight;
            updateViewPosition();
        }
        return true;
    }

    public void setParams(WindowManager.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee037bb1", new Object[]{this, layoutParams});
        } else {
            this.mParams = layoutParams;
        }
    }
}
