package com.taobao.taolive.sdk.model.interact;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.HashMap;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Comment implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String commentId;
    public ArrayList<CommentGoodInfo> commodities;
    public String content;
    public String paginationContext;
    public String publisherIcon;
    public long publisherId;
    public String publisherNick;
    public HashMap<String, String> renders;
    public String tbNick;
    public long timestamp;

    static {
        t2o.a(806356294);
        t2o.a(806355930);
    }

    public String getDisplayUserNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42b49275", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder("");
        if (!TextUtils.isEmpty(this.tbNick)) {
            sb.append(this.tbNick);
        } else {
            sb.append(this.publisherNick);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(f7l.BRACKET_START_STR);
            sb.append(this.publisherNick);
            sb.append(f7l.BRACKET_END_STR);
        }
        return sb.toString();
    }
}
