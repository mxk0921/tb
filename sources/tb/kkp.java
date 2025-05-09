package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.share.resource.ShareZCacheConfig;
import com.taobao.monitor.procedure.IPage;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kkp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SHAREBACKGETPASSWORDMTOPEND = "shareBackGetPasswordMtopEnd";
    public static final String KEY_SHAREBACKGETPASSWORDMTOPSTART = "shareBackGetPasswordMtopStart";
    public static final String KEY_SHAREBACKINITDIALOG = "shareBackInitDialog";
    public static final String KEY_SHAREBACKINITWEEX = "shareBackInitWeex";
    public static final String KEY_SHAREBACKISTAOPASSWORDMTOPEND = "shareBackIsTaoPasswordMtopEnd";
    public static final String KEY_SHAREBACKISTAOPASSWORDMTOPSTART = "shareBackIsTaoPasswordMtopStart";
    public static final String KEY_SHAREBACKPARSERMATCHEND = "shareBackParserMatchEnd";
    public static final String KEY_SHAREBACKPARSERMATCHSTART = "shareBackParserMatchStart";
    public static final String KEY_SHAREBACKPASSWORDCHECKEND = "shareBackPasswordCheckEnd";
    public static final String KEY_SHAREBACKPASSWORDCHECKSTART = "shareBackPasswordCheckStart";
    public static final String KEY_SHAREBACKPASSWORDVALIDEND = "shareBackPasswordValidEnd";
    public static final String KEY_SHAREBACKPASSWORDVALIDSTART = "shareBackPasswordValidStart";
    public static final String KEY_SHAREBACKPREPAREDATAEND = "shareBackPrepareDataEnd";
    public static final String KEY_SHAREBACKPREPAREDATASTART = "shareBackPrepareDataStart";
    public static final String KEY_SHAREBACKRENDER = "shareBackRenderWeex";
    public static final String KEY_SHAREBACKSHOWDIALOG = "shareBackShowDialog";
    public static final String KEY_SHARELIFECYCLEOBSERVERONSTARTED = "shareBackLifeCycleObserveronStart";
    public static final String KEY_SHAREPANELBUSINESSSERVICEEND = "sharePanelBusinessServiceEnd";
    public static final String KEY_SHAREPANELBUSINESSSERVICESTART = "sharePanelBusinessServiceStart";
    public static final String KEY_SHAREPANELCONTENTDEALPROCESSOREND = "sharePanelContentDealProcessorEnd";
    public static final String KEY_SHAREPANELCONTENTDEALPROCESSORSTART = "sharePanelContentDealProcessorStart";
    public static final String KEY_SHAREPANELDOSHAREEND = "sharePanelDoShareEnd";
    public static final String KEY_SHAREPANELDOSHARESTART = "sharePanelDoShareStart";
    public static final String KEY_SHAREPANELGETSHARECONFIGEND = "sharePanelGetShareConfigEnd";
    public static final String KEY_SHAREPANELGETSHARECONFIGSTART = "sharePanelGetShareConfigStart";
    public static final String KEY_SHAREPANELINITSHAREPANELDATAEND = "sharePanelInitSharePanelDataEnd";
    public static final String KEY_SHAREPANELINITSHAREPANELDATASTART = "sharePanelInitSharePanelDataStart";
    public static final String KEY_SHAREPANELINITSHAREPANELEND = "sharePanelInitSharePanelEnd";
    public static final String KEY_SHAREPANELINITSHAREPANELSTART = "sharePanelInitSharePanelStart";
    public static final String KEY_SHAREPANELLOGININTERCEPTOREND = "sharePanelLoginInterceptorEnd";
    public static final String KEY_SHAREPANELLOGININTERCEPTORSTART = "sharePanelLoginInterceptorStart";
    public static final String KEY_SHAREPANELPARSESHARECONTENTEND = "sharePanelParseShareContentEnd";
    public static final String KEY_SHAREPANELPARSESHARECONTENTSTART = "sharePanelParseShareContentStart";
    public static final String KEY_SHAREPANELRENDERPANELACTIVITYINFOEND = "sharePanelRenderPanelActivityinfoEnd";
    public static final String KEY_SHAREPANELRENDERPANELACTIVITYINFOSTART = "sharePanelRenderPanelActivityinfoStart";
    public static final String KEY_SHAREPANELRENDERPANELEND = "sharePanelRenderPanelEnd";
    public static final String KEY_SHAREPANELRENDERPANELSTART = "sharePanelRenderPanelStart";
    public static final String KEY_SHAREPANELSHOWWEEX2START = "sharePanelShowWeex2Start";
    public static final String KEY_SHAREPANELSTART = "sharePanelStart";
    public static final String KEY_SHAREPANELSTATERESETPROCESSOREND = "sharePanelStateResetProcessorEnd";
    public static final String KEY_SHAREPANELSTATERESETPROCESSORSTART = "sharePanelStateResetProcessorStart";
    public static final String SHARE_BACKFLOW_CREATE = "shareBackflowCreate";
    public static final String SHARE_BACKFLOW_DESTROYE = "shareBackflowDestroy";
    public static final String SHARE_BACKFLOW_PAGENAME = "shareBackFlowPage";
    public static final String SHARE_PANEL_CREATE = "sharePanelCreate";
    public static final String SHARE_PANEL_DESTROY = "sharePanelDestroy";
    public static final String SHARE_PANEL_PAGENAME = "sharePanelPage";
    public static kkp d = null;

    /* renamed from: a  reason: collision with root package name */
    public IPage f22732a;
    public final Map<String, String> b = new HashMap();
    public final String c = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isUseApmReport", "true");

    static {
        t2o.a(318767105);
    }

    public kkp() {
        g();
    }

    public static kkp e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kkp) ipChange.ipc$dispatch("2005bcb1", new Object[0]);
        }
        if (d == null) {
            d = new kkp();
        }
        return d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df7036b", new Object[]{this, str});
            return;
        }
        try {
            Map<String, String> map = this.b;
            ((HashMap) map).put(str, c() + "");
        } catch (Throwable unused) {
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5383ccbe", new Object[]{this});
            return;
        }
        Map<String, String> map = this.b;
        if (map != null) {
            ((HashMap) map).clear();
        }
        this.f22732a = null;
    }

    public final long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e3a6c0e", new Object[]{this})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            return currentTimeMillis - (System.currentTimeMillis() - SystemClock.uptimeMillis());
        }
        return currentTimeMillis;
    }

    public final IPage d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("468edaa8", new Object[]{this, view});
        }
        if (this.f22732a == null) {
            this.f22732a = uml.c().a(view, true);
        }
        return this.f22732a;
    }

    public final List<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ff2c1164", new Object[]{this});
        }
        String config = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "shareZcachelist", null);
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://web.m.taobao.com/app/message-social-front/share-panel/N4");
        arrayList.add("https://web.m.taobao.com/app/message-social-front/share-back/home");
        if (!TextUtils.isEmpty(config)) {
            try {
                List<ShareZCacheConfig> parseArray = JSON.parseArray(config, ShareZCacheConfig.class);
                if (parseArray != null) {
                    for (ShareZCacheConfig shareZCacheConfig : parseArray) {
                        if (!TextUtils.isEmpty(shareZCacheConfig.zcacheurl)) {
                            arrayList.add(shareZCacheConfig.zcacheurl);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4d8df", new Object[]{this});
            return;
        }
        try {
            if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isUseZCache", "true"))) {
                yox.n(f());
            }
        } catch (Throwable unused) {
        }
    }

    public void h(View view, String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72102886", new Object[]{this, view, str, str2, str3, map});
            return;
        }
        try {
            if ("true".equals(this.c)) {
                d(view).e().a(str2, str3, map);
                d(view).d().a(str, this.b);
            }
        } catch (Throwable unused) {
        }
    }

    public void i(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8ad469", new Object[]{this, view, str});
            return;
        }
        try {
            if ("true".equals(this.c)) {
                d(view).e().onPageDestroy();
            }
        } catch (Throwable unused) {
        }
    }
}
