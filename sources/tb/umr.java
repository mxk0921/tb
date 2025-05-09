package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class umr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZSCENE_LIVECUT_GOODSITEM = "livecut_goodsItem";
    public static final String BIZSCENE_LIVECUT_GOODSMESSAGE = "livecut_goodsMessage";
    public static final String BIZSCENE_LIVE_GOODSLIST = "live_goodsList";
    public static final String BIZSCENE_LIVE_GOODSMESSAGE = "live_goodsMessage";
    public static final String BIZSCENE_REPLAY_GOODSLIST = "replay_goodsList";
    public static final String BIZSCENE_REPLAY_GOODSMESSAGE = "replay_goodsMessage";

    static {
        t2o.a(779093227);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a045eeb5", new Object[]{str});
        } else {
            t0u.c(v2s.o().f().getApplication(), str);
        }
    }

    public static void b(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad85ea20", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(itw.URL_SEPARATOR)) {
                str = "http:".concat(str);
            }
            Uri parse = Uri.parse(str);
            if ("taoke.mdaren.taobao.com".equals(parse.getHost())) {
                String queryParameter = parse.getQueryParameter("itemId");
                String queryParameter2 = parse.getQueryParameter("accountId");
                String queryParameter3 = parse.getQueryParameter("bizType");
                String queryParameter4 = parse.getQueryParameter(z9u.KEY_TAOKE_BIZSCENE);
                if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2) || TextUtils.isEmpty(queryParameter3)) {
                    if (hw0.l()) {
                        a("param itemId = " + queryParameter + " or accountId = " + queryParameter2 + " bizType = " + queryParameter3 + " is null !!!");
                    }
                    i = 1;
                }
                if (!(up6.c0(vx9.d()) == null || up6.c0(vx9.d()).broadCaster == null || up6.c0(vx9.d()).broadCaster.accountId == null || TextUtils.isEmpty(queryParameter2) || queryParameter2.equals(up6.c0(vx9.d()).broadCaster.accountId))) {
                    if (hw0.l()) {
                        a("accountId miss match !!!");
                    }
                    i = 2;
                }
                if (!"taolive".equals(queryParameter3)) {
                    if (hw0.l()) {
                        a("bizType miss match taolive !!!");
                    }
                    i = 3;
                }
                String str2 = up6.c0(vx9.d()) != null ? up6.c0(vx9.d()).liveId : null;
                HashMap hashMap = new HashMap();
                hashMap.put("feedId", str2);
                hashMap.put("feed_id", str2);
                hashMap.put(z9u.KEY_ACCOUNT_ID, queryParameter2);
                hashMap.put("itemId", queryParameter);
                hashMap.put("bizType", queryParameter3);
                hashMap.put(z9u.KEY_TAOKE_BIZSCENE, queryParameter4);
                hashMap.put("error", i + "");
                rbu.K(vx9.d(), z9u.CLICK_TRACK_TAOKE, hashMap);
            } else if (hw0.l()) {
                a("非淘客url , 注意淘客结算！！！");
            }
        }
    }
}
