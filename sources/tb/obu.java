package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.BroadcasterInfo;
import com.taobao.android.miniLive.model.ShowCaseItem;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class obu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092103);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c539d010", new Object[]{str, str2, map});
        } else if (v2s.o().E() != null) {
            if (!TextUtils.isEmpty(str)) {
                str3 = "Page_TBMiniLive_" + str;
            } else {
                str3 = glr.UT_PAGE_NAME;
            }
            v2s.o().E().track4Click(str3, str2, map);
        }
    }

    public static void b(SimpleLiveInfo simpleLiveInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c325d0e6", new Object[]{simpleLiveInfo, str, str2, str3});
        } else {
            c(simpleLiveInfo, str, str2, str3, null);
        }
    }

    public static void c(SimpleLiveInfo simpleLiveInfo, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd2acd30", new Object[]{simpleLiveInfo, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (simpleLiveInfo != null) {
            hashMap.put("feedId", simpleLiveInfo.liveId);
            BroadcasterInfo broadcasterInfo = simpleLiveInfo.broadCaster;
            if (broadcasterInfo != null) {
                hashMap.put("accountId", broadcasterInfo.accountId);
            }
            ShowCaseItem showCaseItem = simpleLiveInfo.item;
            if (showCaseItem != null) {
                hashMap.put("itemId", showCaseItem.itemId);
            }
        } else if (!TextUtils.isEmpty(nmr.e().d())) {
            hashMap.put("feedId", nmr.e().d());
        }
        hashMap.put("mute", "true");
        hashMap.put("source", str2);
        if (v2s.o().u() != null) {
            hashMap.put("userId", v2s.o().u().getUserId());
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("algParams", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("spm-cnt", str4);
        }
        a(str2, str, hashMap);
    }

    public static void d(VideoInfo videoInfo, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ad2071", new Object[]{videoInfo, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (videoInfo != null) {
            hashMap.put("feedId", videoInfo.liveId);
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                hashMap.put("accountId", accountInfo.accountId);
            }
        } else if (!TextUtils.isEmpty(nmr.e().d())) {
            hashMap.put("feedId", nmr.e().d());
        }
        hashMap.put("mute", "false");
        hashMap.put("source", str2);
        if (v2s.o().u() != null) {
            hashMap.put("userId", v2s.o().u().getUserId());
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("algParams", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("spm-cnt", str4);
        }
        a(str2, str, hashMap);
    }

    public static void e(SimpleLiveInfo simpleLiveInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3473ac51", new Object[]{simpleLiveInfo, str, str2, str3});
        } else {
            f(simpleLiveInfo, str, str2, str3, null);
        }
    }

    public static void f(SimpleLiveInfo simpleLiveInfo, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0ec3db", new Object[]{simpleLiveInfo, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (simpleLiveInfo != null) {
            hashMap.put("feedId", simpleLiveInfo.liveId);
            BroadcasterInfo broadcasterInfo = simpleLiveInfo.broadCaster;
            if (broadcasterInfo != null) {
                hashMap.put("accountId", broadcasterInfo.accountId);
            }
        }
        hashMap.put("mute", "true");
        hashMap.put("source", str2);
        if (v2s.o().u() != null) {
            hashMap.put("userId", v2s.o().u().getUserId());
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("algParams", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("spm-cnt", str4);
        }
        g(str2, str, hashMap);
    }

    public static void g(String str, String str2, Map<String, String> map) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19cdf822", new Object[]{str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (v2s.o().E() != null) {
            if (!TextUtils.isEmpty(str)) {
                str3 = "Page_TBMiniLive_" + str;
            } else {
                str3 = glr.UT_PAGE_NAME;
            }
            v2s.o().E().track4Show(str3, str3 + "-" + str2, map);
        }
    }
}
