package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.subscribe.SubscribeUtils;
import tb.jw0;
import tb.o9m;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveSubscribeView extends FrameLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mActivityType;
    private boolean mBold;
    private int mBorderWidth;
    private JSONObject mClickMaidian;
    private float mCornerRadius;
    private String mLiveId;
    private JSONObject mLiveInfo;
    private f mResultCallback;
    private String mSubFrom;
    private int mSubscribeBgColor;
    private int mSubscribeBorderColor;
    private CharSequence mSubscribeText;
    private int mSubscribeTextColor;
    private int mTextGravity;
    private TextView mTextView;
    private int mUnSubscribeBgColor;
    private int mUnSubscribeBorderColor;
    private CharSequence mUnSubscribeText;
    private int mUnSubscribeTextColor;
    private boolean mUserSubscribed;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.taolive.uikit.view.TBLiveSubscribeView.e
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            if (TBLiveSubscribeView.access$000(TBLiveSubscribeView.this) != null) {
                TBLiveSubscribeView.access$000(TBLiveSubscribeView.this).q();
            }
            TBLiveSubscribeView.access$102(TBLiveSubscribeView.this, false);
            TBLiveSubscribeView.access$200(TBLiveSubscribeView.this).put("userSubscribe", (Object) "false");
            TBLiveSubscribeView.this.render();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.taolive.uikit.view.TBLiveSubscribeView.e
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            if (TBLiveSubscribeView.access$000(TBLiveSubscribeView.this) != null) {
                TBLiveSubscribeView.access$000(TBLiveSubscribeView.this).k();
            }
            TBLiveSubscribeView.access$102(TBLiveSubscribeView.this, true);
            TBLiveSubscribeView.access$200(TBLiveSubscribeView.this).put("userSubscribe", (Object) "true");
            TBLiveSubscribeView.this.render();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f13358a;

        public c(e eVar) {
            this.f13358a = eVar;
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            e eVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
                return;
            }
            new StringBuilder("subscribeLiveTopic onNext getRetCode = ").append(subScribeCenterResultDTO.getRetCode());
            if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode()) && (eVar = this.f13358a) != null) {
                try {
                    eVar.onSuccess();
                } catch (Throwable unused) {
                }
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f13359a;

        public d(e eVar) {
            this.f13359a = eVar;
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            e eVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
                return;
            }
            new StringBuilder("cancelSubscribe onNext getRetCode = ").append(subScribeCenterResultDTO.getRetCode());
            if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode()) && (eVar = this.f13359a) != null) {
                try {
                    eVar.onSuccess();
                } catch (Throwable unused) {
                }
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface e {
        void onSuccess();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface f {
        void k();

        void q();
    }

    static {
        t2o.a(779093700);
    }

    public TBLiveSubscribeView(Context context) {
        super(context);
        this.mUserSubscribed = false;
        this.mSubFrom = "tblive_jingxuan";
        this.mActivityType = "taoLiveStartNotify";
    }

    public static /* synthetic */ f access$000(TBLiveSubscribeView tBLiveSubscribeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("bf6781c", new Object[]{tBLiveSubscribeView});
        }
        return tBLiveSubscribeView.mResultCallback;
    }

    public static /* synthetic */ boolean access$102(TBLiveSubscribeView tBLiveSubscribeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("637e40bd", new Object[]{tBLiveSubscribeView, new Boolean(z)})).booleanValue();
        }
        tBLiveSubscribeView.mUserSubscribed = z;
        return z;
    }

    public static /* synthetic */ JSONObject access$200(TBLiveSubscribeView tBLiveSubscribeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3eb34dfc", new Object[]{tBLiveSubscribeView});
        }
        return tBLiveSubscribeView.mLiveInfo;
    }

    private static void cancelSubscribe(Context context, String str, String str2, String str3, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8b00fc", new Object[]{context, str, str2, str3, eVar});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            SubscribeUtils.INSTANCE.cancelSubscribe(str, str3, null, str2, new d(eVar));
        }
    }

    private Drawable createDrawable(int i, int i2, int i3, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("40d89abc", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Float(f2)});
        }
        int b2 = jw0.b(getContext(), f2);
        try {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i, i});
            gradientDrawable.setCornerRadius(b2);
            gradientDrawable.setStroke(i3, i2);
            return gradientDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mTextView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.mTextView, layoutParams);
        setOnClickListener(this);
    }

    public static /* synthetic */ Object ipc$super(TBLiveSubscribeView tBLiveSubscribeView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/view/TBLiveSubscribeView");
    }

    private void setBackground(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142cf15f", new Object[]{this, view, drawable});
        } else if (view != null && drawable != null) {
            view.setBackground(drawable);
        }
    }

    private static void subscribe(Context context, String str, String str2, String str3, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5dd256", new Object[]{context, str, str2, str3, eVar});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            SubscribeUtils.INSTANCE.doSubscribe(str, str3, null, str2, new c(eVar));
        }
    }

    public int getTextGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5324625", new Object[]{this})).intValue();
        }
        return this.mTextGravity;
    }

    public boolean isBold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42a09bda", new Object[]{this})).booleanValue();
        }
        return this.mBold;
    }

    public void render() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        if (this.mUserSubscribed) {
            TextView textView = this.mTextView;
            if (textView != null) {
                textView.setText(this.mSubscribeText);
                this.mTextView.setTextColor(this.mSubscribeTextColor);
            }
            setBackground(this, createDrawable(this.mSubscribeBgColor, this.mSubscribeBorderColor, this.mBorderWidth, this.mCornerRadius));
        } else {
            TextView textView2 = this.mTextView;
            if (textView2 != null) {
                textView2.setText(this.mUnSubscribeText);
                this.mTextView.setTextColor(this.mUnSubscribeTextColor);
            }
            setBackground(this, createDrawable(this.mUnSubscribeBgColor, this.mUnSubscribeBorderColor, this.mBorderWidth, this.mCornerRadius));
        }
        this.mTextView.setGravity(this.mTextGravity);
        if (this.mBold) {
            this.mTextView.getPaint().setFakeBoldText(true);
        }
        this.mTextView.postInvalidate();
    }

    public void setActivityType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af04acbc", new Object[]{this, str});
        } else {
            this.mActivityType = str;
        }
    }

    public void setBold(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f78186", new Object[]{this, new Boolean(z)});
        } else {
            this.mBold = z;
        }
    }

    public void setBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8120324", new Object[]{this, new Integer(i)});
        } else {
            this.mBorderWidth = i;
        }
    }

    public void setClickMaidian(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94e5ec8", new Object[]{this, jSONObject});
        } else {
            this.mClickMaidian = jSONObject;
        }
    }

    public void setCornerRadius(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f2)});
        } else {
            this.mCornerRadius = f2;
        }
    }

    public void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.mLiveId = str;
        }
    }

    public void setLiveInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf03c68d", new Object[]{this, jSONObject});
        } else {
            this.mLiveInfo = jSONObject;
        }
    }

    public void setSubFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32cec7d9", new Object[]{this, str});
        } else {
            this.mSubFrom = str;
        }
    }

    public void setSubscribeBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c5f4cf", new Object[]{this, new Integer(i)});
        } else {
            this.mSubscribeBgColor = i;
        }
    }

    public void setSubscribeBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73bc24d", new Object[]{this, new Integer(i)});
        } else {
            this.mSubscribeBorderColor = i;
        }
    }

    public void setSubscribeText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4ce700", new Object[]{this, charSequence});
        } else {
            this.mSubscribeText = charSequence;
        }
    }

    public void setSubscribeTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ffb00e", new Object[]{this, new Integer(i)});
        } else {
            this.mSubscribeTextColor = i;
        }
    }

    public void setTextGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a513881d", new Object[]{this, new Integer(i)});
        } else {
            this.mTextGravity = i;
        }
    }

    public void setTextSize(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5eecc9", new Object[]{this, new Float(f2)});
            return;
        }
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setTextSize(f2);
        }
    }

    public void setUnSubscribeBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3bff136", new Object[]{this, new Integer(i)});
        } else {
            this.mUnSubscribeBgColor = i;
        }
    }

    public void setUnSubscribeBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fa0a34", new Object[]{this, new Integer(i)});
        } else {
            this.mUnSubscribeBorderColor = i;
        }
    }

    public void setUnSubscribeText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e480e7", new Object[]{this, charSequence});
        } else {
            this.mUnSubscribeText = charSequence;
        }
    }

    public void setUnSubscribeTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36acc5b5", new Object[]{this, new Integer(i)});
        } else {
            this.mUnSubscribeTextColor = i;
        }
    }

    public void setUserSubscribed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cb9406", new Object[]{this, new Boolean(z)});
        } else {
            this.mUserSubscribed = z;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if ((view instanceof TBLiveSubscribeView) && this.mLiveInfo != null) {
            if (this.mUserSubscribed) {
                cancelSubscribe(view.getContext(), this.mLiveId, this.mSubFrom, this.mActivityType, new a());
            } else {
                subscribe(view.getContext(), this.mLiveId, this.mSubFrom, this.mActivityType, new b());
            }
            JSONObject jSONObject = this.mClickMaidian;
            if (jSONObject != null) {
                String string = jSONObject.getString("name");
                o9m.a(string, this.mClickMaidian.getString("params") + ",userSubscribe=" + (true ^ this.mUserSubscribed));
            }
        }
    }

    public TBLiveSubscribeView(Context context, f fVar) {
        this(context, null, fVar);
    }

    public TBLiveSubscribeView(Context context, AttributeSet attributeSet, f fVar) {
        this(context, attributeSet, 0, fVar);
    }

    public TBLiveSubscribeView(Context context, AttributeSet attributeSet, int i, f fVar) {
        super(context, attributeSet, i);
        this.mUserSubscribed = false;
        this.mSubFrom = "tblive_jingxuan";
        this.mActivityType = "taoLiveStartNotify";
        this.mResultCallback = fVar;
        init();
    }
}
