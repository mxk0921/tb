package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEnhancedType;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtCommentModel;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class pys {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_FOLLOW_MSG_KEY = "⁂∰⏇follow";
    public static final String ACTION_NEW_MSG_KEY = "⁂∰⏇newActionType";
    public static final pys INSTANCE = new pys();

    static {
        t2o.a(1010827311);
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d4fb9ef", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, yj4.PARAM_CHAT_RENDERS_ENHANCE);
        return ckf.b(str, TaoLiveKtCommentEnhancedType.Follow.getValue());
    }

    public final boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc20eb5b", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, yj4.PARAM_CHAT_RENDERS_ENHANCE);
        if (ckf.b(str, TaoLiveKtCommentEnhancedType.Follow.getValue()) || ckf.b(str, TaoLiveKtCommentEnhancedType.Share.getValue()) || ckf.b(str, TaoLiveKtCommentEnhancedType.FandomShare.getValue())) {
            return true;
        }
        return false;
    }

    public final boolean c(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c187f5b4", new Object[]{this, str, map})).booleanValue();
        }
        String str2 = null;
        Object obj = map != null ? map.get(yj4.PARAM_CHAT_RENDERS_ENHANCE) : null;
        String str3 = obj instanceof String ? (String) obj : null;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        if (e(str3)) {
            return false;
        }
        if (str == null) {
            str = str4;
        }
        Object obj2 = map != null ? map.get("userToken") : null;
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        if (str2 != null) {
            str4 = str2;
        }
        return str4.length() > 0 && ckf.b(str4, str);
    }

    public final boolean a(TaoLiveKtCommentModel taoLiveKtCommentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9170c038", new Object[]{this, taoLiveKtCommentModel})).booleanValue();
        }
        ckf.g(taoLiveKtCommentModel, "model");
        String commentId = taoLiveKtCommentModel.getCommentId();
        String str = "";
        if (commentId == null) {
            commentId = str;
        }
        String content = taoLiveKtCommentModel.getContent();
        if (content != null) {
            str = content;
        }
        return commentId.length() == 0 || str.length() == 0 || tsq.I(str, ACTION_FOLLOW_MSG_KEY, false, 2, null);
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5226ba7a", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "content");
        return tsq.I(str, ACTION_FOLLOW_MSG_KEY, false, 2, null) || tsq.I(str, ACTION_NEW_MSG_KEY, false, 2, null);
    }
}
