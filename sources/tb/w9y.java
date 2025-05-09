package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacyext.jsbridge.c;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@c(name = {"setRecommendSwitch"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class w9y extends osx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements p4y {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pwx f30554a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        public a(pwx pwxVar, Context context, String str) {
            this.f30554a = pwxVar;
            this.b = context;
            this.c = str;
        }

        @Override // tb.p4y
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            g01.c("SetRecommendSwitchApi", str);
            w9y.h(w9y.this, this.f30554a, osx.d, null);
            w9y.f(w9y.this, this.b, this.c, false, str);
        }

        @Override // tb.p4y
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            w9y.g(w9y.this, this.f30554a, "调用成功", null);
            w9y.f(w9y.this, this.b, this.c, true, null);
        }
    }

    public static /* synthetic */ void f(w9y w9yVar, Context context, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5551f024", new Object[]{w9yVar, context, str, new Boolean(z), str2});
        } else {
            w9yVar.e(context, str, z, str2);
        }
    }

    public static /* synthetic */ void g(w9y w9yVar, pwx pwxVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d3dd1f", new Object[]{w9yVar, pwxVar, str, map});
        } else {
            w9yVar.c(pwxVar, str, map);
        }
    }

    public static /* synthetic */ void h(w9y w9yVar, pwx pwxVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3850860", new Object[]{w9yVar, pwxVar, str, map});
        } else {
            w9yVar.a(pwxVar, str, map);
        }
    }

    public static /* synthetic */ Object ipc$super(w9y w9yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/jsbridge/api/k");
    }

    public final void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            TrackLog.trackModifyRecommendStatusLogStart(context, str, "CROJSBridge");
        }
    }

    public final void e(Context context, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6258534", new Object[]{this, context, str, new Boolean(z), str2});
        } else {
            TrackLog.trackModifyRecommendStatusLogEnd(context, str, "CROJSBridge", z, str2);
        }
    }

    @Override // tb.osx
    public boolean b(Context context, String str, String str2, pwx pwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, pwxVar})).booleanValue();
        }
        d(context, str2);
        JSONObject h = mwx.h(str2);
        if (h == null) {
            e(context, str2, false, "param is null");
            a(pwxVar, "参数异常", null);
            return true;
        }
        boolean booleanValue = h.getBoolean("switch").booleanValue();
        if (rsx.b(context)) {
            com.alibaba.wireless.aliprivacyext.recommendation.c.R().c();
            rsx.a(context, booleanValue);
            c(pwxVar, "调用成功", null);
            e(context, str2, true, null);
            return true;
        }
        rsx.h(context);
        com.alibaba.wireless.aliprivacyext.recommendation.c.R().t(booleanValue, true, new a(pwxVar, context, str2));
        return true;
    }
}
