package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.HashMap;
import kotlin.collections.a;
import tb.bac;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class qli extends bac.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(844103702);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qli(ITMSPage iTMSPage) {
        super(iTMSPage);
        ckf.g(iTMSPage, "page");
    }

    public static /* synthetic */ Object ipc$super(qli qliVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/menu/MenuItemMoreChannel");
    }

    @Override // tb.bac.c
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return R.id.menu_item_more_channel;
    }

    @Override // tb.bac.c
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
            return;
        }
        Object g = p8s.g(INavigatorAdapter.class);
        ckf.f(g, "getNotNull(INavigatorAdapter::class.java)");
        Activity I = b().I();
        ckf.f(I, "mInstance.activity");
        INavigatorAdapter.b.a((INavigatorAdapter) g, I, q9s.m3(), null, null, null, 16, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "miniapp_id", b().L());
        jSONObject.put((JSONObject) "target_page_url", q9s.m3());
        HashMap hashMap = new HashMap();
        String jSONString = jSONObject.toJSONString();
        ckf.f(jSONString, "utParamCnt.toJSONString()");
        hashMap.put("utparam-cnt", jSONString);
        IUserTrackerAdapter iUserTrackerAdapter = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter != null) {
            iUserTrackerAdapter.customAdvance("2101", "TRVTbApiPage", "clk_sort_icon", "", "", a.r(hashMap), null);
        }
    }

    /* renamed from: f */
    public TBPublicMenuItem d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("67fbe3ef", new Object[]{this});
        }
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setId(a()).setTitle("ꅚ:更多频道").build();
        ckf.f(build, "Builder()\n        .setId…ꅚ:更多频道\")\n        .build()");
        return build;
    }
}
