package com.taobao.tao.channel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.sharepanel.weex.WeexSharePanel;
import java.util.Iterator;
import java.util.List;
import tb.ikp;
import tb.ma4;
import tb.mi3;
import tb.mjp;
import tb.ogs;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareToChannelHandler implements ikp.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CUSTOM_COPY_KEY = "customCopy";
    private static final String TAG = "ShareToChannelHandler";
    private static final String TYPE_KEY = "type";

    static {
        t2o.a(666894380);
        t2o.a(667942922);
    }

    private mi3 getChannelView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mi3) ipChange.ipc$dispatch("a9e6f4a9", new Object[]{this, str});
        }
        List<ma4> c = ChannelProvider.n().c();
        if (c == null) {
            return null;
        }
        Iterator<ma4> it = c.iterator();
        while (it.hasNext()) {
            mi3 mi3Var = (mi3) it.next();
            if (TextUtils.equals(mi3Var.g().k(), str)) {
                return mi3Var;
            }
        }
        return null;
    }

    @Override // tb.ikp.b
    public void shareToChannel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1bc2000", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("type");
        String string2 = jSONObject.getString(CUSTOM_COPY_KEY);
        mi3 channelView = getChannelView(string);
        if (channelView != null) {
            channelView.d = jSONObject;
            if (channelView.g().l()) {
                ogs.b = TextUtils.equals("true", string2);
            } else {
                ogs.f25380a = TextUtils.equals("true", string2);
            }
            ((WeexSharePanel) ShareBizAdapter.getInstance().getShareEngine().getCurSharePanel()).getShareActionDispatcher().a(new mjp(channelView.c().desc, channelView), ShareBizAdapter.getInstance().getAppEnv().getApplication(), 0);
        }
    }
}
