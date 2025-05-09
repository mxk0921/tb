package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f28013a;
    public o4d b;
    public final HashMap<String, o4d> c = new HashMap<>(4);

    static {
        t2o.a(486539558);
    }

    public sfl(cfc cfcVar) {
        this.f28013a = cfcVar;
    }

    public final o4d a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o4d) ipChange.ipc$dispatch("d37cb4b7", new Object[]{this, str});
        }
        str.hashCode();
        if (str.equals("jumpWithReq")) {
            return new wyo(this.f28013a);
        }
        if (!str.equals("scrollToItem")) {
            return null;
        }
        return new vyo(this.f28013a);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        o4d o4dVar = this.b;
        if (o4dVar != null) {
            o4dVar.destroy();
        }
    }

    public final String c(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e571a31", new Object[]{this, str});
        }
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Exception unused) {
            fve.e("OutLinkScheduler", "解析外链参数出错");
            jSONObject = null;
        }
        if (jSONObject == null) {
            fve.e("OutLinkScheduler", "json == null");
            return null;
        }
        String string = jSONObject.getString("jump_ani");
        if ("scrollToItem".equals(string)) {
            string = "scrollToItem";
        }
        if ("scrollToBFace".equals(string)) {
            string = "postPopEvent";
        }
        return string == null ? "jumpWithReq" : string;
    }

    public final o4d d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o4d) ipChange.ipc$dispatch("35ab561d", new Object[]{this, str});
        }
        if (this.c.get(str) != null) {
            return this.c.get(str);
        }
        o4d a2 = a(str);
        this.c.put(str, a2);
        return a2;
    }

    public w1e e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1e) ipChange.ipc$dispatch("80d15e7a", new Object[]{this});
        }
        o4d o4dVar = this.b;
        if (o4dVar != null) {
            return o4dVar.getScrolledToItemTraceInfo();
        }
        fve.e("OutLinkScheduler", "IOutLinkOperator == null");
        return null;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d96a47b6", new Object[]{this})).booleanValue();
        }
        o4d o4dVar = this.b;
        if (o4dVar instanceof wyo) {
            return ((wyo) o4dVar).s();
        }
        return false;
    }

    public void g(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a23a8fd", new Object[]{this, str, intent});
            return;
        }
        String c = c(str);
        if (TextUtils.isEmpty(c)) {
            fve.e("OutLinkScheduler", "eventType为空");
            return;
        }
        o4d d = d(c);
        this.b = d;
        if (d == null) {
            fve.e("OutLinkScheduler", "IOutLinkOperator == null,eventType is:" + c);
            return;
        }
        d.onOutLinkTrigger(str, intent);
    }
}
