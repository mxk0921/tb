package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.view.AskImageView;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dme {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f17915a;

        public a(c cVar) {
            this.f17915a = cVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                c cVar = this.f17915a;
                if (cVar != null) {
                    if (drawable instanceof cy0) {
                        ((AskImageView.a) cVar).b(succPhenixEvent.getUrl(), new jy0((cy0) drawable));
                    } else {
                        ((AskImageView.a) cVar).b(succPhenixEvent.getUrl(), drawable);
                    }
                }
                succPhenixEvent.getTicket().d(true);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f17916a;

        public b(c cVar) {
            this.f17916a = cVar;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            c cVar = this.f17916a;
            if (cVar != null) {
                ((AskImageView.a) cVar).a(failPhenixEvent.getResultCode());
            }
            failPhenixEvent.getTicket().d(true);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
    }

    static {
        t2o.a(817889309);
    }

    public static final void a(Context context, String str, int i, int i2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2a8a36", new Object[]{context, str, new Integer(i), new Integer(i2), cVar});
        } else if (TextUtils.isEmpty(str)) {
            ((AskImageView.a) cVar).a(0);
        } else {
            if (!str.endsWith(".gif") && !str.endsWith(".apng") && !str.endsWith("apng.png") && !str.endsWith("9.png")) {
                str = b(str, i, i2);
            }
            PhenixCreator U = s0m.B().N0(context).U(null, str);
            U.addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "87").memOnly(false).failListener(new b(cVar)).succListener(new a(cVar));
            U.fetch();
        }
    }

    public static String b(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3410cc87", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        ImageStrategyConfig.b w = ImageStrategyConfig.w("guangguang", "87");
        w.i(TaobaoImageUrlStrategy.ImageQuality.q90);
        w.b(true);
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), w.a());
    }
}
