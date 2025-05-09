package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kaf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699483);
    }

    public static boolean b(String str, ITaoLiveKtEmojiManager iTaoLiveKtEmojiManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b747a5d", new Object[]{str, iTaoLiveKtEmojiManager})).booleanValue();
        }
        int i = -1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if ('[' == charAt) {
                i = i2;
            } else if (']' == charAt && i >= 0 && iTaoLiveKtEmojiManager != null && iTaoLiveKtEmojiManager.matchedEmoji(str.substring(i, i2 + 1)) != null) {
                return true;
            }
        }
        return false;
    }

    public static void a(ux9 ux9Var, String str, boolean z, boolean z2, String str2, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709625e8", new Object[]{ux9Var, str, new Boolean(z), new Boolean(z2), str2, map, strArr});
        } else if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            if (!(strArr == null || strArr.length == 0)) {
                arrayList.addAll(Arrays.asList(strArr));
            }
            arrayList.add("content=" + str);
            arrayList.add("word_after=" + str);
            arrayList.add("type=0");
            String str3 = "0";
            arrayList.add("is_emoji=".concat(z ? "1" : str3));
            arrayList.add("is_vipemoji=".concat((map == null || !"anchor_custom_sticker".equals(map.get("commentType"))) ? str3 : "1"));
            if (qjy.a()) {
                if (z2) {
                    str3 = "1";
                }
                arrayList.add("if_arrest=".concat(str3));
            }
            if (map == null || !"addOne".equals(map.get("commentType"))) {
                arrayList.add("comment_type=" + str2);
            } else {
                arrayList.add("comment_type=addOne");
            }
            if (map != null && map.containsKey("comment_location")) {
                arrayList.add("comment_location=" + map.get("comment_location"));
            }
            giv.f().n(ux9Var, z9u.CLICK_COMMENT_SEND, (String[]) arrayList.toArray(new String[0]));
            uo8.f(ux9Var, to8.COMMENT, 0L);
        }
    }
}
