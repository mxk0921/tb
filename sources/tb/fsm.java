package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fsm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hhd f19508a;
    public final nkb b;
    public final gmc c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final fsm f19509a = new fsm(new oln(), new gq2(), new i5h(), new vtt());

        static {
            t2o.a(779093095);
        }

        public static /* synthetic */ fsm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fsm) ipChange.ipc$dispatch("aeebcfb0", new Object[0]);
            }
            return f19509a;
        }
    }

    static {
        t2o.a(779093093);
    }

    public static fsm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsm) ipChange.ipc$dispatch("9ba85496", new Object[0]);
        }
        return b.a();
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("511dae2e", new Object[]{this, str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return false;
        }
        String host = parse.getHost();
        String path = parse.getPath();
        if (!"h5.m.taobao.com".equalsIgnoreCase(host) || !q6f.PATH_TAOLIVE.equalsIgnoreCase(path)) {
            return false;
        }
        return true;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2740676", new Object[]{this, str});
        } else {
            TLog.logi("TBLive", "MediaPlayerManager", str);
        }
    }

    public fsm(hhd hhdVar, nkb nkbVar, gmc gmcVar, vtt vttVar) {
        com.android.tools.ir.runtime.a.a("com.taobao.live", null);
        this.f19508a = hhdVar;
        this.b = nkbVar;
        this.c = gmcVar;
    }

    public void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f86fbc", new Object[]{this, context, str});
        } else if (!x9l.a()) {
            TLog.loge("tblive", "MediaPlayerManager", "直播间播放器预热总开关关闭，");
        } else {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("id");
            String queryParameter2 = parse.getQueryParameter("livesource");
            String queryParameter3 = parse.getQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL);
            String queryParameter4 = parse.getQueryParameter("liveUrlList");
            String queryParameter5 = parse.getQueryParameter(yj4.PARAM_PRODUCT_TYPE);
            String queryParameter6 = parse.getQueryParameter("timeMovingSpfPlayVideo");
            boolean booleanQueryParameter = parse.getBooleanQueryParameter(yj4.PARAM_NEED_RECOMMEND, false);
            if (RecModel.MEDIA_TYPE_TIMEMOVE.equalsIgnoreCase(queryParameter5) && !TextUtils.isEmpty(queryParameter6)) {
                return;
            }
            if ((queryParameter4 != null || queryParameter3 != null) && queryParameter != null) {
                c("秒开参数预创建：".concat(queryParameter));
                ((i5h) this.c).a(context, str);
            } else if (queryParameter != null) {
                c("CDN 预创建 ".concat(queryParameter));
                ((gq2) this.b).a(context, str);
            } else if (queryParameter2 != null && booleanQueryParameter) {
                c("推荐接口mtop.tblive.live.recommend.home 预创建".concat(queryParameter2));
                ((oln) this.f19508a).a(context, str, queryParameter2);
            }
        }
    }
}
