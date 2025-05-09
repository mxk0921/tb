package tb;

import android.app.Application;
import anet.channel.Config;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.entity.SessionType;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.orange.OConstant;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l1f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public l1f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(l1f l1fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitLinkTriverNetwork");
    }

    private static void q(String str, ConnProtocol connProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a5ebd6", new Object[]{str, connProtocol});
            return;
        }
        StrategyTemplate.getInstance().registerConnProtocol(str, connProtocol);
        SessionCenter.getInstance(new Config.Builder().setAppkey((String) hhg.a(OConstant.LAUNCH_ONLINEAPPKEY, null)).setEnv(ENV.ONLINE).build()).get(HttpUrl.parse(StringUtils.concatString("https", HttpConstant.SCHEME_SPLIT, str)), SessionType.LONG_LINK, 0L);
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else if (ppo.b().c() != null && ((Integer) hhg.a(OConstant.LAUNCH_ENVINDEX, 0)).intValue() == 0) {
            q("miniapp-package-zcache.taobao.com", ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, "cdn"));
            q("guide-acs4miniapp-inner.m.taobao.com", ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, ConnType.PK_ACS));
        }
    }

    @Override // tb.vct
    public boolean d(en8<String, Void> en8Var) {
        LinkRule c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        if (!super.d(en8Var) || (c = yrg.c()) == null) {
            return false;
        }
        String str = c.name;
        if (TMSCalendarBridge.namespace.equals(str) || "unicontainer".equals(str)) {
            return !t.a(LauncherRuntime.g, "link_triver_network_off");
        }
        return false;
    }
}
