package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class div {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static div b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f17853a = false;

    static {
        t2o.a(713031932);
    }

    public static div a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (div) ipChange.ipc$dispatch("9438b787", new Object[0]);
        }
        if (b == null) {
            b = new div();
        }
        return b;
    }

    public final String b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a804d6d2", new Object[]{this, context, str, str2});
        }
        return context.getSharedPreferences("homepage_common", 0).getString(str, str2);
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8577d6b6", new Object[]{this, context});
        } else if (context != null) {
            boolean v = FestivalMgr.i().v("global");
            if (v) {
                this.f17853a = false;
                lor.c("UniteSkinUtil", "updateSkinState", "isInFestival = " + v + ",useNewSkin = " + this.f17853a);
                return;
            }
            JSONObject parseObject = JSON.parseObject(b(context, "homePassParams", ""));
            if (parseObject == null || !parseObject.containsKey("whiteNavi")) {
                this.f17853a = false;
            } else {
                this.f17853a = Boolean.valueOf(parseObject.getString("whiteNavi")).booleanValue();
            }
        }
    }
}
