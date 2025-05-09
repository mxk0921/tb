package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ink {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ink b;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f21450a;

    static {
        t2o.a(779092826);
    }

    public ink() {
        ArrayList arrayList = new ArrayList();
        this.f21450a = arrayList;
        arrayList.add("Page_TaobaoLiveWatch_Button-AccountFollow");
        arrayList.add("Page_TaobaoLiveWatch_Button-CommentSend");
        arrayList.add("Page_TaobaoLiveWatch_Button-Like");
        arrayList.add("Page_TaobaoLiveWatch_Button-ShareLive");
        arrayList.add("Page_TaobaoLiveWatch_Button-Goodslist");
        arrayList.add("Page_TaobaoLiveWatch_Button-Click_Goodslist");
        arrayList.add("Page_TaobaoLiveWatch_Button-detail");
        arrayList.add("Page_TaobaoLiveWatch_Button-itemwindow");
        arrayList.add("Page_TaobaoLiveWatch_Button-GoodsBuy");
        arrayList.add("Page_TaobaoLiveWatch_Button-TaoLiveStayTime");
        arrayList.add("Page_TaobaoLiveWatch_Button-TaoLiveEnter");
    }

    public static ink b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ink) ipChange.ipc$dispatch("5cf723c1", new Object[0]);
        }
        if (b == null) {
            synchronized (ink.class) {
                try {
                    if (b == null) {
                        b = new ink();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6013087", new Object[]{this});
        }
        List<String> list = this.f21450a;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return "";
        }
        return this.f21450a.toString();
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a80ac1e", new Object[]{this, str})).booleanValue();
        }
        String q2 = pvs.q2(a());
        if (TextUtils.isEmpty(q2) || !q2.contains(str)) {
            return false;
        }
        return true;
    }
}
