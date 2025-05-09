package com.taobao.umipublish.extension.windvane.abilities;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.gov;
import tb.qrf;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1 extends Lambda implements g1a<Object, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONArray $downloadList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1(JSONArray jSONArray) {
        super(1);
        this.$downloadList = jSONArray;
    }

    public static /* synthetic */ Object ipc$super(Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1 share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1");
    }

    @Override // tb.g1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
        } else if (obj != null) {
            JSONObject jSONObject = (JSONObject) obj;
            String m = qrf.m(jSONObject, "type", "");
            String str = TextUtils.equals("video", m) ? "video" : "image";
            String str2 = TextUtils.equals("video", m) ? gov.SUFFIX_MP4 : ".jpg";
            String m2 = qrf.m(jSONObject, "tag", "");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "url", qrf.m(jSONObject, "url", ""));
            jSONObject2.put((JSONObject) "type", str);
            jSONObject2.put((JSONObject) Constants.Name.SUFFIX, str2);
            jSONObject2.put((JSONObject) "optional", qrf.m(jSONObject, "optional", "true"));
            if (!TextUtils.isEmpty(m2)) {
                jSONObject2.put((JSONObject) "tag", m2);
            }
            this.$downloadList.add(jSONObject2);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
        }
    }
}
