package tb;

import android.content.Intent;
import android.net.Uri;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.android.trade.cart.constant.CartFrom;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ec3 implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(697303047);
        }

        public static Uri a(Intent intent, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("a5295422", new Object[]{intent, str});
            }
            if (intent == null || intent.getData() == null) {
                return null;
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            Uri data = intent.getData();
            Set<String> queryParameterNames = data.getQueryParameterNames();
            if (queryParameterNames != null) {
                for (String str2 : queryParameterNames) {
                    buildUpon.appendQueryParameter(str2, data.getQueryParameter(str2));
                }
            }
            return buildUpon.build();
        }
    }

    static {
        t2o.a(697303046);
        t2o.a(578814049);
    }

    public final boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2fb9952", new Object[]{this, uri})).booleanValue();
        }
        if (uri == null || !"float".equals(uri.getQueryParameter("iCartScreenType"))) {
            return false;
        }
        return true;
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "CartNavProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (zmjVar == null) {
            return true;
        }
        if (a(intent.getData())) {
            intent.setClassName(zmjVar.d(), UltronTradeHybridActivity.class.getName());
            zmjVar.A(true, name());
            zmjVar.v(JumpAbility.JUMP_ABILITY_FLOATING_WINDOW);
            intent.setData(a.a(intent, zbl.b()));
            return true;
        } else if (!CartFrom.TAOBAO_CLIENT.equals(ie3.a(intent))) {
            return true;
        } else {
            if ((!TBDeviceUtils.p(zmjVar.d()) && !TBDeviceUtils.P(zmjVar.d())) || (data = intent.getData()) == null) {
                return true;
            }
            intent.setData(data.buildUpon().appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").build());
            return true;
        }
    }
}
