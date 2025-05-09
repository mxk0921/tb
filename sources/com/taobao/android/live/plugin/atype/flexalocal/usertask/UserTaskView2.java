package com.taobao.android.live.plugin.atype.flexalocal.usertask;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksDotaskResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksEntryResponseData;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.cy0;
import tb.iw0;
import tb.mh1;
import tb.nh4;
import tb.rg0;
import tb.s8d;
import tb.szd;
import tb.t2o;
import tb.v2s;
import tb.voj;
import tb.why;
import tb.yqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UserTaskView2 extends FrameLayout implements szd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mAtmosphere;
    private ValueAnimator mAtmosphereCountdown;
    private ValueAnimator mAtmosphereHideAnimator;
    private boolean mAtmosphereHideAnimatorFunCancel;
    private AnimatorSet mAtmosphereHideAnimatorSet;
    private ValueAnimator mAtmosphereShowAnimator;
    private TextView mEntryText;
    private TUrlImageView mIcon;
    private boolean mShowCashFirst = true;
    private Random mRand = new Random();
    private int mTaskCountSwithRadomMax = nh4.i1();
    private boolean mAtmosphereHideAnimator4Cancel = false;
    private TUrlImageView mAliUrlImageView = (TUrlImageView) findViewById(R.id.taolive_room_bottom_usertask_img);
    private UserTaskProgress mUserTaskProgress = (UserTaskProgress) findViewById(R.id.taolive_room_bottom_usertask_progress);
    private TextView mTitle = (TextView) findViewById(R.id.title);
    private TextView mContent = (TextView) findViewById(R.id.content);
    private TextSwitcher mContentSwitch = (TextSwitcher) findViewById(R.id.content_switcher);
    private TextView mContentUnit = (TextView) findViewById(R.id.content_unit);
    private LinearLayout mAtmosphereBanner = (LinearLayout) findViewById(R.id.taolive_room_usertask_atmosphere_banner);
    private ViewGroup mEntryLayout = (ViewGroup) findViewById(R.id.taolive_room_usertask_entry_layout);
    private ViewGroup mEntry = (ViewGroup) findViewById(R.id.taolive_room_usertask_entry);
    private TextView mInnerGoldText = (TextView) findViewById(R.id.taolive_usertask_inner_gold_text);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(UserTaskView2 userTaskView2) {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable instanceof cy0) {
                ((cy0) drawable).B(1);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f8727a;

        public b(boolean z) {
            this.f8727a = z;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else if (UserTaskView2.access$100(UserTaskView2.this) != null) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = UserTaskView2.access$100(UserTaskView2.this).getLayoutParams();
                layoutParams.width = intValue;
                UserTaskView2.access$100(UserTaskView2.this).setLayoutParams(layoutParams);
                if (this.f8727a) {
                    ((View) UserTaskView2.this.getParent()).setX(0.0f);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f8728a;

        public c(boolean z) {
            this.f8728a = z;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else if (UserTaskView2.access$100(UserTaskView2.this) != null) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = UserTaskView2.access$100(UserTaskView2.this).getLayoutParams();
                layoutParams.width = intValue;
                UserTaskView2.access$100(UserTaskView2.this).setLayoutParams(layoutParams);
                if (this.f8728a) {
                    ((View) UserTaskView2.this.getParent()).setX(0.0f);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f8729a;

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
                    return;
                }
                d dVar = d.this;
                UserTaskView2.access$300(UserTaskView2.this, true, dVar.f8729a);
                UserTaskView2.access$402(UserTaskView2.this, false);
                if (UserTaskView2.access$100(UserTaskView2.this) != null) {
                    UserTaskView2.access$100(UserTaskView2.this).setVisibility(8);
                }
            }
        }

        public d(boolean z) {
            this.f8729a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            UserTaskView2.access$200(UserTaskView2.this, "mAtmosphereHideAnimator onAnimationCancel");
            if (UserTaskView2.access$500(UserTaskView2.this)) {
                UserTaskView2.access$300(UserTaskView2.this, false, this.f8729a);
                UserTaskView2.access$402(UserTaskView2.this, true);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (UserTaskView2.access$100(UserTaskView2.this) != null) {
                UserTaskView2.access$100(UserTaskView2.this).post(new a());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                UserTaskView2.access$200(UserTaskView2.this, "mAtmosphereHideAnimator onAnimationStart");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            UserTaskView2 userTaskView2 = UserTaskView2.this;
            String string = UserTaskView2.access$000(userTaskView2).getString("content");
            String string2 = UserTaskView2.access$000(UserTaskView2.this).getString(mh1.PRICE_UNIT);
            UserTaskView2.access$600(userTaskView2, false, string, string2, intValue + "", UserTaskView2.access$000(UserTaskView2.this).getString("contentColor"), true, false);
        }
    }

    static {
        t2o.a(295700098);
        t2o.a(295700085);
    }

    public UserTaskView2(Context context) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.taolive_room_bottom_usertask_view_flexalocal, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.taolive_room_bottom_usertask_tv);
        this.mEntryText = textView;
        textView.setVisibility(8);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.icon);
        this.mIcon = tUrlImageView;
        tUrlImageView.setVisibility(8);
        this.mContentSwitch.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.UserTaskView2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.ViewSwitcher.ViewFactory
            public View makeView() {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (View) ipChange.ipc$dispatch("f2361e7c", new Object[]{this});
                }
                TextView textView2 = new TextView(UserTaskView2.this.getContext());
                if (UserTaskView2.access$000(UserTaskView2.this) == null || TextUtils.isEmpty(UserTaskView2.access$000(UserTaskView2.this).getString("contentColor"))) {
                    str = why.DEFAULT_MASK_BACKGROUND_COLOR;
                } else {
                    str = UserTaskView2.access$000(UserTaskView2.this).getString("contentColor");
                }
                try {
                    textView2.setTextColor(Color.parseColor(str));
                } catch (Exception unused) {
                }
                textView2.setTextSize(0, iw0.a(UserTaskView2.this.getContext(), 10.0f));
                return textView2;
            }
        });
        this.mAliUrlImageView.succListener(new a(this));
    }

    public static /* synthetic */ JSONObject access$000(UserTaskView2 userTaskView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e755bf5c", new Object[]{userTaskView2});
        }
        return userTaskView2.mAtmosphere;
    }

    public static /* synthetic */ LinearLayout access$100(UserTaskView2 userTaskView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("a1496a54", new Object[]{userTaskView2});
        }
        return userTaskView2.mAtmosphereBanner;
    }

    public static /* synthetic */ void access$200(UserTaskView2 userTaskView2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55807f08", new Object[]{userTaskView2, str});
        } else {
            userTaskView2.loge(str);
        }
    }

    public static /* synthetic */ void access$300(UserTaskView2 userTaskView2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c56941bf", new Object[]{userTaskView2, new Boolean(z), new Boolean(z2)});
        } else {
            userTaskView2.jumpLive(z, z2);
        }
    }

    public static /* synthetic */ boolean access$402(UserTaskView2 userTaskView2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f1a70d6", new Object[]{userTaskView2, new Boolean(z)})).booleanValue();
        }
        userTaskView2.mAtmosphereHideAnimatorFunCancel = z;
        return z;
    }

    public static /* synthetic */ boolean access$500(UserTaskView2 userTaskView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51636f85", new Object[]{userTaskView2})).booleanValue();
        }
        return userTaskView2.enableAnimationCancelJumpUrl();
    }

    public static /* synthetic */ void access$600(UserTaskView2 userTaskView2, boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62bc6b7a", new Object[]{userTaskView2, new Boolean(z), str, str2, str3, str4, new Boolean(z2), new Boolean(z3)});
        } else {
            userTaskView2.setContent(z, str, str2, str3, str4, z2, z3);
        }
    }

    private void appMonitorCount(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f4b13c", new Object[]{this, str, new Integer(i)});
        } else if (v2s.o().e() != null) {
            v2s.o().e().a("taolive", str, i);
        }
    }

    private void atmosphereBannerHideAnimator(boolean z, int i, boolean z2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779a37fc", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2), new Integer(i2)});
        } else if (this.mAtmosphere != null) {
            ValueAnimator duration = ValueAnimator.ofInt(i, 0).setDuration(500L);
            this.mAtmosphereHideAnimator = duration;
            this.mAtmosphereHideAnimator4Cancel = false;
            this.mAtmosphereHideAnimatorFunCancel = false;
            duration.addUpdateListener(new c(z));
            this.mAtmosphereHideAnimator.addListener(new d(z2));
            int intValue = (this.mAtmosphere.getIntValue("duration") * 1000) - 500;
            if (z2) {
                int intValue2 = this.mAtmosphere.getIntValue("duration") + i2;
                int i3 = intValue2 * 1000;
                ValueAnimator duration2 = ValueAnimator.ofInt(intValue2, 0).setDuration(i3);
                this.mAtmosphereCountdown = duration2;
                duration2.addUpdateListener(new e());
                intValue = i3 - 500;
            }
            if (intValue < 0) {
                intValue = 0;
            }
            this.mAtmosphereHideAnimator.setStartDelay(intValue);
            AnimatorSet animatorSet = new AnimatorSet();
            this.mAtmosphereHideAnimatorSet = animatorSet;
            if (z2) {
                animatorSet.playTogether(this.mAtmosphereHideAnimator, this.mAtmosphereCountdown);
            } else {
                animatorSet.playTogether(this.mAtmosphereHideAnimator);
            }
            this.mAtmosphereHideAnimatorSet.start();
        }
    }

    private void atmosphereBannerShowAnimator(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce1e708", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if (this.mAtmosphere != null) {
            ValueAnimator duration = ValueAnimator.ofInt(0, i).setDuration(500L);
            this.mAtmosphereShowAnimator = duration;
            duration.addUpdateListener(new b(z));
            this.mAtmosphereShowAnimator.start();
        }
    }

    private void customEvent(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0c6f88", new Object[]{this, new Integer(i), str, map});
        } else if (v2s.o().t() != null) {
            v2s.o().t().g(i, str, map);
        }
    }

    private int getTipLength(boolean z) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ad33955", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (z) {
            textView = (TextView) this.mContentSwitch.getCurrentView();
        } else {
            textView = this.mContent;
        }
        return ((int) (iw0.a(getContext(), 47.0f) + iw0.a(getContext(), 9.0f) + Math.max(Layout.getDesiredWidth(textView.getText().toString(), 0, textView.getText().length(), textView.getPaint()), Layout.getDesiredWidth(this.mTitle.getText().toString(), 0, this.mTitle.getText().length(), this.mTitle.getPaint())))) + iw0.a(getContext(), 15.0f);
    }

    public static /* synthetic */ Object ipc$super(UserTaskView2 userTaskView2, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/usertask/UserTaskView2");
    }

    private void jumpLive(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c51801", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        loge("mAtmosphereHideAnimator onAnimationEnd=" + z + "mAtmosphereHideAnimator4Cancel=" + this.mAtmosphereHideAnimator4Cancel + " countdownAndJump=" + z2 + " jumpUrl=" + this.mAtmosphere.getString(rg0.JUMP_URL));
        if (!this.mAtmosphereHideAnimator4Cancel && !this.mAtmosphereHideAnimatorFunCancel && z2 && this.mAtmosphere.getString(rg0.JUMP_URL) != null) {
            voj.a(getContext(), this.mAtmosphere.getString(rg0.JUMP_URL));
            appMonitorCount("UserTaskJumpAction", 1);
            HashMap hashMap = new HashMap();
            hashMap.put("fromEnd", Boolean.toString(z));
            customEvent(19999, "UserTaskJumpAction", hashMap);
            loge("mAtmosphereHideAnimator jumpUrl");
        }
    }

    private void loge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ada172", new Object[]{this, str});
        } else if (v2s.o().A() != null) {
            v2s.o().A().c("UserTaskController", str);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0184 -> B:66:0x01a3). Please submit an issue!!! */
    private void setContent(boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e458fe", new Object[]{this, new Boolean(z), str, str2, str3, str4, new Boolean(z2), new Boolean(z3)});
            return;
        }
        String str5 = "";
        if (z2) {
            if (str == null) {
                str = str5;
            }
            if (str3 != null) {
                str = str + str3;
            }
            if (str2 != null) {
                str = str + str2;
            }
            if (z3) {
                this.mAtmosphereBanner.setVisibility(4);
            }
            this.mContent.setVisibility(0);
            this.mContentSwitch.setVisibility(8);
            this.mContentUnit.setVisibility(8);
            this.mContent.setText(str);
        } else {
            if (str != null) {
                str5 = str;
            }
            if (str2 != null) {
                str5 = str5 + str2;
            }
            if (!TextUtils.isEmpty(str5)) {
                if (!z) {
                    if (z3) {
                        this.mAtmosphereBanner.setVisibility(4);
                    }
                    this.mContent.setVisibility(0);
                    this.mContentSwitch.setVisibility(8);
                    this.mContentUnit.setVisibility(8);
                    SpannableString spannableString = new SpannableString(str5);
                    if (!TextUtils.isEmpty(str)) {
                        int length = str.length();
                        spannableString.setSpan(new AbsoluteSizeSpan(10, true), 0, length, 17);
                        i = length;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        spannableString.setSpan(new AbsoluteSizeSpan(10, true), i, str2.length() + i, 17);
                    }
                    this.mContent.setText(spannableString);
                } else {
                    this.mContent.setVisibility(8);
                    if (!TextUtils.isEmpty(str)) {
                        this.mContentSwitch.setVisibility(0);
                        if (this.mShowCashFirst) {
                            this.mContentSwitch.setCurrentText(str);
                        } else {
                            this.mContentSwitch.setText(str);
                        }
                        this.mShowCashFirst = false;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        this.mContentUnit.setVisibility(0);
                        this.mContentUnit.setText(str2);
                    } else {
                        this.mContentUnit.setVisibility(8);
                    }
                    try {
                        if (!TextUtils.isEmpty(str4) && (this.mContentSwitch.getCurrentView() instanceof TextView) && (this.mContentSwitch.getNextView() instanceof TextView)) {
                            ((TextView) this.mContentSwitch.getCurrentView()).setTextColor(Color.parseColor(str4));
                            ((TextView) this.mContentSwitch.getNextView()).setTextColor(Color.parseColor(str4));
                            this.mContentUnit.setTextColor(Color.parseColor(str4));
                            if (!str4.equalsIgnoreCase(why.DEFAULT_MASK_BACKGROUND_COLOR)) {
                                Typeface typeface = Typeface.DEFAULT_BOLD;
                                ((TextView) this.mContentSwitch.getCurrentView()).setTypeface(typeface);
                                ((TextView) this.mContentSwitch.getNextView()).setTypeface(typeface);
                                this.mContentUnit.setTypeface(typeface);
                            } else {
                                Typeface typeface2 = Typeface.DEFAULT;
                                ((TextView) this.mContentSwitch.getCurrentView()).setTypeface(typeface2);
                                ((TextView) this.mContentSwitch.getNextView()).setTypeface(typeface2);
                                this.mContentUnit.setTypeface(typeface2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            try {
                if (!str4.equalsIgnoreCase(why.DEFAULT_MASK_BACKGROUND_COLOR)) {
                    this.mContent.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    this.mContent.setTypeface(Typeface.DEFAULT);
                }
                this.mContent.setTextColor(Color.parseColor(str4));
            } catch (Exception unused2) {
            }
        }
    }

    private void setTitle(String str, String str2, String str3) {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e5f6bb", new Object[]{this, str, str2, str3});
            return;
        }
        if (TextUtils.isEmpty(str2) || (tUrlImageView = this.mIcon) == null) {
            TUrlImageView tUrlImageView2 = this.mIcon;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setVisibility(8);
            }
        } else {
            tUrlImageView.setVisibility(0);
            this.mIcon.setImageUrl(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            this.mTitle.setText(str);
        }
        if (!TextUtils.isEmpty(str3)) {
            try {
                if (!str3.equalsIgnoreCase(why.DEFAULT_MASK_BACKGROUND_COLOR)) {
                    this.mTitle.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    this.mTitle.setTypeface(Typeface.DEFAULT);
                }
                this.mTitle.setTextColor(Color.parseColor(str3));
            } catch (Exception unused) {
            }
        }
    }

    private void showInnerGold(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96913d90", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            this.mInnerGoldText.setVisibility(8);
        } else {
            String str2 = "";
            if (jSONObject.getString("actionText") == null) {
                str = str2;
            } else {
                str = jSONObject.getString("actionText");
            }
            if (jSONObject.getString("content") != null) {
                str2 = jSONObject.getString("content");
            }
            this.mInnerGoldText.setVisibility(0);
            this.mInnerGoldText.setText(str + str2);
        }
    }

    @Override // tb.szd
    public void changeGoldUI(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e94467", new Object[]{this, obj});
        } else if (obj instanceof MtopIliadUsertaskTasksEntryResponseData) {
            JSONObject jSONObject = ((MtopIliadUsertaskTasksEntryResponseData) obj).asset;
            if (jSONObject != null) {
                showInnerGold(jSONObject);
            }
        } else if (obj instanceof MtopIliadUsertaskTasksDotaskResponseData) {
            showInnerGold(((MtopIliadUsertaskTasksDotaskResponseData) obj).asset);
        }
    }

    @Override // tb.szd
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this;
    }

    @Override // tb.szd
    public void hideEntryInnerText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd1e53a", new Object[]{this});
            return;
        }
        TextView textView = this.mInnerGoldText;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // tb.szd
    public boolean isNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b5aa5a1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        resetAtmosphere(true);
    }

    @Override // tb.szd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.mAtmosphereHideAnimatorSet;
        if (animatorSet != null && animatorSet.isStarted()) {
            loge("mAtmosphereHideAnimatorSet.pause");
            this.mAtmosphereHideAnimatorSet.pause();
        }
    }

    @Override // tb.szd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.mAtmosphereHideAnimatorSet;
        if (animatorSet != null && animatorSet.isStarted()) {
            loge("mAtmosphereHideAnimatorSet.resume");
            this.mAtmosphereHideAnimatorSet.resume();
        }
    }

    @Override // tb.szd
    public void reset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847be2a0", new Object[]{this, str});
            return;
        }
        setEntryText(str);
        resetAtmosphere(true);
    }

    @Override // tb.szd
    public void setEntryImage(String str, String str2, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1f8e6e", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        TUrlImageView tUrlImageView = this.mAliUrlImageView;
        if (tUrlImageView != null) {
            tUrlImageView.setSkipAutoSize(true);
            this.mAliUrlImageView.setWhenNullClearImg(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mAliUrlImageView.getLayoutParams();
            if (!TextUtils.isEmpty(str2)) {
                if (!str2.equals(this.mAliUrlImageView.getImageUrl())) {
                    this.mAliUrlImageView.setImageUrl(str2);
                }
            } else if (!TextUtils.isEmpty(str) && !str.equals(this.mAliUrlImageView.getImageUrl())) {
                this.mAliUrlImageView.setImageUrl(str);
            }
            this.mAliUrlImageView.setLayoutParams(layoutParams);
        }
        UserTaskProgress userTaskProgress = this.mUserTaskProgress;
        if (userTaskProgress != null) {
            if (!z) {
                i = 8;
            }
            userTaskProgress.setVisibility(i);
        }
    }

    @Override // tb.szd
    public void setEntryText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2335f94e", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.mEntryText.setVisibility(0);
            this.mEntryText.setText(str);
        } else {
            this.mEntryText.setVisibility(8);
        }
    }

    @Override // tb.szd
    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        UserTaskProgress userTaskProgress = this.mUserTaskProgress;
        if (userTaskProgress != null) {
            userTaskProgress.setProgress(f);
            this.mUserTaskProgress.postInvalidate();
        }
    }

    private void resetAtmosphere(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f2b9fc", new Object[]{this, new Boolean(z)});
            return;
        }
        loge("resetAtmosphere");
        ValueAnimator valueAnimator = this.mAtmosphereShowAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.mAtmosphereHideAnimatorSet != null) {
            loge("resetAtmosphere mAtmosphereHideAnimator4Cancel = true");
            if (z) {
                this.mAtmosphereHideAnimator4Cancel = true;
            }
            this.mAtmosphereHideAnimatorSet.cancel();
        }
        LinearLayout linearLayout = this.mAtmosphereBanner;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    private boolean enableAnimationCancelJumpUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("897e851", new Object[]{this})).booleanValue();
        }
        return v2s.o().p() != null && yqq.h(v2s.o().p().b("tblive", "enableAnimationCancelJumpUrl", "true"));
    }

    @Override // tb.szd
    public void setAtmosphere(JSONObject jSONObject) {
        int i;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2226a5", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("durationType"))) {
            if ("countdown_jump".equals(jSONObject.getString("durationType"))) {
                appMonitorCount("UserTaskJumpType", 1);
                customEvent(19999, "UserTaskJumpType", new HashMap());
            }
            if ("once".equals(jSONObject.getString("durationType")) || "countdown_jump".equals(jSONObject.getString("durationType"))) {
                resetAtmosphere(false);
            }
            this.mAtmosphere = jSONObject;
            boolean equals = "countdown_jump".equals(jSONObject.getString("durationType"));
            if (equals) {
                loge("mTaskCountSwithRadomMax " + this.mTaskCountSwithRadomMax);
                int nextInt = this.mRand.nextInt(this.mTaskCountSwithRadomMax);
                i = nextInt == 0 ? 1 : nextInt;
            } else {
                i = 0;
            }
            setTitle(this.mAtmosphere.getString("title"), this.mAtmosphere.getString("icon"), this.mAtmosphere.getString("titleColor"));
            String string2 = this.mAtmosphere.getString("content");
            String string3 = this.mAtmosphere.getString(mh1.PRICE_UNIT);
            if (equals) {
                string = this.mAtmosphere.getString("duration") + i;
            } else {
                string = this.mAtmosphere.getString("duration");
            }
            setContent(true, string2, string3, string, this.mAtmosphere.getString("contentColor"), equals, true);
            int[] iArr = new int[2];
            this.mEntryLayout.getLocationInWindow(iArr);
            boolean z = iArr[0] < iw0.f() / 2 && iArr[1] > 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mEntryLayout.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mEntry.getLayoutParams();
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.mAtmosphereBanner.getLayoutParams();
            if (z) {
                layoutParams.gravity = 3;
                this.mEntryLayout.setLayoutParams(layoutParams);
                layoutParams2.gravity = 3;
                this.mEntry.setLayoutParams(layoutParams2);
                layoutParams3.gravity = 5;
                this.mAtmosphereBanner.setLayoutParams(layoutParams3);
                this.mAtmosphereBanner.setPadding(iw0.a(getContext(), 47.0f), iw0.a(getContext(), 5.0f), iw0.a(getContext(), 9.0f), 0);
            } else {
                layoutParams.gravity = 5;
                this.mEntryLayout.setLayoutParams(layoutParams);
                layoutParams2.gravity = 5;
                this.mEntry.setLayoutParams(layoutParams2);
                layoutParams3.gravity = 3;
                this.mAtmosphereBanner.setLayoutParams(layoutParams3);
                this.mAtmosphereBanner.setPadding(iw0.a(getContext(), 9.0f), iw0.a(getContext(), 5.0f), iw0.a(getContext(), 47.0f), 0);
            }
            this.mAtmosphereBanner.setVisibility(0);
            int tipLength = getTipLength(true);
            if (TextUtils.isEmpty(this.mAtmosphere.getString("durationType")) || "countdown_jump".equals(this.mAtmosphere.getString("durationType")) || "once".equals(this.mAtmosphere.getString("durationType")) || (RVStartParams.TRANSPARENT_TITLE_ALWAYS.equals(this.mAtmosphere.getString("durationType")) && this.mAtmosphereShowAnimator != null)) {
                atmosphereBannerShowAnimator(z, tipLength);
            }
            if (TextUtils.isEmpty(this.mAtmosphere.getString("durationType")) || "countdown_jump".equals(this.mAtmosphere.getString("durationType")) || "close".equals(this.mAtmosphere.getString("durationType")) || "once".equals(this.mAtmosphere.getString("durationType"))) {
                atmosphereBannerHideAnimator(z, tipLength, equals, i);
            }
        }
    }
}
