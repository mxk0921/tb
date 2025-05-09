package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import com.taobao.search.searchdoor.sf.config.TbSearchStyleVO;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class g54 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final g54 INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static String f19731a;
    public static TbSearchStyle b;
    public static final Handler c = new Handler(Looper.getMainLooper());

    public static final void e(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d991d56c", new Object[]{str, map});
            return;
        }
        String str2 = (String) map.get("tb2024CssConfig");
        if (str2 != null) {
            INSTANCE.h(str2);
        }
    }

    public static final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e89bba0", new Object[]{str});
            return;
        }
        ckf.g(str, "$config");
        f19731a = str;
    }

    public static final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea3d7a3c", new Object[]{str});
            return;
        }
        ckf.g(str, "$raw");
        final TbSearchStyleVO tbSearchStyleVO = (TbSearchStyleVO) JSON.parseObject(str, TbSearchStyleVO.class);
        c.post(new Runnable() { // from class: tb.d2z
            @Override // java.lang.Runnable
            public final void run() {
                g54.l(TbSearchStyleVO.this);
            }
        });
    }

    public static final void l(TbSearchStyleVO tbSearchStyleVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609c80c7", new Object[]{tbSearchStyleVO});
            return;
        }
        TbSearchStyle tbSearchStyle = tbSearchStyleVO.tbSearchStyles;
        b = tbSearchStyle;
        ckf.d(tbSearchStyle);
        tbSearchStyle.isTb2024 = true;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c6958d3", new Object[]{this});
        }
        return f19731a;
    }

    public final TbSearchStyle g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbSearchStyle) ipChange.ipc$dispatch("bc1b73fe", new Object[]{this});
        }
        return b;
    }

    public final void h(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2df26bb", new Object[]{this, str});
            return;
        }
        i(str);
        c.post(new Runnable() { // from class: tb.b2z
            @Override // java.lang.Runnable
            public final void run() {
                g54.j(str);
            }
        });
    }

    public final void i(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7adb561", new Object[]{this, str});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.c2z
                @Override // java.lang.Runnable
                public final void run() {
                    g54.k(str);
                }
            });
        }
    }

    static {
        t2o.a(815793091);
        g54 g54Var = new g54();
        INSTANCE = g54Var;
        OrangeConfig.getInstance().registerListener(new String[]{"search_biz_css"}, new obk() { // from class: tb.a2z
            @Override // tb.obk
            public final void onConfigUpdate(String str, Map map) {
                g54.e(str, map);
            }
        }, true);
        String config = OrangeConfig.getInstance().getConfig("search_biz_css", "tb2024CssConfig", "{\"tbSearchStyles\":{\"common\":{\"mainBgColor\":\"#FFFFFF\",\"subBgColor\":\"#F3F6F8\",\"mainTextColor\":\"#11192D\",\"subTextColor\":\"#50607A\",\"subTextColorAuxiliary\":\"#7C889C\",\"maskColor\":\"rgba(14,17,25,0.5)\",\"lineColor\":\"#E5E8EC\",\"weakTipColor\":\"#CACFD7\",\"taobaoColor\":\"#FF6200\",\"taobaoYellowColor\":\"#FFB300\",\"taobaoPaleRedColor\":\"#FFEFE5\",\"tmallColor\":\"#FF0036\",\"tmallPaleRedColor\":\"#FFE5EA\",\"moduleRounded\":\"6px\"},\"commonDark\":{\"mainBgColor\":\"#222222\",\"subBgColor\":\"#1C222E\",\"mainTextColor\":\"#F3F6F8\",\"subTextColor\":\"#CACFD7\",\"subTextColorAuxiliary\":\"#7C889C\",\"maskColor\":\"rgba(14,17,25,0.5)\",\"lineColor\":\"#1C222E\",\"weakTipColor\":\"#444C5A\",\"taobaoColor\":\"#FF6200\",\"taobaoYellowColor\":\"#FFB300\",\"taobaoPaleRedColor\":\"#311D11\",\"tmallColor\":\"#FF0036\",\"tmallPaleRedColor\":\"#2F111C\",\"moduleRounded\":\"6px\"},\"card\":{\"wfImgRounded\":\"6px\",\"listImgRounded\":\"6px\",\"titleTextSize\":\"13px\",\"titleBold\":\"true\"}}}");
        f19731a = config;
        ckf.d(config);
        g54Var.h(config);
    }
}
