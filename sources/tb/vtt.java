package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.concurrent.TimeUnit;
import tb.jhl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vtt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements jhl.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f30252a;
        public final /* synthetic */ View b;

        public a(ViewGroup viewGroup, View view) {
            this.f30252a = viewGroup;
            this.b = view;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1ea182e", new Object[]{this});
                return;
            }
            vtt.a(vtt.this, "预创建接口 p2ff 成功");
            this.f30252a.removeViewInLayout(this.b);
        }
    }

    static {
        t2o.a(779093101);
        TimeUnit.SECONDS.toMillis(20L);
    }

    public static /* synthetic */ void a(vtt vttVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf4d6f95", new Object[]{vttVar, str});
        } else {
            vttVar.b(str);
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else {
            TLog.loge("TBLive", "TimeMoveP2FFImpl", str);
        }
    }

    public void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad12e77", new Object[]{this, context, str});
        } else if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("id");
            String queryParameter2 = parse.getQueryParameter(yj4.PARAM_SJSD_ITEM_ID);
            String queryParameter3 = parse.getQueryParameter(yj4.PARAM_TIMEMOVING_ITEM_ID);
            if (queryParameter == null) {
                return;
            }
            if (queryParameter2 != null || queryParameter3 != null) {
                String b = vnm.c().b(queryParameter, queryParameter3, queryParameter2);
                String queryParameter4 = parse.getQueryParameter("timeMovingSpfPlayVideo");
                if (queryParameter4 != null) {
                    LiveItem.SpfPlayVideo spfPlayVideo = (LiveItem.SpfPlayVideo) fkx.f(queryParameter4, LiveItem.SpfPlayVideo.class);
                    ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                    if (spfPlayVideo != null) {
                        jhl jhlVar = new jhl(context);
                        View g = jhlVar.g();
                        viewGroup.addView(g, new ViewGroup.LayoutParams(1, 1));
                        jhlVar.m(new a(viewGroup, g));
                        jhlVar.k(spfPlayVideo);
                        jhlVar.n(b);
                        jhlVar.f();
                        jhlVar.j();
                    }
                }
            }
        }
    }
}
