package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.bmi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class wff {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wff INSTANCE = new wff();

    static {
        t2o.a(689963142);
    }

    public final void a(jmi jmiVar, List<String> list, wa waVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56467d52", new Object[]{this, jmiVar, list, waVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(list, "names");
        ckf.g(waVar, "messageObserver");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (vff.Companion.a(str)) {
                arrayList.add(str);
            }
        }
        vgh.c(this, "InteractMessageHelper", "注册来自互动的消息，names=" + list + "，finalNames=" + arrayList);
        jmiVar.d("Interact", arrayList, waVar);
    }

    public final void b(jmi jmiVar, String str, JSONObject jSONObject, bmi.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369632a3", new Object[]{this, jmiVar, str, jSONObject, aVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(str, "name");
        vgh.c(this, "InteractMessageHelper", "向互动发消息，name=" + str + "，args=" + jSONObject);
        vff c = vff.Companion.c(str, jSONObject, System.currentTimeMillis(), aVar);
        if (c != null) {
            c(jmiVar, c);
        }
    }

    public final void c(jmi jmiVar, vff vffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18dd3146", new Object[]{this, jmiVar, vffVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vffVar, "message");
        vgh.c(this, "InteractMessageHelper", "向互动发消息，message=" + vffVar);
        jmiVar.e(vffVar);
    }

    public final void d(jmi jmiVar, List<String> list, wa waVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36a636b", new Object[]{this, jmiVar, list, waVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(list, "names");
        ckf.g(waVar, "messageObserver");
        vgh.c(this, "InteractMessageHelper", "解注册来自互动的消息，names=" + list);
        jmiVar.g("Interact", list, waVar);
    }

    public final void e(jmi jmiVar, wa waVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de61607a", new Object[]{this, jmiVar, waVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(waVar, "messageObserver");
        vgh.c(this, "InteractMessageHelper", "解注册来自互动的消息");
        jmiVar.h("Interact", waVar);
    }
}
