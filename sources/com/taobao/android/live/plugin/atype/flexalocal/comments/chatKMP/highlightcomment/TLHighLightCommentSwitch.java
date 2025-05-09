package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.highlightcomment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.highlightcomment.TLHighLightCommentSwitch;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.a1u;
import tb.kjy;
import tb.niy;
import tb.nw0;
import tb.qjy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TLHighLightCommentSwitch extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView mImageView;
    private b mListener;
    private TLHighLightCommentChildView mSwitch;
    private boolean mSwitchState = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a();

        void b();
    }

    static {
        t2o.a(295698681);
    }

    public TLHighLightCommentSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public static /* synthetic */ boolean access$000(TLHighLightCommentSwitch tLHighLightCommentSwitch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f99d0ab7", new Object[]{tLHighLightCommentSwitch})).booleanValue();
        }
        return tLHighLightCommentSwitch.mSwitchState;
    }

    public static /* synthetic */ boolean access$002(TLHighLightCommentSwitch tLHighLightCommentSwitch, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1575ac3", new Object[]{tLHighLightCommentSwitch, new Boolean(z)})).booleanValue();
        }
        tLHighLightCommentSwitch.mSwitchState = z;
        return z;
    }

    public static /* synthetic */ String access$100(TLHighLightCommentSwitch tLHighLightCommentSwitch, SwitchData switchData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6490f7", new Object[]{tLHighLightCommentSwitch, switchData});
        }
        return tLHighLightCommentSwitch.getDisableToastMessage(switchData);
    }

    public static /* synthetic */ b access$200(TLHighLightCommentSwitch tLHighLightCommentSwitch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("999502ff", new Object[]{tLHighLightCommentSwitch});
        }
        return tLHighLightCommentSwitch.mListener;
    }

    public static /* synthetic */ TLHighLightCommentChildView access$300(TLHighLightCommentSwitch tLHighLightCommentSwitch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TLHighLightCommentChildView) ipChange.ipc$dispatch("ff918845", new Object[]{tLHighLightCommentSwitch});
        }
        return tLHighLightCommentSwitch.mSwitch;
    }

    private void checkCanSendStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ab770b", new Object[]{this, new Boolean(z)});
            return;
        }
        kjy e = kjy.e();
        e.d(new a(e, z), new WeakReference<>(this));
    }

    private String getDisableToastMessage(SwitchData switchData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20607f92", new Object[]{this, switchData});
        }
        if (switchData != null) {
            return switchData.reason;
        }
        return "无法发送醒目评论";
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.taolive_view_highlight_comment_switch_flexalocal, (ViewGroup) this, true);
        this.mImageView = (TUrlImageView) findViewById(R.id.hl_comment_image_view);
        this.mSwitch = (TLHighLightCommentChildView) findViewById(R.id.hl_comment_switch);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hl_comment_switch_container);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#33000000"));
        gradientDrawable.setCornerRadius(nw0.d(context, 15.0f));
        if (linearLayout != null) {
            linearLayout.setBackground(gradientDrawable);
        }
        TUrlImageView tUrlImageView = this.mImageView;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01mTA54B1EsSF75lkSF_!!6000000000407-2-tps-210-64.png");
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: tb.kwy
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$init$27;
                lambda$init$27 = TLHighLightCommentSwitch.this.lambda$init$27(view, motionEvent);
                return lambda$init$27;
            }
        });
    }

    public static /* synthetic */ Object ipc$super(TLHighLightCommentSwitch tLHighLightCommentSwitch, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/highlightcomment/TLHighLightCommentSwitch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$init$27(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6911848", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 1) {
            checkCanSendStatus(!this.mSwitchState);
            view.performClick();
        }
        return true;
    }

    public void addSwitchStateChangeListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73141ac5", new Object[]{this, bVar});
        } else {
            this.mListener = bVar;
        }
    }

    public boolean isSwitchOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("156be988", new Object[]{this})).booleanValue();
        }
        return this.mSwitchState;
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            this.mImageView.setImageUrl(str);
        }
    }

    public void setSwitchState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b84c12", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mSwitchState = z;
        this.mSwitch.setSwitchState(z);
        kjy.e().k(z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements niy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kjy f8433a;
        public final /* synthetic */ boolean b;

        public a(kjy kjyVar, boolean z) {
            this.f8433a = kjyVar;
            this.b = z;
        }

        @Override // tb.niy
        public void a(SwitchData switchData) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efd14f7", new Object[]{this, switchData});
            } else if (switchData != null) {
                HashMap hashMap = new HashMap();
                if (TLHighLightCommentSwitch.access$000(TLHighLightCommentSwitch.this)) {
                    str = "opened";
                } else {
                    str = IDecisionResult.STATE_CLOSED;
                }
                hashMap.put("switch_status", str);
                hashMap.put("index", switchData.remainCommentCnt);
                qjy.d("ArrestComment_Switch", hashMap);
                boolean z = this.f8433a.i(switchData) && switchData.canSend.booleanValue();
                if (this.b) {
                    HashMap hashMap2 = new HashMap();
                    if (z) {
                        str2 = "success";
                    } else {
                        str2 = "fail";
                    }
                    hashMap2.put("result_type", str2);
                    hashMap2.put("reason_type", switchData.reasonType);
                    qjy.e("ArrestComment_SwitchResult", hashMap2);
                }
                if (z || !this.b) {
                    TLHighLightCommentSwitch.access$002(TLHighLightCommentSwitch.this, this.b);
                    TLHighLightCommentSwitch.access$300(TLHighLightCommentSwitch.this).setSwitchState(this.b);
                    if (this.b) {
                        this.f8433a.k(true);
                        if (TLHighLightCommentSwitch.access$200(TLHighLightCommentSwitch.this) != null) {
                            TLHighLightCommentSwitch.access$200(TLHighLightCommentSwitch.this).b();
                            return;
                        }
                        return;
                    }
                    this.f8433a.k(false);
                    if (TLHighLightCommentSwitch.access$200(TLHighLightCommentSwitch.this) != null) {
                        TLHighLightCommentSwitch.access$200(TLHighLightCommentSwitch.this).a();
                        return;
                    }
                    return;
                }
                a1u.a(TLHighLightCommentSwitch.this.getContext(), TLHighLightCommentSwitch.access$100(TLHighLightCommentSwitch.this, switchData));
                if (TLHighLightCommentSwitch.access$200(TLHighLightCommentSwitch.this) != null) {
                    TLHighLightCommentSwitch.access$200(TLHighLightCommentSwitch.this).a();
                }
            }
        }
    }
}
