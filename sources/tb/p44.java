package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.menu.ChatMenuItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p44 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ADD_ONE_PADDING_WIDTH = 50;
    public static final int RECYCLERVIEW_HEIGHT_DP = 180;
    public static final int RECYCLERVIEW_WIDTH_DP = 272;

    /* renamed from: a  reason: collision with root package name */
    public static final int f25871a = 13;
    public static final int b = 3;
    public static final int c = 15;

    static {
        t2o.a(295700126);
    }

    public static List<ChatMenuItem> d(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7283f105", new Object[]{new Boolean(z)});
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ChatMenuItem chatMenuItem = new ChatMenuItem();
        if (nh4.v()) {
            str = "https://gw.alicdn.com/imgextra/i3/O1CN01CNHh0T1DpsOeOY3U4_!!6000000000266-2-tps-64-64.png";
        } else {
            str = "https://gw.alicdn.com/imgextra/i1/O1CN01BZkqNb1xOMkrSzYMc_!!6000000006433-2-tps-60-60.png";
        }
        chatMenuItem.icon = str;
        chatMenuItem.text = "举报";
        chatMenuItem.position = 2;
        arrayList.add(chatMenuItem);
        return arrayList;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32fb2b9b", new Object[0]);
        }
        if (nh4.v()) {
            return "https://gw.alicdn.com/imgextra/i3/O1CN01DI2pjK1WJnLnRK4Tc_!!6000000002768-2-tps-96-60.png";
        }
        return "https://img.alicdn.com/imgextra/i3/O1CN01BZMatI1TPL8KqWu9V_!!6000000002374-2-tps-100-56.png";
    }

    public static void f(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd4517", new Object[]{str, context});
        } else if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            w3s w3sVar = new w3s(context);
            if (!TextUtils.isEmpty(str)) {
                w3sVar.d("您已被禁言").b(str).c("我知道了", null);
                w3sVar.show();
            }
        }
    }

    public static void g(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46a8f02", new Object[]{taoLiveKtCommentEntity});
            return;
        }
        HashMap hashMap = new HashMap();
        JSONObject b2 = fqu.b(taoLiveKtCommentEntity.getDxData());
        if (!(b2 == null || (jSONObject = b2.getJSONObject("extMap")) == null)) {
            hashMap.put("reply_id", jSONObject.getString("replyId"));
            hashMap.put("bereplied_id", jSONObject.getString("beReplyId"));
            hashMap.put("btn_name", jSONObject.getString("btnName"));
            hashMap.put("trackInfoAssistant", jSONObject.getString("trackInfoAssistant"));
        }
        v2s.o().E().track4Show("Page_TaobaoLiveWatch", "Comment_AICard", hashMap);
    }

    public static List<ChatMenuItem> c(boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("320d7fae", new Object[]{new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        ChatMenuItem chatMenuItem = new ChatMenuItem();
        if (nh4.v()) {
            str = "https://gw.alicdn.com/imgextra/i3/O1CN01FJHz2T1FuZgwWF1am_!!6000000000547-2-tps-64-64.png";
        } else {
            str = "https://gw.alicdn.com/imgextra/i3/O1CN01bi9FQe26gX0RZhP88_!!6000000007691-2-tps-60-60.png";
        }
        chatMenuItem.icon = str;
        chatMenuItem.text = "回复";
        chatMenuItem.position = 0;
        ChatMenuItem chatMenuItem2 = new ChatMenuItem();
        if (nh4.v()) {
            str2 = "https://gw.alicdn.com/imgextra/i1/O1CN01cVyQvE1RM1CH1fgr9_!!6000000002096-2-tps-64-64.png";
        } else {
            str2 = "https://gw.alicdn.com/imgextra/i3/O1CN01O1DsmA1YLk5juO6Fg_!!6000000003043-2-tps-60-60.png";
        }
        chatMenuItem2.icon = str2;
        chatMenuItem2.text = "复制";
        chatMenuItem2.position = 1;
        arrayList.add(chatMenuItem);
        arrayList.add(chatMenuItem2);
        List<ChatMenuItem> d = d(z);
        if (d != null) {
            arrayList.addAll(d);
        }
        return arrayList;
    }
}
