package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import tb.f3c;
import tb.fzf;
import tb.giv;
import tb.hw0;
import tb.jkd;
import tb.kiv;
import tb.liv;
import tb.nh4;
import tb.o3s;
import tb.p44;
import tb.qt9;
import tb.stk;
import tb.t2o;
import tb.t54;
import tb.to8;
import tb.uo8;
import tb.ux9;
import tb.uyg;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SingleLineTextViewHolder extends BaseItemViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean k = false;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final ViewGroup i;
    public String j;

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
            SingleLineTextViewHolder singleLineTextViewHolder = SingleLineTextViewHolder.this;
            SingleLineTextViewHolder.h0(singleLineTextViewHolder, SingleLineTextViewHolder.g0(singleLineTextViewHolder));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8440a;

        public b(String str) {
            this.f8440a = str;
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                return;
            }
            Context context = SingleLineTextViewHolder.this.f8434a;
            kiv.c(context, liv.c(context, jkdVar));
            SingleLineTextViewHolder.i0(SingleLineTextViewHolder.this);
            f3c h = SingleLineTextViewHolder.this.d.h();
            String str2 = this.f8440a;
            t54 t54Var = SingleLineTextViewHolder.this.d;
            if (t54Var == null) {
                str = null;
            } else {
                str = t54Var.C();
            }
            h.c(uyg.EVENT_ACTION_FOLLOW, str2, str);
            if (SingleLineTextViewHolder.g0(SingleLineTextViewHolder.this).equals("follow")) {
                SingleLineTextViewHolder.j0(SingleLineTextViewHolder.this).setVisibility(8);
            }
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            String string = SingleLineTextViewHolder.this.f8434a.getResources().getString(R.string.taolive_comments_user_follow_fail_flexalocal);
            if (TextUtils.isEmpty(str2)) {
                str2 = string;
            }
            kiv.c(SingleLineTextViewHolder.this.f8434a, str2);
        }
    }

    static {
        t2o.a(295698701);
    }

    public SingleLineTextViewHolder(View view, ViewGroup viewGroup, ux9 ux9Var) {
        super(view, ux9Var);
        this.i = viewGroup;
        this.f = (TextView) view.findViewById(R.id.taolive_chat_item_name);
        this.g = (TextView) view.findViewById(R.id.taolive_chat_item_content);
        this.h = (TextView) view.findViewById(R.id.taolive_chat_item_action);
    }

    public static /* synthetic */ String g0(SingleLineTextViewHolder singleLineTextViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7ce5716", new Object[]{singleLineTextViewHolder});
        }
        return singleLineTextViewHolder.j;
    }

    public static /* synthetic */ void h0(SingleLineTextViewHolder singleLineTextViewHolder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45489715", new Object[]{singleLineTextViewHolder, str});
        } else {
            singleLineTextViewHolder.p0(str);
        }
    }

    public static /* synthetic */ void i0(SingleLineTextViewHolder singleLineTextViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e952294c", new Object[]{singleLineTextViewHolder});
        } else {
            singleLineTextViewHolder.l0();
        }
    }

    public static /* synthetic */ Object ipc$super(SingleLineTextViewHolder singleLineTextViewHolder, String str, Object... objArr) {
        if (str.hashCode() == -815397012) {
            super.b0((fzf) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/view/SingleLineTextViewHolder");
    }

    public static /* synthetic */ TextView j0(SingleLineTextViewHolder singleLineTextViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("3a13aa01", new Object[]{singleLineTextViewHolder});
        }
        return singleLineTextViewHolder.h;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.BaseItemViewHolder
    public void b0(fzf fzfVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf66076c", new Object[]{this, fzfVar, tBLiveDataModel});
            return;
        }
        super.b0(fzfVar, tBLiveDataModel);
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = fzfVar.f19644a;
        if (taoLiveKtCommentEntity == null) {
            o3s.b("SingleLineTextViewHolder", "entity is null");
            return;
        }
        this.itemView.setBackground(c0());
        this.f.setText(taoLiveKtCommentEntity.getName() + " ");
        this.f.setTextColor(e0());
        this.g.setText(taoLiveKtCommentEntity.getContent());
        String enhancedTypeValue = taoLiveKtCommentEntity.enhancedTypeValue();
        this.j = enhancedTypeValue;
        u0(enhancedTypeValue);
        if (this.h.getVisibility() == 0) {
            this.h.setText(n0(this.j));
            if (nh4.v()) {
                this.h.setTypeface(Typeface.DEFAULT, 1);
            }
            this.h.setOnClickListener(new a());
        }
        k0();
    }

    public final void k0() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe47fd65", new Object[]{this});
        } else if (this.itemView instanceof ViewGroup) {
            int measuredWidth = ((((this.i.getMeasuredWidth() - this.i.getPaddingLeft()) - this.i.getPaddingRight()) - this.itemView.getPaddingLeft()) - this.itemView.getPaddingRight()) - hw0.b(this.itemView.getContext(), p44.f25871a);
            int b2 = hw0.b(this.f8434a, 50.0f);
            int i2 = measuredWidth;
            for (int i3 = 0; i3 < ((ViewGroup) this.itemView).getChildCount(); i3++) {
                View childAt = ((ViewGroup) this.itemView).getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(b2, Integer.MIN_VALUE);
                    if (!(childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                        i = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
                    } else if (childAt.getLayoutParams().width > 0) {
                        i = View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().width, 1073741824);
                    } else {
                        i = View.MeasureSpec.makeMeasureSpec((measuredWidth - ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).leftMargin) - ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).rightMargin, Integer.MIN_VALUE);
                    }
                    childAt.measure(i, makeMeasureSpec);
                    if (childAt != this.f) {
                        i2 -= childAt.getMeasuredWidth();
                        if (childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                            i2 -= ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).leftMargin + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).rightMargin;
                        }
                    }
                }
            }
            if (this.f.getMeasuredWidth() > i2 && i2 > hw0.b(this.f8434a, 20.0f)) {
                TextView textView = this.f;
                textView.setText(TextUtils.ellipsize(textView.getText(), this.f.getPaint(), i2, TextUtils.TruncateAt.END));
            }
        }
    }

    public final void l0() {
        String str;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c3e217", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.c.mVideoInfo;
        if (!(videoInfo == null || (accountInfo = videoInfo.broadCaster) == null)) {
            accountInfo.follow = true;
        }
        f3c h = this.d.h();
        t54 t54Var = this.d;
        if (t54Var == null) {
            str = null;
        } else {
            str = t54Var.C();
        }
        h.c(uyg.EVENT_COMMENT_FOLLOW_SUCCESS, null, str);
    }

    public final void m0(qt9 qt9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49cf7e7", new Object[]{this, qt9Var, str});
        } else {
            v2s.o().k().f(qt9Var, new b(str));
        }
    }

    public final String n0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f878396", new Object[]{this, str});
        }
        if (str.equals("share")) {
            return "我也分享";
        }
        return "我也关注";
    }

    public final Drawable o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("3da0ab44", new Object[]{this});
        }
        if (nh4.v()) {
            return this.itemView.getResources().getDrawable(R.drawable.taolive_comments_comment_denoise_action_bg_flexalocal);
        }
        return this.itemView.getResources().getDrawable(R.drawable.taolive_comments_comment_action_bg_flexalocal);
    }

    public final void p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49258bb", new Object[]{this, str});
            return;
        }
        str.hashCode();
        if (str.equals("follow")) {
            q0();
        } else if (str.equals("share")) {
            r0();
        }
    }

    public final void q0() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9454896", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.c.mVideoInfo;
        if (videoInfo != null) {
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                str = accountInfo.accountId;
                str2 = accountInfo.type;
            } else {
                str = "";
                str2 = str;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                qt9 qt9Var = new qt9();
                qt9Var.c = videoInfo.liveId;
                qt9Var.b = str2;
                qt9Var.f26917a = str;
                qt9Var.o = qt9.FOLLOW_COMMENT;
                qt9 b2 = giv.f().b(this.d, qt9Var);
                m0(b2, b2.f26917a);
                HashMap hashMap = new HashMap();
                hashMap.put("follow_location", to8.COMMENT);
                giv.f().l(this.d, this.f8434a, str, hashMap);
                uo8.f(this.d, "follow", 0L);
            }
        }
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65384db4", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.c.mVideoInfo;
        HashMap hashMap = new HashMap();
        hashMap.put("sharelive_location", to8.COMMENT);
        giv.d().showShare((Activity) this.f8434a, videoInfo.landScape, hashMap);
    }

    public final void s0() {
        boolean z;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5616bda", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.c.mVideoInfo;
        if (videoInfo == null || (accountInfo = videoInfo.broadCaster) == null) {
            z = false;
        } else {
            z = accountInfo.follow;
        }
        if (z) {
            this.h.setVisibility(8);
            return;
        }
        if (!k) {
            k = true;
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("follow_location", to8.COMMENT);
            giv.f().p(this.d, "Show-AccountFollow", hashMap);
        }
        this.h.setVisibility(0);
    }

    public final void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45de21ae", new Object[]{this});
            return;
        }
        if (!k) {
            k = true;
            giv.f().p(this.d, "Show-ShareLive", null);
        }
        this.h.setVisibility(0);
    }

    public final void u0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcaf4053", new Object[]{this, str});
            return;
        }
        this.h.setBackground(o0());
        str.hashCode();
        if (str.equals("follow")) {
            s0();
        } else if (str.equals("share")) {
            t0();
        }
    }
}
