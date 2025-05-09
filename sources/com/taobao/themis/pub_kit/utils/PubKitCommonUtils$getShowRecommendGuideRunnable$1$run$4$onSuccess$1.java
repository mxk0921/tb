package com.taobao.themis.pub_kit.utils;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.n3n;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubKitCommonUtils$getShowRecommendGuideRunnable$1$run$4$onSuccess$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $appId;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ JSONArray $homePagePopDataList;
    public final /* synthetic */ String $pubRecommendClientEventId;
    public final /* synthetic */ JSONObject $response;
    public final /* synthetic */ PubUserGuideModule $userGuideModule;
    public final /* synthetic */ String $userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubKitCommonUtils$getShowRecommendGuideRunnable$1$run$4$onSuccess$1(Context context, PubUserGuideModule pubUserGuideModule, JSONArray jSONArray, JSONObject jSONObject, String str, String str2, String str3) {
        super(0);
        this.$context = context;
        this.$userGuideModule = pubUserGuideModule;
        this.$homePagePopDataList = jSONArray;
        this.$response = jSONObject;
        this.$pubRecommendClientEventId = str;
        this.$appId = str2;
        this.$userId = str3;
    }

    public static /* synthetic */ Object ipc$super(PubKitCommonUtils$getShowRecommendGuideRunnable$1$run$4$onSuccess$1 pubKitCommonUtils$getShowRecommendGuideRunnable$1$run$4$onSuccess$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/utils/PubKitCommonUtils$getShowRecommendGuideRunnable$1$run$4$onSuccess$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            new n3n(this.$context, this.$userGuideModule, this.$homePagePopDataList, this.$response.getJSONObject("delta"), this.$pubRecommendClientEventId).c(this.$appId, this.$userId);
        }
    }
}
