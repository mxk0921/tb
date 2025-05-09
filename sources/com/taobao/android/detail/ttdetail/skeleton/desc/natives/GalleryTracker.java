package com.taobao.android.detail.ttdetail.skeleton.desc.natives;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.HashMap;
import tb.q84;
import tb.rc7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class GalleryTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262293);
    }

    public static void a(Context context, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3153000", new Object[]{context, str, hashMap});
        } else if (!TextUtils.isEmpty(str)) {
            q84.f(context, new rc7("userTrack", new JSONObject(str, hashMap) { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.GalleryTracker.1
                public final /* synthetic */ HashMap val$params;
                public final /* synthetic */ String val$trackPage;

                {
                    this.val$trackPage = str;
                    this.val$params = hashMap;
                    put("page", "Page_Detail");
                    put("eventId", "2201");
                    put("arg1", (Object) str);
                    put("args", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.GalleryTracker.1.1
                        {
                            putAll(AnonymousClass1.this.val$params);
                        }
                    });
                }
            }, new RuntimeAbilityParam[0]));
        }
    }

    public static void b(Context context, final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc90d4e", new Object[]{context, str, str2, str3});
        } else {
            q84.f(context, new rc7("userTrack", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.GalleryTracker.2
                {
                    put("page", "Page_DWVideo");
                    put("eventId", "2201");
                    put("arg1", "Page_DWVideo_Button-videoShow");
                    put("args", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.GalleryTracker.2.1
                        {
                            put("mediaType", (Object) String.valueOf(1));
                            put("page", "detailMain");
                            put("seller_id", (Object) str);
                            put("item_id", (Object) str2);
                            String str4 = str3;
                            if (str4 != null) {
                                put("shop_id", (Object) str4);
                            }
                        }
                    });
                }
            }, new RuntimeAbilityParam[0]));
        }
    }
}
