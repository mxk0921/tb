package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.Map;
import tb.bac;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class pli extends bac.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(844103701);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pli(ITMSPage iTMSPage) {
        super(iTMSPage);
        ckf.g(iTMSPage, "page");
    }

    public static /* synthetic */ Object ipc$super(pli pliVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/menu/MenuItemComment");
    }

    @Override // tb.bac.c
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return R.id.menu_item_comment;
    }

    @Override // tb.bac.c
    public void e() {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
            return;
        }
        INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) p8s.b(INavigatorAdapter.class);
        Uri.Builder buildUpon = ies.g(q9s.l3()).buildUpon();
        JSONObject g = g();
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, Object> entry : g.entrySet()) {
            ckf.f(entry, "reportExtraInfo.entries");
            Map.Entry<String, Object> entry2 = entry;
            Object value = entry2.getValue();
            String key = entry2.getKey();
            String str = "";
            if (!(value == null || (obj = value.toString()) == null)) {
                str = obj;
            }
            builder.appendQueryParameter(key, str);
        }
        buildUpon.appendQueryParameter("query", builder.build().toString());
        if (iNavigatorAdapter != null) {
            Activity I = b().I();
            ckf.f(I, "mInstance.activity");
            String uri = buildUpon.build().toString();
            ckf.f(uri, "builder.build().toString()");
            INavigatorAdapter.b.a(iNavigatorAdapter, I, uri, null, null, null, 16, null);
        }
    }

    /* renamed from: f */
    public TBPublicMenuItem d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("67fbe3ef", new Object[]{this});
        }
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setId(a()).setTitle("뀚:评分及评论").build();
        ckf.f(build, "Builder().setId(getId())…tTitle(\"뀚:评分及评论\").build()");
        return build;
    }

    public final JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("31b6157b", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "appVersion", r8s.i(b()));
        jSONObject.put((JSONObject) "appId", b().L());
        jSONObject.put((JSONObject) "appName", r8s.f(b()));
        jSONObject.put((JSONObject) "frameType", r8s.c(b()));
        jSONObject.put((JSONObject) "bizType", r8s.k(b()));
        jSONObject.put((JSONObject) qxq.SUB_KEY_FRAGMENT_JUMP, r8s.h(b()));
        jSONObject.put((JSONObject) RVConstants.EXTRA_APPTYPE, "tms");
        jSONObject.put((JSONObject) "templateId", r8s.w(b()));
        jSONObject.put((JSONObject) "templateVersion", r8s.y(b()));
        String openModel = b().c0().getOpenModel();
        if (TextUtils.equals(openModel, "afc_open_link") || TextUtils.equals(openModel, "browser_link")) {
            jSONObject.put((JSONObject) "isFromOuter", "true");
        }
        return jSONObject;
    }
}
