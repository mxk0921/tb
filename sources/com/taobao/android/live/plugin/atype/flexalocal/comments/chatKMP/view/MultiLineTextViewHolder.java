package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentBgStyle;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.fzf;
import tb.gq0;
import tb.iw0;
import tb.o3s;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MultiLineTextViewHolder extends BaseItemViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TextView f;

    static {
        t2o.a(295698699);
    }

    public MultiLineTextViewHolder(View view, ux9 ux9Var) {
        super(view, ux9Var);
        this.f = (TextView) view.findViewById(R.id.taolive_chat_item_content);
    }

    public static /* synthetic */ Object ipc$super(MultiLineTextViewHolder multiLineTextViewHolder, String str, Object... objArr) {
        if (str.hashCode() == -815397012) {
            super.b0((fzf) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/view/MultiLineTextViewHolder");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.BaseItemViewHolder
    public void b0(fzf fzfVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf66076c", new Object[]{this, fzfVar, tBLiveDataModel});
            return;
        }
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = fzfVar.f19644a;
        if (taoLiveKtCommentEntity == null) {
            o3s.b("MultiLineTextViewHolder", "entity is null");
            return;
        }
        super.b0(fzfVar, tBLiveDataModel);
        g0(taoLiveKtCommentEntity.getBgStyle());
        this.f.setText((CharSequence) null);
        this.f.setVisibility(0);
        List<SpannableString> list = fzfVar.b;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) fzfVar.b).iterator();
            while (it.hasNext()) {
                this.f.append((SpannableString) it.next());
                this.f.append(" ");
            }
        }
        h0(fzfVar);
        String str = "";
        if (!TextUtils.isEmpty(fzfVar.f19644a.getName())) {
            str = str + fzfVar.f19644a.getName();
        }
        if (!TextUtils.isEmpty(fzfVar.f19644a.getContent())) {
            str = str + fzfVar.f19644a.getContent();
        }
        this.f.setContentDescription(str);
        if (!taoLiveKtCommentEntity.borderHexColor().isEmpty()) {
            View view = this.itemView;
            view.setBackground(view.getResources().getDrawable(R.drawable.taolive_comment_bg_audience_answer_flexalocal));
        } else if (this.itemView.getPaddingLeft() != 0) {
            this.itemView.setBackground(null);
            this.itemView.setPadding(0, 0, 0, 1);
        }
    }

    public final void g0(TaoLiveKtCommentBgStyle taoLiveKtCommentBgStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb99770", new Object[]{this, taoLiveKtCommentBgStyle});
            return;
        }
        View findViewById = this.itemView.findViewById(R.id.taolive_chat_item_bubble);
        TUrlImageView tUrlImageView = (TUrlImageView) this.itemView.findViewById(R.id.taolive_chat_item_corner_icon);
        if (taoLiveKtCommentBgStyle == null || taoLiveKtCommentBgStyle.getStartColor() == null || taoLiveKtCommentBgStyle.getEndColor() == null || taoLiveKtCommentBgStyle.getActivityIcon() == null) {
            findViewById.setBackground(c0());
            tUrlImageView.setVisibility(8);
            return;
        }
        String startColor = taoLiveKtCommentBgStyle.getStartColor();
        String endColor = taoLiveKtCommentBgStyle.getEndColor();
        String activityIcon = taoLiveKtCommentBgStyle.getActivityIcon();
        tUrlImageView.setVisibility(0);
        tUrlImageView.setImageUrl(activityIcon);
        Drawable drawable = this.itemView.getContext().getDrawable(R.drawable.taolive_comment_bg_unique_flexalocal);
        if (drawable instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setColors(new int[]{Color.parseColor(startColor), Color.parseColor(endColor)});
            gradientDrawable.setCornerRadius(iw0.a(this.itemView.getContext(), 12.0f));
            findViewById.setBackground(gradientDrawable);
        }
    }

    public final void h0(fzf fzfVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb19c13", new Object[]{this, fzfVar});
            return;
        }
        String name = fzfVar.f19644a.getName();
        if (fzfVar.f19644a.enhancedTypeValue().equals("rewardAutoComment")) {
            str = name + " ";
        } else {
            str = name + ": ";
        }
        SpannableString spannableString = new SpannableString(str);
        int e0 = e0();
        int color = gq0.g().getApplication().getResources().getColor(R.color.taolive_chat_follow_text_white);
        if (fzfVar.c()) {
            Resources resources = gq0.g().getApplication().getResources();
            int i = R.color.taolive_room_chat_color6;
            int color2 = resources.getColor(i);
            int color3 = gq0.g().getApplication().getResources().getColor(i);
            color = color2;
            e0 = color3;
        }
        this.f.setTextColor(color);
        spannableString.setSpan(new ForegroundColorSpan(e0), 0, str.length(), 33);
        this.f.append(spannableString);
        List<SpannableString> list = fzfVar.c;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                this.f.append((SpannableString) it.next());
            }
            return;
        }
        this.f.append(fzfVar.f19644a.getContent());
    }
}
