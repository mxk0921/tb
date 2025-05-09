package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eiv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static eiv b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f18605a = false;

    static {
        t2o.a(479199595);
    }

    public static eiv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eiv) ipChange.ipc$dispatch("15027eda", new Object[0]);
        }
        if (b == null) {
            b = new eiv();
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

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9653c941", new Object[]{this})).booleanValue();
        }
        return this.f18605a;
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8577d6b6", new Object[]{this, context});
        } else if (context != null) {
            boolean v = FestivalMgr.i().v("global");
            if (v) {
                this.f18605a = false;
                UnifyLog.m(c9x.CART_BIZ_NAME, "UniteSkinUtil", "updateSkinState", "isInFestival = " + v + ",useNewSkin = " + this.f18605a);
                return;
            }
            JSONObject parseObject = JSON.parseObject(b(context, "homePassParams", ""));
            if (parseObject == null || !parseObject.containsKey("whiteNavi")) {
                this.f18605a = false;
            } else {
                this.f18605a = Boolean.valueOf(parseObject.getString("whiteNavi")).booleanValue();
            }
        }
    }
}
