package tb;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.BaseItemViewHolder;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.DXViewHolder;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.EveryBodySayLeftContentViewHolder;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.HighLightCommentTextViewHolder;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.MultiLineTextViewHolder;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.SingleLineTextViewHolder;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentType;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int Class_Verify_Code;
    public static final int KMP_ACTION_TXT;
    public static final int KMP_DX;
    public static final int KMP_EVERY_BODY_SAY_LEFT_CONTENT;
    public static final int KMP_HIGHLIGHT_COMMENT;
    public static final int KMP_NORMAL_TXT;

    static {
        t2o.a(295698698);
        int hashCode = epf.class.hashCode();
        Class_Verify_Code = hashCode;
        KMP_ACTION_TXT = hashCode + 10088;
        KMP_NORMAL_TXT = hashCode + cpr.MSG_TYPE_PRODUCT_LIST_WITH_PM;
        KMP_DX = hashCode + cpr.MSG_TYPE_PRODUCT_HOT_GOOD;
        KMP_EVERY_BODY_SAY_LEFT_CONTENT = hashCode + 10099;
        KMP_HIGHLIGHT_COMMENT = hashCode + 10103;
    }

    public static BaseItemViewHolder a(ViewGroup viewGroup, int i, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseItemViewHolder) ipChange.ipc$dispatch("cc823029", new Object[]{viewGroup, new Integer(i), ux9Var});
        }
        if (i == KMP_DX) {
            return new DXViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_kmp_dx_layout_flexalocal, viewGroup, false), ux9Var);
        }
        if (i == KMP_ACTION_TXT) {
            return new SingleLineTextViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_general_action_flexalocal, viewGroup, false), viewGroup, ux9Var);
        }
        if (i == KMP_NORMAL_TXT) {
            return new MultiLineTextViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_text2_flexalocal, viewGroup, false), ux9Var);
        }
        if (i == KMP_EVERY_BODY_SAY_LEFT_CONTENT) {
            return new EveryBodySayLeftContentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_kmp_everybody_say_left_content_flexalocal, viewGroup, false), ux9Var);
        }
        if (i == KMP_HIGHLIGHT_COMMENT) {
            return new HighLightCommentTextViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_highlight_comment_flexalocal, viewGroup, false), ux9Var);
        }
        return new MultiLineTextViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_text2_flexalocal, viewGroup, false), ux9Var);
    }

    public static int b(fzf fzfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d722094", new Object[]{fzfVar})).intValue();
        }
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = fzfVar.f19644a;
        if (taoLiveKtCommentEntity == null) {
            return KMP_NORMAL_TXT;
        }
        if (taoLiveKtCommentEntity.getCommentType() == TaoLiveKtCommentType.DXContent || taoLiveKtCommentEntity.getCommentType() == TaoLiveKtCommentType.TopWelcome) {
            return KMP_DX;
        }
        if (taoLiveKtCommentEntity.isButtonType()) {
            return KMP_ACTION_TXT;
        }
        if (fzfVar.a()) {
            return KMP_EVERY_BODY_SAY_LEFT_CONTENT;
        }
        if (!qjy.a() || taoLiveKtCommentEntity.getFavorHighlightCommentStyle() == null) {
            return KMP_NORMAL_TXT;
        }
        return KMP_HIGHLIGHT_COMMENT;
    }
}
